package edu.jy.test;

import edu.jy.domain.Phone;

import java.util.Scanner;

public class Main {
	// 定义一个scanner类 用于接收用户输入
	private static final Scanner SCANNER = new Scanner(System.in);
	// 实例化一个手机类，可以存储10个手机对象
	private static final Phone[] PHONE_ARR = new Phone[10];//可以存放10个手机的货架对象
	//  定义一个变量 用于存储用户登录账号
	private static String currUserName;
	
	/**
	 * 按商品编号查询商品对象的方法
	 *
	 * @param phoneId 商品编号
	 * @return 如果找到了就返回商品对象，如果没有找到就返回null
	 */
	// 定义了一个按编号查找商品的方法（需传入一个id 参数）
	public static Phone searchById(Integer phoneId) {
		int length = getLength();//获取商品个数
		for (int i = 0; i < length; i++) {   // 循环查找id
			if (phoneId == PHONE_ARR[i].getPhoneId()) {   // 判断是否与用户输入的id是否一致
				return PHONE_ARR[i];      // 如果是  返回这个商品对象
			}
		}
		//这句话能运行到的情况只有一种：上面return PHONE_ARR[i];没执行。
		return null;
	}
	
	/**
	 * 按商品名称查询商品对象的方法
	 *
	 * @param phoneName 商品名称
	 * @return 查询到的商品对象，如果没有查询到返回null
	 */
	public static Phone searchByName(String phoneName) {  // 需传入一个商品名的参数
		int length = getLength();//获取商品个数
		for (int i = 0; i < length; i++) {      // 循环查找商品名称
			if (phoneName.equals(PHONE_ARR[i].getPhoneName())) {   // 判断是否商品名是否有重复
				return PHONE_ARR[i];      // 如果有就返回这个商品对象
			}
		}
		//这句话能运行到的情况只有一种：上面return PHONE_ARR[i];没执行。
		return null;
	}
	
	/**
	 * 按指定商品编号查询商品索引
	 *
	 * @param phoneId 商品编号
	 * @return 商品索引
	 */
	public static Integer getIndexById(Integer phoneId) {   // 需传入要查找的商品id
		int length = getLength();    // 获取商品个数
		for (int i = 0; i < length; i++) {   // 循环找到相同id
			if (PHONE_ARR[i].getPhoneId() == phoneId) {      // 判断是否与要查找的id一致
				return i;     //是   返回索引
			}
		}
		return null;   //   没有找到  返回null
	}
	
	/**
	 * 按编号删除商品的方法
	 *
	 * @param phoneId 商品编号
	 */
	public static void delPhoneById(Integer phoneId) {
		//5 按编号删除商品
		//  5.1 找到要删除的商品的索引位置（A）
		int delIndex = getIndexById(phoneId);
		//  5.2 从（A）位置开始，用后一个（A+1）向前覆盖
		//  5.3 到商品个数-2的索引位置为止
		int length = getLength();
		for (int i = delIndex; i < length - 1; i++) {
			PHONE_ARR[i] = PHONE_ARR[i + 1];      //   向前覆盖
		}
		//  5.4 将商品个数-1索引位置的值设置为null
		PHONE_ARR[length - 1] = null;
	}
	
	/**
	 * 删除商品的方法
	 */
	public static void delPhone() {
		Integer delPhoneId = checkId();//通过验证的合法的商品编号
		if (delConfirm()) {    //  判断是否确认删除
			//按编号删除商品的方法
			delPhoneById(delPhoneId);    // 调用方法进行指定id删除
			System.out.println("删除成功！");
		}
	}
	
	/**
	 * 添加新商品的方法
	 */
	public static void addPhone() {
		//获取商品个数
		int length = getLength();
		if (length == PHONE_ARR.length) {   //判断商品个数是否等于货架长度
			System.out.println("当前货架已满！不能添加新商品！");
		} else {
			Phone phone = checkName();    // 验证商品名称  并将这个商品赋值给phone
			PHONE_ARR[length] = phone;    // 将商品放到货架上
			System.out.println("添加新商品成功！");
		}
	}
	
