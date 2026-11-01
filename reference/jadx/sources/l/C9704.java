package l;

/* JADX INFO: renamed from: l.ۢܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9704 implements InterfaceC15690 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2522 f32692;

    public C9704(C2522 c2522) {
        this.f32692 = c2522;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8011 mo7684(int i, int i2) {
        C2522 c2522 = this.f32692;
        C3352 c3352 = (C3352) c2522.f10021.get(i);
        if (c3352 != null) {
            return c3352;
        }
        if (c2522.f10020) {
            return new C7928();
        }
        C3352 c3353 = new C3352(c2522, c2522.f10009, i);
        c2522.f10021.put(i, c3353);
        return c3353;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7696() {
        this.f32692.f10020 = true;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final void mo7690(InterfaceC6599 interfaceC6599) {
        this.f32692.f10018 = interfaceC6599;
    }
}
