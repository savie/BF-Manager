package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8850 extends AbstractC23110 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f28921;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f28922;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f28923;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f28924;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f28925;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28926;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28927;

    @Override // l.AbstractC23110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23716(C5210 c5210, Object obj) {
        InterfaceC23265 interfaceC23265 = (InterfaceC23265) obj;
        int iMo5414 = interfaceC23265.mo5414();
        if (iMo5414 == 0) {
            c5210.m46339(((InterfaceC1876) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 6) {
            c5210.m46344(((InterfaceC20521) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 2) {
            c5210.m46354(((InterfaceC4113) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 3) {
            c5210.m46340(((InterfaceC11570) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 4) {
            c5210.m46343(((InterfaceC3367) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 16) {
            c5210.m46342(((InterfaceC23505) interfaceC23265).getValue());
            return;
        }
        if (iMo5414 == 17) {
            c5210.m46341(((InterfaceC24997) interfaceC23265).getValue());
            return;
        }
        switch (iMo5414) {
            case 21:
                c5210.m46346(((C21027) interfaceC23265).f67194);
                return;
            case 22:
                c5210.m46352(((C14313) interfaceC23265).f45175);
                return;
            case 23:
                c5210.m46348(((C7602) interfaceC23265).f25095);
                return;
            case 24:
                c5210.m46350(((C18789) interfaceC23265).f61017);
                return;
            case 25:
                c5210.m46355(((C20281) interfaceC23265).f65106);
                return;
            case 26:
                c5210.m46349(((C3873) interfaceC23265).f13217);
                return;
            case 27:
                c5210.m46347(((C3127) interfaceC23265).f10136);
                return;
            case 28:
                c5210.m46345(((C11330) interfaceC23265).f35702);
                return;
            case 29:
                C1636 c1636 = (C1636) interfaceC23265;
                c5210.m46351(c1636.f5663, c1636.f5662);
                return;
            case 30:
                c5210.m46338();
                return;
            case 31:
                c5210.m46353(((InterfaceC5605) interfaceC23265).getValue());
                return;
            default:
                throw new C23044(null, "Unrecognized value type: %d", Integer.valueOf(interfaceC23265.mo5414()));
        }
    }

    public C8850(C19647 c19647) {
        super(c19647);
        this.f28922 = false;
    }

    @Override // l.AbstractC23110
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo23718() {
        return !this.f28927 && super.mo23718();
    }

    @Override // l.AbstractC23110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2884 mo23707() {
        return new C2884(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9838 m23713(String str, String str2, String str3, int i, InterfaceC16791 interfaceC16791, Set set, Set set2) {
        C9092 c9092 = this.f74937;
        c9092.getClass();
        return new C9838(c9092.m24234(new C13457(str, str2, str3)), i, interfaceC16791 == null ? null : m23715(interfaceC16791), ((C19380) this.f74949).m44825(set), set2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5122 m23709(String str, String str2, List list, String str3, int i, Set set, Set set2, InterfaceC7140 interfaceC7140) {
        AbstractC1928 abstractC1928M6614;
        List listOf = list == null ? AbstractC1928.of() : list;
        C5868 c5868 = this.f74918;
        c5868.getClass();
        C11833 c11833M17100 = c5868.m17100(new C13325(str, str2, str3, listOf));
        if (listOf == null) {
            abstractC1928M6614 = AbstractC1928.of();
        } else {
            abstractC1928M6614 = AbstractC1928.m6614(C7676.m20911(listOf.iterator(), new C18546(this)));
        }
        return new C5122(c11833M17100, abstractC1928M6614, i, ((C19380) this.f74949).m44825(set), set2, interfaceC7140);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7447 m23711(String str, int i, String str2, List list, String str3, Set set, ArrayList arrayList, Collection collection) {
        AbstractC5439 abstractC5439;
        AbstractC5439 abstractC54310;
        C11330 c11330M16025;
        C21530 c21530M35671;
        List listOf = list;
        C3630 c3630M53049 = null;
        String str4 = this.f28921 ? null : str3;
        if (listOf == null) {
            listOf = AbstractC1928.of();
        } else {
            HashSet hashSet = new HashSet(listOf);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (!hashSet.contains(str5)) {
                    it.remove();
                } else {
                    hashSet.remove(str5);
                }
            }
        }
        if (arrayList != null) {
            AbstractC5439 abstractC5439M16227 = AbstractC5439.m16227(C16625.m39338(arrayList, C23636.f76680));
            AbstractC5439 abstractC5439M16228 = AbstractC5439.m16227(C16625.m39338(arrayList, C23636.f76679));
            InterfaceC13062 interfaceC13062M11106 = C3389.m11106(abstractC5439M16227);
            if (interfaceC13062M11106 != null) {
                abstractC54310 = abstractC5439M16228;
                abstractC5439 = abstractC5439M16227;
                c11330M16025 = this.f74922.m16025((AbstractC22827) interfaceC13062M11106);
            } else {
                abstractC54310 = abstractC5439M16228;
                c11330M16025 = null;
                abstractC5439 = abstractC5439M16227;
            }
        } else {
            abstractC5439 = null;
            abstractC54310 = null;
            c11330M16025 = null;
        }
        C14816 c14816 = this.f74939;
        C21530 c21530M35672 = c14816.m35671(str);
        if (str2 != null) {
            c21530M35671 = c14816.m35671(str2);
        } else {
            c14816.getClass();
            c21530M35671 = null;
        }
        C20784 c20784M54774 = ((C24514) this.f74950).m54774(listOf);
        C23768 c23768 = (C23768) this.f74956;
        if (str4 != null) {
            c3630M53049 = c23768.m53049(str4);
        } else {
            c23768.getClass();
        }
        C7447 c7447 = new C7447(c21530M35672, i, c21530M35671, c20784M54774, c3630M53049, ((C19380) this.f74949).m44825(set), abstractC5439, abstractC54310, collection, c11330M16025);
        this.f74945.m36263(c7447);
        return c7447;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3630 m23719(String str) {
        return ((C23768) this.f74956).m53049(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3630 m23708(String str) {
        if (str != null) {
            return m23719(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17800 m23714(InterfaceC10824 interfaceC10824) {
        if (interfaceC10824 instanceof InterfaceC22759) {
            return m23719(((InterfaceC22759) interfaceC10824).getString());
        }
        if (interfaceC10824 instanceof InterfaceC19775) {
            return this.f74939.m35671(((InterfaceC19775) interfaceC10824).getType());
        }
        if (interfaceC10824 instanceof InterfaceC4859) {
            return this.f74918.m17100((InterfaceC4859) interfaceC10824);
        }
        if (interfaceC10824 instanceof InterfaceC8304) {
            return this.f74937.m24234((InterfaceC8304) interfaceC10824);
        }
        if (interfaceC10824 instanceof InterfaceC13524) {
            return this.f74940.m40184((InterfaceC13524) interfaceC10824);
        }
        if (interfaceC10824 instanceof InterfaceC2338) {
            return this.f74926.m5276((InterfaceC2338) interfaceC10824);
        }
        if (interfaceC10824 instanceof InterfaceC6813) {
            return this.f74952.m28000((InterfaceC6813) interfaceC10824);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23717(boolean z) {
        this.f28922 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7447 m23712(InterfaceC10122 interfaceC10122) {
        try {
            return m23706(interfaceC10122);
        } catch (Throwable th) {
            throw new RuntimeException(C25272.m56409("An error occurred with the class: ", C1402.m5124(1, 1, interfaceC10122.getType())), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[EDGE_INSN: B:37:0x00d2->B:41:0x00da BREAK  A[LOOP:4: B:31:0x00bc->B:82:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C7447 m23706(InterfaceC10122 interfaceC10122) {
        InterfaceC7140 interfaceC7140;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f28922) {
            try {
                for (InterfaceC2665 interfaceC2665 : interfaceC10122.getFields()) {
                    try {
                        arrayList.add(m23713(interfaceC2665.mo4500(), interfaceC2665.getName(), interfaceC2665.getType(), interfaceC2665.mo8823(), interfaceC2665.mo8822(), interfaceC2665.getAnnotations(), interfaceC2665.mo8821()));
                    } catch (RuntimeException unused) {
                        System.err.println(interfaceC10122.getType());
                    }
                }
            } catch (RuntimeException unused2) {
                System.err.println(interfaceC10122.getType());
            }
            try {
                for (InterfaceC8631 interfaceC8631 : interfaceC10122.getMethods()) {
                    boolean z = true;
                    InterfaceC7140 interfaceC7140M23710 = null;
                    try {
                        interfaceC7140M23710 = m23710(interfaceC8631.mo13175());
                        if (C25019.m55850(interfaceC7140M23710)) {
                            if (interfaceC7140M23710 != null) {
                                InterfaceC6163 interfaceC6163 = C4244.f15461;
                                if (C4244.m13548(interfaceC8631.mo6805(), EnumC2536.STATIC.m8459(interfaceC8631.mo13184())) <= ((C0647) interfaceC7140M23710).f2508) {
                                }
                            }
                            if (interfaceC7140M23710 == null) {
                                if (interfaceC7140M23710 == null) {
                                    z = false;
                                    break;
                                }
                                it = ((C0647) interfaceC7140M23710).f2509.iterator();
                                do {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                } while ((((InterfaceC23331) it.next()).mo30864().f73512 & 2) == 0);
                            } else {
                                try {
                                    C4135.m13260(((C0647) interfaceC7140M23710).f2510);
                                    if (interfaceC7140M23710 == null) {
                                        z = false;
                                        break;
                                    }
                                    it = ((C0647) interfaceC7140M23710).f2509.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                    } while ((((InterfaceC23331) it.next()).mo30864().f73512 & 2) == 0);
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.toString();
                    }
                    if (z) {
                        try {
                            InterfaceC6163 interfaceC6164 = C4244.f15461;
                            C10628 c10628 = new C10628(Math.max(2, C4244.m13548(interfaceC8631.mo6805(), EnumC2536.STATIC.m8459(interfaceC8631.mo13184()))));
                            C21530 c21530M35671 = this.f74939.m35671("Ljava/lang/RuntimeException;");
                            C11833 c11833M17100 = this.f74918.m17100(new C11965("Ljava/lang/RuntimeException;", "<init>", AbstractC1928.of()));
                            c10628.m27109(new C24055(EnumC22631.f73416, 0, c21530M35671));
                            c10628.m27109(new C11131(EnumC22631.f73507, 1, 0, 0, 0, 0, 0, c11833M17100));
                            c10628.m27109(new C3171(0, EnumC22631.f73493));
                            interfaceC7140 = c10628;
                        } catch (RuntimeException unused4) {
                        }
                    } else {
                        interfaceC7140 = interfaceC7140M23710;
                    }
                    arrayList2.add(m23709(interfaceC8631.mo6804(), interfaceC8631.getName(), interfaceC8631.getParameters(), interfaceC8631.mo6802(), interfaceC8631.mo13184(), interfaceC8631.getAnnotations(), interfaceC8631.mo13176(), interfaceC7140));
                }
            } catch (RuntimeException unused5) {
                System.err.println(interfaceC10122.getType());
            }
        } else {
            for (InterfaceC2665 interfaceC2666 : interfaceC10122.getFields()) {
                arrayList.add(m23713(interfaceC2666.mo4500(), interfaceC2666.getName(), interfaceC2666.getType(), interfaceC2666.mo8823(), interfaceC2666.mo8822(), interfaceC2666.getAnnotations(), interfaceC2666.mo8821()));
            }
            for (InterfaceC8631 interfaceC8632 : interfaceC10122.getMethods()) {
                arrayList2.add(m23709(interfaceC8632.mo6804(), interfaceC8632.getName(), interfaceC8632.getParameters(), interfaceC8632.mo6802(), interfaceC8632.mo13184(), interfaceC8632.getAnnotations(), interfaceC8632.mo13176(), m23710(interfaceC8632.mo13175())));
            }
        }
        return m23711(interfaceC10122.getType(), interfaceC10122.mo20404(), interfaceC10122.mo20397(), interfaceC10122.mo20402(), interfaceC10122.mo20400(), interfaceC10122.getAnnotations(), arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7140 m23710(InterfaceC7140 interfaceC7140) {
        if (interfaceC7140 == null) {
            return null;
        }
        int iMo2841 = interfaceC7140.mo2841();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f28922;
        for (InterfaceC23331 interfaceC23331 : interfaceC7140.mo2840()) {
            if (interfaceC23331 instanceof InterfaceC21839) {
                ((InterfaceC21839) interfaceC23331).mo2770(this);
            }
            if (z) {
                AbstractC19270 abstractC19270 = (AbstractC19270) interfaceC23331;
                EnumC22631 enumC22631 = abstractC19270.f62314;
                if ((enumC22631.f73512 & 2) != 0) {
                    switch (C9595.f31061[enumC22631.ordinal()]) {
                        case 1:
                            abstractC19270.f62314 = EnumC22631.f73299;
                            break;
                        case 2:
                            abstractC19270.f62314 = EnumC22631.f73247;
                            break;
                        case 3:
                            abstractC19270.f62314 = EnumC22631.f73423;
                            break;
                        case 4:
                            abstractC19270.f62314 = EnumC22631.f73282;
                            break;
                        case 5:
                            abstractC19270.f62314 = EnumC22631.f73316;
                            break;
                        case 6:
                            abstractC19270.f62314 = EnumC22631.f73308;
                            break;
                        case 7:
                            abstractC19270.f62314 = EnumC22631.f73253;
                            break;
                        case 8:
                            abstractC19270.f62314 = EnumC22631.f73276;
                            break;
                        case 9:
                            abstractC19270.f62314 = EnumC22631.f73249;
                            break;
                        case 10:
                            abstractC19270.f62314 = EnumC22631.f73507;
                            break;
                        case 11:
                            abstractC19270.f62314 = EnumC22631.f73479;
                            break;
                        case 12:
                            abstractC19270.f62314 = EnumC22631.f73479;
                            break;
                    }
                }
            }
            if (interfaceC23331 != null) {
                arrayList.add(interfaceC23331);
            }
        }
        List<InterfaceC4685> listMo2839 = interfaceC7140.mo2839();
        ArrayList arrayList3 = new ArrayList(listMo2839.size());
        for (InterfaceC4685 interfaceC4685 : listMo2839) {
            int iMo4114 = interfaceC4685.mo4114();
            int iMo4115 = interfaceC4685.mo4115();
            List<InterfaceC9376> listMo4116 = interfaceC4685.mo4116();
            ArrayList arrayList4 = new ArrayList(listMo4116.size());
            for (InterfaceC9376 interfaceC9376 : listMo4116) {
                String strMo11196 = interfaceC9376.mo11196();
                arrayList4.add(new C19292(strMo11196 == null ? null : this.f74939.m35671(strMo11196), interfaceC9376.mo11197()));
            }
            arrayList3.add(new C8105(arrayList4, iMo4114, iMo4115));
        }
        for (InterfaceC10650 interfaceC10650 : interfaceC7140.mo2842()) {
            int iMo4171 = interfaceC10650.mo4171();
            if (!this.f28921 || iMo4171 != 9) {
                if (!this.f28924 || iMo4171 != 10) {
                    if (!this.f28926 || (iMo4171 != 7 && iMo4171 != 8)) {
                        if (!this.f28925 || (iMo4171 != 3 && iMo4171 != 6 && iMo4171 != 5)) {
                            if (interfaceC10650 instanceof InterfaceC21839) {
                                ((InterfaceC21839) interfaceC10650).mo2770(this);
                            }
                            arrayList2.add(interfaceC10650);
                        }
                    }
                }
            }
        }
        return new C0647(iMo2841, arrayList, arrayList3, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23265 m23715(InterfaceC16791 interfaceC16791) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 0) {
            return new C16551(((InterfaceC1876) interfaceC16791).getValue());
        }
        if (iMo5414 == 6) {
            return new C24011(((InterfaceC20521) interfaceC16791).getValue());
        }
        if (iMo5414 == 2) {
            return new C0144(((InterfaceC4113) interfaceC16791).getValue());
        }
        if (iMo5414 == 3) {
            return new C17297(((InterfaceC11570) interfaceC16791).getValue());
        }
        if (iMo5414 == 4) {
            return new C6111(((InterfaceC3367) interfaceC16791).getValue());
        }
        if (iMo5414 == 16) {
            return new C12076(((InterfaceC23505) interfaceC16791).getValue());
        }
        if (iMo5414 == 17) {
            return new C15805(((InterfaceC24997) interfaceC16791).getValue());
        }
        C9092 c9092 = this.f74937;
        C14816 c14816 = this.f74939;
        switch (iMo5414) {
            case 21:
                return new C21027(this.f74940.m40184(((InterfaceC24251) interfaceC16791).getValue()));
            case 22:
                return new C14313(this.f74952.m28000(((InterfaceC6351) interfaceC16791).getValue()));
            case 23:
                return new C7602(((C23768) this.f74956).m53049(((InterfaceC14553) interfaceC16791).getValue()));
            case 24:
                return new C18789(c14816.m35671(((InterfaceC21267) interfaceC16791).getValue()));
            case 25:
                return new C20281(c9092.m24234(((InterfaceC16045) interfaceC16791).getValue()));
            case 26:
                return new C3873(this.f74918.m17100(((InterfaceC12316) interfaceC16791).getValue()));
            case 27:
                return new C3127(c9092.m24234(((InterfaceC17537) interfaceC16791).getValue()));
            case 28:
                return new C11330(AbstractC1928.m6614(C7676.m20911(((InterfaceC13062) interfaceC16791).getValue().iterator(), new C1393(this))));
            case 29:
                InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
                return new C1636(c14816.m35671(interfaceC15299.getType()), AbstractC8639.m23278(C7676.m20911(interfaceC15299.getElements().iterator(), new C10341(this))));
            case 30:
                return C18043.f59079;
            case 31:
                return ((InterfaceC5605) interfaceC16791).getValue() ? C24757.f80142 : C24757.f80143;
            default:
                throw new C23044(null, "Unexpected encoded value type: %d", Integer.valueOf(interfaceC16791.mo5414()));
        }
    }
}
