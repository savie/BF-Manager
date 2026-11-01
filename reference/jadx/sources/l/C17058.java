package l;

/* JADX INFO: renamed from: l.ܿۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17058 extends C22577 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14942 f54466;

    public C17058(InterfaceC6432 interfaceC6432, C14942 c14942) {
        super(interfaceC6432);
        this.f54466 = c14942;
    }

    @Override // l.C22577
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo39837(int i, int i2) {
        int i3 = (i2 >>> 24) & 255;
        if (this.f54466.f48724 && i3 != 1) {
            return C9298.m23865(i2);
        }
        String strMo39837 = super.mo39837(i, i2);
        return C9298.m23843(strMo39837) ? C9298.m23865(i2) : strMo39837;
    }
}
