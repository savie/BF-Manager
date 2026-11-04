package l;

/* JADX INFO: renamed from: l.۠ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8388 extends AbstractC2422 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25301 f27496;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f27497;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
    }

    @Override // l.AbstractC2422
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1538() {
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m22554(AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC8036);
        if (abstractC8036M28345.m21911(EnumC21461.f68523) || abstractC8036M28345.m21911(EnumC21461.f68485)) {
            AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC8036M28345);
            AbstractC8036 abstractC8037 = this.f27497;
            if (abstractC8037 == null || abstractC11781M28352.f38066 != EnumC13603.f43205 || abstractC11781M28352.f38069.f38066 != EnumC13603.f43218 || ((C5816) abstractC11781M28352).f19997 >= C11239.m28342(abstractC8037)) {
                return;
            }
            switch (C20322.f65205[this.f27497.mo2285().ordinal()]) {
                case 8:
                    C25301 c25301 = this.f27496;
                    if (!c25301.f81709) {
                        C7312 c7312 = c25301.f81714;
                        C11040 c11040 = C22843.f74058;
                        c7312.m34520(abstractC8036M28345, new C11040("compiler", "local.var.accessed.from.icls.needs.final", abstractC11781M28352));
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            m22553(abstractC11781M28352, abstractC8036M28345);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22553(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        C15515 c15515;
        switch (C20322.f65205[this.f27497.mo2285().ordinal()]) {
            case 8:
                c15515 = C19859.f63864;
                break;
            case 9:
                c15515 = C19859.f63815;
                break;
            case 10:
                c15515 = C19859.f63860;
                break;
            default:
                throw new AssertionError("Unexpected tree kind: " + this.f27497.mo2285());
        }
        C25301 c25301 = this.f27496;
        C7312 c7312 = c25301.f81714;
        C17007 c17007M45975 = c25301.f81717.m45975(c15515);
        C11040 c11040 = C22843.f74058;
        c7312.m34520(abstractC8036, new C11040("compiler", "cant.ref.non.effectively.final.var", abstractC11781, c17007M45975));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        AbstractC8036 abstractC8036 = this.f27497;
        try {
            this.f27497 = c7926.f26345.m29602() ? c7926 : null;
            super.mo1505(c7926);
        } finally {
            this.f27497 = abstractC8036;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        AbstractC8036 abstractC8036 = this.f27497;
        try {
            this.f27497 = c16327;
            super.mo1518(c16327);
        } finally {
            this.f27497 = abstractC8036;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1956(C13344 c13344) {
        mo5474(c13344.f42553);
        AbstractC8036 abstractC8036 = this.f27497;
        try {
            this.f27497 = c13344;
            mo5474(c13344.f42552);
        } finally {
            this.f27497 = abstractC8036;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        AbstractC11781 abstractC11781 = c5887.f20170;
        if (abstractC11781.f38066 == EnumC13603.f43205) {
            C5816 c5816 = (C5816) abstractC11781;
            AbstractC8036 abstractC8036 = this.f27497;
            if (abstractC8036 == null || c5816.f38069.f38066 != EnumC13603.f43218 || c5816.f19997 >= C11239.m28342(abstractC8036)) {
                return;
            }
            switch (C20322.f65205[this.f27497.mo2285().ordinal()]) {
                case 8:
                    C25301 c25301 = this.f27496;
                    if (!c25301.f81709) {
                        if ((c5816.f38071 & 16) == 0) {
                            C7312 c7312 = c25301.f81714;
                            C11040 c11040 = C22843.f74058;
                            c7312.m34520(c5887, new C11040("compiler", "local.var.accessed.from.icls.needs.final", c5816));
                            return;
                        }
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            if ((c5816.f38071 & 2199023255568L) == 0) {
                m22553(c5816, c5887);
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1523(C20605 c20605) {
        AbstractC22295 abstractC22295M28353 = C11239.m28353(c20605.f66030);
        if (!(abstractC22295M28353 instanceof C5887)) {
            mo5474(abstractC22295M28353);
        }
        mo5474(c20605.f66031);
        m22554(abstractC22295M28353);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        mo5474(c12400.f39896);
        mo5474(c12400.f39895);
        m22554(c12400.f39896);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        int i = C20322.f65205[c3561.mo2285().ordinal()];
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            mo5474(c3561.f12203);
            m22554(c3561.f12203);
        } else {
            mo5474(c3561.f12203);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        AbstractC11781 abstractC11781M28352;
        for (AbstractC8036 abstractC8036 : c11764.f38023) {
            if (!abstractC8036.m21911(EnumC21461.f68538) && (abstractC11781M28352 = C11239.m28352(abstractC8036)) != null && (abstractC11781M28352.mo29591() & 2199023255568L) == 0) {
                C7312 c7312 = this.f27496.f81714;
                C11040 c11040 = C22843.f74058;
                c7312.m34520(abstractC8036, new C11040("compiler", "try.with.resources.expr.effectively.final.var", abstractC11781M28352));
            }
        }
        super.mo1511(c11764);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        mo5474(c4307.f15611);
    }

    public C8388(C25301 c25301) {
        this.f27496 = c25301;
    }
}
