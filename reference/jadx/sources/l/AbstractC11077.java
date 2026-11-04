package l;

/* JADX INFO: renamed from: l.ۤᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: IO5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11077 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27993(EnumC9673 enumC9673) {
        switch (C22266.f71741[enumC9673.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + enumC9673);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27994(EnumC10419 enumC10419) {
        int i = C22266.f71740[enumC10419.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + enumC10419);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27995(int i) {
        if (i == 0) {
            return "UNIVERSAL";
        }
        if (i == 1) {
            return "APPLICATION";
        }
        if (i == 2) {
            return "";
        }
        if (i == 3) {
            return "PRIVATE";
        }
        throw new IllegalArgumentException(C13645.m33382(i, "Unsupported type class: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27996(int i, int i2) {
        String strM14766;
        String strM27995 = m27995(i);
        if (i2 == 16) {
            strM14766 = "SEQUENCE";
        } else if (i2 == 17) {
            strM14766 = "SET";
        } else if (i2 == 23) {
            strM14766 = "UTC TIME";
        } else if (i2 != 24) {
            switch (i2) {
                case 1:
                    strM14766 = "BOOLEAN";
                    break;
                case 2:
                    strM14766 = "INTEGER";
                    break;
                case 3:
                    strM14766 = "BIT STRING";
                    break;
                case 4:
                    strM14766 = "OCTET STRING";
                    break;
                case 5:
                    strM14766 = "NULL";
                    break;
                case 6:
                    strM14766 = "OBJECT IDENTIFIER";
                    break;
                default:
                    strM14766 = C4791.m14766(new StringBuilder("0x"), i2);
                    break;
            }
        } else {
            strM14766 = "GENERALIZED TIME";
        }
        return strM27995.isEmpty() ? strM14766 : C20196.m46451(strM27995, " ", strM14766);
    }
}
