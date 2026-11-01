package l;

/* JADX INFO: renamed from: l.֫ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1743 extends AbstractC11435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21312 f6870;

    public C1743(C21312 c21312) {
        this.f6870 = c21312;
    }

    @Override // l.AbstractC11435
    public final void onPageSelected(int i) {
        C21312 c21312 = this.f6870;
        c21312.clearFocus();
        if (c21312.hasFocus()) {
            c21312.f69345.requestFocus(2);
        }
    }
}
