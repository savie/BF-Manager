package l;

/* JADX INFO: renamed from: l.ܺᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16121 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7654 m38159(EnumC13901 enumC13901) {
        int i = C19649.f63101[enumC13901.ordinal()];
        if (i == 1) {
            return EnumC7654.METHOD;
        }
        if (i == 2) {
            return EnumC7654.CONSTRUCTOR;
        }
        throw new AssertionError("Unexpected mode: " + enumC13901);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7654 m38160(AbstractC23903 abstractC23903) {
        switch (C19649.f63102[abstractC23903.mo17325().ordinal()]) {
            case 1:
                return EnumC7654.PACKAGE;
            case 2:
                return EnumC7654.ENUM;
            case 3:
            case 4:
                return EnumC7654.CLASS;
            case 5:
                return EnumC7654.RECORD;
            case 6:
                return EnumC7654.INTERFACE;
            case 7:
                return EnumC7654.TYPEVAR;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return EnumC7654.VAR;
            case 14:
                return (abstractC23903.f77447 & 2305843009213693952L) != 0 ? EnumC7654.RECORD_COMPONENT : EnumC7654.VAR;
            case 15:
                return EnumC7654.CONSTRUCTOR;
            case 16:
                return EnumC7654.METHOD;
            case 17:
                return EnumC7654.STATIC_INIT;
            case 18:
                return EnumC7654.INSTANCE_INIT;
            default:
                throw new AssertionError("Unexpected kind: " + abstractC23903.mo17325());
        }
    }
}
