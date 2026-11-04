package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6CM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8256 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f27150 = C16980.m40037(C8256.class);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27151 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14967 f27152;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2551 f27153;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11984 f27154;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6765 f27155;

    public C8256(C11984 c11984, C2551 c2551) {
        this.f27153 = c2551;
        this.f27154 = c11984;
        this.f27152 = c11984.m30099();
        this.f27155 = new C6765(c11984, c2551);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11984 m22237() {
        return this.f27154;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6765 m22241() {
        return this.f27155;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2551 m22243() {
        return this.f27153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22240(InterfaceC3145 interfaceC3145, int i) {
        C2551 c2551 = this.f27153;
        C10293 c10293Mo8547 = c2551.mo8547();
        int i2 = 1;
        if (c2551.mo8532().m49706()) {
            interfaceC3145.mo10282();
            m22233(interfaceC3145, c2551, i);
            interfaceC3145.add("static");
            return true;
        }
        if (c2551.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR) && !C8314.m22398(c2551.m8536()).m37753()) {
            interfaceC3145.mo10282();
            m22233(interfaceC3145, c2551, i);
            return false;
        }
        C16260 c16260 = (C16260) c2551.mo17862((InterfaceC2157) C11457.f36025);
        if (c16260 != null && !c16260.m38593().contains(c2551)) {
            interfaceC3145.mo10283("@Override");
            if (c2551.m31135(EnumC17315.INFO)) {
                interfaceC3145.add(" // ");
                interfaceC3145.add(C4123.m13222(c16260.m38596(), ", ", new C9746(0)));
            }
        }
        C14967 c14967 = this.f27152;
        c14967.m36031(interfaceC3145, c2551);
        C10293 c10293Mo8548 = c2551.m8536().mo8547();
        if (c10293Mo8548.m26534()) {
            c10293Mo8547 = c10293Mo8547.m26546(1024).m26546(1);
        }
        if (c10293Mo8548.m26535()) {
            c10293Mo8547 = c10293Mo8547.m26546(1);
        }
        if (c2551.mo17865(EnumC1763.INCONSISTENT_CODE) && c2551.m31135(EnumC17315.ERROR)) {
            interfaceC3145.mo10283("/*");
            C15382 c15382 = (C15382) interfaceC3145;
            c15382.mo10278();
            c15382.mo10283("Code decompiled incorrectly, please refer to instructions dump.");
            if (!c2551.mo8527().m5681().m17717()) {
                if (c15382 instanceof C10907) {
                    c15382.mo10283("To view partially-correct code enable 'Show inconsistent code' option in preferences");
                } else {
                    c15382.mo10283("To view partially-correct add '--show-bad-code' argument");
                }
            }
            c15382.mo10279();
            c15382.mo10283("*/");
        }
        interfaceC3145.mo10277(c2551.m16977());
        interfaceC3145.add(c10293Mo8547.m26529(c2551.m31135(EnumC17315.INFO)));
        if (c10293Mo8548.m26534() && !c2551.m8524() && !c2551.mo8547().m26540()) {
            interfaceC3145.add("default ");
        }
        List listMo8554 = c2551.mo8554();
        C11984 c11984 = this.f27154;
        if (c11984.m30106(interfaceC3145, listMo8554, false)) {
            interfaceC3145.mo10270(' ');
        }
        if (c10293Mo8547.m26543()) {
            m22233(interfaceC3145, c2551, i);
            interfaceC3145.add(c11984.m30113().m55532());
        } else {
            c11984.m30115(interfaceC3145, c2551.mo8519());
            interfaceC3145.mo10270(' ');
            C23720 c23720 = (C23720) c2551.mo17862((InterfaceC2157) C11457.f36012);
            C2551 c2551M52971 = c23720 != null ? c23720.m52971() : c2551;
            m22233(interfaceC3145, c2551M52971, i);
            interfaceC3145.add(c2551M52971.m8522());
        }
        interfaceC3145.mo10270('(');
        List listM8526 = c2551.m8526();
        C23786 c23786 = (C23786) c2551.mo17862(C25278.f81645);
        int size = listM8526.size() - 1;
        boolean zM37753 = C8314.m22398(c2551.m8536()).m37753();
        Iterator it = listM8526.iterator();
        int i3 = -1;
        boolean z = true;
        while (it.hasNext()) {
            C6041 c6041 = (C6041) it.next();
            i3 += i2;
            if (zM37753 || !C21482.m48887(c2551, i3)) {
                if (z) {
                    z = false;
                } else {
                    interfaceC3145.add(", ");
                }
                C17973 c17973M17530 = c6041.m17530();
                C11260 c11260M28503 = c17973M17530 == null ? C11260.m28503(c6041, c11984.m30110()) : c17973M17530.m41945();
                if (c23786 != null) {
                    c14967.m36033(interfaceC3145, c23786, i3);
                }
                if (c11260M28503.m28515()) {
                    interfaceC3145.add("final ");
                }
                AbstractC1566 abstractC1566M28517 = c11260M28503.m28517();
                Iterator it2 = it;
                if (abstractC1566M28517 == null || abstractC1566M28517 == AbstractC1566.f5420) {
                    abstractC1566M28517 = c6041.m17531();
                }
                if (i3 != size || !c2551.mo8547().m26544()) {
                    c11984.m30115(interfaceC3145, abstractC1566M28517);
                } else if (abstractC1566M28517.m5554()) {
                    c11984.m30115(interfaceC3145, abstractC1566M28517.mo5557());
                    interfaceC3145.add("...");
                } else {
                    c2551.m31138("Last argument in varargs method is not array: " + c11260M28503);
                    c11984.m30115(interfaceC3145, abstractC1566M28517);
                }
                interfaceC3145.mo10270(' ');
                String strM18890 = this.f27155.m18890(c11260M28503);
                if ((((C15382) interfaceC3145) instanceof C10907) && c17973M17530 != null) {
                    interfaceC3145.mo10275((InterfaceC16874) C3450.m11262(c2551, c11260M28503.m28505()));
                }
                interfaceC3145.add(strM18890);
                i2 = 1;
                it = it2;
            }
        }
        interfaceC3145.mo10270(')');
        c14967.m36034(interfaceC3145, c2551);
        if (c2551.m8536().mo8547().m26535()) {
            C17818 c17818 = (C17818) c2551.mo17862(C25278.f81637);
            C15580 c15580M41662 = c17818 == null ? null : c17818.m41662();
            if (c15580M41662 != null) {
                interfaceC3145.add(" default ");
                c14967.m36029(c2551.mo8527(), interfaceC3145, c15580M41662);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22233(InterfaceC3145 interfaceC3145, C2551 c2551, int i) {
        interfaceC3145.mo10274(new C16128(c2551, interfaceC3145.getLength() - i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22238(InterfaceC3145 interfaceC3145) {
        C2551 c2551 = this.f27153;
        int i = C0798.f2838[C8314.m22398(c2551.m8536()).ordinal()];
        if (i == 1) {
            if (this.f27154.m30110() || c2551.m8515() == null) {
                m22242(interfaceC3145);
                return;
            } else {
                m22244(interfaceC3145);
                return;
            }
        }
        if (i == 2) {
            m22244(interfaceC3145);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            m22232(interfaceC3145, EnumC2290.FALLBACK_MODE, (ArrayList) null);
            return;
        }
        if (c2551.mo17867(C11457.f36007)) {
            m22239(interfaceC3145, true);
            return;
        }
        if (c2551.m8508() == null) {
            interfaceC3145.mo10283("// Blocks not ready for readable form, using instruction form");
            m22232(interfaceC3145, EnumC2290.FALLBACK_MODE, (ArrayList) null);
            return;
        }
        C6129 c6129M5681 = c2551.mo8527().m5681();
        c6129M5681.m17709().getClass();
        C10907 c10907 = new C10907(c6129M5681);
        try {
            c10907.mo10273(interfaceC3145.mo10269());
            m22235(c10907);
            interfaceC3145.mo10272(c10907);
        } catch (Exception e) {
            C23977.m53506(c2551, "Readable code generation failed", e);
            C5492.m16316(interfaceC3145, "Readable code generation failed", e);
            m22239(interfaceC3145, true);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22244(InterfaceC3145 interfaceC3145) throws Exception {
        C2551 c2551 = this.f27153;
        try {
            new C13476(this, false).m33153(interfaceC3145, c2551.m8515());
        } catch (BootstrapMethodError | StackOverflowError unused) {
            C2631 c2631 = new C2631("StackOverflow");
            c2551.getClass();
            C23977.m53506(c2551, "Method code generation error", c2631);
            C5492.m16321(interfaceC3145, c2551);
            m22242(interfaceC3145);
        } catch (Exception e) {
            if (!c2551.m8536().m55556().mo17865(EnumC1763.RESTART_CODEGEN)) {
                C23977.m53506(c2551, "Method code generation error", e);
                C5492.m16321(interfaceC3145, c2551);
                m22242(interfaceC3145);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22239(InterfaceC3145 interfaceC3145, boolean z) {
        EnumC17315 enumC17315 = EnumC17315.WARN;
        C2551 c2551 = this.f27153;
        if (c2551.m31135(enumC17315)) {
            interfaceC3145.mo10283("/* WARN: Readable processing failed; using instruction form */");
        }
        ArrayList arrayList = new ArrayList();
        if (c2551.m8517() != null) {
            arrayList.add(new C9001(c2551.m8517(), "this"));
        }
        for (C6041 c6041 : c2551.m8526()) {
            arrayList.add(new C9001(c6041, this.f27155.m18889(c6041)));
        }
        m22232(interfaceC3145, z ? EnumC2290.FALLBACK_RELOAD : EnumC2290.FALLBACK_MODE, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22235(C10907 c10907) {
        HashSet hashSet = new HashSet();
        C2551 c2551 = this.f27153;
        if (c2551.m8517() != null) {
            hashSet.add(c2551.m8517().m17530().m41945());
        }
        Iterator it = c2551.m8526().iterator();
        while (it.hasNext()) {
            hashSet.add(((C6041) it.next()).m17530().m41945());
        }
        for (C17973 c17973 : c2551.m8490()) {
            C18959 c18959M41951 = c17973.m41951();
            C11260 c11260M41945 = c17973.m41945();
            if (c18959M41951 != null && c18959M41951.getType() == EnumC24203.MOVE_EXCEPTION && c11260M41945.m28516() && hashSet.add(c11260M41945)) {
                this.f27155.m18890(c11260M41945);
            }
        }
        C22646 c22646 = new C22646(c2551);
        List<C21943> listM51048 = c22646.m51048();
        C0052 c0052 = new C0052(this, true);
        for (C21943 c21943 : listM51048) {
            if (!c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                if (c22646.m51050(c21943)) {
                    c10907.mo10279();
                    c10907.mo10283(m22229(c21943));
                    c10907.mo10270(':');
                    c10907.mo10278();
                }
                for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                    if (!c18959.mo17865(EnumC1763.DONT_GENERATE)) {
                        if (c18959.m44027() != null) {
                            C11260 c11260M41946 = c18959.m44027().m17530().m41945();
                            if (!c11260M41946.m28516()) {
                                c18959.mo17866(EnumC1763.DECLARE_VAR);
                                c11260M41946.m28504();
                            }
                        }
                        C17620.m41271(c10907, c18959);
                        c0052.m944(c18959, c10907, (EnumC17951) null);
                        m22234((InterfaceC3145) c10907, c18959, false);
                        C5492.m16319(c10907, c2551, c18959);
                    }
                }
                C21943 c21943M51049 = c22646.m51049(c21943);
                if (c21943M51049 != null) {
                    c10907.mo10283("goto ");
                    c10907.add(m22229(c21943M51049));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22242(InterfaceC3145 interfaceC3145) {
        EnumC17315 enumC17315 = EnumC17315.ERROR;
        C2551 c2551 = this.f27153;
        if (c2551.m31135(enumC17315)) {
            interfaceC3145.mo10283("/*");
            m22232(interfaceC3145, EnumC2290.COMMENTED_DUMP, (ArrayList) null);
            ((C15382) interfaceC3145).mo10283("*/");
        }
        interfaceC3145.mo10283("throw new UnsupportedOperationException(\"Method not decompiled: ").add(c2551.m8536().m55571().m4959()).mo10270('.').add(c2551.m8522()).mo10270('(').add(C4123.m13221(c2551.mo8532().m49702(), ", ")).add("):").add(c2551.mo8532().m49698().toString()).add("\");");
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01eb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22232(InterfaceC3145 interfaceC3145, EnumC2290 enumC2290, ArrayList arrayList) {
        EnumC2290 enumC2291 = EnumC2290.COMMENTED_DUMP;
        C2551 c2551 = this.f27153;
        if (enumC2290 == enumC2291 && c2551.mo8527().m5681().m17705() != EnumC17315.DEBUG) {
            long jM8543 = c2551.m8543();
            if (jM8543 > 200) {
                interfaceC3145.mo10278();
                interfaceC3145.mo10283("Method dump skipped, instruction units count: " + jM8543);
                if (interfaceC3145.mo10281()) {
                    interfaceC3145.mo10283("To view this dump change 'Code comments level' option to 'DEBUG'");
                } else {
                    interfaceC3145.mo10283("To view this dump add '--comments-level debug' option");
                }
                interfaceC3145.mo10279();
                return;
            }
        }
        EnumC2290 enumC2292 = EnumC2290.FALLBACK_MODE;
        InterfaceC25186 interfaceC25186 = f27150;
        if (enumC2290 != enumC2292) {
            try {
                m22236(c2551);
            } catch (Exception e) {
                interfaceC25186.mo13724("Error reload instructions in fallback mode:", (Throwable) e);
                interfaceC3145.mo10283("// Can't load method instructions: " + e.getMessage());
                return;
            }
        }
        C18959[] c18959ArrM8506 = c2551.m8506();
        if (c18959ArrM8506 == null) {
            interfaceC3145.mo10283("// Can't load method instructions.");
            return;
        }
        interfaceC3145.mo10278();
        C6765 c6765 = this.f27155;
        if (arrayList == null) {
            if (c2551.m8517() != null) {
                interfaceC3145.mo10283(c6765.m18889(c2551.m8517())).add(" = this;");
            }
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9001 c9001 = (C9001) it.next();
                if (!c9001.f29314.equals(c9001.f29316)) {
                    hashSet.add(c9001.f29314);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C9001 c9002 = (C9001) it2.next();
                if (hashSet.contains(c9002.f29316)) {
                    String strM18891 = c6765.m18891(new C20211(c9002.f29315, "instructionArg"));
                    interfaceC3145.mo10282();
                    this.f27154.m30115(interfaceC3145, c9002.f29315);
                    interfaceC3145.mo10270(' ').add(strM18891).add(" = ").add(c9002.f29316).mo10270(';');
                    c9002.f29316 = strM18891;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C9001 c9003 = (C9001) it3.next();
                if (!c9003.f29314.equals(c9003.f29316)) {
                    interfaceC3145.mo10283(c9003.f29314).add(" = ").add(c9003.f29316).mo10270(';');
                }
            }
        }
        int iMo10269 = interfaceC3145.mo10269();
        C8256 c8256M22230 = m22230(c2551);
        C0052 c0052 = new C0052(c8256M22230, true);
        C18959 c18959 = null;
        for (C18959 c189510 : c18959ArrM8506) {
            if (c189510 != null) {
                C11457 c11457 = C11457.f36007;
                if (c189510.mo17867(c11457)) {
                    Iterator it4 = c189510.mo17861(c11457).iterator();
                    while (it4.hasNext()) {
                        interfaceC3145.mo10283("// ").add(((C15514) it4.next()).m37183());
                    }
                } else {
                    if (enumC2290 != EnumC2290.BLOCK_DUMP) {
                        if (c189510.mo17867(C11457.f36036)) {
                            interfaceC3145.mo10279();
                            interfaceC3145.mo10283(m22228(c189510.getOffset()).concat(":"));
                            interfaceC3145.mo10278();
                        } else {
                            C11457 c11458 = C11457.f36035;
                            if (c189510.mo17867(c11458)) {
                                if (c18959 == null || c18959.getType() != EnumC24203.IF) {
                                    interfaceC3145.mo10279();
                                    interfaceC3145.mo10283(m22228(c189510.getOffset()).concat(":"));
                                    interfaceC3145.mo10278();
                                } else {
                                    List listMo17861 = c189510.mo17861(c11458);
                                    if (listMo17861.size() != 1) {
                                        interfaceC3145.mo10279();
                                        interfaceC3145.mo10283(m22228(c189510.getOffset()).concat(":"));
                                        interfaceC3145.mo10278();
                                    } else {
                                        C13277 c13277 = (C13277) listMo17861.get(0);
                                        if (c13277.m32824() != c18959.getOffset() || c13277.m32823() != c189510.getOffset()) {
                                            interfaceC3145.mo10279();
                                            interfaceC3145.mo10283(m22228(c189510.getOffset()).concat(":"));
                                            interfaceC3145.mo10278();
                                        } else if (c189510.getOffset() == ((C17489) c18959).mo39519()) {
                                            interfaceC3145.mo10279();
                                            interfaceC3145.mo10283(m22228(c189510.getOffset()).concat(":"));
                                            interfaceC3145.mo10278();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c189510.getType() != EnumC24203.NOP) {
                        try {
                            boolean zContains = (enumC2290 == EnumC2290.COMMENTED_DUMP && c189510.getType() == EnumC24203.CONST_STR) ? ((C5557) c189510).getString().contains("*/") : false;
                            if (zContains) {
                                interfaceC3145.mo10279();
                                interfaceC3145.mo10283("*/");
                                interfaceC3145.mo10283("//  ");
                            } else {
                                interfaceC3145.mo10277(c189510.m16977());
                            }
                            C17620.m41271(interfaceC3145, c189510);
                            C6041 c6041M44027 = c189510.m44027();
                            if (c6041M44027 != null) {
                                AbstractC1566 abstractC1566M17531 = c6041M44027.m17531();
                                if (abstractC1566M17531.mo5564()) {
                                    interfaceC3145.add(abstractC1566M17531.toString()).mo10270(' ');
                                }
                            }
                            c0052.m944(c189510, interfaceC3145, EnumC17951.INLINE);
                            if (zContains) {
                                interfaceC3145.mo10283("/*");
                                interfaceC3145.mo10278();
                            }
                            c8256M22230.m22234(interfaceC3145, c189510, true);
                            C5492.m16319(interfaceC3145, c8256M22230.f27153, c189510);
                        } catch (Exception e2) {
                            interfaceC25186.mo13711("Error generate fallback instruction: ", e2.getCause());
                            interfaceC3145.mo10273(iMo10269);
                            interfaceC3145.mo10283("// error: " + c189510);
                        }
                    }
                }
                c18959 = c189510;
            }
        }
        interfaceC3145.mo10279();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22236(C2551 c2551) {
        C11457 c11457 = C11457.f36007;
        List listMo17861 = c2551.mo17861(c11457);
        C19990 c19990 = (C19990) c2551.mo17862((InterfaceC2157) C11457.f36016);
        C11457 c11458 = C11457.f36032;
        List listMo17862 = c2551.mo17861(c11458);
        try {
            c2551.m8544();
            c2551.m8531();
            Iterator it = C10271.m26476().iterator();
            while (it.hasNext()) {
                C7005.m19326((InterfaceC13673) it.next(), c2551);
            }
            c2551.m39413(c11457, listMo17861);
            if (c19990 != null) {
                C11392.forEach(c19990.m45970(), new C7510(0, c2551));
            }
            c2551.m39413(c11458, listMo17862);
        } catch (Throwable th) {
            c2551.m39413(c11457, listMo17861);
            if (c19990 != null) {
                C11392.forEach(c19990.m45970(), new C7510(0, c2551));
            }
            c2551.m39413(c11458, listMo17862);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22234(InterfaceC3145 interfaceC3145, C18959 c18959, boolean z) {
        C21922 c21922 = (C21922) c18959.mo17862((InterfaceC2157) C11457.f36015);
        if (c21922 == null) {
            return;
        }
        interfaceC3145.add("     // Catch:");
        for (C4768 c4768 : c21922.m49616()) {
            C19684 c19684M14718 = c4768.m14718();
            interfaceC3145.mo10270(' ');
            C1345 c1345M14719 = c4768.m14719();
            C11984 c11984 = this.f27154;
            if (c1345M14719 == null) {
                c11984.m30102(interfaceC3145, AbstractC1566.f5432);
            } else {
                c11984.m30109(interfaceC3145, c4768.m14719());
            }
            interfaceC3145.add(" -> ");
            if (z) {
                interfaceC3145.add(m22228(c19684M14718.m45367()));
            } else {
                interfaceC3145.add(m22229(c19684M14718.m45368()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8256 m22230(C2551 c2551) {
        return new C8256(new C11984(c2551.m8536(), null, false, true, true, EnumC9110.AUTO), c2551);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22229(C21943 c21943) {
        return String.format("L%d", Integer.valueOf(c21943.m49633()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22228(int i) {
        return i < 0 ? String.format("LB_%x", Integer.valueOf(-i)) : String.format("L%x", Integer.valueOf(i));
    }
}
