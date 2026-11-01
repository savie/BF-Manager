package l;

/* JADX INFO: renamed from: l.ۢᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9748 implements InterfaceC22180 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32797;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f32798;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f32799;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f32800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f32801;

    @Override // l.InterfaceC22180
    public final int getAttributes() {
        return 17;
    }

    @Override // l.InterfaceC22180
    public final long length() {
        return 0L;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long mo24727() {
        return 0L;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo24728() {
        return 0;
    }

    @Override // l.InterfaceC22180
    public final String getName() {
        return this.f32801;
    }

    @Override // l.InterfaceC22180
    public final int getType() {
        return (this.f32797 & Integer.MIN_VALUE) != 0 ? 2 : 4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo1[name=");
        sb.append(this.f32801);
        sb.append(",versionMajor=");
        sb.append(this.f32800);
        sb.append(",versionMinor=");
        sb.append(this.f32798);
        sb.append(",type=0x");
        C18855.m43491(this.f32797, 8, ",commentOrMasterBrowser=", sb);
        return new String(C22697.m50267(sb, this.f32799, "]"));
    }
}
