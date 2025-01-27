package com.slowlycake.webprogrammingproject.products;

public class SearchController {
    @Autowired
    private ProductService productService;

    // Endpoint để hiển thị trang tìm kiếm
    @GetMapping("/search")
    public String searchPage() {
        return "search";  // trả về view tìm kiếm (search.jsp)
    }

    // Endpoint để xử lý tìm kiếm
    @GetMapping("/search/results")
    public String searchResults(@RequestParam(name = "query", required = false) String query, Model model) {
        List<Product> products;

        if (query != null && !query.isEmpty()) {
            products = productService.searchProducts(query);  // gọi service tìm kiếm sản phẩm
        } else {
            products = productService.getAllProducts();  // nếu không có từ khóa, trả về tất cả sản phẩm
        }

        model.addAttribute("products", products);  // gán kết quả vào model
        return "searchResults";  // trả về view kết quả tìm kiếm (searchResults.jsp)
    }
}
}
