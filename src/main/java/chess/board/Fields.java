package chess.board;

public class Fields {
    private static Field[][] fields = initFields();

    private static Field[][] initFields() {
        Field[][] _fields = new Field[8][];
        for(int i=0; i<=7; i++) {
            _fields[i] = new Field[8];
        }

        for(int i=0; i<=7; i++) {
            for(int j=0; j<=7; j++) {
                _fields[i][j] = new Field();
                if(Math.abs(i -j)%2 == 1) {
                    _fields[i][j].setDisplayCharacter("\u2592");
                } else {
                    _fields[i][j].setDisplayCharacter("\u2591");
                }

            }
        }
        return _fields;
    }

    public static Field[][] getFields() {
        return  fields;
    }

    public static void setFields(Field[][] newFields) {
        fields = newFields;
    }
}
