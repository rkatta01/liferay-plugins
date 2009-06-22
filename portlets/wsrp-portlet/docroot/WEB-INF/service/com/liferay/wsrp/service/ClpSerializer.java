/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wsrp.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.liferay.wsrp.model.WSRPConsumerClp;
import com.liferay.wsrp.model.WSRPConsumerPortletClp;
import com.liferay.wsrp.model.WSRPProducerClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="ClpSerializer.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "wsrp-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(WSRPConsumerClp.class.getName())) {
			WSRPConsumerClp oldCplModel = (WSRPConsumerClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.wsrp.model.impl.WSRPConsumerImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setWsrpConsumerId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getWsrpConsumerId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value1 = oldCplModel.getCreateDate();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getModifiedDate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value3 = oldCplModel.getName();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setUrl",
							new Class[] { String.class });

					String value4 = oldCplModel.getUrl();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setWsdl",
							new Class[] { String.class });

					String value5 = oldCplModel.getWsdl();

					method5.invoke(newModel, value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(WSRPConsumerPortletClp.class.getName())) {
			WSRPConsumerPortletClp oldCplModel = (WSRPConsumerPortletClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.wsrp.model.impl.WSRPConsumerPortletImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setWsrpConsumerPortletId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getWsrpConsumerPortletId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value1 = oldCplModel.getCreateDate();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getModifiedDate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setWsrpConsumerId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getWsrpConsumerId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value4 = oldCplModel.getName();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setPortletHandle",
							new Class[] { String.class });

					String value5 = oldCplModel.getPortletHandle();

					method5.invoke(newModel, value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(WSRPProducerClp.class.getName())) {
			WSRPProducerClp oldCplModel = (WSRPProducerClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.liferay.wsrp.model.impl.WSRPProducerImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setWsrpProducerId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getWsrpProducerId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { String.class });

					String value1 = oldCplModel.getCompanyId();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getCreateDate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value3 = oldCplModel.getModifiedDate();

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value4 = oldCplModel.getName();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setPortletIds",
							new Class[] { String.class });

					String value5 = oldCplModel.getPortletIds();

					method5.invoke(newModel, value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel) {
			return translateInput((BaseModel)obj);
		}
		else if (obj instanceof List) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.liferay.wsrp.model.impl.WSRPConsumerImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					WSRPConsumerClp newModel = new WSRPConsumerClp();

					Method method0 = oldModelClass.getMethod(
							"getWsrpConsumerId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setWsrpConsumerId(value0.longValue());

					Method method1 = oldModelClass.getMethod("getCreateDate");

					Date value1 = (Date)method1.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value1);

					Method method2 = oldModelClass.getMethod("getModifiedDate");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value2);

					Method method3 = oldModelClass.getMethod("getName");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setName(value3);

					Method method4 = oldModelClass.getMethod("getUrl");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setUrl(value4);

					Method method5 = oldModelClass.getMethod("getWsdl");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setWsdl(value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.wsrp.model.impl.WSRPConsumerPortletImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					WSRPConsumerPortletClp newModel = new WSRPConsumerPortletClp();

					Method method0 = oldModelClass.getMethod(
							"getWsrpConsumerPortletId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setWsrpConsumerPortletId(value0.longValue());

					Method method1 = oldModelClass.getMethod("getCreateDate");

					Date value1 = (Date)method1.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value1);

					Method method2 = oldModelClass.getMethod("getModifiedDate");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value2);

					Method method3 = oldModelClass.getMethod(
							"getWsrpConsumerId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setWsrpConsumerId(value3.longValue());

					Method method4 = oldModelClass.getMethod("getName");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setName(value4);

					Method method5 = oldModelClass.getMethod("getPortletHandle");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setPortletHandle(value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.liferay.wsrp.model.impl.WSRPProducerImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					WSRPProducerClp newModel = new WSRPProducerClp();

					Method method0 = oldModelClass.getMethod(
							"getWsrpProducerId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setWsrpProducerId(value0.longValue());

					Method method1 = oldModelClass.getMethod("getCompanyId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getCreateDate");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value2);

					Method method3 = oldModelClass.getMethod("getModifiedDate");

					Date value3 = (Date)method3.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value3);

					Method method4 = oldModelClass.getMethod("getName");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setName(value4);

					Method method5 = oldModelClass.getMethod("getPortletIds");

					String value5 = (String)method5.invoke(oldModel,
							(Object[])null);

					newModel.setPortletIds(value5);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel) {
			return translateOutput((BaseModel)obj);
		}
		else if (obj instanceof List) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}