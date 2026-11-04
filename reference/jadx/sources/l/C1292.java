package l;

/* JADX INFO: renamed from: l.֨ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4612;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1270 f4613;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f4614;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20661 f4615;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4616;

    public C1292(InterfaceC19106 interfaceC19106, C20661 c20661, C1270 c1270) {
        this.f4614 = interfaceC19106;
        this.f4615 = c20661;
        this.f4613 = c1270;
        this.f4612 = interfaceC19106.mo15344();
        int length = interfaceC19106.length();
        this.f4616 = length;
        if (c1270.m4628() != length) {
            throw new IllegalArgumentException("Line background store length differs from text");
        }
    }
}
