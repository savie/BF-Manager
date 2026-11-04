package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۙܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4953 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18181 f17241;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7697 f17242;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f17243;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f17244;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
    }

    public C4953(C7697 c7697, boolean z, C18181 c18181) {
        super(1, -1);
        if (c7697 == null) {
            throw new NullPointerException("code == null");
        }
        this.f17242 = c7697;
        this.f17243 = z;
        this.f17241 = c18181;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        try {
            byte[] bArrM15154 = m15154(c19123.m23369(), null, null, false);
            this.f17244 = bArrM15154;
            m26283(bArrM15154.length);
        } catch (RuntimeException e) {
            throw C3880.m12507("...while placing debug info for " + this.f17241.mo1843(), e);
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m15155(C10918 c10918, C15000 c15000) {
        m15154(c10918, ASN1Dump.TAB, c15000, false);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        if (c15000.m36116()) {
            c15000.m36113(m26281() + " debug info");
            m15154(c10918, null, c15000, true);
        }
        c15000.m36115(this.f17244);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m15154(C10918 c10918, String str, C15000 c15000, boolean z) {
        C7697 c7697 = this.f17242;
        C25377 c25377M20974 = c7697.m20974();
        C11204 c11204M20975 = c7697.m20975();
        C9933 c9933M20977 = c7697.m20977();
        C13596 c13596 = new C13596(c25377M20974, c11204M20975, c10918, c9933M20977.m25769(), c9933M20977.m25767(), this.f17243, this.f17241);
        if (c15000 == null) {
            return c13596.m33332();
        }
        return c13596.m33333(str, c15000, z);
    }
}
