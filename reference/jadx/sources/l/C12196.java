package l;

/* JADX INFO: renamed from: l.ۨۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12196 extends AbstractC21147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6976 f39205;

    public C12196(C6976 c6976) {
        this.f39205 = c6976;
    }

    @Override // l.AbstractC21147
    public final void onPageSelected(int i) {
        C6976 c6976 = this.f39205;
        c6976.clearFocus();
        if (c6976.hasFocus()) {
            c6976.f23017.requestFocus(2);
        }
    }
}
