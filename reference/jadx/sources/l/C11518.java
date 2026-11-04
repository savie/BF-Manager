package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11518 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13477 f36240 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15400 f36241;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C14764 f36242;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C16437 f36246;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0310 f36247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7312 f36248;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12703 f36249;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6147 f36250;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22092 f36252;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22010 f36253;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15252 f36254;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15378 f36256;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f36258;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f36259;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f36260;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C24705 f36261;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15714 f36262;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18499 f36255 = new C18499();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18499 f36251 = new C18499();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f36245 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C18499 f36243 = new C18499();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18499 f36244 = new C18499();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC10772 f36257 = new C21961(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11518 m28979(C4747 c4747) {
        C11518 c11518 = (C11518) c4747.m14643(f36240);
        return c11518 == null ? new C11518(c4747) : c11518;
    }

    public C11518(C4747 c4747) {
        this.f36259 = 0;
        c4747.m14646(f36240, this);
        this.f36247 = C0310.m1899(c4747);
        this.f36252 = C22092.m49912(c4747);
        this.f36256 = C15378.m36833(c4747);
        this.f36250 = C6147.m17745(c4747);
        C15846.m37791(c4747);
        this.f36248 = C7312.m20023(c4747);
        this.f36241 = C15400.m36873(c4747);
        this.f36262 = C15714.m37502(c4747);
        this.f36254 = C15252.m36599(c4747);
        this.f36253 = C22010.m49750(c4747);
        C14764 c14764M35506 = C14764.m35506(c4747);
        this.f36242 = c14764M35506;
        this.f36246 = C16437.m38994(c4747);
        this.f36261 = C24705.m55066(c4747);
        this.f36249 = new C12703(c14764M35506.f48263);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f36258 = EnumC3666.f12550.m11915(enumC20820M47625);
        this.f36260 = enumC20820M47625.f66685;
        this.f36259 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29004() {
        this.f36259++;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29003() {
        int i = this.f36259 - 1;
        this.f36259 = i;
        if (i == 0) {
            m29000();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29002() {
        this.f36259--;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29000() {
        int i;
        if (this.f36259 <= 0 && (i = this.f36245) <= 0) {
            this.f36245 = i + 1;
            while (this.f36255.m43096()) {
                try {
                    ((Runnable) this.f36255.m43092()).run();
                } catch (Throwable th) {
                    this.f36245--;
                    throw th;
                }
            }
            while (this.f36243.m43096()) {
                ((Runnable) this.f36243.m43092()).run();
            }
            while (this.f36244.m43096()) {
                ((Runnable) this.f36244.m43092()).run();
            }
            while (this.f36251.m43096()) {
                ((Runnable) this.f36251.m43092()).run();
            }
            this.f36245--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m28981(C14769 c14769) {
        if (c14769.isEmpty()) {
            return C14769.m35543();
        }
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C17621 c17621 = (C17621) it.next();
            C11972.m30021(c17621.f57963);
            c18499.m43089((C24638) c17621.f57963);
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28995(Runnable runnable) {
        this.f36255.m43089(runnable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29005(Runnable runnable) {
        this.f36251.m43089(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28999(RunnableC16696 runnableC16696) {
        this.f36244.m43089(runnableC16696);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28997(final C14769 c14769, final C3168 c3168, final AbstractC11781 abstractC11781, final InterfaceC5075 interfaceC5075) {
        if (c14769.isEmpty()) {
            return;
        }
        abstractC11781.m29584();
        m28995(new Runnable() { // from class: l.ۡ֨᩺
            @Override // java.lang.Runnable
            public final void run() {
                C11518.m28988(this.f29419, abstractC11781, c3168, interfaceC5075, c14769);
            }
        });
        m29005(new Runnable() { // from class: l.ۖ֨᩺
            @Override // java.lang.Runnable
            public final void run() {
                C11518.m28986(this.f7517, c3168, c14769, abstractC11781);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28988(C11518 c11518, AbstractC11781 abstractC11781, C3168 c3168, InterfaceC5075 interfaceC5075, C14769 c14769) {
        InterfaceC5075 interfaceC5075M17746;
        C22092 c22092 = c11518.f36252;
        C6147 c6147 = c11518.f36250;
        C7312 c7312 = c11518.f36248;
        C11972.m30026(abstractC11781.f38066 == EnumC13603.f43219 || abstractC11781.m29563());
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
        if (interfaceC5075 != null) {
            interfaceC5075M17746 = c6147.m17747(interfaceC5075);
        } else {
            interfaceC5075M17746 = c6147.m17746();
        }
        InterfaceC5075 interfaceC5076 = interfaceC5075M17746;
        C15400 c15400M49962 = interfaceC5075 != null ? null : c22092.m49962(c11518.f36241);
        try {
            if (abstractC11781.m29593() && c14769.m35550()) {
                int i = ((C17621) c14769.f48335).f26658;
                EnumC4960 enumC4960M27726 = C10925.m27726(abstractC11781);
                C11040 c11040 = C22843.f74058;
                c7312.m34517(i, new C11040("compiler", "already.annotated", enumC4960M27726, abstractC11781));
            }
            c11518.m28989(abstractC11781, c14769, c3168, false, false);
        } finally {
            if (c15400M49962 != null) {
                c22092.m49962(c15400M49962);
            }
            c6147.m17747(interfaceC5076);
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28986(C11518 c11518, C3168 c3168, C14769 c14769, AbstractC11781 abstractC11781) {
        C7312 c7312 = c11518.f36248;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
        try {
            c11518.f36252.m50004(abstractC11781, C11239.m28324(abstractC11781, c3168.f10273), c14769);
        } finally {
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28985(C11518 c11518, C3168 c3168, C6633 c6633, AbstractC22295 abstractC22295, C10377 c10377) {
        C7312 c7312 = c11518.f36248;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
        C6147 c6147 = c11518.f36250;
        InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c6633);
        try {
            c10377.f33011 = c11518.m28983(c10377.f38067.mo31585(), c3168, abstractC22295);
        } finally {
            c6147.m17747(interfaceC5075M17747);
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28987(C11518 c11518, C3168 c3168, AbstractC22295 abstractC22295) {
        C7312 c7312 = c11518.f36248;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
        try {
            C22092 c22092 = c11518.f36252;
            c22092.getClass();
            abstractC22295.mo2284(new C21150(c22092));
        } finally {
            c7312.m34530(interfaceC15976M34530);
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
    /* JADX WARN: Type inference failed for: r12v41, types: [l.ۧܿ᩺] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v47, types: [l.ۢ᩶᩺] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ܰᩳۘ] */
    /* JADX WARN: Type inference failed for: r20v1, types: [l.ۚ۟᩺] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, l.᩶᩺᩺] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.ܰᩳۘ] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45, types: [l.ܰᩳۘ] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ܰᩳۘ] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.ܰᩳۘ] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28989(AbstractC11781 abstractC11781, C14769 c14769, C3168 c3168, boolean z, boolean z2) throws Throwable {
        Iterator it;
        LinkedHashMap linkedHashMap;
        C11518 c11518;
        AbstractC11781 abstractC11782;
        boolean z3;
        ?? r2;
        int i;
        AbstractC11781 abstractC11783;
        C11040 c11040;
        LinkedHashMap linkedHashMap2;
        ?? M35552;
        C14769 c147610;
        boolean z4;
        C23892 c23892;
        AbstractC22664 abstractC22664;
        boolean z5;
        InterfaceC5075 interfaceC5075;
        ?? r23;
        AbstractC22664 abstractC22665;
        AbstractC22970 abstractC22970;
        C23892 c23892Mo45419;
        C14769 c147611;
        C14769 c147612;
        C5558 c5558;
        C14769 c147613;
        Object obj;
        AbstractC22664 abstractC22666;
        boolean z6;
        InterfaceC5075 interfaceC5076;
        Iterator it2;
        boolean z7;
        int i2;
        ?? r12;
        boolean z8;
        AbstractC22664 abstractC22664Mo31585;
        C2832 c2832M55122;
        ?? r6;
        AbstractC11781 abstractC11784;
        Iterator it3;
        Throwable th;
        C23892 c23892M28994;
        C11518 c11519 = this;
        AbstractC11781 abstractC11785 = abstractC11781;
        boolean z9 = z2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        HashMap map = new HashMap();
        C14769 c147614 = c14769;
        while (true) {
            boolean zIsEmpty = c147614.isEmpty();
            C7312 c7312 = c11519.f36248;
            C15252 c15252 = c11519.f36254;
            C24705 c24705 = c11519.f36261;
            if (!zIsEmpty) {
                C17621 c17621 = (C17621) c147614.f48335;
                C14764 c14764 = c11519.f36242;
                if (z) {
                    AbstractC22664 abstractC22667 = c14764.f48311;
                    C23892 c23893 = c17621.f57963;
                    if (c23893 == null || c17621.f26659 == null || !(c23893 instanceof C24638)) {
                        c23892M28994 = new C24638(c17621.f26659, c11519.m28991(c17621, abstractC22667, c3168), C5510.f19172);
                        c17621.f57963 = c23892M28994;
                    } else {
                        c23892M28994 = (C24638) c23893;
                    }
                    th = null;
                } else {
                    th = null;
                    c23892M28994 = c11519.m28994(c17621, c14764.f48311, c3168);
                }
                if (c23892M28994 == null) {
                    C11972.m30024("Failed to create annotation");
                    throw th;
                }
                AbstractC22664 abstractC22668 = c23892M28994.f69124;
                if (c17621.f26659.f73596.mo51844()) {
                    if (linkedHashMap3.containsKey(c17621.f26659.f73596)) {
                        if (!c11519.f36258) {
                            c7312.m34523(EnumC6984.SOURCE_LEVEL, c17621, EnumC3666.f12550.m11913(c11519.f36260));
                        }
                        C18499 c18499 = (C18499) linkedHashMap3.get(c17621.f26659.f73596);
                        c18499.m43089(c23892M28994);
                        linkedHashMap3.put(c17621.f26659.f73596, c18499);
                        map.put(c23892M28994, c17621);
                    } else {
                        AbstractC22970 abstractC22971 = c17621.f26659.f73596;
                        C18499 c184910 = new C18499();
                        c184910.m43089(c23892M28994);
                        linkedHashMap3.put(abstractC22971, c184910);
                        map.put(c23892M28994, c17621);
                    }
                }
                if (!abstractC22668.mo9329() && ((abstractC11785.f38066 == EnumC13603.f43214 || abstractC11785.f38069.f38066 != EnumC13603.f43218) && c24705.m55149(abstractC22668, c14764.f48258))) {
                    abstractC11785.f38071 |= 18014398509613056L;
                    if (c11519.m28990(c23892M28994.m53392(c15252.f49803))) {
                        abstractC11785.f38071 |= 36028797018963968L;
                    }
                }
                if (!abstractC22668.mo9329() && c24705.m55149(abstractC22668, c14764.f48270)) {
                    abstractC11785.f38071 |= 72057594037927936L;
                    if (c11519.m28990(c23892M28994.m53392(c15252.f49755))) {
                        abstractC11785.f38071 |= 288230376151711744L;
                    }
                }
                if (!abstractC22668.mo9329() && abstractC11785.f38066 == EnumC13603.f43213 && c24705.m55149(abstractC22668, c14764.f48260)) {
                    abstractC11785.f38071 |= 9007199254740992L;
                }
                c147614 = c147614.f48336;
            } else {
                AbstractC22664 abstractC22669 = null;
                C14769 c14769M35543 = C14769.m35543();
                Iterator it4 = linkedHashMap3.values().iterator();
                AbstractC11781 abstractC11786 = abstractC11785;
                C11518 c115110 = c11519;
                ?? r7 = c14769M35543;
                while (it4.hasNext()) {
                    C18499 c184911 = (C18499) it4.next();
                    if (c184911.size() == 1) {
                        M35552 = r7.m35552((C23892) c184911.first());
                        c11518 = c115110;
                        abstractC11782 = abstractC11785;
                        z3 = z9;
                        it = it4;
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        C11972.m30021(c3168);
                        C14769 c14769M43093 = c184911.m43093();
                        C23892 c23894 = (C23892) c14769M43093.f48335;
                        C14769 c14769M35544 = C14769.m35543();
                        C11972.m30026((c14769M43093.isEmpty() || c14769M43093.f48336.isEmpty()) ? false : true);
                        int i3 = 0;
                        C2832 c2832M55123 = abstractC22669;
                        C2832 c2832 = c2832M55123;
                        ?? r18 = r7;
                        it = it4;
                        C14769 c147615 = c14769M43093;
                        C2832 c2833 = c2832;
                        C2832 c2834 = c2833;
                        ?? r8 = c2833;
                        while (true) {
                            linkedHashMap = linkedHashMap3;
                            if (c147615.isEmpty()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            AbstractC22664 abstractC226610 = abstractC22669;
                            if (i4 <= 1) {
                                c147610 = c147615;
                                if (c147610.f48336.isEmpty()) {
                                    z4 = false;
                                }
                                C11972.m30026(z4);
                                c23892 = (C23892) c147610.f48335;
                                abstractC22664 = c23892.f69124;
                                if (c2832M55123 == null) {
                                    c2832M55123 = c24705.m55122(abstractC22664);
                                }
                                C2832 c2835 = c2832M55123;
                                if (i4 > 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                interfaceC5075 = (InterfaceC5075) map.get(c23892);
                                r23 = r8;
                                abstractC22665 = c23892.f69124;
                                abstractC22970 = abstractC22665.f73596;
                                C23892 c23895 = c23894;
                                c23892Mo45419 = abstractC22970.mo51845().mo45419();
                                if (c23892Mo45419 == null) {
                                    if (z5) {
                                        C11040 c11041 = C22843.f74058;
                                        c7312.m34520(interfaceC5075, new C11040("compiler", "duplicate.annotation.missing.container", abstractC22665));
                                    }
                                    c147613 = c147610;
                                    c147612 = c14769M43093;
                                } else {
                                    c147611 = c23892Mo45419.f77372;
                                    c147612 = c14769M43093;
                                    if (c147611.isEmpty()) {
                                        C11040 c11042 = C22843.f74058;
                                        c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                        c147613 = c147610;
                                    } else {
                                        c5558 = (C5558) c147611.f48335;
                                        c147613 = c147610;
                                        if (((C10377) c5558.f19300).f38072 != c15252.f49766) {
                                            C11040 c11043 = C22843.f74058;
                                            c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                        } else {
                                            obj = c5558.f19301;
                                            if (obj instanceof C16432) {
                                                abstractC22666 = ((C16432) obj).f53314;
                                            } else {
                                                C11040 c11044 = C22843.f74058;
                                                c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                            }
                                            if (abstractC22666 != null && c24705.m55149(abstractC22666, abstractC22665)) {
                                            }
                                            if (abstractC22666 == null) {
                                                r6 = r23;
                                            } else {
                                                if (c2834 != null || abstractC22666 == c2834) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                C11972.m30026(z6);
                                                interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                                it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                                z7 = false;
                                                i2 = 0;
                                                r12 = abstractC226610;
                                                while (it2.hasNext()) {
                                                    abstractC11784 = (AbstractC11781) it2.next();
                                                    i2++;
                                                    if (i2 == 1) {
                                                        it3 = it2;
                                                        if (abstractC11784.f38066 == EnumC13603.f43218) {
                                                            r12 = (C10377) abstractC11784;
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
                                                    C11040 c11045 = C22843.f74058;
                                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                                } else if (i2 == 0) {
                                                    C11040 c11046 = C22843.f74058;
                                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                                } else {
                                                    if (r12.f38066 != EnumC13603.f43218) {
                                                        C11040 c11047 = C22843.f74058;
                                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    abstractC22664Mo31585 = r12.f38067.mo31585();
                                                    c2832M55122 = c24705.m55122(abstractC22664);
                                                    if (c24705.m55142(abstractC22664Mo31585) || !c24705.m55149(c2832M55122, abstractC22664Mo31585)) {
                                                        C11040 c11048 = C22843.f74058;
                                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                                        z8 = true;
                                                    }
                                                    if (z8) {
                                                        r6 = r12;
                                                    }
                                                    if (r6 != 0) {
                                                        c14769M35544 = c14769M35544.m35552(c23892);
                                                    }
                                                    c2834 = abstractC22666;
                                                }
                                                r6 = abstractC226610;
                                                if (r6 != 0) {
                                                    c14769M35544 = c14769M35544.m35552(c23892);
                                                }
                                                c2834 = abstractC22666;
                                            }
                                            c2832M55123 = c2835;
                                            c147615 = c147613.f48336;
                                            c2832 = abstractC22664;
                                            abstractC22669 = abstractC226610;
                                            linkedHashMap3 = linkedHashMap;
                                            i3 = i4;
                                            c23894 = c23895;
                                            c14769M43093 = c147612;
                                            r8 = r6;
                                            c2834 = c2834;
                                        }
                                    }
                                    abstractC22666 = abstractC226610;
                                    if (abstractC22666 != null) {
                                    }
                                    if (abstractC22666 == null) {
                                        r6 = r23;
                                    } else {
                                        if (c2834 != null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        C11972.m30026(z6);
                                        interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                        it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                        z7 = false;
                                        i2 = 0;
                                        r12 = abstractC226610;
                                        while (it2.hasNext()) {
                                            abstractC11784 = (AbstractC11781) it2.next();
                                            i2++;
                                            if (i2 == 1) {
                                                it3 = it2;
                                                if (abstractC11784.f38066 == EnumC13603.f43218) {
                                                    r12 = (C10377) abstractC11784;
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
                                            C11040 c11049 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                        } else if (i2 == 0) {
                                            C11040 c110410 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                        } else {
                                            if (r12.f38066 != EnumC13603.f43218) {
                                                C11040 c110411 = C22843.f74058;
                                                c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            abstractC22664Mo31585 = r12.f38067.mo31585();
                                            c2832M55122 = c24705.m55122(abstractC22664);
                                            if (c24705.m55142(abstractC22664Mo31585)) {
                                                C11040 c110412 = C22843.f74058;
                                                c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                                z8 = true;
                                            } else {
                                                C11040 c110413 = C22843.f74058;
                                                c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                                z8 = true;
                                            }
                                            if (z8) {
                                                r6 = r12;
                                            }
                                            if (r6 != 0) {
                                                c14769M35544 = c14769M35544.m35552(c23892);
                                            }
                                            c2834 = abstractC22666;
                                        }
                                        r6 = abstractC226610;
                                        if (r6 != 0) {
                                            c14769M35544 = c14769M35544.m35552(c23892);
                                        }
                                        c2834 = abstractC22666;
                                    }
                                    c2832M55123 = c2835;
                                    c147615 = c147613.f48336;
                                    c2832 = abstractC22664;
                                    abstractC22669 = abstractC226610;
                                    linkedHashMap3 = linkedHashMap;
                                    i3 = i4;
                                    c23894 = c23895;
                                    c14769M43093 = c147612;
                                    r8 = r6;
                                    c2834 = c2834;
                                }
                                abstractC22666 = abstractC226610;
                                if (abstractC22666 == null) {
                                    r6 = r23;
                                } else {
                                    if (c2834 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C11972.m30026(z6);
                                    interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                    it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC226610;
                                    while (it2.hasNext()) {
                                        abstractC11784 = (AbstractC11781) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC11784.f38066 == EnumC13603.f43218) {
                                                r12 = (C10377) abstractC11784;
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
                                        C11040 c110414 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C11040 c110415 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                    } else {
                                        if (r12.f38066 != EnumC13603.f43218) {
                                            C11040 c110416 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC22664Mo31585 = r12.f38067.mo31585();
                                        c2832M55122 = c24705.m55122(abstractC22664);
                                        if (c24705.m55142(abstractC22664Mo31585)) {
                                            C11040 c110417 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                            z8 = true;
                                        } else {
                                            C11040 c110418 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c14769M35544 = c14769M35544.m35552(c23892);
                                        }
                                        c2834 = abstractC22666;
                                    }
                                    r6 = abstractC226610;
                                    if (r6 != 0) {
                                        c14769M35544 = c14769M35544.m35552(c23892);
                                    }
                                    c2834 = abstractC22666;
                                }
                                c2832M55123 = c2835;
                                c147615 = c147613.f48336;
                                c2832 = abstractC22664;
                                abstractC22669 = abstractC226610;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c23894 = c23895;
                                c14769M43093 = c147612;
                                r8 = r6;
                                c2834 = c2834;
                            } else {
                                c147610 = c147615;
                            }
                            z4 = true;
                            C11972.m30026(z4);
                            c23892 = (C23892) c147610.f48335;
                            abstractC22664 = c23892.f69124;
                            if (c2832M55123 == null) {
                                c2832M55123 = c24705.m55122(abstractC22664);
                            }
                            C2832 c2836 = c2832M55123;
                            if (i4 > 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            interfaceC5075 = (InterfaceC5075) map.get(c23892);
                            r23 = r8;
                            abstractC22665 = c23892.f69124;
                            abstractC22970 = abstractC22665.f73596;
                            C23892 c23896 = c23894;
                            c23892Mo45419 = abstractC22970.mo51845().mo45419();
                            if (c23892Mo45419 == null) {
                                if (z5) {
                                    C11040 c110419 = C22843.f74058;
                                    c7312.m34520(interfaceC5075, new C11040("compiler", "duplicate.annotation.missing.container", abstractC22665));
                                }
                                c147613 = c147610;
                                c147612 = c14769M43093;
                            } else {
                                c147611 = c23892Mo45419.f77372;
                                c147612 = c14769M43093;
                                if (c147611.isEmpty()) {
                                    C11040 c110420 = C22843.f74058;
                                    c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                    c147613 = c147610;
                                } else {
                                    c5558 = (C5558) c147611.f48335;
                                    c147613 = c147610;
                                    if (((C10377) c5558.f19300).f38072 != c15252.f49766) {
                                        C11040 c110421 = C22843.f74058;
                                        c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                    } else {
                                        obj = c5558.f19301;
                                        if (obj instanceof C16432) {
                                            abstractC22666 = ((C16432) obj).f53314;
                                        } else {
                                            C11040 c110422 = C22843.f74058;
                                            c7312.m34520(interfaceC5075, new C11040("compiler", "invalid.repeatable.annotation", abstractC22970));
                                        }
                                        if (abstractC22666 != null) {
                                        }
                                        if (abstractC22666 == null) {
                                            r6 = r23;
                                        } else {
                                            if (c2834 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                            C11972.m30026(z6);
                                            interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                            it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                            z7 = false;
                                            i2 = 0;
                                            r12 = abstractC226610;
                                            while (it2.hasNext()) {
                                                abstractC11784 = (AbstractC11781) it2.next();
                                                i2++;
                                                if (i2 == 1) {
                                                    it3 = it2;
                                                    if (abstractC11784.f38066 == EnumC13603.f43218) {
                                                        r12 = (C10377) abstractC11784;
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
                                                C11040 c1104110 = C22843.f74058;
                                                c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                            } else if (i2 == 0) {
                                                C11040 c1104111 = C22843.f74058;
                                                c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                            } else {
                                                if (r12.f38066 != EnumC13603.f43218) {
                                                    C11040 c1104112 = C22843.f74058;
                                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                abstractC22664Mo31585 = r12.f38067.mo31585();
                                                c2832M55122 = c24705.m55122(abstractC22664);
                                                if (c24705.m55142(abstractC22664Mo31585)) {
                                                    C11040 c1104113 = C22843.f74058;
                                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                                    z8 = true;
                                                } else {
                                                    C11040 c1104114 = C22843.f74058;
                                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                                    z8 = true;
                                                }
                                                if (z8) {
                                                    r6 = r12;
                                                }
                                                if (r6 != 0) {
                                                    c14769M35544 = c14769M35544.m35552(c23892);
                                                }
                                                c2834 = abstractC22666;
                                            }
                                            r6 = abstractC226610;
                                            if (r6 != 0) {
                                                c14769M35544 = c14769M35544.m35552(c23892);
                                            }
                                            c2834 = abstractC22666;
                                        }
                                        c2832M55123 = c2836;
                                        c147615 = c147613.f48336;
                                        c2832 = abstractC22664;
                                        abstractC22669 = abstractC226610;
                                        linkedHashMap3 = linkedHashMap;
                                        i3 = i4;
                                        c23894 = c23896;
                                        c14769M43093 = c147612;
                                        r8 = r6;
                                        c2834 = c2834;
                                    }
                                }
                                abstractC22666 = abstractC226610;
                                if (abstractC22666 != null) {
                                }
                                if (abstractC22666 == null) {
                                    r6 = r23;
                                } else {
                                    if (c2834 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C11972.m30026(z6);
                                    interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                    it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC226610;
                                    while (it2.hasNext()) {
                                        abstractC11784 = (AbstractC11781) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC11784.f38066 == EnumC13603.f43218) {
                                                r12 = (C10377) abstractC11784;
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
                                        C11040 c1104115 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C11040 c1104116 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                    } else {
                                        if (r12.f38066 != EnumC13603.f43218) {
                                            C11040 c1104117 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC22664Mo31585 = r12.f38067.mo31585();
                                        c2832M55122 = c24705.m55122(abstractC22664);
                                        if (c24705.m55142(abstractC22664Mo31585)) {
                                            C11040 c1104118 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                            z8 = true;
                                        } else {
                                            C11040 c1104119 = C22843.f74058;
                                            c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c14769M35544 = c14769M35544.m35552(c23892);
                                        }
                                        c2834 = abstractC22666;
                                    }
                                    r6 = abstractC226610;
                                    if (r6 != 0) {
                                        c14769M35544 = c14769M35544.m35552(c23892);
                                    }
                                    c2834 = abstractC22666;
                                }
                                c2832M55123 = c2836;
                                c147615 = c147613.f48336;
                                c2832 = abstractC22664;
                                abstractC22669 = abstractC226610;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c23894 = c23896;
                                c14769M43093 = c147612;
                                r8 = r6;
                                c2834 = c2834;
                            }
                            abstractC22666 = abstractC226610;
                            if (abstractC22666 == null) {
                                r6 = r23;
                            } else {
                                if (c2834 != null) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                C11972.m30026(z6);
                                interfaceC5076 = (InterfaceC5075) map.get(c23892);
                                it2 = abstractC22666.f73596.mo29571().m38842(c15252.f49766).iterator();
                                z7 = false;
                                i2 = 0;
                                r12 = abstractC226610;
                                while (it2.hasNext()) {
                                    abstractC11784 = (AbstractC11781) it2.next();
                                    i2++;
                                    if (i2 == 1) {
                                        it3 = it2;
                                        if (abstractC11784.f38066 == EnumC13603.f43218) {
                                            r12 = (C10377) abstractC11784;
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
                                    C11040 c11041110 = C22843.f74058;
                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC22666, Integer.valueOf(i2)));
                                } else if (i2 == 0) {
                                    C11040 c11041111 = C22843.f74058;
                                    c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.no.value", abstractC22666));
                                } else {
                                    if (r12.f38066 != EnumC13603.f43218) {
                                        C11040 c11041112 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC22666));
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    abstractC22664Mo31585 = r12.f38067.mo31585();
                                    c2832M55122 = c24705.m55122(abstractC22664);
                                    if (c24705.m55142(abstractC22664Mo31585)) {
                                        C11040 c11041113 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                        z8 = true;
                                    } else {
                                        C11040 c11041114 = C22843.f74058;
                                        c7312.m34520(interfaceC5076, new C11040("compiler", "invalid.repeatable.annotation.value.return", abstractC22666, abstractC22664Mo31585, c2832M55122));
                                        z8 = true;
                                    }
                                    if (z8) {
                                        r6 = r12;
                                    }
                                    if (r6 != 0) {
                                        c14769M35544 = c14769M35544.m35552(c23892);
                                    }
                                    c2834 = abstractC22666;
                                }
                                r6 = abstractC226610;
                                if (r6 != 0) {
                                    c14769M35544 = c14769M35544.m35552(c23892);
                                }
                                c2834 = abstractC22666;
                            }
                            c2832M55123 = c2836;
                            c147615 = c147613.f48336;
                            c2832 = abstractC22664;
                            abstractC22669 = abstractC226610;
                            linkedHashMap3 = linkedHashMap;
                            i3 = i4;
                            c23894 = c23896;
                            c14769M43093 = c147612;
                            r8 = r6;
                            c2834 = c2834;
                        }
                        ?? r20 = abstractC22669;
                        ?? r24 = r8;
                        C14769 c147616 = c14769M43093;
                        C23892 c23897 = c23894;
                        if (!c14769M35544.isEmpty() && c2834 == null) {
                            InterfaceC5075 interfaceC5077 = (InterfaceC5075) map.get(c147616.f48335);
                            C11040 c110423 = C22843.f74058;
                            c7312.m34520(interfaceC5077, new C11040("compiler", "duplicate.annotation.invalid.repeated", c2832));
                            c11518 = this;
                            abstractC11782 = abstractC11781;
                            z3 = z2;
                            r2 = r20;
                        } else if (c14769M35544.isEmpty()) {
                            c11518 = this;
                            abstractC11782 = abstractC11781;
                            z3 = z2;
                            r2 = 0;
                        } else {
                            C14769 c14769M35554 = c14769M35544.m35554();
                            InterfaceC5075 interfaceC5078 = (InterfaceC5075) map.get(c23897);
                            C11518 c115111 = this;
                            C15714 c15714 = c115111.f36262;
                            c15714.m37552(interfaceC5078);
                            C5558 c5559 = new C5558(r24, new C17924(c2832M55123, c14769M35554));
                            C22092 c22092 = c115111.f36252;
                            if (z) {
                                C24638 c24638 = new C24638(c2834, C14769.of((Object) c5559), ((C24638) c147616.f48335).f77371);
                                C17621 c17621M37537 = c15714.m37537(c24638);
                                if (!c22092.m50025(c17621M37537)) {
                                    C11040 c110424 = C22843.f74058;
                                    c7312.m34520(c17621M37537, new C11040("compiler", "duplicate.annotation.invalid.repeated", c2832));
                                }
                                z3 = z2;
                                if (c22092.m50026(c17621M37537, z3)) {
                                    abstractC11783 = abstractC11781;
                                } else {
                                    if (z3) {
                                        C11040 c110425 = C22843.f74058;
                                        abstractC11783 = abstractC11781;
                                        c11040 = new C11040("compiler", "invalid.repeatable.annotation.not.applicable", c2834, abstractC11783);
                                    } else {
                                        abstractC11783 = abstractC11781;
                                        C11040 c110426 = C22843.f74058;
                                        c11040 = new C11040("compiler", "invalid.repeatable.annotation.not.applicable.in.context", c2834);
                                    }
                                    c7312.m34520(interfaceC5078, c11040);
                                }
                                c24638.m53394();
                                abstractC11782 = abstractC11783;
                                r2 = c24638;
                                c11518 = c115111;
                            } else {
                                abstractC11782 = abstractC11781;
                                z3 = z2;
                                C17621 c17621M37536 = c15714.m37536((AbstractC21654) new C23892(c2834, C14769.of((Object) c5559), r20));
                                boolean z10 = (abstractC11782.f38071 & 2305843009213693952L) != 0 || (abstractC11781.m29558() != null && abstractC11781.m29558().m54827());
                                C15867 c15867M49963 = c22092.m49963(c17621M37536, abstractC11782);
                                if ((c15867M49963.isEmpty() || (c15867M49963.isPresent() && !((Set) c15867M49963.get()).isEmpty())) || (z10 && !(z10 && (abstractC11782.f38071 & 16777216) == 0))) {
                                    i = 1;
                                } else {
                                    C11040 c110427 = C22843.f74058;
                                    i = 1;
                                    c7312.m34520(c17621M37536, new C11040("compiler", "invalid.repeatable.annotation.not.applicable", c2834, abstractC11782));
                                }
                                if (!c22092.m50025(c17621M37536)) {
                                    C11040 c110428 = C22843.f74058;
                                    Object[] objArr = new Object[i];
                                    objArr[0] = c2832;
                                    c7312.m34520(c17621M37536, new C11040("compiler", "duplicate.annotation.invalid.repeated", objArr));
                                }
                                C23892 c23892M28995 = c115111.m28994(c17621M37536, c2834, c3168);
                                c23892M28995.m53394();
                                r2 = c23892M28995;
                                c11518 = c115111;
                            }
                        }
                        if (r2 != 0) {
                            linkedHashMap2 = linkedHashMap;
                            C18499 c184912 = (C18499) linkedHashMap2.get(r2.f69124.f73596);
                            if (c184912 != null) {
                                InterfaceC5075 interfaceC5079 = (InterfaceC5075) map.get(c184912.first());
                                AbstractC22970 abstractC22972 = ((C23892) c184912.first()).f69124.f73596;
                                C11040 c110429 = C22843.f74058;
                                c7312.m34520(interfaceC5079, new C11040("compiler", "invalid.repeatable.annotation.repeated.and.container.present", abstractC22972));
                            }
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                        if (r2 != 0) {
                            M35552 = r18.m35552(r2);
                            abstractC11786 = abstractC11782;
                        } else {
                            abstractC11786 = abstractC11782;
                            M35552 = r18;
                        }
                    }
                    abstractC11785 = abstractC11782;
                    c115110 = c11518;
                    linkedHashMap3 = linkedHashMap2;
                    it4 = it;
                    r7 = M35552;
                    abstractC22669 = null;
                    z9 = z3;
                }
                ?? r3 = r7;
                if (z) {
                    abstractC11786.m29599(r3.m35554());
                    return;
                }
                C14769 c14769M35555 = r3.m35554();
                abstractC11786.m29584();
                abstractC11786.m29585(c14769M35555);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28990(AbstractC21654 abstractC21654) {
        if (!(abstractC21654 instanceof C3754)) {
            return false;
        }
        C3754 c3754 = (C3754) abstractC21654;
        return c3754.f69124 == this.f36242.f48255 && ((Integer) c3754.f12872).intValue() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23892 m28994(C17621 c17621, AbstractC22664 abstractC22664, C3168 c3168) {
        C23892 c23892 = c17621.f57963;
        if (c23892 != null && c17621.f26659 != null) {
            return c23892;
        }
        C23892 c23893 = new C23892(c17621.f26659, m28991(c17621, abstractC22664, c3168), null);
        c17621.f57963 = c23893;
        return c23893;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C14769 m28991(C17621 c17621, AbstractC22664 abstractC22664, C3168 c3168) {
        boolean z;
        boolean z2;
        AbstractC22295 abstractC22295;
        boolean z3;
        C14769 c14769;
        C5558 c5558;
        C17621 c17622 = c17621;
        AbstractC8036 abstractC8036 = c17622.f57962;
        AbstractC22664 abstractC22664M1981 = abstractC8036.f26659;
        if (abstractC22664M1981 == null) {
            C0310 c0310 = this.f36247;
            c0310.getClass();
            abstractC22664M1981 = c0310.m1981(abstractC8036, c3168, AbstractC22664.f73590);
        }
        AbstractC8036 abstractC8037 = c17622.f57962;
        abstractC8037.getClass();
        C22092 c22092 = this.f36252;
        AbstractC22664 abstractC22664M49970 = c22092.m49970(abstractC8037, abstractC22664M1981, abstractC22664, c22092.f71222);
        c17622.f26659 = abstractC22664M49970;
        boolean zMo9329 = abstractC22664M49970.mo9329();
        boolean zMo51844 = c17622.f26659.f73596.mo51844();
        C7312 c7312 = this.f36248;
        if (zMo51844 || zMo9329) {
            z = zMo9329;
        } else {
            AbstractC8036 abstractC8038 = c17622.f57962;
            abstractC8038.getClass();
            AbstractC22664 abstractC22665 = c17622.f26659;
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC8038, new C11040("compiler", "not.annotation.type", abstractC22665));
            z = true;
        }
        C14769 c147610 = c17622.f57964;
        if (c147610.m35551() != 1 || ((AbstractC22295) c147610.f48335).m21911(EnumC21461.f68452)) {
            z2 = false;
        } else {
            int i = ((AbstractC22295) c147610.f48335).f26658;
            C15714 c15714 = this.f36262;
            c15714.f51040 = i;
            c147610.f48335 = c15714.m37541((AbstractC22295) c15714.m37565(this.f36254.f49766), (AbstractC22295) c147610.f48335);
            z2 = true;
        }
        C18499 c18499 = new C18499();
        C14769 c147611 = c147610;
        while (c147611.m35550()) {
            AbstractC22295 abstractC22296 = (AbstractC22295) c147611.f48335;
            AbstractC22664 abstractC22666 = c17622.f26659;
            boolean zM21911 = abstractC22296.m21911(EnumC21461.f68452);
            C14764 c14764 = this.f36242;
            if (!zM21911) {
                c7312.m34520(abstractC22296, C22843.f74117);
                C12748 c12748 = c14764.f48263;
                abstractC22296.f26659 = c12748;
                m28983(c12748, c3168, abstractC22296);
            } else {
                C20605 c20605 = (C20605) abstractC22296;
                if (!c20605.f66030.m21911(EnumC21461.f68523)) {
                    c7312.m34520(abstractC22296, C22843.f74117);
                    C12748 c12749 = c14764.f48263;
                    abstractC22296.f26659 = c12749;
                    m28983(c12749, c3168, abstractC22296);
                } else {
                    C5887 c5887 = (C5887) c20605.f66030;
                    if (z2) {
                        AbstractC22295 abstractC22297 = c20605.f66031;
                        abstractC22297.getClass();
                        abstractC22295 = abstractC22297;
                    } else {
                        c5887.getClass();
                        abstractC22295 = c5887;
                    }
                    AbstractC19728 abstractC19728 = c5887.f20169;
                    C14769 c14769M35543 = C14769.m35543();
                    C22010 c22010 = this.f36253;
                    c22010.getClass();
                    z3 = z2;
                    c14769 = c147611;
                    AbstractC11781 abstractC11781M49772 = c22010.m49772(abstractC22295, c3168, abstractC22666.f73596, abstractC22666, abstractC19728, c14769M35543, (C14769) null);
                    c5887.f20170 = abstractC11781M49772;
                    c5887.f26659 = abstractC11781M49772.f38067;
                    if (abstractC11781M49772.f38069 != abstractC22666.f73596 && !z) {
                        AbstractC19728 abstractC19729 = c5887.f20169;
                        C11040 c11041 = C22843.f74058;
                        c7312.m34520(c5887, new C11040("compiler", "no.annotation.member", abstractC19729, abstractC22666));
                    }
                    AbstractC22664 abstractC22664Mo31585 = abstractC11781M49772.f38067.mo31585();
                    AbstractC21654 abstractC21654M28983 = m28983(abstractC22664Mo31585, c3168, c20605.f66031);
                    abstractC22296.f26659 = abstractC22664Mo31585;
                    c5558 = abstractC11781M49772.f38067.mo9329() ? null : new C5558((C10377) abstractC11781M49772, abstractC21654M28983);
                }
                if (c5558 == null && !((C10377) c5558.f19300).f38067.mo9329()) {
                    c18499.m43089(c5558);
                }
                c147611 = c14769.f48336;
                c17622 = c17621;
                z2 = z3;
            }
            c14769 = c147611;
            z3 = z2;
            if (c5558 == null) {
            }
            c147611 = c14769.f48336;
            c17622 = c17621;
            z2 = z3;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC21654 m28983(AbstractC22664 abstractC22664, C3168 c3168, AbstractC22295 abstractC22295) {
        AbstractC22970 abstractC22970;
        AbstractC11781 abstractC11781M28352;
        EnumC13603 enumC13603;
        C14764 c14764 = this.f36242;
        C7312 c7312 = this.f36248;
        try {
            abstractC22664.f73596.mo29590();
        } catch (C21566 e) {
            abstractC22295.getClass();
            EnumC4960 enumC4960M27726 = C10925.m27726(e.f68881);
            AbstractC19728 abstractC19728Mo29582 = e.f68881.mo29582();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "cant.resolve", enumC4960M27726, abstractC19728Mo29582, null, null));
            abstractC22664 = c14764.f48263;
        }
        boolean zM51067 = abstractC22664.m51067(EnumC21172.ARRAY);
        C24705 c24705 = this.f36261;
        if (zM51067) {
            if (!abstractC22295.m21911(EnumC21461.f68554)) {
                int i = abstractC22295.f26658;
                C15714 c15714 = this.f36262;
                c15714.f51040 = i;
                abstractC22295 = c15714.m37573(null, C14769.m35543(), C14769.of((Object) abstractC22295));
            }
            C21549 c21549 = (C21549) abstractC22295;
            AbstractC22295 abstractC22296 = c21549.f68829;
            if (abstractC22296 != null) {
                c7312.m34520(abstractC22296, C22843.f74066);
            }
            C18499 c18499 = new C18499();
            for (C14769 c14769 = c21549.f68827; c14769.m35550(); c14769 = c14769.f48336) {
                c18499.m43089(m28983(c24705.m55120(abstractC22664), c3168, (AbstractC22295) c14769.f48335));
            }
            c21549.f26659 = abstractC22664;
            return new C17924(abstractC22664, (AbstractC21654[]) c18499.toArray(new AbstractC21654[c18499.m43094()]));
        }
        if (abstractC22295.m21911(EnumC21461.f68554)) {
            if (!abstractC22664.mo9329()) {
                c7312.m34520(abstractC22295, C22843.f74064);
            }
            C21549 c215410 = (C21549) abstractC22295;
            AbstractC22295 abstractC22297 = c215410.f68829;
            if (abstractC22297 != null) {
                c7312.m34520(abstractC22297, C22843.f74066);
            }
            for (C14769 c147610 = c215410.f68827; c147610.m35550(); c147610 = c147610.f48336) {
                m28983(c14764.f48263, c3168, (AbstractC22295) c147610.f48335);
            }
            return new C12703(c14764.f48263);
        }
        if (abstractC22664.f73596.mo51844()) {
            if (abstractC22295.m21911(EnumC21461.f68479)) {
                return m28994((C17621) abstractC22295, abstractC22664, c3168);
            }
            c7312.m34520(abstractC22295, C22843.f74167);
            abstractC22664 = c14764.f48263;
        }
        if (abstractC22295.m21911(EnumC21461.f68479)) {
            if (!abstractC22664.mo9329()) {
                C11040 c11041 = C22843.f74058;
                c7312.m34520(abstractC22295, new C11040("compiler", "annotation.not.valid.for.type", abstractC22664));
            }
            C17621 c17621 = (C17621) abstractC22295;
            m28994(c17621, c14764.f48263, c3168);
            return new C12703(c17621.f57962.f26659);
        }
        C4807 c4807 = new C4807();
        abstractC22295.mo2284(c4807);
        if (!c4807.f76953) {
            c7312.m34520(abstractC22295, C22843.f74048);
            return new C12703(c14764.f48263);
        }
        boolean zMo40452 = abstractC22664.mo40452();
        C0310 c0310 = this.f36247;
        if (!zMo40452) {
            AbstractC22664 abstractC22665 = c14764.f48282;
            AbstractC22664 abstractC22666 = c14764.f48317;
            if (!c24705.m55149(abstractC22664, abstractC22665) || abstractC22664.m51067(EnumC21172.ERROR)) {
                if (abstractC22664.f73596 == abstractC22666.f73596) {
                    AbstractC22664 abstractC22664M1933 = c0310.m1933(abstractC22295, c3168, m28980(abstractC22664));
                    boolean zMo9329 = abstractC22664M1933.mo9329();
                    C15252 c15252 = this.f36254;
                    if (!zMo9329) {
                        if (C11239.m28319(abstractC22295) == c15252.f49816) {
                            return new C16432(((C23041) abstractC22295).f74776.f26659, c24705);
                        }
                        c7312.m34520(abstractC22295, C22843.f74133);
                        return new C12703(c14764.f48263);
                    }
                    if (C11239.m28319(abstractC22295) == c15252.f49816) {
                        C23041 c23041 = (C23041) abstractC22295;
                        if (c23041.f74776.f26659.mo9329()) {
                            C12748 c12748M55061 = C24705.m55061(c23041.f74776.f26659.f73596.mo29575(), c14764.f48319, abstractC22666);
                            C4500 c4500 = new C4500(abstractC22664);
                            c4500.f16070 = c12748M55061;
                            return c4500;
                        }
                    }
                    return new C12703(abstractC22664M1933.mo31584());
                }
                if (!abstractC22664.m51067(EnumC21172.CLASS) || (abstractC22664.f73596.mo29591() & 16384) == 0) {
                    if (!abstractC22664.mo9329()) {
                        c7312.m34520(abstractC22295, C22843.f74064);
                    }
                    return new C12703(c0310.m1934((AbstractC8036) abstractC22295, c3168, abstractC22664));
                }
                AbstractC22664 abstractC22664M1934 = c0310.m1933(abstractC22295, c3168, m28980(abstractC22664));
                AbstractC11781 abstractC11781M28353 = C11239.m28352(abstractC22295);
                if (abstractC11781M28353 != null) {
                    AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC22295);
                    if ((!abstractC8036M28345.m21911(EnumC21461.f68485) || ((abstractC11781M28352 = C11239.m28352(((C23041) abstractC8036M28345).f74776)) != null && ((enumC13603 = abstractC11781M28352.f38066) == EnumC13603.f43219 || enumC13603 == EnumC13603.f43213))) && abstractC11781M28353.f38066 == EnumC13603.f43205 && (16384 & abstractC11781M28353.mo29591()) != 0) {
                        return new C20908(abstractC22664, (C5816) abstractC11781M28353);
                    }
                }
                c7312.m34520(abstractC22295, C22843.f74190);
                return new C12703(abstractC22664M1934.mo31584());
            }
        }
        AbstractC22664 abstractC22664M1935 = c0310.m1933(abstractC22295, c3168, m28980(abstractC22664));
        if (abstractC22664M1935.mo9329()) {
            return new C12703(abstractC22664M1935.mo31584());
        }
        if (abstractC22664M1935.mo39105() == null) {
            c7312.m34520(abstractC22295, C22843.f74195);
            return new C12703(abstractC22664);
        }
        AbstractC22664 abstractC22667 = abstractC22295.f26659;
        if (abstractC22667 != null && (abstractC22970 = abstractC22667.f73596) != null) {
            m28996(abstractC22295, c3168, abstractC22970, abstractC22295);
        }
        return new C3754(this.f36256.m36836(abstractC22664M1935, abstractC22664).mo39105(), abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14479 m28980(AbstractC22664 abstractC22664) {
        C14479 c14479 = this.f36247.f1687;
        return new C14479(c14479.f45573, c14479.f45572, abstractC22664, new C13010(c14479.f45571), c14479.f45574);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28998(C14769 c14769, C3168 c3168, AbstractC11781 abstractC11781, InterfaceC5075 interfaceC5075, boolean z) {
        if (abstractC11781 == null) {
            C11972.m30024("Symbol argument to actualEnterTypeAnnotations is nul/");
            throw null;
        }
        InterfaceC15976 interfaceC15976 = c3168.f10275.f61856;
        C7312 c7312 = this.f36248;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(interfaceC15976);
        C6147 c6147 = this.f36250;
        InterfaceC5075 interfaceC5075M17747 = interfaceC5075 != null ? c6147.m17747(interfaceC5075) : null;
        try {
            m28989(abstractC11781, c14769, c3168, true, z);
        } finally {
            if (interfaceC5075M17747 != null) {
                c6147.m17747(interfaceC5075M17747);
            }
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28996(final AbstractC8036 abstractC8036, final C3168 c3168, final AbstractC11781 abstractC11781, final InterfaceC5075 interfaceC5075) {
        C11972.m30021(abstractC11781);
        m28995(new Runnable() { // from class: l.۬֨᩺
            @Override // java.lang.Runnable
            public final void run() {
                abstractC8036.mo2284(new C1824(this.f42972, c3168, abstractC11781, interfaceC5075));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10772 m28993() {
        return this.f36257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28984(C11518 c11518, C3168 c3168) {
        C11972.m30025("Trying to annotation type complete a non-annotation type", ((C7926) c3168.f10273).f26345.mo51844());
        C7312 c7312 = c11518.f36248;
        InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
        try {
            C7926 c7926 = (C7926) c3168.f10273;
            C15247 c15247 = new C15247(c11518, c11518.f36247, c11518.f36252, c11518.f36242, c11518.f36246);
            c15247.mo1505(c7926);
            c7926.f26345.mo51845().m45418(c15247.f49738);
            c7926.f26345.mo51845().m45422(c15247.f49735);
        } finally {
            c7312.m34530(interfaceC15976M34530);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12703 m29001() {
        return this.f36249;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29006() {
        this.f36259 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5553 m28992(C5553 c5553) {
        C5553 c5554 = new C5553(this.f36255, this.f36251, this.f36243, this.f36244);
        this.f36255 = c5553.f19288;
        this.f36243 = c5553.f19287;
        this.f36244 = c5553.f19286;
        this.f36251 = c5553.f19289;
        return c5554;
    }
}
