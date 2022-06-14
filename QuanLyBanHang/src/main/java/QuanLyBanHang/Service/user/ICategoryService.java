package QuanLyBanHang.Service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import QuanLyBanHang.Dto.ProductsDto;
@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
}