package l;

/* JADX INFO: renamed from: l.ܰ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14134 implements InterfaceC22039 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23451 f46392;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16395 f46393 = new C16395();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f46394;

    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3847() {
    }

    public C14134(C23451 c23451, int i) {
        this.f46392 = c23451;
        this.f46394 = i;
    }

    @Override // l.InterfaceC22039
    /* JADX INFO: renamed from: ۙ */
    public final C5105 mo3846(InterfaceC7222 interfaceC7222, long j) {
        long position = interfaceC7222.getPosition();
        long jM34176 = m34176(interfaceC7222);
        long jMo19213 = interfaceC7222.mo19213();
        interfaceC7222.mo19209(Math.max(6, this.f46392.f75955));
        long jM34177 = m34176(interfaceC7222);
        long jMo19214 = interfaceC7222.mo19213();
        if (jM34176 <= j && jM34177 > j) {
            return C5105.m14214(jMo19213);
        }
        if (jM34177 <= j) {
            return C5105.m14218(jM34177, jMo19214);
        }
        return C5105.m14215(jM34176, position);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m34176(InterfaceC7222 interfaceC7222) {
        C16395 c16395;
        C23451 c23451;
        int iMo19216;
        while (true) {
            long jMo19213 = interfaceC7222.mo19213();
            long length = interfaceC7222.getLength() - 6;
            c16395 = this.f46393;
            c23451 = this.f46392;
            if (jMo19213 >= length) {
                break;
            }
            long jMo19214 = interfaceC7222.mo19213();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zM30250 = false;
            interfaceC7222.mo19210(0, 2, bArr);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.f46394;
            if (i2 != i3) {
                interfaceC7222.mo19217();
                interfaceC7222.mo19209((int) (jMo19214 - interfaceC7222.getPosition()));
            } else {
                C2460 c2460 = new C2460(16);
                System.arraycopy(bArr, 0, c2460.m7518(), 0, 2);
                byte[] bArrM7518 = c2460.m7518();
                while (i < 14 && (iMo19216 = interfaceC7222.mo19216(2 + i, 14 - i, bArrM7518)) != -1) {
                    i += iMo19216;
                }
                c2460.m7501(i);
                interfaceC7222.mo19217();
                interfaceC7222.mo19209((int) (jMo19214 - interfaceC7222.getPosition()));
                zM30250 = C12162.m30250(c2460, c23451, i3, c16395);
            }
            if (zM30250) {
                break;
            }
            interfaceC7222.mo19209(1);
        }
        if (interfaceC7222.mo19213() >= interfaceC7222.getLength() - 6) {
            interfaceC7222.mo19209((int) (interfaceC7222.getLength() - interfaceC7222.mo19213()));
            return c23451.f75957;
        }
        return c16395.f52757;
    }
}
