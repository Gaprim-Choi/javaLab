package sec11.ezam02_static_final;

public class Earth {
	
	// 상수
	static final double EARTH_RADUIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADUIUS*EARTH_RADUIUS;
	}
}
