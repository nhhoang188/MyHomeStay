<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>HomeStay Vip Pro</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900|Rubik:300,400,700"
          rel="stylesheet">

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="fonts/fontawesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <!-- Theme Style -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<header role="banner">

    <nav class="navbar navbar-expand-md navbar-dark bg-light">
        <div class="container">
            <a class="navbar-brand" href="home">HomeStay Vjp Pr0</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05"
                    aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse navbar-light" id="navbarsExample05">
                <ul class="navbar-nav ml-auto pl-lg-5 pl-0">
                    <li class="nav-item">
                        <a class="nav-link active" href="home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="rooms">HomeStay</a>
                    </li>
                    <li class="nav-item cta">
                        <a class="nav-link" href="booking"><span>Book Now</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="travel-guide">Travel Guide</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contact">Contact</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="admin">Login</a>
                    </li>
                </ul>

            </div>
        </div>
    </nav>
</header>

<!-- END header -->

<section class="site-hero site-hero-innerpage overlay" data-stellar-background-ratio="0.5"
         style="background-image: url(images/The-November-homestay-10.jpg);">
    <div class="container">
        <div class="row align-items-center site-hero-inner justify-content-center">
            <div class="col-md-12 text-center">

                <div class="mb-5 element-animate">
                    <h1>Reservation</h1>
                    <p>Instant Booking HomeStay</p>
                </div>

            </div>
        </div>
    </div>
</section>
<!-- END section -->
<c:forEach var="item" items="${homestay}">
    <section class="site-section">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <h2 class="mb-5">Reservation Form</h2>
                    <form action="#" method="post" onchange="tinhTien()">
                        <h2>${item.tenhomestay}</h2>
                        <div class="row">
                            <div class="col-sm-6 form-group">
                                <label>Arrival Date</label>
                                <div style="position: relative;">
                                <span class="fa fa-calendar icon"
                                      style="position: absolute; right: 10px; top: 10px;"></span>
                                    <input type='text' class="form-control" name="arrival_date" id='arrival_date'/>
                                </div>
                            </div>

                            <div class="col-sm-6 form-group">

                                <label>Departure Date</label>
                                <div style="position: relative;">
                                <span class="fa fa-calendar icon"
                                      style="position: absolute; right: 10px; top: 10px;"></span>
                                    <input type='text' class="form-control" name="departure_date" id='departure_date'/>
                                </div>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-6 form-group">
                                <label for="room">Room</label>
                                <select name="room" id="room" class="form-control">
                                    <option value="1">1 Rooms</option>
                                    <option value="2">2 Rooms</option>
                                    <option value="3">3 Rooms</option>
                                    <option value="4">4 Rooms</option>
                                    <option value="5">5 Rooms</option>
                                </select>
                            </div>

                            <div class="col-md-6 form-group">
                                <label for="room">Guests</label>
                                <select name="guest" id="guest" class="form-control">
                                    <option value="1">1 Guest</option>
                                    <option value="2">2 Guest</option>
                                    <option value="3">3 Guest</option>
                                    <option value="4">4 Guest</option>
                                    <option value="5">5 Guest</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 form-group">
                                <h3>Rental fee 1 day:
                                        ${item.giaphong} $/Day</h3>
                                <input type="hidden" id="giaphong" value="${item.giaphong}">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 form-group">
                                <h2 >Total : <span id="kq"> </span><input type="hidden" name="_thanhtoan" id="thanhtoan"> $</h2>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 form-group">
                                <input type="submit" value="Reserve Now" class="btn btn-primary">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-1"></div>
                <div class="col-md-5">
                    <h3 class="mb-5">Detail Room</h3>
                    <div class="media d-block room mb-0">
                        <figure>
                            <img src="${item.anh2}" alt="Generic placeholder image" class="img-fluid">
                            <div class="overlap-text">
                  <span>
                    <span class="ion-ios-star"></span>
                    <span class="ion-ios-star"></span>
                    <span class="ion-ios-star"></span>
                  </span>
                            </div>
                        </figure>
                        <div class="media-body">
                            <h3 class="mt-0"><a href="rooms?action=booking&id=${item.homestayID}">Presidential Room</a>
                            </h3>
                            <ul class="room-specs">
                                <li><span class="ion-ios-people-outline"></span> 2 Guests</li>
                                <li><span class="ion-ios-crop"></span> 22 ft <sup>2</sup></li>
                            </ul>
                            <p>${item.thongtin} </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function tinhTien() {
                let arrival_date = Date.parse(document.getElementById("arrival_date").value);
                let departure_date = Date.parse(document.getElementById("departure_date").value);
                let songaythue = (departure_date -  arrival_date)/86400/1000;
                let room = document.getElementById("room").value;
                let giaphong = document.getElementById("giaphong").value;
                let thanhtoan = giaphong * room*songaythue;
                document.getElementById("thanhtoan").value =thanhtoan.toFixed(2);
                document.getElementById("kq").innerHTML =thanhtoan.toFixed(2);
            }
        </script>
    </section>
    <!-- END section -->
</c:forEach>

<section class="section-cover" data-stellar-background-ratio="0.5" style="background-image: url(images/img_5.jpg);">
    <div class="container">
        <div class="row justify-content-center align-items-center intro">
            <div class="col-md-9 text-center element-animate">
                <h2>Relax and Enjoy your Holiday</h2>
                <p class="lead mb-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto quidem tempore
                    expedita facere facilis, dolores!</p>
                <div class="btn-play-wrap"><a href="https://vimeo.com/channels/staffpicks/93951774"
                                              class="btn-play popup-vimeo "><span class="ion-ios-play"></span></a></div>
            </div>
        </div>
    </div>
</section>
<!-- END section -->
<footer class="site-footer">
    <div class="container">
        <div class="row mb-5">
            <div class="col-md-4">
                <h3>Phone Support</h3>
                <p>24/7 Call us now.</p>
                <p class="lead"><a href="tel://">+ 1 332 3093 323</a></p>
            </div>
            <div class="col-md-4">
                <h3>Connect With Us</h3>
                <p>We are socialized. Follow us</p>
                <p>
                    <a href="#" class="pl-0 p-3"><span class="fa fa-facebook"></span></a>
                    <a href="#" class="p-3"><span class="fa fa-twitter"></span></a>
                    <a href="#" class="p-3"><span class="fa fa-instagram"></span></a>
                    <a href="#" class="p-3"><span class="fa fa-vimeo"></span></a>
                    <a href="#" class="p-3"><span class="fa fa-youtube-play"></span></a>
                </p>
            </div>
            <div class="col-md-4">
                <h3>Connect With Us</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maxime, odio.</p>
                <form action="#" class="subscribe">
                    <div class="form-group">
                        <button type="submit"><span class="ion-ios-arrow-thin-right"></span></button>
                        <input type="email" class="form-control" placeholder="Enter email">
                    </div>

                </form>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-md-7 text-center">
                &copy; <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a
                    href="https://colorlib.com" target="_blank">Colorlib</a>
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            </div>
        </div>
    </div>
</footer>
<!-- END footer -->

<!-- loader -->
<div id="loader" class="show fullscreen">
    <svg class="circular" width="48px" height="48px">
        <circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/>
        <circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10"
                stroke="#f4b214"/>
    </svg>
</div>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery-migrate-3.0.0.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>

<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>

<script>

    $('#arrival_date, #departure_date').datepicker({});

</script>


<script src="js/main.js"></script>
</body>
</html>