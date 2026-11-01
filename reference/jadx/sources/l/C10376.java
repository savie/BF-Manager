package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10376 extends AbstractC21188 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6694 f35546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f35545 = new C2460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11634 f35547 = new C11634();

    @Override // l.AbstractC21188
    /* JADX INFO: renamed from: ۙ */
    public final C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer) {
        InterfaceC22155 c16021;
        C6694 c6694 = this.f35546;
        if (c6694 == null || c7783.f25648 != c6694.m18074()) {
            C6694 c6695 = new C6694(c7783.f51910);
            this.f35546 = c6695;
            c6695.m18072(c7783.f51910 - c7783.f25648);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2460 c2460 = this.f35545;
        c2460.m7508(iLimit, bArrArray);
        C11634 c11634 = this.f35547;
        c11634.m29038(iLimit, bArrArray);
        c11634.m29034(39);
        long jM29039 = (((long) c11634.m29039(1)) << 32) | ((long) c11634.m29039(32));
        c11634.m29034(20);
        int iM29039 = c11634.m29039(12);
        int iM290310 = c11634.m29039(8);
        c2460.m7535(14);
        if (iM290310 == 0) {
            c16021 = new C16021();
        } else if (iM290310 == 255) {
            c16021 = C19548.m44639(c2460, iM29039, jM29039);
        } else if (iM290310 == 4) {
            c16021 = C16726.m39214(c2460);
        } else if (iM290310 == 5) {
            c16021 = C20959.m47132(c2460, jM29039, this.f35546);
        } else {
            c16021 = iM290310 != 6 ? null : C12493.m31035(c2460, jM29039, this.f35546);
        }
        return c16021 == null ? new C0987(new InterfaceC22155[0]) : new C0987(c16021);
    }
}
