package ex_11;

public abstract class TangibleAsset extends Asset {

	// コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price, color);
	}

	//メソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }

	}
