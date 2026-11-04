package l;

/* JADX INFO: renamed from: l.ۤ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10729 extends AbstractC22664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C17969 f34072;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC18670 f34073;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f34074;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f34075;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo9326() {
        return true;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo9331() {
        return true;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1769(this, obj);
    }

    public C10729(AbstractC22664 abstractC22664, EnumC18670 enumC18670, AbstractC22970 abstractC22970) {
        this(abstractC22664, enumC18670, abstractC22970, null, C14458.f45498);
    }

    public C10729(AbstractC22664 abstractC22664, EnumC18670 enumC18670, AbstractC22970 abstractC22970, C17969 c17969) {
        this(abstractC22664, enumC18670, abstractC22970, c17969, C14458.f45498);
    }

    public C10729(AbstractC22664 abstractC22664, EnumC18670 enumC18670, AbstractC22970 abstractC22970, C17969 c17969, C14458 c14458) {
        super(abstractC22970, c14458);
        this.f34075 = false;
        C11972.m30021(abstractC22664);
        this.f34074 = abstractC22664;
        this.f34073 = enumC18670;
        this.f34072 = c17969;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo4934(C14458 c14458) {
        return new C21918(this, this.f34074, this.f34073, this.f73596, this.f34072, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return EnumC21172.WILDCARD;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9325(AbstractC22664 abstractC22664) {
        return this.f34073 != EnumC18670.UNBOUND && this.f34074.mo9325(abstractC22664);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27320() {
        EnumC18670 enumC18670 = EnumC18670.SUPER;
        EnumC18670 enumC18671 = this.f34073;
        return enumC18671 == enumC18670 || enumC18671 == EnumC18670.UNBOUND;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27317() {
        EnumC18670 enumC18670 = EnumC18670.EXTENDS;
        EnumC18670 enumC18671 = this.f34073;
        return enumC18671 == enumC18670 || enumC18671 == EnumC18670.UNBOUND;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27319() {
        return this.f34073 == EnumC18670.UNBOUND;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo27318(AbstractC22664 abstractC22664) {
        if (this.f34072 == abstractC22664) {
            return this;
        }
        this.f34072 = (C17969) abstractC22664;
        return this;
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m51066(sb, false);
        EnumC18670 enumC18670 = this.f34073;
        sb.append(enumC18670.toString());
        if (enumC18670 != EnumC18670.UNBOUND) {
            sb.append(this.f34074);
        }
        if (AbstractC22664.f73593 && this.f34072 != null && !this.f34075) {
            try {
                this.f34075 = true;
                sb.append("{:");
                sb.append(this.f34072.mo19992());
                sb.append(":}");
            } finally {
                this.f34075 = false;
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        return EnumC18720.WILDCARD;
    }
}
