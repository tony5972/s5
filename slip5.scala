object slip5
{
    def main(args:Array[String])
    {
        val a=Set("hello","where","will","when","your")
        val b=Set("hello","fine","okay","are","you")
        println(a)
        println(b)
       var i=a.intersect(b)
       println("common elements in given set : "+i)
	var c=a.diff(b);
    	var d=b.diff(a);		
       println("after merging both set:"+(c++d))
           
    }
}
