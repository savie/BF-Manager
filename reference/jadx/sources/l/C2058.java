package l;

/* JADX INFO: renamed from: l.֫᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W5BJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2058 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14760 m6556(int i) {
        return new C14760(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11232 m6554(C2184 c2184, AbstractC18413 abstractC18413, String str) {
        return new C11232(EnumC9947.ADD, c2184, abstractC18413, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11232 m6559(C2184 c2184, AbstractC18413 abstractC18413, String str) {
        byte b = -1;
        switch (str.hashCode()) {
            case 68:
                if (str.equals("D")) {
                    b = 0;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b = 1;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b = 2;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                return new C11232(EnumC9947.DDIV, c2184, abstractC18413, str);
            case 1:
                return new C11232(EnumC9947.FDIV, c2184, abstractC18413, str);
            case 2:
                return new C11232(EnumC9947.IDIV, c2184, abstractC18413, str);
            case 3:
                return new C11232(EnumC9947.LDIV, c2184, abstractC18413, str);
            default:
                throw new RuntimeException("type must set to one of I/J/F/D");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13475 m6555(AbstractC7124[] abstractC7124Arr, String[] strArr, String str) {
        return new C13475(EnumC9947.INVOKE_NEW, abstractC7124Arr, str, "<init>", strArr, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C11232 m6558(C2184 c2184, AbstractC18413 abstractC18413, String str) {
        return new C11232(EnumC9947.MUL, c2184, abstractC18413, str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C11232 m6553(C2184 c2184, AbstractC18413 abstractC18413, String str) {
        return new C11232(EnumC9947.REM, c2184, abstractC18413, str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C11232 m6557(C2184 c2184, AbstractC18413 abstractC18413, String str) {
        return new C11232(EnumC9947.SUB, abstractC18413, c2184, str);
    }
}
