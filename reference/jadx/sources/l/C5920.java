package l;

/* JADX INFO: renamed from: l.ۛ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X23D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5920 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC8743 f20176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19326 f20177;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20737 f20178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20032 f20179;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20180 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20032 m16180() {
        return this.f20179;
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(200, "<<\n mode: ");
        sbM40152.append(this.f20176);
        sbM40152.append("\n ecLevel: ");
        sbM40152.append(this.f20177);
        sbM40152.append("\n version: ");
        sbM40152.append(this.f20178);
        sbM40152.append("\n maskPattern: ");
        sbM40152.append(this.f20180);
        if (this.f20179 == null) {
            sbM40152.append("\n matrix: null\n");
        } else {
            sbM40152.append("\n matrix:\n");
            sbM40152.append(this.f20179);
        }
        sbM40152.append(">>\n");
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16182(EnumC8743 enumC8743) {
        this.f20176 = enumC8743;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16183(EnumC19326 enumC19326) {
        this.f20177 = enumC19326;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16185(C20737 c20737) {
        this.f20178 = c20737;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16181(int i) {
        this.f20180 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16184(C20032 c20032) {
        this.f20179 = c20032;
    }
}
