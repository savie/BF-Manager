package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17573 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16576 f55837 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2714 f55838;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f55839;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C16826 f55840;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16784 f55842;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20414 f55843;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23800 f55844;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C3836 f55845;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22450 f55846;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11492 f55847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6761 f55848;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f55850;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23942 f55851;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20145 f55853;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f55854;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21017 f55858;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5286 f55859;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19003 f55857 = new C19003();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19003 f55852 = new C19003();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f55849 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19003 f55856 = new C19003();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19003 f55841 = new C19003();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC7696 f55855 = new C10519(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17573 m40852(C12343 c12343) {
        C17573 c17573 = (C17573) c12343.m30656(f55837);
        return c17573 == null ? new C17573(c12343) : c17573;
    }

    public C17573(C12343 c12343) {
        this.f55839 = 0;
        c12343.m30659(f55837, this);
        this.f55848 = C6761.m18268(c12343);
        this.f55858 = C21017.m47211(c12343);
        this.f55842 = C16784.m39433(c12343);
        this.f55838 = C2714.m8268(c12343);
        C9399.m24138(c12343);
        this.f55843 = C20414.m46161(c12343);
        this.f55840 = C16826.m39463(c12343);
        this.f55859 = C5286.m14576(c12343);
        this.f55851 = C23942.m52776(c12343);
        this.f55853 = C20145.m45505(c12343);
        C3836 c3836M11131 = C3836.m11131(c12343);
        this.f55845 = c3836M11131;
        this.f55847 = C11492.m28677(c12343);
        this.f55844 = C23800.m52336(c12343);
        this.f55846 = new C22450(c3836M11131.f14261);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f55850 = EnumC14026.f46106.m33945(enumC11909M29706);
        this.f55854 = enumC11909M29706.f39974;
        this.f55839 = 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40875() {
        this.f55839++;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40873() {
        int i = this.f55839 - 1;
        this.f55839 = i;
        if (i == 0) {
            m40874();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40877() {
        this.f55839--;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40874() {
        int i;
        if (this.f55839 <= 0 && (i = this.f55849) <= 0) {
            this.f55849 = i + 1;
            while (this.f55857.m43722()) {
                try {
                    ((Runnable) this.f55857.m43727()).run();
                } catch (Throwable th) {
                    this.f55849--;
                    throw th;
                }
            }
            while (this.f55856.m43722()) {
                ((Runnable) this.f55856.m43727()).run();
            }
            while (this.f55841.m43722()) {
                ((Runnable) this.f55841.m43727()).run();
            }
            while (this.f55852.m43722()) {
                ((Runnable) this.f55852.m43727()).run();
            }
            this.f55849--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m40853(C21825 c21825) {
        if (c21825.isEmpty()) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C5224 c5224 = (C5224) it.next();
            C6171.m17171(c5224.f18119);
            c19003.m43723((C13278) c5224.f18119);
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40868(Runnable runnable) {
        this.f55857.m43723(runnable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40876(Runnable runnable) {
        this.f55852.m43723(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40870(RunnableC9524 runnableC9524) {
        this.f55841.m43723(runnableC9524);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40871(final C21825 c21825, final C4603 c4603, final AbstractC23903 abstractC23903, final InterfaceC12260 interfaceC12260) {
        if (c21825.isEmpty()) {
            return;
        }
        abstractC23903.m52719();
        m40868(new Runnable() { // from class: l.۠᩶ۤ
            @Override // java.lang.Runnable
            public final void run() {
                C17573.m40859(this.f29147, abstractC23903, c4603, interfaceC12260, c21825);
            }
        });
        m40876(new RunnableC15488(this, c4603, c21825, abstractC23903, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40859(C17573 c17573, AbstractC23903 abstractC23903, C4603 c4603, InterfaceC12260 interfaceC12260, C21825 c21825) {
        InterfaceC12260 interfaceC12260M8269;
        C21017 c21017 = c17573.f55858;
        C2714 c2714 = c17573.f55838;
        C20414 c20414 = c17573.f55843;
        C6171.m17176(abstractC23903.f77452 == EnumC10477.f35867 || abstractC23903.m52723());
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
        if (interfaceC12260 != null) {
            interfaceC12260M8269 = c2714.m8270(interfaceC12260);
        } else {
            interfaceC12260M8269 = c2714.m8269();
        }
        InterfaceC12260 interfaceC12261 = interfaceC12260M8269;
        C16826 c16826M47268 = interfaceC12260 != null ? null : c21017.m47268(c17573.f55840);
        try {
            if (abstractC23903.m52706() && c21825.m48595()) {
                int i = ((C5224) c21825.f70876).f30189;
                EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23903);
                C5909 c5909 = C23879.f77204;
                c20414.m48188(i, new C5909("compiler", "already.annotated", enumC7654M38160, abstractC23903));
            }
            c17573.m40860(abstractC23903, c21825, c4603, false, false);
        } finally {
            if (c16826M47268 != null) {
                c21017.m47268(c16826M47268);
            }
            c2714.m8270(interfaceC12261);
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40857(C17573 c17573, C4603 c4603, C21825 c21825, AbstractC23903 abstractC23903) {
        C20414 c20414 = c17573.f55843;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
        try {
            c17573.f55858.m47317(abstractC23903, C3128.m9439(abstractC23903, c4603.f16296), c21825);
        } finally {
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40858(C17573 c17573, C4603 c4603, C23195 c23195, AbstractC5930 abstractC5930, C18258 c18258) {
        C20414 c20414 = c17573.f55843;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
        C2714 c2714 = c17573.f55838;
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c23195);
        try {
            c18258.f58258 = c17573.m40854(c18258.f77449.mo16235(), c4603, abstractC5930);
        } finally {
            c2714.m8270(interfaceC12260M8270);
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40856(C17573 c17573, C4603 c4603, AbstractC5930 abstractC5930) {
        C20414 c20414 = c17573.f55843;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
        try {
            C21017 c21017 = c17573.f55858;
            c21017.getClass();
            abstractC5930.mo1802(new C13257(c21017));
        } finally {
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x026e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0275  */
    /* JADX WARN: Code duplicated, block: B:115:0x0299  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:131:0x0301  */
    /* JADX WARN: Code duplicated, block: B:134:0x0312  */
    /* JADX WARN: Code duplicated, block: B:136:0x0318  */
    /* JADX WARN: Code duplicated, block: B:139:0x0336  */
    /* JADX WARN: Code duplicated, block: B:142:0x033a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:96:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0245  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41, types: [l.᩻᩵ۤ] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v47, types: [l.ᩳ᩵ۤ] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r20v1, types: [l.ۧۤۤ] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, l.᩺ᩳۤ] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45, types: [l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.᩸᩷۟] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40860(AbstractC23903 abstractC23903, C21825 c21825, C4603 c4603, boolean z, boolean z2) throws Throwable {
        Iterator it;
        LinkedHashMap linkedHashMap;
        C17573 c17573;
        AbstractC23903 abstractC23904;
        boolean z3;
        ?? r2;
        int i;
        AbstractC23903 abstractC23905;
        C5909 c5909;
        LinkedHashMap linkedHashMap2;
        ?? M48597;
        C21825 c21826;
        boolean z4;
        C11867 c11867;
        AbstractC16579 abstractC16579;
        boolean z5;
        InterfaceC12260 interfaceC12260;
        ?? r23;
        AbstractC16579 abstractC165710;
        AbstractC0618 abstractC0618;
        C11867 c11867Mo38256;
        C21825 c21827;
        C21825 c21828;
        C2068 c2068;
        C21825 c21829;
        Object obj;
        AbstractC16579 abstractC165711;
        boolean z6;
        InterfaceC12260 interfaceC12261;
        Iterator it2;
        boolean z7;
        int i2;
        ?? r12;
        boolean z8;
        AbstractC16579 abstractC16579Mo16235;
        C8777 c8777M52406;
        ?? r6;
        AbstractC23903 abstractC23906;
        Iterator it3;
        Throwable th;
        C11867 c11867M40866;
        C17573 c17574 = this;
        AbstractC23903 abstractC23907 = abstractC23903;
        boolean z9 = z2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        HashMap map = new HashMap();
        C21825 c218210 = c21825;
        while (true) {
            boolean zIsEmpty = c218210.isEmpty();
            C20414 c20414 = c17574.f55843;
            C23942 c23942 = c17574.f55851;
            C23800 c23800 = c17574.f55844;
            if (!zIsEmpty) {
                C5224 c5224 = (C5224) c218210.f70876;
                C3836 c3836 = c17574.f55845;
                if (z) {
                    AbstractC16579 abstractC165712 = c3836.f14266;
                    C11867 c11868 = c5224.f18119;
                    if (c11868 == null || c5224.f30190 == null || !(c11868 instanceof C13278)) {
                        c11867M40866 = new C13278(c5224.f30190, c17574.m40862(c5224, abstractC165712, c4603), C10935.f37178);
                        c5224.f18119 = c11867M40866;
                    } else {
                        c11867M40866 = (C13278) c11868;
                    }
                    th = null;
                } else {
                    th = null;
                    c11867M40866 = c17574.m40866(c5224, c3836.f14266, c4603);
                }
                if (c11867M40866 == null) {
                    C6171.m17174("Failed to create annotation");
                    throw th;
                }
                AbstractC16579 abstractC165713 = c11867M40866.f75167;
                if (c5224.f30190.f53222.mo2877()) {
                    if (linkedHashMap3.containsKey(c5224.f30190.f53222)) {
                        if (!c17574.f55850) {
                            c20414.m48193(EnumC0264.SOURCE_LEVEL, c5224, EnumC14026.f46106.m33943(c17574.f55854));
                        }
                        C19003 c19003 = (C19003) linkedHashMap3.get(c5224.f30190.f53222);
                        c19003.m43723(c11867M40866);
                        linkedHashMap3.put(c5224.f30190.f53222, c19003);
                        map.put(c11867M40866, c5224);
                    } else {
                        AbstractC0618 abstractC0619 = c5224.f30190.f53222;
                        C19003 c19004 = new C19003();
                        c19004.m43723(c11867M40866);
                        linkedHashMap3.put(abstractC0619, c19004);
                        map.put(c11867M40866, c5224);
                    }
                }
                if (!abstractC165713.mo1926() && ((abstractC23907.f77452 == EnumC10477.f35868 || abstractC23907.f77448.f77452 != EnumC10477.f35879) && c23800.m52399(abstractC165713, c3836.f14253))) {
                    abstractC23907.f77447 |= 18014398509613056L;
                    if (c17574.m40861(c11867M40866.m29574(c23942.f77568))) {
                        abstractC23907.f77447 |= 36028797018963968L;
                    }
                }
                if (!abstractC165713.mo1926() && c23800.m52399(abstractC165713, c3836.f14238)) {
                    abstractC23907.f77447 |= 72057594037927936L;
                    if (c17574.m40861(c11867M40866.m29574(c23942.f77552))) {
                        abstractC23907.f77447 |= 288230376151711744L;
                    }
                }
                if (!abstractC165713.mo1926() && abstractC23907.f77452 == EnumC10477.f35865 && c23800.m52399(abstractC165713, c3836.f14255)) {
                    abstractC23907.f77447 |= 9007199254740992L;
                }
                c218210 = c218210.f70877;
            } else {
                AbstractC16579 abstractC165714 = null;
                C21825 c21825M48588 = C21825.m48588();
                Iterator it4 = linkedHashMap3.values().iterator();
                AbstractC23903 abstractC23908 = abstractC23907;
                C17573 c17575 = c17574;
                ?? r7 = c21825M48588;
                while (it4.hasNext()) {
                    C19003 c19005 = (C19003) it4.next();
                    if (c19005.size() == 1) {
                        M48597 = r7.m48597((C11867) c19005.first());
                        c17573 = c17575;
                        abstractC23904 = abstractC23907;
                        z3 = z9;
                        it = it4;
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        C6171.m17171(c4603);
                        C21825 c21825M43726 = c19005.m43726();
                        C11867 c11869 = (C11867) c21825M43726.f70876;
                        C21825 c21825M48589 = C21825.m48588();
                        C6171.m17176((c21825M43726.isEmpty() || c21825M43726.f70877.isEmpty()) ? false : true);
                        int i3 = 0;
                        C8777 c8777M52407 = abstractC165714;
                        C8777 c8777 = c8777M52407;
                        ?? r18 = r7;
                        it = it4;
                        C21825 c218211 = c21825M43726;
                        C8777 c8778 = c8777;
                        C8777 c8779 = c8778;
                        ?? r8 = c8778;
                        while (true) {
                            linkedHashMap = linkedHashMap3;
                            if (c218211.isEmpty()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            AbstractC16579 abstractC165715 = abstractC165714;
                            if (i4 <= 1) {
                                c21826 = c218211;
                                if (c21826.f70877.isEmpty()) {
                                    z4 = false;
                                }
                                C6171.m17176(z4);
                                c11867 = (C11867) c21826.f70876;
                                abstractC16579 = c11867.f75167;
                                if (c8777M52407 == null) {
                                    c8777M52407 = c23800.m52406(abstractC16579);
                                }
                                C8777 c87710 = c8777M52407;
                                if (i4 > 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                interfaceC12260 = (InterfaceC12260) map.get(c11867);
                                r23 = r8;
                                abstractC165710 = c11867.f75167;
                                abstractC0618 = abstractC165710.f53222;
                                C11867 c118610 = c11869;
                                c11867Mo38256 = abstractC0618.mo2884().mo38256();
                                if (c11867Mo38256 == null) {
                                    if (z5) {
                                        C5909 c59010 = C23879.f77204;
                                        c20414.m48199(interfaceC12260, new C5909("compiler", "duplicate.annotation.missing.container", abstractC165710));
                                    }
                                    c21829 = c21826;
                                    c21828 = c21825M43726;
                                } else {
                                    c21827 = c11867Mo38256.f39809;
                                    c21828 = c21825M43726;
                                    if (c21827.isEmpty()) {
                                        C5909 c59011 = C23879.f77204;
                                        c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                        c21829 = c21826;
                                    } else {
                                        c2068 = (C2068) c21827.f70876;
                                        c21829 = c21826;
                                        if (((C18258) c2068.f7664).f77453 != c23942.f77643) {
                                            C5909 c59012 = C23879.f77204;
                                            c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                        } else {
                                            obj = c2068.f7665;
                                            if (obj instanceof C13984) {
                                                abstractC165711 = ((C13984) obj).f45980;
                                            } else {
                                                C5909 c59013 = C23879.f77204;
                                                c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                            }
                                            if (abstractC165711 != null && c23800.m52399(abstractC165711, abstractC165710)) {
                                            }
                                            if (abstractC165711 == null) {
                                                r6 = r23;
                                            } else {
                                                if (c8779 != null || abstractC165711 == c8779) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                C6171.m17176(z6);
                                                interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                                it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                                z7 = false;
                                                i2 = 0;
                                                r12 = abstractC165715;
                                                while (it2.hasNext()) {
                                                    abstractC23906 = (AbstractC23903) it2.next();
                                                    i2++;
                                                    if (i2 == 1) {
                                                        it3 = it2;
                                                        if (abstractC23906.f77452 == EnumC10477.f35879) {
                                                            r12 = (C18258) abstractC23906;
                                                        }
                                                        it2 = it3;
                                                        r12 = r12;
                                                    } else {
                                                        it3 = it2;
                                                    }
                                                    z7 = true;
                                                    it2 = it3;
                                                    r12 = r12;
                                                }
                                                if (z7) {
                                                    C5909 c59014 = C23879.f77204;
                                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                                } else if (i2 == 0) {
                                                    C5909 c59015 = C23879.f77204;
                                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                                } else {
                                                    if (r12.f77452 != EnumC10477.f35879) {
                                                        C5909 c59016 = C23879.f77204;
                                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    abstractC16579Mo16235 = r12.f77449.mo16235();
                                                    c8777M52406 = c23800.m52406(abstractC16579);
                                                    if (c23800.m52434(abstractC16579Mo16235) || !c23800.m52399(c8777M52406, abstractC16579Mo16235)) {
                                                        C5909 c59017 = C23879.f77204;
                                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                                        z8 = true;
                                                    }
                                                    if (z8) {
                                                        r6 = r12;
                                                    }
                                                    if (r6 != 0) {
                                                        c21825M48589 = c21825M48589.m48597(c11867);
                                                    }
                                                    c8779 = abstractC165711;
                                                }
                                                r6 = abstractC165715;
                                                if (r6 != 0) {
                                                    c21825M48589 = c21825M48589.m48597(c11867);
                                                }
                                                c8779 = abstractC165711;
                                            }
                                            c8777M52407 = c87710;
                                            c218211 = c21829.f70877;
                                            c8777 = abstractC16579;
                                            abstractC165714 = abstractC165715;
                                            linkedHashMap3 = linkedHashMap;
                                            i3 = i4;
                                            c11869 = c118610;
                                            c21825M43726 = c21828;
                                            r8 = r6;
                                            c8779 = c8779;
                                        }
                                    }
                                    abstractC165711 = abstractC165715;
                                    if (abstractC165711 != null) {
                                    }
                                    if (abstractC165711 == null) {
                                        r6 = r23;
                                    } else {
                                        if (c8779 != null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        C6171.m17176(z6);
                                        interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                        it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                        z7 = false;
                                        i2 = 0;
                                        r12 = abstractC165715;
                                        while (it2.hasNext()) {
                                            abstractC23906 = (AbstractC23903) it2.next();
                                            i2++;
                                            if (i2 == 1) {
                                                it3 = it2;
                                                if (abstractC23906.f77452 == EnumC10477.f35879) {
                                                    r12 = (C18258) abstractC23906;
                                                }
                                                it2 = it3;
                                                r12 = r12;
                                            } else {
                                                it3 = it2;
                                            }
                                            z7 = true;
                                            it2 = it3;
                                            r12 = r12;
                                        }
                                        if (z7) {
                                            C5909 c59018 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                        } else if (i2 == 0) {
                                            C5909 c59019 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                        } else {
                                            if (r12.f77452 != EnumC10477.f35879) {
                                                C5909 c590110 = C23879.f77204;
                                                c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            abstractC16579Mo16235 = r12.f77449.mo16235();
                                            c8777M52406 = c23800.m52406(abstractC16579);
                                            if (c23800.m52434(abstractC16579Mo16235)) {
                                                C5909 c590111 = C23879.f77204;
                                                c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                                z8 = true;
                                            } else {
                                                C5909 c590112 = C23879.f77204;
                                                c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                                z8 = true;
                                            }
                                            if (z8) {
                                                r6 = r12;
                                            }
                                            if (r6 != 0) {
                                                c21825M48589 = c21825M48589.m48597(c11867);
                                            }
                                            c8779 = abstractC165711;
                                        }
                                        r6 = abstractC165715;
                                        if (r6 != 0) {
                                            c21825M48589 = c21825M48589.m48597(c11867);
                                        }
                                        c8779 = abstractC165711;
                                    }
                                    c8777M52407 = c87710;
                                    c218211 = c21829.f70877;
                                    c8777 = abstractC16579;
                                    abstractC165714 = abstractC165715;
                                    linkedHashMap3 = linkedHashMap;
                                    i3 = i4;
                                    c11869 = c118610;
                                    c21825M43726 = c21828;
                                    r8 = r6;
                                    c8779 = c8779;
                                }
                                abstractC165711 = abstractC165715;
                                if (abstractC165711 == null) {
                                    r6 = r23;
                                } else {
                                    if (c8779 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C6171.m17176(z6);
                                    interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                    it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC165715;
                                    while (it2.hasNext()) {
                                        abstractC23906 = (AbstractC23903) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC23906.f77452 == EnumC10477.f35879) {
                                                r12 = (C18258) abstractC23906;
                                            }
                                            it2 = it3;
                                            r12 = r12;
                                        } else {
                                            it3 = it2;
                                        }
                                        z7 = true;
                                        it2 = it3;
                                        r12 = r12;
                                    }
                                    if (z7) {
                                        C5909 c590113 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C5909 c590114 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                    } else {
                                        if (r12.f77452 != EnumC10477.f35879) {
                                            C5909 c590115 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC16579Mo16235 = r12.f77449.mo16235();
                                        c8777M52406 = c23800.m52406(abstractC16579);
                                        if (c23800.m52434(abstractC16579Mo16235)) {
                                            C5909 c590116 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                            z8 = true;
                                        } else {
                                            C5909 c590117 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c21825M48589 = c21825M48589.m48597(c11867);
                                        }
                                        c8779 = abstractC165711;
                                    }
                                    r6 = abstractC165715;
                                    if (r6 != 0) {
                                        c21825M48589 = c21825M48589.m48597(c11867);
                                    }
                                    c8779 = abstractC165711;
                                }
                                c8777M52407 = c87710;
                                c218211 = c21829.f70877;
                                c8777 = abstractC16579;
                                abstractC165714 = abstractC165715;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c11869 = c118610;
                                c21825M43726 = c21828;
                                r8 = r6;
                                c8779 = c8779;
                            } else {
                                c21826 = c218211;
                            }
                            z4 = true;
                            C6171.m17176(z4);
                            c11867 = (C11867) c21826.f70876;
                            abstractC16579 = c11867.f75167;
                            if (c8777M52407 == null) {
                                c8777M52407 = c23800.m52406(abstractC16579);
                            }
                            C8777 c87711 = c8777M52407;
                            if (i4 > 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            interfaceC12260 = (InterfaceC12260) map.get(c11867);
                            r23 = r8;
                            abstractC165710 = c11867.f75167;
                            abstractC0618 = abstractC165710.f53222;
                            C11867 c118611 = c11869;
                            c11867Mo38256 = abstractC0618.mo2884().mo38256();
                            if (c11867Mo38256 == null) {
                                if (z5) {
                                    C5909 c590118 = C23879.f77204;
                                    c20414.m48199(interfaceC12260, new C5909("compiler", "duplicate.annotation.missing.container", abstractC165710));
                                }
                                c21829 = c21826;
                                c21828 = c21825M43726;
                            } else {
                                c21827 = c11867Mo38256.f39809;
                                c21828 = c21825M43726;
                                if (c21827.isEmpty()) {
                                    C5909 c590119 = C23879.f77204;
                                    c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                    c21829 = c21826;
                                } else {
                                    c2068 = (C2068) c21827.f70876;
                                    c21829 = c21826;
                                    if (((C18258) c2068.f7664).f77453 != c23942.f77643) {
                                        C5909 c590120 = C23879.f77204;
                                        c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                    } else {
                                        obj = c2068.f7665;
                                        if (obj instanceof C13984) {
                                            abstractC165711 = ((C13984) obj).f45980;
                                        } else {
                                            C5909 c590121 = C23879.f77204;
                                            c20414.m48199(interfaceC12260, new C5909("compiler", "invalid.repeatable.annotation", abstractC0618));
                                        }
                                        if (abstractC165711 != null) {
                                        }
                                        if (abstractC165711 == null) {
                                            r6 = r23;
                                        } else {
                                            if (c8779 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                            C6171.m17176(z6);
                                            interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                            it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                            z7 = false;
                                            i2 = 0;
                                            r12 = abstractC165715;
                                            while (it2.hasNext()) {
                                                abstractC23906 = (AbstractC23903) it2.next();
                                                i2++;
                                                if (i2 == 1) {
                                                    it3 = it2;
                                                    if (abstractC23906.f77452 == EnumC10477.f35879) {
                                                        r12 = (C18258) abstractC23906;
                                                    }
                                                    it2 = it3;
                                                    r12 = r12;
                                                } else {
                                                    it3 = it2;
                                                }
                                                z7 = true;
                                                it2 = it3;
                                                r12 = r12;
                                            }
                                            if (z7) {
                                                C5909 c5901110 = C23879.f77204;
                                                c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                            } else if (i2 == 0) {
                                                C5909 c5901111 = C23879.f77204;
                                                c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                            } else {
                                                if (r12.f77452 != EnumC10477.f35879) {
                                                    C5909 c5901112 = C23879.f77204;
                                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                abstractC16579Mo16235 = r12.f77449.mo16235();
                                                c8777M52406 = c23800.m52406(abstractC16579);
                                                if (c23800.m52434(abstractC16579Mo16235)) {
                                                    C5909 c5901113 = C23879.f77204;
                                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                                    z8 = true;
                                                } else {
                                                    C5909 c5901114 = C23879.f77204;
                                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                                    z8 = true;
                                                }
                                                if (z8) {
                                                    r6 = r12;
                                                }
                                                if (r6 != 0) {
                                                    c21825M48589 = c21825M48589.m48597(c11867);
                                                }
                                                c8779 = abstractC165711;
                                            }
                                            r6 = abstractC165715;
                                            if (r6 != 0) {
                                                c21825M48589 = c21825M48589.m48597(c11867);
                                            }
                                            c8779 = abstractC165711;
                                        }
                                        c8777M52407 = c87711;
                                        c218211 = c21829.f70877;
                                        c8777 = abstractC16579;
                                        abstractC165714 = abstractC165715;
                                        linkedHashMap3 = linkedHashMap;
                                        i3 = i4;
                                        c11869 = c118611;
                                        c21825M43726 = c21828;
                                        r8 = r6;
                                        c8779 = c8779;
                                    }
                                }
                                abstractC165711 = abstractC165715;
                                if (abstractC165711 != null) {
                                }
                                if (abstractC165711 == null) {
                                    r6 = r23;
                                } else {
                                    if (c8779 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C6171.m17176(z6);
                                    interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                    it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC165715;
                                    while (it2.hasNext()) {
                                        abstractC23906 = (AbstractC23903) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC23906.f77452 == EnumC10477.f35879) {
                                                r12 = (C18258) abstractC23906;
                                            }
                                            it2 = it3;
                                            r12 = r12;
                                        } else {
                                            it3 = it2;
                                        }
                                        z7 = true;
                                        it2 = it3;
                                        r12 = r12;
                                    }
                                    if (z7) {
                                        C5909 c5901115 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C5909 c5901116 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                    } else {
                                        if (r12.f77452 != EnumC10477.f35879) {
                                            C5909 c5901117 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC16579Mo16235 = r12.f77449.mo16235();
                                        c8777M52406 = c23800.m52406(abstractC16579);
                                        if (c23800.m52434(abstractC16579Mo16235)) {
                                            C5909 c5901118 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                            z8 = true;
                                        } else {
                                            C5909 c5901119 = C23879.f77204;
                                            c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c21825M48589 = c21825M48589.m48597(c11867);
                                        }
                                        c8779 = abstractC165711;
                                    }
                                    r6 = abstractC165715;
                                    if (r6 != 0) {
                                        c21825M48589 = c21825M48589.m48597(c11867);
                                    }
                                    c8779 = abstractC165711;
                                }
                                c8777M52407 = c87711;
                                c218211 = c21829.f70877;
                                c8777 = abstractC16579;
                                abstractC165714 = abstractC165715;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c11869 = c118611;
                                c21825M43726 = c21828;
                                r8 = r6;
                                c8779 = c8779;
                            }
                            abstractC165711 = abstractC165715;
                            if (abstractC165711 == null) {
                                r6 = r23;
                            } else {
                                if (c8779 != null) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                C6171.m17176(z6);
                                interfaceC12261 = (InterfaceC12260) map.get(c11867);
                                it2 = abstractC165711.f53222.mo20272().m9327(c23942.f77643).iterator();
                                z7 = false;
                                i2 = 0;
                                r12 = abstractC165715;
                                while (it2.hasNext()) {
                                    abstractC23906 = (AbstractC23903) it2.next();
                                    i2++;
                                    if (i2 == 1) {
                                        it3 = it2;
                                        if (abstractC23906.f77452 == EnumC10477.f35879) {
                                            r12 = (C18258) abstractC23906;
                                        }
                                        it2 = it3;
                                        r12 = r12;
                                    } else {
                                        it3 = it2;
                                    }
                                    z7 = true;
                                    it2 = it3;
                                    r12 = r12;
                                }
                                if (z7) {
                                    C5909 c59011110 = C23879.f77204;
                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.multiple.values", abstractC165711, Integer.valueOf(i2)));
                                } else if (i2 == 0) {
                                    C5909 c59011111 = C23879.f77204;
                                    c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.no.value", abstractC165711));
                                } else {
                                    if (r12.f77452 != EnumC10477.f35879) {
                                        C5909 c59011112 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.invalid.value", abstractC165711));
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    abstractC16579Mo16235 = r12.f77449.mo16235();
                                    c8777M52406 = c23800.m52406(abstractC16579);
                                    if (c23800.m52434(abstractC16579Mo16235)) {
                                        C5909 c59011113 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                        z8 = true;
                                    } else {
                                        C5909 c59011114 = C23879.f77204;
                                        c20414.m48199(interfaceC12261, new C5909("compiler", "invalid.repeatable.annotation.value.return", abstractC165711, abstractC16579Mo16235, c8777M52406));
                                        z8 = true;
                                    }
                                    if (z8) {
                                        r6 = r12;
                                    }
                                    if (r6 != 0) {
                                        c21825M48589 = c21825M48589.m48597(c11867);
                                    }
                                    c8779 = abstractC165711;
                                }
                                r6 = abstractC165715;
                                if (r6 != 0) {
                                    c21825M48589 = c21825M48589.m48597(c11867);
                                }
                                c8779 = abstractC165711;
                            }
                            c8777M52407 = c87711;
                            c218211 = c21829.f70877;
                            c8777 = abstractC16579;
                            abstractC165714 = abstractC165715;
                            linkedHashMap3 = linkedHashMap;
                            i3 = i4;
                            c11869 = c118611;
                            c21825M43726 = c21828;
                            r8 = r6;
                            c8779 = c8779;
                        }
                        ?? r20 = abstractC165714;
                        ?? r24 = r8;
                        C21825 c218212 = c21825M43726;
                        C11867 c118612 = c11869;
                        if (!c21825M48589.isEmpty() && c8779 == null) {
                            InterfaceC12260 interfaceC12262 = (InterfaceC12260) map.get(c218212.f70876);
                            C5909 c59020 = C23879.f77204;
                            c20414.m48199(interfaceC12262, new C5909("compiler", "duplicate.annotation.invalid.repeated", c8777));
                            c17573 = this;
                            abstractC23904 = abstractC23903;
                            z3 = z2;
                            r2 = r20;
                        } else if (c21825M48589.isEmpty()) {
                            c17573 = this;
                            abstractC23904 = abstractC23903;
                            z3 = z2;
                            r2 = 0;
                        } else {
                            C21825 c21825M485810 = c21825M48589.m48589();
                            InterfaceC12260 interfaceC12263 = (InterfaceC12260) map.get(c118612);
                            C17573 c17576 = this;
                            C5286 c5286 = c17576.f55859;
                            c5286.m14629(interfaceC12263);
                            C2068 c2069 = new C2068(r24, new C4810(c8777M52407, c21825M485810));
                            C21017 c21017 = c17576.f55858;
                            if (z) {
                                C13278 c13278 = new C13278(c8779, C21825.of((Object) c2069), ((C13278) c218212.f70876).f39811);
                                C5224 c5224M14590 = c5286.m14590(c13278);
                                if (!c21017.m47318(c5224M14590)) {
                                    C5909 c59021 = C23879.f77204;
                                    c20414.m48199(c5224M14590, new C5909("compiler", "duplicate.annotation.invalid.repeated", c8777));
                                }
                                z3 = z2;
                                if (c21017.m47319(c5224M14590, z3)) {
                                    abstractC23905 = abstractC23903;
                                } else {
                                    if (z3) {
                                        C5909 c59022 = C23879.f77204;
                                        abstractC23905 = abstractC23903;
                                        c5909 = new C5909("compiler", "invalid.repeatable.annotation.not.applicable", c8779, abstractC23905);
                                    } else {
                                        abstractC23905 = abstractC23903;
                                        C5909 c59023 = C23879.f77204;
                                        c5909 = new C5909("compiler", "invalid.repeatable.annotation.not.applicable.in.context", c8779);
                                    }
                                    c20414.m48199(interfaceC12263, c5909);
                                }
                                c13278.m29577();
                                abstractC23904 = abstractC23905;
                                r2 = c13278;
                                c17573 = c17576;
                            } else {
                                abstractC23904 = abstractC23903;
                                z3 = z2;
                                C5224 c5224M14591 = c5286.m14591((AbstractC23156) new C11867(c8779, C21825.of((Object) c2069), r20));
                                boolean z10 = (abstractC23904.f77447 & 2305843009213693952L) != 0 || (abstractC23903.m52720() != null && abstractC23903.m52720().m50010());
                                C11521 c11521M47259 = c21017.m47259(c5224M14591, abstractC23904);
                                if ((c11521M47259.isEmpty() || (c11521M47259.isPresent() && !((Set) c11521M47259.get()).isEmpty())) || (z10 && !(z10 && (abstractC23904.f77447 & 16777216) == 0))) {
                                    i = 1;
                                } else {
                                    C5909 c59024 = C23879.f77204;
                                    i = 1;
                                    c20414.m48199(c5224M14591, new C5909("compiler", "invalid.repeatable.annotation.not.applicable", c8779, abstractC23904));
                                }
                                if (!c21017.m47318(c5224M14591)) {
                                    C5909 c59025 = C23879.f77204;
                                    Object[] objArr = new Object[i];
                                    objArr[0] = c8777;
                                    c20414.m48199(c5224M14591, new C5909("compiler", "duplicate.annotation.invalid.repeated", objArr));
                                }
                                C11867 c11867M40867 = c17576.m40866(c5224M14591, c8779, c4603);
                                c11867M40867.m29577();
                                r2 = c11867M40867;
                                c17573 = c17576;
                            }
                        }
                        if (r2 != 0) {
                            linkedHashMap2 = linkedHashMap;
                            C19003 c19006 = (C19003) linkedHashMap2.get(r2.f75167.f53222);
                            if (c19006 != null) {
                                InterfaceC12260 interfaceC12264 = (InterfaceC12260) map.get(c19006.first());
                                AbstractC0618 abstractC06110 = ((C11867) c19006.first()).f75167.f53222;
                                C5909 c59026 = C23879.f77204;
                                c20414.m48199(interfaceC12264, new C5909("compiler", "invalid.repeatable.annotation.repeated.and.container.present", abstractC06110));
                            }
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                        if (r2 != 0) {
                            M48597 = r18.m48597(r2);
                            abstractC23908 = abstractC23904;
                        } else {
                            abstractC23908 = abstractC23904;
                            M48597 = r18;
                        }
                    }
                    abstractC23907 = abstractC23904;
                    c17575 = c17573;
                    linkedHashMap3 = linkedHashMap2;
                    it4 = it;
                    r7 = M48597;
                    abstractC165714 = null;
                    z9 = z3;
                }
                ?? r3 = r7;
                if (z) {
                    abstractC23908.m52699(r3.m48589());
                    return;
                }
                C21825 c21825M485811 = r3.m48589();
                abstractC23908.m52719();
                abstractC23908.m52726(c21825M485811);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m40861(AbstractC23156 abstractC23156) {
        if (!(abstractC23156 instanceof C2693)) {
            return false;
        }
        C2693 c2693 = (C2693) abstractC23156;
        return c2693.f75167 == this.f55845.f14263 && ((Integer) c2693.f10382).intValue() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11867 m40866(C5224 c5224, AbstractC16579 abstractC16579, C4603 c4603) {
        C11867 c11867 = c5224.f18119;
        if (c11867 != null && c5224.f30190 != null) {
            return c11867;
        }
        C11867 c11868 = new C11867(c5224.f30190, m40862(c5224, abstractC16579, c4603), null);
        c5224.f18119 = c11868;
        return c11868;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C21825 m40862(C5224 c5224, AbstractC16579 abstractC16579, C4603 c4603) {
        boolean z;
        boolean z2;
        AbstractC5930 abstractC5930;
        boolean z3;
        C21825 c21825;
        C2068 c2068;
        C5224 c5225 = c5224;
        AbstractC8774 abstractC8774 = c5225.f18121;
        AbstractC16579 abstractC16579M18326 = abstractC8774.f30190;
        if (abstractC16579M18326 == null) {
            C6761 c6761 = this.f55848;
            c6761.getClass();
            abstractC16579M18326 = c6761.m18326(abstractC8774, c4603, AbstractC16579.f53219);
        }
        AbstractC8774 abstractC8775 = c5225.f18121;
        abstractC8775.getClass();
        C21017 c21017 = this.f55858;
        AbstractC16579 abstractC16579M47266 = c21017.m47266(abstractC8775, abstractC16579M18326, abstractC16579, c21017.f68418);
        c5225.f30190 = abstractC16579M47266;
        boolean zMo1926 = abstractC16579M47266.mo1926();
        boolean zMo2877 = c5225.f30190.f53222.mo2877();
        C20414 c20414 = this.f55843;
        if (zMo2877 || zMo1926) {
            z = zMo1926;
        } else {
            AbstractC8774 abstractC8776 = c5225.f18121;
            abstractC8776.getClass();
            AbstractC16579 abstractC165710 = c5225.f30190;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC8776, new C5909("compiler", "not.annotation.type", abstractC165710));
            z = true;
        }
        C21825 c21826 = c5225.f18122;
        if (c21826.m48596() != 1 || ((AbstractC5930) c21826.f70876).m22847(EnumC18651.f60510)) {
            z2 = false;
        } else {
            int i = ((AbstractC5930) c21826.f70876).f30189;
            C5286 c5286 = this.f55859;
            c5286.f18294 = i;
            c21826.f70876 = c5286.m14587((AbstractC5930) c5286.m14639(this.f55851.f77643), (AbstractC5930) c21826.f70876);
            z2 = true;
        }
        C19003 c19003 = new C19003();
        C21825 c21827 = c21826;
        while (c21827.m48595()) {
            AbstractC5930 abstractC5931 = (AbstractC5930) c21827.f70876;
            AbstractC16579 abstractC165711 = c5225.f30190;
            boolean zM22847 = abstractC5931.m22847(EnumC18651.f60510);
            C3836 c3836 = this.f55845;
            if (!zM22847) {
                c20414.m48199(abstractC5931, C23879.f77176);
                C5954 c5954 = c3836.f14261;
                abstractC5931.f30190 = c5954;
                m40854(c5954, c4603, abstractC5931);
            } else {
                C3812 c3812 = (C3812) abstractC5931;
                if (!c3812.f14145.m22847(EnumC18651.f60465)) {
                    c20414.m48199(abstractC5931, C23879.f77176);
                    C5954 c5955 = c3836.f14261;
                    abstractC5931.f30190 = c5955;
                    m40854(c5955, c4603, abstractC5931);
                } else {
                    C3107 c3107 = (C3107) c3812.f14145;
                    if (z2) {
                        AbstractC5930 abstractC5932 = c3812.f14146;
                        abstractC5932.getClass();
                        abstractC5930 = abstractC5932;
                    } else {
                        c3107.getClass();
                        abstractC5930 = c3107;
                    }
                    AbstractC11242 abstractC11242 = c3107.f11715;
                    C21825 c21825M48588 = C21825.m48588();
                    C20145 c20145 = this.f55853;
                    c20145.getClass();
                    z3 = z2;
                    c21825 = c21827;
                    AbstractC23903 abstractC23903M45543 = c20145.m45543(abstractC5930, c4603, abstractC165711.f53222, abstractC165711, abstractC11242, c21825M48588, (C21825) null);
                    c3107.f11716 = abstractC23903M45543;
                    c3107.f30190 = abstractC23903M45543.f77449;
                    if (abstractC23903M45543.f77448 != abstractC165711.f53222 && !z) {
                        AbstractC11242 abstractC11243 = c3107.f11715;
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(c3107, new C5909("compiler", "no.annotation.member", abstractC11243, abstractC165711));
                    }
                    AbstractC16579 abstractC16579Mo16235 = abstractC23903M45543.f77449.mo16235();
                    AbstractC23156 abstractC23156M40854 = m40854(abstractC16579Mo16235, c4603, c3812.f14146);
                    abstractC5931.f30190 = abstractC16579Mo16235;
                    c2068 = abstractC23903M45543.f77449.mo1926() ? null : new C2068((C18258) abstractC23903M45543, abstractC23156M40854);
                }
                if (c2068 == null && !((C18258) c2068.f7664).f77449.mo1926()) {
                    c19003.m43723(c2068);
                }
                c21827 = c21825.f70877;
                c5225 = c5224;
                z2 = z3;
            }
            c21825 = c21827;
            z3 = z2;
            if (c2068 == null) {
            }
            c21827 = c21825.f70877;
            c5225 = c5224;
            z2 = z3;
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23156 m40854(AbstractC16579 abstractC16579, C4603 c4603, AbstractC5930 abstractC5930) {
        AbstractC0618 abstractC0618;
        AbstractC23903 abstractC23903M9471;
        EnumC10477 enumC10477;
        C3836 c3836 = this.f55845;
        C20414 c20414 = this.f55843;
        try {
            abstractC16579.f53222.mo49994();
        } catch (C4146 e) {
            abstractC5930.getClass();
            EnumC7654 enumC7654M38160 = C16121.m38160(e.f15170);
            AbstractC11242 abstractC11242Mo20270 = e.f15170.mo20270();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "cant.resolve", enumC7654M38160, abstractC11242Mo20270, null, null));
            abstractC16579 = c3836.f14261;
        }
        boolean zM39001 = abstractC16579.m39001(EnumC6617.ARRAY);
        C23800 c23800 = this.f55844;
        if (zM39001) {
            if (!abstractC5930.m22847(EnumC18651.f60567)) {
                int i = abstractC5930.f30189;
                C5286 c5286 = this.f55859;
                c5286.f18294 = i;
                abstractC5930 = c5286.m14647(null, C21825.m48588(), C21825.of((Object) abstractC5930));
            }
            C18961 c18961 = (C18961) abstractC5930;
            AbstractC5930 abstractC5931 = c18961.f61402;
            if (abstractC5931 != null) {
                c20414.m48199(abstractC5931, C23879.f77273);
            }
            C19003 c19003 = new C19003();
            for (C21825 c21825 = c18961.f61399; c21825.m48595(); c21825 = c21825.f70877) {
                c19003.m43723(m40854(c23800.m52416(abstractC16579), c4603, (AbstractC5930) c21825.f70876));
            }
            c18961.f30190 = abstractC16579;
            return new C4810(abstractC16579, (AbstractC23156[]) c19003.toArray(new AbstractC23156[c19003.m43728()]));
        }
        if (abstractC5930.m22847(EnumC18651.f60567)) {
            if (!abstractC16579.mo1926()) {
                c20414.m48199(abstractC5930, C23879.f77269);
            }
            C18961 c18962 = (C18961) abstractC5930;
            AbstractC5930 abstractC5932 = c18962.f61402;
            if (abstractC5932 != null) {
                c20414.m48199(abstractC5932, C23879.f77273);
            }
            for (C21825 c21826 = c18962.f61399; c21826.m48595(); c21826 = c21826.f70877) {
                m40854(c3836.f14261, c4603, (AbstractC5930) c21826.f70876);
            }
            return new C22450(c3836.f14261);
        }
        if (abstractC16579.f53222.mo2877()) {
            if (abstractC5930.m22847(EnumC18651.f60516)) {
                return m40866((C5224) abstractC5930, abstractC16579, c4603);
            }
            c20414.m48199(abstractC5930, C23879.f77210);
            abstractC16579 = c3836.f14261;
        }
        if (abstractC5930.m22847(EnumC18651.f60516)) {
            if (!abstractC16579.mo1926()) {
                C5909 c59010 = C23879.f77204;
                c20414.m48199(abstractC5930, new C5909("compiler", "annotation.not.valid.for.type", abstractC16579));
            }
            C5224 c5224 = (C5224) abstractC5930;
            m40866(c5224, c3836.f14261, c4603);
            return new C22450(c5224.f18121.f30190);
        }
        C9108 c9108 = new C9108();
        abstractC5930.mo1802(c9108);
        if (!c9108.f45291) {
            c20414.m48199(abstractC5930, C23879.f77234);
            return new C22450(c3836.f14261);
        }
        boolean zMo9481 = abstractC16579.mo9481();
        C6761 c6761 = this.f55848;
        if (!zMo9481) {
            AbstractC16579 abstractC165710 = c3836.f14220;
            AbstractC16579 abstractC165711 = c3836.f14283;
            if (!c23800.m52399(abstractC16579, abstractC165710) || abstractC16579.m39001(EnumC6617.ERROR)) {
                if (abstractC16579.f53222 == abstractC165711.f53222) {
                    AbstractC16579 abstractC16579M18299 = c6761.m18299(abstractC5930, c4603, m40850(abstractC16579));
                    boolean zMo1926 = abstractC16579M18299.mo1926();
                    C23942 c23942 = this.f55851;
                    if (!zMo1926) {
                        if (C3128.m9472(abstractC5930) == c23942.f77615) {
                            return new C13984(((C23570) abstractC5930).f76357.f30190, c23800);
                        }
                        c20414.m48199(abstractC5930, C23879.f77340);
                        return new C22450(c3836.f14261);
                    }
                    if (C3128.m9472(abstractC5930) == c23942.f77615) {
                        C23570 c23570 = (C23570) abstractC5930;
                        if (c23570.f76357.f30190.mo1926()) {
                            C5954 c5954M52331 = C23800.m52331(c23570.f76357.f30190.f53222.mo50003(), c3836.f14285, abstractC165711);
                            C4104 c4104 = new C4104(abstractC16579);
                            c4104.f15041 = c5954M52331;
                            return c4104;
                        }
                    }
                    return new C22450(abstractC16579M18299.mo16234());
                }
                if (!abstractC16579.m39001(EnumC6617.CLASS) || (abstractC16579.f53222.mo20276() & 16384) == 0) {
                    if (!abstractC16579.mo1926()) {
                        c20414.m48199(abstractC5930, C23879.f77269);
                    }
                    return new C22450(c6761.m18300((AbstractC8774) abstractC5930, c4603, abstractC16579));
                }
                AbstractC16579 abstractC16579M182910 = c6761.m18299(abstractC5930, c4603, m40850(abstractC16579));
                AbstractC23903 abstractC23903M9472 = C3128.m9471(abstractC5930);
                if (abstractC23903M9472 != null) {
                    AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC5930);
                    if ((!abstractC8774M9467.m22847(EnumC18651.f60473) || ((abstractC23903M9471 = C3128.m9471(((C23570) abstractC8774M9467).f76357)) != null && ((enumC10477 = abstractC23903M9471.f77452) == EnumC10477.f35867 || enumC10477 == EnumC10477.f35865))) && abstractC23903M9472.f77452 == EnumC10477.f35878 && (16384 & abstractC23903M9472.mo20276()) != 0) {
                        return new C5516(abstractC16579, (C6263) abstractC23903M9472);
                    }
                }
                c20414.m48199(abstractC5930, C23879.f77189);
                return new C22450(abstractC16579M182910.mo16234());
            }
        }
        AbstractC16579 abstractC16579M182911 = c6761.m18299(abstractC5930, c4603, m40850(abstractC16579));
        if (abstractC16579M182911.mo1926()) {
            return new C22450(abstractC16579M182911.mo16234());
        }
        if (abstractC16579M182911.mo24292() == null) {
            c20414.m48199(abstractC5930, C23879.f77313);
            return new C22450(abstractC16579);
        }
        AbstractC16579 abstractC165712 = abstractC5930.f30190;
        if (abstractC165712 != null && (abstractC0618 = abstractC165712.f53222) != null) {
            m40869(abstractC5930, c4603, abstractC0618, abstractC5930);
        }
        return new C2693(this.f55842.m39436(abstractC16579M182911, abstractC16579).mo24292(), abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1116 m40850(AbstractC16579 abstractC16579) {
        C1116 c1116 = this.f55848.f22809;
        return new C1116(c1116.f5038, c1116.f5039, abstractC16579, new C0639(c1116.f5037), c1116.f5040);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40872(C21825 c21825, C4603 c4603, AbstractC23903 abstractC23903, InterfaceC12260 interfaceC12260, boolean z) {
        if (abstractC23903 == null) {
            C6171.m17174("Symbol argument to actualEnterTypeAnnotations is nul/");
            throw null;
        }
        InterfaceC2173 interfaceC2173 = c4603.f16295.f34725;
        C20414 c20414 = this.f55843;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
        C2714 c2714 = this.f55838;
        InterfaceC12260 interfaceC12260M8270 = interfaceC12260 != null ? c2714.m8270(interfaceC12260) : null;
        try {
            m40860(abstractC23903, c21825, c4603, true, z);
        } finally {
            if (interfaceC12260M8270 != null) {
                c2714.m8270(interfaceC12260M8270);
            }
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40869(final AbstractC8774 abstractC8774, final C4603 c4603, final AbstractC23903 abstractC23903, final InterfaceC12260 interfaceC12260) {
        C6171.m17171(abstractC23903);
        m40868(new Runnable() { // from class: l.᩵᩶ۤ
            @Override // java.lang.Runnable
            public final void run() {
                abstractC8774.mo1802(new C12635(this.f63233, c4603, abstractC23903, interfaceC12260));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7696 m40865() {
        return this.f55855;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40855(C17573 c17573, C4603 c4603) {
        C6171.m17175("Trying to annotation type complete a non-annotation type", ((C8753) c4603.f16296).f30086.mo2877());
        C20414 c20414 = c17573.f55843;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
        try {
            C8753 c8753 = (C8753) c4603.f16296;
            C20396 c20396 = new C20396(c17573, c17573.f55848, c17573.f55858, c17573.f55845, c17573.f55847);
            c20396.mo1065(c8753);
            c8753.f30086.mo2884().m38254(c20396.f66084);
            c8753.f30086.mo2884().m38258(c20396.f66090);
        } finally {
            c20414.m48202(interfaceC2173M48202);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22450 m40863() {
        return this.f55846;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40864() {
        this.f55839 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16868 m40867(C16868 c16868) {
        C16868 c16869 = new C16868(this.f55857, this.f55852, this.f55856, this.f55841);
        this.f55857 = c16868.f53964;
        this.f55856 = c16868.f53963;
        this.f55841 = c16868.f53962;
        this.f55852 = c16868.f53961;
        return c16869;
    }
}
