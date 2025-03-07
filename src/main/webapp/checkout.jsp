<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Slowly Cake</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <!-- Favicon -->
  <link href="assets/img/favicon.ico" rel="icon">

  <!-- Google Web Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap"
        rel="stylesheet">

  <!-- Icon Font Stylesheet -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

  <!-- Libraries Stylesheet -->
  <link href="assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Customized Bootstrap Stylesheet -->
  <link href="assets/css/style.css" rel="stylesheet">
  <link href="assets/css/checkout.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid pt-5">
  <div class="row px-xl-5">
    <div class="col-lg-8">
      <div class="mb-4">
        <h4 class="font-weight-semi-bold mb-4">Billing Address</h4>
        <div class="row">
          <div class="col-md-6 form-group">
            <label>First Name</label>
            <input class="form-control" type="text" placeholder="John">
          </div>
          <div class="col-md-6 form-group">
            <label>Last Name</label>
            <input class="form-control" type="text" placeholder="Doe">
          </div>
          <div class="col-md-6 form-group">
            <label>E-mail</label>
            <input class="form-control" type="text" placeholder="example@email.com">
          </div>
          <div class="col-md-6 form-group">
            <label>Mobile No</label>
            <input class="form-control" type="text" placeholder="+123 456 789">
          </div>
          <div class="col-md-6 form-group">
            <label>Address Line 1</label>
            <input class="form-control" type="text" placeholder="123 Street">
          </div>
          <div class="col-md-6 form-group">
            <label>Address Line 2</label>
            <input class="form-control" type="text" placeholder="123 Street">
          </div>
          <div class="col-md-6 form-group">
            <label>Country</label>
            <select class="custom-select">
              <option selected>United States</option>
              <option>Afghanistan</option>
              <option>Albania</option>
              <option>Algeria</option>
            </select>
          </div>
          <div class="col-md-6 form-group">
            <label>City</label>
            <input class="form-control" type="text" placeholder="New York">
          </div>
          <div class="col-md-6 form-group">
            <label>State</label>
            <input class="form-control" type="text" placeholder="New York">
          </div>
          <div class="col-md-6 form-group">
            <label>ZIP Code</label>
            <input class="form-control" type="text" placeholder="123">
          </div>
          <div class="col-md-12 form-group">
            <div class="custom-control custom-checkbox">
              <input type="checkbox" class="custom-control-input" id="newaccount">
              <label class="custom-control-label" for="newaccount">Create an account</label>
            </div>
          </div>
          <div class="col-md-12 form-group">
            <div class="custom-control custom-checkbox">
              <input type="checkbox" class="custom-control-input" id="shipto">
              <label class="custom-control-label" for="shipto"  data-toggle="collapse" data-target="#shipping-address">Ship to different address</label>
            </div>
          </div>
        </div>
      </div>
      <div class="collapse mb-4" id="shipping-address">
        <h4 class="font-weight-semi-bold mb-4">Shipping Address</h4>
        <div class="row">
          <div class="col-md-6 form-group">
            <label>First Name</label>
            <input class="form-control" type="text" placeholder="John">
          </div>
          <div class="col-md-6 form-group">
            <label>Last Name</label>
            <input class="form-control" type="text" placeholder="Doe">
          </div>
          <div class="col-md-6 form-group">
            <label>E-mail</label>
            <input class="form-control" type="text" placeholder="example@email.com">
          </div>
          <div class="col-md-6 form-group">
            <label>Mobile No</label>
            <input class="form-control" type="text" placeholder="+123 456 789">
          </div>
          <div class="col-md-6 form-group">
            <label>Address Line 1</label>
            <input class="form-control" type="text" placeholder="123 Street">
          </div>
          <div class="col-md-6 form-group">
            <label>Address Line 2</label>
            <input class="form-control" type="text" placeholder="123 Street">
          </div>
          <div class="col-md-6 form-group">
            <label>Country</label>
            <select class="custom-select">
              <option selected>United States</option>
              <option>Afghanistan</option>
              <option>Albania</option>
              <option>Algeria</option>
            </select>
          </div>
          <div class="col-md-6 form-group">
            <label>City</label>
            <input class="form-control" type="text" placeholder="New York">
          </div>
          <div class="col-md-6 form-group">
            <label>State</label>
            <input class="form-control" type="text" placeholder="New York">
          </div>
          <div class="col-md-6 form-group">
            <label>ZIP Code</label>
            <input class="form-control" type="text" placeholder="123">
          </div>
        </div>
      </div>
    </div>
    <div class="col-lg-4">
      <div class="card border-secondary mb-5">
        <div class="card-header bg-secondary border-0">
          <h4 class="font-weight-semi-bold m-0">Order Total</h4>
        </div>
        <div class="card-body">
          <h5 class="font-weight-medium mb-3">Products</h5>
          <div class="d-flex justify-content-between">
            <p>Colorful Stylish Shirt 1</p>
            <p>$150</p>
          </div>
          <div class="d-flex justify-content-between">
            <p>Colorful Stylish Shirt 2</p>
            <p>$150</p>
          </div>
          <div class="d-flex justify-content-between">
            <p>Colorful Stylish Shirt 3</p>
            <p>$150</p>
          </div>
          <hr class="mt-0">
          <div class="d-flex justify-content-between mb-3 pt-1">
            <h6 class="font-weight-medium">Subtotal</h6>
            <h6 class="font-weight-medium">$150</h6>
          </div>
          <div class="d-flex justify-content-between">
            <h6 class="font-weight-medium">Shipping</h6>
            <h6 class="font-weight-medium">$10</h6>
          </div>
        </div>
        <div class="card-footer border-secondary bg-transparent">
          <div class="d-flex justify-content-between mt-2">
            <h5 class="font-weight-bold">Total</h5>
            <h5 class="font-weight-bold">$160</h5>
          </div>
        </div>
      </div>
      <div class="card border-secondary mb-5">
        <div class="card-header bg-secondary border-0">
          <h4 class="font-weight-semi-bold m-0">Payment</h4>
        </div>
        <div class="card-body">
          <div class="form-group">
            <div class="custom-control custom-radio">
              <input type="radio" class="custom-control-input" name="payment" id="paypal">
              <label class="custom-control-label" for="paypal">Paypal</label>
            </div>
          </div>
          <div class="form-group">
            <div class="custom-control custom-radio">
              <input type="radio" class="custom-control-input" name="payment" id="directcheck">
              <label class="custom-control-label" for="directcheck">Direct Check</label>
            </div>
          </div>
          <div class="">
            <div class="custom-control custom-radio">
              <input type="radio" class="custom-control-input" name="payment" id="banktransfer">
              <label class="custom-control-label" for="banktransfer">Bank Transfer</label>
            </div>
          </div>
        </div>
        <div class="card-footer border-secondary bg-transparent">
          <button class="btn btn-lg btn-block btn-primary font-weight-bold my-3 py-3">Place Order</button>
        </div>
      </div>
    </div>
  </div>
</div>
<!-- Checkout End -->
</body>
</html>
