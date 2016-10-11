package com.leonwang.app.retrofitdesdemo.entity;

import java.util.List;

/**
 * 当前类注释：首页
 * Author :LeonWang
 * Created  2016/8/17.10:57
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */
public class HomeEntity {


    /**
     * aqi : {"AQI":"37","CO":"0.41","NO2":"16","O3":"114","PM10":"15","PM25":"13","SO2":"12","aqiAlert":[{"aqiLevel":1,"key":"mask","name":"口罩","value":"不用佩戴口罩"},{"aqiLevel":1,"key":"exercise","name":"户外运动","value":"非常适宜运动"},{"aqiLevel":1,"key":"people","name":"老人与儿童","value":"适宜外出"},{"aqiLevel":1,"key":"window","name":"开窗通风","value":"适宜开窗"}],"aqiDetail":"多参加户外活动，呼吸清新空气啦。","aqiLevel":1,"aqiLevelString":"优","cityCount":488,"rank":131,"time":"1476162000"}
     * aqi_5days : [{"aqi":"35","date":"1476115200"},{"aqi":"38","date":"1476201600"},{"aqi":"39","date":"1476288000"},{"aqi":"40","date":"1476374400"},{"aqi":"39","date":"1476460800"},{"aqi":"45","date":"1476547200"},{"aqi":"42","date":"1476633600"},{"aqi":"35","date":"1476720000"},{"aqi":"37","date":"1476806400"},{"aqi":"42","date":"1476892800"},{"aqi":"51","date":"1476979200"},{"aqi":"38","date":"1477065600"},{"aqi":"57","date":"1477152000"},{"aqi":"45","date":"1477238400"},{"aqi":"38","date":"1477324800"}]
     * aqi_hour : [{"aqi":"38","day":"1476288000","hour":"00","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476291600","hour":"01","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476295200","hour":"02","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476298800","hour":"03","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476302400","hour":"04","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476306000","hour":"05","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476309600","hour":"06","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476313200","hour":"07","icon":"26","temp":"20","tq":"阴"},{"aqi":"41","day":"1476316800","hour":"08","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476320400","hour":"09","icon":"26","temp":"21","tq":"阴"},{"aqi":"39","day":"1476324000","hour":"10","icon":"26","temp":"22","tq":"阴"},{"aqi":"38","day":"1476327600","hour":"11","icon":"26","temp":"22","tq":"阴"},{"aqi":"38","day":"1476331200","hour":"12","icon":"26","temp":"23","tq":"阴"},{"aqi":"37","day":"1476334800","hour":"13","icon":"26","temp":"23","tq":"阴"},{"aqi":"37","day":"1476338400","hour":"14","icon":"26","temp":"23","tq":"阴"},{"aqi":"37","day":"1476342000","hour":"15","icon":"26","temp":"22","tq":"阴"},{"aqi":"38","day":"1476345600","hour":"16","icon":"26","temp":"21","tq":"阴"},{"aqi":"38","day":"1476349200","hour":"17","icon":"26","temp":"20","tq":"阴"},{"aqi":"38","day":"1476352800","hour":"18","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476356400","hour":"19","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476360000","hour":"20","icon":"26","temp":"20","tq":"阴"},{"aqi":"41","day":"1476363600","hour":"21","icon":"26","temp":"20","tq":"阴"},{"aqi":"41","day":"1476367200","hour":"22","icon":"26","temp":"20","tq":"阴"},{"aqi":"42","day":"1476370800","hour":"23","icon":"26","temp":"20","tq":"阴"},{"aqi":"43","day":"1476374400","hour":"00","icon":"26","temp":"20","tq":"阴"},{"aqi":"43","day":"1476378000","hour":"01","icon":"26","temp":"20","tq":"阴"},{"aqi":"43","day":"1476381600","hour":"02","icon":"26","temp":"20","tq":"阴"},{"aqi":"45","day":"1476385200","hour":"03","icon":"26","temp":"20","tq":"阴"},{"aqi":"45","day":"1476388800","hour":"04","icon":"26","temp":"20","tq":"阴"},{"aqi":"45","day":"1476392400","hour":"05","icon":"26","temp":"20","tq":"阴"},{"aqi":"43","day":"1476396000","hour":"06","icon":"26","temp":"20","tq":"阴"},{"aqi":"43","day":"1476399600","hour":"07","icon":"26","temp":"21","tq":"阴"},{"aqi":"43","day":"1476403200","hour":"08","icon":"26","temp":"21","tq":"阴"},{"aqi":"42","day":"1476406800","hour":"09","icon":"26","temp":"21","tq":"阴"},{"aqi":"41","day":"1476410400","hour":"10","icon":"26","temp":"22","tq":"阴"},{"aqi":"41","day":"1476414000","hour":"11","icon":"26","temp":"22","tq":"阴"},{"aqi":"39","day":"1476417600","hour":"12","icon":"26","temp":"22","tq":"阴"},{"aqi":"38","day":"1476421200","hour":"13","icon":"64","temp":"22","tq":"中雨"},{"aqi":"37","day":"1476424800","hour":"14","icon":"64","temp":"22","tq":"中雨"},{"aqi":"37","day":"1476428400","hour":"15","icon":"64","temp":"22","tq":"中雨"},{"aqi":"35","day":"1476432000","hour":"16","icon":"28","temp":"21","tq":"多云"},{"aqi":"35","day":"1476435600","hour":"17","icon":"28","temp":"21","tq":"多云"},{"aqi":"35","day":"1476439200","hour":"18","icon":"28","temp":"21","tq":"多云"},{"aqi":"35","day":"1476442800","hour":"19","icon":"28","temp":"21","tq":"多云"},{"aqi":"37","day":"1476446400","hour":"20","icon":"28","temp":"21","tq":"多云"},{"aqi":"37","day":"1476450000","hour":"21","icon":"28","temp":"21","tq":"多云"},{"aqi":"37","day":"1476453600","hour":"22","icon":"28","temp":"20","tq":"多云"},{"aqi":"37","day":"1476457200","hour":"23","icon":"28","temp":"20","tq":"多云"}]
     * aqi_tomorrow : {"AQI":"38"}
     * cityId : 58362
     * cityName : 上海
     * days7 : [{"dayImg":"26","dayTemp":"25","dayWea":"阴","dayWeaShort":"阴","dayWindDirection":"东北风","dayWindLevel":"1-2级","nightImg":"26","nightTemp":"19","nightWea":"阴","nightWeaShort":"阴","nightWindDirection":"东北风","nightWindLevel":"1-2级","time":"1476115200","wholeTemp":"19～25","wholeWea":"阴","wholeWindDirection":"东北风1-2级"},{"dayImg":"26","dayTemp":"23","dayWea":"阴","dayWeaShort":"阴","dayWindDirection":"东北风","dayWindLevel":"1-2级","nightImg":"26","nightTemp":"19","nightWea":"阴","nightWeaShort":"阴","nightWindDirection":"东北风","nightWindLevel":"1-2级","time":"1476201600","wholeTemp":"19～23","wholeWea":"阴","wholeWindDirection":"东北风1-2级"},{"dayImg":"26","dayTemp":"22","dayWea":"阴","dayWeaShort":"阴","dayWindDirection":"东北风","dayWindLevel":"1-2级","nightImg":"11","nightTemp":"19","nightWea":"小雨","nightWeaShort":"小雨","nightWindDirection":"东北风","nightWindLevel":"1-2级","time":"1476288000","wholeTemp":"19～22","wholeWea":"阴转小雨","wholeWindDirection":"东北风1-2级"},{"dayImg":"11","dayTemp":"23","dayWea":"小雨","dayWeaShort":"小雨","dayWindDirection":"东北风","dayWindLevel":"1-2级","nightImg":"26","nightTemp":"20","nightWea":"阴","nightWeaShort":"阴","nightWindDirection":"东风","nightWindLevel":"1-2级","time":"1476374400","wholeTemp":"20～23","wholeWea":"小雨转阴","wholeWindDirection":"东北风东风1-2级"},{"dayImg":"11","dayTemp":"24","dayWea":"小雨","dayWeaShort":"小雨","dayWindDirection":"东风","dayWindLevel":"3-4级","nightImg":"11","nightTemp":"20","nightWea":"小雨","nightWeaShort":"小雨","nightWindDirection":"东风","nightWindLevel":"1-2级","time":"1476460800","wholeTemp":"20～24","wholeWea":"小雨","wholeWindDirection":"东风3-4级"},{"dayImg":"11","dayTemp":"24","dayWea":"小雨","dayWeaShort":"小雨","dayWindDirection":"东风","dayWindLevel":"1-2级","nightImg":"11","nightTemp":"20","nightWea":"小雨","nightWeaShort":"小雨","nightWindDirection":"北风","nightWindLevel":"1-2级","time":"1476547200","wholeTemp":"20～24","wholeWea":"小雨","wholeWindDirection":"东风北风1-2级"},{"dayImg":"26","dayTemp":"24","dayWea":"阴","dayWeaShort":"阴","dayWindDirection":"东北风","dayWindLevel":"1-2级","nightImg":"11","nightTemp":"19","nightWea":"小雨","nightWeaShort":"小雨","nightWindDirection":"东北风","nightWindLevel":"1-2级","time":"1476633600","wholeTemp":"19～24","wholeWea":"阴转小雨","wholeWindDirection":"东北风1-2级"}]
     * days8 : [{"dayImg":"28","dayTemp":"25","dayWea":"多云","dayWeaShort":"多云","nightImg":"28","nightTemp":"18","nightWea":"多云","nightWeaShort":"多云","time":"1476720000"},{"dayImg":"26","dayTemp":"25","dayWea":"阴","dayWeaShort":"阴","nightImg":"26","nightTemp":"20","nightWea":"阴","nightWeaShort":"阴","time":"1476806400"},{"dayImg":"26","dayTemp":"24","dayWea":"阴","dayWeaShort":"阴","nightImg":"64","nightTemp":"21","nightWea":"中雨","nightWeaShort":"中雨","time":"1476892800"},{"dayImg":"64","dayTemp":"26","dayWea":"中雨","dayWeaShort":"中雨","nightImg":"64","nightTemp":"23","nightWea":"中雨","nightWeaShort":"中雨","time":"1476979200"},{"dayImg":"64","dayTemp":"26","dayWea":"中雨","dayWeaShort":"中雨","nightImg":"64","nightTemp":"21","nightWea":"中雨","nightWeaShort":"中雨","time":"1477065600"},{"dayImg":"28","dayTemp":"23","dayWea":"多云","dayWeaShort":"多云","nightImg":"64","nightTemp":"18","nightWea":"中雨","nightWeaShort":"中雨","time":"1477152000"},{"dayImg":"64","dayTemp":"22","dayWea":"中雨","dayWeaShort":"中雨","nightImg":"64","nightTemp":"19","nightWea":"中雨","nightWeaShort":"中雨","time":"1477238400"},{"dayImg":"64","dayTemp":"25","dayWea":"中雨","dayWeaShort":"中雨","nightImg":"64","nightTemp":"19","nightWea":"中雨","nightWeaShort":"中雨","time":"1477324800"}]
     * hourData : [{"aqi":"10","day":"1476115200","hour":"00","icon":"28","temp":"19","tq":"多云"},{"aqi":"10","day":"1476118800","hour":"01","icon":"28","temp":"18","tq":"多云"},{"aqi":"10","day":"1476122400","hour":"02","icon":"28","temp":"18","tq":"多云"},{"aqi":"10","day":"1476126000","hour":"03","icon":"28","temp":"18","tq":"多云"},{"aqi":"10","day":"1476129600","hour":"04","icon":"28","temp":"18","tq":"多云"},{"aqi":"10","day":"1476133200","hour":"05","icon":"28","temp":"18","tq":"多云"},{"aqi":"18","day":"1476136800","hour":"06","icon":"28","temp":"18","tq":"多云"},{"aqi":"19","day":"1476140400","hour":"07","icon":"28","temp":"19","tq":"多云"},{"aqi":"14","day":"1476144000","hour":"08","icon":"28","temp":"20","tq":"多云"},{"aqi":"15","day":"1476147600","hour":"09","icon":"26","temp":"22","tq":"阴"},{"aqi":"16","day":"1476151200","hour":"10","icon":"26","temp":"22","tq":"阴"},{"aqi":"18","day":"1476154800","hour":"11","icon":"26","temp":"23","tq":"阴"},{"aqi":"20","day":"1476158400","hour":"12","icon":"26","temp":"23","tq":"阴"},{"aqi":"22","day":"1476162000","hour":"13","icon":"26","temp":"24","tq":"阴"},{"aqi":"33","day":"1476165600","hour":"14","icon":"26","temp":"24","tq":"阴"},{"aqi":"33","day":"1476169200","hour":"15","icon":"26","temp":"24","tq":"阴"},{"aqi":"34","day":"1476172800","hour":"16","icon":"26","temp":"23","tq":"阴"},{"aqi":"34","day":"1476176400","hour":"17","icon":"26","temp":"23","tq":"阴"},{"aqi":"34","day":"1476180000","hour":"18","icon":"26","temp":"23","tq":"阴"},{"aqi":"34","day":"1476183600","hour":"19","icon":"26","temp":"22","tq":"阴"},{"aqi":"35","day":"1476187200","hour":"20","icon":"26","temp":"22","tq":"阴"},{"aqi":"37","day":"1476190800","hour":"21","icon":"26","temp":"22","tq":"阴"},{"aqi":"37","day":"1476194400","hour":"22","icon":"26","temp":"21","tq":"阴"},{"aqi":"38","day":"1476198000","hour":"23","icon":"26","temp":"21","tq":"阴"},{"aqi":"38","day":"1476201600","hour":"00","icon":"26","temp":"21","tq":"阴"},{"aqi":"39","day":"1476205200","hour":"01","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476208800","hour":"02","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476212400","hour":"03","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476216000","hour":"04","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476219600","hour":"05","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476223200","hour":"06","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476226800","hour":"07","icon":"26","temp":"19","tq":"阴"},{"aqi":"41","day":"1476230400","hour":"08","icon":"26","temp":"20","tq":"阴"},{"aqi":"39","day":"1476234000","hour":"09","icon":"26","temp":"21","tq":"阴"},{"aqi":"39","day":"1476237600","hour":"10","icon":"26","temp":"21","tq":"阴"},{"aqi":"39","day":"1476241200","hour":"11","icon":"26","temp":"22","tq":"阴"},{"aqi":"38","day":"1476244800","hour":"12","icon":"26","temp":"22","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"13","icon":"26","temp":"22","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"14","icon":"26","temp":"22","tq":"阴"},{"aqi":"35","day":"1476201600","hour":"15","icon":"26","temp":"22","tq":"阴"},{"aqi":"35","day":"1476201600","hour":"16","icon":"26","temp":"21","tq":"阴"},{"aqi":"35","day":"1476201600","hour":"17","icon":"26","temp":"20","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"18","icon":"26","temp":"20","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"19","icon":"26","temp":"20","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"20","icon":"26","temp":"20","tq":"阴"},{"aqi":"37","day":"1476201600","hour":"21","icon":"26","temp":"20","tq":"阴"},{"aqi":"38","day":"1476201600","hour":"22","icon":"26","temp":"20","tq":"阴"},{"aqi":"38","day":"1476201600","hour":"23","icon":"26","temp":"20","tq":"阴"}]
     * pollutants :
     * sk : {"humidity":"42%","humidity_48hours":"71%","humidity_72hours":"68%","rainProbability":{"today":"17%","tomorrow":"25%"},"sk_ATM":"1018 hPa","sk_temp":"24","sk_time":"14:02","sunTime":{"today":"- - 小时","tomorrow":"- - 小时"},"uvDesc":{"afterTomorrow":"最弱","today":"最弱","tomorrow":"最弱"},"windDirection":"东北风","windPower":"1级"}
     * sk_weather : {"condition":"晴","tips":"","type":"32"}
     * sunrise : {"RiseAfterTomorrow":"05:55","SetAfterTomorrow":"17:24","todayRise":"05:54","todaySet":"17:27","tomorrowRise":"05:55","tomorrowSet":"17:26"}
     * video : {"describe":"海南广东有较强降雨 北方明起升温","url":"http://v.cctv.com/flash/mp4video55/TMS/2016/10/11/67b359c796d442e68e9f37b8334b3e05_h264418000nero_aac32.mp4"}
     * yesterday : {"dayImg":"28","dayTemp":"22","dayWea":"多云","dayWeaShort":"多云","nightImg":"26","nightTemp":"18","nightWea":"阴","nightWeaShort":"阴","time":"1476028800","wholeTemp":"18～22","wholeWea":"多云转阴"}
     * zs : [{"detail":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","level":"天气舒适","levelColor":"comfortable","name":"穿衣指数","text":"建议长袖牛仔裤"},{"detail":"阴天，但降水概率很低，因此您在出门的时候无须带雨伞。","level":"无需带伞","levelColor":"green","name":"雨伞指数","text":"外出时无需带雨伞。"},{"detail":"早晨气象条件较适宜晨练，但天气阴沉，晨练时会感觉有点凉，晨练时着装不要过于单薄，并避免在林中晨练。","level":"较适宜晨练","levelColor":"green","name":"晨练指数","text":"气象条件会对晨练影响不大。"},{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","level":"紫外线很弱","levelColor":"green","name":"紫外线指数","text":"您无需担心紫外线。"},{"detail":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。","level":"少发感冒","levelColor":"green","name":"感冒指数","text":"发生感冒机率较低。"},{"detail":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","level":"较不宜晾晒","levelColor":"red","name":"晾晒指数","text":"天气阴沉，不太适宜晾晒。"},{"detail":"阴天，路面干燥，交通气象条件良好，车辆可以正常行驶。","level":"适宜开车","levelColor":"green","name":"交通指数","text":"天气很好，适宜正常行驶。"},{"detail":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","level":"较适宜洗车","levelColor":"green","name":"洗车指数","text":"天气不错，较适合擦洗汽车。"},{"detail":"较适合垂钓，但阴沉的天气可能会对鱼吃食产生一定的影响。","level":"较适宜钓鱼","levelColor":"green","name":"钓鱼指数","text":"气象条件对钓鱼影响不大。"}]
     * zs_72hours : [{"detail":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","level":"天气较舒适","levelColor":"comfortable","name":"穿衣指数","text":"建议穿薄型套装"},{"detail":"阴天，但降水概率很低，因此您在出门的时候无须带雨伞。","level":"无需带伞","levelColor":"green","name":"雨伞指数","text":"外出时无需带雨伞。"},{"detail":"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。","level":"较易发感冒","levelColor":"red","name":"感冒指数","text":"体质较弱的朋友需注意防护。"},{"detail":"天气条件易诱发过敏，易过敏人群应减少外出，外出宜穿长衣长裤并佩戴好眼镜和口罩，外出归来时及时清洁手和口鼻。","level":"易过敏","levelColor":"red","name":"过敏指数","text":"请尽量减少外出。"},{"detail":"早晨气象条件较适宜晨练，但天气阴沉，晨练时会感觉有点凉，晨练时着装不要过于单薄，并避免在林中晨练。","level":"较适宜晨练","levelColor":"green","name":"晨练指数","text":"气象条件会对晨练影响不大。"},{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","level":"紫外线很弱","levelColor":"green","name":"紫外线指数","text":"您无需担心紫外线。"},{"detail":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","level":"较不宜晾晒","levelColor":"red","name":"晾晒指数","text":"天气阴沉，不太适宜晾晒。"},{"detail":"阴天，路面干燥，交通气象条件良好，车辆可以正常行驶。","level":"适宜开车","levelColor":"green","name":"交通指数","text":"天气很好，适宜正常行驶。"},{"detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","level":"不宜洗车","levelColor":"red","name":"洗车指数","text":"泥水可能会弄脏您的爱车。"},{"detail":"阴天，路面比较干燥，路况较好。","level":"路面干燥","levelColor":"green","name":"路况指数","text":"天气很好，适宜正常行驶。"},{"detail":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。","level":"适宜旅游","levelColor":"green","name":"旅游指数","text":"享受大自然的无限风光吧。"},{"detail":"较适合垂钓，但阴沉的天气可能会对鱼吃食产生一定的影响。","level":"较适宜钓鱼","levelColor":"green","name":"钓鱼指数","text":"气象条件对钓鱼影响不大。"}]
     * zs_other : [{"detail":"天气条件易诱发过敏，易过敏人群应减少外出，外出宜穿长衣长裤并佩戴好眼镜和口罩，外出归来时及时清洁手和口鼻。","level":"易过敏","levelColor":"red","name":"过敏指数","text":"请尽量减少外出。"},{"detail":"阴天，路面比较干燥，路况较好。","level":"路面干燥","levelColor":"green","name":"路况指数","text":"天气很好，适宜正常行驶。"},{"detail":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。","level":"适宜旅游","levelColor":"green","name":"旅游指数","text":"享受大自然的无限风光吧。"}]
     * zs_other_tomorrow : [{"detail":"天气条件易诱发过敏，易过敏人群应减少外出，外出宜穿长衣长裤并佩戴好眼镜和口罩，外出归来时及时清洁手和口鼻。","level":"易过敏","levelColor":"red","name":"过敏指数","text":"请尽量减少外出。"},{"detail":"阴天，路面比较干燥，路况较好。","level":"路面干燥","levelColor":"green","name":"路况指数","text":"天气很好，适宜正常行驶。"},{"detail":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。","level":"适宜旅游","levelColor":"green","name":"旅游指数","text":"享受大自然的无限风光吧。"}]
     * zs_tomorrow : [{"detail":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","level":"天气舒适","levelColor":"comfortable","name":"穿衣指数","text":"建议长袖牛仔裤"},{"detail":"阴天，但降水概率很低，因此您在出门的时候无须带雨伞。","level":"无需带伞","levelColor":"green","name":"雨伞指数","text":"外出时无需带雨伞。"},{"detail":"早晨气象条件较适宜晨练，但天气阴沉，晨练时会感觉有点凉，晨练时着装不要过于单薄，并避免在林中晨练。","level":"较适宜晨练","levelColor":"green","name":"晨练指数","text":"气象条件会对晨练影响不大。"},{"detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","level":"紫外线很弱","levelColor":"green","name":"紫外线指数","text":"您无需担心紫外线。"},{"detail":"各项气象条件适宜，无明显降温过程，发生感冒机率较低。","level":"少发感冒","levelColor":"green","name":"感冒指数","text":"发生感冒机率较低。"},{"detail":"天气阴沉，不利于水分的迅速蒸发，不太适宜晾晒。若需要晾晒，请尽量选择通风的地点。","level":"较不宜晾晒","levelColor":"red","name":"晾晒指数","text":"天气阴沉，不太适宜晾晒。"},{"detail":"阴天，路面干燥，交通气象条件良好，车辆可以正常行驶。","level":"适宜开车","levelColor":"green","name":"交通指数","text":"天气很好，适宜正常行驶。"},{"detail":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","level":"较适宜洗车","levelColor":"green","name":"洗车指数","text":"天气不错，较适合擦洗汽车。"},{"detail":"较适合垂钓，但阴沉的天气可能会对鱼吃食产生一定的影响。","level":"较适宜钓鱼","levelColor":"green","name":"钓鱼指数","text":"气象条件对钓鱼影响不大。"}]
     */

