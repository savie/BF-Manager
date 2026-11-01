package l;

/* JADX INFO: renamed from: l.֡ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C0350 extends AbstractC16579 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f1774;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22929 f1775;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC15395 f1776;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f1777;

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo1937() {
        return true;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܶۙ */
    public final boolean mo1939() {
        return true;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo4811(this, obj);
    }

    public C0350(AbstractC16579 abstractC16579, EnumC15395 enumC15395, AbstractC0618 abstractC0618) {
        this(abstractC16579, enumC15395, abstractC0618, null, C3794.f13674);
    }

    public C0350(AbstractC16579 abstractC16579, EnumC15395 enumC15395, AbstractC0618 abstractC0618, C22929 c22929) {
        this(abstractC16579, enumC15395, abstractC0618, c22929, C3794.f13674);
    }

    public C0350(AbstractC16579 abstractC16579, EnumC15395 enumC15395, AbstractC0618 abstractC0618, C22929 c22929, C3794 c3794) {
        super(abstractC0618, c3794);
        this.f1777 = false;
        C6171.m17171(abstractC16579);
        this.f1774 = abstractC16579;
        this.f1776 = enumC15395;
        this.f1775 = c22929;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1929(C3794 c3794) {
        return new C20107(this, this.f1774, this.f1776, this.f53222, this.f1775, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.WILDCARD;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1932(AbstractC16579 abstractC16579) {
        return this.f1776 != EnumC15395.UNBOUND && this.f1774.mo1932(abstractC16579);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2034() {
        EnumC15395 enumC15395 = EnumC15395.SUPER;
        EnumC15395 enumC15396 = this.f1776;
        return enumC15396 == enumC15395 || enumC15396 == EnumC15395.UNBOUND;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2036() {
        EnumC15395 enumC15395 = EnumC15395.EXTENDS;
        EnumC15395 enumC15396 = this.f1776;
        return enumC15396 == enumC15395 || enumC15396 == EnumC15395.UNBOUND;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2037() {
        return this.f1776 == EnumC15395.UNBOUND;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 mo2035(AbstractC16579 abstractC16579) {
        if (this.f1775 == abstractC16579) {
            return this;
        }
        this.f1775 = (C22929) abstractC16579;
        return this;
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        EnumC15395 enumC15395 = this.f1776;
        sb.append(enumC15395.toString());
        if (enumC15395 != EnumC15395.UNBOUND) {
            sb.append(this.f1774);
        }
        if (AbstractC16579.f53216 && this.f1775 != null && !this.f1777) {
            try {
                this.f1777 = true;
                sb.append("{:");
                sb.append(this.f1775.mo18112());
                sb.append(":}");
            } finally {
                this.f1777 = false;
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        return EnumC19688.WILDCARD;
    }
}
