package l;

/* JADX INFO: renamed from: l.ۤܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10925 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4960 m27727(EnumC16081 enumC16081) {
        int i = C8383.f27489[enumC16081.ordinal()];
        if (i == 1) {
            return EnumC4960.METHOD;
        }
        if (i == 2) {
            return EnumC4960.CONSTRUCTOR;
        }
        throw new AssertionError("Unexpected mode: " + enumC16081);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4960 m27726(AbstractC11781 abstractC11781) {
        switch (C8383.f27490[abstractC11781.mo9558().ordinal()]) {
            case 1:
                return EnumC4960.PACKAGE;
            case 2:
                return EnumC4960.ENUM;
            case 3:
            case 4:
                return EnumC4960.CLASS;
            case 5:
                return EnumC4960.RECORD;
            case 6:
                return EnumC4960.INTERFACE;
            case 7:
                return EnumC4960.TYPEVAR;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return EnumC4960.VAR;
            case 14:
                return (abstractC11781.f38071 & 2305843009213693952L) != 0 ? EnumC4960.RECORD_COMPONENT : EnumC4960.VAR;
            case 15:
                return EnumC4960.CONSTRUCTOR;
            case 16:
                return EnumC4960.METHOD;
            case 17:
                return EnumC4960.STATIC_INIT;
            case 18:
                return EnumC4960.INSTANCE_INIT;
            default:
                throw new AssertionError("Unexpected kind: " + abstractC11781.mo9558());
        }
    }
}
