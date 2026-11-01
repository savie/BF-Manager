package l;

/* JADX INFO: renamed from: l.ܳۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14445 extends AbstractC11435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21312 f47383;

    public C14445(C21312 c21312) {
        this.f47383 = c21312;
    }

    @Override // l.AbstractC11435
    public final void onPageSelected(int i) {
        C21312 c21312 = this.f47383;
        if (c21312.f69354 != i) {
            c21312.f69354 = i;
            c21312.f69351.m3462();
        }
    }

    @Override // l.AbstractC11435
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f47383.m47795();
        }
    }
}
