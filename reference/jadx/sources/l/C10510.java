package l;

import com.alipay.sdk.m.w.a;

/* JADX INFO: renamed from: l.ۤ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10510 extends AbstractC22664 implements InterfaceC7533, InterfaceC8344 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14769 f33436;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14769 f33437;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C14769 f33438;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f33439;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f33440;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14769 f33441;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f33442;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۛۙ */
    public boolean mo9326() {
        return true;
    }

    @Override // l.AbstractC22664, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 7;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܺۙ */
    public boolean mo9331() {
        return true;
    }

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC22970 mo14287() {
        return this.f73596;
    }

    public C10510(AbstractC22970 abstractC22970, AbstractC22664 abstractC22664, C14769 c14769) {
        this(abstractC22664, c14769, abstractC22970, C14458.f45498);
    }

    public C10510(AbstractC22664 abstractC22664, C14769 c14769, AbstractC22970 abstractC22970, C14458 c14458) {
        super(abstractC22970, c14458);
        this.f33439 = -1;
        this.f33440 = abstractC22664;
        this.f33438 = c14769;
        this.f33441 = null;
        this.f33442 = null;
        this.f33437 = null;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public C10510 mo4934(C14458 c14458) {
        return new C4545(this, this.f33440, this.f33438, this.f73596, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public EnumC21172 mo9097() {
        return EnumC21172.CLASS;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1768(this, obj);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo23624(Object obj) {
        return new C21699(mo23449(), this.f33438, this.f73596, this.f73595, obj);
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!mo23449().m51067(EnumC21172.CLASS) || this.f73596.f38069.f38066 != EnumC13603.f43213) {
            m51066(sb, false);
            sb.append(m26972((AbstractC11781) this.f73596, true));
        } else {
            sb.append(mo23449().toString());
            sb.append(".");
            m51066(sb, false);
            sb.append(m26972((AbstractC11781) this.f73596, false));
        }
        if (mo15882().m35550()) {
            sb.append('<');
            sb.append(mo15882().m35545(","));
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m26972(AbstractC11781 abstractC11781, boolean z) {
        String strM20030;
        if (abstractC11781.f38072.isEmpty() && (abstractC11781.mo29591() & 16777216) != 0) {
            StringBuilder sb = new StringBuilder(this.f33442.toString());
            for (C14769 c14769 = this.f33437; c14769.m35550(); c14769 = c14769.f48336) {
                sb.append(a.p);
                sb.append(((AbstractC22664) c14769.f48335).toString());
            }
            return sb.toString();
        }
        if (!abstractC11781.f38072.isEmpty()) {
            return z ? abstractC11781.mo29582().toString() : abstractC11781.f38072.toString();
        }
        C10510 c10510 = (C10510) this.f73596.f38067;
        if (c10510 == null) {
            strM20030 = C7312.m20030("anonymous.class", null);
        } else {
            C14769 c147610 = c10510.f33437;
            strM20030 = (c147610 == null || !c147610.m35550()) ? C7312.m20030("anonymous.class", c10510.f33442) : C7312.m20030("anonymous.class", c10510.f33437.f48335);
        }
        if (!AbstractC22664.f73593) {
            return strM20030;
        }
        StringBuilder sbM27333 = C10732.m27333(strM20030);
        sbM27333.append(String.valueOf(abstractC11781.hashCode()));
        return sbM27333.toString();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۤۙ */
    public C14769 mo15882() {
        if (this.f33438 == null) {
            mo9322();
            if (this.f33438 == null) {
                this.f33438 = C14769.m35543();
            }
        }
        return this.f33438;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۢ */
    public AbstractC22664 mo23449() {
        return this.f33440;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo23450(AbstractC22664 abstractC22664) {
        this.f33440 = abstractC22664;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۘ */
    public C14769 mo9323() {
        if (this.f33441 == null) {
            this.f33441 = mo15882().m35549(mo23449().mo9323());
        }
        return this.f33441;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۫ۙ */
    public boolean mo9329() {
        if (mo23449().mo9329() || AbstractC22664.m51062(mo15882())) {
            return true;
        }
        AbstractC22664 abstractC22664 = this.f73596.f38067;
        return this != abstractC22664 && abstractC22664.mo9329();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܶۙ */
    public final boolean mo9330() {
        return mo9323().f48336 != null;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۨۙ */
    public final boolean mo9328() {
        AbstractC22664 abstractC22664 = this.f73596.f38067;
        return this != abstractC22664 && abstractC22664.mo9323().m35550() && mo9323().isEmpty();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9325(AbstractC22664 abstractC22664) {
        if (abstractC22664.m51074(this)) {
            return true;
        }
        if (mo9330() && (mo23449().mo9325(abstractC22664) || AbstractC22664.m51061(abstractC22664, mo15882()))) {
            return true;
        }
        if (mo18914()) {
            return this.f33442.mo9325(abstractC22664) || AbstractC22664.m51061(abstractC22664, this.f33437);
        }
        return false;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֡ */
    public final void mo9322() {
        this.f73596.mo29590();
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public EnumC18720 mo5501() {
        this.f73596.m29583();
        return this.f73596.f38066 == EnumC13603.f43213 ? EnumC18720.DECLARED : EnumC18720.ERROR;
    }
}
