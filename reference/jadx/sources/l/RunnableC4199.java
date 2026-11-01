package l;

/* JADX INFO: renamed from: l.ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4199 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f15259;

    public RunnableC4199(C7022 c7022) {
        this.f15259 = c7022;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7022 c7022 = this.f15259;
        C6129 c6129 = c7022.f23605;
        if (c6129 == null || !c6129.isAttachedToWindow() || c7022.f23605.getCount() <= c7022.f23605.getChildCount() || c7022.f23605.getChildCount() > c7022.f23600) {
            return;
        }
        c7022.f23602.setInputMethodMode(2);
        c7022.show();
    }
}
