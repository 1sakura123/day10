package com.mengjia.test;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	// 方法1：根据传入的日期获取年龄
	// 示例:
	public static int getAge(Date date) {
		Calendar calendar = Calendar.getInstance();
		int i = Calendar.YEAR;
		calendar.get(i);
		int j = Calendar.YEAR;
		calendar.get(j);
		calendar.setTime(date);

		return i - j;
	}

	// 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01
	// 00:00:00”
	// 示例:
	public static Date getDateByMonthInit(Date date) {
		Calendar calendar = Calendar.getInstance();
		int year = Calendar.YEAR;
		calendar.get(year);
		int month = Calendar.MONTH;
		calendar.get(month);
		int dayOfMonth = Calendar.DAY_OF_MONTH;
		calendar.get(dayOfMonth);
		calendar.setTime(date);
		return date;
	}

	// 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30
	// 23:59:59”，注意月大月小以及闰年。
	// 示例:
	public static Date getDateByMonthLast(Date date) {
		Calendar calendar = Calendar.getInstance();
		int year = Calendar.YEAR;
		calendar.get(year);
		int month = Calendar.MONTH;
		calendar.before(month);
		calendar.get(month);
		int dayOfMonth = Calendar.DAY_OF_WEEK_IN_MONTH;
		calendar.get(dayOfMonth);
		return date;
	}

	// 方法4：求未来日期离今天还剩的天数
	// 示例:
	@SuppressWarnings("deprecation")
	public static int getDaysByFuture(Date future) {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		int month = date.getMonth();
		date.setMonth(month);
		int day = date.getDay();
		date.setDate(day);
		int hours = date.getHours();
		date.setHours(hours);
		return 1;
	}

	// 方法5：求过去日期离今天过去的天数
	// 示例:
	@SuppressWarnings("deprecation")
	public static int getDaysByDeparted(Date departed) {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		int month = date.getMonth();
		int day = date.getDay();
		int hours = date.getHours();
		int day2 = Calendar.DAY_OF_MONTH;
		return day-day2;
	}
}
