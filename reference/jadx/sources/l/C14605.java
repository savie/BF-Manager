package l;

/* JADX INFO: renamed from: l.ܳܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A1U */
/* JADX INFO: loaded from: classes4.dex */
public class C14605 extends AbstractC23777 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f47797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f47798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f47799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f47800;

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        c17426.m40631(4);
        byte b = this.f47797;
        c17426.m40622(b);
        c17426.m40632(this.f47800);
        c17426.m40632(this.f47797);
        int i = c17426.f55443;
        c17426.m40624(6);
        int i2 = c17426.f55443;
        c17426.m40624(b * 4);
        C17426 c17426M40629 = c17426.m40629(i);
        for (int i3 = 0; i3 < 6; i3++) {
            c17426M40629.m40632(this.f47798[i3]);
        }
        C17426 c17426M406210 = c17426M40629.m40629(i2);
        for (int i4 = 0; i4 < b; i4++) {
            c17426M406210.m40622(this.f47799[i4]);
        }
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) throws C6137 {
        c17426.m40631(4);
        int iM40623 = c17426.m40623();
        this.f47800 = (byte) c17426.m40628();
        this.f47797 = (byte) c17426.m40628();
        int i = c17426.f55443;
        c17426.m40624(6);
        int i2 = c17426.f55443;
        c17426.m40624(iM40623 * 4);
        if (this.f47798 == null) {
            this.f47798 = new byte[6];
        }
        C17426 c17426M40629 = c17426.m40629(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f47798[i3] = (byte) c17426M40629.m40628();
        }
        if (this.f47799 == null) {
            if (iM40623 < 0 || iM40623 > 65535) {
                throw new C6137("invalid array conformance");
            }
            this.f47799 = new int[iM40623];
        }
        C17426 c17426M406210 = c17426M40629.m40629(i2);
        for (int i4 = 0; i4 < iM40623; i4++) {
            this.f47799[i4] = c17426M406210.m40623();
        }
    }
}
