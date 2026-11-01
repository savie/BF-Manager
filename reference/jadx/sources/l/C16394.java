package l;

/* JADX INFO: renamed from: l.ܽۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16394 implements InterfaceC22827 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f52754;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f52755;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f52756;

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8938(String str, String str2, String str3) {
        return false;
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo8939(String str, String str2, String str3) {
        return false;
    }

    public C16394(String str, String str2, boolean z) {
        this.f52756 = str;
        this.f52755 = str2;
        this.f52754 = z;
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8937(String str, String str2) {
        return this.f52754 && this.f52756.equals(str) && this.f52755.equals(str2);
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ */
    public final EnumC6598 mo8935(String str, String str2, String str3, String str4) {
        return EnumC6598.NONE;
    }
}
