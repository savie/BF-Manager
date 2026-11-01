package l;

/* JADX INFO: renamed from: l.ܳ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14222 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m34326(C5982 c5982) throws C17271 {
        int iM27375 = c5982.m27375();
        EnumC12105 enumC12105 = (EnumC12105) C20799.m46783(iM27375, EnumC12105.class, null);
        if (enumC12105 == null) {
            throw new IllegalStateException(C8479.m22141(iM27375, "Encountered unknown AvId: "));
        }
        switch (C23394.f75782[enumC12105.ordinal()]) {
            case 1:
                C10694 c10694 = new C10694();
                c5982.m27375();
                return c10694;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C2931 c2931 = new C2931(enumC12105);
                c2931.f54426 = c5982.m27379(c5982.m27375() / 2, C7393.f24570);
                return c2931;
            case 8:
                C1520 c1520 = new C1520();
                c5982.m27375();
                c1520.f54426 = Long.valueOf(c5982.m27394());
                return c1520;
            case 9:
                C4570 c4570 = new C4570();
                c5982.m27375();
                c4570.f54426 = C9407.m24150(c5982);
                return c4570;
            case 10:
                C9283 c9283 = new C9283(EnumC12105.MsvAvSingleHost);
                c9283.m23827(c5982);
                return c9283;
            case 11:
                C5754 c5754 = new C5754(EnumC12105.MsvAvChannelBindings);
                int iM27376 = c5982.m27375();
                byte[] bArr = new byte[iM27376];
                c5982.m27397(iM27376, bArr);
                c5754.f54426 = bArr;
                return c5754;
            default:
                throw new IllegalStateException("Encountered unhandled AvId: " + enumC12105);
        }
    }
}
