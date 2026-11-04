package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2356 extends AbstractC21976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 f7601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18959 f7602;

    public C2356(AbstractC16481 abstractC16481, C6041 c6041) {
        EnumC24203 enumC24203 = EnumC24203.REGION_ARG;
        C18959 c18959 = new C18959(enumC24203, 0);
        this.f7602 = c18959;
        EnumC1763 enumC1763 = EnumC1763.DONT_INLINE;
        c18959.mo17866(enumC1763);
        c18959.m44031(c6041.mo17528());
        C18959 c189510 = new C18959(enumC24203, 1);
        this.f7601 = c189510;
        c189510.mo17866(enumC1763);
        c189510.mo44014(abstractC16481.mo17528());
        c18959.m44027().m17530().m41945().m28504();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7987(C6831 c6831) {
        ((ArrayList) c6831.m19036().m29618().mo1986()).add(this.f7601);
        ((ArrayList) c6831.m19032().mo1986()).add(0, this.f7602);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6041 m7988() {
        return this.f7602.m44027();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16481 m7986() {
        return this.f7601.mo44035(0);
    }
}
