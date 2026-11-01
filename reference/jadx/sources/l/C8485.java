package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8485 extends AbstractC15955 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f29405;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29406;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f29407;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f29408;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f29409;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29410;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29411;

    @Override // l.AbstractC15955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22161(C10310 c10310, Object obj) {
        InterfaceC9336 interfaceC9336 = (InterfaceC9336) obj;
        int iMo2656 = interfaceC9336.mo2656();
        if (iMo2656 == 0) {
            c10310.m45632(((InterfaceC12386) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 6) {
            c10310.m45637(((InterfaceC3212) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 2) {
            c10310.m45647(((InterfaceC2237) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 3) {
            c10310.m45633(((InterfaceC17324) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 4) {
            c10310.m45636(((InterfaceC9564) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 16) {
            c10310.m45635(((InterfaceC1801) interfaceC9336).getValue());
            return;
        }
        if (iMo2656 == 17) {
            c10310.m45634(((InterfaceC6035) interfaceC9336).getValue());
            return;
        }
        switch (iMo2656) {
            case 21:
                c10310.m45644(((C0950) interfaceC9336).f3768);
                return;
            case 22:
                c10310.m45643(((C22118) interfaceC9336).f71614);
                return;
            case 23:
                c10310.m45641(((C6595) interfaceC9336).f22216);
                return;
            case 24:
                c10310.m45639(((C22824) interfaceC9336).f74274);
                return;
            case 25:
                c10310.m45648(((C4478) interfaceC9336).f15929);
                return;
            case 26:
                c10310.m45642(((C5184) interfaceC9336).f17988);
                return;
            case 27:
                c10310.m45645(((C2984) interfaceC9336).f11195);
                return;
            case 28:
                c10310.m45638(((C5807) interfaceC9336).f19725);
                return;
            case 29:
                C17096 c17096 = (C17096) interfaceC9336;
                c10310.m45640(c17096.f54553, c17096.f54552);
                return;
            case 30:
                c10310.m45631();
                return;
            case 31:
                c10310.m45646(((InterfaceC16619) interfaceC9336).getValue());
                return;
            default:
                throw new C20749(null, "Unrecognized value type: %d", Integer.valueOf(interfaceC9336.mo2656()));
        }
    }

    public C8485(C7474 c7474) {
        super(c7474);
        this.f29405 = false;
    }

    @Override // l.AbstractC15955
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo22163() {
        return !this.f29411 && super.mo22163();
    }

    @Override // l.AbstractC15955
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19068 mo22158() {
        return new C19068(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15063 m22157(String str, String str2, String str3, int i, InterfaceC10975 interfaceC10975, Set set, Set set2) {
        C17884 c17884 = this.f51680;
        c17884.getClass();
        return new C15063(c17884.m41508(new C0121(str, str2, str3)), i, interfaceC10975 == null ? null : m22154(interfaceC10975), ((C22741) this.f51674).m50406(set), set2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10124 m22155(String str, String str2, List list, String str3, int i, Set set, Set set2, InterfaceC7945 interfaceC7945) {
        AbstractC22433 abstractC22433M49799;
        List listOf = list == null ? AbstractC22433.of() : list;
        C12241 c12241 = this.f51694;
        c12241.getClass();
        C5890 c5890M30444 = c12241.m30444(new C16474(str, str2, str3, listOf));
        if (listOf == null) {
            abstractC22433M49799 = AbstractC22433.of();
        } else {
            abstractC22433M49799 = AbstractC22433.m49799(C16458.m38720(listOf.iterator(), new C13424(this)));
        }
        return new C10124(c5890M30444, abstractC22433M49799, i, ((C22741) this.f51674).m50406(set), set2, interfaceC7945);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19213 m22159(String str, int i, String str2, List list, String str3, Set set, ArrayList arrayList, Collection collection) {
        AbstractC0934 abstractC0934;
        AbstractC0934 abstractC0935;
        C5807 c5807M30245;
        C1428 c1428M50097;
        List listOf = list;
        C3067 c3067M24176 = null;
        String str4 = this.f29406 ? null : str3;
        if (listOf == null) {
            listOf = AbstractC22433.of();
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
            AbstractC0934 abstractC0934M3682 = AbstractC0934.m3682(C22808.m50474(arrayList, C9254.f31468));
            AbstractC0934 abstractC0934M3683 = AbstractC0934.m3682(C22808.m50474(arrayList, C9254.f31467));
            InterfaceC0390 interfaceC0390M25085 = C9896.m25085(abstractC0934M3682);
            if (interfaceC0390M25085 != null) {
                abstractC0935 = abstractC0934M3683;
                abstractC0934 = abstractC0934M3682;
                c5807M30245 = this.f51679.m30245((AbstractC7619) interfaceC0390M25085);
            } else {
                abstractC0935 = abstractC0934M3683;
                c5807M30245 = null;
                abstractC0934 = abstractC0934M3682;
            }
        } else {
            abstractC0934 = null;
            abstractC0935 = null;
            c5807M30245 = null;
        }
        C22596 c22596 = this.f51666;
        C1428 c1428M50098 = c22596.m50097(str);
        if (str2 != null) {
            c1428M50097 = c22596.m50097(str2);
        } else {
            c22596.getClass();
            c1428M50097 = null;
        }
        C4956 c4956M8598 = ((C2839) this.f51675).m8598(listOf);
        C9419 c9419 = (C9419) this.f51669;
        if (str4 != null) {
            c3067M24176 = c9419.m24176(str4);
        } else {
            c9419.getClass();
        }
        C19213 c19213 = new C19213(c1428M50098, i, c1428M50097, c4956M8598, c3067M24176, ((C22741) this.f51674).m50406(set), abstractC0934, abstractC0935, collection, c5807M30245);
        this.f51692.m1283(c19213);
        return c19213;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3067 m22164(String str) {
        return ((C9419) this.f51669).m24176(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3067 m22152(String str) {
        if (str != null) {
            return m22164(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14358 m22156(InterfaceC7446 interfaceC7446) {
        if (interfaceC7446 instanceof InterfaceC20852) {
            return m22164(((InterfaceC20852) interfaceC7446).getString());
        }
        if (interfaceC7446 instanceof InterfaceC15914) {
            return this.f51666.m50097(((InterfaceC15914) interfaceC7446).getType());
        }
        if (interfaceC7446 instanceof InterfaceC8858) {
            return this.f51694.m30444((InterfaceC8858) interfaceC7446);
        }
        if (interfaceC7446 instanceof InterfaceC18735) {
            return this.f51680.m41508((InterfaceC18735) interfaceC7446);
        }
        if (interfaceC7446 instanceof InterfaceC19441) {
            return this.f51670.m51843((InterfaceC19441) interfaceC7446);
        }
        if (interfaceC7446 instanceof InterfaceC18029) {
            return this.f51687.m47840((InterfaceC18029) interfaceC7446);
        }
        if (interfaceC7446 instanceof InterfaceC8152) {
            return this.f51699.m46557((InterfaceC8152) interfaceC7446);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22162(boolean z) {
        this.f29405 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19213 m22160(InterfaceC22762 interfaceC22762) {
        try {
            return m22151(interfaceC22762);
        } catch (Throwable th) {
            throw new RuntimeException(C0252.m1693("An error occurred with the class: ", C20630.m46498(1, 1, interfaceC22762.getType())), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[EDGE_INSN: B:37:0x00d2->B:41:0x00da BREAK  A[LOOP:4: B:31:0x00bc->B:82:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C19213 m22151(InterfaceC22762 interfaceC22762) {
        InterfaceC7945 interfaceC7945;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f29405) {
            try {
                for (InterfaceC17822 interfaceC17822 : interfaceC22762.getFields()) {
                    try {
                        arrayList.add(m22157(interfaceC17822.mo1183(), interfaceC17822.getName(), interfaceC17822.getType(), interfaceC17822.mo28400(), interfaceC17822.mo28399(), interfaceC17822.getAnnotations(), interfaceC17822.mo28398()));
                    } catch (RuntimeException unused) {
                        System.err.println(interfaceC22762.getType());
                    }
                }
            } catch (RuntimeException unused2) {
                System.err.println(interfaceC22762.getType());
            }
            try {
                for (InterfaceC18528 interfaceC18528 : interfaceC22762.getMethods()) {
                    boolean z = true;
                    InterfaceC7945 interfaceC7945M22153 = null;
                    try {
                        interfaceC7945M22153 = m22153(interfaceC18528.mo25747());
                        if (C19378.m44400(interfaceC7945M22153)) {
                            if (interfaceC7945M22153 != null) {
                                InterfaceC19010 interfaceC19010 = C5370.f18561;
                                if (C5370.m14887(interfaceC18528.mo9699(), EnumC15236.STATIC.m36501(interfaceC18528.mo25750())) <= ((C4250) interfaceC7945M22153).f15363) {
                                }
                            }
                            if (interfaceC7945M22153 == null) {
                                if (interfaceC7945M22153 == null) {
                                    z = false;
                                    break;
                                }
                                it = ((C4250) interfaceC7945M22153).f15364.iterator();
                                do {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                } while ((((InterfaceC1594) it.next()).mo5435().f35324 & 2) == 0);
                            } else {
                                try {
                                    C2609.m8081(((C4250) interfaceC7945M22153).f15361);
                                    if (interfaceC7945M22153 == null) {
                                        z = false;
                                        break;
                                    }
                                    it = ((C4250) interfaceC7945M22153).f15364.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                    } while ((((InterfaceC1594) it.next()).mo5435().f35324 & 2) == 0);
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.toString();
                    }
                    if (z) {
                        try {
                            InterfaceC19010 interfaceC19011 = C5370.f18561;
                            C10111 c10111 = new C10111(Math.max(2, C5370.m14887(interfaceC18528.mo9699(), EnumC15236.STATIC.m36501(interfaceC18528.mo25750()))));
                            C1428 c1428M50097 = this.f51666.m50097("Ljava/lang/RuntimeException;");
                            C5890 c5890M30444 = this.f51694.m30444(new C17055("Ljava/lang/RuntimeException;", "<init>", AbstractC22433.of()));
                            c10111.m25734(new C13784(EnumC10297.f35226, 0, c1428M50097));
                            c10111.m25734(new C10256(EnumC10297.f35308, 1, 0, 0, 0, 0, 0, c5890M30444));
                            c10111.m25734(new C1643(0, EnumC10297.f35133));
                            interfaceC7945 = c10111;
                        } catch (RuntimeException unused4) {
                        }
                    } else {
                        interfaceC7945 = interfaceC7945M22153;
                    }
                    arrayList2.add(m22155(interfaceC18528.mo9700(), interfaceC18528.getName(), interfaceC18528.getParameters(), interfaceC18528.mo9698(), interfaceC18528.mo25750(), interfaceC18528.getAnnotations(), interfaceC18528.mo25749(), interfaceC7945));
                }
            } catch (RuntimeException unused5) {
                System.err.println(interfaceC22762.getType());
            }
        } else {
            for (InterfaceC17822 interfaceC17823 : interfaceC22762.getFields()) {
                arrayList.add(m22157(interfaceC17823.mo1183(), interfaceC17823.getName(), interfaceC17823.getType(), interfaceC17823.mo28400(), interfaceC17823.mo28399(), interfaceC17823.getAnnotations(), interfaceC17823.mo28398()));
            }
            for (InterfaceC18528 interfaceC18529 : interfaceC22762.getMethods()) {
                arrayList2.add(m22155(interfaceC18529.mo9700(), interfaceC18529.getName(), interfaceC18529.getParameters(), interfaceC18529.mo9698(), interfaceC18529.mo25750(), interfaceC18529.getAnnotations(), interfaceC18529.mo25749(), m22153(interfaceC18529.mo25747())));
            }
        }
        return m22159(interfaceC22762.getType(), interfaceC22762.mo20491(), interfaceC22762.mo20494(), interfaceC22762.mo20500(), interfaceC22762.mo20493(), interfaceC22762.getAnnotations(), arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7945 m22153(InterfaceC7945 interfaceC7945) {
        if (interfaceC7945 == null) {
            return null;
        }
        int iMo11507 = interfaceC7945.mo11507();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f29405;
        for (InterfaceC1594 interfaceC1594 : interfaceC7945.mo11508()) {
            if (interfaceC1594 instanceof InterfaceC10062) {
                ((InterfaceC10062) interfaceC1594).mo1141(this);
            }
            if (z) {
                AbstractC6686 abstractC6686 = (AbstractC6686) interfaceC1594;
                EnumC10297 enumC10297 = abstractC6686.f22551;
                if ((enumC10297.f35324 & 2) != 0) {
                    switch (C18362.f58568[enumC10297.ordinal()]) {
                        case 1:
                            abstractC6686.f22551 = EnumC10297.f35165;
                            break;
                        case 2:
                            abstractC6686.f22551 = EnumC10297.f35171;
                            break;
                        case 3:
                            abstractC6686.f22551 = EnumC10297.f35291;
                            break;
                        case 4:
                            abstractC6686.f22551 = EnumC10297.f35101;
                            break;
                        case 5:
                            abstractC6686.f22551 = EnumC10297.f35190;
                            break;
                        case 6:
                            abstractC6686.f22551 = EnumC10297.f35157;
                            break;
                        case 7:
                            abstractC6686.f22551 = EnumC10297.f35091;
                            break;
                        case 8:
                            abstractC6686.f22551 = EnumC10297.f35283;
                            break;
                        case 9:
                            abstractC6686.f22551 = EnumC10297.f35093;
                            break;
                        case 10:
                            abstractC6686.f22551 = EnumC10297.f35308;
                            break;
                        case 11:
                            abstractC6686.f22551 = EnumC10297.f35072;
                            break;
                        case 12:
                            abstractC6686.f22551 = EnumC10297.f35072;
                            break;
                    }
                }
            }
            if (interfaceC1594 != null) {
                arrayList.add(interfaceC1594);
            }
        }
        List<InterfaceC8651> listMo11511 = interfaceC7945.mo11511();
        ArrayList arrayList3 = new ArrayList(listMo11511.size());
        for (InterfaceC8651 interfaceC8651 : listMo11511) {
            int iMo18941 = interfaceC8651.mo18941();
            int iMo18942 = interfaceC8651.mo18942();
            List<InterfaceC21350> listMo18943 = interfaceC8651.mo18943();
            ArrayList arrayList4 = new ArrayList(listMo18943.size());
            for (InterfaceC21350 interfaceC21350 : listMo18943) {
                String strMo6347 = interfaceC21350.mo6347();
                arrayList4.add(new C23302(strMo6347 == null ? null : this.f51666.m50097(strMo6347), interfaceC21350.mo6346()));
            }
            arrayList3.add(new C7073(arrayList4, iMo18941, iMo18942));
        }
        for (InterfaceC7239 interfaceC7239 : interfaceC7945.mo11510()) {
            int iMo1599 = interfaceC7239.mo1599();
            if (!this.f29406 || iMo1599 != 9) {
                if (!this.f29407 || iMo1599 != 10) {
                    if (!this.f29409 || (iMo1599 != 7 && iMo1599 != 8)) {
                        if (!this.f29410 || (iMo1599 != 3 && iMo1599 != 6 && iMo1599 != 5)) {
                            if (interfaceC7239 instanceof InterfaceC10062) {
                                ((InterfaceC10062) interfaceC7239).mo1141(this);
                            }
                            arrayList2.add(interfaceC7239);
                        }
                    }
                }
            }
        }
        return new C4250(iMo11507, arrayList, arrayList3, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9336 m22154(InterfaceC10975 interfaceC10975) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 0) {
            return new C23447(((InterfaceC12386) interfaceC10975).getValue());
        }
        if (iMo2656 == 6) {
            return new C2361(((InterfaceC3212) interfaceC10975).getValue());
        }
        if (iMo2656 == 2) {
            return new C3772(((InterfaceC2237) interfaceC10975).getValue());
        }
        if (iMo2656 == 3) {
            return new C14275(((InterfaceC17324) interfaceC10975).getValue());
        }
        if (iMo2656 == 4) {
            return new C11535(((InterfaceC9564) interfaceC10975).getValue());
        }
        if (iMo2656 == 16) {
            return new C13652(((InterfaceC1801) interfaceC10975).getValue());
        }
        if (iMo2656 == 17) {
            return new C1573(((InterfaceC6035) interfaceC10975).getValue());
        }
        C17884 c17884 = this.f51680;
        C22596 c22596 = this.f51666;
        switch (iMo2656) {
            case 21:
                return new C0950(this.f51670.m51843(((InterfaceC11411) interfaceC10975).getValue()));
            case 22:
                return new C22118(this.f51699.m46557(((InterfaceC13528) interfaceC10975).getValue()));
            case 23:
                return new C6595(((C9419) this.f51669).m24176(((InterfaceC5060) interfaceC10975).getValue()));
            case 24:
                return new C22824(c22596.m50097(((InterfaceC21994) interfaceC10975).getValue()));
            case 25:
                return new C4478(c17884.m41508(((InterfaceC14503) interfaceC10975).getValue()));
            case 26:
                return new C5184(this.f51694.m30444(((InterfaceC4354) interfaceC10975).getValue()));
            case 27:
                return new C2984(c17884.m41508(((InterfaceC23675) interfaceC10975).getValue()));
            case 28:
                return new C5807(AbstractC22433.m49799(C16458.m38720(((InterfaceC0390) interfaceC10975).getValue().iterator(), new C21890(this))));
            case 29:
                InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
                return new C17096(c22596.m50097(interfaceC20147.getType()), AbstractC23844.m52569(C16458.m38720(interfaceC20147.getElements().iterator(), new C15541(this))));
            case 30:
                return C12946.f43036;
            case 31:
                return ((InterfaceC16619) interfaceC10975).getValue() ? C10747.f36643 : C10747.f36644;
            default:
                throw new C20749(null, "Unexpected encoded value type: %d", Integer.valueOf(interfaceC10975.mo2656()));
        }
    }
}
