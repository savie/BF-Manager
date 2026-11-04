package l;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5VL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2227 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12667 f7305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0515 f7306;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Comparator f7307 = new C5956();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11921 f7308;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10209 f7309;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3718 f7310;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23856 f7311;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19647 f7312;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15650 f7313;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC25348 f7314;

    public C2227(C19647 c19647, C10209 c10209, InterfaceC3718 interfaceC3718, C14816 c14816, C9092 c9092, C5868 c5868, C17054 c17054, C11087 c11087, C1481 c1481) {
        this.f7312 = c19647;
        this.f7309 = c10209;
        this.f7310 = interfaceC3718;
        this.f7305 = c14816;
        this.f7313 = c9092;
        this.f7314 = c5868;
        this.f7311 = c17054;
        this.f7308 = c11087;
        this.f7306 = c1481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private short m7582(EnumC22631 enumC22631) {
        C19647 c19647 = this.f7312;
        Short shM45294 = c19647.m45294(enumC22631);
        if (shM45294 == null) {
            throw new C23044(null, "Instruction %s is invalid for api %d", enumC22631.f73509, Integer.valueOf(c19647.f63286));
        }
        return shM45294.shortValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7585(InterfaceC0956 interfaceC0956) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC0956.mo30864()));
            c10209.write(interfaceC0956.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7596(InterfaceC9158 interfaceC9158) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC9158.mo30864()));
            c10209.write(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7587(InterfaceC2447 interfaceC2447) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC2447.mo30864()));
            c10209.write((interfaceC2447.mo1546() << 4) | interfaceC2447.mo1542());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7595(InterfaceC8413 interfaceC8413) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC8413.mo30864()));
            c10209.write(interfaceC8413.mo1542());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7593(InterfaceC6922 interfaceC6922) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC6922.mo30864()));
            c10209.write((interfaceC6922.mo1541() << 4) | interfaceC6922.mo1542());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7603(InterfaceC13633 interfaceC13633) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC13633.mo30864()));
            c10209.write(interfaceC13633.mo20338());
            c10209.m26348(m7581(interfaceC13633.mo2771(), interfaceC13633.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7590(InterfaceC4575 interfaceC4575) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC4575.mo30864()));
            c10209.write(0);
            c10209.writeShort(interfaceC4575.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7614(InterfaceC21729 interfaceC21729) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC21729.mo30864()));
            c10209.write(interfaceC21729.mo1542());
            c10209.m26348(m7581(interfaceC21729.mo2771(), interfaceC21729.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7599(InterfaceC10540 interfaceC10540) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC10540.mo30864()));
            c10209.write(interfaceC10540.mo1542());
            c10209.writeShort(interfaceC10540.mo12624());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7615(InterfaceC22475 interfaceC22475) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC22475.mo30864()));
            c10209.write(interfaceC22475.mo1542());
            c10209.writeShort(interfaceC22475.mo12624());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7611(InterfaceC19491 interfaceC19491) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC19491.mo30864()));
            c10209.write(interfaceC19491.mo1542());
            c10209.writeShort(interfaceC19491.mo1546());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7605(InterfaceC15015 interfaceC15015) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC15015.mo30864()));
            c10209.write(interfaceC15015.mo1542());
            c10209.writeShort(interfaceC15015.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7602(InterfaceC12778 interfaceC12778) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC12778.mo30864()));
            c10209.write(interfaceC12778.mo1542());
            c10209.write(interfaceC12778.mo1541());
            c10209.write(interfaceC12778.mo1546());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7591(InterfaceC5321 interfaceC5321) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC5321.mo30864()));
            c10209.write(interfaceC5321.mo1542() | (interfaceC5321.mo1541() << 4));
            c10209.m26348(m7581(interfaceC5321.mo2771(), interfaceC5321.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7586(InterfaceC1592 interfaceC1592) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC1592.mo30864()));
            c10209.write(interfaceC1592.mo1542() | (interfaceC1592.mo1541() << 4));
            c10209.m26348(interfaceC1592.mo17032());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7600(InterfaceC11286 interfaceC11286) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC11286.mo30864()));
            c10209.write(interfaceC11286.mo1542() | (interfaceC11286.mo1541() << 4));
            c10209.writeShort(interfaceC11286.mo1546());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7618(InterfaceC24713 interfaceC24713) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC24713.mo30864()));
            c10209.write(interfaceC24713.mo1542() | (interfaceC24713.mo1541() << 4));
            c10209.writeShort(interfaceC24713.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7607(InterfaceC16507 interfaceC16507) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC16507.mo30864()));
            c10209.write(interfaceC16507.mo1542());
            c10209.m26348(interfaceC16507.mo1541());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7608(InterfaceC17253 interfaceC17253) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC17253.mo30864()));
            c10209.write(interfaceC17253.mo1542());
            c10209.write(interfaceC17253.mo1541());
            c10209.write(interfaceC17253.mo8187());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7606(InterfaceC15761 interfaceC15761) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC15761.mo30864()));
            c10209.write(0);
            C10209.m26338(c10209, interfaceC15761.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7616(InterfaceC23221 interfaceC23221) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC23221.mo30864()));
            c10209.write(interfaceC23221.mo1542());
            C10209.m26338(c10209, m7581(interfaceC23221.mo2771(), interfaceC23221.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7588(InterfaceC3083 interfaceC3083) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC3083.mo30864()));
            c10209.write(interfaceC3083.mo1542());
            C10209.m26338(c10209, interfaceC3083.mo1546());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7612(InterfaceC20237 interfaceC20237) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC20237.mo30864()));
            c10209.write(interfaceC20237.mo1542());
            C10209.m26338(c10209, interfaceC20237.mo11703());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7601(InterfaceC12032 interfaceC12032) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC12032.mo30864()));
            c10209.write(0);
            c10209.m26348(interfaceC12032.mo1542());
            c10209.m26348(interfaceC12032.mo1541());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7592(InterfaceC6067 interfaceC6067) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC6067.mo30864()));
            c10209.write(interfaceC6067.mo7064() | (interfaceC6067.mo1655() << 4));
            c10209.m26348(m7581(interfaceC6067.mo2771(), interfaceC6067.getReference()));
            c10209.write(interfaceC6067.mo7063() | (interfaceC6067.mo7065() << 4));
            c10209.write((interfaceC6067.mo7062() << 4) | interfaceC6067.mo7061());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7617(InterfaceC23967 interfaceC23967) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC23967.mo30864()));
            c10209.write(interfaceC23967.mo7064() | (interfaceC23967.mo1655() << 4));
            c10209.m26348(interfaceC23967.mo18517());
            c10209.write(interfaceC23967.mo7063() | (interfaceC23967.mo7065() << 4));
            c10209.write((interfaceC23967.mo7062() << 4) | interfaceC23967.mo7061());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7589(InterfaceC3829 interfaceC3829) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC3829.mo30864()));
            c10209.write(interfaceC3829.mo7064() | (interfaceC3829.mo1655() << 4));
            c10209.m26348(interfaceC3829.mo17155());
            c10209.write(interfaceC3829.mo7063() | (interfaceC3829.mo7065() << 4));
            c10209.write((interfaceC3829.mo7062() << 4) | interfaceC3829.mo7061());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7604(InterfaceC14269 interfaceC14269) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC14269.mo30864()));
            c10209.write(interfaceC14269.mo1655());
            c10209.m26348(m7581(interfaceC14269.mo2771(), interfaceC14269.getReference()));
            c10209.m26348(interfaceC14269.mo2772());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7613(InterfaceC20983 interfaceC20983) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC20983.mo30864()));
            c10209.write(interfaceC20983.mo1655());
            c10209.m26348(interfaceC20983.mo18517());
            c10209.m26348(interfaceC20983.mo2772());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7609(InterfaceC17999 interfaceC17999) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC17999.mo30864()));
            c10209.write(interfaceC17999.mo1655());
            c10209.m26348(interfaceC17999.mo17155());
            c10209.m26348(interfaceC17999.mo2772());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7583(InterfaceC0100 interfaceC0100) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC0100.mo30864()));
            c10209.write(interfaceC0100.mo7064() | (interfaceC0100.mo1655() << 4));
            c10209.m26348(m7581(interfaceC0100.mo2771(), interfaceC0100.getReference()));
            c10209.write(interfaceC0100.mo7063() | (interfaceC0100.mo7065() << 4));
            c10209.write(interfaceC0100.mo7061() | (interfaceC0100.mo7062() << 4));
            c10209.m26348(m7581(interfaceC0100.mo2773(), interfaceC0100.mo2769()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7594(InterfaceC7558 interfaceC7558) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC7558.mo30864()));
            c10209.write(interfaceC7558.mo1655());
            c10209.m26348(m7581(interfaceC7558.mo2771(), interfaceC7558.getReference()));
            c10209.m26348(interfaceC7558.mo2772());
            c10209.m26348(m7581(interfaceC7558.mo2773(), interfaceC7558.mo2769()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7610(InterfaceC18745 interfaceC18745) {
        C10209 c10209 = this.f7309;
        try {
            c10209.write(m7582(interfaceC18745.mo30864()));
            c10209.write(interfaceC18745.mo1542());
            long jMo1545 = interfaceC18745.mo1545();
            C10209.m26338(c10209, (int) jMo1545);
            C10209.m26338(c10209, (int) (jMo1545 >> 32));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7598(InterfaceC9904 interfaceC9904) {
        C10209 c10209 = this.f7309;
        try {
            c10209.m26348((int) m7582(interfaceC9904.mo30864()));
            c10209.m26348(interfaceC9904.mo3032());
            List listMo3034 = interfaceC9904.mo3034();
            C10209.m26338(c10209, listMo3034.size());
            int iMo3032 = interfaceC9904.mo3032();
            if (iMo3032 == 1) {
                Iterator it = listMo3034.iterator();
                while (it.hasNext()) {
                    c10209.write(((Number) it.next()).byteValue());
                }
            } else if (iMo3032 == 2) {
                Iterator it2 = listMo3034.iterator();
                while (it2.hasNext()) {
                    c10209.writeShort(((Number) it2.next()).shortValue());
                }
            } else if (iMo3032 == 4) {
                Iterator it3 = listMo3034.iterator();
                while (it3.hasNext()) {
                    C10209.m26338(c10209, ((Number) it3.next()).intValue());
                }
            } else if (iMo3032 == 8) {
                Iterator it4 = listMo3034.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    C10209.m26338(c10209, (int) jLongValue);
                    C10209.m26338(c10209, (int) (jLongValue >> 32));
                }
            }
            if ((c10209.getPosition() & 1) != 0) {
                c10209.write(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7584(InterfaceC0846 interfaceC0846) {
        C10209 c10209 = this.f7309;
        try {
            c10209.m26344(0);
            c10209.m26344(m7582(interfaceC0846.mo30864()) >> 8);
            AbstractC1928 abstractC1928M6613 = AbstractC1928.m6613(AbstractC18753.m43551(this.f7307), interfaceC0846.mo20143());
            c10209.m26348(abstractC1928M6613.size());
            AbstractC14956 abstractC14956ListIterator = abstractC1928M6613.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                C10209.m26338(c10209, ((InterfaceC3939) abstractC14956ListIterator.next()).getKey());
            }
            AbstractC14956 abstractC14956ListIterator2 = abstractC1928M6613.listIterator(0);
            while (abstractC14956ListIterator2.hasNext()) {
                C10209.m26338(c10209, ((InterfaceC3939) abstractC14956ListIterator2.next()).getOffset());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7597(InterfaceC9794 interfaceC9794) {
        C10209 c10209 = this.f7309;
        try {
            c10209.m26344(0);
            c10209.m26344(m7582(interfaceC9794.mo30864()) >> 8);
            List listMo20143 = interfaceC9794.mo20143();
            c10209.m26348(listMo20143.size());
            if (listMo20143.size() == 0) {
                C10209.m26338(c10209, 0);
                return;
            }
            C10209.m26338(c10209, ((InterfaceC3939) listMo20143.get(0)).getKey());
            Iterator it = listMo20143.iterator();
            while (it.hasNext()) {
                C10209.m26338(c10209, ((InterfaceC3939) it.next()).getOffset());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m7581(int i, InterfaceC10824 interfaceC10824) {
        switch (i) {
            case 0:
                return this.f7310.mo12103((InterfaceC22759) interfaceC10824);
            case 1:
                return ((C14816) this.f7305).m35669((InterfaceC19775) interfaceC10824);
            case 2:
                return ((C9092) this.f7313).mo5275((InterfaceC8304) interfaceC10824);
            case 3:
                return ((C5868) this.f7314).mo5275((InterfaceC4859) interfaceC10824);
            case 4:
                return ((C17054) this.f7311).mo5275((InterfaceC13524) interfaceC10824);
            case 5:
                return ((C1481) this.f7306).mo5275((InterfaceC2338) interfaceC10824);
            case 6:
                return ((C11087) this.f7308).mo5275((InterfaceC6813) interfaceC10824);
            default:
                throw new C23044(null, "Unknown reference type: %d", Integer.valueOf(i));
        }
    }
}
