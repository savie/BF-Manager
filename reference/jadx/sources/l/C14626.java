package l;

/* JADX INFO: renamed from: l.ܰ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14626 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m35265(AbstractC3660 abstractC3660, EnumC3440 enumC3440, EnumC4186 enumC4186) {
        switch (C25070.f81090[enumC3440.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC3660.mo11888());
            case 2:
                return Float.valueOf(abstractC3660.mo11903());
            case 3:
                return Long.valueOf(abstractC3660.mo11893());
            case 4:
                return Long.valueOf(abstractC3660.mo11896());
            case 5:
                return Integer.valueOf(abstractC3660.mo11892());
            case 6:
                return Long.valueOf(abstractC3660.mo11886());
            case 7:
                return Integer.valueOf(abstractC3660.mo11874());
            case 8:
                return Boolean.valueOf(abstractC3660.mo11894());
            case 9:
                return abstractC3660.mo11890();
            case 10:
                return Integer.valueOf(abstractC3660.mo11889());
            case 11:
                return Integer.valueOf(abstractC3660.mo11901());
            case 12:
                return Long.valueOf(abstractC3660.mo11875());
            case 13:
                return Integer.valueOf(abstractC3660.mo11895());
            case 14:
                return Long.valueOf(abstractC3660.mo11887());
            case 15:
                return enumC4186.mo13369(abstractC3660);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
