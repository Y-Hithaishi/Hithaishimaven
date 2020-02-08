package org.apache.maven.archetypes.maven_archetype_quickstart;
//package mavenJava;
class Sweet implements Comparable{
int weight=1;
String name="";
String color="yellow";
float calories=100;
public int compareTo(Object o) {
return 0;
}
}
class chocolate extends Sweet{}
class FiveStar extends chocolate
{
FiveStar ()
{
this.name="FiveStar";
}
}
class KitKat extends chocolate{
KitKat()
{
this.name="KitKat";
}
}
public class maven{
public static void main(String[] args) {
Sweet[] alsweets = new Sweet[3];
alsweets [0]= new FiveStar();
alsweets [1]= new FiveStar();
alsweets [2]= new KitKat();
float tw =0;
for (int i = 0; i < alsweets.length; i++) {
Sweet s = alsweets[i];
tw += s.weight;
}
System.out.println(" tow = "+tw);
System.out.println(" Printing ");
for (int i = 0; i < alsweets.length; i++) {
Sweet s = alsweets[i];
System.out.println(s.name);
}
System.out.println(" sort all objects using name");
}
}