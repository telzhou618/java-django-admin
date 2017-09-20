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
 * @since 2017-09-18
 */
@TableName("tb_user")
public class User extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @NotBlank
	private String userName;
    /**
     * 密码
     */
    @NotBlank
	@FAnno(type="password")
	private String password;
    /**
     * 描述
     */
	@FAnno(type="textarea")
	private String userDesc;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

}
