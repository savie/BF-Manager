package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18209 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f59461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f59462;

    public C18209(C0310 c0310, boolean z) {
        this.f59462 = c0310;
        this.f59461 = z;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        this.f59462.f1698.m50051(c17621, false);
        super.mo1964(c17621);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        if (c16875.f55198.f26659.mo9329()) {
            return;
        }
        super.mo1519(c16875);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        C22092 c22092 = this.f59462.f1698;
        C14769 c14769 = c16239.f52783;
        c22092.getClass();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c22092.m50051((C17621) it.next(), true);
        }
        m52092(c16239.f52785);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        AbstractC22664 abstractC22664;
        C12510 c12510 = c6633.f22149;
        if (c12510 != null && !c12510.f40166.f26659.mo9329()) {
            C12510 c12511 = c6633.f22149;
            m42357(c12511.f40168, c12511.f40170.f15824);
        }
        AbstractC22295 abstractC22295 = c6633.f22147;
        if (abstractC22295 != null && (abstractC22664 = abstractC22295.f26659) != null) {
            m42358(abstractC22664, abstractC22295);
        }
        if (this.f59461) {
            mo5474(c6633.f22144);
            mo5474(c6633.f22147);
            m52092(c6633.f22154);
            mo5474(c6633.f22149);
            m52092(c6633.f22145);
            m52092(c6633.f22146);
            return;
        }
        mo5474(c6633.f22151);
        mo5474(c6633.f22148);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C5816 c5816 = c12510.f40168;
        if (c5816 != null && c5816.f38067 != null && !c12510.m31064()) {
            m42358(c12510.f40168.f38067, c12510.f40166);
        }
        mo5474(c12510.f40170);
        mo5474(c12510.f40166);
        if (this.f59461) {
            return;
        }
        mo5474(c12510.f40171);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1963(C16985 c16985) {
        AbstractC22664 abstractC22664;
        AbstractC8036 abstractC8036 = c16985.f55514;
        if (abstractC8036 != null && (abstractC22664 = abstractC8036.f26659) != null) {
            m42358(abstractC22664, abstractC8036);
        }
        super.mo1963(c16985);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1974(C25279 c25279) {
        AbstractC22664 abstractC22664;
        AbstractC8036 abstractC8036 = c25279.f81647;
        if (abstractC8036 != null && !(abstractC8036 instanceof AbstractC2903) && (abstractC22664 = abstractC8036.f26659) != null) {
            m42358(abstractC22664, abstractC8036);
        }
        super.mo1974(c25279);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        AbstractC22295 abstractC22295 = c18565.f60323;
        if (abstractC22295 != null && abstractC22295.f26659 != null) {
            if (abstractC22295.m21911(EnumC21461.f68448)) {
                AbstractC22295 abstractC22296 = c18565.f60323;
                m42357(abstractC22296.f26659.f73596, ((C16875) abstractC22296).f55197);
            }
            C7926 c7926 = c18565.f60319;
            if (c7926 != null) {
                m42357(c18565.f60323.f26659.f73596, c7926.f26341.f15824);
            }
            AbstractC22295 abstractC22297 = c18565.f60323;
            m42358(abstractC22297.f26659, abstractC22297);
        }
        super.mo1521(c18565);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        AbstractC22295 abstractC22295 = c21549.f68829;
        if (abstractC22295 != null && abstractC22295.f26659 != null) {
            if (abstractC22295.m21911(EnumC21461.f68448)) {
                AbstractC22295 abstractC22296 = c21549.f68829;
                m42357(abstractC22296.f26659.f73596, ((C16875) abstractC22296).f55197);
            }
            AbstractC22295 abstractC22297 = c21549.f68829;
            m42358(abstractC22297.f26659, abstractC22297);
        }
        super.mo1524(c21549);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        if (this.f59461) {
            mo5474(c7926.f26341);
            m52092(c7926.f26343);
            mo5474(c7926.f26348);
            m52092(c7926.f26347);
        }
        for (AbstractC8036 abstractC8036 : c7926.f26344) {
            if (!abstractC8036.m21911(EnumC21461.f68501)) {
                abstractC8036.mo2284(this);
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        if (this.f59461) {
            return;
        }
        m52092(c4197.f15344);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42358(AbstractC22664 abstractC22664, AbstractC8036 abstractC8036) {
        C7312 c7312 = this.f59462.f1705;
        if (abstractC22664.mo40456()) {
            return;
        }
        boolean z = true;
        AbstractC8036 abstractC8037 = abstractC8036;
        while (z) {
            if (abstractC8037.m21911(EnumC21461.f68496)) {
                C14769 c14769Mo15882 = abstractC22664.mo15882();
                C25191 c25191 = (C25191) abstractC8037;
                C14769 c14769 = c25191.f81424;
                if (c14769.m35551() > 0 && c14769Mo15882.m35551() == c14769.m35551()) {
                    for (int i = 0; i < c14769Mo15882.m35551(); i++) {
                        m42358((AbstractC22664) c14769Mo15882.get(i), (AbstractC8036) c14769.get(i));
                    }
                }
                abstractC8037 = c25191.f81425;
            }
            if (abstractC8037.m21911(EnumC21461.f68485)) {
                abstractC8037 = ((C23041) abstractC8037).f74776;
                if (abstractC22664 != null && !abstractC22664.m51067(EnumC21172.NONE)) {
                    abstractC22664 = abstractC22664.mo23449();
                }
            } else if (abstractC8037.m21911(EnumC21461.f68448)) {
                C16875 c16875 = (C16875) abstractC8037;
                if (abstractC22664 == null || abstractC22664.m51067(EnumC21172.NONE)) {
                    if (c16875.f55197.m35551() == 1) {
                        AbstractC22295 abstractC22295 = c16875.f55198;
                        abstractC22295.getClass();
                        C23892 c23892 = ((C17621) c16875.f55197.f48335).f57963;
                        C11040 c11040 = C22843.f74058;
                        c7312.m34520(abstractC22295, new C11040("compiler", "cant.type.annotate.scoping.1", c23892));
                    } else {
                        C18499 c18499 = new C18499();
                        Iterator it = c16875.f55197.iterator();
                        while (it.hasNext()) {
                            c18499.m43089(((C17621) it.next()).f57963);
                        }
                        AbstractC22295 abstractC22296 = c16875.f55198;
                        abstractC22296.getClass();
                        C14769 c14769M43093 = c18499.m43093();
                        C11040 c11041 = C22843.f74058;
                        c7312.m34520(abstractC22296, new C11040("compiler", "cant.type.annotate.scoping", c14769M43093));
                    }
                    z = false;
                }
                abstractC8037 = c16875.f55198;
            } else {
                if (!abstractC8037.m21911(EnumC21461.f68523)) {
                    if (abstractC8037.m21911(EnumC21461.f68450)) {
                        C24445 c24445 = (C24445) abstractC8037;
                        if (c24445.mo2283() == EnumC22621.EXTENDS_WILDCARD || c24445.mo2283() == EnumC22621.SUPER_WILDCARD) {
                            AbstractC8036 abstractC8038 = c24445.f79357;
                            m42358(abstractC8038.f26659, abstractC8038);
                        }
                    } else if (abstractC8037.m21911(EnumC21461.f68553)) {
                        AbstractC22295 abstractC22297 = ((C23589) abstractC8037).f76594;
                        m42358(abstractC22297.f26659, abstractC22297);
                    } else if (abstractC8037.m21911(EnumC21461.f68499)) {
                        for (AbstractC8036 abstractC8039 : ((C23699) abstractC8037).f76826) {
                            m42358(abstractC8039.f26659, abstractC8039);
                        }
                    } else if (abstractC8037.m21911(EnumC21461.f68547)) {
                        for (AbstractC8036 abstractC80310 : ((C17731) abstractC8037).f58264) {
                            m42358(abstractC80310.f26659, abstractC80310);
                        }
                    } else if (abstractC8037.mo2283() != EnumC22621.PRIMITIVE_TYPE && abstractC8037.mo2283() != EnumC22621.ERRONEOUS) {
                        C11972.m30024("Unexpected tree: " + abstractC8037 + " with kind: " + abstractC8037.mo2283() + " within: " + abstractC8036 + " with kind: " + abstractC8036.mo2283());
                        throw null;
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42357(AbstractC11781 abstractC11781, C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C17621 c17621 = (C17621) it.next();
            if (!c17621.f26659.mo9329()) {
                C0310 c0310 = this.f59462;
                if (c0310.f1690.m30495(c17621.f57963, abstractC11781) == EnumC15950.DECLARATION) {
                    C7312 c7312 = c0310.f1705;
                    AbstractC22664 abstractC22664 = c17621.f26659;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(c17621, new C11040("compiler", "annotation.type.not.applicable.to.type", abstractC22664));
                }
            }
        }
    }
}
