/**
 * COPYRIGHT (C) 2010 LY. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Shuang
 * Created On: 2015年9月7日
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.summer.sys.model;

import java.util.*;

/**
 * @ClassName: Resource
 * @Description: 资源对象
 * @author Shuang
 * @date 2015年9月7日 上午12:42:07
 */
public class Resource {

	private Integer id;//

	private String name;//

	private String url;//

	private Integer parentid; // 父id

	private String parentName;// 父名

	private String rolename;// 角色名

	private String memo; // 备注

	private Integer type; // 0:菜单 1:按钮

	private String btntype;// access,add,update,delete

	private Integer byorder = 0;//

	private String css;//

	private boolean checked;//

	private String state;// 菜单状态

	private List<Resource> children = new ArrayList<Resource>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getBtntype() {
		return btntype;
	}

	public void setBtntype(String btntype) {
		this.btntype = btntype;
	}

	public Integer getByorder() {
		return byorder;
	}

	public void setByorder(Integer byorder) {
		this.byorder = byorder;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Resource> getChildren() {
		return children;
	}

	public void setChildren(List<Resource> children) {
		this.children = children;
	}

}
