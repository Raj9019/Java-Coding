class rm{
  float len,bre;
  void getdata(float a,float b){
     len=a;
     bre=b;
  }
}
class area{
  public static void main(String[] args){
     float area;
     rm r=new rm();
     r.getdata(14,10);
     area=r.len*r.bre;
     System.out.print("Area="+area);
 }
}