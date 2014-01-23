/**
 * 
 */
package recursionController;

/**
 * @author CJ Oman
 * @version 1.0
 * @date Jan 8, 2014 8:09:51 AM
 */
public class Recursion
{
	private int fibonacci(int currentNumber)
	{
		int fibValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			} else
			{
				return fibonacci(currentNumber - 1)
						+ fibonacci(currentNumber - 2);
			}
		}
		return fibValue;
	}

	private int factorial(int currentNumber)
	{
		int factValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			} else
			{
				return factorial(currentNumber - 1) * currentNumber;
			}
		}
		return factValue;
	}

	public void start()
	{
		for (int count = 0; count < 80; count++)
		{
			System.out.println(fibonacci(count));
		}

		System.out.println(fibonacci(5));

		for (int count = 0; count < 80; count++)
		{
			System.out.println(factorial(count));
		}

		System.out.println(factorial(5));
	}
}
