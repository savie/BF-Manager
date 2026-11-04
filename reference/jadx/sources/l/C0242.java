package l;

/* JADX INFO: renamed from: l.֡ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C0242 extends AbstractC3971 implements InterfaceC0416 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f1510 = C16980.m40037(C0242.class);

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f1511;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C0242(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878, (byte) 4);
        this.f1511 = i;
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3971 mo1727() {
        return (C18141) super.mo1727();
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC17965 mo1727() {
        return (C18141) super.mo1727();
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18315 mo1727() {
        return (C18141) super.mo1727();
    }

    @Override // l.InterfaceC0416
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 mo1726(InterfaceC23032 interfaceC23032) {
        C18141 c18141 = new C18141(interfaceC23032.mo2875());
        mo12766((InterfaceC18315) c18141);
        return c18141;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo1723(int i, byte[] bArr) {
        C0481.m2319(this.f1511, i, bArr);
        int i2 = i + 2;
        if (this.f13583 != null) {
            int i3 = C24109.f77937;
            C0481.m2323(-1L, i2, bArr);
            return 6;
        }
        f1510.mo13717("SmbComClose without a digest");
        return 6;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComClose[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C12669.m31437(this.f1511, ",lastWriteTime=0]", sb));
    }
}
