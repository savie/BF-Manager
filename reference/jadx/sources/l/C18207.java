package l;

/* JADX INFO: renamed from: l.ܿ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18207 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC22000[] f59453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f59454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42355() {
        m42356(0, 0, 0, false);
        m42356(1, 0, 0, false);
        m42356(2, 0, 0, false);
    }

    public C18207(C24132 c24132) {
        this.f59454 = c24132;
        this.f59453 = new ViewTreeObserverOnPreDrawListenerC22000[]{new ViewTreeObserverOnPreDrawListenerC22000(c24132.getContext(), c24132, 0), new ViewTreeObserverOnPreDrawListenerC22000(c24132.getContext(), c24132, 1), new ViewTreeObserverOnPreDrawListenerC22000(c24132.getContext(), c24132, 2)};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42356(int i, int i2, int i3, boolean z) {
        this.f59453[i].m49731(i2, i3, z);
    }
}
