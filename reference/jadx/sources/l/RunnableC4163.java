package l;

/* JADX INFO: renamed from: l.ۘ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4163 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC6986 f15207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15208;

    public RunnableC4163(ViewOnTouchListenerC6986 viewOnTouchListenerC6986, int i) {
        this.f15207 = viewOnTouchListenerC6986;
        this.f15208 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC6986 viewOnTouchListenerC6986 = this.f15207;
        if (this.f15208 == viewOnTouchListenerC6986.f23502) {
            viewOnTouchListenerC6986.f23500.performClick();
            viewOnTouchListenerC6986.f23500.postDelayed(this, 50L);
        }
    }
}
