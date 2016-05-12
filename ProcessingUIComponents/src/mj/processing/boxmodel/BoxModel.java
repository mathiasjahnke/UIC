package mj.processing.boxmodel;


/**
 * A CSS like Box Model to give the ui elements margins and paddings. <br>
 * the BoxModel is can be initialized manually or by the ui element itself. <br><br>
 * 
 * <a href="https://wiki.selfhtml.org/wiki/CSS/Box-Modell">A reference to the box model</a>
 * 
 * @author Mathias Jahnke, Technische Universit&auml;t M&uuml;nchen, <a href="http://www.lfk.bgu.tum.de">Chair of Cartography</a>
 * @version 0.0.1
 * @since 12.06.2016
 *
 */
public class BoxModel {

	private float marginTop, marginRight, marginBottom, marginLeft;
	private float paddingTop, paddingRight, paddingBottom, paddingLeft;
	
	/**
	 * standard constructor
	 */
	public BoxModel(){
		
	}
	
	/**
	 * to set the same value for every margin and every padding
	 * 
	 * @param margin the value set to all margins
	 * @param padding the value set to all paddings
	 */
	public BoxModel(float margin, float padding){
		
		this.marginTop = margin;
		this.marginRight = margin;
		this.marginLeft = margin;
		this.marginBottom = margin;
		
		this.paddingTop = padding;
		this.paddingRight = padding;
		this.paddingLeft = padding;
		this.paddingBottom = padding;
	}
	
	/**
	 * to set individual values for margins and paddings 
	 * 
	 * @param marginTop value in pixel
	 * @param marginRight value in pixel
	 * @param marginBottom value in pixel
	 * @param marginLeft value in pixel
	 * @param paddingTop value in pixel
	 * @param paddingRight value in pixel
	 * @param paddingBottom value in pixel
	 * @param paddingLeft value in pixel
	 */
	public BoxModel(float marginTop, float marginRight, float marginBottom, float marginLeft, 
			float paddingTop, float paddingRight, float paddingBottom, float paddingLeft){
		
		this.marginTop = marginTop;
		this.marginRight = marginRight;
		this.marginLeft = marginLeft;
		this.marginBottom = marginBottom;
		
		this.paddingTop = paddingTop;
		this.paddingRight = paddingRight;
		this.paddingLeft = paddingLeft;
		this.paddingBottom = paddingBottom;
	}

	/**
	 * 
	 * @return
	 */
	public float getMarginTop() {
		return marginTop;
	}

	/**
	 * 
	 * @param marginTop
	 */
	public void setMarginTop(float marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * 
	 * @return
	 */
	public float getMarginRight() {
		return marginRight;
	}

	/**
	 * 
	 * @param marginRight
	 */
	public void setMarginRight(float marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * 
	 * @return
	 */
	public float getMarginBottom() {
		return marginBottom;
	}

	/**
	 * 
	 * @param marginBottom
	 */
	public void setMarginBottom(float marginBottom) {
		this.marginBottom = marginBottom;
	}

	/**
	 * 
	 * @return
	 */
	public float getMarginLeft() {
		return marginLeft;
	}

	/**
	 * 
	 * @param marginLeft
	 */
	public void setMarginLeft(float marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * 
	 * @return
	 */
	public float getPaddingTop() {
		return paddingTop;
	}

	/**
	 * 
	 * @param paddingTop
	 */
	public void setPaddingTop(float paddingTop) {
		this.paddingTop = paddingTop;
	}

	/**
	 * 
	 * @return
	 */
	public float getPaddingRight() {
		return paddingRight;
	}

	/**
	 * 
	 * @param paddingRight
	 */
	public void setPaddingRight(float paddingRight) {
		this.paddingRight = paddingRight;
	}

	/**
	 * 
	 * @return
	 */
	public float getPaddingBottom() {
		return paddingBottom;
	}

	/**
	 * 
	 * @param paddingBottom
	 */
	public void setPaddingBottom(float paddingBottom) {
		this.paddingBottom = paddingBottom;
	}

	/**
	 * 
	 * @return
	 */
	public float getPaddingLeft() {
		return paddingLeft;
	}

	/**
	 * 
	 * @param paddingLeft
	 */
	public void setPaddingLeft(float paddingLeft) {
		this.paddingLeft = paddingLeft;
	}

}
