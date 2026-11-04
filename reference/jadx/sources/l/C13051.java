package l;

/* JADX INFO: renamed from: l.۫ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13051 implements InterfaceC4848 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41771;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1865 f41772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41773;

    public C13051(C1865 c1865) {
        this.f41772 = c1865;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32512() {
        if (this.f41773 == 2) {
            this.f41773 = 1;
        }
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14092() {
        return this.f41772.f6279;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final void mo14091() {
        C1865 c1865 = this.f41772;
        if (c1865.f6281) {
            return;
        }
        c1865.f6286.m5081(Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14090(C16461 c16461, C5690 c5690, int i) {
        m32511();
        C1865 c1865 = this.f41772;
        boolean z = c1865.f6279;
        if (z && c1865.f6285 == null) {
            this.f41773 = 2;
        }
        int i2 = this.f41773;
        if (i2 == 2) {
            c5690.m33309(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c16461.f53378 = c1865.f6283;
            this.f41773 = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c1865.f6285.getClass();
        c5690.m33309(1);
        c5690.f19652 = 0L;
        if ((i & 4) == 0) {
            c5690.m16711(c1865.f6280);
            c5690.f19651.put(c1865.f6285, 0, c1865.f6280);
        }
        if ((i & 1) == 0) {
            this.f41773 = 2;
        }
        return -4;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14089(long j) {
        m32511();
        if (j <= 0 || this.f41773 == 2) {
            return 0;
        }
        this.f41773 = 2;
        return 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m32511() {
        if (this.f41771) {
            return;
        }
        C1865 c1865 = this.f41772;
        C15617 c15617 = c1865.f6278;
        c15617.m37362(new C21645(c15617, new C9893(1, C9681.m25260(c1865.f6283.f50848), c1865.f6283, 0, null, C7116.m19506(0L), -9223372036854775807L)));
        this.f41771 = true;
    }
}
