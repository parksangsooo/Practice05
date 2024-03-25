package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    // getter/setter 작성
    
    
    public String getName() {
    	return name;
    }
    
    public void setName() {
    	this.name = name;
 
    }
    
    public String getHp() {
    	return hp;
    }
    
    public void setHp() {
    	this.hp = hp;
    	
    }
    
    public String getSchool() {
    	return school;
    }
    
    public void setSchool() {
    	this.school = school;
    	
    }
    
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
