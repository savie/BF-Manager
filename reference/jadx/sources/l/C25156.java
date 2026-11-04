package l;

/* JADX INFO: renamed from: l.᩻ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9H2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25156 extends C24652 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f81309;

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        c7453.m56021(2);
        c7453.m56021(2);
        c7453.m56002();
        c7453.m56024(8, new byte[8]);
        c7453.m56024(8, new byte[8]);
        int iM56002 = c7453.m56002();
        int iM56003 = c7453.m56002();
        int iM56004 = c7453.m56002();
        int iM56005 = c7453.m56002();
        c7453.m56021(4);
        c7453.m56021(4);
        if (iM56003 > 0) {
            c7453.m56027(iM56002);
            c7453.m56015(iM56003);
        }
        if (iM56005 > 0) {
            c7453.m56027(iM56004);
            byte[] bArr = new byte[iM56005];
            c7453.m56024(iM56005, bArr);
            this.f81309 = bArr;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m56070() {
        return this.f81309;
    }
}
