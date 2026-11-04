package l;

/* JADX INFO: renamed from: l.ܰܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FIRW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14716 implements InterfaceC9415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48091;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f48092;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f48093;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48094;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f48095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48096;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f48097;

    public C14716(C12479 c12479, int i, int i2, int i3, int i4) {
        this(c12479.m30998(i2), i, c12479.m30997(i3), c12479.m30998(i4));
    }

    public C14716(String str, int i, String str2, String str3) {
        this.f48097 = i;
        this.f48092 = str;
        this.f48093 = str2;
        this.f48095 = str3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35405(int i) {
        this.f48096 = false;
        this.f48094 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35403(int i) {
        if (this.f48096) {
            return false;
        }
        this.f48096 = true;
        this.f48091 = i;
        return true;
    }

    @Override // l.InterfaceC9415
    /* JADX INFO: renamed from: ۤ */
    public final int mo24789() {
        return this.f48097;
    }

    @Override // l.InterfaceC9415
    public final String getName() {
        return this.f48092;
    }

    @Override // l.InterfaceC9415
    public final String getType() {
        return this.f48093;
    }

    @Override // l.InterfaceC9415
    public final String getSignature() {
        return this.f48095;
    }

    @Override // l.InterfaceC9415
    /* JADX INFO: renamed from: ᩷ */
    public final int mo24790() {
        return this.f48094;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35404() {
        this.f48094 = -1;
    }

    @Override // l.InterfaceC9415
    /* JADX INFO: renamed from: ۙ */
    public final int mo24788() {
        return this.f48091;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m35406() {
        return this.f48096;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f48094;
        sb.append(i == -1 ? "-1 " : String.format("0x%04x", Integer.valueOf(i)));
        sb.append('-');
        sb.append(this.f48096 ? String.format("0x%04x", Integer.valueOf(this.f48091)) : "      ");
        sb.append(": r");
        sb.append(this.f48097);
        sb.append(" '");
        sb.append(this.f48092);
        sb.append("' ");
        sb.append(this.f48093);
        String str = this.f48095;
        sb.append(str != null ? ", signature: ".concat(str) : "");
        return sb.toString();
    }
}
