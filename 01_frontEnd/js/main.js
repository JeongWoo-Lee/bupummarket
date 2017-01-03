jQuery(document).ready(function () {
    if ($('.cd-stretchy-nav').length > 0) {
        var stretchyNavs = $('.cd-stretchy-nav');

        stretchyNavs.each(function () {
            var stretchyNav = $(this),
                stretchyNavTrigger = stretchyNav.find('.cd-nav-trigger');

            stretchyNavTrigger.on('click', function (event) {
                event.preventDefault();
                stretchyNav.toggleClass('nav-is-visible');
            });
        });

        $(document).on('click', function (event) {
            (!$(event.target).is('.cd-nav-trigger') && !$(event.target).is('.cd-nav-trigger span')) && stretchyNavs.removeClass('nav-is-visible');
        });
    };

    $('.bxslider').bxSlider({
        mode: 'fade',
        captions: true,
        auto: true,
        hideControlOnEnd : true
    });
    
    $('.menu-link').bigSlide();

            $('.popup-top-anim').magnificPopup({
                type: 'inline',
                fixedContentPos: false,
                fixedBgPos: true,
                overflowY: 'auto',
                closeBtnInside: true,
                preloader: false,
                midClick: true,
                removalDelay: 300,
                mainClass: 'my-mfp-zoom-in'
            });

});
