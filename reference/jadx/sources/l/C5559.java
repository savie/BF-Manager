package l;

/* JADX INFO: renamed from: l.ۚۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5559 extends Exception {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19302;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f19303;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15648 f19304;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5559(int i, int i2, int i3, int i4, int i5, C15648 c15648, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM5126 = C1402.m5126("AudioTrack init failed ", i, " Config(", ", ", i2);
        sbM5126.append(i3);
        sbM5126.append(", ");
        sbM5126.append(i4);
        sbM5126.append(", ");
        sbM5126.append(i5);
        sbM5126.append(") ");
        sbM5126.append(c15648);
        sbM5126.append(z ? " (recoverable)" : "");
        super(sbM5126.toString(), runtimeException);
        this.f19302 = i;
        this.f19303 = z;
        this.f19304 = c15648;
    }
}
