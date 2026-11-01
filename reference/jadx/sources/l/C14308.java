package l;

/* JADX INFO: renamed from: l.ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14308 extends C10336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1606 f46873;

    public C14308(RunnableC1606 runnableC1606) {
        this.f46873 = runnableC1606;
    }

    @Override // l.C10336, l.InterfaceC15616
    /* JADX INFO: renamed from: ۙ */
    public final void mo12847() {
        this.f46873.f6489.f31181.setVisibility(0);
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f46873.f6489;
        layoutInflaterFactory2C9161.f31181.setAlpha(1.0f);
        layoutInflaterFactory2C9161.f31169.m46326((InterfaceC15616) null);
        layoutInflaterFactory2C9161.f31169 = null;
    }
}
