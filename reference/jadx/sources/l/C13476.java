package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6GO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13476 extends C0052 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f42877 = C16980.m40037(C13476.class);

    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33155(C9067 c9067, InterfaceC3145 interfaceC3145, boolean z) {
        InterfaceC6281 interfaceC6281;
        if (z) {
            interfaceC3145.mo10277(c9067.mo1256());
        } else {
            interfaceC3145.mo10284(c9067.mo1256());
        }
        boolean zMo17865 = c9067.mo17865(EnumC1763.COMMENT_OUT);
        if (zMo17865) {
            interfaceC3145.add("// ");
        }
        interfaceC3145.add("if (");
        new C14221(this.f909, this.f907).m34512(interfaceC3145, c9067.m1251());
        interfaceC3145.add(") {");
        if (interfaceC3145.mo10281()) {
            List listMo1257 = c9067.mo1257();
            if (!listMo1257.isEmpty()) {
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) listMo1257.get(0));
                C17620.m41271(interfaceC3145, c18959M52200);
                C5492.m16319(interfaceC3145, this.f908, c18959M52200);
            }
        }
        m33151(interfaceC3145, c9067.m24203());
        if (zMo17865) {
            interfaceC3145.mo10283("// }");
        } else {
            interfaceC3145.mo10280();
        }
        InterfaceC6281 interfaceC6281M24200 = c9067.m24200();
        if (C20531.m47075(interfaceC6281M24200)) {
            interfaceC3145.add(" else ");
            if (interfaceC6281M24200.mo17865(EnumC1763.ELSE_IF_CHAIN)) {
                if (interfaceC6281M24200 instanceof C12050) {
                    ArrayList arrayList = (ArrayList) ((C12050) interfaceC6281M24200).mo19035();
                    if (arrayList.size() == 1) {
                        Object obj = arrayList.get(0);
                        while (true) {
                            interfaceC6281 = (InterfaceC6281) obj;
                            if (!(interfaceC6281 instanceof C12050)) {
                                break;
                            }
                            ArrayList arrayList2 = (ArrayList) ((C12050) interfaceC6281).mo19035();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                obj = arrayList2.get(0);
                            }
                        }
                    } else {
                        interfaceC6281 = null;
                    }
                } else {
                    interfaceC6281 = null;
                }
                if (interfaceC6281 instanceof C9067) {
                    m33152(interfaceC3145, interfaceC6281);
                    m33155((C9067) interfaceC6281, interfaceC3145, false);
                    return;
                }
            }
            interfaceC3145.mo10270('{');
            m33151(interfaceC3145, interfaceC6281M24200);
            if (zMo17865) {
                interfaceC3145.mo10283("// }");
            } else {
                interfaceC3145.mo10280();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33153(InterfaceC3145 interfaceC3145, InterfaceC6281 interfaceC6281) {
        m33152(interfaceC3145, interfaceC6281);
        interfaceC6281.mo1987(this, interfaceC3145);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33152(InterfaceC3145 interfaceC3145, InterfaceC6281 interfaceC6281) {
        C0271 c0271 = (C0271) interfaceC6281.mo17862((InterfaceC2157) C11457.f36026);
        if (c0271 != null) {
            for (C11260 c11260 : c0271.m1792()) {
                interfaceC3145.mo10282();
                m937(interfaceC3145, c11260);
                interfaceC3145.mo10270(';');
                C5492.m16319(interfaceC3145, this.f908, c11260.m28505().m41930());
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33151(InterfaceC3145 interfaceC3145, InterfaceC6281 interfaceC6281) {
        interfaceC3145.mo10278();
        m33153(interfaceC3145, interfaceC6281);
        interfaceC3145.mo10279();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33154(C6831 c6831, InterfaceC3145 interfaceC3145) {
        interfaceC3145.mo10277(c6831.m19034());
        C25212 c25212 = (C25212) c6831.m19036().m29616().mo17862((InterfaceC2157) C11457.f36029);
        C8256 c8256 = this.f909;
        if (c25212 != null) {
            interfaceC3145.add(c8256.m22241().m18892(c25212)).add(": ");
        }
        C9812 c9812M1251 = c6831.m1251();
        if (c9812M1251 == null) {
            interfaceC3145.add("while (true) {");
            m33151(interfaceC3145, c6831.m19038());
            ((C15382) interfaceC3145).mo10280();
            return;
        }
        C18959 c18959M25583 = c9812M1251.m25583();
        C17620.m41271(interfaceC3145, c18959M25583);
        C14221 c14221 = new C14221(c8256, this.f907);
        AbstractC21976 type = c6831.getType();
        C2551 c2551 = this.f908;
        if (type != null) {
            if (type instanceof C8322) {
                C8322 c8322 = (C8322) type;
                interfaceC3145.add("for (");
                C18959 c18959M22420 = c8322.m22420();
                EnumC17951 enumC17951 = EnumC17951.INLINE;
                m944(c18959M22420, interfaceC3145, enumC17951);
                interfaceC3145.add("; ");
                c14221.m34512(interfaceC3145, c9812M1251);
                interfaceC3145.add("; ");
                m944(c8322.m22419(), interfaceC3145, enumC17951);
                interfaceC3145.add(") {");
                C5492.m16319(interfaceC3145, c2551, c18959M25583);
                m33151(interfaceC3145, c6831.m19038());
                ((C15382) interfaceC3145).mo10280();
                return;
            }
            if (type instanceof C2356) {
                C2356 c2356 = (C2356) type;
                interfaceC3145.add("for (");
                m937(interfaceC3145, c2356.m7988().m17530().m41945());
                interfaceC3145.add(" : ");
                m942(interfaceC3145, c2356.m7986(), false);
                interfaceC3145.add(") {");
                C5492.m16319(interfaceC3145, c2551, c18959M25583);
                m33151(interfaceC3145, c6831.m19038());
                ((C15382) interfaceC3145).mo10280();
                return;
            }
            throw new C8597("Unknown loop type: " + type.getClass());
        }
        if (c6831.m19031()) {
            interfaceC3145.add("do {");
            C5492.m16319(interfaceC3145, c2551, c18959M25583);
            m33151(interfaceC3145, c6831.m19038());
            ((C15382) interfaceC3145).mo10277(c6831.m19034());
            interfaceC3145.add("} while (");
            c14221.m34512(interfaceC3145, c9812M1251);
            interfaceC3145.add(");");
            return;
        }
        interfaceC3145.add("while (");
        c14221.m34512(interfaceC3145, c9812M1251);
        interfaceC3145.add(") {");
        C5492.m16319(interfaceC3145, c2551, c18959M25583);
        m33151(interfaceC3145, c6831.m19038());
        ((C15382) interfaceC3145).mo10280();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33158(C21001 c21001, InterfaceC3145 interfaceC3145) {
        interfaceC3145.mo10283("synchronized (");
        C18959 c18959M48015 = c21001.m48015();
        m942(interfaceC3145, c18959M48015.mo44035(0), true);
        interfaceC3145.add(") {");
        C17620.m41271(interfaceC3145, c18959M48015);
        C5492.m16319(interfaceC3145, this.f908, c18959M48015);
        m33151(interfaceC3145, c21001.m48016());
        ((C15382) interfaceC3145).mo10280();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33156(C14287 c14287, InterfaceC3145 interfaceC3145) {
        C1082 c1082 = (C1082) C23231.m52200((InterfaceC23435) c14287.m34697());
        C17359.requireNonNull(c1082, "Switch insn not found in header");
        AbstractC16481 abstractC16481Mo44035 = c1082.mo44035(0);
        interfaceC3145.mo10283("switch (");
        m942(interfaceC3145, abstractC16481Mo44035, false);
        interfaceC3145.add(") {");
        C17620.m41271(interfaceC3145, c1082);
        C2551 c2551 = this.f908;
        C5492.m16319(interfaceC3145, c2551, c1082);
        C15382 c15382 = (C15382) interfaceC3145;
        c15382.mo10278();
        for (C3847 c3847 : c14287.m34695()) {
            List listM12479 = c3847.m12479();
            InterfaceC6281 interfaceC6281M12478 = c3847.m12478();
            Iterator it = listM12479.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == C14287.f45114) {
                    c15382.mo10283("default:");
                } else {
                    c15382.mo10283("case ");
                    if (next instanceof C17467) {
                        C17467 c17467 = (C17467) next;
                        m33149(interfaceC3145, c17467.mo13008(), c17467);
                    } else if (next instanceof C14022) {
                        m33149(interfaceC3145, (C14022) next, (C17467) null);
                    } else if (next instanceof Integer) {
                        long jIntValue = ((Integer) next).intValue();
                        AbstractC1566 type = abstractC16481Mo44035.getType();
                        int i = C15186.f49582;
                        interfaceC3145.add(C15186.m36534(jIntValue, type, c2551.mo8527().m5686(), this.f907, false));
                    } else if (next instanceof String) {
                        interfaceC3145.mo10270('\"').add((String) next).mo10270('\"');
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected key in switch: ");
                        sb.append(next != null ? next.getClass() : null);
                        throw new C8597(sb.toString());
                    }
                    interfaceC3145.mo10270(':');
                }
            }
            m33151(interfaceC3145, interfaceC6281M12478);
        }
        c15382.mo10279();
        c15382.mo10280();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33149(InterfaceC3145 interfaceC3145, C14022 c14022, C17467 c17467) {
        boolean zM55554;
        C15580 c15580;
        if (c17467 != null) {
            zM55554 = c17467.m40972().m55554();
        } else {
            C7289 c7289M49222 = this.f910.m5691().m49222(c14022.m34148().getType());
            zM55554 = c7289M49222 != null && c7289M49222.m19958();
        }
        if (zM55554) {
            if (c17467 != null) {
                interfaceC3145.mo10274((InterfaceC11653) c17467);
            }
            interfaceC3145.add(c14022.m34145());
            return;
        }
        m938(interfaceC3145, c14022);
        if (c17467 == null || !this.f908.m31135(EnumC17315.INFO) || (c15580 = (C15580) c17467.mo17862(C25278.f81643)) == null || c15580.m37318() == null) {
            return;
        }
        interfaceC3145.add(" /* ").add(c15580.m37318().toString()).add(" */");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33157(C18017 c18017, InterfaceC3145 interfaceC3145) {
        interfaceC3145.mo10283("try {");
        m33151(interfaceC3145, c18017.m41998());
        Iterator it = c18017.m41996().entrySet().iterator();
        C19684 c19684 = null;
        while (it.hasNext()) {
            C19684 c19685 = (C19684) ((Map.Entry) it.next()).getKey();
            if (c19685.m45366()) {
                if (c19684 != null) {
                    f42877.mo13728(this.f908, "Several 'all' handlers in try/catch block in {}");
                }
                c19684 = c19685;
            } else {
                m33150(interfaceC3145, c19685);
            }
        }
        if (c19684 != null) {
            m33150(interfaceC3145, c19684);
        }
        InterfaceC18213 interfaceC18213M41999 = c18017.m41999();
        if (interfaceC18213M41999 != null) {
            ((C15382) interfaceC3145).mo10283("} finally {");
            m33151(interfaceC3145, interfaceC18213M41999);
        }
        ((C15382) interfaceC3145).mo10280();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33150(InterfaceC3145 interfaceC3145, C19684 c19684) {
        InterfaceC18213 interfaceC18213M45364 = c19684.m45364();
        if (interfaceC18213M45364 == null) {
            return;
        }
        interfaceC3145.mo10283("} catch (");
        boolean zM45366 = c19684.m45366();
        C8256 c8256 = this.f909;
        if (zM45366) {
            c8256.m22237().m30102(interfaceC3145, AbstractC1566.f5432);
        } else {
            Iterator it = c19684.m45372().iterator();
            if (it.hasNext()) {
                m935(interfaceC3145, (C1345) it.next());
            }
            while (it.hasNext()) {
                interfaceC3145.add(" | ");
                m935(interfaceC3145, (C1345) it.next());
            }
        }
        interfaceC3145.mo10270(' ');
        AbstractC16481 abstractC16481M45358 = c19684.m45358();
        C2551 c2551 = this.f908;
        if (abstractC16481M45358 == null) {
            interfaceC3145.add("unknown");
        } else if (abstractC16481M45358 instanceof C6041) {
            C17973 c17973M17530 = ((C6041) abstractC16481M45358).m17530();
            if (((C15382) interfaceC3145) instanceof C10907) {
                interfaceC3145.mo10275((InterfaceC16874) C3450.m11262(c2551, c17973M17530));
            }
            interfaceC3145.add(c8256.m22241().m18890(c17973M17530.m41945()));
        } else {
            if (!(abstractC16481M45358 instanceof C20211)) {
                throw new C8597("Unexpected arg type in catch block: " + abstractC16481M45358 + ", class: " + abstractC16481M45358.getClass().getSimpleName());
            }
            interfaceC3145.add(c8256.m22241().m18891((C20211) abstractC16481M45358));
        }
        interfaceC3145.add(") {");
        int iM45367 = c19684.m45367();
        if (iM45367 >= 0 && (((C15382) interfaceC3145) instanceof C10907)) {
            interfaceC3145.mo10276(new C17620(iM45367));
        }
        C5492.m16319(interfaceC3145, c2551, c19684.m45368());
        m33151(interfaceC3145, interfaceC18213M45364);
    }
}
