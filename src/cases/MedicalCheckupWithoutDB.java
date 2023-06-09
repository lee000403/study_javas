package cases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MedicalCheckupWithoutDB {
    public ArrayList ListMedic() {
        ArrayList <HashMap>medical_List = new ArrayList<HashMap>();
        HashMap <String, Object>member_info = new HashMap<String, Object>();
        member_info.put("이름", "홍길동");
        member_info.put("성별", "남");
        member_info.put("나이", 30);
        member_info.put("키 (cm), 체중 (kg)", "175, 75");
        member_info.put("혈압 (mmHg), 혈당 (mg/dL)", "120/80, 90");
        member_info.put("검진 결과", "비정상");
        member_info.put("재검진 항목", "폐암, 갑상선 질환");
        member_info.put("유지 방안", null);
        medical_List.add(member_info);

        member_info = new HashMap<String, Object>();
        member_info.put("이름", "김영희");
        member_info.put("성별", "여");
        member_info.put("나이", 25);
        member_info.put("키 (cm), 체중 (kg)", "160, 55");
        member_info.put("혈압 (mmHg), 혈당 (mg/dL)", "110/70, 85");
        member_info.put("검진 결과", "비정상");
        member_info.put("재검진 항목", "간암, 뇌졸중");
        member_info.put("유지 방안", null);
        medical_List.add(member_info);

        member_info = new HashMap<String, Object>();
        member_info.put("이름", "박철수");
        member_info.put("성별", "남");
        member_info.put("나이", 45);
        member_info.put("키 (cm), 체중 (kg)", "180, 85");
        member_info.put("혈압 (mmHg), 혈당 (mg/dL)", "130/85, 100");
        member_info.put("검진 결과", "정상");
        member_info.put("재검진 항목", "심장질환");
        member_info.put("유지 방안", "식습관 개선, 운동 계획");
        medical_List.add(member_info);

        member_info = new HashMap<String, Object>();
        member_info.put("이름", "이지은");
        member_info.put("성별", "여");
        member_info.put("나이", 35);
        member_info.put("키 (cm), 체중 (kg)", "165, 60");
        member_info.put("혈압 (mmHg), 혈당 (mg/dL)", "115/75, 95");
        member_info.put("검진 결과", "비정상");
        member_info.put("재검진 항목", "간암, 알츠하이머병");
        member_info.put("유지 방안", null);
        medical_List.add(member_info);

        member_info = new HashMap<String, Object>();
        member_info.put("이름", "최민호");
        member_info.put("성별", "남");
        member_info.put("나이", 28);
        member_info.put("키 (cm), 체중 (kg)", "170, 70");
        member_info.put("혈압 (mmHg), 혈당 (mg/dL)", "125/80, 92");
        member_info.put("검진 결과", "정상");
        member_info.put("재검진 항목", "간암");
        member_info.put("유지 방안", null);
        medical_List.add(member_info);

        for (HashMap member_medic : medical_List) {
            System.out.println(member_medic.get("이름") + " " + member_medic.get("성별") + " " + member_medic.get("나이") + " " + member_medic.get("키 (cm), 체중 (kg)") +
            " " + member_medic.get("혈압 (mmHg), 혈당 (mg/dL)") + " " + member_medic.get("검진 결과") + " " +  member_medic.get("재검진 항목") + " " +  member_medic.get("유지 방안"));
        }

        
        return medical_List;
    }
    public static void main(String[] args) {
        try {
            MedicalCheckupWithoutDB medicalCheckupWithoutDB = new MedicalCheckupWithoutDB();
            ArrayList medical_list = medicalCheckupWithoutDB.ListMedic();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;

    }
}
