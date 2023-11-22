package mypack;

public class DriverMultiLevelInheritanceEx1 {
	public static void main(String[] args) {
		//superclass 1 MultiLevelInheritanceEx1
		MultiLevelInheritanceEx1 SUP1 = new MultiLevelInheritanceEx1();
		SUP1.Sendmsg();
		System.out.println("=========");
		
		//Superclass 2 MultiLevelInheritanceEx2
		MultiLevelInheritanceEx2 SUP2 = new MultiLevelInheritanceEx2();
		SUP2.Voicemsg();
		SUP2.Sendmsg();
		System.out.println("=========");
		
		//Subclass MultiLevelInheritanceEx3
		MultiLevelInheritanceEx3 SUB = new MultiLevelInheritanceEx3();
		SUB.Videocall();
		SUB.Voicemsg();
		SUB.Sendmsg();
		
		
	
	}

}
