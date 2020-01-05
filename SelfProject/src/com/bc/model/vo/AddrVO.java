package com.bc.model.vo;

public class AddrVO {
	private String dong_code, city_en, gun_gu_en, eup_dong_en, lee_en, ox_san_land, jibun_bunji, jibun_ho, 
			       doro_code, doro_en ,ox_under, build_num, build_sec_num, build_admin_num, post_num, move_code, union_home, pres_num;
	
	public AddrVO() {}

	
	
	public AddrVO(String dong_code, String city_en, String gun_gu_en, String eup_dong_en, String lee_en,
			String ox_san_land, String jibun_bunji, String jibun_ho, String doro_code, String doro_en, String ox_under,
			String build_num, String build_sec_num, String build_admin_num, String post_num, String move_code,
			String union_home, String pres_num) {
		super();
		this.dong_code = dong_code;
		this.city_en = city_en;
		this.gun_gu_en = gun_gu_en;
		this.eup_dong_en = eup_dong_en;
		this.lee_en = lee_en;
		this.ox_san_land = ox_san_land;
		this.jibun_bunji = jibun_bunji;
		this.jibun_ho = jibun_ho;
		this.doro_code = doro_code;
		this.doro_en = doro_en;
		this.ox_under = ox_under;
		this.build_num = build_num;
		this.build_sec_num = build_sec_num;
		this.build_admin_num = build_admin_num;
		this.post_num = post_num;
		this.move_code = move_code;
		this.union_home = union_home;
		this.pres_num = pres_num;
	}

	public String getDong_code() {
		return dong_code;
	}

	public void setDong_code(String dong_code) {
		this.dong_code = dong_code;
	}

	public String getCity_en() {
		return city_en;
	}

	public void setCity_en(String city_en) {
		this.city_en = city_en;
	}

	public String getGun_gu_en() {
		return gun_gu_en;
	}

	public void setGun_gu_en(String gun_gu_en) {
		this.gun_gu_en = gun_gu_en;
	}

	public String getEup_dong_en() {
		return eup_dong_en;
	}

	public void setEup_dong_en(String eup_dong_en) {
		this.eup_dong_en = eup_dong_en;
	}

	public String getLee_en() {
		return lee_en;
	}

	public void setLee_en(String lee_en) {
		this.lee_en = lee_en;
	}

	public String getOx_san_land() {
		return ox_san_land;
	}

	public void setOx_san_land(String ox_san_land) {
		this.ox_san_land = ox_san_land;
	}

	public String getJibun_bunji() {
		return jibun_bunji;
	}

	public void setJibun_bunji(String jibun_bunji) {
		this.jibun_bunji = jibun_bunji;
	}

	public String getJibun_ho() {
		return jibun_ho;
	}

	public void setJibun_ho(String jibun_ho) {
		this.jibun_ho = jibun_ho;
	}

	public String getDoro_code() {
		return doro_code;
	}

	public void setDoro_code(String doro_code) {
		this.doro_code = doro_code;
	}

	public String getDoro_en() {
		return doro_en;
	}

	public void setDoro_en(String doro_en) {
		this.doro_en = doro_en;
	}

	public String getOx_under() {
		return ox_under;
	}

	public void setOx_under(String ox_under) {
		this.ox_under = ox_under;
	}

	public String getBuild_num() {
		return build_num;
	}

	public void setBuild_num(String build_num) {
		this.build_num = build_num;
	}

	public String getBuild_sec_num() {
		return build_sec_num;
	}

	public void setBuild_sec_num(String build_sec_num) {
		this.build_sec_num = build_sec_num;
	}

	public String getBuild_admin_num() {
		return build_admin_num;
	}

	public void setBuild_admin_num(String build_admin_num) {
		this.build_admin_num = build_admin_num;
	}

	public String getPost_num() {
		return post_num;
	}

	public void setPost_num(String post_num) {
		this.post_num = post_num;
	}

	public String getMove_code() {
		return move_code;
	}

	public void setMove_code(String move_code) {
		this.move_code = move_code;
	}

	public String getUnion_home() {
		return union_home;
	}

	public void setUnion_home(String union_home) {
		this.union_home = union_home;
	}

	public String getPres_num() {
		return pres_num;
	}

	public void setPres_num(String pres_num) {
		this.pres_num = pres_num;
	}

	@Override
	public String toString() {
		return "AddrVO [dong_code=" + dong_code + ", city_en=" + city_en + ", gun_gu_en=" + gun_gu_en + ", eup_dong_en="
				+ eup_dong_en + ", lee_en=" + lee_en + ", ox_san_land=" + ox_san_land + ", jibun_bunji=" + jibun_bunji
				+ ", jibun_ho=" + jibun_ho + ", doro_code=" + doro_code + ", doro_en=" + doro_en + ", ox_under="
				+ ox_under + ", build_num=" + build_num + ", build_sec_num=" + build_sec_num + ", build_admin_num="
				+ build_admin_num + ", post_num=" + post_num + ", move_code=" + move_code + ", union_home=" + union_home
				+ ", pres_num=" + pres_num + "]";
	}
	
}
