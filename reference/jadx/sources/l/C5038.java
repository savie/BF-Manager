package l;

/* JADX INFO: renamed from: l.ۙܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5038 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f17448 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17446 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f17447 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15262() {
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        boolean z = this.f17448;
        ?? r1 = z;
        if (this.f17446) {
            r1 = (z ? 1 : 0) | 2;
        }
        int i = r1;
        if (this.f17447) {
            i = (r1 == true ? 1 : 0) | 4;
        }
        interfaceC18752Edit.mo3485((byte) i, "edfa");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15261() {
        byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, "edfa");
        this.f17448 = (bMo7901 & 1) != 0;
        this.f17446 = (bMo7901 & 2) != 0;
        this.f17447 = (bMo7901 & 4) != 0;
    }
}
