package l;

/* JADX INFO: renamed from: l.֫ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2114 extends AbstractC15537 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14769 f6989;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25235 f6990;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24550 f6991;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f6992;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2114(C25235 c25235, C24550 c24550) {
        super(c25235);
        this.f6990 = c25235;
        this.f6991 = c24550;
        this.f6992 = c24550.f38069;
        this.f6989 = C14769.m35543();
    }

    @Override // l.AbstractC15537
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7293(C24550 c24550) {
        C14769 c14769 = (C14769) this.f6990.f81502.get(c24550);
        if (c14769 != null) {
            while (c14769.m35550()) {
                C5816 c5816 = (C5816) c14769.f48335;
                C14769 c147610 = this.f6989;
                while (true) {
                    if (c147610.m35550()) {
                        if (c147610.f48335 == c5816) {
                            break;
                        } else {
                            c147610 = c147610.f48336;
                        }
                    } else {
                        this.f6989 = this.f6989.m35552(c5816);
                        break;
                    }
                }
                c14769 = c14769.f48336;
            }
        }
    }

    @Override // l.AbstractC15537
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7292(AbstractC11781 abstractC11781) {
        EnumC13603 enumC13603 = abstractC11781.f38066;
        if (enumC13603 == EnumC13603.f43205 || enumC13603 == EnumC13603.f43218) {
            AbstractC11781 abstractC11782 = abstractC11781.f38069;
            C25235 c25235 = this.f6990;
            AbstractC11781 abstractC11783 = this.f6992;
            AbstractC11781 abstractC11784 = abstractC11782 != abstractC11783 ? (AbstractC11781) c25235.f81539.get(abstractC11781) : abstractC11781;
            if (abstractC11784 != null && abstractC11784.f38069 == abstractC11783) {
                C5816 c5816 = (C5816) abstractC11784;
                if (c5816.m16959() == null) {
                    for (C14769 c14769 = this.f6989; c14769.m35550(); c14769 = c14769.f48336) {
                        if (c14769.f48335 == c5816) {
                            return;
                        }
                    }
                    this.f6989 = this.f6989.m35552(c5816);
                    return;
                }
                return;
            }
            Object obj = c25235.f81515.f48335;
            if (obj == null || obj == abstractC11781) {
                return;
            }
            mo7292((AbstractC11781) obj);
        }
    }

    @Override // l.AbstractC15537, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        Object obj;
        C24550 c24550 = (C24550) c18565.f60318.f38069;
        if (c18565.f60321 == null && c24550.m29586() && (obj = this.f6990.f81515.f48335) != null) {
            mo7292((AbstractC11781) obj);
        }
        super.mo1521(c18565);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        Object obj;
        AbstractC19728 abstractC19728 = c23041.f74774;
        C25235 c25235 = this.f6990;
        if ((abstractC19728 == c25235.f81516.f49836 || c23041.f74774 == c25235.f81516.f49851) && c23041.f74776.f26659.f73596 != this.f6991 && (obj = c25235.f81515.f48335) != null) {
            mo7292((AbstractC11781) obj);
        }
        mo5474(c23041.f74776);
    }

    @Override // l.AbstractC15537, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        Object obj;
        AbstractC19728 abstractC19728M28319 = C11239.m28319(c24533.f79554);
        C25235 c25235 = this.f6990;
        if (abstractC19728M28319 == c25235.f81516.f49851 && ((C24550) C11239.m28352(c24533.f79554).f38069).m29586() && !c24533.f79554.m21911(EnumC21461.f68485) && (obj = c25235.f81515.f48335) != null) {
            mo7292((AbstractC11781) obj);
        }
        super.mo1527(c24533);
    }
}
