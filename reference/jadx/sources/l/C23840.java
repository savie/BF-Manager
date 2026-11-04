package l;

/* JADX INFO: renamed from: l.᩹᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5BJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23840 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16380 m53165(int i) {
        return new C16380(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17126 m53166(C4448 c4448, AbstractC8922 abstractC8922, String str) {
        return new C17126(EnumC22260.ADD, c4448, abstractC8922, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17126 m53169(C4448 c4448, AbstractC8922 abstractC8922, String str) {
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
                return new C17126(EnumC22260.DDIV, c4448, abstractC8922, str);
            case 1:
                return new C17126(EnumC22260.FDIV, c4448, abstractC8922, str);
            case 2:
                return new C17126(EnumC22260.IDIV, c4448, abstractC8922, str);
            case 3:
                return new C17126(EnumC22260.LDIV, c4448, abstractC8922, str);
            default:
                throw new RuntimeException("type must set to one of I/J/F/D");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6686 m53164(AbstractC11071[] abstractC11071Arr, String[] strArr, String str) {
        return new C6686(EnumC22260.INVOKE_NEW, abstractC11071Arr, str, "<init>", strArr, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17126 m53167(C4448 c4448, AbstractC8922 abstractC8922, String str) {
        return new C17126(EnumC22260.MUL, c4448, abstractC8922, str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C17126 m53170(C4448 c4448, AbstractC8922 abstractC8922, String str) {
        return new C17126(EnumC22260.REM, c4448, abstractC8922, str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C17126 m53168(C4448 c4448, AbstractC8922 abstractC8922, String str) {
        return new C17126(EnumC22260.SUB, abstractC8922, c4448, str);
    }
}
