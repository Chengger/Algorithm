package JavaAlgorithm;

import java.util.Date;

public class NextDay {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(getNextDate(now));
	}

	private static Date getNextDate(Date d) {
		long addTime = 1;
		addTime *= 1;//一天以后
		addTime *= 24;
		addTime *= 60;
		addTime *= 60;
		addTime *= 1000;
		Date date = new Date(d.getTime()+addTime);//当前时间加上一天以后的毫秒数
		return date;
	}
}
