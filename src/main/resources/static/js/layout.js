document.addEventListener('DOMContentLoaded', () => {
    const categoryToggle = document.querySelector('.category-toggle');

    categoryToggle.addEventListener('click', () => {
        const subcategoryList = categoryToggle.querySelector('.subcategory-list');
        if (subcategoryList.style.display === 'block') {
            subcategoryList.style.display = 'none';
        } else {
            subcategoryList.style.display = 'block';
        }
    });
});

window.addEventListener('scroll', () => {
    const header2 = document.querySelector('.header .header-2');
    if (window.scrollY > 80) {
        header2.classList.add('active');
    } else {
        header2.classList.remove('active');
    }
});

// 페이지 로드 시 스크롤 상태 확인
window.addEventListener('load', () => {
    const header2 = document.querySelector('.header .header-2');
    if (window.scrollY > 80) {
        header2.classList.add('active');
    } else {
        header2.classList.remove('active');
    }
});
