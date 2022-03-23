package com.tranquyet.constants;

import lombok.Getter;

@Getter
public enum WeatherConstant {
	CLEAR_SKY("clear sky",
			"https://i.tribune.com.pk/media/images/5-59555_photo-wallpaper-the-sun-dawn-coffee-mornin1626689182-0/5-59555_photo-wallpaper-the-sun-dawn-coffee-mornin1626689182-0.jpg"),
	CLOUDS("clouds", "https://cloudappreciationsociety.org/wp-content/uploads/2017/03/Jen-M.jpg"),
	RAIN("rain", "https://c4.wallpaperflare.com/wallpaper/291/944/37/rain-dark-water-drops-wallpaper-preview.jpg"),
	THUNDERSTORM("thunderstorm",
			"https://images.unsplash.com/photo-1594760467013-64ac2b80b7d3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8&w=1000&q=80"),
	SNOW("snow", "https://www.sciencenewsforstudents.org/wp-content/uploads/2021/02/1030_LL_snow.jpg"),
	MIST("mist", "https://www.caa.gov.qa/en-us/CAA%20Images/English%20news/En-Caa%20news/fog%203932.jpg"),

	CLEAR_SKY_ICON("clear sky", "https://icons.iconarchive.com/icons/pixelkit/flat-jewels/512/Weather-icon.png"),
	CLOUDS_ICON("clouds",
			"https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-many-clouds-icon.png"),
	RAIN_ICON("rain",
			"https://icons.iconarchive.com/icons/oxygen-icons.org/oxygen/256/Status-weather-showers-scattered-icon.png"),
	THUNDERSTORM_ICON("thunderstorm",
			"https://icons.iconarchive.com/icons/custom-icon-design/weather/256/thunder-icon.png"),
	SNOW_ICON("snow", "https://icons.iconarchive.com/icons/custom-icon-design/weather/256/snow-icon.png"),
	MIST_ICON("mist", "https://icons.iconarchive.com/icons/custom-icon-design/weather/256/fog-icon.png");

	private String key;
	private String value;

	WeatherConstant(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
