package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۚᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 26FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5856 extends AbstractC16700 implements InterfaceC4452 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (C18170.m42340(c2551, EnumC21154.SWITCH)) {
            C24590.m54901(c2551, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: Exception -> 0x00b3, Exception | StackOverflowError -> 0x00b5, TryCatch #2 {Exception | StackOverflowError -> 0x00b5, blocks: (B:7:0x000b, B:15:0x002a, B:18:0x0030, B:20:0x004d, B:23:0x0055, B:24:0x005c, B:26:0x0062, B:28:0x0070, B:32:0x007e, B:34:0x0083, B:37:0x009a, B:40:0x00a1, B:42:0x00a7, B:46:0x00af, B:33:0x0081, B:36:0x0095, B:13:0x0024, B:10:0x0018), top: B:53:0x000b }] */
    @Override // l.InterfaceC4452
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7322(C2551 c2551, InterfaceC18213 interfaceC18213) {
        int i;
        if ((interfaceC18213 instanceof C14287) || (interfaceC18213 instanceof C9067)) {
            try {
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) C20531.m47065(interfaceC18213));
                InterfaceC6281 interfaceC6281 = null;
                C21219 c21219M17045 = c18959M52200 == null ? null : m17045(c18959M52200.mo44035(0));
                AbstractC16481 abstractC16481Mo13131 = c21219M17045 == null ? null : c21219M17045.mo13131();
                if (abstractC16481Mo13131 != null && (abstractC16481Mo13131 instanceof C6041)) {
                    C15550 c15550 = new C15550(c2551, interfaceC18213);
                    c15550.m37254(c21219M17045);
                    c15550.m37262((C6041) abstractC16481Mo13131);
                    List listMo19035 = interfaceC18213.getParent().mo19035();
                    int iIndexOf = listMo19035.indexOf(interfaceC18213);
                    if (iIndexOf != -1 && (i = iIndexOf + 1) < listMo19035.size()) {
                        interfaceC6281 = (InterfaceC6281) listMo19035.get(i);
                    }
                    boolean z = interfaceC18213 instanceof C14287;
                    if (interfaceC6281 instanceof C14287) {
                        C14287 c14287 = (C14287) interfaceC6281;
                        C18959 c18959M52156 = C23231.m52156(c14287.m34697(), EnumC24203.SWITCH);
                        if (c18959M52156 != null) {
                            AbstractC16481 abstractC16481Mo44035 = c18959M52156.mo44035(0);
                            abstractC16481Mo44035.getClass();
                            if (abstractC16481Mo44035 instanceof C6041) {
                                c15550.m37252(z ? EnumC13313.SWITCH_SWITCH : EnumC13313.IF_SWITCH);
                                c15550.m37253(c14287);
                                c15550.m37251((C6041) c18959M52156.mo44035(0));
                                if (m17047(c15550)) {
                                    if (m17050(c15550) && m17049(c15550)) {
                                        return true;
                                    }
                                    c2551.m31138("Failed to restore switch over string. Please report as a decompilation issue");
                                }
                            }
                        }
                    } else if (z) {
                        c15550.m37252(EnumC13313.SINGLE_SWITCH);
                        if (m17047(c15550)) {
                            if (m17050(c15550)) {
                                return true;
                            }
                            c2551.m31138("Failed to restore switch over string. Please report as a decompilation issue");
                        }
                    }
                }
            } catch (Exception | StackOverflowError e) {
                c2551.m31134("Failed to restore switch over string. Please report as a decompilation issue", e);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143 A[LOOP:2: B:57:0x0143->B:128:?, LOOP_START, PHI: r6
      0x0143: PHI (r6v9 l.ܽۢۗ) = (r6v8 l.ܽۢۗ), (r6v14 l.ܽۢۗ) binds: [B:55:0x013f, B:128:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17047(C15550 c15550) {
        C17489 c17489;
        AbstractC16481 abstractC16481Mo44035;
        Integer numM17044;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c15550.m37248() != EnumC13313.IF_SWITCH) {
            C1082 c1082 = (C1082) C23231.m52156(((C14287) c15550.m37258()).m34697(), EnumC24203.SWITCH);
            C17359.requireNonNull(c1082);
            for (int i = 0; i < c1082.m4073().length; i++) {
                C21943 c21943M17046 = m17046(c1082.m4078()[i]);
                if (c21943M17046 != null) {
                    linkedHashMap.put(Integer.valueOf(c1082.m4073()[i]), c21943M17046);
                }
            }
            c15550.m37250(new ArrayList(linkedHashMap.size()));
            for (Integer num : linkedHashMap.keySet()) {
                c17489 = (C17489) C23231.m52156((C21943) linkedHashMap.get(num), EnumC24203.IF);
                if (!m17048(c17489)) {
                    do {
                        C18959 c18959M22402 = C8314.m22402(c17489.mo44035(0));
                        C17359.requireNonNull(c18959M22402);
                        abstractC16481Mo44035 = c18959M22402.mo44035(0);
                        Object objM22394 = C8314.m22394(c15550.m37256().mo8527(), c18959M22402.mo44035(1));
                        if (!c15550.m37255().equals(abstractC16481Mo44035)) {
                        }
                    } while (m17048(c17489));
                }
            }
            return true;
        }
        C9067 c9067 = (C9067) c15550.m37258();
        C14287 c14287M37257 = c15550.m37257();
        C17359.requireNonNull(c14287M37257);
        C21943 c21943M34697 = c14287M37257.m34697();
        C21943 c21943M17047 = m17046((C21943) c9067.mo1257().get(0));
        C6041 c6041 = null;
        while (true) {
            C17489 c174810 = (C17489) C23231.m52156(c21943M17047, EnumC24203.IF);
            if (c174810 != null) {
                EnumC15997 enumC15997M40994 = c174810.m40994();
                EnumC15997 enumC15997 = EnumC15997.NE;
                if (enumC15997M40994 == enumC15997 || c174810.m40994() == EnumC15997.EQ) {
                    boolean z = c174810.m40994() == enumC15997;
                    C21943 c21943M17048 = m17046(z ? c174810.m40991() : c174810.m40992());
                    C21943 c21943M17049 = m17046(z ? c174810.m40992() : c174810.m40991());
                    if (c21943M17048 != null && c21943M17049 != null) {
                        AbstractC16481 abstractC16481Mo44036 = c174810.mo44035(0);
                        abstractC16481Mo44036.getClass();
                        if (abstractC16481Mo44036 instanceof C6041) {
                            AbstractC16481 abstractC16481Mo44037 = c174810.mo44035(1);
                            abstractC16481Mo44037.getClass();
                            if (abstractC16481Mo44037 instanceof C23195) {
                                C6041 c6042 = (C6041) c174810.mo44035(0);
                                C23195 c23195 = (C23195) c174810.mo44035(1);
                                if (c6041 == null) {
                                    c6041 = c6042;
                                } else if (!c6041.m17534(c6042)) {
                                }
                                linkedHashMap.put(Integer.valueOf((int) c23195.m52122()), c21943M17048);
                                Integer numM17045 = m17044(c15550, C23231.m52200((InterfaceC23435) c21943M17049));
                                C21943 c21943M52207 = C23231.m52207(c21943M17049);
                                if (c21943M17049 == c21943M34697) {
                                    break;
                                }
                                Integer num2 = -1;
                                if (num2.equals(numM17045) && c21943M52207 == c21943M34697) {
                                    break;
                                }
                                c21943M17047 = c21943M17049;
                            }
                        }
                    }
                }
            }
        }
        c15550.m37250(new ArrayList(linkedHashMap.size()));
        while (r1.hasNext()) {
            c17489 = (C17489) C23231.m52156((C21943) linkedHashMap.get(num), EnumC24203.IF);
            if (!m17048(c17489)) {
                do {
                    C18959 c18959M22403 = C8314.m22402(c17489.mo44035(0));
                    C17359.requireNonNull(c18959M22403);
                    abstractC16481Mo44035 = c18959M22403.mo44035(0);
                    Object objM22395 = C8314.m22394(c15550.m37256().mo8527(), c18959M22403.mo44035(1));
                    if (!c15550.m37255().equals(abstractC16481Mo44035) && (objM22395 instanceof String) && objM22395.hashCode() == num.intValue()) {
                        boolean z2 = (c17489.m40994() == EnumC15997.EQ) != c17489.mo44035(1).m39121();
                        C21943 c21943M40991 = z2 ? c17489.m40991() : c17489.m40992();
                        C21943 c21943M40992 = z2 ? c17489.m40992() : c17489.m40991();
                        if (c15550.m37248() == EnumC13313.SWITCH_SWITCH || c15550.m37248() == EnumC13313.IF_SWITCH) {
                            C18959 c18959M52200 = C23231.m52200((InterfaceC23435) m17046(c21943M40991));
                            C6041 c6041M37259 = c15550.m37259();
                            C17359.requireNonNull(c6041M37259);
                            if (c21943M40991 != null && (c18959M52200 == null || c18959M52200.getType() == EnumC24203.SWITCH)) {
                                numM17044 = null;
                                for (C21943 c21943M49642 = c21943M40991.m49642(); c21943M49642 != null && numM17044 == null; c21943M49642 = c21943M49642.m49642()) {
                                    Iterator it = ((ArrayList) c21943M49642.mo1986()).iterator();
                                    while (it.hasNext()) {
                                        numM17044 = m17044(c15550, (C18959) it.next());
                                    }
                                }
                                if (numM17044 == null) {
                                }
                            } else if (c18959M52200 != null && c6041M37259.m17534(c18959M52200.m44027())) {
                                numM17044 = m17044(c15550, c18959M52200);
                            }
                        } else {
                            numM17044 = null;
                        }
                        ((ArrayList) c15550.m37249()).add(new C20026(objM22395, numM17044, c21943M40991));
                        c17489 = (C17489) C23231.m52156(m17046(c21943M40992), EnumC24203.IF);
                    }
                } while (m17048(c17489));
            }
        }
        return true;
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m17050(C15550 c15550) {
        Integer num;
        C15580 c15580;
        C14287 c14287M37257 = c15550.m37257();
        List listM37249 = c15550.m37249();
        ArrayList arrayList = new ArrayList();
        c15550.m37261(arrayList);
        C20026 c20026 = null;
        if (c15550.m37248() == EnumC13313.SWITCH_SWITCH || c15550.m37248() == EnumC13313.IF_SWITCH) {
            ArrayList<C20026> arrayList2 = (ArrayList) listM37249;
            HashMap map = new HashMap(arrayList2.size());
            for (C20026 c20027 : arrayList2) {
                ((List) C11392.computeIfAbsent(map, c20027.m46074(), new C18061(7))).add(c20027.m46073());
            }
            C17359.requireNonNull(c14287M37257);
            for (C3847 c3847 : c14287M37257.m34695()) {
                C3847 c3848 = new C3847(new ArrayList(), c3847.m12478());
                for (Object obj : c3847.m12479()) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = ((obj instanceof C17467) && (c15580 = (C15580) ((C17467) obj).mo17862(C25278.f81643)) != null && c15580.m37317() == EnumC23040.ENCODED_INT) ? (Integer) c15580.m37318() : null;
                    }
                    if (obj != C14287.f45114) {
                        C17359.requireNonNull(num);
                        List list = (List) map.remove(num);
                        if (list == null || list.isEmpty()) {
                            return false;
                        }
                        c3848.m12479().addAll(list);
                    } else {
                        Iterator it = map.values().iterator();
                        while (it.hasNext()) {
                            c3848.m12479().addAll((List) it.next());
                        }
                        map.clear();
                        c3848.m12479().add(C14287.f45114);
                    }
                }
                arrayList.add(c3848);
            }
            if (map.isEmpty()) {
                return true;
            }
            c15550.m37256().m31138("switch over string: strings are not added: " + map.values());
            return true;
        }
        if (c15550.m37248() != EnumC13313.SINGLE_SWITCH) {
            return true;
        }
        C14287 c14287 = (C14287) c15550.m37258();
        C1082 c1082 = (C1082) C23231.m52156(c14287.m34697(), EnumC24203.SWITCH);
        C17359.requireNonNull(c1082);
        C21943 c21943M4070 = c1082.m4070();
        if (c21943M4070 != null) {
            ((ArrayList) listM37249).add(new C20026(C14287.f45114, -1, c21943M4070));
        }
        for (C20026 c20028 : (ArrayList) listM37249) {
            if (c20026 != null && c20026.m46072() == c20028.m46072()) {
                C3847 c3849 = (C3847) C6823.m18999(arrayList);
                C17359.requireNonNull(c3849);
                c3849.m12479().add(c20028.m46073());
            } else {
                InterfaceC6281 interfaceC6281M47064 = C20531.m47064((InterfaceC23435) c20028.m46072(), (InterfaceC6281) c14287);
                if (interfaceC6281M47064 == null) {
                    return false;
                }
                C3847 c38410 = new C3847(new ArrayList(), interfaceC6281M47064);
                c38410.m12479().add(c20028.m46073());
                arrayList.add(c38410);
            }
            c20026 = c20028;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m17049(C15550 c15550) {
        C21943 c21943M34697;
        C2551 c2551M37256 = c15550.m37256();
        InterfaceC18213 interfaceC18213M37258 = c15550.m37258();
        InterfaceC18213 parent = interfaceC18213M37258.getParent();
        C14287 c14287M37257 = c15550.m37257();
        ArrayList arrayList = new ArrayList();
        if (c15550.m37248() == EnumC13313.SWITCH_SWITCH || c15550.m37248() == EnumC13313.SINGLE_SWITCH) {
            c21943M34697 = ((C14287) interfaceC18213M37258).m34697();
        } else {
            C17359.requireNonNull(c14287M37257);
            c21943M34697 = c14287M37257.m34697();
        }
        C18959 c18959M52156 = C23231.m52156(c21943M34697, EnumC24203.SWITCH);
        C17359.requireNonNull(c18959M52156);
        C18959 c18959Mo4072 = c18959M52156.mo4072();
        c18959Mo4072.mo14762(c18959M52156.mo44035(0), c15550.m37255().mo17528());
        C23231.m52179(c2551M37256, c21943M34697, c18959M52156, c18959Mo4072);
        arrayList.add(c18959Mo4072);
        C14287 c14287 = new C14287(parent, c21943M34697);
        for (C3847 c3847 : (ArrayList) c15550.m37263()) {
            InterfaceC6281 interfaceC6281M12478 = c3847.m12478();
            C20531.m47066(c2551M37256, interfaceC6281M12478, new C12130(1, arrayList));
            c14287.m34696(C4681.unmodifiableList(c3847.m12479()), interfaceC6281M12478);
            AbstractC20255.m46530(interfaceC6281M12478, (AbstractC20255) c14287);
        }
        if (!parent.mo19029(interfaceC18213M37258, c14287)) {
            return false;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            C20531.m47066(c2551M37256, interfaceC18213M37258, new C16801(0, arrayList2));
            if (c14287M37257 != null) {
                ArrayList arrayList3 = new ArrayList();
                C20531.m47066(c2551M37256, c14287M37257, new C16801(0, arrayList3));
                arrayList2.addAll(arrayList3);
                c14287M37257.getParent().mo19035().remove(c14287M37257);
            }
            arrayList2.removeAll(arrayList);
            C4937.forEach(arrayList2, new C3684(1));
            C6041 c6041M37259 = c15550.m37259();
            if (c6041M37259 != null) {
                for (C17973 c17973 : c6041M37259.m17530().m41945().m28519()) {
                    C18959 c18959M41951 = c17973.m41951();
                    if (c18959M41951 != null) {
                        c18959M41951.mo17866(EnumC1763.REMOVE);
                    }
                    Iterator it = c17973.m41946().iterator();
                    while (it.hasNext()) {
                        C18959 c18959M39118 = ((C6041) it.next()).m39118();
                        if (c18959M39118 != null) {
                            c18959M39118.mo17866(EnumC1763.REMOVE);
                        }
                    }
                    c2551M37256.m8504(c17973);
                }
            }
            C9804.m25531(c2551M37256);
            C9804.m25534(c2551M37256, c15550.m37260());
            return true;
        } catch (Exception | StackOverflowError e) {
            c2551M37256.m31134("Failed to clean up code after switch over string restore", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m17044(C15550 c15550, C18959 c18959) {
        C6041 c6041M37259;
        if (c18959 == null || c18959.m44039() != 1) {
            return null;
        }
        Object objM22394 = C8314.m22394(c15550.m37256().mo8527(), c18959.mo44035(0));
        if ((objM22394 instanceof C23195) && (c6041M37259 = c15550.m37259()) != null && c6041M37259.m17534(c18959.m44027())) {
            return Integer.valueOf((int) ((C23195) objM22394).m52122());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21219 m17045(AbstractC16481 abstractC16481) {
        C18959 c18959M40461;
        abstractC16481.getClass();
        if (abstractC16481 instanceof C6041) {
            c18959M40461 = ((C6041) abstractC16481).m17529();
        } else {
            c18959M40461 = abstractC16481 instanceof C17227 ? ((C17227) abstractC16481).m40461() : null;
        }
        if (c18959M40461 != null && c18959M40461.getType() == EnumC24203.INVOKE) {
            C21219 c21219 = (C21219) c18959M40461;
            if (c21219.mo18926().m49707().equals("java.lang.String.hashCode()I")) {
                return c21219;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17048(C17489 c17489) {
        C18959 c18959M22402;
        return c17489 != null && c17489.getType() == EnumC24203.IF && c17489.m44039() == 2 && (c18959M22402 = C8314.m22402(c17489.mo44035(0))) != null && c18959M22402.getType() == EnumC24203.INVOKE && ((C21219) c18959M22402).mo18926().m49707().equals("java.lang.String.equals(Ljava/lang/Object;)Z");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m17046(C21943 c21943) {
        while (c21943 != null) {
            int size = ((ArrayList) c21943.mo1986()).size();
            if (size != 0) {
                if (size == 1) {
                    return c21943;
                }
                return null;
            }
            c21943 = C23231.m52207(c21943);
        }
        return null;
    }
}
