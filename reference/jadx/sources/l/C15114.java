package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15114 implements InterfaceC13380, InterfaceC5537 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5420 f49324;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12994 f49325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15617 f49326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f49327;

    public C15114(AbstractC5420 abstractC5420, Object obj) {
        this.f49324 = abstractC5420;
        this.f49326 = abstractC5420.m24734((C8402) null);
        this.f49325 = abstractC5420.m24720((C8402) null);
        this.f49327 = obj;
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7209(int i, C8402 c8402, C14368 c14368, C9893 c9893, int i2) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            c15617.getClass();
            c15617.m37362(new C23077(c15617, c14368, c9893M36386, i2));
        }
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7251(int i, C8402 c8402, C14368 c14368, C9893 c9893) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            c15617.getClass();
            c15617.m37362(new C11142(c15617, c14368, c9893M36386));
        }
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7208(int i, C8402 c8402, C14368 c14368, C9893 c9893) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            c15617.getClass();
            c15617.m37362(new C2570(c15617, c14368, c9893M36386));
        }
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7210(int i, C8402 c8402, C14368 c14368, C9893 c9893, IOException iOException, boolean z) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            c15617.getClass();
            c15617.m37362(new C22331(c15617, c14368, c9893M36386, iOException, z));
        }
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ۙ */
    public final void mo7207(int i, C8402 c8402, C9893 c9893) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            C8402 c8403 = c15617.f50743;
            c8403.getClass();
            c15617.m37362(new C5177(c15617, c8403, c9893M36386));
        }
    }

    @Override // l.InterfaceC13380
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7250(int i, C8402 c8402, C9893 c9893) {
        if (m36387(i, c8402)) {
            C15617 c15617 = this.f49326;
            C9893 c9893M36386 = m36386(c9893, c8402);
            c15617.getClass();
            c15617.m37362(new C21645(c15617, c9893M36386));
        }
    }

    @Override // l.InterfaceC5537
    /* JADX INFO: renamed from: ۙ */
    public final void mo7205(int i, C8402 c8402, int i2) {
        if (m36387(i, c8402)) {
            this.f49325.m32408(i2);
        }
    }

    @Override // l.InterfaceC5537
    /* JADX INFO: renamed from: ۙ */
    public final void mo7204(int i, C8402 c8402) {
        if (m36387(i, c8402)) {
            this.f49325.m32407();
        }
    }

    @Override // l.InterfaceC5537
    /* JADX INFO: renamed from: ۙ */
    public final void mo7206(int i, C8402 c8402, Exception exc) {
        if (m36387(i, c8402)) {
            this.f49325.m32410(exc);
        }
    }

    @Override // l.InterfaceC5537
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7249(int i, C8402 c8402) {
        if (m36387(i, c8402)) {
            this.f49325.m32413();
        }
    }

    @Override // l.InterfaceC5537
    /* JADX INFO: renamed from: ۤ */
    public final void mo7242(int i, C8402 c8402) {
        if (m36387(i, c8402)) {
            this.f49325.m32412();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m36387(int i, C8402 c8402) {
        C8402 c8402Mo16148;
        Object obj = this.f49327;
        AbstractC5420 abstractC5420 = this.f49324;
        if (c8402 != null) {
            c8402Mo16148 = abstractC5420.mo16148(obj, c8402);
            if (c8402Mo16148 == null) {
                return false;
            }
        } else {
            c8402Mo16148 = null;
        }
        int iMo16146 = abstractC5420.mo16146(i, obj);
        C15617 c15617 = this.f49326;
        if (c15617.f50742 != iMo16146 || !C17359.equals(c15617.f50743, c8402Mo16148)) {
            this.f49326 = abstractC5420.m24733(iMo16146, c8402Mo16148);
        }
        C12994 c12994 = this.f49325;
        if (c12994.f41644 == iMo16146 && C17359.equals(c12994.f41645, c8402Mo16148)) {
            return true;
        }
        this.f49325 = abstractC5420.m24719(iMo16146, c8402Mo16148);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9893 m36386(C9893 c9893, C8402 c8402) {
        long j = c9893.f31809;
        AbstractC5420 abstractC5420 = this.f49324;
        Object obj = this.f49327;
        long jMo16147 = abstractC5420.mo16147(j, obj);
        long j2 = c9893.f31813;
        long jMo16148 = abstractC5420.mo16147(j2, obj);
        return (jMo16147 == j && jMo16148 == j2) ? c9893 : new C9893(c9893.f31808, c9893.f31810, c9893.f31814, c9893.f31811, c9893.f31812, jMo16147, jMo16148);
    }
}
