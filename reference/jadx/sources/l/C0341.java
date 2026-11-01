package l;

/* JADX INFO: renamed from: l.֡ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes2.dex */
public final class C0341 implements InterfaceC2288 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f1749;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1752 f1750;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f1751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1752;

    public C0341(String str, String str2, int i, C1752 c1752) {
        this.f1749 = str;
        this.f1751 = str2;
        this.f1752 = i;
        this.f1750 = c1752;
    }

    @Override // l.InterfaceC2288
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11462 mo2001(int i) {
        return new C20098(i, this.f1749, this.f1751, this.f1752, this.f1750);
    }

    @Override // l.InterfaceC2288
    public final void cancel() {
        this.f1750.m5799();
    }
}
