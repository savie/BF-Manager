package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 16DY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17042 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f55686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3618 f55687;

    static {
        C16980.m40037(C17042.class);
    }

    public C17042(C2551 c2551, C3618 c3618) {
        this.f55686 = c2551;
        this.f55687 = c3618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m40164(C12050 c12050, C21943 c21943, C17489 c17489, C12567 c12567) {
        if (c21943.mo17865(EnumC1763.ADDED_TO_REGION)) {
            return c17489.m40992();
        }
        C2551 c2551 = this.f55686;
        C0864 c0864M40153 = m40153(c21943, c2551);
        if (c0864M40153 != null) {
            C0864 c0864M40158 = m40158(c0864M40153);
            if (c0864M40158 != null) {
                c0864M40153 = c0864M40158;
            } else {
                EnumC1763 enumC1763 = EnumC1763.DONT_INVERT;
                if (!c21943.mo17865(enumC1763)) {
                    c0864M40153 = C0864.m3511(c0864M40153);
                    c21943.mo17866(enumC1763);
                }
            }
            C0864 c0864M40163 = m40163(c21943, c0864M40153);
            if (c0864M40163 != null || (c0864M40153.m3522().size() > 1 && (c0864M40163 = m40163(c21943, m40153(c21943, c2551))) != null)) {
                m40156(c0864M40163);
                C9067 c9067 = new C9067(c12050);
                c9067.m1252(c0864M40163);
                ((ArrayList) c12050.mo19035()).add(c9067);
                C21943 c21943M3520 = c0864M40163.m3520();
                c12567.m31276(c9067);
                c12567.m31277(c21943M3520);
                C21943 c21943M3512 = c0864M40163.m3512();
                C3618 c3618 = this.f55687;
                if (c21943M3512 == null) {
                    c9067.m24202(new C12050(c9067));
                } else {
                    c9067.m24202(c3618.m11737(c21943M3512));
                }
                C21943 c21943M3523 = c0864M40163.m3523();
                if (c21943M3523 == null || c12567.m31281(c21943M3523)) {
                    c9067.m24199((C12050) null);
                } else {
                    c9067.m24199(c3618.m11737(c21943M3523));
                }
                if (c9067.m24200() == null && c21943M3520 != null) {
                    List<C18916> listMo17861 = c21943M3520.mo17861(C11457.f36017);
                    if (!listMo17861.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (C18916 c18916 : listMo17861) {
                            if (c18916.m43921().equals(c21943M3520) && c0864M40163.m3522().m42625(C23231.m52165(c18916.m43922(), Boolean.TRUE, true))) {
                                arrayList.add(c18916.m43923());
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C12050 c12051 = new C12050(c9067);
                            c12051.m30228((InterfaceC6281) new C0314(arrayList));
                            c9067.m24199(c12051);
                        }
                    }
                }
                c12567.m31282();
                return c21943M3520;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0864 m40162(C6831 c6831) {
        C0864 c0864M40153 = m40153(c6831.m19032(), this.f55686);
        C0864 c0864M40158 = m40158(c0864M40153);
        if (c0864M40158 != null) {
            c0864M40153 = c0864M40158;
        }
        m40156(c0864M40153);
        return c0864M40153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0864 m40153(C21943 c21943, C2551 c2551) {
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
        if (c18959M52200 == null || c18959M52200.getType() != EnumC24203.IF) {
            return null;
        }
        C17489 c17489 = (C17489) c18959M52200;
        C0864 c0864 = new C0864(c2551, C9812.m25576(c17489), c17489.m40992(), c17489.m40991());
        c0864.m3522().m42623(c21943);
        return c0864;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0864 m40163(C21943 c21943, C0864 c0864) {
        C21943 c21943M52202;
        C0864 c0865;
        C21943 c21943M3520;
        boolean zContains;
        C21943 c21943M40154;
        C21943 c21943M3512 = c0864.m3512();
        C21943 c21943M3523 = c0864.m3523();
        if (C17359.equals(c21943M3512, c21943M3523)) {
            C0864 c0866 = new C0864(null, c0864);
            c0866.m3515(c21943M3512);
            return c0866;
        }
        EnumC1763 enumC1763 = EnumC1763.RETURN;
        if (c21943M3512.mo17865(enumC1763) && c21943M3523.mo17865(enumC1763)) {
            c0864.m3515((C21943) null);
            return c0864;
        }
        if (c21943M3512 == c21943M3523) {
            c21943M52202 = c21943M3512;
        } else if (c21943M3523 == null) {
            c21943M52202 = null;
        } else {
            C2551 c2551 = this.f55686;
            BitSet bitSetM52197 = C23231.m52197(c2551);
            bitSetM52197.or(c21943M3512.m49638());
            bitSetM52197.set(c21943M3512.m49644());
            BitSet bitSetM52198 = C23231.m52197(c2551);
            bitSetM52198.or(c21943M3523.m49638());
            bitSetM52198.set(c21943M3523.m49644());
            BitSet bitSetM52199 = C23231.m52197(c2551);
            bitSetM52199.or(bitSetM52197);
            bitSetM52199.and(bitSetM52198);
            bitSetM52199.clear(c2551.m8491().m49644());
            c21943M52202 = C23231.m52202(c2551, bitSetM52199);
            if (c21943M52202 == null) {
                BitSet bitSetM521910 = C23231.m52197(c2551);
                bitSetM521910.or(c21943M3512.m49638());
                bitSetM521910.or(c21943M3523.m49638());
                bitSetM521910.clear(c2551.m8491().m49644());
                BitSet bitSetM521911 = C23231.m52197(c2551);
                for (C21943 c21944 : C23231.m52151(c2551, bitSetM521910)) {
                    if (c21944.m49643().size() >= 2) {
                        BitSet bitSetM521912 = C23231.m52197(c2551);
                        BitSet bitSetM521913 = C23231.m52197(c2551);
                        if (c21944 == c21943M3523) {
                            bitSetM521913.set(c21944.m49644());
                        }
                        if (c21944 == c21943M3512) {
                            bitSetM521912.set(c21944.m49644());
                        }
                        for (C21943 c21945 : c21944.m49643()) {
                            if (C23231.m52193(c21943M3512, c21945)) {
                                bitSetM521912.set(c21945.m49644());
                            }
                            if (C23231.m52193(c21943M3523, c21945)) {
                                bitSetM521913.set(c21945.m49644());
                            }
                        }
                        if (bitSetM521913.cardinality() != 0 && bitSetM521912.cardinality() != 0) {
                            C21943 c21943M52203 = C23231.m52202(c2551, bitSetM521913);
                            C21943 c21943M52204 = C23231.m52202(c2551, bitSetM521912);
                            if (c21943M52203 == null || c21943M52203 != c21943M52204) {
                                bitSetM521911.set(c21944.m49644());
                            }
                        }
                    }
                }
                c21943M52202 = C23231.m52159(C23231.m52151(c2551, bitSetM521911), true);
                if (c21943M52202 == null) {
                    c21943M52202 = C23231.m52187(c2551, c21943M3512, c21943M3523);
                }
            }
        }
        c0864.m3515(c21943M52202);
        boolean zM40161 = m40161(c21943M3512, c0864);
        boolean zM40162 = m40161(c21943M3523, c0864);
        if (zM40161 && zM40162) {
            return null;
        }
        if (zM40162) {
            c0865 = new C0864(c21943M3512, c0864);
            c0865.m3515(c21943M3523);
        } else {
            if (zM40161) {
                c0865 = new C0864(c21943M3523, C0864.m3511(c0864));
                c0865.m3515(c21943M3512);
            }
            if (c0864.m3520() == null) {
                c21943M40154 = m40154(c0864.m3512());
                C21943 c21943M40155 = m40154(c0864.m3523());
                if (c21943M40154 != null && c21943M40155 != null) {
                    c0864.m3515(c21943M40155);
                } else if (c21943M40154 == null && c21943M40155 == null) {
                    c0864.m3515(c21943M40154);
                } else if (c21943M40154 != null && c21943M40154 == c21943M40155) {
                    c0864.m3515(c21943M40154);
                }
            }
            c21943M3520 = c0864.m3520();
            if (c21943M3520 == null && !c21943.m49639().contains(c21943M3520)) {
                zContains = c21943.m49646().contains(c21943M3520);
            } else {
                zContains = false;
            }
            if (zContains) {
                c0864.m3515((C21943) null);
            }
            return c0864;
        }
        c0864 = c0865;
        if (c0864.m3520() == null) {
            c21943M40154 = m40154(c0864.m3512());
            C21943 c21943M40156 = m40154(c0864.m3523());
            if (c21943M40154 != null) {
                if (c21943M40154 == null) {
                    if (c21943M40154 != null) {
                        c0864.m3515(c21943M40154);
                    }
                } else if (c21943M40154 != null) {
                    c0864.m3515(c21943M40154);
                }
            } else if (c21943M40154 == null) {
                if (c21943M40154 != null) {
                    c0864.m3515(c21943M40154);
                }
            } else if (c21943M40154 != null) {
                c0864.m3515(c21943M40154);
            }
        }
        c21943M3520 = c0864.m3520();
        if (c21943M3520 == null) {
            zContains = false;
        } else {
            zContains = c21943.m49646().contains(c21943M3520);
        }
        if (zContains) {
            c0864.m3515((C21943) null);
        }
        return c0864;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m40161(C21943 c21943, C0864 c0864) {
        boolean z = false;
        if (c21943.mo17865(EnumC1763.LOOP_START) && c21943.m49643().size() == 1) {
            C21943 c21944 = (C21943) c21943.m49643().get(0);
            if (c21944.mo17865(EnumC1763.LOOP_END)) {
                C11457 c11457 = C11457.f36019;
                List<C11785> listMo17861 = c21943.mo17861(c11457);
                List listMo17862 = c21944.mo17861(c11457);
                for (C11785 c11785 : listMo17861) {
                    Iterator it = listMo17862.iterator();
                    while (it.hasNext()) {
                        if (c11785 == ((C11785) it.next())) {
                        }
                    }
                }
                if (c0864.m3520() != null) {
                    if (c21943 != c0864.m3520()) {
                        return false;
                    }
                } else {
                    List<C21943> listM49643 = c21943.m49643();
                    C18293 c18293M3522 = c0864.m3522();
                    for (C21943 c21945 : listM49643) {
                        if (c21945.mo17865(EnumC1763.LOOP_END)) {
                            return !z;
                        }
                    }
                    z = true;
                    return !z;
                }
            } else if (c0864.m3520() != null) {
                if (c21943 != c0864.m3520()) {
                    return false;
                }
            } else {
                List<C21943> listM49644 = c21943.m49643();
                C18293 c18293M3523 = c0864.m3522();
                while (r7.hasNext()) {
                    if (c21945.mo17865(EnumC1763.LOOP_END)) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
        } else if (c0864.m3520() != null) {
            if (c21943 != c0864.m3520()) {
                return false;
            }
        } else {
            List<C21943> listM49645 = c21943.m49643();
            C18293 c18293M3524 = c0864.m3522();
            while (r7.hasNext()) {
                if (c21945.mo17865(EnumC1763.LOOP_END) && !c18293M3524.m42625(C23231.m52190(c21945))) {
                    return !z;
                }
            }
            z = true;
            return !z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21943 m40154(C21943 c21943) {
        C21943 c21943M52164;
        if (c21943 != null) {
            BitSet bitSetM49638 = c21943.m49638();
            C2551 c2551 = this.f55686;
            Iterator it = C23231.m52151(c2551, bitSetM49638).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c21943M52164 = null;
                    break;
                }
                C10733 c10733 = (C10733) ((C21943) it.next()).mo17862((InterfaceC2157) C11457.f36036);
                if (c10733 != null && c21943.m49650(c10733.m27338().m32379())) {
                    c21943M52164 = C23231.m52164(c2551, c10733.m27337());
                    break;
                }
            }
            if (c21943M52164 != null) {
                Iterator it2 = ((HashSet) this.f55687.m11735().m31280()).iterator();
                while (it2.hasNext()) {
                    if (C23231.m52193((C21943) it2.next(), c21943M52164)) {
                    }
                }
            }
            return c21943M52164;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        if (r0 == false) goto L83;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C0864 m40158(l.C0864 r10) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17042.m40158(l.֨ۖۗ):l.֨ۖۗ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0864 m40152(C0864 c0864, C0864 c0865, C0864 c0866) {
        C0864 c0867 = new C0864(c0864.m3521(), C9812.m25575(c0864.m3513(), c0865.m3513(), c0866.m3513()), c0865.m3512(), c0865.m3523());
        c0867.m3516(c0864, c0865, c0866);
        m40156(c0867);
        return c0867;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m40155(C21943 c21943, C21943 c21944, Set set, C2551 c2551) {
        if (c21943 == c21944) {
            return c21944;
        }
        if (C23231.m52195(c21943, c21944)) {
            set.add(c21943);
            return c21944;
        }
        if (C23231.m52189(c21943, c21944)) {
            c21943.mo17866(EnumC1763.REMOVE);
            set.add(c21943);
            return c21944;
        }
        C21943 c21943M52187 = C23231.m52187(c2551, c21943, c21944);
        if (c21943M52187 != null) {
            C17359.requireNonNull(set);
            C23231.m52175(c2551, c21943, c21943M52187, new C13261(2, set));
            C23231.m52175(c2551, c21944, c21943M52187, new C13261(2, set));
            set.remove(c21943M52187);
            return c21943M52187;
        }
        C21943 c21943M52203 = C23231.m52203(c21943);
        C21943 c21943M52204 = C23231.m52203(c21944);
        if (c21943M52203.equals(c21943M52204) || C23231.m52195(c21943M52203, c21943M52204)) {
            set.add(c21943);
            set.add(c21944);
            C23231.m52176(c21943, new C13261(2, set));
            C23231.m52176(c21944, new C13261(2, set));
            return c21943M52204;
        }
        throw new C8597("Unexpected merge pattern");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40156(C0864 c0864) {
        if (c0864.m3522().size() > 1) {
            for (C21943 c21943 : c0864.m3522()) {
                if (c21943 != c0864.m3518()) {
                    c21943.mo17866(EnumC1763.ADDED_TO_REGION);
                }
            }
        }
        if (!c0864.m3517().isEmpty()) {
            Iterator it = c0864.m3517().iterator();
            while (it.hasNext()) {
                ((C21943) it.next()).mo17866(EnumC1763.ADDED_TO_REGION);
            }
            c0864.m3517().clear();
        }
        Iterator it2 = c0864.m3524().iterator();
        while (it2.hasNext()) {
            ((C18959) it2.next()).mo17866(EnumC1763.FORCE_ASSIGN_INLINE);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0864 m40159(C21943 c21943, C0864 c0864) {
        if (c21943.m49643().size() != 1) {
            C18293 c18293M3522 = c0864.m3522();
            List listM49643 = c21943.m49643();
            c18293M3522.getClass();
            Iterator it = listM49643.iterator();
            while (it.hasNext()) {
                if (!c18293M3522.m42625((C21943) it.next())) {
                    return null;
                }
            }
        }
        return m40157(c21943, c0864);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C0864 m40157(C21943 c21943, C0864 c0864) {
        ArrayList arrayListM41946;
        int size;
        if (c21943 == null || c21943.mo17867(C11457.f36019)) {
            return null;
        }
        EnumC1763 enumC1763 = EnumC1763.ADDED_TO_REGION;
        if (c21943.mo17865(enumC1763)) {
            return null;
        }
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
        if (c18959M52200 != null && c18959M52200.getType() == EnumC24203.IF) {
            return m40153(c21943, c0864.m3521());
        }
        C21943 c21943M40160 = m40160(c21943);
        if (c21943M40160 == null) {
            return null;
        }
        boolean z = true;
        if (c21943M40160.m49643().size() != 1 || c21943M40160.mo17865(enumC1763)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c21943.mo1986();
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            boolean z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                C18959 c18959 = (C18959) it.next();
                C6041 c6041M44027 = c18959.m44027();
                if (c6041M44027 != null && (size = (arrayListM41946 = c6041M44027.m17530().m41946()).size()) != 0) {
                    C18959 c18959M39118 = ((AbstractC16481) arrayListM41946.get(0)).m39118();
                    if (C23231.m52181(c21943, c18959M39118) || C23231.m52181(c21943M40160, c18959M39118)) {
                        if (size > 1) {
                            arrayList.add(c18959);
                        } else {
                            z2 = false;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        C0864 c0864M40153 = m40153(c21943M40160, c0864.m3521());
        if (c0864M40153 == null) {
            return m40157(c21943M40160, c0864);
        }
        c0864M40153.m3514(arrayList);
        return c0864M40153;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21943 m40160(C21943 c21943) {
        List listM49646 = c21943.m49646();
        if (listM49646.size() > 2 || listM49646.size() == 0) {
            return null;
        }
        C21943 c21944 = (C21943) listM49646.get(0);
        if (listM49646.size() == 1) {
            return c21944;
        }
        C21943 c21945 = (C21943) listM49646.get(1);
        EnumC1763 enumC1763 = EnumC1763.EXC_BOTTOM_SPLITTER;
        boolean zMo17865 = c21944.mo17865(enumC1763);
        boolean zMo17866 = c21945.mo17865(enumC1763);
        if (!zMo17865 && !zMo17866) {
            return null;
        }
        if (zMo17865 && zMo17866) {
            return null;
        }
        if (zMo17865) {
            c21944 = c21945;
        }
        return ((ArrayList) c21944.mo1986()).isEmpty() ? m40160(c21944) : c21944;
    }
}
