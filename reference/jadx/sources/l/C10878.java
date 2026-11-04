package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HIXW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10878 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1610 f34426;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10132 f34427;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "TypeInferenceVisitor";
    }

    static {
        C16980.m40037(C10878.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f34426 = c1610;
        this.f34427 = c1610.m5685();
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        try {
            m27624(c2551);
            m27626(c2551);
            m27625(c2551);
        } catch (BootstrapMethodError e) {
            e = e;
            C23977.m53506(c2551, "Type inference failed with stack overflow", new C2631(e.getMessage()));
        } catch (Exception e2) {
            C23977.m53506(c2551, "Type inference failed", e2);
        } catch (StackOverflowError e3) {
            e = e3;
            C23977.m53506(c2551, "Type inference failed with stack overflow", new C2631(e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27626(C2551 c2551) {
        List listM8490 = c2551.m8490();
        C4937.forEach(listM8490, new Consumer() { // from class: l.۬ܳ᩵
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C10878.m27621(this.f44156, (C17973) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        C4937.forEach(listM8490, new C4913());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27625(C2551 c2551) {
        List listM8490 = c2551.m8490();
        C4937.forEach(listM8490, new C7158(this, c2551, 1));
        C4937.forEach(listM8490, new C18697(this, c2551));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27623(C10878 c10878, C2551 c2551, C17973 c17973) {
        try {
            AbstractC1566 abstractC1566M41941 = c17973.m41941();
            if (abstractC1566M41941 != null) {
                c10878.f34427.m26146(c2551, c17973, abstractC1566M41941);
            }
        } catch (C2631 e) {
            throw e;
        } catch (Exception e2) {
            c2551.m31134("Failed to set immutable type for var: " + c17973, e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27620(C10878 c10878, C2551 c2551, C17973 c17973) {
        try {
            c10878.m27619(c2551, c17973);
        } catch (C2631 e) {
            throw e;
        } catch (Exception e2) {
            c2551.m31134("Failed to calculate best type for var: " + c17973, e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27619(C2551 c2551, C17973 c17973) {
        C15867 c15867Max = C1170.stream(c17973.m41943().m51443()).map(new C3900(8)).filter(new C22075(0)).max(this.f34427.m26142().m23402());
        if (c15867Max.isEmpty()) {
            return;
        }
        this.f34427.m26140(c2551, c17973, (AbstractC1566) c15867Max.get());
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:91:0x021a  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27621(C10878 c10878, C17973 c17973) {
        C24927 c24927M5671;
        C4000 c4000;
        AbstractC1566 abstractC1566Mo8519;
        InterfaceC20640 c7961;
        InterfaceC20640 c7962;
        InterfaceC21197 interfaceC21197M19301;
        C22813 c22813M41943 = c17973.m41943();
        c22813M41943.m51443().clear();
        C6041 c6041M41930 = c17973.m41930();
        AbstractC1566 abstractC1566M17537 = c6041M41930.m17537();
        if (abstractC1566M17537 == null) {
            C18959 c18959M39118 = c6041M41930.m39118();
            if (c18959M39118 != null && c18959M39118.m44027() != null) {
                switch (C22067.f71144[c18959M39118.getType().ordinal()]) {
                    case 1:
                        m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, (AbstractC1566) ((C3319) c18959M39118).m10937(), 0));
                        break;
                    case 2:
                        C6787 c6787 = (C6787) c18959M39118;
                        m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, (c6787.m18925() && (c24927M5671 = c10878.f34426.m5671(c6787.m18927())) != null && c24927M5671.mo17865(EnumC1763.DONT_GENERATE) && (c4000 = (C4000) c24927M5671.mo17862((InterfaceC2157) C11457.f36004)) != null && c4000.m12937() == EnumC24138.CONSTRUCTOR) ? c4000.m12935() : c6787.m18927().getType(), 0));
                        break;
                    case 3:
                        m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, ((C23195) c18959M39118.mo44035(0)).getType(), 0));
                        break;
                    case 4:
                        C10733 c10733 = (C10733) c18959M39118.mo17862((InterfaceC2157) C11457.f36036);
                        if (c10733 != null) {
                            Iterator it = c10733.m27337().m45372().iterator();
                            while (it.hasNext()) {
                                m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, ((C1345) it.next()).getType(), 0));
                            }
                        } else {
                            m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, c18959M39118.m44027().m17531(), 0));
                        }
                        break;
                    case 5:
                        C21219 c21219 = (C21219) c18959M39118;
                        AbstractC1566 abstractC1566M49698 = c21219.mo18926().m49698();
                        InterfaceC21197 interfaceC21197M19302 = c10878.f34426.m5683().m19301(c21219);
                        if (interfaceC21197M19302 == null || (abstractC1566Mo8519 = interfaceC21197M19302.mo8519()) == null || !abstractC1566Mo8519.m5552()) {
                            abstractC1566Mo8519 = null;
                        }
                        if (abstractC1566Mo8519 == null) {
                            c7961 = new C7961(EnumC15418.ASSIGN, abstractC1566M49698, 0);
                        } else {
                            if (abstractC1566Mo8519.m5567()) {
                                EnumC0336 enumC0336M48374 = c21219.m48374();
                                if (c21219.m44039() != 0 && enumC0336M48374 != EnumC0336.STATIC && enumC0336M48374 != EnumC0336.SUPER) {
                                    c7961 = new C10197(c10878.f34426, c21219, abstractC1566Mo8519);
                                }
                            } else {
                                abstractC1566M49698 = abstractC1566Mo8519;
                            }
                            c7961 = new C7961(EnumC15418.ASSIGN, abstractC1566M49698, 0);
                        }
                        m27622(c22813M41943, c7961);
                        break;
                    case 6:
                        C3319 c3319 = (C3319) c18959M39118;
                        AbstractC1566 abstractC1566M17531 = c3319.m44027().m17531();
                        m27622(c22813M41943, abstractC1566M17531.m5567() ? new C19148(c10878.f34426, c3319, abstractC1566M17531) : new C7961(EnumC15418.ASSIGN, abstractC1566M17531, 0));
                        break;
                    case 7:
                        if (!c18959M39118.mo17865(EnumC1763.SOFT_CAST)) {
                            m27622(c22813M41943, new C0503(c10878.f34426, (C3319) c18959M39118));
                        }
                        break;
                    default:
                        m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, c18959M39118.m44027().m17531(), 0));
                        break;
                }
            } else {
                m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, c6041M41930.m17531(), 0));
            }
        } else {
            m27622(c22813M41943, new C7961(EnumC15418.ASSIGN, abstractC1566M17537, 0));
        }
        for (C6041 c6041 : c17973.m41946()) {
            C18959 c18959M39119 = c6041.m39118();
            if (c18959M39119 == null) {
                c7962 = null;
            } else if (c18959M39119 instanceof AbstractC15251) {
                AbstractC15251 abstractC15251 = (AbstractC15251) c18959M39119;
                AbstractC16481 abstractC16481Mo13131 = abstractC15251.mo13131();
                if (abstractC16481Mo13131 == null || (interfaceC21197M19301 = c10878.f34426.m5683().m19301(abstractC15251)) == null) {
                    c7962 = null;
                } else if (abstractC16481Mo13131 != c6041) {
                    AbstractC1566 abstractC1566 = (AbstractC1566) interfaceC21197M19301.mo8537().get(abstractC15251.m44020(c6041) - abstractC15251.mo13126());
                    if (abstractC1566.m5567()) {
                        c7962 = new C1249(c10878.f34426, abstractC15251, c6041, abstractC1566);
                    } else {
                        c7962 = null;
                    }
                } else if (interfaceC21197M19301 instanceof C2551) {
                    c7962 = new C7961(EnumC15418.USE, C6990.m19295((C2551) interfaceC21197M19301).getType(), 0);
                } else {
                    c7962 = null;
                }
                if (c7962 == null) {
                    if (c18959M39119.getType() == EnumC24203.CHECK_CAST) {
                    }
                    c7962 = new C7961(EnumC15418.USE, c6041.m17531(), 0);
                }
            } else if (c18959M39119.getType() == EnumC24203.CHECK_CAST || !c18959M39119.mo17865(EnumC1763.SOFT_CAST)) {
                c7962 = new C7961(EnumC15418.USE, c6041.m17531(), 0);
            } else {
                c7962 = null;
            }
            m27622(c22813M41943, c7962);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27622(C22813 c22813, InterfaceC20640 interfaceC20640) {
        if (interfaceC20640 == null) {
            return;
        }
        if ((interfaceC20640 instanceof InterfaceC12435) || interfaceC20640.getType() != AbstractC1566.f5420) {
            c22813.m51443().add(interfaceC20640);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m27624(C2551 c2551) {
        AbstractC1566 abstractC1566M17531;
        for (C17973 c17973 : c2551.m8490()) {
            if (c17973.m41930().mo17865(EnumC1763.IMMUTABLE_TYPE)) {
                abstractC1566M17531 = c17973.m41930().m17531();
            } else {
                Iterator it = c17973.m41946().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        abstractC1566M17531 = null;
                        break;
                    }
                    C6041 c6041 = (C6041) it.next();
                    if (c6041.mo17865(EnumC1763.IMMUTABLE_TYPE)) {
                        abstractC1566M17531 = c6041.m17531();
                        break;
                    }
                }
            }
            if (abstractC1566M17531 != null) {
                c17973.m41932(abstractC1566M17531);
            }
        }
    }
}
