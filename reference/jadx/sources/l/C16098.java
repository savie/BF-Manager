package l;

/* JADX INFO: renamed from: l.ܺᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16098 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public String f52052;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f52053;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f52054;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public String f52055;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f52056;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    public C16098(InterfaceC10601 interfaceC10601, AbstractC14792 abstractC14792) {
        super(interfaceC10601, abstractC14792);
        this.f52052 = "";
        this.f52055 = "";
        this.f52054 = "";
        this.f52056 = null;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38131() {
        return this.f52053;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m38130() {
        return this.f52056;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f52053 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m35457()) {
            int iM13545 = C4850.m13545(i2, bArr);
            i2 = i + 4;
            this.f52056 = new byte[iM13545];
        }
        return i2 - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        int length;
        if (m35457()) {
            byte[] bArr2 = this.f52056;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            length = this.f52056.length + i;
        } else {
            length = i;
        }
        String strM35435 = m35435(length, bArr);
        this.f52052 = strM35435;
        int iM35439 = m35439(length, strM35435) + length;
        String strM35443 = m35443(bArr, iM35439, m35449());
        this.f52055 = strM35443;
        int iM354310 = m35439(iM35439, strM35443) + iM35439;
        if (!m35457()) {
            String strM35444 = m35443(bArr, iM354310, m35449());
            this.f52054 = strM35444;
            iM354310 += m35439(iM354310, strM35444);
        }
        return iM354310 - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndXResponse[");
        sb.append(super.toString());
        sb.append(",isLoggedInAsGuest=");
        sb.append(this.f52053);
        sb.append(",nativeOs=");
        sb.append(this.f52052);
        sb.append(",nativeLanMan=");
        sb.append(this.f52055);
        sb.append(",primaryDomain=");
        return new String(C22697.m50267(sb, this.f52054, "]"));
    }
}
