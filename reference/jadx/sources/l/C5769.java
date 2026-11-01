package l;

/* JADX INFO: renamed from: l.ۛۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5769 extends C11288 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14942 f19587;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20150 f19588;

    public C5769(C20150 c20150, C14942 c14942) {
        super(c20150.m45571());
        this.f19588 = c20150;
        this.f19587 = c14942;
    }

    @Override // l.C11288
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5062 mo15892() {
        return this.f19588.m45574();
    }

    @Override // l.C11288
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15891(String str) {
        return this.f19588.m45569(str);
    }

    @Override // l.C11288
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15890(int i, String str) {
        Integer numM23861 = C9298.m23861(str);
        if (numM23861 != null) {
            return numM23861.intValue();
        }
        if (!this.f19587.f48724 || str.startsWith("android:")) {
            return this.f19588.m45568(i, str);
        }
        return -1;
    }
}
