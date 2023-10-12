/**
 * 
 */
package interface_class;

/**
 * 
 */
public class SubRaw implements RawInterface {

    public	void mobile() {
		System.out.println("mobile name is ::: ");
	}
	public void memory() {
		System.out.println("memory of the mobile is ::: ");
	}
	public void processor() {
		System.out.println("processor of the mobile is ::: ");
	}
	public void camera() {
		System.out.println("camera of the mobile is ::: ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubRaw subRaw =new SubRaw();
		
  subRaw.mobile();
  subRaw.camera();
  subRaw.memory();
  subRaw.processor();
  
	}

}
