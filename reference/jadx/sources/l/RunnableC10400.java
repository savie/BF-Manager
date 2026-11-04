package l;

/* JADX INFO: renamed from: l.ۢ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10400 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC1452 f33054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33055;

    public RunnableC10400(ViewOnTouchListenerC1452 viewOnTouchListenerC1452, int i) {
        this.f33054 = viewOnTouchListenerC1452;
        this.f33055 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC1452 viewOnTouchListenerC1452 = this.f33054;
        if (this.f33055 == viewOnTouchListenerC1452.f5081) {
            viewOnTouchListenerC1452.f5080.performClick();
            viewOnTouchListenerC1452.f5080.postDelayed(this, 50L);
        }
    }
}
