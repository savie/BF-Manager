package l;

/* JADX INFO: renamed from: l.᩶᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26NV */
/* JADX INFO: loaded from: classes.dex */
public final class C21627 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22528 f69050;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14913 f69051;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3727 f69052;

    public C21627(C14913 c14913, C3727 c3727, C22528 c22528) {
        if (c14913.m35882() != c3727.m12137() || c14913.m35884() != c3727.m12135() || c22528.m50762() != c14913.m35884()) {
            throw new IllegalArgumentException("Window reuse metadata identity differs");
        }
        this.f69051 = c14913;
        this.f69052 = c3727;
        this.f69050 = c22528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21627 m49142(C22528 c22528) {
        int iM50762 = c22528.m50762();
        C22528 c22528M50757 = this.f69050;
        if (iM50762 != c22528M50757.m50767()) {
            throw new IllegalArgumentException("Window reuse edit chain differs");
        }
        int iM50761 = c22528.m50761();
        while (true) {
            iM50761--;
            if (iM50761 >= 0) {
                c22528M50757 = c22528M50757.m50757(new C10593(c22528.m50763(iM50761), c22528.m50768(iM50761), c22528.m50765(iM50761) - c22528.m50759(iM50761)));
            } else {
                return new C21627(this.f69051, this.f69052, c22528M50757);
            }
        }
    }
}
