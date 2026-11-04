package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: IIVR */
/* JADX INFO: loaded from: classes5.dex */
public final class C17489 extends C16743 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f56839;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f56840;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21943 f56841;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21943 f56842;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC15997 f56843;

    public C17489(InterfaceC7377 interfaceC7377, EnumC15997 enumC15997) {
        AbstractC1566 abstractC1566;
        super(EnumC24203.IF, interfaceC7377.mo20251(), 2);
        this.f56843 = enumC15997;
        if (enumC15997 == EnumC15997.EQ || enumC15997 == EnumC15997.NE) {
            abstractC1566 = f56839;
        } else {
            abstractC1566 = f56840;
        }
        int i = AbstractC16481.f53441;
        mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(0), abstractC1566));
        if (interfaceC7377.mo20258() == 1) {
            mo44014((AbstractC16481) C23195.m52120(0L, abstractC1566));
        } else {
            mo44014((AbstractC16481) new C6041(interfaceC7377.mo20252(1), abstractC1566));
        }
    }

    public C17489(EnumC15997 enumC15997, AbstractC16481 abstractC16481, C23195 c23195) {
        this(enumC15997, -1);
        mo44014(abstractC16481);
        mo44014((AbstractC16481) c23195);
    }

    public C17489(EnumC15997 enumC15997, int i) {
        super(EnumC24203.IF, i, 2);
        this.f56843 = enumC15997;
    }

    static {
        EnumC12006 enumC12006 = EnumC12006.INT;
        EnumC12006 enumC12007 = EnumC12006.BYTE;
        EnumC12006 enumC12008 = EnumC12006.SHORT;
        EnumC12006 enumC12009 = EnumC12006.CHAR;
        f56839 = AbstractC1566.m5533(enumC12006, EnumC12006.BOOLEAN, EnumC12006.OBJECT, EnumC12006.ARRAY, enumC12007, enumC12008, enumC12009);
        f56840 = AbstractC1566.m5533(enumC12006, enumC12007, enumC12008, enumC12009);
    }

    public final void normalize() {
        if (this.f56843 == EnumC15997.NE && mo44035(1).m39119()) {
            m40990(EnumC15997.EQ, mo44035(0), C23195.m52121());
        }
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15997 m40994() {
        return this.f56843;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final void m40993() {
        this.f56843 = this.f56843.m38126();
        C21943 c21943 = this.f56842;
        this.f56842 = this.f56841;
        this.f56841 = c21943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40990(EnumC15997 enumC15997, AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        this.f56843 = enumC15997;
        mo44012(0, abstractC16481);
        mo44012(1, abstractC16482);
    }

    @Override // l.AbstractC9284
    /* JADX INFO: renamed from: ۙ */
    public final void mo4068(C21943 c21943) {
        List listM49646 = c21943.m49646();
        this.f56842 = C23231.m52157(this.f54053, listM49646);
        if (listM49646.size() == 1) {
            this.f56841 = this.f56842;
        } else {
            this.f56841 = C23231.m52166(this.f56842, listM49646);
        }
    }

    @Override // l.AbstractC9284
    /* JADX INFO: renamed from: ۙ */
    public final void mo4069(C21943 c21943, C21943 c21944) {
        if (this.f56842 == c21943) {
            this.f56842 = c21944;
        }
        if (this.f56841 == c21943) {
            this.f56841 = c21944;
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m40992() {
        return this.f56842;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m40991() {
        return this.f56841;
    }

    @Override // l.C16743
    /* JADX INFO: renamed from: ᩵ۙ */
    public final int mo39519() {
        C21943 c21943 = this.f56842;
        return c21943 == null ? this.f54053 : c21943.m49654();
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        return (c18959 instanceof C17489) && super.mo4075(c18959) && this.f56843 == ((C17489) c18959).f56843;
    }

    @Override // l.C16743, l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C17489 c17489 = new C17489(this.f56843, this.f54053);
        c17489.f56842 = this.f56842;
        c17489.f56841 = this.f56841;
        m44033(c17489);
        return c17489;
    }

    @Override // l.C16743, l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8314.m22396(this.f61471));
        sb.append(": ");
        sb.append(this.f61472 + EnumC7687.f25319);
        sb.append(mo44035(0));
        sb.append(' ');
        sb.append(this.f56843.m38125());
        sb.append(' ');
        sb.append(mo44035(1));
        sb.append("  -> ");
        Object objM22396 = this.f56842;
        if (objM22396 == null) {
            objM22396 = C8314.m22396(this.f54053);
        }
        sb.append(objM22396);
        sb.append(m44019());
        return sb.toString();
    }
}
