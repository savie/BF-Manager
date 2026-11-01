package l;

/* JADX INFO: renamed from: l.᩺ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4U4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22728 extends AbstractC14967 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18825 f74040;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74041;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74042 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17684 f74043;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f74044;

    public C22728(C17684 c17684, int i) {
        this.f74041 = -1;
        this.f74043 = c17684;
        C18825 c18825M42184 = c17684.m41166().m42184(i);
        this.f74040 = c18825M42184;
        int iM43449 = c18825M42184.m43449();
        this.f74044 = iM43449;
        if (this.f74042 >= iM43449) {
            this.f74041 = c18825M42184.m43447();
            c18825M42184.m43450();
        }
    }

    @Override // l.AbstractC14967
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC10975 mo17703() {
        int i = this.f74042;
        int i2 = this.f74044;
        if (i >= i2) {
            return null;
        }
        this.f74042 = i + 1;
        C17684 c17684 = this.f74043;
        C18825 c18825 = this.f74040;
        InterfaceC10975 interfaceC10975M27239 = AbstractC10872.m27239(c17684, c18825);
        if (this.f74042 >= i2) {
            this.f74041 = c18825.m43447();
            c18825.m43450();
        }
        return interfaceC10975M27239;
    }

    @Override // l.AbstractC14967
    /* JADX INFO: renamed from: ۖ */
    public final void mo17700() {
        int i = this.f74042;
        int i2 = this.f74044;
        if (i < i2) {
            this.f74042 = i + 1;
            C18825 c18825 = this.f74040;
            AbstractC10872.m27240(c18825);
            if (this.f74042 >= i2) {
                this.f74041 = c18825.m43447();
                c18825.m43450();
            }
        }
    }

    @Override // l.AbstractC14967
    /* JADX INFO: renamed from: ۨ */
    public final int mo17702() {
        int i = this.f74041;
        return i == -1 ? this.f74040.m43447() : i;
    }

    @Override // l.AbstractC14967
    /* JADX INFO: renamed from: ۙ */
    public final int mo17701() {
        return this.f74044;
    }
}
