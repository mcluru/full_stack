package com.lec.ex03_interface;

import com.lec.ex03_interface.Button.OnClickListner;

public class YouTube implements OnClickListner{
	@Override
	public void OnClick() {
		System.out.println("YouTube를 시청합니다");
	}
}
