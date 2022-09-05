package org.add;

public class GreensTech {
	private  void greensOmr() {
System.out.println("GreensOmr");
	}
	private void greensOmr(int flatNo ,long pin ) {
		System.out.println("GreensOmrFlatNo:"+ flatNo +"\n"+ "GreensOmrPin : "+ pin );
			}
	private void greensOmr(boolean locatedInThoraipakkam) {
		System.out.println("GreensOmrLocatedIn:" + locatedInThoraipakkam);
			}
	private void greensOmr(long telephone , int roomNo ) {
		System.out.println("GreensOmrTelephone:"+telephone +"\n" +"GreensOmrRoomNo:"+ roomNo);
			}
	public static void main(String[] args) {
		GreensTech g = new GreensTech ();
		g.greensOmr();
		g.greensOmr(19, 600097l);
		g.greensOmr(true);
		g.greensOmr(462344l, 4);
	}


}
