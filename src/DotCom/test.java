package DotCom;


import java.util.Calendar;

public class test {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);//시각을 2004년 1월 7일 15시 40분으로 설정한다.
                                                                   //1월이 0부터 시작이기 때문에 0으로 작성한다.
        long day1 = c.getTimeInMillis();                           //1970년 1월 1일부터 경과한 시간을 밀리초 단위로 표현한 값을 리턴한다.
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);                                   //한시간에 해당하는 밀리초만큼의 시간을 더하고 시각을 갱신한다.
        System.out.println("new hour "+c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);                                  //35일을 더한다. 그럼 2월로 넘어가게 된다.
        System.out.println("add 35 days "+c.getTime());
        c.roll(c.DATE, 35);                                 //35일 뒤로 넘긴다. 하지만 달은 바뀌지 않는다.
        System.out.println("roll 35 days "+c.getTime());
        c.set(c.DATE, 1);                                           //날짜를 더하는게 아닌 날짜를 1로 설정한다.
        System.out.println("set to 1 "+c.getTime());
    }


}






