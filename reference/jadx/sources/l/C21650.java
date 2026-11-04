package l;

/* JADX INFO: renamed from: l.᩶᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes.dex */
public final class C21650 implements InterfaceC9627 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69115;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f69116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f69117;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f69119;

    @Override // l.InterfaceC9627
    public final int getAttributes() {
        return 17;
    }

    @Override // l.InterfaceC9627
    public final long length() {
        return 0L;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۤ */
    public final int mo6139() {
        return 0;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۨ */
    public final long mo6140() {
        return 0L;
    }

    @Override // l.InterfaceC9627
    public final String getName() {
        return this.f69119;
    }

    @Override // l.InterfaceC9627
    public final int getType() {
        return (this.f69118 & Integer.MIN_VALUE) != 0 ? 2 : 4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo1[name=");
        sb.append(this.f69119);
        sb.append(",versionMajor=");
        sb.append(this.f69115);
        sb.append(",versionMinor=");
        sb.append(this.f69116);
        sb.append(",type=0x");
        C8008.m21876(this.f69118, 8, ",commentOrMasterBrowser=", sb);
        return new String(C8947.m23910(sb, this.f69117, "]"));
    }
}
