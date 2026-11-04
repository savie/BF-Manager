package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11984 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11984 f38608;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14967 f38609;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6765 f38610;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24927 f38611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f38612;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC9110 f38613;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f38614;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f38615;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f38616;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38617;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f38618;

    public C11984(C24927 c24927, C11984 c11984) {
        this(c24927, c11984, c11984.f38618, c11984.f38615, c11984.f38612, c11984.f38613);
    }

    public C11984(C24927 c24927, C11984 c11984, boolean z, boolean z2, boolean z3, EnumC9110 enumC9110) {
        this.f38614 = new HashSet();
        this.f38611 = c24927;
        this.f38608 = c11984;
        this.f38615 = z2;
        this.f38618 = z;
        this.f38612 = z3;
        this.f38613 = enumC9110;
        this.f38609 = new C14967(c24927, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24927 m30113() {
        return this.f38611;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m30107() {
        EnumC1763 enumC1763 = EnumC1763.PACKAGE_INFO;
        C24927 c24927 = this.f38611;
        if (!c24927.mo17865(enumC1763)) {
            C10907 c10907M5679 = c24927.mo8527().m5679();
            m30100((InterfaceC3145) c10907M5679);
            C10907 c10907M56710 = c24927.mo8527().m5679();
            m30097(c10907M56710);
            m30087(c10907M56710);
            c10907M56710.mo10272(c10907M5679);
            return c10907M56710.m27683();
        }
        C10907 c10907M56711 = c24927.mo8527().m5679();
        this.f38609.m36030(c10907M56711);
        c10907M56711.mo10285();
        c10907M56711.mo10275((InterfaceC16874) c24927);
        m30097(c10907M56711);
        m30087(c10907M56711);
        return c10907M56711.m27683();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m30097(C10907 c10907) {
        C24927 c24927 = this.f38611;
        if (c24927.m55583().isEmpty()) {
            return;
        }
        c10907.add("package ");
        c10907.add(c24927.m55583());
        c10907.mo10270(';');
        c10907.mo10285();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30087(final C10907 c10907) {
        HashSet hashSet = this.f38614;
        if (hashSet.size() != 0) {
            C1170.stream(hashSet).sorted(C2661.comparing(new C23173(0))).forEach(new Consumer() { // from class: l.ۗ֡ۗ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C11984.m30089(this.f9838, c10907, (C1345) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
            c10907.mo10285();
            hashSet.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30089(C11984 c11984, C10907 c10907, C1345 c1345) {
        c10907.mo10283("import ");
        C24927 c24927M5671 = c11984.f38611.mo8527().m5671(c1345);
        if (c24927M5671 != null) {
            c10907.mo10274((InterfaceC11653) c24927M5671);
        }
        c10907.add(c1345.m4959());
        c10907.mo10270(';');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30100(InterfaceC3145 interfaceC3145) {
        EnumC1763 enumC1763 = EnumC1763.DONT_GENERATE;
        C24927 c24927 = this.f38611;
        if (!c24927.mo17865(enumC1763) || C8314.m22412(c24927)) {
            C10293 c10293Mo8547 = c24927.mo8547();
            if (c10293Mo8547.m26534()) {
                c10293Mo8547 = c10293Mo8547.m26546(1024).m26546(8);
            }
            if (!c24927.m55571().m4962()) {
                c10293Mo8547 = c10293Mo8547.m26546(8).m26546(2);
            }
            C5492.m16318(interfaceC3145, (AbstractC12531) c24927);
            C5492.m16321(interfaceC3145, c24927);
            C5492.m16320(interfaceC3145, c24927);
            this.f38609.m36030(interfaceC3145);
            interfaceC3145.mo10277(c24927.m16977()).add(c10293Mo8547.m26529(c24927.m31135(EnumC17315.INFO)));
            if (c10293Mo8547.m26534()) {
                if (c10293Mo8547.m26535()) {
                    interfaceC3145.mo10270('@');
                }
                interfaceC3145.add("interface ");
            } else if (c10293Mo8547.m26539()) {
                interfaceC3145.add("enum ");
            } else {
                interfaceC3145.add("class ");
            }
            interfaceC3145.mo10275((InterfaceC16874) c24927);
            interfaceC3145.add(c24927.m55571().m4965());
            m30106(interfaceC3145, c24927.m55566(), true);
            interfaceC3145.mo10270(' ');
            AbstractC1566 abstractC1566M55553 = c24927.m55553();
            if (abstractC1566M55553 != null && !abstractC1566M55553.equals(AbstractC1566.f5426) && !c24927.mo17865(EnumC1763.REMOVE_SUPER_CLASS)) {
                interfaceC3145.add("extends ");
                m30102(interfaceC3145, abstractC1566M55553);
                interfaceC3145.mo10270(' ');
            }
            if (!c24927.m55564().isEmpty() && !c10293Mo8547.m26535()) {
                if (c24927.mo8547().m26534()) {
                    interfaceC3145.add("extends ");
                } else {
                    interfaceC3145.add("implements ");
                }
                Iterator it = c24927.m55564().iterator();
                while (it.hasNext()) {
                    m30102(interfaceC3145, (AbstractC1566) it.next());
                    if (it.hasNext()) {
                        interfaceC3145.add(", ");
                    }
                }
                if (!c24927.m55564().isEmpty()) {
                    interfaceC3145.mo10270(' ');
                }
            }
            m30104(interfaceC3145, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30106(InterfaceC3145 interfaceC3145, List list, boolean z) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return false;
        }
        interfaceC3145.mo10270('<');
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1566 abstractC1566 = (AbstractC1566) it.next();
            if (i != 0) {
                interfaceC3145.add(", ");
            }
            if (abstractC1566.m5569()) {
                interfaceC3145.add(abstractC1566.mo5570());
            } else {
                m30102(interfaceC3145, abstractC1566);
            }
            List listMo5549 = abstractC1566.mo5549();
            if (listMo5549 != null && !listMo5549.isEmpty()) {
                interfaceC3145.add(" extends ");
                Iterator it2 = listMo5549.iterator();
                while (it2.hasNext()) {
                    AbstractC1566 abstractC1567 = (AbstractC1566) it2.next();
                    if (abstractC1567.m5569()) {
                        interfaceC3145.add(abstractC1567.mo5570());
                    } else {
                        m30102(interfaceC3145, abstractC1567);
                        if (z) {
                            C24927 c24927 = this.f38611;
                            if (!c24927.m55571().m4962() && c24927.mo8527().m5681().m17710()) {
                                m30084(C1345.m4955(c24927.mo8527(), abstractC1567));
                            }
                        }
                    }
                    if (it2.hasNext()) {
                        interfaceC3145.add(" & ");
                    }
                }
            }
            i++;
        }
        interfaceC3145.mo10270('>');
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0234  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30104(InterfaceC3145 interfaceC3145, boolean z) {
        String strM36534;
        C24927 c24927M55574;
        C21482 c21482;
        interfaceC3145.mo10270('{');
        C24927 c24927 = this.f38611;
        if (z && c24927.m31135(EnumC17315.INFO)) {
            interfaceC3145.add(" // from class: " + c24927.m55571().m4957());
        }
        int i = 1;
        this.f38616 = true;
        this.f38617 = interfaceC3145.getLength();
        interfaceC3145.mo10278();
        C1017 c1017 = (C1017) c24927.mo17862((InterfaceC2157) C11457.f36006);
        int i2 = 0;
        if (c1017 != null) {
            Iterator it = c1017.m3913().iterator();
            C0052 c0052 = null;
            while (it.hasNext()) {
                C9965 c9965 = (C9965) it.next();
                C5492.m16318(interfaceC3145, c9965.m25797());
                interfaceC3145.mo10283(c9965.m25797().m40967());
                C6787 c6787M25798 = c9965.m25798();
                C2551 c2551M5668 = c24927.mo8527().m5668(c6787M25798.mo18926());
                if (c6787M25798.m44039() > ((c2551M5668 == null || (c21482 = (C21482) c2551M5668.mo17862((InterfaceC2157) C11457.f36005)) == null) ? 0 : c21482.m48889())) {
                    if (c0052 == null) {
                        c0052 = new C0052(new C8256(this, c1017.m3915()), false);
                    }
                    c0052.m939(interfaceC3145, c6787M25798, 0, c2551M5668);
                }
                if (c9965.m25795() != null) {
                    interfaceC3145.mo10270(' ');
                    new C11984(c9965.m25795(), this).m30104(interfaceC3145, true);
                }
                if (it.hasNext()) {
                    interfaceC3145.mo10270(',');
                }
            }
            Iterator it2 = c24927.getMethods().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((C2551) it2.next()).mo17865(EnumC1763.DONT_GENERATE)) {
                    }
                } else if (!m30081()) {
                    Iterator it3 = c24927.m55534().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((C24927) it3.next()).mo17867(C11457.f36004)) {
                            }
                        }
                    }
                }
                if (c1017.m3913().isEmpty()) {
                    interfaceC3145.mo10282();
                }
                interfaceC3145.mo10270(';');
                if (m30081()) {
                    interfaceC3145.mo10285();
                }
            }
        }
        for (C17467 c17467 : c24927.getFields()) {
            if (!c17467.mo17865(EnumC1763.DONT_GENERATE)) {
                if (c17467.mo17867(C25278.f81639) || c17467.mo17867(C11457.f36016) || c17467.mo17867(C11457.f36032)) {
                    interfaceC3145.mo10285();
                }
                C5492.m16318(interfaceC3145, c17467);
                C14967 c14967 = this.f38609;
                c14967.m36032(interfaceC3145, c17467);
                interfaceC3145.mo10283(c17467.mo8547().m26529(c17467.m31135(EnumC17315.INFO)));
                m30115(interfaceC3145, c17467.getType());
                interfaceC3145.mo10270(' ');
                interfaceC3145.mo10275((InterfaceC16874) c17467);
                interfaceC3145.add(c17467.m40967());
                C12203 c12203 = (C12203) c17467.mo17862((InterfaceC2157) C11457.f36023);
                if (c12203 == null) {
                    C15580 c15580 = (C15580) c17467.mo17862(C25278.f81643);
                    if (c15580 != null) {
                        interfaceC3145.add(" = ");
                        EnumC23040 enumC23040M37317 = c15580.m37317();
                        EnumC23040 enumC23040 = EnumC23040.ENCODED_NULL;
                        boolean z2 = this.f38615;
                        if (enumC23040M37317 == enumC23040) {
                            AbstractC1566 type = c17467.getType();
                            int i3 = C15186.f49582;
                            interfaceC3145.add(C15186.m36534(0L, type, c24927.mo8527().m5686(), z2, false));
                        } else {
                            Object objM17589 = C6077.m17589(c15580);
                            if (objM17589 instanceof C23195) {
                                long jM52122 = ((C23195) objM17589).m52122();
                                AbstractC1566 type2 = c17467.getType();
                                if (this.f38613 != EnumC9110.DECIMAL) {
                                    int i4 = C14563.f45885;
                                    if (type2.equals(AbstractC1566.f5429) && (c24927M55574 = c24927.m55574()) != null && c24927M55574.m55559().equals("R")) {
                                        strM36534 = String.format("0x%08x", Long.valueOf(jM52122));
                                    } else {
                                        int i5 = C15186.f49582;
                                        strM36534 = C15186.m36534(jM52122, type2, c24927.mo8527().m5686(), z2, false);
                                    }
                                } else {
                                    int i6 = C15186.f49582;
                                    strM36534 = C15186.m36534(jM52122, type2, c24927.mo8527().m5686(), z2, false);
                                }
                                interfaceC3145.add(strM36534);
                            } else {
                                c14967.m36029(c24927.mo8527(), interfaceC3145, c15580);
                            }
                        }
                    }
                } else {
                    C0052 c0053 = new C0052(new C8256(this, c12203.m30481()), false);
                    interfaceC3145.add(" = ");
                    try {
                        c0053.m944(c12203.m30480(), interfaceC3145, EnumC17951.BODY_ONLY_NOWRAP);
                    } catch (Exception e) {
                        C23977.m53506(c24927, "Failed to generate init code", e);
                    }
                }
                interfaceC3145.mo10270(';');
            }
        }
        C23654.of((Object[]) new List[]{c24927.m55534(), c24927.getMethods()}).flatMap(new C3984(i)).filter(new C12730(0, this)).sorted(C8627.thenComparing(C8627.thenComparingInt(C2661.comparingInt(new C1544(0)), new C11238()), new C24665(i2, new HashMap()))).forEach(new C16459(i2, this, interfaceC3145));
        interfaceC3145.mo10279();
        interfaceC3145.mo10280();
        interfaceC3145.mo10274(C23588.f76593);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m30082(HashMap map, AbstractC12531 abstractC12531) {
        return (String) C11392.computeIfAbsent(map, abstractC12531, new C6361(5));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30088(C11984 c11984, InterfaceC3145 interfaceC3145, AbstractC12531 abstractC12531) {
        C17752 c17752;
        if (abstractC12531 instanceof C24927) {
            C24927 c24927 = (C24927) abstractC12531;
            try {
                C11984 c11985 = c11984.f38608;
                if (c11985 == null) {
                    c11985 = c11984;
                }
                C11984 c11986 = new C11984(c24927, c11985);
                interfaceC3145.mo10285();
                c11986.m30100(interfaceC3145);
                c11984.f38614.addAll(c11986.m30108());
                return;
            } catch (Exception e) {
                C23977.m53506(c24927, "Inner class code generation error", e);
                return;
            }
        }
        C2551 c2551 = (C2551) abstractC12531;
        if (!C8314.m22398(c11984.f38611).m37753() && (c17752 = (C17752) c2551.mo17862((InterfaceC2157) C11457.f36009)) != null && !c17752.m41568()) {
            try {
                if (c2551.m8514().isEmpty()) {
                    c2551.mo17866(EnumC1763.DONT_GENERATE);
                    return;
                }
                Iterator it = c2551.m8514().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        List list = (List) C1170.stream(c2551.m8514()).filter(new C5273(i)).collect(C2025.toList());
                        if (list.isEmpty()) {
                            c2551.mo17866(EnumC1763.DONT_GENERATE);
                            return;
                        }
                        c2551.m31133("Method not inlined, still used in: " + list);
                        break;
                    }
                    C2551 c2552 = (C2551) it.next();
                    C18959 c18959M41569 = c17752.m41569();
                    int i2 = C5667.f19553;
                    if (((Boolean) c18959M41569.m44009(new C15361(c2552))) == null) {
                        i = 1;
                    }
                    if (i == 0) {
                        c2551.m31133("Method not inlined, access restricted in: " + c2551.m8514());
                        break;
                    }
                }
            } catch (Exception e2) {
                c2551.m31134("Failed to check method usage", e2);
            }
        }
        if (interfaceC3145.getLength() != c11984.f38617) {
            interfaceC3145.mo10285();
        }
        int iMo10269 = interfaceC3145.mo10269();
        try {
            c11984.m30103(interfaceC3145, c2551);
        } catch (Exception e3) {
            if (!c2551.m8536().m55556().mo17865(EnumC1763.RESTART_CODEGEN)) {
                C23977.m53506(c2551, "Method generation error", e3);
                C5492.m16321(interfaceC3145, c2551);
                interfaceC3145.mo10273(iMo10269);
                return;
            }
            throw new C8597("Method generation error", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30083(AbstractC12531 abstractC12531) {
        int i = C20189.f64818[abstractC12531.mo8493().ordinal()];
        if (i == 1) {
            return ((C24927) abstractC12531).m55571().m4965();
        }
        if (i != 2) {
            if (i == 3) {
                C14022 c14022Mo13008 = ((C17467) abstractC12531).mo13008();
                return c14022Mo13008.m34145() + ':' + C15186.m36535(AbstractC1566.m5532(abstractC12531.mo8527(), c14022Mo13008.m34149()));
            }
            throw new IllegalArgumentException("Unexpected type: " + abstractC12531.mo8493());
        }
        C2551 c2551 = (C2551) abstractC12531;
        C1610 c1610Mo8527 = c2551.mo8527();
        return c2551.m8522() + '(' + ((String) C1170.stream(c2551.mo8532().m49702()).map(new C15309(1, c1610Mo8527)).collect(C2025.joining())) + ')' + C15186.m36535(AbstractC1566.m5532(c1610Mo8527, c2551.mo8532().m49698()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30093(C11984 c11984, AbstractC12531 abstractC12531) {
        return !((c11984.f38615 || ((abstractC12531 instanceof C24927) && C8314.m22412((C24927) abstractC12531))) ? false : abstractC12531.mo17865(EnumC1763.DONT_GENERATE));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30103(InterfaceC3145 interfaceC3145, C2551 c2551) throws Exception {
        if (c2551.m8524() || !C8314.m22407(c2551)) {
            m30086(interfaceC3145, c2551, false);
            return;
        }
        C24927 c24927 = this.f38611;
        C10907 c10907M5679 = c24927.mo8527().m5679();
        c10907M5679.mo10273(interfaceC3145.mo10269());
        if (!c2551.mo17867(C11457.f36007)) {
            try {
                m30086((InterfaceC3145) c10907M5679, c2551, false);
            } catch (Exception e) {
                if (c2551.m8516().mo17865(EnumC1763.RESTART_CODEGEN)) {
                    throw e;
                }
                C23977.m53506(c2551, "Method generation error", e);
                c10907M5679 = c24927.mo8527().m5679();
                c10907M5679.mo10273(interfaceC3145.mo10269());
                try {
                    C8256.m22236(c2551);
                    m30086((InterfaceC3145) c10907M5679, c2551, true);
                } catch (C9342 e2) {
                    throw new C7852(c2551, "Failed to reload method in instruction form", e2);
                }
            }
            interfaceC3145.mo10272(c10907M5679);
        }
        try {
            C8256.m22236(c2551);
        } catch (C9342 e3) {
            throw new C7852(c2551, "Failed to reload method in instruction form", e3);
        }
        m30086((InterfaceC3145) c10907M5679, c2551, true);
        interfaceC3145.mo10272(c10907M5679);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30086(InterfaceC3145 interfaceC3145, C2551 c2551, boolean z) {
        C8256 c8256M22230;
        boolean z2;
        int length = interfaceC3145.getLength();
        int i = 0;
        boolean z3 = this.f38615;
        if (!z3) {
            if (c2551.m8515() == null) {
                z2 = false;
            } else {
                boolean[] zArr = {false};
                C20531.m47066(c2551, c2551.m8515(), new C15713(i, zArr));
                z2 = zArr[0];
            }
            if (z2) {
                c2551.m31138("Ignored leaked move-result in code generation, using default value to continue");
            }
        }
        C5492.m16318(interfaceC3145, c2551);
        C5492.m16321(interfaceC3145, c2551);
        if (c2551.m8524()) {
            new C8256(this, c2551).m22240(interfaceC3145, length);
            interfaceC3145.mo10270(';');
        } else {
            boolean zMo17865 = c2551.mo17865(EnumC1763.INCONSISTENT_CODE);
            if (zMo17865 && this.f38612) {
                zMo17865 = false;
            }
            if (zMo17865 || z3 || c2551.mo17867(C11457.f36007)) {
                c8256M22230 = C8256.m22230(c2551);
            } else {
                c8256M22230 = new C8256(this, c2551);
            }
            if (c8256M22230.m22240(interfaceC3145, length)) {
                interfaceC3145.mo10270(' ');
            }
            interfaceC3145.mo10270('{');
            interfaceC3145.mo10278();
            if (z) {
                c8256M22230.m22239(interfaceC3145, false);
            } else {
                c8256M22230.m22238(interfaceC3145);
            }
            interfaceC3145.mo10279();
            interfaceC3145.mo10280();
        }
        interfaceC3145.mo10274(C23588.f76593);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30081() {
        Iterator it = this.f38611.getFields().iterator();
        while (it.hasNext()) {
            if (!((C17467) it.next()).mo17865(EnumC1763.DONT_GENERATE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30115(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566) {
        EnumC12006 enumC12006Mo5558 = abstractC1566.mo5558();
        if (enumC12006Mo5558 == null) {
            interfaceC3145.add(abstractC1566.toString());
            return;
        }
        if (enumC12006Mo5558 == EnumC12006.OBJECT) {
            if (abstractC1566.m5569()) {
                interfaceC3145.add(abstractC1566.mo5570());
                return;
            } else {
                m30102(interfaceC3145, abstractC1566);
                return;
            }
        }
        if (enumC12006Mo5558 == EnumC12006.ARRAY) {
            m30115(interfaceC3145, abstractC1566.mo5557());
            interfaceC3145.add("[]");
        } else {
            interfaceC3145.add(enumC12006Mo5558.m30194());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30102(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566) {
        AbstractC1566 abstractC1566Mo5559 = abstractC1566.mo5559();
        if (abstractC1566Mo5559 != null) {
            m30102(interfaceC3145, abstractC1566Mo5559);
            interfaceC3145.mo10270('.');
            m30098(interfaceC3145, abstractC1566);
        } else {
            m30109(interfaceC3145, C1345.m4955(this.f38611.mo8527(), abstractC1566));
            m30095(interfaceC3145, abstractC1566);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m30098(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566) {
        AbstractC1566 abstractC1566Mo5553 = abstractC1566.mo5553();
        AbstractC1566 abstractC1566Mo5559 = abstractC1566Mo5553.mo5559();
        if (abstractC1566Mo5559 != null) {
            m30085(interfaceC3145, abstractC1566, abstractC1566Mo5559);
            interfaceC3145.mo10270('.');
            m30098(interfaceC3145, abstractC1566Mo5553);
            return;
        }
        m30085(interfaceC3145, abstractC1566, abstractC1566Mo5553);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30085(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        String strMo5570;
        if (abstractC1567.mo5570().contains(".")) {
            strMo5570 = abstractC1567.mo5570();
        } else {
            strMo5570 = abstractC1566.mo5570();
        }
        C24927 c24927 = this.f38611;
        C1345 c1345M4954 = C1345.m4954(c24927.mo8527(), strMo5570);
        C24927 c24927M5671 = c24927.mo8527().m5671(c1345M4954);
        if (c24927M5671 != null) {
            interfaceC3145.mo10274((InterfaceC11653) c24927M5671);
        }
        interfaceC3145.add(c1345M4954.m4965());
        m30095(interfaceC3145, abstractC1567);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m30095(InterfaceC3145 interfaceC3145, AbstractC1566 abstractC1566) {
        List listMo5541 = abstractC1566.mo5541();
        if (listMo5541 != null) {
            interfaceC3145.mo10270('<');
            int size = listMo5541.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    interfaceC3145.add(", ");
                }
                AbstractC1566 abstractC1567 = (AbstractC1566) listMo5541.get(i);
                AbstractC1566 abstractC1566Mo5563 = abstractC1567.mo5563();
                if (abstractC1566Mo5563 != null) {
                    EnumC12752 enumC12752Mo5542 = abstractC1567.mo5542();
                    interfaceC3145.add(enumC12752Mo5542.m31590());
                    if (enumC12752Mo5542 != EnumC12752.UNBOUND) {
                        m30115(interfaceC3145, abstractC1566Mo5563);
                    }
                } else {
                    m30115(interfaceC3145, abstractC1567);
                }
            }
            interfaceC3145.mo10270('>');
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30109(InterfaceC3145 interfaceC3145, C1345 c1345) {
        C24927 c24927M5671 = this.f38611.mo8527().m5671(c1345);
        if (c24927M5671 == null) {
            m30101(interfaceC3145, c1345);
        } else {
            interfaceC3145.mo10274((InterfaceC11653) c24927M5671);
            m30101(interfaceC3145, c24927M5671.m55571());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30101(InterfaceC3145 interfaceC3145, C1345 c1345) {
        interfaceC3145.add(m30096(this.f38611.m55571(), c1345));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30114(InterfaceC3145 interfaceC3145, C1345 c1345) {
        boolean zEquals;
        interfaceC3145.add(c1345.m4965());
        C1345 c1345M55571 = this.f38611.m55571();
        C1345 c1345M4968 = c1345M55571.m4968();
        C1345 c1345M4969 = c1345.m4968();
        if (c1345M4968 != null) {
            zEquals = c1345M4968.equals(c1345M4969);
        } else {
            zEquals = c1345M55571.equals(c1345M4969);
        }
        if (zEquals) {
            return;
        }
        m30084(c1345);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m30096(C1345 c1345, C1345 c1346) {
        boolean z;
        char cCharAt;
        String strM4959 = c1346.m4959();
        if (!this.f38615 && this.f38618) {
            String strM4965 = c1346.m4965();
            if (!c1345.equals(c1346) && !m30091(c1345, c1346)) {
                boolean zM49226 = false;
                if (c1346.m4962()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c1346);
                    C1345 c1345M4973 = c1346.m4973();
                    while (true) {
                        z = true;
                        if (c1345M4973 == null) {
                            break;
                        }
                        if (c1345M4973 == c1345) {
                            Collections.reverse(arrayList);
                            while (c1345M4973 != null) {
                                String strM4966 = ((C1345) arrayList.get(0)).m4965();
                                if (strM4966.length() == 0 || '0' > (cCharAt = strM4966.charAt(0)) || cCharAt > '9') {
                                    break;
                                }
                                arrayList.add(0, c1345M4973);
                                c1345M4973 = c1345M4973.m4973();
                                z = false;
                            }
                            return C4123.m13222(arrayList, z ? "." : "$", new C17205(0));
                        }
                        if (m30091(c1345, c1345M4973)) {
                            z = false;
                            break;
                        }
                        arrayList.add(c1345M4973);
                        c1345M4973 = c1345M4973.m4973();
                    }
                    Collections.reverse(arrayList);
                    if (z) {
                        C1345 c1347 = (C1345) arrayList.get(0);
                        if (c1347 == c1346) {
                            m30084(c1347);
                        } else if (!m30096(c1345, c1347).equals(c1347.m4965())) {
                            return c1346.m4959();
                        }
                    }
                    return C4123.m13222(arrayList, ".", new C17205(0));
                }
                C24927 c24927 = this.f38611;
                if (!m30092(c24927.mo8527(), c1345, c1346)) {
                    C1610 c1610Mo8527 = c24927.mo8527();
                    String strM4967 = c1345.m4967();
                    if (!strM4967.equals(c1346.m4967())) {
                        String strM4968 = c1346.m4965();
                        zM49226 = c1610Mo8527.m5691().m49226(strM4967 + '.' + strM4968);
                    }
                    if (!zM49226) {
                        C1345 c1345M4968 = c1345.m4968();
                        C1345 c1345M4969 = c1346.m4968();
                        if (!(c1345M4968 != null ? c1345M4968.equals(c1345M4969) : c1345.equals(c1345M4969)) && ((!c1346.m4963().equals("java.lang") || c1346.m4973() != null) && !c1346.m4967().isEmpty())) {
                            if (c1346.m4967().equals(c1345.m4967())) {
                                if (c1346.m4962()) {
                                    strM4959 = c1346.m4970();
                                }
                            }
                            for (C1345 c1348 : m30108()) {
                                if (!c1348.equals(c1346) && c1348.m4965().equals(strM4965)) {
                                    return c1346.m4962() ? C8008.m21875('.', m30096(c1345, c1346.m4973()), strM4965) : strM4959;
                                }
                            }
                            m30084(c1346);
                            return strM4965;
                        }
                    }
                }
            }
            return strM4965;
        }
        return strM4959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30084(C1345 c1345) {
        C11984 c11984 = this.f38608;
        if (c11984 != null) {
            c11984.m30084(c1345);
        } else {
            this.f38614.add(c1345);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set m30108() {
        C11984 c11984 = this.f38608;
        if (c11984 != null) {
            return c11984.m30108();
        }
        return this.f38614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30091(C1345 c1345, C1345 c1346) {
        if (!c1345.m4962()) {
            return false;
        }
        C1345 c1345M4973 = c1345.m4973();
        return C17359.equals(c1345M4973, c1346) || m30091(c1345M4973, c1346);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30092(C1610 c1610, C1345 c1345, C1345 c1346) {
        if (c1345 == null) {
            return false;
        }
        String strM4965 = c1346.m4965();
        if (c1345.m4965().equals(strM4965)) {
            return true;
        }
        C24927 c24927M5671 = c1610.m5671(c1345);
        if (c24927M5671 != null) {
            for (C24927 c24927 : c24927M5671.m55534()) {
                if (c24927.m55532().equals(strM4965) && !c24927.m55568().equals(c1346.m4959())) {
                    return true;
                }
            }
        }
        return m30092(c1610, c1345.m4973(), c1346);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11984 m30112() {
        C11984 c11984 = this.f38608;
        return c11984 == null ? this : c11984;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14967 m30099() {
        return this.f38609;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m30110() {
        return this.f38615;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m30111() {
        return this.f38616;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6765 m30116() {
        return this.f38610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30105(C6765 c6765) {
        this.f38610 = c6765;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30094(C18959 c18959) {
        if (c18959 == null) {
            return false;
        }
        if (c18959.getType() == EnumC24203.MOVE_RESULT) {
            return true;
        }
        for (AbstractC16481 abstractC16481 : c18959.m44026()) {
            abstractC16481.getClass();
            if ((abstractC16481 instanceof C17227) && m30094(((C17227) abstractC16481).m40461())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30090(boolean[] zArr, InterfaceC23435 interfaceC23435) {
        if (zArr[0]) {
            return;
        }
        Iterator it = interfaceC23435.mo1986().iterator();
        while (it.hasNext()) {
            if (m30094((C18959) it.next())) {
                zArr[0] = true;
                return;
            }
        }
    }
}
