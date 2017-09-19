package com.github.foreyer.core.view.menu;

import java.util.List;
import java.util.UUID;

public class Menu {

	/**
	 * 主键
	 */
	private String id;
	
	/**
	 * 图标
	 */
	private String icon;
	
	/**
	 * url
	 */
	private String url;
	/**
	 * 显示文字
	 */
	private String text;
	
	/**
	 * 子菜单
	 */
	private List<Menu> items;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Menu> getItems() {
		return items;
	}

	public void setItems(List<Menu> items) {
		this.items = items;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Menu() {
		this.id = "id_" + UUID.randomUUID().toString();
		// TODO Auto-generated constructor stub
	}

	public Menu(String id, String url, String text, List<Menu> items) {
		this();
		this.id = id;
		this.url = url;
		this.text = text;
		this.items = items;
	}

	public Menu(String icon,String text, List<Menu> items) {
		this();
		this.icon = icon;
		this.text = text;
		this.items = items;
	}

	public Menu(String url, String text) {
		this();
		this.url = url;
		this.text = text;
	}
	
}
