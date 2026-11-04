package l;

/* JADX INFO: renamed from: l.ۢۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10048 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24705 f32225;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17245(char c);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17246(AbstractC19728 abstractC19728);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo25983(C24550 c24550) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17247(byte[] bArr);

    public AbstractC10048(C24705 c24705) {
        this.f32225 = c24705;
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo17248(AbstractC22664 abstractC22664) {
        throw new C18999(abstractC22664);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo25984(AbstractC22664 abstractC22664) {
        int i = C3600.f12307[abstractC22664.mo9097().ordinal()];
        if (i == 14) {
            C10729 c10729 = (C10729) abstractC22664;
            EnumC18670 enumC18670 = c10729.f34073;
            int i2 = C3600.f12305[enumC18670.ordinal()];
            if (i2 == 1) {
                mo17245('+');
                mo25984(c10729.f34074);
                return;
            } else if (i2 == 2) {
                mo17245('-');
                mo25984(c10729.f34074);
                return;
            } else {
                if (i2 == 3) {
                    mo17245('*');
                    return;
                }
                throw new AssertionError(enumC18670);
            }
        }
        if (i == 18) {
            C5291 c5291 = (C5291) abstractC22664;
            m25981(c5291.f18620);
            mo25984(c5291.f72657);
            return;
        }
        if (i != 19) {
            switch (i) {
                case 1:
                    mo17245('[');
                    mo25984(((C2832) abstractC22664).f9333);
                    return;
                case 2:
                    if (abstractC22664.mo18914()) {
                        mo17248(abstractC22664);
                    }
                    mo17245('L');
                    m25982(abstractC22664);
                    mo17245(';');
                    return;
                case 3:
                    mo17245('B');
                    return;
                case 4:
                    mo17245('C');
                    return;
                case 5:
                    mo17245('S');
                    return;
                case 6:
                    mo17245('I');
                    return;
                case 7:
                    mo17245('J');
                    return;
                case 8:
                    mo17245('F');
                    return;
                case 9:
                    mo17245('D');
                    return;
                case 10:
                    mo17245('Z');
                    return;
                case 11:
                    mo17245('V');
                    return;
                case 12:
                    if (((C17969) abstractC22664).mo34139()) {
                        mo17248(abstractC22664);
                    }
                    mo17245('T');
                    mo17246(abstractC22664.f73596.f38072);
                    mo17245(';');
                    return;
                default:
                    throw new AssertionError("typeSig " + abstractC22664.mo9097());
            }
        }
        C23191 c23191 = (C23191) abstractC22664;
        mo17245('(');
        for (C14769 c14769 = c23191.f75155; c14769.m35550(); c14769 = c14769.f48336) {
            mo25984((AbstractC22664) c14769.f48335);
        }
        mo17245(')');
        mo25984(c23191.f75156);
        for (C14769 c147610 = c23191.f75157; c147610.m35550(); c147610 = c147610.f48336) {
            if (((AbstractC22664) c147610.f48335).m51067(EnumC21172.TYPEVAR)) {
                for (C14769 c147611 = c23191.f75157; c147611.m35550(); c147611 = c147611.f48336) {
                    mo17245('^');
                    mo25984((AbstractC22664) c147611.f48335);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25982(AbstractC22664 abstractC22664) {
        AbstractC19728 abstractC19728M45429;
        C10510 c10510 = (C10510) abstractC22664;
        C24550 c24550 = (C24550) c10510.f73596;
        mo25983(c24550);
        AbstractC22664 abstractC22664Mo23449 = c10510.mo23449();
        if (abstractC22664Mo23449.mo9323().m35550()) {
            EnumC13603 enumC13603 = c24550.f38069.f38066;
            EnumC13603 enumC13604 = EnumC13603.f43218;
            C24705 c24705 = this.f32225;
            boolean z = enumC13603 == enumC13604 || c24550.f38072 == c24705.f79964.f49799;
            if (z) {
                abstractC22664Mo23449 = c24705.m55132(abstractC22664Mo23449);
            }
            m25982(abstractC22664Mo23449);
            mo17245(z ? '$' : '.');
            C11972.m30026(c24550.f79578.m45432(c24550.f38069.m29558().f79578));
            if (z) {
                abstractC19728M45429 = c24550.f79578.m45429(c24550.f38069.m29558().f79578.mo42395() + 1, c24550.f79578.mo42395());
            } else {
                abstractC19728M45429 = c24550.f38072;
            }
            mo17246(abstractC19728M45429);
        } else {
            mo17247(C20693.m47330(c24550.f79578));
        }
        if (c10510.mo15882().m35550()) {
            mo17245('<');
            for (C14769 c14769Mo15882 = c10510.mo15882(); c14769Mo15882.m35550(); c14769Mo15882 = c14769Mo15882.f48336) {
                mo25984((AbstractC22664) c14769Mo15882.f48335);
            }
            mo17245('>');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25981(C14769 c14769) {
        mo17245('<');
        while (c14769.m35550()) {
            C17969 c17969 = (C17969) c14769.f48335;
            mo17246(c17969.f73596.f38072);
            C14769 c14769M55097 = this.f32225.m55097(c17969);
            if ((((AbstractC22664) c14769M55097.f48335).f73596.mo29591() & 512) != 0) {
                mo17245(':');
            }
            while (c14769M55097.m35550()) {
                mo17245(':');
                mo25984((AbstractC22664) c14769M55097.f48335);
                c14769M55097 = c14769M55097.f48336;
            }
            c14769 = c14769.f48336;
        }
        mo17245('>');
    }
}
