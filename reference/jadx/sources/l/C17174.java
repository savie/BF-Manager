package l;

/* JADX INFO: renamed from: l.ܺ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17174 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public String f55979;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public byte[] f55980;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f55981;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public String f55982;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public String f55983;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    public C17174(InterfaceC5878 interfaceC5878, AbstractC3971 abstractC3971) {
        super(interfaceC5878, abstractC3971);
        this.f55982 = "";
        this.f55983 = "";
        this.f55979 = "";
        this.f55980 = null;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40339() {
        return this.f55981;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m40338() {
        return this.f55980;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f55981 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m12787()) {
            int iM2318 = C0481.m2318(i2, bArr);
            i2 = i + 4;
            this.f55980 = new byte[iM2318];
        }
        return i2 - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        int length;
        if (m12787()) {
            byte[] bArr2 = this.f55980;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            length = this.f55980.length + i;
        } else {
            length = i;
        }
        String strM12794 = m12794(length, bArr);
        this.f55982 = strM12794;
        int iM12757 = m12757(length, strM12794) + length;
        String strM12761 = m12761(bArr, iM12757, m12781());
        this.f55983 = strM12761;
        int iM12758 = m12757(iM12757, strM12761) + iM12757;
        if (!m12787()) {
            String strM12762 = m12761(bArr, iM12758, m12781());
            this.f55979 = strM12762;
            iM12758 += m12757(iM12758, strM12762);
        }
        return iM12758 - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndXResponse[");
        sb.append(super.toString());
        sb.append(",isLoggedInAsGuest=");
        sb.append(this.f55981);
        sb.append(",nativeOs=");
        sb.append(this.f55982);
        sb.append(",nativeLanMan=");
        sb.append(this.f55983);
        sb.append(",primaryDomain=");
        return new String(C8947.m23910(sb, this.f55979, "]"));
    }
}
