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
 * <p>
 * 여기는 간단한 버전으로 만든다.
 * 닷컴을 2차원 그리드가 아닌 한줄 위에 배치하고 닷컴의 개수도 하나로 제한한다.
 * <p>
 * 닷컴의 인덱스가 2,3,4 라고 하면
 * 입력을 2만 세번해도 kill이된다.
 * 이 에러를 여기서 해결.
 */


public class DotCom2 {

    private ArrayList<String> locationCells;

    //int[] locationCells;
    //int numOfHits = 0;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        //int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
        return result;
    }
}
