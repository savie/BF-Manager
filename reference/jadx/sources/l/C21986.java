package l;

/* JADX INFO: renamed from: l.᩹ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes.dex */
public final class C21986 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f71308 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f71306 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f71307 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48810() {
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        boolean z = this.f71308;
        ?? r1 = z;
        if (this.f71306) {
            r1 = (z ? 1 : 0) | 2;
        }
        int i = r1;
        if (this.f71307) {
            i = (r1 == true ? 1 : 0) | 4;
        }
        interfaceC17314Edit.mo4064((byte) i, "edfa");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48809() {
        byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, "edfa");
        this.f71308 = (bMo16345 & 1) != 0;
        this.f71306 = (bMo16345 & 2) != 0;
        this.f71307 = (bMo16345 & 4) != 0;
    }
}
