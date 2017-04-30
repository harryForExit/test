/**
 * Created by ahui on 2017/4/23.
 */
$(function () {
    $('body').fadeIn();
    var barW=$('.notice-content').width();

    function loopMove() {
        $('.notice-content').css('left',800+'px');
        $('.notice-content').stop().animate({'left':-barW+'px'},40000);
    }
    loopMove();
    setInterval(function () {
        loopMove();
    },40000)
})