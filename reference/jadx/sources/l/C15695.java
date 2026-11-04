package l;

/* JADX INFO: renamed from: l.ܳ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes5.dex */
public final class C15695 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        try {
            int iM34627 = ((C14270) c19929.m45858()).m34627();
            C22935 c22935 = (C22935) ((C14270) c19929.m45858()).m34634();
            c22935.getClass();
            byte[] bArr = new byte[iM34627];
            for (int i = 0; i < iM34627; i++) {
                bArr[i] = (byte) (c22935.m51695() & 255);
            }
            c14270.m34620(bArr);
        } catch (Exception unused) {
        }
        c19929.m45857(c14270);
    }
}
