package com.dmt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dmt.bean.KhachHangBean;
import com.dmt.bo.DangKyBo;
//import com.dmt.bo.KhachHangBo;
import com.dmt.bo.KhachHangBo;
import com.dmt.utills.MD5;

@Controller
public class KhachHangController {

	@RequestMapping("/Login")
	public String voidProduct() {
		return "Login";
	}

	@RequestMapping("/KiemTra")
	public String voidKiemtra(HttpServletRequest request, HttpSession session) {
		try {			
			MD5 md5 = new MD5();
			String kiemtra = request.getParameter("kiemtra");
			String username = request.getParameter("Email");
			String password = request.getParameter("password");
			String passwordDaBam = md5.getHashPass(password);
			KhachHangBo bo = new KhachHangBo();
			KhachHangBean kh = bo.ktdm(username, passwordDaBam);
			session.setAttribute("khachhang", kh);
			if (kiemtra != null) {
				session.setAttribute("khachhang", null);
			}
			if (username != null || password != null) {
				if (kh == null)
					request.setAttribute("saidangnhap", "1");
			}
			return "About";
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@RequestMapping(value = "/DangKy", method = RequestMethod.POST)
	public String DangKy(HttpServletRequest request) {
		DangKyBo bo = new DangKyBo();
		int x = 0;
		try {
			request.setCharacterEncoding("UTF-8");
			MD5 md5= new MD5();
			String HoTen = request.getParameter("HoTen");
			String SoDienThoai = request.getParameter("SoDienThoai");
			String DiaChi = request.getParameter("DiaChi");
			String TenDangNhap = request.getParameter("TenDangNhap");
			String MatKhau = request.getParameter("MatKhau");
			System.out.println(MatKhau);
			String MatKhauDaBam = md5.getHashPass(MatKhau);
			x = bo.DangKyDao(HoTen, SoDienThoai, DiaChi, TenDangNhap, MatKhauDaBam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (x == 0) {
			return "DangKyThatBai";
		} else {
			request.setAttribute("dangkythanhcong", "123");
			return "DangKyThanhCong";
		}

	}

}
