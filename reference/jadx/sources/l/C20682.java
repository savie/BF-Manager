package l;

/* JADX INFO: renamed from: l.᩷ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20682 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f67270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f67271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7648 f67272;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20682(int i, int i2, int i3, int i4, int i5, C7648 c7648, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM2791 = C0589.m2791("AudioTrack init failed ", i, " Config(", ", ", i2);
        C23821.m52500(sbM2791, i3, ", ", i4, ", ");
        sbM2791.append(i5);
        sbM2791.append(") ");
        sbM2791.append(c7648);
        sbM2791.append(z ? " (recoverable)" : "");
        super(sbM2791.toString(), runtimeException);
        this.f67271 = i;
        this.f67270 = z;
        this.f67272 = c7648;
    }
}