	/**
	 * 验证商品编号的方法
	 *
	 * @return 验证成功的商品编号
	 */
	public static Integer checkId() {
		boolean isNext = false;//有没有下一次循环
		do {
			print();//打印所有商品
			int phoneId = getChoose();      //接收用户输入id
			if (searchById(phoneId) == null) {     // 验证商品是否存在
				// 不存在
				isNext = true;
				System.out.println("商品编号不存在！删除失败！请重新输入商品编号！");
			} else {  //存在
				return phoneId;
			}
		} while (isNext);
		return null;
	}
	
	/**
	 * 验证商品名称的方法
	 *
	 * @return 当验证成功时，返回新商品对象
	 */
	public static Phone checkName() {
		boolean isNext = false;//有没有下一次循环
		do {
			Phone phone = getPhoneView();   // 接收了用户输入的商品对象
			if (searchByName(phone.getPhoneName()) == null) {    // 验证商品名称是否存在
				// 不存在  返回用户输入的phone对象
				return phone;
			} else {
				// 存在
				isNext = true;
				System.out.println("商品名称已经存在！添加失败！请重新输入商品信息！");
			}
		} while (isNext);
		return null;
	}
	
	/**
	 * 输入商品信息的视图
	 *
	 * @return 一个新商品对象
	 */
	public static Phone getPhoneView() {
		Phone phone = new Phone();
		System.out.print("输入编号：");
		phone.setPhoneId(SCANNER.nextInt());
		SCANNER.nextLine();
		System.out.print("输入名称：");
		phone.setPhoneName(SCANNER.nextLine());
		System.out.print("输入价格：");
		phone.setPhonePrice(SCANNER.nextDouble());
		SCANNER.nextLine();
		System.out.print("输入类型：");
		phone.setPhoneType(SCANNER.nextLine());
		System.out.print("输入评价数：");
		phone.setPhoneEval(SCANNER.nextInt());
		SCANNER.nextLine();
		return phone;
	}
	
	/**
	 * 商品初始化方法
	 */
	public static void init() {
		Phone p1 = new Phone();//p1是一个手机对象。
		p1.setPhoneId(13);
		p1.setPhoneName("小米13");
		p1.setPhonePrice(4299.0);
		p1.setPhoneType("5G手机");
		p1.setPhoneEval(20);
		PHONE_ARR[0] = p1;
		
		Phone p2 = new Phone();//p1是一个手机对象。
		p2.setPhoneId(40);
		p2.setPhoneName("荣耀X40");
		p2.setPhonePrice(1599.0);
		p2.setPhoneType("5G手机");
		p2.setPhoneEval(20);
		PHONE_ARR[1] = p2;
		
		PHONE_ARR[2] = new Phone();//p1是一个手机对象。
		PHONE_ARR[2].setPhoneId(23);
		PHONE_ARR[2].setPhoneName("Galaxy S23 Ultra");
		PHONE_ARR[2].setPhonePrice(8999.0);
		PHONE_ARR[2].setPhoneType("5G手机");
		PHONE_ARR[2].setPhoneEval(2);
		
		PHONE_ARR[3] = new Phone();//p1是一个手机对象。
		PHONE_ARR[3].setPhoneId(9);
		PHONE_ARR[3].setPhoneName("OPPO K9x");
		PHONE_ARR[3].setPhonePrice(1199.0);
		PHONE_ARR[3].setPhoneType("5G手机");
		PHONE_ARR[3].setPhoneEval(50);
	}
	
	/**
	 * 打印输出商品信息
	 */
	public static void print() {
		//获取商品个数
		int length = getLength();   // 获取商品个数
		for (int i = 0; i < length; i++) {
			System.out.println(PHONE_ARR[i]);    // 循环并打印出所有商品
		}
	}
	
