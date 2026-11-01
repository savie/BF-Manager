package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۢ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9259 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f31477;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20255 f31478;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0209 f31479;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f31480;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
    }

    public C9259(C0209 c0209, boolean z, C20255 c20255) {
        super(1, -1);
        if (c0209 == null) {
            throw new NullPointerException("code == null");
        }
        this.f31479 = c0209;
        this.f31477 = z;
        this.f31478 = c20255;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        try {
            byte[] bArrM23783 = m23783(c16665.m52251(), null, null, false);
            this.f31480 = bArrM23783;
            m30903(bArrM23783.length);
        } catch (RuntimeException e) {
            throw C7513.m20020("...while placing debug info for " + this.f31478.mo2376(), e);
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23784(C4669 c4669, C2718 c2718) {
        m23783(c4669, ASN1Dump.TAB, c2718, false);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        if (c2718.m8288()) {
            c2718.m8285(m30901() + " debug info");
            m23783(c4669, null, c2718, true);
        }
        c2718.m8287(this.f31480);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m23783(C4669 c4669, String str, C2718 c2718, boolean z) {
        C0209 c0209 = this.f31479;
        C4234 c4234M1567 = c0209.m1567();
        C4940 c4940M1563 = c0209.m1563();
        C12205 c12205M1559 = c0209.m1559();
        C1496 c1496 = new C1496(c4234M1567, c4940M1563, c4669, c12205M1559.m30306(), c12205M1559.m30307(), this.f31477, this.f31478);
        if (c2718 == null) {
            return c1496.m5154();
        }
        return c1496.m5155(str, c2718, z);
    }
}
