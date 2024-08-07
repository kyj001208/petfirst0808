/**
 * 
 */
/**
 * 
 */
document.getElementById('showMoreBtn').addEventListener('click', function() {
    var gallery = document.querySelector('.product-gallery');
    var visibleProducts = document.querySelectorAll('.product:not(.hidden)');
    var hiddenProducts = document.querySelectorAll('.product.hidden');

    visibleProducts.forEach(function(product, index) {
        product.classList.add('hidden');
        product.style.visibility = 'hidden';
        hiddenProducts[index].classList.remove('hidden');
        hiddenProducts[index].style.visibility = 'visible';
    });

    // 버튼 숨기기
    this.style.display = 'none';
});

//버튼 2를 누르면 transform='translate(-100vw)
document.querySelector('.btn2').addEventListener('click',function(){
	document.querySelector('.banner-container').style.transform='translate(-100vw)';
});

document.querySelector('.btn3').addEventListener('click',function(){
	document.querySelector('.banner-container').style.transform='translate(-100vw)';
});