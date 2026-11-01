package l;

/* JADX INFO: renamed from: l.۬ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: IO5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12898 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31969(EnumC4430 enumC4430) {
        switch (C0902.f3629[enumC4430.ordinal()]) {
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
                throw new IllegalArgumentException("Unsupported data type: " + enumC4430);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31970(EnumC9288 enumC9288) {
        int i = C0902.f3628[enumC9288.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + enumC9288);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31971(int i) {
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
        throw new IllegalArgumentException(C8479.m22141(i, "Unsupported type class: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31972(int i, int i2) {
        String strM24440;
        String strM31971 = m31971(i);
        if (i2 == 16) {
            strM24440 = "SEQUENCE";
        } else if (i2 == 17) {
            strM24440 = "SET";
        } else if (i2 == 23) {
            strM24440 = "UTC TIME";
        } else if (i2 != 24) {
            switch (i2) {
                case 1:
                    strM24440 = "BOOLEAN";
                    break;
                case 2:
                    strM24440 = "INTEGER";
                    break;
                case 3:
                    strM24440 = "BIT STRING";
                    break;
                case 4:
                    strM24440 = "OCTET STRING";
                    break;
                case 5:
                    strM24440 = "NULL";
                    break;
                case 6:
                    strM24440 = "OBJECT IDENTIFIER";
                    break;
                default:
                    strM24440 = C9576.m24440(new StringBuilder("0x"), i2);
                    break;
            }
        } else {
            strM24440 = "GENERALIZED TIME";
        }
        return strM31971.isEmpty() ? strM24440 : C1679.m5594(strM31971, " ", strM24440);
    }
}
