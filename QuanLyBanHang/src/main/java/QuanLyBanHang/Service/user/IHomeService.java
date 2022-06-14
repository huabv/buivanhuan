package QuanLyBanHang.Service.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import QuanLyBanHang.Dto.ProductsDto;
import QuanLyBanHang.Entity.Categorys;
import QuanLyBanHang.Entity.Menus;
import QuanLyBanHang.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();
}