package com.leikooo.prototype.deepclone;

import java.io.Serializable;

/**
 * @author leikooo
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	/**
	 * 因为改类都是基本数据类型, 所以我们浅拷贝也是类似的深拷贝
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
