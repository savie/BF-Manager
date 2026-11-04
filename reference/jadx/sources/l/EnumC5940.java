package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۚ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H52L */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5940 {
    BOOLEAN("Z", true),
    INT("I", true),
    FLOAT("F", true),
    DOUBLE("D", true),
    LONG("J", true),
    OBJECT("L", true),
    VOID("V", true),
    UNKNOWN("?"),
    ZIL(am.aB),
    ZIFL(am.aD),
    ZIF("m"),
    ZI("n"),
    IF(am.aC),
    JD("w");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20312;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f20313;

    EnumC5940(String str, boolean z) {
        this.f20313 = str;
        this.f20312 = z;
    }

    EnumC5940(String str) {
        this.f20313 = str;
        this.f20312 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5940 m17256(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return FLOAT;
        }
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return VOID;
                }
                if (cCharAt == 'i') {
                    return IF;
                }
                if (cCharAt == 's') {
                    return ZIL;
                }
                if (cCharAt == 'w') {
                    return JD;
                }
                if (cCharAt == 'z') {
                    return ZIFL;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        return LONG;
                    }
                    if (cCharAt == 'Z') {
                        return BOOLEAN;
                    }
                    if (cCharAt != '[') {
                        if (cCharAt == 'm') {
                            return ZIF;
                        }
                        if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    return DOUBLE;
                                default:
                                    return UNKNOWN;
                            }
                        } else {
                            return ZI;
                        }
                    }
                }
            }
            return INT;
        }
        return OBJECT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5940 m17257(EnumC5940 enumC5940, EnumC5940 enumC5941) {
        if (enumC5940 != enumC5941) {
            EnumC5940 enumC5942 = UNKNOWN;
            if (enumC5940 == enumC5942) {
                return enumC5941;
            }
            if (enumC5941 != enumC5942) {
                if (!enumC5940.f20312) {
                    return enumC5941.f20312 ? enumC5941 : m17259(enumC5940, enumC5941);
                }
                if (!enumC5941.f20312) {
                    return enumC5940;
                }
                EnumC5940 enumC5943 = INT;
                if ((enumC5940 == enumC5943 && enumC5941 == BOOLEAN) || enumC5940 == BOOLEAN || enumC5941 == enumC5943) {
                    return enumC5943;
                }
                throw new RuntimeException("Can't merge " + enumC5940 + " and " + enumC5941);
            }
        }
        return enumC5940;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x002f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    /* JADX WARN: Code duplicated, block: B:27:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x004d A[RETURN] */
    /* JADX WARN: Switch 'out' block B:25:0x0032 for B:10:0x0017 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC5940 m17259(EnumC5940 enumC5940, EnumC5940 enumC5941) {
        EnumC5940 enumC5942 = JD;
        if (enumC5940 == enumC5942 || enumC5941 == enumC5942) {
            throw new RuntimeException("Can't merge " + enumC5940 + " and " + enumC5941);
        }
        switch (enumC5940.ordinal()) {
            case 8:
                switch (enumC5941.ordinal()) {
                    case 9:
                        return ZIL;
                    case 10:
                    case 11:
                        return ZI;
                    case 12:
                        return INT;
                    default:
                        return enumC5941;
                }
            case 9:
                return enumC5941;
            case 10:
                switch (enumC5941.ordinal()) {
                    case 8:
                    case 11:
                        return ZI;
                    case 9:
                        return ZIF;
                    case 10:
                    default:
                        if (enumC5941 == IF) {
                            return INT;
                        }
                        return ZI;
                    case 12:
                        return IF;
                }
            case 11:
                if (enumC5941 == IF) {
                    return INT;
                }
                return ZI;
            case 12:
                switch (enumC5941.ordinal()) {
                    case 8:
                    case 11:
                        return INT;
                    case 9:
                    case 10:
                        return IF;
                    default:
                        switch (enumC5941.ordinal()) {
                            case 8:
                            case 11:
                                return ZI;
                            case 9:
                                return ZIF;
                            case 10:
                            default:
                                if (enumC5941 == IF) {
                                    return INT;
                                }
                                return ZI;
                            case 12:
                                return IF;
                        }
                }
            default:
                throw new RuntimeException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f20313;
    }
}
