package replaceinheritancewithdelegation;

import java.util.Random;

public class Dice extends Random {
	
	/*
	 * 1. 在Dice中宣告父類別型態的委託用欄位_random
	 * 2. 在建構子中用this初始化_random
	 * 3. 將已繼承的方法改寫成利用委託用欄位
	 * 4. 解除繼承關係
	 * 5. 利用父類別的instance將委託用欄位做初始化
	 * 6. 在Dice中宣告setSeed(),透過_random呼叫Random的setSeed()
	 * 7. 將多餘的程式碼移除(拒絕承續的部分)
	 * 8. 將建構子做連鎖
	 * 
	 */
	public Dice(){
		super(314159L);
	}
	
	public Dice(Long seed){
		super(seed);
	}
	
	@Override
	public int nextInt(){
		return next(6) + 1;
	}
	
	//=======================拒絕承續=======================//
	
	@Override
	public void nextBytes(byte[] bytes){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public long nextLong(){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean nextBoolean(){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public float nextFloat(){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double nextDouble(){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double nextGaussian(){
		throw new UnsupportedOperationException();
	}
	
	//=======================拒絕承續=======================//
}
