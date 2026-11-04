package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15463 extends AbstractC13468 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1150 f50373;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f50372 = new C21287();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14573 f50374 = new C14573();

    @Override // l.AbstractC13468
    /* JADX INFO: renamed from: ۙ */
    public final C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer) {
        InterfaceC8191 c2040;
        C1150 c1150 = this.f50373;
        if (c1150 == null || c15705.f51033 != c1150.m4246()) {
            C1150 c1151 = new C1150(c15705.f19652);
            this.f50373 = c1151;
            c1151.m4244(c15705.f19652 - c15705.f51033);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C21287 c21287 = this.f50372;
        c21287.m48491(iLimit, bArrArray);
        C14573 c14573 = this.f50374;
        c14573.m35158(iLimit, bArrArray);
        c14573.m35161(39);
        long jM35163 = (((long) c14573.m35163(1)) << 32) | ((long) c14573.m35163(32));
        c14573.m35161(20);
        int iM35163 = c14573.m35163(12);
        int iM35164 = c14573.m35163(8);
        c21287.m48503(14);
        if (iM35164 == 0) {
            c2040 = new C2040();
        } else if (iM35164 == 255) {
            c2040 = C22923.m51681(c21287, iM35163, jM35163);
        } else if (iM35164 == 4) {
            c2040 = C16955.m39936(c21287);
        } else if (iM35164 == 5) {
            c2040 = C5769.m16846(c21287, jM35163, this.f50373);
        } else {
            c2040 = iM35164 != 6 ? null : C17701.m41462(c21287, jM35163, this.f50373);
        }
        return c2040 == null ? new C19378(new InterfaceC8191[0]) : new C19378(c2040);
    }
}
