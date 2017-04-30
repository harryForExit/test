/**
 * Created by Administrator on 2017/4/20.
 */
function removeLastMargin(items,num){
	items.each(function(){
		var index=$(this).index();
		if(index%num == (num-1)){
			$(this).css('margin-right',0);
		}else{
			return;
		}
	});
}
$(function(){
	removeLastMargin($('.service-item'),3);
	removeLastMargin($('.page-service-list .item'),4);
})
