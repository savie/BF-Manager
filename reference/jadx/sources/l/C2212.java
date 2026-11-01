package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C2212 extends C18033 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8354 f7971;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Map f7972;

    public C2212() {
        throw null;
    }

    public C2212(InterfaceC15732 interfaceC15732, InterfaceC16967 interfaceC16967, C21200 c21200, Map map) {
        super(interfaceC15732, interfaceC16967, c21200);
        this.f7972 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6826(C8354 c8354) {
        this.f7971 = c8354;
        m41996();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // l.C18033
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7648 mo6827(C7648 c7648) {
        C8354 c8354;
        C8354 c8355 = this.f7971;
        if (c8355 == null) {
            c8355 = c7648.f25271;
        }
        if (c8355 != null && (c8354 = (C8354) this.f7972.get(c8355.f28971)) != null) {
            c8355 = c8354;
        }
        C0987 c0987 = c7648.f25258;
        if (c0987 == null) {
            c0987 = null;
        } else {
            int iM3789 = c0987.m3789();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM3789) {
                    i2 = -1;
                    break;
                }
                InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i2);
                if ((interfaceC22155M3793 instanceof C6847) && "com.apple.streaming.transportStreamTimestamp".equals(((C6847) interfaceC22155M3793).f23045)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (iM3789 == 1) {
                    c0987 = null;
                } else {
                    InterfaceC22155[] interfaceC22155Arr = new InterfaceC22155[iM3789 - 1];
                    while (i < iM3789) {
                        if (i != i2) {
                            interfaceC22155Arr[i < i2 ? i : i - 1] = c0987.m3793(i);
                        }
                        i++;
                    }
                    c0987 = new C0987(interfaceC22155Arr);
                }
            }
        }
        if (c8355 != c7648.f25271 || c0987 != c7648.f25258) {
            C10471 c10471M20201 = c7648.m20201();
            c10471M20201.m26506(c8355);
            c10471M20201.m26504(c0987);
            c7648 = c10471M20201.m26497();
        }
        return super.mo6827(c7648);
    }
}
