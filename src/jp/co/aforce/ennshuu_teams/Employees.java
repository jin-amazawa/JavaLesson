package jp.co.aforce.ennshuu_teams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employees {
	
	private String name;
	private String department;
	private int salary;
	private int working_years;
	
	public Employees(String name, String department, int salary, int working_years) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.working_years = working_years;
	}
	
	public static void main(String[] args) {
		List<Employees> employees = new ArrayList<>();
		
		employees.add(new Employees("山田太郎","営業部", 300000, 5));
		employees.add(new Employees("鈴木花子","開発部", 350000, 3));
		employees.add(new Employees("佐藤一郎","営業部", 280000, 1));
		employees.add(new Employees("田中美咲","人事部", 320000, 4));
		employees.add(new Employees("中村健一","開発部", 380000, 7));
		
		List<Integer> eigyou = new ArrayList<Integer>();
		List<Integer> kaihatu = new ArrayList<Integer>();
		List<Integer> jinnji = new ArrayList<Integer>();
		
		for(Employees employee: employees) {
			String depart_section = employee.department;
			int salary_section = employee.salary;
			if(depart_section == "営業部") {
				eigyou.add(salary_section);
			}else if(depart_section == "開発部") {
				kaihatu.add(salary_section);
			}else {
				jinnji.add(salary_section);
			}
		}
		
		int eigyou_heikin = (eigyou.get(0) + eigyou.get(1))/ eigyou.size();
		int kaihatu_heikin = (kaihatu.get(0) + kaihatu.get(1)) / kaihatu.size();
		int jinnji_heikin = jinnji.get(0) / jinnji.size();
		
		System.out.println("営業部 " + eigyou_heikin + "円");
		System.out.println("開発部 " + kaihatu_heikin + "円");
		System.out.println("人事部 " + jinnji_heikin + "円");
		
		for(Employees employee: employees) {
			String name = employee.name;
			int salary_section = employee.salary;
			int money = employee.working_years;
			int total = 0;
			
			for(int i = 1; i <= money; i++) {
				total += 10000;
			}
			System.out.println(name + "さんの昇給額は" + total + "円です。");
		}
		
		List<Integer> salaryRanking = new ArrayList<Integer>();
		for(Employees employee : employees) {
			int a = employee.salary;
			salaryRanking.add(a);
		}
		salaryRanking.sort(Comparator.reverseOrder());
		int top_salary = salaryRanking.get(0);
		int second_salary = salaryRanking.get(1);
		int third_salary = salaryRanking.get(2);
		
		System.out.println("");
		System.out.println("給与が高いランキング");
		
		for(Employees employee: employees) {
			if(employee.salary == top_salary) {
				System.out.println("１位: " + employee.name);
			}
			if(employee.salary == second_salary) {
				System.out.println("２位: " + employee.name);
			}
			if(employee.salary == third_salary) {
				System.out.println("３位: " + employee.name);
			}
		}
		
	}
	
}
