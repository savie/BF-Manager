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
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܶ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A7L3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15539 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C16576 f50575 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC13464 f50576;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f50577;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f50578;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f50579;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC7071 f50580;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20414 f50581;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12343 f50582;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashSet f50583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC10558 f50584 = new C4248(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f50585;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50586;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14770 f50587;

    public C15539(C12343 c12343) {
        c12343.m30659(f50575, this);
        this.f50587 = C14770.m35395(c12343);
        this.f50581 = C20414.m46161(c12343);
        this.f50582 = c12343;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37170(ArrayList arrayList) {
        this.f50585 = "javac";
        this.f50580 = EnumC7071.LOG;
        this.f50578 = new LinkedHashSet();
        this.f50577 = new LinkedHashMap();
        this.f50583 = null;
        this.f50579 = new LinkedHashSet();
        Set setM44877 = EnumC19730.m44877();
        AbstractC10558 abstractC10558 = this.f50584;
        if (m37159(arrayList, setM44877, abstractC10558)) {
            EnumC19730 enumC19730 = EnumC19730.f63388;
            C14770 c14770 = this.f50587;
            String strM35398 = c14770.m35398(enumC19730);
            boolean z = strM35398 == null;
            InterfaceC23300 interfaceC23300 = new InterfaceC23300() { // from class: l.᩹᩺۟
                @Override // l.InterfaceC23300
                /* JADX INFO: renamed from: ۙ */
                public final void mo8592(EnumC19730 enumC19731) {
                    C5909 c5909 = C23879.f77204;
                    this.f73636.m37171(new C5909("compiler", "release.bootclasspath.conflict", enumC19731));
                }
            };
            EnumC19730 enumC19731 = EnumC19730.f63357;
            EnumC19730 enumC19732 = EnumC19730.f63392;
            m37172(z, interfaceC23300, EnumC19730.f63327, EnumC19730.f63405, EnumC19730.f63373, EnumC19730.f63326, EnumC19730.f63351, EnumC19730.f63383, EnumC19730.f63356, EnumC19730.f63386, enumC19731, enumC19732, EnumC19730.f63378, EnumC19730.f63320);
            if (strM35398 != null) {
                InterfaceC23858 interfaceC23858M13412 = C4828.m13412(strM35398);
                if (interfaceC23858M13412 == null) {
                    C5909 c5909 = C23879.f77204;
                    m37171(new C5909("compiler", "unsupported.release.version", strM35398));
                } else {
                    c14770.m35403(enumC19731, interfaceC23858M13412.m52586());
                    c14770.m35403(enumC19732, interfaceC23858M13412.m52587());
                    C12343 c12343 = this.f50582;
                    c12343.m30657(InterfaceC23858.class, interfaceC23858M13412);
                    if (m37159(interfaceC23858M13412.m52584(), setM44877, abstractC10558)) {
                        C19772.m44965(c12343, interfaceC23858M13412.m52583(), m37163());
                        c14770.m35406();
                    }
                }
            } else {
                c14770.m35406();
            }
        }
        if (this.f50586) {
            this.f50581.m46188(EnumC21119.JAVAC, "msg.usage", "javac");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m37168() {
        if (this.f50583 == null) {
            this.f50583 = new LinkedHashSet();
        }
        if (this.f50578 != null) {
            Iterator it = ((C14315) m37163()).m34546(this.f50578).iterator();
            while (it.hasNext()) {
                this.f50583.add((InterfaceC2173) it.next());
            }
        }
        return this.f50583;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m37169() {
        return this.f50579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37159(Iterable iterable, Set set, AbstractC10558 abstractC10558) {
        EnumC19730 enumC19730M44860;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.isEmpty()) {
                C5909 c5909 = C23879.f77204;
                m37171(new C5909("compiler", "invalid.flag", str));
                return false;
            }
            if (str.startsWith("-")) {
                enumC19730M44860 = EnumC19730.m44860(str, set);
            } else {
                enumC19730M44860 = EnumC19730.f63348;
                if (!enumC19730M44860.mo2369(str)) {
                    enumC19730M44860 = null;
                }
            }
            if (enumC19730M44860 != null) {
                try {
                    enumC19730M44860.m44882(abstractC10558, str, it);
                } catch (C21846 e) {
                    String message = e.getMessage();
                    this.f50586 = true;
                    int iOrdinal = this.f50580.ordinal();
                    if (iOrdinal == 0) {
                        throw new C11802(new IllegalArgumentException(message, e.getCause()));
                    }
                    if (iOrdinal == 1) {
                        throw new C11802(new IllegalStateException(message, e.getCause()));
                    }
                    if (iOrdinal == 2) {
                        this.f50581.m46173(message);
                    }
                    return false;
                }
            } else {
                C5909 c59010 = C23879.f77204;
                m37171(new C5909("compiler", "invalid.flag", str));
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
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m37167() {
        EnumC11909 enumC11909M29705;
        final EnumC14128 enumC14128M29710;
        char c;
        Object obj;
        boolean z;
        EnumC14128 enumC14128;
        EnumC14128 enumC14129;
        boolean z2;
        String str;
        boolean z3;
        EnumC19730 enumC19730;
        EnumC12508 enumC12508M29707;
        String strM35398;
        Object obj2;
        String str2;
        String strM35399;
        EnumC19730 enumC19731;
        String strM353910;
        String strM353911;
        EnumC19730 enumC19732;
        String strM353912;
        int i;
        Pattern patternMo4848;
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
        Pattern patternMo4849;
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
        InterfaceC3800 parent;
        InterfaceC13464 interfaceC13464M37163 = m37163();
        EnumC19730 enumC19733 = EnumC19730.f63372;
        C14770 c14770 = this.f50587;
        boolean zM35408 = c14770.m35408(enumC19733);
        C20414 c20414 = this.f50581;
        if (zM35408) {
            if (!interfaceC13464M37163.mo32953(EnumC3584.CLASS_OUTPUT)) {
                c20414.m48197(C23879.f77174);
            } else if (!interfaceC13464M37163.mo32953(EnumC3584.MODULE_SOURCE_PATH)) {
                c20414.m48197(C23879.f77214);
            } else {
                try {
                    for (String str7 : Arrays.asList(c14770.m35398(enumC19733).split(","))) {
                        InterfaceC4290 interfaceC4290Mo32957 = interfaceC13464M37163.mo32957(EnumC3584.MODULE_SOURCE_PATH, str7);
                        if (interfaceC4290Mo32957 == null) {
                            C5909 c5909 = C23879.f77204;
                            c20414.m48197(new C5909("compiler", "module.not.found.in.module.source.path", str7));
                        } else {
                            InterfaceC4290 interfaceC4290Mo32958 = interfaceC13464M37163.mo32957(EnumC3584.CLASS_OUTPUT, str7);
                            for (InterfaceC2173 interfaceC2173 : interfaceC13464M37163.mo32947(interfaceC4290Mo32957, "", (Set) EnumSet.of(EnumC11347.SOURCE), true)) {
                                InterfaceC2173 interfaceC2173Mo32950 = interfaceC13464M37163.mo32950(interfaceC4290Mo32958, interfaceC13464M37163.mo32948(interfaceC4290Mo32957, interfaceC2173), EnumC11347.CLASS);
                                if (interfaceC2173Mo32950 == null || interfaceC2173Mo32950.mo10163() < interfaceC2173.mo10163()) {
                                    if (this.f50583 == null) {
                                        this.f50583 = new HashSet();
                                    }
                                    this.f50583.add(interfaceC2173);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    c20414.m46188(EnumC21119.JAVAC, "msg.io", new Object[0]);
                    e.printStackTrace(c20414.m46169(EnumC16181.NOTICE));
                    return false;
                }
            }
        }
        if (m37176()) {
            if (c14770.m35408(EnumC19730.f63379) || c14770.m35408(EnumC19730.f63359) || c14770.m35408(EnumC19730.f63363) || c14770.m35408(EnumC19730.f63364) || c14770.m35408(EnumC19730.f63347) || c14770.m35408(EnumC19730.f63372)) {
                return true;
            }
            if (!this.f50586) {
                if (C16949.m39708(c14770)) {
                    m37171(C23879.f77317);
                    return false;
                }
                m37171(C23879.f77311);
                return false;
            }
        } else if (m37160(EnumC19730.f63321) && m37160(EnumC19730.f63350) && m37160(EnumC19730.f63319)) {
            if (interfaceC13464M37163 instanceof InterfaceC0762) {
                InterfaceC0762 interfaceC0762 = (InterfaceC0762) interfaceC13464M37163;
                EnumC3584 enumC3584 = EnumC3584.CLASS_OUTPUT;
                if (interfaceC0762.mo32953(enumC3584)) {
                    InterfaceC3800 interfaceC3800 = (InterfaceC3800) interfaceC0762.mo3278(enumC3584).iterator().next();
                    if (interfaceC0762.mo32953(EnumC3584.MODULE_SOURCE_PATH)) {
                        if (C5212.exists(interfaceC3800.resolve("module-info.class"), new EnumC22146[0])) {
                            C5909 c59010 = C23879.f77204;
                            c20414.m48197(new C5909("compiler", "multi-module.outdir.cannot.be.exploded.module", interfaceC3800));
                        }
                    } else {
                        EnumC19730 enumC19734 = EnumC19730.f63399;
                        StringBuilder sb = new StringBuilder("-");
                        EnumC0597 enumC0597 = EnumC0597.PATH;
                        sb.append(enumC0597.f2616);
                        if (c14770.m35409(enumC19734, sb.toString()) && (parent = interfaceC3800.getParent()) != null && C5212.exists(parent.resolve("module-info.class"), new EnumC22146[0])) {
                            C14065 c14065 = C9768.f32836;
                            c20414.m48195(enumC0597, new C14065("compiler", "outdir.is.in.exploded.module", interfaceC3800));
                        }
                    }
                }
            }
            String strM353913 = c14770.m35398(EnumC19730.f63357);
            if (strM353913 != null) {
                enumC11909M29705 = EnumC11909.m29705(strM353913);
            } else {
                enumC11909M29705 = EnumC11909.f39952;
            }
            String strM353914 = c14770.m35398(EnumC19730.f63392);
            if (strM353914 != null) {
                enumC14128M29710 = EnumC14128.m34158(strM353914);
            } else {
                enumC14128M29710 = EnumC14128.f46376;
            }
            if (Character.isDigit(enumC14128M29710.f46387.charAt(0)) && enumC14128M29710.compareTo(enumC11909M29705.m29710()) < 0) {
                if (strM353914 != null) {
                    if (strM353913 == null) {
                        EnumC14128 enumC14128M29711 = enumC11909M29705.m29710();
                        C14065 c14066 = C9768.f32836;
                        m37171(new C14065("compiler", "target.default.source.conflict", strM353914, enumC14128M29711));
                        return false;
                    }
                    EnumC14128 enumC14128M29712 = enumC11909M29705.m29710();
                    C14065 c14067 = C9768.f32836;
                    m37171(new C14065("compiler", "source.target.conflict", strM353913, enumC14128M29712));
                    return false;
                }
                enumC14128M29710 = enumC11909M29705.m29710();
                c14770.m35401("-target", enumC14128M29710.f46387);
            }
            if (c14770.m35408(EnumC19730.f63323)) {
                if (strM353913 == null) {
                    m37165(C23879.f77256);
                    return false;
                }
                EnumC11909 enumC11909 = EnumC11909.f39952;
                if (enumC11909M29705 != enumC11909) {
                    C5909 c59011 = C23879.f77204;
                    m37165(new C5909("compiler", "preview.not.latest", strM353913, enumC11909));
                    return false;
                }
            }
            EnumC19730 enumC19735 = EnumC19730.f63397;
            String strM353915 = c14770.m35398(enumC19735);
            if (strM353915 != null) {
                EnumC23528 enumC23528M51834 = EnumC23528.m51834(strM353915);
                if (enumC14128M29710.compareTo(EnumC14128.JDK1_8) > 0 || enumC23528M51834.mo27147(enumC14128M29710)) {
                    c2 = 0;
                } else {
                    C14065 c14068 = C9768.f32836;
                    c2 = 0;
                    m37171(new C14065("compiler", "profile.target.conflict", enumC23528M51834, enumC14128M29710));
                }
                if (c14770.m35398(EnumC19730.f63327) != null) {
                    m37171(C23879.f77185);
                }
                c = c2;
            } else {
                c = 0;
            }
            if (c14770.m35408(EnumC19730.f63394) && c14770.m35408(EnumC19730.f63354)) {
                m37171(C23879.f77314);
            }
            EnumC19730 enumC19736 = EnumC19730.f63399;
            StringBuilder sb2 = new StringBuilder("-");
            EnumC0597 enumC0598 = EnumC0597.OPTIONS;
            sb2.append(enumC0598.f2616);
            boolean zM35409 = c14770.m35409(enumC19736, sb2.toString());
            if (zM35409 && enumC11909M29705.compareTo(EnumC11909.f39952) < 0 && !c14770.m35408(EnumC19730.f63388) && (interfaceC13464M37163 instanceof AbstractC3729)) {
                AbstractC3729 abstractC3729 = (AbstractC3729) interfaceC13464M37163;
                if (enumC11909M29705.compareTo(EnumC11909.JDK8) <= 0) {
                    if (abstractC3729.m10920()) {
                        String str8 = enumC11909M29705.f39974;
                        C14065 c14069 = C9768.f32836;
                        Object[] objArr = new Object[1];
                        objArr[c] = str8;
                        c20414.m48195(enumC0598, new C14065("compiler", "source.no.bootclasspath", objArr));
                    }
                } else if (abstractC3729.m10911()) {
                    String str9 = enumC11909M29705.f39974;
                    C14065 c140610 = C9768.f32836;
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = str9;
                    c20414.m48195(enumC0598, new C14065("compiler", "source.no.system.modules.path", objArr2));
                }
            }
            EnumC11909 enumC119010 = EnumC11909.f39966;
            if (enumC11909M29705.compareTo(enumC119010) < 0) {
                String str10 = enumC11909M29705.f39974;
                String str11 = enumC119010.f39974;
                C5909 c59012 = C23879.f77204;
                obj = "";
                Object[] objArr3 = new Object[2];
                objArr3[c] = str10;
                objArr3[1] = str11;
                c20414.m48197(new C5909("compiler", "option.removed.source", objArr3));
            } else {
                obj = "";
                if (enumC11909M29705 == enumC119010 && zM35409) {
                    String str12 = enumC11909M29705.f39974;
                    C14065 c140611 = C9768.f32836;
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = str12;
                    c20414.m48195(enumC0598, new C14065("compiler", "option.obsolete.source", objArr4));
                    z = true;
                }
                enumC14128 = EnumC14128.f46385;
                if (enumC14128M29710.compareTo(enumC14128) < 0) {
                    C5909 c59013 = C23879.f77204;
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = enumC14128M29710;
                    objArr5[1] = enumC14128;
                    c20414.m48197(new C5909("compiler", "option.removed.target", objArr5));
                } else if (enumC14128M29710 == enumC14128 && zM35409) {
                    C14065 c140612 = C9768.f32836;
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = enumC14128M29710;
                    c20414.m48195(enumC0598, new C14065("compiler", "option.obsolete.target", objArr6));
                    z = true;
                }
                enumC14129 = EnumC14128.JDK1_8;
                if (enumC14128M29710.compareTo(enumC14129) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InterfaceC23300 interfaceC23300 = new InterfaceC23300() { // from class: l.ۖ᩺۟
                    @Override // l.InterfaceC23300
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo8592(EnumC19730 enumC19737) {
                        C5909 c59014 = C23879.f77204;
                        this.f10743.m37171(new C5909("compiler", "option.not.allowed.with.target", enumC19737, enumC14128M29710));
                    }
                };
                str = ",";
                EnumC19730[] enumC19730Arr = new EnumC19730[9];
                enumC19730Arr[c] = EnumC19730.f63327;
                enumC19730Arr[1] = EnumC19730.f63326;
                enumC19730Arr[2] = EnumC19730.f63405;
                enumC19730Arr[3] = EnumC19730.f63373;
                enumC19730Arr[4] = EnumC19730.f63351;
                enumC19730Arr[5] = EnumC19730.f63383;
                enumC19730Arr[6] = EnumC19730.f63356;
                enumC19730Arr[7] = EnumC19730.f63386;
                enumC19730Arr[8] = enumC19735;
                m37172(z2, interfaceC23300, enumC19730Arr);
                if (enumC14128M29710.compareTo(EnumC14128.JDK1_9) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                InterfaceC23300 interfaceC23301 = new InterfaceC23300() { // from class: l.ۚ᩺۟
                    @Override // l.InterfaceC23300
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo8592(EnumC19730 enumC19737) {
                        C5909 c59014 = C23879.f77204;
                        this.f19339.m37171(new C5909("compiler", "option.not.allowed.with.target", enumC19737, enumC14128M29710));
                    }
                };
                enumC19730 = EnumC19730.f63353;
                EnumC19730[] enumC19730Arr2 = new EnumC19730[10];
                enumC19730Arr2[c] = EnumC19730.f63354;
                enumC19730Arr2[1] = EnumC19730.f63320;
                enumC19730Arr2[2] = EnumC19730.f63378;
                enumC19730Arr2[3] = EnumC19730.f63325;
                enumC19730Arr2[4] = EnumC19730.f63330;
                enumC19730Arr2[5] = enumC19730;
                enumC19730Arr2[6] = EnumC19730.f63336;
                enumC19730Arr2[7] = EnumC19730.f63368;
                enumC19730Arr2[8] = EnumC19730.f63404;
                enumC19730Arr2[9] = EnumC19730.f63341;
                m37172(z3, interfaceC23301, enumC19730Arr2);
                if (zM35409 && c14770.m35408(EnumC19730.f63329) && !enumC14128M29710.m34167()) {
                    C14065 c140613 = C9768.f32836;
                    Object[] objArr7 = new Object[2];
                    objArr7[c] = enumC14128M29710;
                    objArr7[1] = enumC14129;
                    c20414.m48201(new C14065("compiler", "option.parameters.unsupported", objArr7));
                }
                if (interfaceC13464M37163.mo32953(EnumC3584.MODULE_SOURCE_PATH) && !c14770.m35402(EnumC19730.f63335, "only") && !interfaceC13464M37163.mo32953(EnumC3584.CLASS_OUTPUT)) {
                    c20414.m48197(C23879.f77290);
                }
                if (interfaceC13464M37163.mo32953(EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH) && interfaceC13464M37163.mo32953(EnumC3584.ANNOTATION_PROCESSOR_PATH)) {
                    c20414.m48197(C23879.f77284);
                }
                if (z && zM35409) {
                    c20414.m48195(enumC0598, C9768.f32853);
                }
                enumC12508M29707 = EnumC11909.m29707(enumC11909M29705);
                strM35398 = c14770.m35398(enumC19730);
                if (strM35398 != null) {
                    patternMo4849 = enumC19730.mo4848();
                    strArrSplit4 = strM35398.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length4 = strArrSplit4.length;
                    i5 = 0;
                    while (i5 < length4) {
                        matcher2 = patternMo4849.matcher(strArrSplit4[i5]);
                        if (matcher2.matches()) {
                            strGroup2 = matcher2.group(1);
                            if (!EnumC12508.m31072(strGroup2, enumC12508M29707)) {
                                c20414.m48201(C9768.m24750(EnumC19730.f63353, strGroup2));
                            }
                            strGroup3 = matcher2.group(2);
                            if (!EnumC12508.m31072(strGroup3, enumC12508M29707)) {
                                c20414.m48201(C9768.m24750(EnumC19730.f63353, strGroup3));
                            }
                            str5 = str;
                            strArrSplit5 = matcher2.group(3).split(str5);
                            length5 = strArrSplit5.length;
                            i7 = 0;
                            while (true) {
                                pattern = patternMo4849;
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
                                    if (str6.equals(obj4) && !EnumC12508.m31072(str6, enumC12508M29707)) {
                                        c20414.m48201(C9768.m24750(EnumC19730.f63353, str6));
                                    }
                                    i7++;
                                    strArrSplit5 = strArrSplit5;
                                    patternMo4849 = pattern;
                                    obj = obj4;
                                    length4 = i8;
                                }
                                i7++;
                                strArrSplit5 = strArrSplit5;
                                patternMo4849 = pattern;
                                obj = obj4;
                                length4 = i8;
                            }
                            i6 = length4;
                            obj3 = obj;
                        } else {
                            i6 = length4;
                            obj3 = obj;
                            str5 = str;
                            pattern = patternMo4849;
                        }
                        i5++;
                        obj = obj3;
                        patternMo4849 = pattern;
                        strArrSplit4 = strArrSplit4;
                        length4 = i6;
                        str = str5;
                    }
                }
                obj2 = obj;
                str2 = str;
                strM35399 = c14770.m35398(EnumC19730.f63330);
                if (strM35399 != null) {
                    strArrSplit3 = strM35399.split(str2);
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
                                if (!EnumC12508.m31072(str4, enumC12508M29707)) {
                                    C5909 c59014 = C23879.f77204;
                                    Object[] objArr8 = new Object[2];
                                    objArr8[c] = EnumC19730.f63330;
                                    objArr8[1] = str4;
                                    c20414.m48197(new C5909("compiler", "bad.name.for.option", objArr8));
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
                enumC19731 = EnumC19730.f63368;
                strM353910 = c14770.m35398(enumC19731);
                if (strM353910 != null) {
                    patternMo4848 = enumC19731.mo4848();
                    strArrSplit = strM353910.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                    length = strArrSplit.length;
                    i2 = 0;
                    while (i2 < length) {
                        matcher = patternMo4848.matcher(strArrSplit[i2]);
                        if (matcher.matches()) {
                            strGroup = matcher.group(1);
                            if (!EnumC12508.m31072(strGroup, enumC12508M29707)) {
                                c20414.m48201(C9768.m24750(EnumC19730.f63368, strGroup));
                            }
                            strArrSplit2 = matcher.group(2).split(str2, -1);
                            length2 = strArrSplit2.length;
                            i3 = 0;
                            while (i3 < length2) {
                                int i9 = length2;
                                str3 = strArrSplit2[i3];
                                str3.getClass();
                                if (str3.equals("ALL-UNNAMED") && !str3.equals(obj2) && !EnumC12508.m31072(str3, enumC12508M29707)) {
                                    c20414.m48201(C9768.m24750(EnumC19730.f63368, str3));
                                }
                                i3++;
                                length2 = i9;
                                strArrSplit2 = strArrSplit2;
                            }
                        } else {
                            strArrSplit = strArrSplit;
                        }
                        i2++;
                        patternMo4848 = patternMo4848;
                        strArrSplit = strArrSplit;
                    }
                }
                strM353911 = c14770.m35398(EnumC19730.f63404);
                if (strM353911 != null) {
                    for (String str13 : strM353911.split(str2)) {
                        str13.getClass();
                        if (str13.equals(obj2) && !EnumC12508.m31072(str13, enumC12508M29707)) {
                            C5909 c59015 = C23879.f77204;
                            Object[] objArr9 = new Object[2];
                            objArr9[c] = EnumC19730.f63404;
                            objArr9[1] = str13;
                            c20414.m48197(new C5909("compiler", "bad.name.for.option", objArr9));
                        }
                    }
                }
                enumC19732 = EnumC19730.f63344;
                strM353912 = c14770.m35398(enumC19732);
                if (strM353912 != null && !EnumC12508.m31072(strM353912, enumC12508M29707)) {
                    C5909 c59016 = C23879.f77204;
                    Object[] objArr10 = new Object[2];
                    objArr10[c] = enumC19732;
                    objArr10[1] = strM353912;
                    c20414.m48197(new C5909("compiler", "bad.name.for.option", objArr10));
                }
                if (zM35409 && c14770.m35408(EnumC19730.f63336)) {
                    c20414.m48195(EnumC0597.OPTIONS, C9768.f32836);
                }
                if (this.f50586 && c20414.f66177 == 0) {
                    return true;
                }
                return c;
            }
            z = false;
            enumC14128 = EnumC14128.f46385;
            if (enumC14128M29710.compareTo(enumC14128) < 0) {
                C5909 c59017 = C23879.f77204;
                Object[] objArr11 = new Object[2];
                objArr11[c] = enumC14128M29710;
                objArr11[1] = enumC14128;
                c20414.m48197(new C5909("compiler", "option.removed.target", objArr11));
            } else if (enumC14128M29710 == enumC14128) {
                C14065 c140614 = C9768.f32836;
                Object[] objArr12 = new Object[1];
                objArr12[c] = enumC14128M29710;
                c20414.m48195(enumC0598, new C14065("compiler", "option.obsolete.target", objArr12));
                z = true;
            }
            enumC14129 = EnumC14128.JDK1_8;
            if (enumC14128M29710.compareTo(enumC14129) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC23300 interfaceC23302 = new InterfaceC23300() { // from class: l.ۖ᩺۟
                @Override // l.InterfaceC23300
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo8592(EnumC19730 enumC19737) {
                    C5909 c59018 = C23879.f77204;
                    this.f10743.m37171(new C5909("compiler", "option.not.allowed.with.target", enumC19737, enumC14128M29710));
                }
            };
            str = ",";
            EnumC19730[] enumC19730Arr3 = new EnumC19730[9];
            enumC19730Arr3[c] = EnumC19730.f63327;
            enumC19730Arr3[1] = EnumC19730.f63326;
            enumC19730Arr3[2] = EnumC19730.f63405;
            enumC19730Arr3[3] = EnumC19730.f63373;
            enumC19730Arr3[4] = EnumC19730.f63351;
            enumC19730Arr3[5] = EnumC19730.f63383;
            enumC19730Arr3[6] = EnumC19730.f63356;
            enumC19730Arr3[7] = EnumC19730.f63386;
            enumC19730Arr3[8] = enumC19735;
            m37172(z2, interfaceC23302, enumC19730Arr3);
            if (enumC14128M29710.compareTo(EnumC14128.JDK1_9) >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC23300 interfaceC23303 = new InterfaceC23300() { // from class: l.ۚ᩺۟
                @Override // l.InterfaceC23300
                /* JADX INFO: renamed from: ۙ */
                public final void mo8592(EnumC19730 enumC19737) {
                    C5909 c59018 = C23879.f77204;
                    this.f19339.m37171(new C5909("compiler", "option.not.allowed.with.target", enumC19737, enumC14128M29710));
                }
            };
            enumC19730 = EnumC19730.f63353;
            EnumC19730[] enumC19730Arr4 = new EnumC19730[10];
            enumC19730Arr4[c] = EnumC19730.f63354;
            enumC19730Arr4[1] = EnumC19730.f63320;
            enumC19730Arr4[2] = EnumC19730.f63378;
            enumC19730Arr4[3] = EnumC19730.f63325;
            enumC19730Arr4[4] = EnumC19730.f63330;
            enumC19730Arr4[5] = enumC19730;
            enumC19730Arr4[6] = EnumC19730.f63336;
            enumC19730Arr4[7] = EnumC19730.f63368;
            enumC19730Arr4[8] = EnumC19730.f63404;
            enumC19730Arr4[9] = EnumC19730.f63341;
            m37172(z3, interfaceC23303, enumC19730Arr4);
            if (zM35409) {
                C14065 c140615 = C9768.f32836;
                Object[] objArr13 = new Object[2];
                objArr13[c] = enumC14128M29710;
                objArr13[1] = enumC14129;
                c20414.m48201(new C14065("compiler", "option.parameters.unsupported", objArr13));
            }
            if (interfaceC13464M37163.mo32953(EnumC3584.MODULE_SOURCE_PATH)) {
                c20414.m48197(C23879.f77290);
            }
            if (interfaceC13464M37163.mo32953(EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH)) {
                c20414.m48197(C23879.f77284);
            }
            if (z) {
                c20414.m48195(enumC0598, C9768.f32853);
            }
            enumC12508M29707 = EnumC11909.m29707(enumC11909M29705);
            strM35398 = c14770.m35398(enumC19730);
            if (strM35398 != null) {
                patternMo4849 = enumC19730.mo4848();
                strArrSplit4 = strM35398.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length4 = strArrSplit4.length;
                i5 = 0;
                while (i5 < length4) {
                    matcher2 = patternMo4849.matcher(strArrSplit4[i5]);
                    if (matcher2.matches()) {
                        strGroup2 = matcher2.group(1);
                        if (!EnumC12508.m31072(strGroup2, enumC12508M29707)) {
                            c20414.m48201(C9768.m24750(EnumC19730.f63353, strGroup2));
                        }
                        strGroup3 = matcher2.group(2);
                        if (!EnumC12508.m31072(strGroup3, enumC12508M29707)) {
                            c20414.m48201(C9768.m24750(EnumC19730.f63353, strGroup3));
                        }
                        str5 = str;
                        strArrSplit5 = matcher2.group(3).split(str5);
                        length5 = strArrSplit5.length;
                        i7 = 0;
                        while (true) {
                            pattern = patternMo4849;
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
                                patternMo4849 = pattern;
                                obj = obj4;
                                length4 = i8;
                            } else {
                                i8 = length4;
                                obj4 = obj;
                            }
                            i7++;
                            strArrSplit5 = strArrSplit5;
                            patternMo4849 = pattern;
                            obj = obj4;
                            length4 = i8;
                        }
                        i6 = length4;
                        obj3 = obj;
                    } else {
                        i6 = length4;
                        obj3 = obj;
                        str5 = str;
                        pattern = patternMo4849;
                    }
                    i5++;
                    obj = obj3;
                    patternMo4849 = pattern;
                    strArrSplit4 = strArrSplit4;
                    length4 = i6;
                    str = str5;
                }
            }
            obj2 = obj;
            str2 = str;
            strM35399 = c14770.m35398(EnumC19730.f63330);
            if (strM35399 != null) {
                strArrSplit3 = strM35399.split(str2);
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
                            if (!EnumC12508.m31072(str4, enumC12508M29707)) {
                                C5909 c59018 = C23879.f77204;
                                Object[] objArr14 = new Object[2];
                                objArr14[c] = EnumC19730.f63330;
                                objArr14[1] = str4;
                                c20414.m48197(new C5909("compiler", "bad.name.for.option", objArr14));
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
            enumC19731 = EnumC19730.f63368;
            strM353910 = c14770.m35398(enumC19731);
            if (strM353910 != null) {
                patternMo4848 = enumC19731.mo4848();
                strArrSplit = strM353910.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                length = strArrSplit.length;
                i2 = 0;
                while (i2 < length) {
                    matcher = patternMo4848.matcher(strArrSplit[i2]);
                    if (matcher.matches()) {
                        strGroup = matcher.group(1);
                        if (!EnumC12508.m31072(strGroup, enumC12508M29707)) {
                            c20414.m48201(C9768.m24750(EnumC19730.f63368, strGroup));
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
                    patternMo4848 = patternMo4848;
                    strArrSplit = strArrSplit;
                }
            }
            strM353911 = c14770.m35398(EnumC19730.f63404);
            if (strM353911 != null) {
                while (i < r4) {
                    str13.getClass();
                    if (str13.equals(obj2)) {
                    }
                }
            }
            enumC19732 = EnumC19730.f63344;
            strM353912 = c14770.m35398(enumC19732);
            if (strM353912 != null) {
                C5909 c59019 = C23879.f77204;
                Object[] objArr15 = new Object[2];
                objArr15[c] = enumC19732;
                objArr15[1] = strM353912;
                c20414.m48197(new C5909("compiler", "bad.name.for.option", objArr15));
            }
            if (zM35409) {
                c20414.m48195(EnumC0597.OPTIONS, C9768.f32836);
            }
            if (this.f50586) {
            }
            return c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m37176() {
        LinkedHashSet linkedHashSet = this.f50578;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        HashSet hashSet = this.f50583;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = this.f50579;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m37175() {
        return this.f50577;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m37173() {
        String strM35398 = this.f50587.m35398(EnumC19730.f63400);
        if (strM35398 == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strM35398.split("\\x00")) {
            linkedHashSet.add(C21825.m48586((Object[]) str.split("\\s+")));
        }
        return C0561.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m37174() {
        EnumC19730 enumC19730 = EnumC19730.f63337;
        C14770 c14770 = this.f50587;
        String strM35398 = c14770.m35398(enumC19730);
        String strM35399 = c14770.m35398(EnumC19730.f63369);
        if (strM35398 == null && strM35399 == null) {
            return C21825.m48588();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strM35398 != null) {
            linkedHashSet.add("-Xmsgs");
        }
        if (strM35399 != null) {
            for (String str : strM35399.split("\\s+")) {
                if (!str.isEmpty()) {
                    linkedHashSet.add("-Xmsgs:".concat(str));
                }
            }
        }
        if (linkedHashSet.equals(Collections.singleton("-Xmsgs:none"))) {
            return C21825.m48588();
        }
        String strM353910 = c14770.m35398(EnumC19730.f63361);
        if (strM353910 != null) {
            linkedHashSet.add("-XcheckPackage:".concat(strM353910));
        }
        return C21825.m48586(linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m37160(EnumC19730 enumC19730) {
        String strM35398 = this.f50587.m35398(enumC19730);
        if (strM35398 != null) {
            InterfaceC3800 interfaceC3800 = C22852.get(strM35398, new String[0]);
            if (C5212.exists(interfaceC3800, new EnumC22146[0]) && !C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
                C5909 c5909 = C23879.f77204;
                m37171(new C5909("compiler", "file.not.directory", strM35398));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37172(boolean z, final InterfaceC23300 interfaceC23300, EnumC19730... enumC19730Arr) {
        if (z) {
            return;
        }
        InterfaceC5046 interfaceC5046Of = C11397.of((Object[]) enumC19730Arr);
        final C14770 c14770 = this.f50587;
        C13638.requireNonNull(c14770);
        interfaceC5046Of.filter(new Predicate() { // from class: l.֨᩺۟
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c14770.m35408((EnumC19730) obj);
            }
        }).forEach(new Consumer() { // from class: l.۬᩺۟
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                interfaceC23300.mo8592((EnumC19730) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37171(AbstractC16493 abstractC16493) {
        this.f50586 = true;
        int iOrdinal = this.f50580.ordinal();
        C20414 c20414 = this.f50581;
        if (iOrdinal == 0) {
            throw new C11802(new IllegalArgumentException(c20414.m46170(abstractC16493)));
        }
        if (iOrdinal == 1) {
            throw new C11802(new IllegalStateException(c20414.m46170(abstractC16493)));
        }
        if (iOrdinal != 2) {
            return;
        }
        m37165(abstractC16493);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37165(AbstractC16493 abstractC16493) {
        boolean z = abstractC16493 instanceof C5909;
        C20414 c20414 = this.f50581;
        if (z) {
            c20414.m48197((C5909) abstractC16493);
        } else if (abstractC16493 instanceof C14065) {
            c20414.m48201((C14065) abstractC16493);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private InterfaceC13464 m37163() {
        if (this.f50576 == null) {
            this.f50576 = (InterfaceC13464) this.f50582.m30655(InterfaceC13464.class);
        }
        return this.f50576;
    }
}
