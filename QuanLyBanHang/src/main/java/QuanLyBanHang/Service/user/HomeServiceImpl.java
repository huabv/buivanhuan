package QuanLyBanHang.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QuanLyBanHang.Dao.CategorysDao;
import QuanLyBanHang.Dao.MenuDao;
import QuanLyBanHang.Dao.ProductsDao;
import QuanLyBanHang.Dao.SlidesDao;
import QuanLyBanHang.Dto.ProductsDto;
import QuanLyBanHang.Entity.Categorys;
import QuanLyBanHang.Entity.Menus;
import QuanLyBanHang.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}


	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}
	
	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		listProducts.get(0).getId_color();
		return listProducts;
	}

}
