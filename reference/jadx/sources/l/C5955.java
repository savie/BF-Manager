package l;

/* JADX INFO: renamed from: l.ۚ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5955 extends C2863 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19159 f20388;

    public C5955(InterfaceC7206 interfaceC7206, C19159 c19159) {
        super(interfaceC7206);
        this.f20388 = c19159;
    }

    @Override // l.C2863
    /* JADX INFO: renamed from: ᩷ */
    public final String mo9456(int i, int i2) {
        int i3 = (i2 >>> 24) & 255;
        if (this.f20388.f61991 && i3 != 1) {
            return C16395.m38944(i2);
        }
        String strMo9456 = super.mo9456(i, i2);
        return C16395.m38950(strMo9456) ? C16395.m38944(i2) : strMo9456;
    }
}