    private AqiEntity aqi;
    private AqiTomorrowEntity aqi_tomorrow;
    private String cityId;
    private String cityName;
    private String pollutants;
    private SkEntity sk;
    private SkWeatherEntity sk_weather;
    private SunriseEntity sunrise;
    private VideoEntity video;
    private YesterdayEntity yesterday;
    private List<Aqi5daysEntity> aqi_5days;
    private List<AqiHourEntity> aqi_hour;
    private List<Days7Entity> days7;
    private List<Days8Entity> days8;
    private List<HourDataEntity> hourData;
    private List<ZsEntity> zs;
    private List<Zs72hoursEntity> zs_72hours;
    private List<ZsOtherEntity> zs_other;
    private List<ZsOtherTomorrowEntity> zs_other_tomorrow;
    private List<ZsTomorrowEntity> zs_tomorrow;

    public void setAqi(AqiEntity aqi) {
        this.aqi = aqi;
    }

    public void setAqi_tomorrow(AqiTomorrowEntity aqi_tomorrow) {
        this.aqi_tomorrow = aqi_tomorrow;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPollutants(String pollutants) {
        this.pollutants = pollutants;
    }

    public void setSk(SkEntity sk) {
        this.sk = sk;
    }

    public void setSk_weather(SkWeatherEntity sk_weather) {
        this.sk_weather = sk_weather;
    }

    public void setSunrise(SunriseEntity sunrise) {
        this.sunrise = sunrise;
    }

    public void setVideo(VideoEntity video) {
        this.video = video;
    }

    public void setYesterday(YesterdayEntity yesterday) {
        this.yesterday = yesterday;
    }

    public void setAqi_5days(List<Aqi5daysEntity> aqi_5days) {
        this.aqi_5days = aqi_5days;
    }

    public void setAqi_hour(List<AqiHourEntity> aqi_hour) {
        this.aqi_hour = aqi_hour;
    }

    public void setDays7(List<Days7Entity> days7) {
        this.days7 = days7;
    }

    public void setDays8(List<Days8Entity> days8) {
        this.days8 = days8;
    }

    public void setHourData(List<HourDataEntity> hourData) {
        this.hourData = hourData;
    }

    public void setZs(List<ZsEntity> zs) {
        this.zs = zs;
    }

    public void setZs_72hours(List<Zs72hoursEntity> zs_72hours) {
        this.zs_72hours = zs_72hours;
    }

    public void setZs_other(List<ZsOtherEntity> zs_other) {
        this.zs_other = zs_other;
    }

    public void setZs_other_tomorrow(List<ZsOtherTomorrowEntity> zs_other_tomorrow) {
        this.zs_other_tomorrow = zs_other_tomorrow;
    }

    public void setZs_tomorrow(List<ZsTomorrowEntity> zs_tomorrow) {
        this.zs_tomorrow = zs_tomorrow;
    }

    public AqiEntity getAqi() {
        return aqi;
    }

    public AqiTomorrowEntity getAqi_tomorrow() {
        return aqi_tomorrow;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPollutants() {
        return pollutants;
    }

    public SkEntity getSk() {
        return sk;
    }

    public SkWeatherEntity getSk_weather() {
        return sk_weather;
    }

    public SunriseEntity getSunrise() {
        return sunrise;
    }

    public VideoEntity getVideo() {
        return video;
    }

    public YesterdayEntity getYesterday() {
        return yesterday;
    }

    public List<Aqi5daysEntity> getAqi_5days() {
        return aqi_5days;
    }

    public List<AqiHourEntity> getAqi_hour() {
        return aqi_hour;
    }

    public List<Days7Entity> getDays7() {
        return days7;
    }

    public List<Days8Entity> getDays8() {
        return days8;
    }

    public List<HourDataEntity> getHourData() {
        return hourData;
    }

    public List<ZsEntity> getZs() {
        return zs;
    }

    public List<Zs72hoursEntity> getZs_72hours() {
        return zs_72hours;
    }

    public List<ZsOtherEntity> getZs_other() {
        return zs_other;
    }

    public List<ZsOtherTomorrowEntity> getZs_other_tomorrow() {
        return zs_other_tomorrow;
    }

    public List<ZsTomorrowEntity> getZs_tomorrow() {
        return zs_tomorrow;
    }

    public static class AqiEntity {
        /**
         * AQI : 37
         * CO : 0.41
         * NO2 : 16
         * O3 : 114
         * PM10 : 15
         * PM25 : 13
         * SO2 : 12
         * aqiAlert : [{"aqiLevel":1,"key":"mask","name":"口罩","value":"不用佩戴口罩"},{"aqiLevel":1,"key":"exercise","name":"户外运动","value":"非常适宜运动"},{"aqiLevel":1,"key":"people","name":"老人与儿童","value":"适宜外出"},{"aqiLevel":1,"key":"window","name":"开窗通风","value":"适宜开窗"}]
         * aqiDetail : 多参加户外活动，呼吸清新空气啦。
         * aqiLevel : 1
         * aqiLevelString : 优
         * cityCount : 488
         * rank : 131
         * time : 1476162000
         */

        private String AQI;
        private String CO;
        private String NO2;
        private String O3;
        private String PM10;
        private String PM25;
        private String SO2;
        private String aqiDetail;
        private int aqiLevel;
        private String aqiLevelString;
        private int cityCount;
        private int rank;
        private String time;
        private List<AqiAlertEntity> aqiAlert;

        public void setAQI(String AQI) {
            this.AQI = AQI;
        }

        public void setCO(String CO) {
            this.CO = CO;
        }

        public void setNO2(String NO2) {
            this.NO2 = NO2;
        }

        public void setO3(String O3) {
            this.O3 = O3;
        }

        public void setPM10(String PM10) {
            this.PM10 = PM10;
        }

        public void setPM25(String PM25) {
            this.PM25 = PM25;
        }

        public void setSO2(String SO2) {
            this.SO2 = SO2;
        }

        public void setAqiDetail(String aqiDetail) {
            this.aqiDetail = aqiDetail;
        }

        public void setAqiLevel(int aqiLevel) {
            this.aqiLevel = aqiLevel;
        }

        public void setAqiLevelString(String aqiLevelString) {
            this.aqiLevelString = aqiLevelString;
        }

        public void setCityCount(int cityCount) {
            this.cityCount = cityCount;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setAqiAlert(List<AqiAlertEntity> aqiAlert) {
            this.aqiAlert = aqiAlert;
        }

        public String getAQI() {
            return AQI;
        }

        public String getCO() {
            return CO;
        }

        public String getNO2() {
            return NO2;
        }

        public String getO3() {
            return O3;
        }

        public String getPM10() {
            return PM10;
        }

        public String getPM25() {
            return PM25;
        }

        public String getSO2() {
            return SO2;
        }

        public String getAqiDetail() {
            return aqiDetail;
        }

        public int getAqiLevel() {
            return aqiLevel;
        }

        public String getAqiLevelString() {
            return aqiLevelString;
        }

        public int getCityCount() {
            return cityCount;
        }

        public int getRank() {
            return rank;
        }

        public String getTime() {
            return time;
        }

        public List<AqiAlertEntity> getAqiAlert() {
            return aqiAlert;
        }

        public static class AqiAlertEntity {
            /**
             * aqiLevel : 1
             * key : mask
             * name : 口罩
             * value : 不用佩戴口罩
             */

            private int aqiLevel;
            private String key;
            private String name;
            private String value;

            public void setAqiLevel(int aqiLevel) {
                this.aqiLevel = aqiLevel;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public int getAqiLevel() {
                return aqiLevel;
            }

            public String getKey() {
                return key;
            }

            public String getName() {
                return name;
            }

            public String getValue() {
                return value;
            }

            @Override
            public String toString() {
                return "AqiAlertEntity{" +
                        "aqiLevel=" + aqiLevel +
                        ", key='" + key + '\'' +
                        ", name='" + name + '\'' +
                        ", value='" + value + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "AqiEntity{" +
                    "AQI='" + AQI + '\'' +
                    ", CO='" + CO + '\'' +
                    ", NO2='" + NO2 + '\'' +
                    ", O3='" + O3 + '\'' +
                    ", PM10='" + PM10 + '\'' +
                    ", PM25='" + PM25 + '\'' +
                    ", SO2='" + SO2 + '\'' +
                    ", aqiDetail='" + aqiDetail + '\'' +
                    ", aqiLevel=" + aqiLevel +
                    ", aqiLevelString='" + aqiLevelString + '\'' +
                    ", cityCount=" + cityCount +
                    ", rank=" + rank +
                    ", time='" + time + '\'' +
                    ", aqiAlert=" + aqiAlert +
                    '}';
        }
    }

    public static class AqiTomorrowEntity {
        /**
         * AQI : 38
         */

        private String AQI;

        public void setAQI(String AQI) {
            this.AQI = AQI;
        }

        public String getAQI() {
            return AQI;
        }

        @Override
        public String toString() {
            return "AqiTomorrowEntity{" +
                    "AQI='" + AQI + '\'' +
                    '}';
        }
    }

    public static class SkEntity {
        /**
         * humidity : 42%
         * humidity_48hours : 71%
         * humidity_72hours : 68%
         * rainProbability : {"today":"17%","tomorrow":"25%"}
         * sk_ATM : 1018 hPa
         * sk_temp : 24
         * sk_time : 14:02
         * sunTime : {"today":"- - 小时","tomorrow":"- - 小时"}
         * uvDesc : {"afterTomorrow":"最弱","today":"最弱","tomorrow":"最弱"}
         * windDirection : 东北风
         * windPower : 1级
         */

        private String humidity;
        private String humidity_48hours;
        private String humidity_72hours;
        private RainProbabilityEntity rainProbability;
        private String sk_ATM;
        private String sk_temp;
        private String sk_time;
        private SunTimeEntity sunTime;
        private UvDescEntity uvDesc;
        private String windDirection;
        private String windPower;

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public void setHumidity_48hours(String humidity_48hours) {
            this.humidity_48hours = humidity_48hours;
        }

        public void setHumidity_72hours(String humidity_72hours) {
            this.humidity_72hours = humidity_72hours;
        }

        public void setRainProbability(RainProbabilityEntity rainProbability) {
            this.rainProbability = rainProbability;
        }

        public void setSk_ATM(String sk_ATM) {
            this.sk_ATM = sk_ATM;
        }

        public void setSk_temp(String sk_temp) {
            this.sk_temp = sk_temp;
        }

        public void setSk_time(String sk_time) {
            this.sk_time = sk_time;
        }

        public void setSunTime(SunTimeEntity sunTime) {
            this.sunTime = sunTime;
        }

        public void setUvDesc(UvDescEntity uvDesc) {
            this.uvDesc = uvDesc;
        }

        public void setWindDirection(String windDirection) {
            this.windDirection = windDirection;
        }

        public void setWindPower(String windPower) {
            this.windPower = windPower;
        }

        public String getHumidity() {
            return humidity;
        }

        public String getHumidity_48hours() {
            return humidity_48hours;
        }

        public String getHumidity_72hours() {
            return humidity_72hours;
        }

        public RainProbabilityEntity getRainProbability() {
            return rainProbability;
        }

        public String getSk_ATM() {
            return sk_ATM;
        }

        public String getSk_temp() {
            return sk_temp;
        }

        public String getSk_time() {
            return sk_time;
        }

        public SunTimeEntity getSunTime() {
            return sunTime;
        }

        public UvDescEntity getUvDesc() {
            return uvDesc;
        }

        public String getWindDirection() {
            return windDirection;
        }

        public String getWindPower() {
            return windPower;
        }

        public static class RainProbabilityEntity {
            /**
             * today : 17%
             * tomorrow : 25%
             */

            private String today;
            private String tomorrow;

            public void setToday(String today) {
                this.today = today;
            }

            public void setTomorrow(String tomorrow) {
                this.tomorrow = tomorrow;
            }

            public String getToday() {
                return today;
            }

            public String getTomorrow() {
                return tomorrow;
            }

            @Override
            public String toString() {
                return "RainProbabilityEntity{" +
                        "today='" + today + '\'' +
                        ", tomorrow='" + tomorrow + '\'' +
                        '}';
            }
        }

        public static class SunTimeEntity {
            /**
             * today : - - 小时
             * tomorrow : - - 小时
             */

            private String today;
            private String tomorrow;

            public void setToday(String today) {
                this.today = today;
            }

            public void setTomorrow(String tomorrow) {
                this.tomorrow = tomorrow;
            }

            public String getToday() {
                return today;
            }

            public String getTomorrow() {
                return tomorrow;
            }

            @Override
            public String toString() {
                return "SunTimeEntity{" +
                        "today='" + today + '\'' +
                        ", tomorrow='" + tomorrow + '\'' +
                        '}';
            }
        }

        public static class UvDescEntity {
            /**
             * afterTomorrow : 最弱
             * today : 最弱
             * tomorrow : 最弱
             */

            private String afterTomorrow;
            private String today;
            private String tomorrow;

            public void setAfterTomorrow(String afterTomorrow) {
                this.afterTomorrow = afterTomorrow;
            }

            public void setToday(String today) {
                this.today = today;
            }

            public void setTomorrow(String tomorrow) {
                this.tomorrow = tomorrow;
            }

            public String getAfterTomorrow() {
                return afterTomorrow;
            }

            public String getToday() {
                return today;
            }

            public String getTomorrow() {
                return tomorrow;
            }

            @Override
            public String toString() {
                return "UvDescEntity{" +
                        "afterTomorrow='" + afterTomorrow + '\'' +
                        ", today='" + today + '\'' +
                        ", tomorrow='" + tomorrow + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "SkEntity{" +
                    "humidity='" + humidity + '\'' +
                    ", humidity_48hours='" + humidity_48hours + '\'' +
                    ", humidity_72hours='" + humidity_72hours + '\'' +
                    ", rainProbability=" + rainProbability +
                    ", sk_ATM='" + sk_ATM + '\'' +
                    ", sk_temp='" + sk_temp + '\'' +
                    ", sk_time='" + sk_time + '\'' +
                    ", sunTime=" + sunTime +
                    ", uvDesc=" + uvDesc +
                    ", windDirection='" + windDirection + '\'' +
                    ", windPower='" + windPower + '\'' +
                    '}';
        }
    }

    public static class SkWeatherEntity {
        /**
         * condition : 晴
         * tips :
         * type : 32
         */

        private String condition;
        private String tips;
        private String type;

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCondition() {
            return condition;
        }

        public String getTips() {
            return tips;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "SkWeatherEntity{" +
                    "condition='" + condition + '\'' +
                    ", tips='" + tips + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public static class SunriseEntity {
        /**
         * RiseAfterTomorrow : 05:55
         * SetAfterTomorrow : 17:24
         * todayRise : 05:54
         * todaySet : 17:27
         * tomorrowRise : 05:55
         * tomorrowSet : 17:26
         */

        private String RiseAfterTomorrow;
        private String SetAfterTomorrow;
        private String todayRise;
        private String todaySet;
        private String tomorrowRise;
        private String tomorrowSet;

        public void setRiseAfterTomorrow(String RiseAfterTomorrow) {
            this.RiseAfterTomorrow = RiseAfterTomorrow;
        }

        public void setSetAfterTomorrow(String SetAfterTomorrow) {
            this.SetAfterTomorrow = SetAfterTomorrow;
        }

        public void setTodayRise(String todayRise) {
            this.todayRise = todayRise;
        }

        public void setTodaySet(String todaySet) {
            this.todaySet = todaySet;
        }

        public void setTomorrowRise(String tomorrowRise) {
            this.tomorrowRise = tomorrowRise;
        }

        public void setTomorrowSet(String tomorrowSet) {
            this.tomorrowSet = tomorrowSet;
        }

        public String getRiseAfterTomorrow() {
            return RiseAfterTomorrow;
        }

        public String getSetAfterTomorrow() {
            return SetAfterTomorrow;
        }

        public String getTodayRise() {
            return todayRise;
        }

        public String getTodaySet() {
            return todaySet;
        }

        public String getTomorrowRise() {
            return tomorrowRise;
        }

        public String getTomorrowSet() {
            return tomorrowSet;
        }

        @Override
        public String toString() {
            return "SunriseEntity{" +
                    "RiseAfterTomorrow='" + RiseAfterTomorrow + '\'' +
                    ", SetAfterTomorrow='" + SetAfterTomorrow + '\'' +
                    ", todayRise='" + todayRise + '\'' +
                    ", todaySet='" + todaySet + '\'' +
                    ", tomorrowRise='" + tomorrowRise + '\'' +
                    ", tomorrowSet='" + tomorrowSet + '\'' +
                    '}';
        }
    }

    public static class VideoEntity {
        /**
         * describe : 海南广东有较强降雨 北方明起升温
         * url : http://v.cctv.com/flash/mp4video55/TMS/2016/10/11/67b359c796d442e68e9f37b8334b3e05_h264418000nero_aac32.mp4
         */

        private String describe;
        private String url;

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescribe() {
            return describe;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "VideoEntity{" +
                    "describe='" + describe + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    public static class YesterdayEntity {
        /**
         * dayImg : 28
         * dayTemp : 22
         * dayWea : 多云
         * dayWeaShort : 多云
         * nightImg : 26
         * nightTemp : 18
         * nightWea : 阴
         * nightWeaShort : 阴
         * time : 1476028800
         * wholeTemp : 18～22
         * wholeWea : 多云转阴
         */

        private String dayImg;
        private String dayTemp;
        private String dayWea;
        private String dayWeaShort;
        private String nightImg;
        private String nightTemp;
        private String nightWea;
        private String nightWeaShort;
        private String time;
        private String wholeTemp;
        private String wholeWea;

        public void setDayImg(String dayImg) {
            this.dayImg = dayImg;
        }

        public void setDayTemp(String dayTemp) {
            this.dayTemp = dayTemp;
        }

        public void setDayWea(String dayWea) {
            this.dayWea = dayWea;
        }

        public void setDayWeaShort(String dayWeaShort) {
            this.dayWeaShort = dayWeaShort;
        }

        public void setNightImg(String nightImg) {
            this.nightImg = nightImg;
        }

        public void setNightTemp(String nightTemp) {
            this.nightTemp = nightTemp;
        }

        public void setNightWea(String nightWea) {
            this.nightWea = nightWea;
        }

        public void setNightWeaShort(String nightWeaShort) {
            this.nightWeaShort = nightWeaShort;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setWholeTemp(String wholeTemp) {
            this.wholeTemp = wholeTemp;
        }

        public void setWholeWea(String wholeWea) {
            this.wholeWea = wholeWea;
        }

        public String getDayImg() {
            return dayImg;
        }

        public String getDayTemp() {
            return dayTemp;
        }

        public String getDayWea() {
            return dayWea;
        }

        public String getDayWeaShort() {
            return dayWeaShort;
        }

        public String getNightImg() {
            return nightImg;
        }

        public String getNightTemp() {
            return nightTemp;
        }

        public String getNightWea() {
            return nightWea;
        }

        public String getNightWeaShort() {
            return nightWeaShort;
        }

        public String getTime() {
            return time;
        }

        public String getWholeTemp() {
            return wholeTemp;
        }

        public String getWholeWea() {
            return wholeWea;
        }


        @Override
        public String toString() {
            return "YesterdayEntity{" +
                    "dayImg='" + dayImg + '\'' +
                    ", dayTemp='" + dayTemp + '\'' +
                    ", dayWea='" + dayWea + '\'' +
                    ", dayWeaShort='" + dayWeaShort + '\'' +
                    ", nightImg='" + nightImg + '\'' +
                    ", nightTemp='" + nightTemp + '\'' +
                    ", nightWea='" + nightWea + '\'' +
                    ", nightWeaShort='" + nightWeaShort + '\'' +
                    ", time='" + time + '\'' +
                    ", wholeTemp='" + wholeTemp + '\'' +
                    ", wholeWea='" + wholeWea + '\'' +
                    '}';
        }
    }

    public static class Aqi5daysEntity {
        /**
         * aqi : 35
         * date : 1476115200
         */

        private String aqi;
        private String date;

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAqi() {
            return aqi;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Aqi5daysEntity{" +
                    "aqi='" + aqi + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

    public static class AqiHourEntity {
        /**
         * aqi : 38
         * day : 1476288000
         * hour : 00
         * icon : 26
         * temp : 20
         * tq : 阴
         */

        private String aqi;
        private String day;
        private String hour;
        private String icon;
        private String temp;
        private String tq;

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public void setHour(String hour) {
            this.hour = hour;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public void setTq(String tq) {
            this.tq = tq;
        }

        public String getAqi() {
            return aqi;
        }

        public String getDay() {
            return day;
        }

        public String getHour() {
            return hour;
        }

        public String getIcon() {
            return icon;
        }

        public String getTemp() {
            return temp;
        }

        public String getTq() {
            return tq;
        }

        @Override
        public String toString() {
            return "AqiHourEntity{" +
                    "aqi='" + aqi + '\'' +
                    ", day='" + day + '\'' +
                    ", hour='" + hour + '\'' +
                    ", icon='" + icon + '\'' +
                    ", temp='" + temp + '\'' +
                    ", tq='" + tq + '\'' +
                    '}';
        }
    }

    public static class Days7Entity {
        /**
         * dayImg : 26
         * dayTemp : 25
         * dayWea : 阴
         * dayWeaShort : 阴
         * dayWindDirection : 东北风
         * dayWindLevel : 1-2级
         * nightImg : 26
         * nightTemp : 19
         * nightWea : 阴
         * nightWeaShort : 阴
         * nightWindDirection : 东北风
         * nightWindLevel : 1-2级
         * time : 1476115200
         * wholeTemp : 19～25
         * wholeWea : 阴
         * wholeWindDirection : 东北风1-2级
         */

        private String dayImg;
        private String dayTemp;
        private String dayWea;
        private String dayWeaShort;
        private String dayWindDirection;
        private String dayWindLevel;
        private String nightImg;
        private String nightTemp;
        private String nightWea;
        private String nightWeaShort;
        private String nightWindDirection;
        private String nightWindLevel;
        private String time;
        private String wholeTemp;
        private String wholeWea;
        private String wholeWindDirection;

        public void setDayImg(String dayImg) {
            this.dayImg = dayImg;
        }

        public void setDayTemp(String dayTemp) {
            this.dayTemp = dayTemp;
        }

        public void setDayWea(String dayWea) {
            this.dayWea = dayWea;
        }

        public void setDayWeaShort(String dayWeaShort) {
            this.dayWeaShort = dayWeaShort;
        }

        public void setDayWindDirection(String dayWindDirection) {
            this.dayWindDirection = dayWindDirection;
        }

        public void setDayWindLevel(String dayWindLevel) {
            this.dayWindLevel = dayWindLevel;
        }

        public void setNightImg(String nightImg) {
            this.nightImg = nightImg;
        }

        public void setNightTemp(String nightTemp) {
            this.nightTemp = nightTemp;
        }

        public void setNightWea(String nightWea) {
            this.nightWea = nightWea;
        }

        public void setNightWeaShort(String nightWeaShort) {
            this.nightWeaShort = nightWeaShort;
        }

        public void setNightWindDirection(String nightWindDirection) {
            this.nightWindDirection = nightWindDirection;
        }

        public void setNightWindLevel(String nightWindLevel) {
            this.nightWindLevel = nightWindLevel;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setWholeTemp(String wholeTemp) {
            this.wholeTemp = wholeTemp;
        }

        public void setWholeWea(String wholeWea) {
            this.wholeWea = wholeWea;
        }

        public void setWholeWindDirection(String wholeWindDirection) {
            this.wholeWindDirection = wholeWindDirection;
        }

        public String getDayImg() {
            return dayImg;
        }

        public String getDayTemp() {
            return dayTemp;
        }

        public String getDayWea() {
            return dayWea;
        }

        public String getDayWeaShort() {
            return dayWeaShort;
        }

        public String getDayWindDirection() {
            return dayWindDirection;
        }

        public String getDayWindLevel() {
            return dayWindLevel;
        }

        public String getNightImg() {
            return nightImg;
        }

        public String getNightTemp() {
            return nightTemp;
        }

        public String getNightWea() {
            return nightWea;
        }

        public String getNightWeaShort() {
            return nightWeaShort;
        }

        public String getNightWindDirection() {
            return nightWindDirection;
        }

        public String getNightWindLevel() {
            return nightWindLevel;
        }

        public String getTime() {
            return time;
        }

        public String getWholeTemp() {
            return wholeTemp;
        }

        public String getWholeWea() {
            return wholeWea;
        }

        public String getWholeWindDirection() {
            return wholeWindDirection;
        }


        @Override
        public String toString() {
            return "Days7Entity{" +
                    "dayImg='" + dayImg + '\'' +
                    ", dayTemp='" + dayTemp + '\'' +
                    ", dayWea='" + dayWea + '\'' +
                    ", dayWeaShort='" + dayWeaShort + '\'' +
                    ", dayWindDirection='" + dayWindDirection + '\'' +
                    ", dayWindLevel='" + dayWindLevel + '\'' +
                    ", nightImg='" + nightImg + '\'' +
                    ", nightTemp='" + nightTemp + '\'' +
                    ", nightWea='" + nightWea + '\'' +
                    ", nightWeaShort='" + nightWeaShort + '\'' +
                    ", nightWindDirection='" + nightWindDirection + '\'' +
                    ", nightWindLevel='" + nightWindLevel + '\'' +
                    ", time='" + time + '\'' +
                    ", wholeTemp='" + wholeTemp + '\'' +
                    ", wholeWea='" + wholeWea + '\'' +
                    ", wholeWindDirection='" + wholeWindDirection + '\'' +
                    '}';
        }
    }

    public static class Days8Entity {
        /**
         * dayImg : 28
         * dayTemp : 25
         * dayWea : 多云
         * dayWeaShort : 多云
         * nightImg : 28
         * nightTemp : 18
         * nightWea : 多云
         * nightWeaShort : 多云
         * time : 1476720000
         */

        private String dayImg;
        private String dayTemp;
        private String dayWea;
        private String dayWeaShort;
        private String nightImg;
        private String nightTemp;
        private String nightWea;
        private String nightWeaShort;
        private String time;

        public void setDayImg(String dayImg) {
            this.dayImg = dayImg;
        }

        public void setDayTemp(String dayTemp) {
            this.dayTemp = dayTemp;
        }

        public void setDayWea(String dayWea) {
            this.dayWea = dayWea;
        }

        public void setDayWeaShort(String dayWeaShort) {
            this.dayWeaShort = dayWeaShort;
        }

        public void setNightImg(String nightImg) {
            this.nightImg = nightImg;
        }

        public void setNightTemp(String nightTemp) {
            this.nightTemp = nightTemp;
        }

        public void setNightWea(String nightWea) {
            this.nightWea = nightWea;
        }

        public void setNightWeaShort(String nightWeaShort) {
            this.nightWeaShort = nightWeaShort;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDayImg() {
            return dayImg;
        }

        public String getDayTemp() {
            return dayTemp;
        }

        public String getDayWea() {
            return dayWea;
        }

        public String getDayWeaShort() {
            return dayWeaShort;
        }

        public String getNightImg() {
            return nightImg;
        }

        public String getNightTemp() {
            return nightTemp;
        }

        public String getNightWea() {
            return nightWea;
        }

        public String getNightWeaShort() {
            return nightWeaShort;
        }

        public String getTime() {
            return time;
        }


        @Override
        public String toString() {
            return "Days8Entity{" +
                    "dayImg='" + dayImg + '\'' +
                    ", dayTemp='" + dayTemp + '\'' +
                    ", dayWea='" + dayWea + '\'' +
                    ", dayWeaShort='" + dayWeaShort + '\'' +
                    ", nightImg='" + nightImg + '\'' +
                    ", nightTemp='" + nightTemp + '\'' +
                    ", nightWea='" + nightWea + '\'' +
                    ", nightWeaShort='" + nightWeaShort + '\'' +
                    ", time='" + time + '\'' +
                    '}';
        }
    }

    public static class HourDataEntity {
        /**
         * aqi : 10
         * day : 1476115200
         * hour : 00
         * icon : 28
         * temp : 19
         * tq : 多云
         */

        private String aqi;
        private String day;
        private String hour;
        private String icon;
        private String temp;
        private String tq;

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public void setHour(String hour) {
            this.hour = hour;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public void setTq(String tq) {
            this.tq = tq;
        }

        public String getAqi() {
            return aqi;
        }

        public String getDay() {
            return day;
        }

        public String getHour() {
            return hour;
        }

        public String getIcon() {
            return icon;
        }

        public String getTemp() {
            return temp;
        }

        public String getTq() {
            return tq;
        }


        @Override
        public String toString() {
            return "HourDataEntity{" +
                    "aqi='" + aqi + '\'' +
                    ", day='" + day + '\'' +
                    ", hour='" + hour + '\'' +
                    ", icon='" + icon + '\'' +
                    ", temp='" + temp + '\'' +
                    ", tq='" + tq + '\'' +
                    '}';
        }
    }

    public static class ZsEntity {
        /**
         * detail : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
         * level : 天气舒适
         * levelColor : comfortable
         * name : 穿衣指数
         * text : 建议长袖牛仔裤
         */

        private String detail;
        private String level;
        private String levelColor;
        private String name;
        private String text;

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setLevelColor(String levelColor) {
            this.levelColor = levelColor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDetail() {
            return detail;
        }

        public String getLevel() {
            return level;
        }

        public String getLevelColor() {
            return levelColor;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }
    }

    public static class Zs72hoursEntity {
        /**
         * detail : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
         * level : 天气较舒适
         * levelColor : comfortable
         * name : 穿衣指数
         * text : 建议穿薄型套装
         */

        private String detail;
        private String level;
        private String levelColor;
        private String name;
        private String text;

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setLevelColor(String levelColor) {
            this.levelColor = levelColor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDetail() {
            return detail;
        }

        public String getLevel() {
            return level;
        }

        public String getLevelColor() {
            return levelColor;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "Zs72hoursEntity{" +
                    "detail='" + detail + '\'' +
                    ", level='" + level + '\'' +
                    ", levelColor='" + levelColor + '\'' +
                    ", name='" + name + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static class ZsOtherEntity {
        /**
         * detail : 天气条件易诱发过敏，易过敏人群应减少外出，外出宜穿长衣长裤并佩戴好眼镜和口罩，外出归来时及时清洁手和口鼻。
         * level : 易过敏
         * levelColor : red
         * name : 过敏指数
         * text : 请尽量减少外出。
         */

        private String detail;
        private String level;
        private String levelColor;
        private String name;
        private String text;

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setLevelColor(String levelColor) {
            this.levelColor = levelColor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDetail() {
            return detail;
        }

        public String getLevel() {
            return level;
        }

        public String getLevelColor() {
            return levelColor;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }


        @Override
        public String toString() {
            return "ZsOtherEntity{" +
                    "detail='" + detail + '\'' +
                    ", level='" + level + '\'' +
                    ", levelColor='" + levelColor + '\'' +
                    ", name='" + name + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static class ZsOtherTomorrowEntity {
        /**
         * detail : 天气条件易诱发过敏，易过敏人群应减少外出，外出宜穿长衣长裤并佩戴好眼镜和口罩，外出归来时及时清洁手和口鼻。
         * level : 易过敏
         * levelColor : red
         * name : 过敏指数
         * text : 请尽量减少外出。
         */

        private String detail;
        private String level;
        private String levelColor;
        private String name;
        private String text;

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setLevelColor(String levelColor) {
            this.levelColor = levelColor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDetail() {
            return detail;
        }

        public String getLevel() {
            return level;
        }

        public String getLevelColor() {
            return levelColor;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "ZsOtherTomorrowEntity{" +
                    "detail='" + detail + '\'' +
                    ", level='" + level + '\'' +
                    ", levelColor='" + levelColor + '\'' +
                    ", name='" + name + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public static class ZsTomorrowEntity {
        /**
         * detail : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
         * level : 天气舒适
         * levelColor : comfortable
         * name : 穿衣指数
         * text : 建议长袖牛仔裤
         */

        private String detail;
        private String level;
        private String levelColor;
        private String name;
        private String text;

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setLevelColor(String levelColor) {
            this.levelColor = levelColor;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDetail() {
            return detail;
        }

        public String getLevel() {
            return level;
        }

        public String getLevelColor() {
            return levelColor;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "ZsTomorrowEntity{" +
                    "detail='" + detail + '\'' +
                    ", level='" + level + '\'' +
                    ", levelColor='" + levelColor + '\'' +
                    ", name='" + name + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeEntity{" +
                "aqi=" + aqi +
                ", aqi_tomorrow=" + aqi_tomorrow +
                ", cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pollutants='" + pollutants + '\'' +
                ", sk=" + sk +
                ", sk_weather=" + sk_weather +
                ", sunrise=" + sunrise +
                ", video=" + video +
                ", yesterday=" + yesterday +
                ", aqi_5days=" + aqi_5days +
                ", aqi_hour=" + aqi_hour +
                ", days7=" + days7 +
                ", days8=" + days8 +
                ", hourData=" + hourData +
                ", zs=" + zs +
                ", zs_72hours=" + zs_72hours +
                ", zs_other=" + zs_other +
                ", zs_other_tomorrow=" + zs_other_tomorrow +
                ", zs_tomorrow=" + zs_tomorrow +
                '}';
    }
}
