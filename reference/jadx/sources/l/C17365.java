package l;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17365 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC3253 f55249;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11016 f55250;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13569 f55251;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3958 f55252;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7474 f55253;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15249 f55254;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6076 f55255;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Comparator f55256 = new C12427();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0431 f55257;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC9605 f55258;

    public C17365(C7474 c7474, C15249 c15249, InterfaceC3253 interfaceC3253, C22596 c22596, C17884 c17884, C12241 c12241, C23530 c23530, C20707 c20707, C21329 c21329) {
        this.f55253 = c7474;
        this.f55254 = c15249;
        this.f55249 = interfaceC3253;
        this.f55251 = c22596;
        this.f55257 = c17884;
        this.f55250 = c12241;
        this.f55258 = c23530;
        this.f55255 = c20707;
        this.f55252 = c21329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private short m40402(EnumC10297 enumC10297) {
        C7474 c7474 = this.f55253;
        Short shM19964 = c7474.m19964(enumC10297);
        if (shM19964 == null) {
            throw new C20749(null, "Instruction %s is invalid for api %d", enumC10297.f35326, Integer.valueOf(c7474.f24881));
        }
        return shM19964.shortValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40425(InterfaceC15270 interfaceC15270) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC15270.mo5435()));
            c15249.write(interfaceC15270.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40434(InterfaceC21619 interfaceC21619) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC21619.mo5435()));
            c15249.write(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40429(InterfaceC18091 interfaceC18091) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC18091.mo5435()));
            c15249.write((interfaceC18091.mo4063() << 4) | interfaceC18091.mo1140());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40430(InterfaceC18797 interfaceC18797) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC18797.mo5435()));
            c15249.write(interfaceC18797.mo1140());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40414(InterfaceC8214 interfaceC8214) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC8214.mo5435()));
            c15249.write((interfaceC8214.mo1144() << 4) | interfaceC8214.mo1140());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40431(InterfaceC19503 interfaceC19503) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC19503.mo5435()));
            c15249.write(interfaceC19503.mo9148());
            c15249.m36528(m40401(interfaceC19503.mo1143(), interfaceC19503.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40415(InterfaceC8920 interfaceC8920) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC8920.mo5435()));
            c15249.write(0);
            c15249.writeShort(interfaceC8920.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40417(InterfaceC10331 interfaceC10331) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC10331.mo5435()));
            c15249.write(interfaceC10331.mo1140());
            c15249.m36528(m40401(interfaceC10331.mo1143(), interfaceC10331.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40413(InterfaceC7508 interfaceC7508) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC7508.mo5435()));
            c15249.write(interfaceC7508.mo1140());
            c15249.writeShort(interfaceC7508.mo7625());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40433(InterfaceC20914 interfaceC20914) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC20914.mo5435()));
            c15249.write(interfaceC20914.mo1140());
            c15249.writeShort(interfaceC20914.mo7625());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40426(InterfaceC15976 interfaceC15976) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC15976.mo5435()));
            c15249.write(interfaceC15976.mo1140());
            c15249.writeShort(interfaceC15976.mo4063());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40432(InterfaceC20209 interfaceC20209) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC20209.mo5435()));
            c15249.write(interfaceC20209.mo1140());
            c15249.writeShort(interfaceC20209.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40403(InterfaceC0452 interfaceC0452) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC0452.mo5435()));
            c15249.write(interfaceC0452.mo1140());
            c15249.write(interfaceC0452.mo1144());
            c15249.write(interfaceC0452.mo4063());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40427(InterfaceC16681 interfaceC16681) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC16681.mo5435()));
            c15249.write(interfaceC16681.mo1140() | (interfaceC16681.mo1144() << 4));
            c15249.m36528(m40401(interfaceC16681.mo1143(), interfaceC16681.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40420(InterfaceC12448 interfaceC12448) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC12448.mo5435()));
            c15249.write(interfaceC12448.mo1140() | (interfaceC12448.mo1144() << 4));
            c15249.m36528(interfaceC12448.mo11355());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40428(InterfaceC17386 interfaceC17386) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC17386.mo5435()));
            c15249.write(interfaceC17386.mo1140() | (interfaceC17386.mo1144() << 4));
            c15249.writeShort(interfaceC17386.mo4063());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40411(InterfaceC6097 interfaceC6097) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC6097.mo5435()));
            c15249.write(interfaceC6097.mo1140() | (interfaceC6097.mo1144() << 4));
            c15249.writeShort(interfaceC6097.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40418(InterfaceC11037 interfaceC11037) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC11037.mo5435()));
            c15249.write(interfaceC11037.mo1140());
            c15249.m36528(interfaceC11037.mo1144());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40438(InterfaceC23737 interfaceC23737) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC23737.mo5435()));
            c15249.write(interfaceC23737.mo1140());
            c15249.write(interfaceC23737.mo1144());
            c15249.write(interfaceC23737.mo26898());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40423(InterfaceC14565 interfaceC14565) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC14565.mo5435()));
            c15249.write(0);
            C15249.m36518(c15249, interfaceC14565.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40405(InterfaceC1863 interfaceC1863) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC1863.mo5435()));
            c15249.write(interfaceC1863.mo1140());
            C15249.m36518(c15249, m40401(interfaceC1863.mo1143(), interfaceC1863.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40416(InterfaceC9626 interfaceC9626) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC9626.mo5435()));
            c15249.write(interfaceC9626.mo1140());
            C15249.m36518(c15249, interfaceC9626.mo4063());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40407(InterfaceC3274 interfaceC3274) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC3274.mo5435()));
            c15249.write(interfaceC3274.mo1140());
            C15249.m36518(c15249, interfaceC3274.mo8965());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40409(InterfaceC4623 interfaceC4623) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC4623.mo5435()));
            c15249.write(0);
            c15249.m36528(interfaceC4623.mo1140());
            c15249.m36528(interfaceC4623.mo1144());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40422(InterfaceC13797 interfaceC13797) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC13797.mo5435()));
            c15249.write(interfaceC13797.mo3088() | (interfaceC13797.mo2107() << 4));
            c15249.m36528(m40401(interfaceC13797.mo1143(), interfaceC13797.getReference()));
            c15249.write(interfaceC13797.mo3085() | (interfaceC13797.mo3087() << 4));
            c15249.write((interfaceC13797.mo3086() << 4) | interfaceC13797.mo3089());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40419(InterfaceC11680 interfaceC11680) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC11680.mo5435()));
            c15249.write(interfaceC11680.mo3088() | (interfaceC11680.mo2107() << 4));
            c15249.m36528(interfaceC11680.mo14567());
            c15249.write(interfaceC11680.mo3085() | (interfaceC11680.mo3087() << 4));
            c15249.write((interfaceC11680.mo3086() << 4) | interfaceC11680.mo3089());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40406(InterfaceC2506 interfaceC2506) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC2506.mo5435()));
            c15249.write(interfaceC2506.mo3088() | (interfaceC2506.mo2107() << 4));
            c15249.m36528(interfaceC2506.mo2110());
            c15249.write(interfaceC2506.mo3085() | (interfaceC2506.mo3087() << 4));
            c15249.write((interfaceC2506.mo3086() << 4) | interfaceC2506.mo3089());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40410(InterfaceC5329 interfaceC5329) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC5329.mo5435()));
            c15249.write(interfaceC5329.mo2107());
            c15249.m36528(m40401(interfaceC5329.mo1143(), interfaceC5329.getReference()));
            c15249.m36528(interfaceC5329.mo2109());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40435(InterfaceC22263 interfaceC22263) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC22263.mo5435()));
            c15249.write(interfaceC22263.mo2107());
            c15249.m36528(interfaceC22263.mo14567());
            c15249.m36528(interfaceC22263.mo2109());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40404(InterfaceC1095 interfaceC1095) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC1095.mo5435()));
            c15249.write(interfaceC1095.mo2107());
            c15249.m36528(interfaceC1095.mo2110());
            c15249.m36528(interfaceC1095.mo2109());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40421(InterfaceC13091 interfaceC13091) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC13091.mo5435()));
            c15249.write(interfaceC13091.mo3088() | (interfaceC13091.mo2107() << 4));
            c15249.m36528(m40401(interfaceC13091.mo1143(), interfaceC13091.getReference()));
            c15249.write(interfaceC13091.mo3085() | (interfaceC13091.mo3087() << 4));
            c15249.write(interfaceC13091.mo3089() | (interfaceC13091.mo3086() << 4));
            c15249.m36528(m40401(interfaceC13091.mo3895(), interfaceC13091.mo3896()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40408(InterfaceC3917 interfaceC3917) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC3917.mo5435()));
            c15249.write(interfaceC3917.mo2107());
            c15249.m36528(m40401(interfaceC3917.mo1143(), interfaceC3917.getReference()));
            c15249.m36528(interfaceC3917.mo2109());
            c15249.m36528(m40401(interfaceC3917.mo3895(), interfaceC3917.mo3896()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40412(InterfaceC6740 interfaceC6740) {
        C15249 c15249 = this.f55254;
        try {
            c15249.write(m40402(interfaceC6740.mo5435()));
            c15249.write(interfaceC6740.mo1140());
            long jMo4062 = interfaceC6740.mo4062();
            C15249.m36518(c15249, (int) jMo4062);
            C15249.m36518(c15249, (int) (jMo4062 >> 32));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40437(InterfaceC23031 interfaceC23031) {
        C15249 c15249 = this.f55254;
        try {
            c15249.m36528((int) m40402(interfaceC23031.mo5435()));
            c15249.m36528(interfaceC23031.mo16087());
            List listMo16088 = interfaceC23031.mo16088();
            C15249.m36518(c15249, listMo16088.size());
            int iMo16087 = interfaceC23031.mo16087();
            if (iMo16087 == 1) {
                Iterator it = listMo16088.iterator();
                while (it.hasNext()) {
                    c15249.write(((Number) it.next()).byteValue());
                }
            } else if (iMo16087 == 2) {
                Iterator it2 = listMo16088.iterator();
                while (it2.hasNext()) {
                    c15249.writeShort(((Number) it2.next()).shortValue());
                }
            } else if (iMo16087 == 4) {
                Iterator it3 = listMo16088.iterator();
                while (it3.hasNext()) {
                    C15249.m36518(c15249, ((Number) it3.next()).intValue());
                }
            } else if (iMo16087 == 8) {
                Iterator it4 = listMo16088.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    C15249.m36518(c15249, (int) jLongValue);
                    C15249.m36518(c15249, (int) (jLongValue >> 32));
                }
            }
            if ((c15249.getPosition() & 1) != 0) {
                c15249.write(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40424(InterfaceC15208 interfaceC15208) {
        C15249 c15249 = this.f55254;
        try {
            c15249.m36524(0);
            c15249.m36524(m40402(interfaceC15208.mo5435()) >> 8);
            AbstractC22433 abstractC22433M49798 = AbstractC22433.m49798(AbstractC10959.m27715(this.f55256), interfaceC15208.mo14955());
            c15249.m36528(abstractC22433M49798.size());
            AbstractC16706 abstractC16706ListIterator = abstractC22433M49798.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                C15249.m36518(c15249, ((InterfaceC2568) abstractC16706ListIterator.next()).getKey());
            }
            AbstractC16706 abstractC16706ListIterator2 = abstractC22433M49798.listIterator(0);
            while (abstractC16706ListIterator2.hasNext()) {
                C15249.m36518(c15249, ((InterfaceC2568) abstractC16706ListIterator2.next()).mo8019());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40436(InterfaceC22969 interfaceC22969) {
        C15249 c15249 = this.f55254;
        try {
            c15249.m36524(0);
            c15249.m36524(m40402(interfaceC22969.mo5435()) >> 8);
            List listMo14955 = interfaceC22969.mo14955();
            c15249.m36528(listMo14955.size());
            if (listMo14955.size() == 0) {
                C15249.m36518(c15249, 0);
                return;
            }
            C15249.m36518(c15249, ((InterfaceC2568) listMo14955.get(0)).getKey());
            Iterator it = listMo14955.iterator();
            while (it.hasNext()) {
                C15249.m36518(c15249, ((InterfaceC2568) it.next()).mo8019());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m40401(int i, InterfaceC7446 interfaceC7446) {
        switch (i) {
            case 0:
                return this.f55249.mo9732((InterfaceC20852) interfaceC7446);
            case 1:
                return ((C22596) this.f55251).m50096((InterfaceC15914) interfaceC7446);
            case 2:
                return ((C17884) this.f55257).mo24178((InterfaceC18735) interfaceC7446);
            case 3:
                return ((C12241) this.f55250).mo24178((InterfaceC8858) interfaceC7446);
            case 4:
                return ((C23530) this.f55258).mo24178((InterfaceC19441) interfaceC7446);
            case 5:
                return ((C21329) this.f55252).mo24178((InterfaceC18029) interfaceC7446);
            case 6:
                return ((C20707) this.f55255).mo24178((InterfaceC8152) interfaceC7446);
            default:
                throw new C20749(null, "Unknown reference type: %d", Integer.valueOf(i));
        }
    }
}
