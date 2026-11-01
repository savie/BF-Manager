package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.۫᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H52L */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12643 {
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


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f42238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f42239;

    EnumC12643(String str, boolean z) {
        this.f42239 = str;
        this.f42238 = z;
    }

    EnumC12643(String str) {
        this.f42239 = str;
        this.f42238 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12643 m31422(String str) {
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
    public static EnumC12643 m31423(EnumC12643 enumC12643, EnumC12643 enumC12644) {
        if (enumC12643 != enumC12644) {
            EnumC12643 enumC12645 = UNKNOWN;
            if (enumC12643 == enumC12645) {
                return enumC12644;
            }
            if (enumC12644 != enumC12645) {
                if (!enumC12643.f42238) {
                    return enumC12644.f42238 ? enumC12644 : m31425(enumC12643, enumC12644);
                }
                if (!enumC12644.f42238) {
                    return enumC12643;
                }
                EnumC12643 enumC12646 = INT;
                if ((enumC12643 == enumC12646 && enumC12644 == BOOLEAN) || enumC12643 == BOOLEAN || enumC12644 == enumC12646) {
                    return enumC12646;
                }
                throw new RuntimeException("Can't merge " + enumC12643 + " and " + enumC12644);
            }
        }
        return enumC12643;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC12643 m31425(EnumC12643 enumC12643, EnumC12643 enumC12644) {
        EnumC12643 enumC12645 = JD;
        if (enumC12643 == enumC12645 || enumC12644 == enumC12645) {
            throw new RuntimeException("Can't merge " + enumC12643 + " and " + enumC12644);
        }
        switch (enumC12643.ordinal()) {
            case 8:
                switch (enumC12644.ordinal()) {
                    case 9:
                        return ZIL;
                    case 10:
                    case 11:
                        return ZI;
                    case 12:
                        return INT;
                    default:
                        return enumC12644;
                }
            case 9:
                return enumC12644;
            case 10:
                switch (enumC12644.ordinal()) {
                    case 8:
                    case 11:
                        return ZI;
                    case 9:
                        return ZIF;
                    case 10:
                    default:
                        if (enumC12644 == IF) {
                            return INT;
                        }
                        return ZI;
                    case 12:
                        return IF;
                }
            case 11:
                if (enumC12644 == IF) {
                    return INT;
                }
                return ZI;
            case 12:
                switch (enumC12644.ordinal()) {
                    case 8:
                    case 11:
                        return INT;
                    case 9:
                    case 10:
                        return IF;
                    default:
                        switch (enumC12644.ordinal()) {
                            case 8:
                            case 11:
                                return ZI;
                            case 9:
                                return ZIF;
                            case 10:
                            default:
                                if (enumC12644 == IF) {
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
        return this.f42239;
    }
}
