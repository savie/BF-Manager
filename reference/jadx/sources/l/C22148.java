package l;

/* JADX INFO: renamed from: l.᩹۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes.dex */
public final class C22148 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49137(AbstractC3262 abstractC3262, EnumC3180 enumC3180, EnumC5214 enumC5214) {
        switch (C10943.f37212[enumC3180.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC3262.mo6020());
            case 2:
                return Float.valueOf(abstractC3262.mo6052());
            case 3:
                return Long.valueOf(abstractC3262.mo6049());
            case 4:
                return Long.valueOf(abstractC3262.mo6047());
            case 5:
                return Integer.valueOf(abstractC3262.mo6040());
            case 6:
                return Long.valueOf(abstractC3262.mo6029());
            case 7:
                return Integer.valueOf(abstractC3262.mo6023());
            case 8:
                return Boolean.valueOf(abstractC3262.mo6028());
            case 9:
                return abstractC3262.mo6050();
            case 10:
                return Integer.valueOf(abstractC3262.mo6041());
            case 11:
                return Integer.valueOf(abstractC3262.mo6045());
            case 12:
                return Long.valueOf(abstractC3262.mo6031());
            case 13:
                return Integer.valueOf(abstractC3262.mo6046());
            case 14:
                return Long.valueOf(abstractC3262.mo6032());
            case 15:
                return enumC5214.mo7264(abstractC3262);
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
