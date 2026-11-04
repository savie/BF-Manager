package l;

/* JADX INFO: renamed from: l.ᩳ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes5.dex */
public class C19348 implements InterfaceC8161 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC8161 f62522;

    public C19348(InterfaceC8161 interfaceC8161) {
        this.f62522 = interfaceC8161;
    }

    @Override // l.InterfaceC8161
    /* JADX INFO: renamed from: ֡ */
    public void mo1551() {
        this.f62521 = false;
        this.f62522.mo1551();
    }

    @Override // l.InterfaceC8161
    /* JADX INFO: renamed from: ۙ */
    public final void mo1553(boolean z, boolean z2) {
        this.f62521 = true;
        this.f62522.mo1553(z, z2);
    }

    @Override // l.InterfaceC8161
    /* JADX INFO: renamed from: ۙ */
    public final void mo1552(int i, int i2) {
        float f = i2;
        this.f62522.mo1552(i, (int) (this.f62521 ? (f * 0.3f) + 70.0f : f * 0.7f));
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f62522.mo924();
    }
}
