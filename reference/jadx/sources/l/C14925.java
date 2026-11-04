package l;

/* JADX INFO: renamed from: l.ܰ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14925 implements InterfaceC5386 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f48752;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f48753;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f48754;

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9792(String str, String str2, String str3) {
        return false;
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9793(String str, String str2, String str3) {
        return false;
    }

    public C14925(String str, String str2, boolean z) {
        this.f48754 = str;
        this.f48753 = str2;
        this.f48752 = z;
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9791(String str, String str2) {
        return this.f48752 && this.f48754.equals(str) && this.f48753.equals(str2);
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12843 mo9789(String str, String str2, String str3, String str4) {
        return EnumC12843.NONE;
    }
}
