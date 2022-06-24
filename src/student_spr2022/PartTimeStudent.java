/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_spr2022;

/**
 *
 * @author marco
 */
public class PartTimeStudent extends Student_spr2022{

    private int noOfCourses;
    
    public PartTimeStudent (int noOfCourses, int studentId){
        super (studentId, studentName);
        this.noOfCourses = noOfCourses;
    }
    
    public int getNoOfCourses(){
    return noOfCourses;
    }
}
