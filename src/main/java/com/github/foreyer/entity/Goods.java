package com.github.foreyer.entity;

import org.hibernate.validator.constraints.NotBlank;

import com.baomidou.mybatisplus.annotations.TableName;
import com.github.foreyer.core.anno.FAnno;
import com.github.foreyer.core.model.Model;

/**
 * <p>
 * 
 * </p>
 *
 * @author GaoJun.Zhou
 * @since 2017-09-20
 */
@TableName("tb_goods")
public class Goods extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 商品名称
     */
	@NotBlank
	private String goodsName;
    /**
     * 价格
     */
	@FAnno(type="number",value="0.00")
	private Float goodsPrice;
    /**
     * 库存
     */
	@FAnno(type="number",value="0")
	private Integer store;
    /**
     * 规格
     */
	private String specification;
    /**
     * 描述
     */
	@FAnno(type="textarea")
	private String goodsDesc;
    /**
     * 数量
     */
	@FAnno(type="number",value="0")
	private Integer sales;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getStore() {
		return store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}
}
