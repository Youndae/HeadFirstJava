package DotCom;

import java.util.ArrayList;

/**
 * 7 X 7 그리드가 있고 컴퓨터는 그 그리드 안에 랜덤적으로 상하좌우로만 3칸씩을 세개 설정한다.
 * 사용자는 일정 셀을 입력하여 설정된 셀을 찾아야 한다.
 * 입력했을 때 해당 셀에 지정된 것이 있으면 hit 없으면 miss가 출력된다.
 * 총 세칸을 모두 맞추게 되면 You Sunk 000.com 이라는 메시지가 출력된다.
 * 최대한 적은 횟수만으로 찾아야 하고 세개를 다 찾으면 등급이 출력된다.
 * <p>
 * 순서는
 * 1. 사용자가 게임을 시작시키면 닷컴 세개를 만들고 가상 그리드에 배치한다.
 * 2. 게임이 시작되고 닷컴이 남지 않게 될 때까지 입력프롬프트를 띄우고 입력한 위치를 확인하여 맞는 결과값을 출력한다.
 * 3. 게임을 끝내며 사용자의 등급을 매긴다.
 */

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String status = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                status = "kill";
                System.out.println("Ouch! You sunk "+name+"  : (");
            }else{
                status = "hit";
            }
        }
        return status;
    }
}
