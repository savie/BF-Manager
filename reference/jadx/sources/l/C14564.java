package l;

/* JADX INFO: renamed from: l.ܰۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14564 implements InterfaceC18120 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23232 f45886;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11297 f45887 = new C11297();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f45888;

    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo26630() {
    }

    public C14564(C23232 c23232, int i) {
        this.f45886 = c23232;
        this.f45888 = i;
    }

    @Override // l.InterfaceC18120
    /* JADX INFO: renamed from: ۙ */
    public final C21104 mo26629(InterfaceC19502 interfaceC19502, long j) {
        long position = interfaceC19502.getPosition();
        long jM35124 = m35124(interfaceC19502);
        long jMo10072 = interfaceC19502.mo10072();
        interfaceC19502.mo10068(Math.max(6, this.f45886.f75251));
        long jM35125 = m35124(interfaceC19502);
        long jMo10073 = interfaceC19502.mo10072();
        if (jM35124 <= j && jM35125 > j) {
            return C21104.m48161(jMo10072);
        }
        if (jM35125 <= j) {
            return C21104.m48165(jM35125, jMo10073);
        }
        return C21104.m48162(jM35124, position);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m35124(InterfaceC19502 interfaceC19502) {
        C11297 c11297;
        C23232 c23232;
        int iMo10075;
        while (true) {
            long jMo10072 = interfaceC19502.mo10072();
            long length = interfaceC19502.getLength() - 6;
            c11297 = this.f45887;
            c23232 = this.f45886;
            if (jMo10072 >= length) {
                break;
            }
            long jMo10073 = interfaceC19502.mo10072();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zM55203 = false;
            interfaceC19502.mo10069(0, 2, bArr);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.f45888;
            if (i2 != i3) {
                interfaceC19502.mo10076();
                interfaceC19502.mo10068((int) (jMo10073 - interfaceC19502.getPosition()));
            } else {
                C21287 c21287 = new C21287(16);
                System.arraycopy(bArr, 0, c21287.m48497(), 0, 2);
                byte[] bArrM48497 = c21287.m48497();
                while (i < 14 && (iMo10075 = interfaceC19502.mo10075(2 + i, 14 - i, bArrM48497)) != -1) {
                    i += iMo10075;
                }
                c21287.m48517(i);
                interfaceC19502.mo10076();
                interfaceC19502.mo10068((int) (jMo10073 - interfaceC19502.getPosition()));
                zM55203 = C24724.m55203(c21287, c23232, i3, c11297);
            }
            if (zM55203) {
                break;
            }
            interfaceC19502.mo10068(1);
        }
        if (interfaceC19502.mo10072() >= interfaceC19502.getLength() - 6) {
            interfaceC19502.mo10068((int) (interfaceC19502.getLength() - interfaceC19502.mo10072()));
            return c23232.f75256;
        }
        return c11297.f35612;
    }
}
