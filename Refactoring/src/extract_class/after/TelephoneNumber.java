package extract_class.after;

// todo
// 기능을 명확히 분리한 클래스를 추출.
public class TelephoneNumber {

    private String _areaCode;
    private String _number;

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
}
