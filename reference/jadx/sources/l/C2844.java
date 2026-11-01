package l;

/* JADX INFO: renamed from: l.ۖ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2844 implements InterfaceC23307 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10762 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8602() {
        return this.f10762;
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8606(C10607 c10607) {
        m8601((AbstractC15546) c10607);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8605(C9196 c9196) {
        m8601((AbstractC15546) c9196);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8609(C24012 c24012) {
        m8601((AbstractC15546) c24012);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8607(C14840 c14840) {
        m8601((AbstractC15546) c14840);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8603(C2138 c2138) {
        m8601((AbstractC15546) c2138);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8604(C4255 c4255) {
        m8601((AbstractC15546) c4255);
    }

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8608(C18367 c18367) {
        m8601((AbstractC15546) c18367);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8601(AbstractC15546 abstractC15546) {
        int iM38399;
        C16251 c16251M37185 = abstractC15546.m37185();
        if (c16251M37185 != null && (iM38399 = c16251M37185.m38399()) > this.f10762) {
            this.f10762 = iM38399;
        }
        C0727 c0727M37186 = abstractC15546.m37186();
        int size = c0727M37186.size();
        for (int i = 0; i < size; i++) {
            int iM383910 = c0727M37186.m15275get(i).m38399();
            if (iM383910 > this.f10762) {
                this.f10762 = iM383910;
            }
        }
    }
}
