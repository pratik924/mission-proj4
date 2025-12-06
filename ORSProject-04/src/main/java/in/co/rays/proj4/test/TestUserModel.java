package in.co.rays.proj4.test;

import java.beans.beancontext.BeanContext;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rasy.proj4.bean.UserBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.UserModel;

public class TestUserModel {
	public static UserModel model = new UserModel();

	public static void main(String[] args) throws ApplicationException, DuplicateRecordException, ParseException {

		testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByLogin();
		// testSearch();

	}

	public static void testAdd() throws ApplicationException, DuplicateRecordException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setFirstName("Harshit");
		bean.setLastName("Mewada");
		bean.setLogin("harshit@gmail.com");
		bean.setPassword("harshit@123");
		bean.setDob(sdf.parse("1997-05-12"));
		bean.setMobileNo("7566407602");
		bean.setRoleId(3L);
		bean.setGender("Male");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	private static void testUpdate() throws ParseException, ApplicationException, DuplicateRecordException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setFirstName("Rohit");
		bean.setLastName("Mewada");
		bean.setLogin("rohit@gmail.com");
		bean.setPassword("rohit@123");
		bean.setDob(sdf.parse("1997-05-12"));
		bean.setMobileNo("7049603932");
		bean.setRoleId(2L);
		bean.setGender("Male");
		bean.setCreatedBy("root");
		bean.setModifiedBy("root");
		bean.setCreatedDatetime(new Timestamp(new Date().getDate()));
		bean.setModifiedDatetime(new Timestamp(new Date().getDate()));

		model.update(bean);

	}

	private static void testDelete() throws ApplicationException {

		UserBean bean = new UserBean();
		model.delete(2L);

	}

	private static void testFindByPk() throws ApplicationException {

		UserBean bean = new UserBean();
		// bean.setId(2L);
		bean = model.findByPk(2L);
		if (bean != null) {

			System.out.println(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getRoleId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("User not Found");
		}
	}

	private static void testFindByLogin() throws ApplicationException {

		UserBean bean = new UserBean();
		bean = model.findByLogin("neeraj@gmail.com");
		if (bean != null) {

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("User not Found");
		}
	}

	private static void testSearch() throws ApplicationException, ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setFirstName("Rohit");
		// bean.setDob(sdf.parse("1997-05-12"));
		// bean.setRole_id(1);

		List<UserBean> list = model.search(bean, 0, 0);
		Iterator<UserBean> it = list.iterator();
		while (it.hasNext()) {
			bean = it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}

}
