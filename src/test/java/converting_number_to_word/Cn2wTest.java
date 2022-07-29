package converting_number_to_word;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Cn2wTest {

	@Test
	void test() 
	{
		Cn2w cn2w=new Cn2w();
		String result=cn2w.numberToWord(1);

		assertEquals("one",result);
	}
	@Test
	void test1() 
	{
		Cn2w cn2w=new Cn2w();
		String result=cn2w.numberToWord(89);
		assertEquals("eighty-nine",result);
	}
	@Test
	void test3() 
	{
		Cn2w cn2w=new Cn2w();
		String result=cn2w.numberToWord(76301064);

		assertEquals("seventy-six million three hundred one thousand sixty-four",result);
	}
}
