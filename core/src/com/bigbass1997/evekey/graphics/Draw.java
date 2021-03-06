package com.bigbass1997.evekey.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.bigbass1997.evekey.Assets;
import com.bigbass1997.evekey.FID;

/**
 * Contains a set of functions that will draw various
 * textures and colors to the screen.
 * <p>
 * All functions are static so no need to create a Draw object.
 * <p>
 * 
 * Utilizes the ShapeRenderer provided by LibGDX for quick shading of simple shapes.
 * 
 * @see ShapeRenderer
 */
public class Draw {
	
	/**
	 * Draws a standard rectangle.
	 * 
	 * @param sr ShapeRenderer
	 * @param x x-axis position from the origin
	 * @param y y-axis position from the origin
	 * @param width width
	 * @param height height
	 * @param type ShapeType.Filled or ShapeType.Line
	 * @param color RGBA 0x + Hexadecimal code for each color. 0x000000FF would be black with 100% opacity
	 * 
	 * @see ShapeType
	 * @see Color
	 * @see Viewpoint
	 */
	public static void rect(ShapeRenderer sr, float x, float y, float width, float height, ShapeType type, int color){
		Gdx.graphics.getGL20().glEnable(GL20.GL_BLEND);
		sr.begin(type);
		sr.setColor(new Color(color));
		sr.rect(x, y, width, height);
		sr.end();
		Gdx.graphics.getGL20().glDisable(GL20.GL_BLEND);
	}
	
	/**
	 * Draws a string as text.
	 * 
	 * @param batch
	 * @param s String
	 * @param x x-axis position from the origin
	 * @param y y-axis position from the origin
	 * @param font BitmapFont from Assets
	 * @param color RGBA 0x + Hexadecimal code for each color. 0x000000FF would be black with 100% opacity
	 * 
	 * @see Color
	 */
	public static void string(SpriteBatch batch, String s, float x, float y, FID fid, int color){
		BitmapFont font = Assets.getFont(fid);
		font.setColor(Color.WHITE); //Resets color
		font.setColor(new Color(color));
		batch.begin();
		font.draw(batch, s, x, y);
		batch.end();
	}
	
	public static void boarder(ShapeRenderer sr, float x, float y, float width, float height, int thickness, int color){
		for(int i = 0; i < thickness; i++){
			rect(sr, x + i, y + i, width - (i * 2), height - (i * 2), ShapeType.Line, color);
		}
	}
	
	public static void line(ShapeRenderer sr, float x1, float y1, float x2, float y2, int color){
		Gdx.graphics.getGL20().glEnable(GL20.GL_BLEND);
		sr.begin(ShapeType.Filled);
		sr.setColor(new Color(color));
		sr.rectLine(x1, y1, x2, y2, 1);
		sr.end();
		Gdx.graphics.getGL20().glDisable(GL20.GL_BLEND);
	}
	
	public static void dot(ShapeRenderer sr, float x, float y, int color){
		rect(sr, x, y, 4.0f, 4.0f, ShapeType.Filled, color);
	}
}
