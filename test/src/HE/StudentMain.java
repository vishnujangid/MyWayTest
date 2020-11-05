package HE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	private int id;
	private String name;
	private int[] marks;
	public Student() {
        this(0, null);
    }
    public Student(int id, String name) {
        this(id, name, new int[5]);
    }
    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]" ;
	}
} 

public class StudentMain {
	public static void main(String[] args) {
		int arr[] ={1,3,5,6,6,1};
		int i =0;
		int st [] = new int[7];
		while (i<6){
			st[arr[i]]=st[arr[i]]+1;
			i++;
		}
		for(int i1 =0 ; i1<7;i1++ ) System.out.println(i1+" "+st[i1]);
	}
}