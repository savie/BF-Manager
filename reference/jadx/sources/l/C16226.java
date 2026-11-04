package l;

/* JADX INFO: renamed from: l.ܶܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16226 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11751 m38525(C11707 c11707) throws C2013 {
        int iM56017 = c11707.m56017();
        EnumC2057 enumC2057 = (EnumC2057) C10961.m27793(iM56017, EnumC2057.class, null);
        if (enumC2057 == null) {
            throw new IllegalStateException(C13645.m33382(iM56017, "Encountered unknown AvId: "));
        }
        switch (C17718.f58225[enumC2057.ordinal()]) {
            case 1:
                C16972 c16972 = new C16972();
                c11707.m56017();
                return c16972;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C20702 c20702 = new C20702(enumC2057);
                c20702.f37994 = c11707.m56003(c11707.m56017() / 2, C22150.f71350);
                return c20702;
            case 8:
                C23686 c23686 = new C23686();
                c11707.m56017();
                c23686.f37994 = Long.valueOf(c11707.m56012());
                return c23686;
            case 9:
                C12497 c12497 = new C12497();
                c11707.m56017();
                c12497.f37994 = C3089.m10063(c11707);
                return c12497;
            case 10:
                C3548 c3548 = new C3548(EnumC2057.MsvAvSingleHost);
                c3548.m11568(c11707);
                return c3548;
            case 11:
                C25178 c25178 = new C25178(EnumC2057.MsvAvChannelBindings);
                int iM56018 = c11707.m56017();
                byte[] bArr = new byte[iM56018];
                c11707.m56024(iM56018, bArr);
                c25178.f37994 = bArr;
                return c25178;
            default:
                throw new IllegalStateException("Encountered unhandled AvId: " + enumC2057);
        }
    }
}
