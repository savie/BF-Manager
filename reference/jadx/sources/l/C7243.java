package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7243 implements InterfaceC20918, InterfaceC16262 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7512 f24133;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21200 f24134;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15711 f24135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f24136;

    public C7243(AbstractC15711 abstractC15711, Object obj) {
        this.f24135 = abstractC15711;
        this.f24133 = abstractC15711.m17767((C15274) null);
        this.f24134 = abstractC15711.m17755((C15274) null);
        this.f24136 = obj;
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ۙ */
    public final void mo2586(int i, C15274 c15274, C13863 c13863, C13157 c13157, int i2) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            c7512.getClass();
            c7512.m20014(new C8924(c7512, c13863, c13157M19356, i2));
        }
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ܰ */
    public final void mo2627(int i, C15274 c15274, C13863 c13863, C13157 c13157) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            c7512.getClass();
            c7512.m20014(new C19507(c7512, c13863, c13157M19356));
        }
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ۙ */
    public final void mo2585(int i, C15274 c15274, C13863 c13863, C13157 c13157) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            c7512.getClass();
            c7512.m20014(new C8218(c7512, c13863, c13157M19356));
        }
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ۙ */
    public final void mo2587(int i, C15274 c15274, C13863 c13863, C13157 c13157, IOException iOException, boolean z) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            c7512.getClass();
            c7512.m20014(new C18801(c7512, c13863, c13157M19356, iOException, z));
        }
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ۙ */
    public final void mo2584(int i, C15274 c15274, C13157 c13157) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            C15274 c15275 = c7512.f24997;
            c15275.getClass();
            c7512.m20014(new C1024(c7512, c15275, c13157M19356));
        }
    }

    @Override // l.InterfaceC20918
    /* JADX INFO: renamed from: ܰ */
    public final void mo2626(int i, C15274 c15274, C13157 c13157) {
        if (m19355(i, c15274)) {
            C7512 c7512 = this.f24133;
            C13157 c13157M19356 = m19356(c13157, c15274);
            c7512.getClass();
            c7512.m20014(new C17548(c7512, c13157M19356));
        }
    }

    @Override // l.InterfaceC16262
    /* JADX INFO: renamed from: ۙ */
    public final void mo2582(int i, C15274 c15274, int i2) {
        if (m19355(i, c15274)) {
            this.f24134.m47658(i2);
        }
    }

    @Override // l.InterfaceC16262
    /* JADX INFO: renamed from: ۙ */
    public final void mo2581(int i, C15274 c15274) {
        if (m19355(i, c15274)) {
            this.f24134.m47657();
        }
    }

    @Override // l.InterfaceC16262
    /* JADX INFO: renamed from: ۙ */
    public final void mo2583(int i, C15274 c15274, Exception exc) {
        if (m19355(i, c15274)) {
            this.f24134.m47660(exc);
        }
    }

    @Override // l.InterfaceC16262
    /* JADX INFO: renamed from: ܰ */
    public final void mo2625(int i, C15274 c15274) {
        if (m19355(i, c15274)) {
            this.f24134.m47663();
        }
    }

    @Override // l.InterfaceC16262
    /* JADX INFO: renamed from: ۨ */
    public final void mo2618(int i, C15274 c15274) {
        if (m19355(i, c15274)) {
            this.f24134.m47662();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m19355(int i, C15274 c15274) {
        C15274 c15274Mo5890;
        Object obj = this.f24136;
        AbstractC15711 abstractC15711 = this.f24135;
        if (c15274 != null) {
            c15274Mo5890 = abstractC15711.mo5890(obj, c15274);
            if (c15274Mo5890 == null) {
                return false;
            }
        } else {
            c15274Mo5890 = null;
        }
        int iMo5888 = abstractC15711.mo5888(i, obj);
        C7512 c7512 = this.f24133;
        if (c7512.f24996 != iMo5888 || !C13638.equals(c7512.f24997, c15274Mo5890)) {
            this.f24133 = abstractC15711.m17766(iMo5888, c15274Mo5890);
        }
        C21200 c21200 = this.f24134;
        if (c21200.f69000 == iMo5888 && C13638.equals(c21200.f69001, c15274Mo5890)) {
            return true;
        }
        this.f24134 = abstractC15711.m17754(iMo5888, c15274Mo5890);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13157 m19356(C13157 c13157, C15274 c15274) {
        long j = c13157.f43806;
        AbstractC15711 abstractC15711 = this.f24135;
        Object obj = this.f24136;
        long jMo5889 = abstractC15711.mo5889(j, obj);
        long j2 = c13157.f43807;
        long jMo58810 = abstractC15711.mo5889(j2, obj);
        return (jMo5889 == j && jMo58810 == j2) ? c13157 : new C13157(c13157.f43804, c13157.f43802, c13157.f43803, c13157.f43808, c13157.f43805, jMo5889, jMo58810);
    }
}
