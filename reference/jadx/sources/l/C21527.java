package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩶᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21527 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13477 f68773 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f68774;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f68775;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashSet f68776;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4747 f68777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7312 f68778;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC16722 f68779;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f68780;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f68781;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC4373 f68782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9923 f68783 = new C24511(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f68784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13015 f68785;

    public C21527(C4747 c4747) {
        c4747.m14646(f68773, this);
        this.f68785 = C13015.m32421(c4747);
        this.f68778 = C7312.m20023(c4747);
        this.f68777 = c4747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48960(ArrayList arrayList) {
        this.f68781 = "javac";
        this.f68782 = EnumC4373.LOG;
        this.f68774 = new LinkedHashSet();
        this.f68784 = new LinkedHashMap();
        this.f68776 = null;
        this.f68775 = new LinkedHashSet();
        Set setM20948 = EnumC7687.m20948();
        AbstractC9923 abstractC9923 = this.f68783;
        if (m48950(arrayList, setM20948, abstractC9923)) {
            EnumC7687 enumC7687 = EnumC7687.f25359;
            C13015 c13015 = this.f68785;
            String strM32423 = c13015.m32423(enumC7687);
            boolean z = strM32423 == null;
            InterfaceC14813 interfaceC14813 = new InterfaceC14813() { // from class: l.ۨ᩵ۘ
                @Override // l.InterfaceC14813
                /* JADX INFO: renamed from: ۙ */
                public final void mo11778(EnumC7687 enumC7688) {
                    C11040 c11040 = C22843.f74058;
                    this.f40371.m48961(new C11040("compiler", "release.bootclasspath.conflict", enumC7688));
                }
            };
            EnumC7687 enumC7688 = EnumC7687.f25299;
            EnumC7687 enumC7689 = EnumC7687.f25350;
            m48962(z, interfaceC14813, EnumC7687.f25354, EnumC7687.f25309, EnumC7687.f25287, EnumC7687.f25307, EnumC7687.f25318, EnumC7687.f25331, EnumC7687.f25298, EnumC7687.f25357, enumC7688, enumC7689, EnumC7687.f25327, EnumC7687.f25341);
            if (strM32423 != null) {
                InterfaceC19554 interfaceC19554M5943 = C1655.m5943(strM32423);
                if (interfaceC19554M5943 == null) {
                    C11040 c11040 = C22843.f74058;
                    m48961(new C11040("compiler", "unsupported.release.version", strM32423));
                } else {
                    c13015.m32428(enumC7688, interfaceC19554M5943.m45124());
                    c13015.m32428(enumC7689, interfaceC19554M5943.m45121());
                    C4747 c4747 = this.f68777;
                    c4747.m14644(InterfaceC19554.class, interfaceC19554M5943);
                    if (m48950(interfaceC19554M5943.m45123(), setM20948, abstractC9923)) {
                        C10338.m26601(c4747, interfaceC19554M5943.m45122(), m48952());
                        c13015.m32431();
                    }
                }
            } else {
                c13015.m32431();
            }
        }
        if (this.f68780) {
            this.f68778.m20048(EnumC2837.JAVAC, "msg.usage", "javac");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set m48968() {
        if (this.f68776 == null) {
            this.f68776 = new LinkedHashSet();
        }
        if (this.f68774 != null) {
            Iterator it = ((C2026) m48952()).m6979(this.f68774).iterator();
            while (it.hasNext()) {
                this.f68776.add((InterfaceC15976) it.next());
            }
        }
        return this.f68776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m48959() {
        return this.f68775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48950(Iterable iterable, Set set, AbstractC9923 abstractC9923) {
        EnumC7687 enumC7687M20931;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.isEmpty()) {
                C11040 c11040 = C22843.f74058;
                m48961(new C11040("compiler", "invalid.flag", str));
                return false;
            }
            if (str.startsWith("-")) {
                enumC7687M20931 = EnumC7687.m20931(str, set);
            } else {
                enumC7687M20931 = EnumC7687.f25361;
                if (!enumC7687M20931.mo8770(str)) {
                    enumC7687M20931 = null;
                }
            }
            if (enumC7687M20931 != null) {
                try {
                    enumC7687M20931.m20954(abstractC9923, str, it);
                } catch (C14398 e) {
                    String message = e.getMessage();
                    this.f68780 = true;
                    int iOrdinal = this.f68782.ordinal();
                    if (iOrdinal == 0) {
                        throw new C17490(new IllegalArgumentException(message, e.getCause()));
                    }
                    if (iOrdinal == 1) {
                        throw new C17490(new IllegalStateException(message, e.getCause()));
                    }
                    if (iOrdinal == 2) {
                        this.f68778.m20035(message);
                    }
                    return false;
                }
            } else {
                C11040 c11041 = C22843.f74058;
                m48961(new C11040("compiler", "invalid.flag", str));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0352  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:159:0x0386  */
    /* JADX WARN: Code duplicated, block: B:160:0x0388  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:189:0x047f  */
    /* JADX WARN: Code duplicated, block: B:191:0x048b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0497  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:204:0x04df  */
    /* JADX WARN: Code duplicated, block: B:209:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:213:0x0511  */
    /* JADX WARN: Code duplicated, block: B:217:0x0537  */
    /* JADX WARN: Code duplicated, block: B:219:0x053f  */
    /* JADX WARN: Code duplicated, block: B:221:0x054b  */
    /* JADX WARN: Code duplicated, block: B:222:0x054e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0559  */
    /* JADX WARN: Code duplicated, block: B:226:0x055b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0564  */
    /* JADX WARN: Code duplicated, block: B:230:0x0566  */
    /* JADX WARN: Code duplicated, block: B:233:0x0571  */
    /* JADX WARN: Code duplicated, block: B:234:0x0573 A[PHI: r16
      0x0573: PHI (r16v12 java.lang.String[]) = (r16v8 java.lang.String[]), (r16v9 java.lang.String[]), (r16v10 java.lang.String[]), (r16v13 java.lang.String[]) binds: [B:231:0x056e, B:227:0x0561, B:223:0x0556, B:221:0x054b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x0577  */
    /* JADX WARN: Code duplicated, block: B:238:0x057d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0595 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:243:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:245:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:247:0x05be  */
    /* JADX WARN: Code duplicated, block: B:249:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:253:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:260:0x060c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0615  */
    /* JADX WARN: Code duplicated, block: B:266:0x0628  */
    /* JADX WARN: Code duplicated, block: B:268:0x0630  */
    /* JADX WARN: Code duplicated, block: B:307:0x050c A[EDGE_INSN: B:307:0x050c->B:212:0x050c BREAK  A[LOOP:3: B:200:0x04d0->B:211:0x0501], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:266:0x0628, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m48964() {
        EnumC20820 enumC20820M47624;
        final EnumC16305 enumC16305M47630;
        char c;
        Object obj;
        boolean z;
        EnumC16305 enumC16305;
        EnumC16305 enumC16306;
        boolean z2;
        String str;
        boolean z3;
        EnumC7687 enumC7687;
        EnumC21704 enumC21704M47626;
        String strM32423;
        Object obj2;
        String str2;
        String strM32424;
        EnumC7687 enumC7688;
        String strM32425;
        String strM32426;
        EnumC7687 enumC7689;
        String strM32427;
        int i;
        Pattern patternMo10552;
        String[] strArrSplit;
        int length;
        int i2;
        Matcher matcher;
        String strGroup;
        String[] strArrSplit2;
        int length2;
        int i3;
        String str3;
        String[] strArrSplit3;
        int length3;
        int i4;
        String str4;
        String[] strArr;
        byte b;
        Pattern patternMo10553;
        String[] strArrSplit4;
        int length4;
        int i5;
        Matcher matcher2;
        int i6;
        Object obj3;
        String str5;
        Pattern pattern;
        String strGroup2;
        String strGroup3;
        String[] strArrSplit5;
        int length5;
        int i7;
        String str6;
        int i8;
        Object obj4;
        char c2;
        InterfaceC24329 parent;
        InterfaceC16722 interfaceC16722M48952 = m48952();
        EnumC7687 enumC76810 = EnumC7687.f25286;
        C13015 c13015 = this.f68785;
        boolean zM32433 = c13015.m32433(enumC76810);
        C7312 c7312 = this.f68778;
        if (zM32433) {
            if (!interfaceC16722M48952.mo6989(EnumC6282.CLASS_OUTPUT)) {
                c7312.m34525(C22843.f74159);
            } else if (!interfaceC16722M48952.mo6989(EnumC6282.MODULE_SOURCE_PATH)) {
                c7312.m34525(C22843.f74169);
            } else {
                try {
                    for (String str7 : Arrays.asList(c13015.m32423(enumC76810).split(","))) {
                        InterfaceC24928 interfaceC24928Mo6994 = interfaceC16722M48952.mo6994(EnumC6282.MODULE_SOURCE_PATH, str7);
                        if (interfaceC24928Mo6994 == null) {
                            C11040 c11040 = C22843.f74058;
                            c7312.m34525(new C11040("compiler", "module.not.found.in.module.source.path", str7));
                        } else {
                            InterfaceC24928 interfaceC24928Mo6995 = interfaceC16722M48952.mo6994(EnumC6282.CLASS_OUTPUT, str7);
                            for (InterfaceC15976 interfaceC15976 : interfaceC16722M48952.mo6977(interfaceC24928Mo6994, "", (Set) EnumSet.of(EnumC17468.SOURCE), true)) {
                                InterfaceC15976 interfaceC15976Mo6983 = interfaceC16722M48952.mo6983(interfaceC24928Mo6995, interfaceC16722M48952.mo6978(interfaceC24928Mo6994, interfaceC15976), EnumC17468.CLASS);
                                if (interfaceC15976Mo6983 == null || interfaceC15976Mo6983.mo10890() < interfaceC15976.mo10890()) {
                                    if (this.f68776 == null) {
                                        this.f68776 = new HashSet();
                                    }
                                    this.f68776.add(interfaceC15976);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    c7312.m20048(EnumC2837.JAVAC, "msg.io", new Object[0]);
                    e.printStackTrace(c7312.m20031(EnumC8803.NOTICE));
                    return false;
                }
            }
        }
        if (m48965()) {
            if (c13015.m32433(EnumC7687.f25278) || c13015.m32433(EnumC7687.f25281) || c13015.m32433(EnumC7687.f25303) || c13015.m32433(EnumC7687.f25304) || c13015.m32433(EnumC7687.f25360) || c13015.m32433(EnumC7687.f25286)) {
                return true;
            }
            if (!this.f68780) {
                if (C4878.m14931(c13015)) {
                    m48961(C22843.f74197);
                    return false;
                }
                m48961(C22843.f74141);
                return false;
            }
        } else if (m48951(EnumC7687.f25320) && m48951(EnumC7687.f25289) && m48951(EnumC7687.f25340)) {
            if (interfaceC16722M48952 instanceof InterfaceC20452) {
                InterfaceC20452 interfaceC20452 = (InterfaceC20452) interfaceC16722M48952;
                EnumC6282 enumC6282 = EnumC6282.CLASS_OUTPUT;
                if (interfaceC20452.mo6989(enumC6282)) {
                    InterfaceC24329 interfaceC24329 = (InterfaceC24329) interfaceC20452.mo6992(enumC6282).iterator().next();
                    if (interfaceC20452.mo6989(EnumC6282.MODULE_SOURCE_PATH)) {
                        if (C3445.exists(interfaceC24329.resolve("module-info.class"), new EnumC20599[0])) {
                            C11040 c11041 = C22843.f74058;
                            c7312.m34525(new C11040("compiler", "multi-module.outdir.cannot.be.exploded.module", interfaceC24329));
                        }
                    } else {
                        EnumC7687 enumC76811 = EnumC7687.f25329;
                        StringBuilder sb = new StringBuilder("-");
                        EnumC19876 enumC19876 = EnumC19876.PATH;
                        sb.append(enumC19876.f63945);
                        if (c13015.m32434(enumC76811, sb.toString()) && (parent = interfaceC24329.getParent()) != null && C3445.exists(parent.resolve("module-info.class"), new EnumC20599[0])) {
                            C25213 c25213 = C13146.f42046;
                            c7312.m34528(enumC19876, new C25213("compiler", "outdir.is.in.exploded.module", interfaceC24329));
                        }
                    }
                }
            }
            String strM32428 = c13015.m32423(EnumC7687.f25299);
            if (strM32428 != null) {
                enumC20820M47624 = EnumC20820.m47624(strM32428);
            } else {
                enumC20820M47624 = EnumC20820.f66679;
            }
            String strM32429 = c13015.m32423(EnumC7687.f25350);
            if (strM32429 != null) {
                enumC16305M47630 = EnumC16305.m38658(strM32429);
            } else {
                enumC16305M47630 = EnumC16305.f52927;
            }
            if (Character.isDigit(enumC16305M47630.f52944.charAt(0)) && enumC16305M47630.compareTo(enumC20820M47624.m47630()) < 0) {
                if (strM32429 != null) {
                    if (strM32428 == null) {
                        EnumC16305 enumC16305M47631 = enumC20820M47624.m47630();
                        C25213 c25214 = C13146.f42046;
                        m48961(new C25213("compiler", "target.default.source.conflict", strM32429, enumC16305M47631));
                        return false;
                    }
                    EnumC16305 enumC16305M47632 = enumC20820M47624.m47630();
                    C25213 c25215 = C13146.f42046;
                    m48961(new C25213("compiler", "source.target.conflict", strM32428, enumC16305M47632));
                    return false;
                }
                enumC16305M47630 = enumC20820M47624.m47630();
                c13015.m32426("-target", enumC16305M47630.f52944);
            }
            if (c13015.m32433(EnumC7687.f25322)) {
                if (strM32428 == null) {
                    m48957(C22843.f74033);
                    return false;
                }
                EnumC20820 enumC20820 = EnumC20820.f66679;
                if (enumC20820M47624 != enumC20820) {
                    C11040 c11042 = C22843.f74058;
                    m48957(new C11040("compiler", "preview.not.latest", strM32428, enumC20820));
                    return false;
                }
            }
            EnumC7687 enumC76812 = EnumC7687.f25339;
            String strM324210 = c13015.m32423(enumC76812);
            if (strM324210 != null) {
                EnumC5865 enumC5865M17069 = EnumC5865.m17069(strM324210);
                if (enumC16305M47630.compareTo(EnumC16305.JDK1_8) > 0 || enumC5865M17069.mo17072(enumC16305M47630)) {
                    c2 = 0;
                } else {
                    C25213 c25216 = C13146.f42046;
                    c2 = 0;
                    m48961(new C25213("compiler", "profile.target.conflict", enumC5865M17069, enumC16305M47630));
                }
                if (c13015.m32423(EnumC7687.f25354) != null) {
                    m48961(C22843.f74087);
                }
                c = c2;
            } else {
                c = 0;
            }
            if (c13015.m32433(EnumC7687.f25291) && c13015.m32433(EnumC7687.f25301)) {
                m48961(C22843.f74200);
            }
            EnumC7687 enumC76813 = EnumC7687.f25329;
            StringBuilder sb2 = new StringBuilder("-");
            EnumC19876 enumC19877 = EnumC19876.OPTIONS;
            sb2.append(enumC19877.f63945);
            boolean zM32434 = c13015.m32434(enumC76813, sb2.toString());
            if (zM32434 && enumC20820M47624.compareTo(EnumC20820.f66679) < 0 && !c13015.m32433(EnumC7687.f25359) && (interfaceC16722M48952 instanceof AbstractC24643)) {
                AbstractC24643 abstractC24643 = (AbstractC24643) interfaceC16722M48952;
                if (enumC20820M47624.compareTo(EnumC20820.JDK8) <= 0) {
                    if (abstractC24643.m54981()) {
                        String str8 = enumC20820M47624.f66685;
                        C25213 c25217 = C13146.f42046;
                        Object[] objArr = new Object[1];
                        objArr[c] = str8;
                        c7312.m34528(enumC19877, new C25213("compiler", "source.no.bootclasspath", objArr));
                    }
                } else if (abstractC24643.m54979()) {
                    String str9 = enumC20820M47624.f66685;
                    C25213 c25218 = C13146.f42046;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = str9;
                    c7312.m34528(enumC19877, new C25213("compiler", "source.no.system.modules.path", objArr2));
                }
            }
            EnumC20820 enumC20821 = EnumC20820.f66668;
            if (enumC20820M47624.compareTo(enumC20821) < 0) {
                String str10 = enumC20820M47624.f66685;
                String str11 = enumC20821.f66685;
                C11040 c11043 = C22843.f74058;
                obj = "";
                Object[] objArr3 = new Object[2];
                objArr3[c] = str10;
                objArr3[1] = str11;
                c7312.m34525(new C11040("compiler", "option.removed.source", objArr3));
            } else {
                obj = "";
                if (enumC20820M47624 == enumC20821 && zM32434) {
                    String str12 = enumC20820M47624.f66685;
                    C25213 c25219 = C13146.f42046;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = str12;
                    c7312.m34528(enumC19877, new C25213("compiler", "option.obsolete.source", objArr4));
                    z = true;
                }
                enumC16305 = EnumC16305.f52942;
                if (enumC16305M47630.compareTo(enumC16305) < 0) {
                    C11040 c11044 = C22843.f74058;
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = enumC16305M47630;
                    objArr5[1] = enumC16305;
                    c7312.m34525(new C11040("compiler", "option.removed.target", objArr5));
                } else if (enumC16305M47630 == enumC16305 && zM32434) {
                    C25213 c252110 = C13146.f42046;
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = enumC16305M47630;
                    c7312.m34528(enumC19877, new C25213("compiler", "option.obsolete.target", objArr6));
                    z = true;
                }
                enumC16306 = EnumC16305.JDK1_8;
                if (enumC16305M47630.compareTo(enumC16306) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC14813 interfaceC14813 = new InterfaceC14813() { // from class: l.ۗ᩵ۘ
                    @Override // l.InterfaceC14813
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo11778(EnumC7687 enumC76814) {
                        C11040 c11045 = C22843.f74058;
                        this.f12436.m48961(new C11040("compiler", "option.not.allowed.with.target", enumC76814, enumC16305M47630));
                    }
                };
                str = ",";
                EnumC7687[] enumC7687Arr = new EnumC7687[9];
                enumC7687Arr[c] = EnumC7687.f25354;
                enumC7687Arr[1] = EnumC7687.f25307;
                enumC7687Arr[2] = EnumC7687.f25309;
                enumC7687Arr[3] = EnumC7687.f25287;
                enumC7687Arr[4] = EnumC7687.f25318;
                enumC7687Arr[5] = EnumC7687.f25331;
                enumC7687Arr[6] = EnumC7687.f25298;
                enumC7687Arr[7] = EnumC7687.f25357;
                enumC7687Arr[8] = enumC76812;
                m48962(z2, interfaceC14813, enumC7687Arr);
                if (enumC16305M47630.compareTo(EnumC16305.JDK1_9) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC14813 interfaceC14814 = new InterfaceC14813() { // from class: l.᩵᩵ۘ
                    @Override // l.InterfaceC14813
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo11778(EnumC7687 enumC76814) {
                        C11040 c11045 = C22843.f74058;
                        this.f66582.m48961(new C11040("compiler", "option.not.allowed.with.target", enumC76814, enumC16305M47630));
                    }
                };
                enumC7687 = EnumC7687.f25300;
                EnumC7687[] enumC7687Arr2 = new EnumC7687[10];
                enumC7687Arr2[c] = EnumC7687.f25301;
                enumC7687Arr2[1] = EnumC7687.f25341;
                enumC7687Arr2[2] = EnumC7687.f25327;
                enumC7687Arr2[3] = EnumC7687.f25306;
                enumC7687Arr2[4] = EnumC7687.f25323;
                enumC7687Arr2[5] = enumC7687;
                enumC7687Arr2[6] = EnumC7687.f25292;
                enumC7687Arr2[7] = EnumC7687.f25351;
                enumC7687Arr2[8] = EnumC7687.f25308;
                enumC7687Arr2[9] = EnumC7687.f25346;
                m48962(z3, interfaceC14814, enumC7687Arr2);
                if (zM32434 && c13015.m32433(EnumC7687.f25356) && !enumC16305M47630.m38669()) {
                    C25213 c252111 = C13146.f42046;
                    Object[] objArr7 = new Object[2];
                    objArr7[c] = enumC16305M47630;
                    objArr7[1] = enumC16306;
                    c7312.m34529(new C25213("compiler", "option.parameters.unsupported", objArr7));
                }
                if (interfaceC16722M48952.mo6989(EnumC6282.MODULE_SOURCE_PATH) && !c13015.m32427(EnumC7687.f25284, "only") && !interfaceC16722M48952.mo6989(EnumC6282.CLASS_OUTPUT)) {
                    c7312.m34525(C22843.f74147);
                }
                if (interfaceC16722M48952.mo6989(EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH) && interfaceC16722M48952.mo6989(EnumC6282.ANNOTATION_PROCESSOR_PATH)) {
                    c7312.m34525(C22843.f74044);
                }
                if (z && zM32434) {
                    c7312.m34528(enumC19877, C13146.f42057);
                }
                enumC21704M47626 = EnumC20820.m47626(enumC20820M47624);
                strM32423 = c13015.m32423(enumC7687);
                if (strM32423 != null) {
                    patternMo10553 = enumC7687.mo10552();
                    strArrSplit4 = strM32423.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length4 = strArrSplit4.length;
                    i5 = 0;
                    while (i5 < length4) {
                        matcher2 = patternMo10553.matcher(strArrSplit4[i5]);
                        if (matcher2.matches()) {
                            strGroup2 = matcher2.group(1);
                            if (!EnumC21704.m49273(strGroup2, enumC21704M47626)) {
                                c7312.m34529(C13146.m32679(EnumC7687.f25300, strGroup2));
                            }
                            strGroup3 = matcher2.group(2);
                            if (!EnumC21704.m49273(strGroup3, enumC21704M47626)) {
                                c7312.m34529(C13146.m32679(EnumC7687.f25300, strGroup3));
                            }
                            str5 = str;
                            strArrSplit5 = matcher2.group(3).split(str5);
                            length5 = strArrSplit5.length;
                            i7 = 0;
                            while (true) {
                                pattern = patternMo10553;
                                if (i7 < length5) {
                                    break;
                                }
                                str6 = strArrSplit5[i7];
                                str6.getClass();
                                if (str6.equals("ALL-UNNAMED")) {
                                    i8 = length4;
                                    obj4 = obj;
                                } else {
                                    i8 = length4;
                                    obj4 = obj;
                                    if (str6.equals(obj4) && !EnumC21704.m49273(str6, enumC21704M47626)) {
                                        c7312.m34529(C13146.m32679(EnumC7687.f25300, str6));
                                    }
                                    i7++;
                                    strArrSplit5 = strArrSplit5;
                                    patternMo10553 = pattern;
                                    obj = obj4;
                                    length4 = i8;
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo10553 = pattern;
                                obj = obj4;
                                length4 = i8;
                            }
                            i6 = length4;
                            obj3 = obj;
                        } else {
                            i6 = length4;
                            obj3 = obj;
                            str5 = str;
                            pattern = patternMo10553;
                        }
                        i5++;
                        obj = obj3;
                        patternMo10553 = pattern;
                        strArrSplit4 = strArrSplit4;
                        length4 = i6;
                        str = str5;
                    }
                }
                obj2 = obj;
                str2 = str;
                strM32424 = c13015.m32423(EnumC7687.f25323);
                if (strM32424 != null) {
                    strArrSplit3 = strM32424.split(str2);
                    i4 = 0;
                    for (length3 = strArrSplit3.length; i4 < length3; length3 = length3) {
                        str4 = strArrSplit3[i4];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1057501189:
                                strArr = strArrSplit3;
                                if (str4.equals("ALL-SYSTEM")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 0:
                                strArr = strArrSplit3;
                                if (str4.equals(obj2)) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1070226586:
                                strArr = strArrSplit3;
                                if (str4.equals("ALL-MODULE-PATH")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                strArr = strArrSplit3;
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (!EnumC21704.m49273(str4, enumC21704M47626)) {
                                    C11040 c11045 = C22843.f74058;
                                    Object[] objArr8 = new Object[2];
                                    objArr8[c] = EnumC7687.f25323;
                                    objArr8[1] = str4;
                                    c7312.m34525(new C11040("compiler", "bad.name.for.option", objArr8));
                                    break;
                                }
                            case 0:
                            case 1:
                            case 2:
                                break;
                        }
                        i4++;
                        strArrSplit3 = strArr;
                    }
                }
                enumC7688 = EnumC7687.f25351;
                strM32425 = c13015.m32423(enumC7688);
                if (strM32425 != null) {
                    patternMo10552 = enumC7688.mo10552();
                    strArrSplit = strM32425.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length = strArrSplit.length;
                    i2 = 0;
                    while (i2 < length) {
                        matcher = patternMo10552.matcher(strArrSplit[i2]);
                        if (matcher.matches()) {
                            strGroup = matcher.group(1);
                            if (!EnumC21704.m49273(strGroup, enumC21704M47626)) {
                                c7312.m34529(C13146.m32679(EnumC7687.f25351, strGroup));
                            }
                            strArrSplit2 = matcher.group(2).split(str2, -1);
                            length2 = strArrSplit2.length;
                            i3 = 0;
                            while (i3 < length2) {
                                int i9 = length2;
                                str3 = strArrSplit2[i3];
                                str3.getClass();
                                if (str3.equals("ALL-UNNAMED") && !str3.equals(obj2) && !EnumC21704.m49273(str3, enumC21704M47626)) {
                                    c7312.m34529(C13146.m32679(EnumC7687.f25351, str3));
                                }
                                i3++;
                                length2 = i9;
                                strArrSplit2 = strArrSplit2;
                            }
                        } else {
                            strArrSplit = strArrSplit;
                        }
                        i2++;
                        patternMo10552 = patternMo10552;
                        strArrSplit = strArrSplit;
                    }
                }
                strM32426 = c13015.m32423(EnumC7687.f25308);
                if (strM32426 != null) {
                    for (String str13 : strM32426.split(str2)) {
                        str13.getClass();
                        if (str13.equals(obj2) && !EnumC21704.m49273(str13, enumC21704M47626)) {
                            C11040 c11046 = C22843.f74058;
                            Object[] objArr9 = new Object[2];
                            objArr9[c] = EnumC7687.f25308;
                            objArr9[1] = str13;
                            c7312.m34525(new C11040("compiler", "bad.name.for.option", objArr9));
                        }
                    }
                }
                enumC7689 = EnumC7687.f25315;
                strM32427 = c13015.m32423(enumC7689);
                if (strM32427 != null && !EnumC21704.m49273(strM32427, enumC21704M47626)) {
                    C11040 c11047 = C22843.f74058;
                    Object[] objArr10 = new Object[2];
                    objArr10[c] = enumC7689;
                    objArr10[1] = strM32427;
                    c7312.m34525(new C11040("compiler", "bad.name.for.option", objArr10));
                }
                if (zM32434 && c13015.m32433(EnumC7687.f25292)) {
                    c7312.m34528(EnumC19876.OPTIONS, C13146.f42046);
                }
                if (this.f68780 && c7312.f24079 == 0) {
                    return true;
                }
                return c;
            }
            z = false;
            enumC16305 = EnumC16305.f52942;
            if (enumC16305M47630.compareTo(enumC16305) < 0) {
                C11040 c11048 = C22843.f74058;
                Object[] objArr11 = new Object[2];
                objArr11[c] = enumC16305M47630;
                objArr11[1] = enumC16305;
                c7312.m34525(new C11040("compiler", "option.removed.target", objArr11));
            } else if (enumC16305M47630 == enumC16305) {
                C25213 c252112 = C13146.f42046;
                Object[] objArr12 = new Object[1];
                objArr12[c] = enumC16305M47630;
                c7312.m34528(enumC19877, new C25213("compiler", "option.obsolete.target", objArr12));
                z = true;
            }
            enumC16306 = EnumC16305.JDK1_8;
            if (enumC16305M47630.compareTo(enumC16306) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC14813 interfaceC14815 = new InterfaceC14813() { // from class: l.ۗ᩵ۘ
                @Override // l.InterfaceC14813
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo11778(EnumC7687 enumC76814) {
                    C11040 c11049 = C22843.f74058;
                    this.f12436.m48961(new C11040("compiler", "option.not.allowed.with.target", enumC76814, enumC16305M47630));
                }
            };
            str = ",";
            EnumC7687[] enumC7687Arr3 = new EnumC7687[9];
            enumC7687Arr3[c] = EnumC7687.f25354;
            enumC7687Arr3[1] = EnumC7687.f25307;
            enumC7687Arr3[2] = EnumC7687.f25309;
            enumC7687Arr3[3] = EnumC7687.f25287;
            enumC7687Arr3[4] = EnumC7687.f25318;
            enumC7687Arr3[5] = EnumC7687.f25331;
            enumC7687Arr3[6] = EnumC7687.f25298;
            enumC7687Arr3[7] = EnumC7687.f25357;
            enumC7687Arr3[8] = enumC76812;
            m48962(z2, interfaceC14815, enumC7687Arr3);
            if (enumC16305M47630.compareTo(EnumC16305.JDK1_9) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC14813 interfaceC14816 = new InterfaceC14813() { // from class: l.᩵᩵ۘ
                @Override // l.InterfaceC14813
                /* JADX INFO: renamed from: ۙ */
                public final void mo11778(EnumC7687 enumC76814) {
                    C11040 c11049 = C22843.f74058;
                    this.f66582.m48961(new C11040("compiler", "option.not.allowed.with.target", enumC76814, enumC16305M47630));
                }
            };
            enumC7687 = EnumC7687.f25300;
            EnumC7687[] enumC7687Arr4 = new EnumC7687[10];
            enumC7687Arr4[c] = EnumC7687.f25301;
            enumC7687Arr4[1] = EnumC7687.f25341;
            enumC7687Arr4[2] = EnumC7687.f25327;
            enumC7687Arr4[3] = EnumC7687.f25306;
            enumC7687Arr4[4] = EnumC7687.f25323;
            enumC7687Arr4[5] = enumC7687;
            enumC7687Arr4[6] = EnumC7687.f25292;
            enumC7687Arr4[7] = EnumC7687.f25351;
            enumC7687Arr4[8] = EnumC7687.f25308;
            enumC7687Arr4[9] = EnumC7687.f25346;
            m48962(z3, interfaceC14816, enumC7687Arr4);
            if (zM32434) {
                C25213 c252113 = C13146.f42046;
                Object[] objArr13 = new Object[2];
                objArr13[c] = enumC16305M47630;
                objArr13[1] = enumC16306;
                c7312.m34529(new C25213("compiler", "option.parameters.unsupported", objArr13));
            }
            if (interfaceC16722M48952.mo6989(EnumC6282.MODULE_SOURCE_PATH)) {
                c7312.m34525(C22843.f74147);
            }
            if (interfaceC16722M48952.mo6989(EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH)) {
                c7312.m34525(C22843.f74044);
            }
            if (z) {
                c7312.m34528(enumC19877, C13146.f42057);
            }
            enumC21704M47626 = EnumC20820.m47626(enumC20820M47624);
            strM32423 = c13015.m32423(enumC7687);
            if (strM32423 != null) {
                patternMo10553 = enumC7687.mo10552();
                strArrSplit4 = strM32423.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length4 = strArrSplit4.length;
                i5 = 0;
                while (i5 < length4) {
                    matcher2 = patternMo10553.matcher(strArrSplit4[i5]);
                    if (matcher2.matches()) {
                        strGroup2 = matcher2.group(1);
                        if (!EnumC21704.m49273(strGroup2, enumC21704M47626)) {
                            c7312.m34529(C13146.m32679(EnumC7687.f25300, strGroup2));
                        }
                        strGroup3 = matcher2.group(2);
                        if (!EnumC21704.m49273(strGroup3, enumC21704M47626)) {
                            c7312.m34529(C13146.m32679(EnumC7687.f25300, strGroup3));
                        }
                        str5 = str;
                        strArrSplit5 = matcher2.group(3).split(str5);
                        length5 = strArrSplit5.length;
                        i7 = 0;
                        while (true) {
                            pattern = patternMo10553;
                            if (i7 < length5) {
                                break;
                                break;
                            }
                            str6 = strArrSplit5[i7];
                            str6.getClass();
                            if (str6.equals("ALL-UNNAMED")) {
                                i8 = length4;
                                obj4 = obj;
                                if (str6.equals(obj4)) {
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo10553 = pattern;
                                obj = obj4;
                                length4 = i8;
                            } else {
                                i8 = length4;
                                obj4 = obj;
                            }
                            i7++;
                            strArrSplit5 = strArrSplit5;
                            patternMo10553 = pattern;
                            obj = obj4;
                            length4 = i8;
                        }
                        i6 = length4;
                        obj3 = obj;
                    } else {
                        i6 = length4;
                        obj3 = obj;
                        str5 = str;
                        pattern = patternMo10553;
                    }
                    i5++;
                    obj = obj3;
                    patternMo10553 = pattern;
                    strArrSplit4 = strArrSplit4;
                    length4 = i6;
                    str = str5;
                }
            }
            obj2 = obj;
            str2 = str;
            strM32424 = c13015.m32423(EnumC7687.f25323);
            if (strM32424 != null) {
                strArrSplit3 = strM32424.split(str2);
                i4 = 0;
                while (i4 < length3) {
                    str4 = strArrSplit3[i4];
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1057501189:
                            strArr = strArrSplit3;
                            if (str4.equals("ALL-SYSTEM")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 0:
                            strArr = strArrSplit3;
                            if (str4.equals(obj2)) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 1070226586:
                            strArr = strArrSplit3;
                            if (str4.equals("ALL-MODULE-PATH")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        default:
                            strArr = strArrSplit3;
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (!EnumC21704.m49273(str4, enumC21704M47626)) {
                                C11040 c11049 = C22843.f74058;
                                Object[] objArr14 = new Object[2];
                                objArr14[c] = EnumC7687.f25323;
                                objArr14[1] = str4;
                                c7312.m34525(new C11040("compiler", "bad.name.for.option", objArr14));
                                break;
                            }
                        case 0:
                        case 1:
                        case 2:
                            break;
                    }
                    i4++;
                    strArrSplit3 = strArr;
                }
            }
            enumC7688 = EnumC7687.f25351;
            strM32425 = c13015.m32423(enumC7688);
            if (strM32425 != null) {
                patternMo10552 = enumC7688.mo10552();
                strArrSplit = strM32425.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length = strArrSplit.length;
                i2 = 0;
                while (i2 < length) {
                    matcher = patternMo10552.matcher(strArrSplit[i2]);
                    if (matcher.matches()) {
                        strGroup = matcher.group(1);
                        if (!EnumC21704.m49273(strGroup, enumC21704M47626)) {
                            c7312.m34529(C13146.m32679(EnumC7687.f25351, strGroup));
                        }
                        strArrSplit2 = matcher.group(2).split(str2, -1);
                        length2 = strArrSplit2.length;
                        i3 = 0;
                        while (i3 < length2) {
                            int i10 = length2;
                            str3 = strArrSplit2[i3];
                            str3.getClass();
                            if (str3.equals("ALL-UNNAMED")) {
                            }
                            i3++;
                            length2 = i10;
                            strArrSplit2 = strArrSplit2;
                        }
                    } else {
                        strArrSplit = strArrSplit;
                    }
                    i2++;
                    patternMo10552 = patternMo10552;
                    strArrSplit = strArrSplit;
                }
            }
            strM32426 = c13015.m32423(EnumC7687.f25308);
            if (strM32426 != null) {
                while (i < r4) {
                    str13.getClass();
                    if (str13.equals(obj2)) {
                    }
                }
            }
            enumC7689 = EnumC7687.f25315;
            strM32427 = c13015.m32423(enumC7689);
            if (strM32427 != null) {
                C11040 c110410 = C22843.f74058;
                Object[] objArr15 = new Object[2];
                objArr15[c] = enumC7689;
                objArr15[1] = strM32427;
                c7312.m34525(new C11040("compiler", "bad.name.for.option", objArr15));
            }
            if (zM32434) {
                c7312.m34528(EnumC19876.OPTIONS, C13146.f42046);
            }
            if (this.f68780) {
            }
            return c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m48965() {
        LinkedHashSet linkedHashSet = this.f68774;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        HashSet hashSet = this.f68776;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = this.f68775;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m48967() {
        return this.f68784;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Set m48966() {
        String strM32423 = this.f68785.m32423(EnumC7687.f25330);
        if (strM32423 == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strM32423.split("\\x00")) {
            linkedHashSet.add(C14769.m35542((Object[]) str.split("\\s+")));
        }
        return C4681.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m48963() {
        EnumC7687 enumC7687 = EnumC7687.f25293;
        C13015 c13015 = this.f68785;
        String strM32423 = c13015.m32423(enumC7687);
        String strM32424 = c13015.m32423(EnumC7687.f25352);
        if (strM32423 == null && strM32424 == null) {
            return C14769.m35543();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strM32423 != null) {
            linkedHashSet.add("-Xmsgs");
        }
        if (strM32424 != null) {
            for (String str : strM32424.split("\\s+")) {
                if (!str.isEmpty()) {
                    linkedHashSet.add("-Xmsgs:".concat(str));
                }
            }
        }
        if (linkedHashSet.equals(Collections.singleton("-Xmsgs:none"))) {
            return C14769.m35543();
        }
        String strM32425 = c13015.m32423(EnumC7687.f25313);
        if (strM32425 != null) {
            linkedHashSet.add("-XcheckPackage:".concat(strM32425));
        }
        return C14769.m35542(linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48951(EnumC7687 enumC7687) {
        String strM32423 = this.f68785.m32423(enumC7687);
        if (strM32423 != null) {
            InterfaceC24329 interfaceC24329 = C14631.get(strM32423, new String[0]);
            if (C3445.exists(interfaceC24329, new EnumC20599[0]) && !C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
                C11040 c11040 = C22843.f74058;
                m48961(new C11040("compiler", "file.not.directory", strM32423));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48962(boolean z, final InterfaceC14813 interfaceC14813, EnumC7687... enumC7687Arr) {
        if (z) {
            return;
        }
        InterfaceC20670 interfaceC20670Of = C23654.of((Object[]) enumC7687Arr);
        C13015 c13015 = this.f68785;
        C17359.requireNonNull(c13015);
        interfaceC20670Of.filter(new C19641(1, c13015)).forEach(new Consumer() { // from class: l.ۛ᩵ۘ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                interfaceC14813.mo11778((EnumC7687) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48961(AbstractC13695 abstractC13695) {
        this.f68780 = true;
        int iOrdinal = this.f68782.ordinal();
        C7312 c7312 = this.f68778;
        if (iOrdinal == 0) {
            throw new C17490(new IllegalArgumentException(c7312.m20033(abstractC13695)));
        }
        if (iOrdinal == 1) {
            throw new C17490(new IllegalStateException(c7312.m20033(abstractC13695)));
        }
        if (iOrdinal != 2) {
            return;
        }
        m48957(abstractC13695);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48957(AbstractC13695 abstractC13695) {
        boolean z = abstractC13695 instanceof C11040;
        C7312 c7312 = this.f68778;
        if (z) {
            c7312.m34525((C11040) abstractC13695);
        } else if (abstractC13695 instanceof C25213) {
            c7312.m34529((C25213) abstractC13695);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private InterfaceC16722 m48952() {
        if (this.f68779 == null) {
            this.f68779 = (InterfaceC16722) this.f68777.m14642(InterfaceC16722.class);
        }
        return this.f68779;
    }
}
