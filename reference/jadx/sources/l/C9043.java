package l;

/* JADX INFO: renamed from: l.ۡᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9Y3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9043 extends AbstractC14792 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public String f30853;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f30854;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public String f30855;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C9043(InterfaceC10601 interfaceC10601, String str, String str2) {
        super(interfaceC10601, (byte) 7);
        this.f30853 = str;
        this.f30855 = str2;
        this.f30854 = 22;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f30854, i, bArr);
        return 2;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        int iM35440 = i2 + m35440(this.f30853, i2, bArr);
        int i3 = iM35440 + 1;
        bArr[iM35440] = 4;
        if (m35449()) {
            bArr[i3] = 0;
            i3 = iM35440 + 2;
        }
        return (i3 + m35440(this.f30855, i3, bArr)) - i;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComRename[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C18855.m43491(this.f30854, 4, ",oldFileName=", sb);
        sb.append(this.f30853);
        sb.append(",newFileName=");
        return new String(C22697.m50267(sb, this.f30855, "]"));
    }
}
