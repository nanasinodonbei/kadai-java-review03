package baseball;

public class BaseBallTeam {

	private String name;
	private int win;
	private int lose;
	private int drow;

	public BaseBallTeam() {

	}

	public BaseBallTeam(String name, int win, int lose, int drow) {

		this.name = name;
		this.win = win;
		this.lose = lose;
		this.drow = drow;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDrow() {
		return drow;
	}

	public void setDrow(int drow) {
		this.drow = drow;
	}

	public double getLate() {

		return (double) win / (win + lose);

	}

	public void report() {

		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + drow + "分、勝率は" + getLate() + "です。");

	}

}