	/**
	 * 获取货架上的商品个数
	 *
	 * @return 商品个数
	 */
	public static int getLength() {
		for (int i = 0; i < PHONE_ARR.length; i++) {    // 循环0 - phone 长度
			if (PHONE_ARR[i] == null) {   // 判断是否等于null   说明没有商品了
				return i;   //返回这个索引
			}
		}
		return PHONE_ARR.length;    // 返回数组长度   说明商品是满的
	}
	
	/**
	 * 按商品编号进行升序排序方法
	 */
	public static void sortById() {
		//  冒泡排序
		int length = getLength();
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (PHONE_ARR[j].getPhoneId() > PHONE_ARR[j + 1].getPhoneId()) {
					// 换位
					Phone temp = PHONE_ARR[j];
					PHONE_ARR[j] = PHONE_ARR[j + 1];
					PHONE_ARR[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 按价格排序的方法
	 */
	public static void sortByPrice() {
		// 冒泡排序
		int length = getLength();
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (PHONE_ARR[j].getPhonePrice() < PHONE_ARR[j + 1].getPhonePrice()) {
					Phone temp = PHONE_ARR[j];
					PHONE_ARR[j] = PHONE_ARR[j + 1];
					PHONE_ARR[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 浏览器商品的视图
	 */
	public static void browseView() {
		System.out.println("1、按编号浏览商品");
		System.out.println("2、按价格浏览商品");
		int choose = getChoose();  // 接收用户选择
		switch (choose) {
			case 1:
				System.out.println("按编号浏览商品");
				sortById();
				print();
				break;
			case 2:
				System.out.println("按价格浏览商品");
				sortByPrice();
				print();
				break;
			default:
				System.out.println("选择不正确，请重新选择！");
				break;
		}
	}
	
	/**
	 * 用户主视图
	 */
	public static void userView() {
		boolean isNext = true;//是不是继续下一次循环
		do {
			System.out.println("========欢迎" + currUserName + "进入用户主视图========");
			System.out.println("1、浏览商品信息");
			System.out.println("2、添加商品信息");
			System.out.println("3、修改商品信息");
			System.out.println("4、删除商品信息");
			System.out.println("0、退出登录");
			int choose = getChoose();
			switch (choose) {
				case 1:
					browseView();
					break;
				case 2:
					addPhone();
					break;
				case 3:
					updatePhone();
					break;
				case 4:
					delPhone();
					break;
				case 0:
					//调用是否确认退出，确认退出没有下一次。
					isNext = !exitConfirm();
					break;
				default:
					System.out.println("选择不正确，请重新选择！");
					break;
			}
		} while (isNext);
	}
	
	/**
	 * 输入修改新商品信息的视图
	 *
	 * @return 返回修改之后的商品对象
	 */
	public static Phone UpdatePhoneView() {
		Phone phone = new Phone();
		System.out.print("输入名称：");
		phone.setPhoneName(SCANNER.nextLine());
		System.out.print("输入价格：");
		phone.setPhonePrice(SCANNER.nextDouble());
		SCANNER.nextLine();
		System.out.print("输入类型：");
		phone.setPhoneType(SCANNER.nextLine());
		System.out.print("输入评价数：");
		phone.setPhoneEval(SCANNER.nextInt());
		SCANNER.nextLine();
		return phone;
	}
	
	/**
	 * 验证修改商品的方法
	 *
	 * @param phone 要修改的原商品
	 */
	public static void checkUpdate(Phone phone) {
		boolean isNext;
		do {
			isNext = false;
			Phone updatePhone = UpdatePhoneView();//接收修改后的属性
			if (phone.getPhoneName().equals(updatePhone.getPhoneName())) { // 判断商品名是否重复
				//  商品名没有被修改
				phone.setPhoneName(updatePhone.getPhoneName());   // 这句可以不要
				phone.setPhoneType(updatePhone.getPhoneType());
				phone.setPhonePrice(updatePhone.getPhonePrice());
				phone.setPhoneEval(updatePhone.getPhoneEval());
			} else {
				// 商品名被是修改过
				//验证商品名称是不是重复
				if (searchByName(updatePhone.getPhoneName()) == null) {     // 商品名可以用
					//   进行覆盖
					phone.setPhoneName(updatePhone.getPhoneName());
					phone.setPhoneType(updatePhone.getPhoneType());
					phone.setPhonePrice(updatePhone.getPhonePrice());
					phone.setPhoneEval(updatePhone.getPhoneEval());
				} else {
					isNext = true;
					System.out.println("商品名称已存在！修改失败！请重新输入商品信息！");
				}
			}
		} while (isNext);
	}
	
	/**
	 * 修改商品的方法
	 */
	public static void updatePhone() {
		//1 先查
		print();   // 打印所有商品
		int phoneId = getChoose();   // 接收用户选择的id
		Phone phone = searchById(phoneId);   // 查询是否存在此商品
		System.out.println(phone);    // 输出此商品信息
		//2 再改
		checkUpdate(phone);   // 修改商品
		System.out.println(phone);  // 输出修改后的商品
	}
	
	/**
	 * 登录视图
	 */
	public static void loginView() {
		int n = 3;//3次失败机会
		do {
			System.out.print("请输入用户名：");
			String userName = SCANNER.nextLine();
			System.out.print("请输入密码：");
			String userPass = SCANNER.nextLine();
			if ("admin".equals(userName)) {
				if ("244466666".equals(userPass)) {
					System.out.println("登录成功！");
					//保存当前登录用户名
					currUserName = userName;
					//进入用户操作主界面
					userView();
				} else {
					System.out.println("密码错误！登录失败！还有" + (--n) + "次机会！");
				}
			} else {
				System.out.println("用户名不存在！登录失败！还有" + (--n) + "次机会！");
			}
		} while (n > 0 && loginConfirm());
	}
	
	/**
	 * 封装进行用户选择输入的方法
	 *
	 * @return 返回用户输入的选择
	 */
	public static int getChoose() {
		// 接收用户输入
		System.out.print("请选择：");
		int choose = SCANNER.nextInt();
		SCANNER.nextLine();
		return choose;
	}
	
	/**
	 * 登录确认方法
	 *
	 * @return 如果继续登录返回true, 否则返回false
	 */
	public static boolean loginConfirm() {
		// 判断用户是否要继续登录的方法
		System.out.print("是否继续登录(y/n):");
		String line = SCANNER.nextLine();
		return "y".equalsIgnoreCase(line);
	}
	
	/**
	 * 是否确认删除方法
	 *
	 * @return 确认删除返回true, 否则返回false。
	 */
	public static boolean delConfirm() {
		// 确认用户是否删除
		System.out.print("是否确认删除(y/n):");
		String line = SCANNER.nextLine();
		return "y".equalsIgnoreCase(line);
	}
	
	/**
	 * 封装的是否确认退出的方法<br>
	 *
	 * @return 确认退出返回true，否则返回false。
	 */
	public static boolean exitConfirm() {
		// 确认是否退出的方法
		System.out.print("是否确认退出(y/n):");
		String line = SCANNER.nextLine();
		return "y".equalsIgnoreCase(line);
	}
	
	public static void main(String[] args) {
		init();
		boolean isNext = true;//是不是继续下一次循环
		do {
			System.out.println("1、登录");
			System.out.println("0、退出");
			int choose = getChoose();
			switch (choose) {
				case 1:
					loginView();
					break;
				case 0:
					//调用是否确认退出，确认退出没有下一次。
					isNext = !exitConfirm();
					break;
				default:
					System.out.println("选择不正确，请重新选择！");
					break;
			}
		} while (isNext);
	}
}
