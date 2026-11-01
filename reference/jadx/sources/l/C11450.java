package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۨۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11450 extends C2194 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f38531;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f38532;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f38533;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38535;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC14128 f38537;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C14770 f38538;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2008 f38540;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38542;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21017 f38543;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f38544;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f38545;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f38546;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23942 f38547;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C5888 f38548;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23800 f38549;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20414 f38550;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f38551;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f38552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16576 f38530 = new C16576();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String[] f38529 = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21825 f38536 = C21825.m48588();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20809 f38541 = new C20809(65520);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20809 f38539 = new C20809(131056);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6074 f38534 = new C6074(this);

    public C11450(C12343 c12343) {
        c12343.m30659(f38530, this);
        this.f38550 = C20414.m46161(c12343);
        this.f38547 = C23942.m52776(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f38538 = c14770M35395;
        this.f38540 = C2008.m6467(c12343);
        this.f38537 = EnumC14128.m34159(c12343);
        EnumC11909.m29706(c12343);
        this.f38549 = C23800.m52336(c12343);
        this.f38543 = C21017.m47211(c12343);
        this.f38552 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f38548 = C17094.m39878(c12343).f54539;
        this.f38545 = c14770M35395.m35408(EnumC19730.f63380);
        this.f38544 = c14770M35395.m35408(EnumC19730.f63328);
        this.f38532 = c14770M35395.m35407("debug.stackmap");
        EnumC19730 enumC19730 = EnumC19730.f63377;
        this.f38533 = c14770M35395.m35405(enumC19730) || c14770M35395.m35402(enumC19730, "source");
        String strM35397 = c14770M35395.m35397("debug.dumpmodifiers");
        if (strM35397 != null) {
            this.f38535 = strM35397.indexOf(99) != -1;
            this.f38551 = strM35397.indexOf(IShizukuService.Stub.TRANSACTION_attachUserService) != -1;
            this.f38531 = strM35397.indexOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) != -1;
            this.f38542 = strM35397.indexOf(109) != -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11450 m28569(C12343 c12343) {
        C11450 c11450 = (C11450) c12343.m30656(f38530);
        return c11450 == null ? new C11450(c12343) : c11450;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m28574(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j & 4095;
        int i = 0;
        while (j2 != 0) {
            if ((1 & j2) != 0) {
                sb.append(" ");
                sb.append(f38529[i]);
            }
            j2 >>= 1;
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28584(int i, int i2) {
        byte[] bArr = this.f38541.f67645;
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m28590(AbstractC11242 abstractC11242) {
        int iM40100 = C17177.m40100(this.f38548.f20079, abstractC11242);
        C20809 c20809 = this.f38541;
        c20809.m46798(iM40100);
        c20809.m46797(0);
        return c20809.f67646;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28583(int i) {
        C20809 c20809 = this.f38541;
        int i2 = c20809.f67646 - i;
        byte[] bArr = c20809.f67645;
        bArr[i - 4] = (byte) ((i2 >> 24) & 255);
        bArr[i - 3] = (byte) ((i2 >> 16) & 255);
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28576() {
        C20809 c20809 = this.f38541;
        c20809.m46798(0);
        return c20809.f67646;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m28589(long j) {
        if ((j & 131072) == 0) {
            return 0;
        }
        m28583(m28590(this.f38547.f77625));
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28581(AbstractC23903 abstractC23903, boolean z) {
        int iM28589 = !z ? m28589(abstractC23903.mo20276()) : 0;
        long jMo20276 = abstractC23903.mo20276();
        if ((2147487744L & jMo20276) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && (jMo20276 & 536870912) == 0) {
            AbstractC16579 abstractC16579 = abstractC23903.f77449;
            C23800 c23800 = this.f38549;
            boolean zM52399 = c23800.m52399(abstractC16579, abstractC23903.mo50006(c23800));
            C5888 c5888 = this.f38548;
            if (zM52399) {
                C12239 c12239 = c5888.f20081;
                c12239.getClass();
                for (C21825 c21825Mo33524 = abstractC23903.f77449.mo33524(); c21825Mo33524.m48595(); c21825Mo33524 = c21825Mo33524.f70877) {
                    if (((AbstractC16579) c21825Mo33524.f70876).m39001(EnumC6617.TYPEVAR)) {
                        int iM28590 = m28590(this.f38547.f77654);
                        this.f38541.m46798(c5888.m16116(abstractC23903));
                        m28583(iM28590);
                        iM28589++;
                        break;
                    }
                }
            } else {
                int iM28591 = m28590(this.f38547.f77654);
                this.f38541.m46798(c5888.m16116(abstractC23903));
                m28583(iM28591);
                iM28589++;
                break;
            }
        }
        return iM28589 + m28578(abstractC23903.mo20271()) + m28579(abstractC23903.mo50009(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28571(C21825 c21825, EnumC1282 enumC1282) {
        int iM48596 = c21825.m48596();
        C20809 c20809 = this.f38541;
        c20809.m46793(iM48596);
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C6263 c6263 = (C6263) it.next();
            C19003 c19003 = new C19003();
            for (C11867 c11867 : c6263.mo20271()) {
                C23800 c23800 = this.f38549;
                c23800.getClass();
                if (c23800.m52418(c11867.f75167.f53222) == enumC1282) {
                    c19003.m43723(c11867);
                }
            }
            c20809.m46798(c19003.m43728());
            Iterator it2 = c19003.iterator();
            while (it2.hasNext()) {
                m28586((C11867) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28578(C21825 c21825) {
        int i = 0;
        if (c21825.isEmpty()) {
            return 0;
        }
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C11867 c11867 = (C11867) it.next();
            int[] iArr = C17363.f55245;
            C23800 c23800 = this.f38549;
            c23800.getClass();
            int i2 = iArr[c23800.m52418(c11867.f75167.f53222).ordinal()];
            if (i2 == 2) {
                c19004.m43723(c11867);
            } else if (i2 == 3) {
                c19003.m43723(c11867);
            }
        }
        int iM43728 = c19003.m43728();
        C20809 c20809 = this.f38541;
        C23942 c23942 = this.f38547;
        if (iM43728 != 0) {
            int iM28590 = m28590(c23942.f77537);
            c20809.m46798(c19003.m43728());
            Iterator it2 = c19003.iterator();
            while (it2.hasNext()) {
                m28586((C11867) it2.next());
            }
            m28583(iM28590);
            i = 1;
        }
        if (c19004.m43728() == 0) {
            return i;
        }
        int iM28591 = m28590(c23942.f77544);
        c20809.m46798(c19004.m43728());
        Iterator it3 = c19004.iterator();
        while (it3.hasNext()) {
            m28586((C11867) it3.next());
        }
        m28583(iM28591);
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28579(C21825 c21825, boolean z) {
        int i = 0;
        if (c21825.isEmpty()) {
            return 0;
        }
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C13278 c13278 = (C13278) it.next();
            if (c13278.m29576() && !c13278.m29573()) {
                this.f38550.m46169(EnumC16181.ERROR).println("ClassWriter: Position UNKNOWN in type annotation: " + c13278);
            } else if (c13278.f39811.f37191.m18045() == z) {
                C10935 c10935 = c13278.f39811;
                if (!c10935.f37191.m18045() || c10935.f37181) {
                    int[] iArr = C17363.f55245;
                    C23800 c23800 = this.f38549;
                    c23800.getClass();
                    int i2 = iArr[c23800.m52418(c13278.f75167.f53222).ordinal()];
                    if (i2 == 2) {
                        c19004.m43723(c13278);
                    } else if (i2 == 3) {
                        c19003.m43723(c13278);
                    }
                }
            }
        }
        int iM43728 = c19003.m43728();
        C20809 c20809 = this.f38541;
        C23942 c23942 = this.f38547;
        if (iM43728 != 0) {
            int iM28590 = m28590(c23942.f77551);
            c20809.m46798(c19003.m43728());
            Iterator it2 = c19003.iterator();
            while (it2.hasNext()) {
                m28587((C13278) it2.next());
            }
            m28583(iM28590);
            i = 1;
        }
        if (c19004.m43728() == 0) {
            return i;
        }
        int iM28591 = m28590(c23942.f77650);
        c20809.m46798(c19004.m43728());
        Iterator it3 = c19004.iterator();
        while (it3.hasNext()) {
            m28587((C13278) it3.next());
        }
        m28583(iM28591);
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28586(C11867 c11867) {
        AbstractC16579 abstractC16579 = c11867.f75167;
        C5888 c5888 = this.f38548;
        int iM16117 = c5888.m16117(abstractC16579);
        C20809 c20809 = this.f38541;
        c20809.m46798(iM16117);
        C21825<C2068> c21825 = c11867.f39809;
        c20809.m46798(c21825.m48596());
        for (C2068 c2068 : c21825) {
            c20809.m46798(C17177.m40100(c5888.f20079, ((C18258) c2068.f7664).f77453));
            ((AbstractC23156) c2068.f7665).mo4166(this.f38534);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28587(C13278 c13278) {
        C10935 c10935 = c13278.f39811;
        EnumC6659 enumC6659 = c10935.f37191;
        int i = c10935.f37193;
        int i2 = c10935.f37190;
        int iM18046 = enumC6659.m18046();
        C20809 c20809 = this.f38541;
        c20809.m46793(iM18046);
        switch (C17363.f55247[c10935.f37191.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c20809.m46798(c10935.f37182);
                break;
            case 5:
            case 6:
                c20809.m46798(c10935.f37187.length);
                int i3 = 0;
                while (true) {
                    int[] iArr = c10935.f37187;
                    if (i3 < iArr.length) {
                        c20809.m46798(iArr[i3]);
                        c20809.m46798(c10935.f37180[i3]);
                        c20809.m46798(c10935.f37192[i3]);
                        i3++;
                    }
                    break;
                }
                break;
            case 7:
                c20809.m46798(c10935.m27449());
                break;
            case 8:
            case 21:
            case 22:
                break;
            case 9:
            case 10:
                c20809.m46793(i);
                break;
            case 11:
            case 12:
                c20809.m46793(i);
                c20809.m46793(c10935.f37183);
                break;
            case 13:
                c20809.m46798(i2);
                break;
            case 14:
                c20809.m46798(i2);
                break;
            case 15:
                c20809.m46793(i);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                c20809.m46798(c10935.f37182);
                c20809.m46793(i2);
                break;
            case 23:
                throw new AssertionError("jvm.ClassWriter: UNKNOWN target type should never occur!");
            default:
                throw new AssertionError("jvm.ClassWriter: Unknown target type for position: " + c10935);
        }
        c20809.m46793(c10935.f37184.m48596());
        C21825<C17284> c21825 = c10935.f37184;
        C19003 c19003 = new C19003();
        for (C17284 c17284 : c21825) {
            c19003.m43723(Integer.valueOf(c17284.f55040.f20382));
            c19003.m43723(Integer.valueOf(c17284.f55039));
        }
        Iterator it = c19003.m43726().iterator();
        while (it.hasNext()) {
            c20809.m46793((byte) ((Integer) it.next()).intValue());
        }
        m28586((C11867) c13278);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28570(final C11450 c11450, C22492 c22492, Set set) {
        C20809 c20809 = c11450.f38541;
        C5888 c5888 = c11450.f38548;
        c5888.getClass();
        c20809.m46798(c5888.m16113(c22492.f77449));
        c20809.m46798(set.size());
        C0356.forEach(set, new Consumer() { // from class: l.۫۬۟
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C11450 c11451 = this.f41463;
                C20809 c208010 = c11451.f38541;
                C5888 c5889 = c11451.f38548;
                c5889.getClass();
                c208010.m46798(c5889.m16113(((C22492) obj).f77449));
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28591() {
        int iM16113;
        int iM28590 = m28590(this.f38547.f77584);
        C5888 c5888 = this.f38548;
        int size = c5888.f20083.size();
        C20809 c20809 = this.f38541;
        c20809.m46798(size);
        for (C22492 c22492 : c5888.f20083) {
            c22492.m50002(this.f38549);
            char cM28577 = (char) m28577(c22492.f77447);
            if ((cM28577 & 512) != 0) {
                cM28577 = (char) (cM28577 | 1024);
            }
            char c = (char) (cM28577 & (-2049));
            if (this.f38531) {
                PrintWriter printWriterM46169 = this.f38550.m46169(EnumC16181.ERROR);
                printWriterM46169.println("INNERCLASS  " + ((Object) c22492.f77453));
                printWriterM46169.println("---" + m28574((long) c));
            }
            c5888.getClass();
            c20809.m46798(c5888.m16113(c22492.f77449));
            int iM40100 = 0;
            if (c22492.f77448.f77452 != EnumC10477.f35865 || c22492.f77453.isEmpty()) {
                iM16113 = 0;
            } else {
                C22492 c22493 = (C22492) c22492.f77448;
                c5888.getClass();
                iM16113 = c5888.m16113(c22493.f77449);
            }
            c20809.m46798(iM16113);
            if (!c22492.f77453.isEmpty()) {
                iM40100 = C17177.m40100(c5888.f20079, c22492.f77453);
            }
            c20809.m46798(iM40100);
            c20809.m46798(c);
        }
        m28583(iM28590);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28572(AbstractC23903 abstractC23903, C19003 c19003) {
        if (abstractC23903.f77452 != EnumC10477.f35865) {
            return;
        }
        C22492 c22492 = (C22492) abstractC23903;
        if (c22492.f77448.f77452 != EnumC10477.f35867) {
            c19003.m43723(c22492);
        }
        c22492.mo49994();
        if (c22492.f73417 != null) {
            AbstractC9462 abstractC9462Mo20272 = abstractC23903.mo20272();
            abstractC9462Mo20272.getClass();
            Iterator it = abstractC9462Mo20272.mo3802((Predicate) null, EnumC10167.RECURSIVE).iterator();
            while (it.hasNext()) {
                m28572((AbstractC23903) it.next(), c19003);
            }
        }
        C21825 c21825 = c22492.f73418;
        if (c21825 != null) {
            Iterator it2 = c21825.iterator();
            while (it2.hasNext()) {
                m28572((AbstractC23903) it2.next(), c19003);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28588(AbstractC16579 abstractC16579) {
        boolean z = this.f38532;
        C20809 c20809 = this.f38541;
        if (abstractC16579 == null) {
            if (z) {
                System.out.print(b.f);
            }
            c20809.m46793(0);
            return;
        }
        switch (C17363.f55244[abstractC16579.mo1933().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                if (z) {
                    System.out.print(ClassTransform.INTEGER);
                }
                c20809.m46793(1);
                return;
            case 5:
                if (z) {
                    System.out.print(ClassTransform.LONG);
                }
                c20809.m46793(4);
                return;
            case 6:
                if (z) {
                    System.out.print(ClassTransform.FLOAT);
                }
                c20809.m46793(2);
                return;
            case 7:
                if (z) {
                    System.out.print(ClassTransform.DOUBLE);
                }
                c20809.m46793(3);
                return;
            case 9:
                if (z) {
                    System.out.print("null");
                }
                c20809.m46793(5);
                return;
            case 10:
            case 11:
            case 12:
                C23800 c23800 = this.f38549;
                if (z) {
                    System.out.print("object(" + c23800.m52402(abstractC16579).f53222 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c20809.m46793(7);
                c20809.m46798(this.f38548.m16113(c23800.m52402(abstractC16579)));
                return;
            case 13:
                if (z) {
                    System.out.print("uninit_this");
                }
                c20809.m46793(6);
                return;
            case 14:
                int i = ((C12011) abstractC16579).f40246;
                c20809.m46793(8);
                if (z) {
                    System.out.print("uninit_object@" + i);
                }
                c20809.m46798(i);
                return;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28585(OutputStream outputStream, C22492 c22492) throws IOException {
        int i;
        int iM16113;
        C22492 c22493;
        int i2;
        int i3;
        EnumC14128 enumC14128;
        int i4;
        int i5;
        int i6;
        C18258 c18258;
        C17177 c17177;
        C20414 c20414;
        C23942 c23942;
        int i7;
        C23800 c23800;
        C23800 c23801;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        C18258 c18259;
        int i10;
        int i11;
        C18258 c182510;
        EnumC7922 enumC7922;
        C23942 c23943;
        C18258 c182511;
        String str;
        C21017 c21017;
        C13485 c13485;
        int i12;
        int i13;
        C20414 c20415;
        String str2;
        int i14;
        c22492.mo49994();
        C6171.m17176((c22492.f77447 & 16777216) == 0);
        C20809 c20809 = this.f38541;
        c20809.f67646 = 0;
        C20809 c208010 = this.f38539;
        c208010.f67646 = 0;
        AbstractC16579 abstractC16579 = c22492.f77449;
        C23800 c23802 = this.f38549;
        AbstractC16579 abstractC16579M52432 = c23802.m52432(abstractC16579);
        C21825 c21825M52439 = c23802.m52439(c22492.f77449);
        C21825 c21825Mo1938 = c22492.f77449.mo1938();
        EnumC10477 enumC10477 = c22492.f77448.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35868;
        if (enumC10477 == enumC10478) {
            i = 32768;
        } else {
            c22492.mo49994();
            int iM28577 = m28577(c22492.f77447 & (-8796093022209L));
            if ((iM28577 & 4) != 0) {
                iM28577 |= 1;
            }
            int i15 = iM28577 & 30225;
            i = (iM28577 & 512) == 0 ? i15 | 32 : i15;
        }
        boolean z3 = this.f38535;
        String str3 = "---";
        C20414 c20416 = this.f38550;
        if (z3) {
            PrintWriter printWriterM46169 = c20416.m46169(EnumC16181.ERROR);
            printWriterM46169.println();
            printWriterM46169.println("CLASSFILE  " + ((Object) c22492.f73419));
            printWriterM46169.println("---" + m28574((long) i));
        }
        c20809.m46798(i);
        AbstractC23903 abstractC23903 = c22492.f77448;
        EnumC10477 enumC10479 = abstractC23903.f77452;
        C23942 c23944 = this.f38547;
        C5888 c5888 = this.f38548;
        if (enumC10479 == enumC10478) {
            C22492 c22494 = new C22492(0L, c23944.f77609, ((C19670) abstractC23903).f63141);
            c5888.getClass();
            c20809.m46798(c5888.m16113(c22494.f77449));
        } else {
            c5888.getClass();
            c20809.m46798(c5888.m16113(c22492.f77449));
        }
        if (abstractC16579M52432.m39001(EnumC6617.CLASS)) {
            C22492 c22495 = (C22492) abstractC16579M52432.f53222;
            c5888.getClass();
            iM16113 = c5888.m16113(c22495.f77449);
        } else {
            iM16113 = 0;
        }
        c20809.m46798(iM16113);
        c20809.m46798(c21825M52439.m48596());
        for (C21825 c21825 = c21825M52439; c21825.m48595(); c21825 = c21825.f70877) {
            C22492 c22496 = (C22492) ((AbstractC16579) c21825.f70876).f53222;
            c5888.getClass();
            c20809.m46798(c5888.m16113(c22496.f77449));
        }
        c22492.mo49994();
        int i16 = 0;
        int i17 = 0;
        for (AbstractC23903 abstractC23904 : c22492.f73417.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            int i18 = C17363.f55248[abstractC23904.f77452.ordinal()];
            C21825 c21826 = c21825M52439;
            if (i18 == 1) {
                i16++;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    C6171.m17170();
                    throw null;
                }
                c5888.m16115((C22492) abstractC23904);
            } else if ((abstractC23904.mo20276() & 137438953472L) == 0) {
                i17++;
            }
            c21825M52439 = c21826;
        }
        C21825 c21827 = c21825M52439;
        C21825 c21828 = c22492.f73418;
        if (c21828 != null) {
            Iterator it = c21828.iterator();
            while (it.hasNext()) {
                c5888.m16115((C22492) it.next());
            }
        }
        c20809.m46798(i16);
        c22492.mo49994();
        AbstractC9462 abstractC9462 = c22492.f73417;
        C21825 c21825M48588 = C21825.m48588();
        for (AbstractC23903 abstractC23905 : abstractC9462.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (abstractC23905.f77452 == EnumC10477.f35878) {
                c21825M48588 = c21825M48588.m48597((C6263) abstractC23905);
            }
        }
        while (c21825M48588.m48595()) {
            C6263 c6263 = (C6263) c21825M48588.f70876;
            c20809.m46798(m28577(c6263.f77447));
            if (this.f38551) {
                c20415 = c20416;
                PrintWriter printWriterM461610 = c20415.m46169(EnumC16181.ERROR);
                printWriterM461610.println("FIELD  " + ((Object) c6263.f77453));
                str2 = str3;
                printWriterM461610.println(str2 + m28574(c6263.f77447));
            } else {
                c20415 = c20416;
                str2 = str3;
            }
            c20809.m46798(C17177.m40100(c5888.f20079, c6263.f77453));
            c20809.m46798(c5888.m16114((AbstractC23903) c6263));
            int iM28576 = m28576();
            if (c6263.m17332() != null) {
                int iM28590 = m28590(c23944.f77645);
                c20809.m46798(c5888.m16111(c6263.m17332()));
                m28583(iM28590);
                i14 = 1;
            } else {
                i14 = 0;
            }
            m28584(iM28576, i14 + m28581((AbstractC23903) c6263, false) + m28580(c6263));
            c21825M48588 = c21825M48588.f70877;
            c208010 = c208010;
            abstractC16579M52432 = abstractC16579M52432;
            c20416 = c20415;
            str3 = str2;
        }
        C20414 c20417 = c20416;
        String str4 = str3;
        C20809 c208011 = c208010;
        AbstractC16579 abstractC165710 = abstractC16579M52432;
        c20809.m46798(i17);
        c22492.mo49994();
        AbstractC9462 abstractC9463 = c22492.f73417;
        C21825 c21825M48589 = C21825.m48588();
        for (AbstractC23903 abstractC23906 : abstractC9463.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (abstractC23906.f77452 == EnumC10477.f35879 && (abstractC23906.mo20276() & 137438953472L) == 0) {
                c21825M48589 = c21825M48589.m48597((C18258) abstractC23906);
            }
        }
        while (true) {
            boolean zM48595 = c21825M48589.m48595();
            boolean z4 = this.f38544;
            EnumC14128 enumC14129 = this.f38537;
            if (!zM48595) {
                C23942 c23945 = c23944;
                C18258 c18258Mo9802 = null;
                int iM28578 = m28576();
                boolean z5 = (c21825Mo1938.m48596() == 0 && abstractC165710.mo1943().m48596() == 0) ? false : true;
                for (C21825 c21829 = c21827; !z5 && c21829.m48595(); c21829 = c21829.f70877) {
                    z5 = ((AbstractC16579) c21829.f70876).mo1943().m48596() != 0;
                }
                if (z5) {
                    int iM28591 = m28590(c23945.f77654);
                    c22493 = c22492;
                    c20809.m46798(c5888.m16116(c22493));
                    m28583(iM28591);
                    i2 = 1;
                } else {
                    c22493 = c22492;
                    i2 = 0;
                }
                if (c22493.f73415 != null && this.f38533) {
                    int iM28592 = m28590(c23945.f77611);
                    InterfaceC2173 interfaceC2173 = c22493.f73415;
                    int i19 = AbstractC6344.f21400;
                    String schemeSpecificPart = interfaceC2173.toUri().getSchemeSpecificPart();
                    c20809.m46798(C17177.m40100(c5888.f20079, c23945.f77631.m17389(schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1))));
                    m28583(iM28592);
                    i2++;
                }
                if (z4) {
                    AbstractC11242 abstractC11242 = c23945.f77646;
                    AbstractC6302 abstractC6302 = c23945.f77631;
                    int iM28593 = m28590(abstractC11242);
                    try {
                        c20809.m46798(C17177.m40100(c5888.f20079, abstractC6302.m17389(Long.toString(c22493.f73415.mo10163()))));
                        m28583(iM28593);
                        int iM28594 = m28590(c23945.f77610);
                        c20809.m46798(C17177.m40100(c5888.f20079, abstractC6302.m17389(Long.toString(System.currentTimeMillis()))));
                        m28583(iM28594);
                        i2 += 2;
                    } catch (SecurityException e) {
                        throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
                    }
                }
                c22492.mo49994();
                int iM28579 = m28578(c22492.mo20271()) + i2 + m28589(c22493.f77447) + m28579(c22492.mo50009(), false);
                AbstractC11242 abstractC11243 = c23945.f77629;
                EnumC10477 enumC104710 = c22493.f77448.f77452;
                EnumC10477 enumC104711 = EnumC10477.f35879;
                if (enumC104710 == enumC104711 || c22493.f77453 == c23945.f77594) {
                    int iM28595 = m28590(abstractC11243);
                    C22492 c22492M52720 = c22493.f77448.m52720();
                    AbstractC23903 abstractC23907 = c22493.f77448;
                    if (abstractC23907.f77449 != null && abstractC23907.f77452 == enumC104711) {
                        c18258Mo9802 = ((C18258) abstractC23907).mo9802();
                    }
                    c5888.getClass();
                    c20809.m46798(c5888.m16113(c22492M52720.f77449));
                    c20809.m46798(c18258Mo9802 == null ? 0 : c5888.m16118(c18258Mo9802));
                    m28583(iM28595);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int iM28589 = iM28579 + i3;
                AbstractC23903 abstractC23908 = c22493.f77448;
                if (abstractC23908.f77452 == EnumC10477.f35868) {
                    C19670 c19670 = (C19670) abstractC23908;
                    int iM28596 = m28590(c23945.f77562);
                    C17177 c17178 = c5888.f20079;
                    c20809.m46798(C17177.m40100(c17178, c19670));
                    c20809.m46798(EnumC18964.m43665(c19670.f63137));
                    AbstractC11242 abstractC11244 = c19670.f63149;
                    c20809.m46798(abstractC11244 != null ? C17177.m40100(c17178, abstractC11244) : 0);
                    C19003<C6948> c19003 = new C19003();
                    for (C6948 c6948 : c19670.f63134) {
                        if (!c6948.f23370.contains(EnumC23177.EXTRA)) {
                            c19003.m43723(c6948);
                        }
                    }
                    c20809.m46798(c19003.size());
                    for (C6948 c6949 : c19003) {
                        c20809.m46798(C17177.m40100(c17178, c6949.f23371));
                        c20809.m46798(EnumC23177.m51170(c6949.f23370));
                        AbstractC11242 abstractC11245 = c6949.f23371.f63149;
                        c20809.m46798(abstractC11245 != null ? C17177.m40100(c17178, abstractC11245) : 0);
                    }
                    C21825<C5537> c218210 = c19670.f63142;
                    c20809.m46798(c218210.m48596());
                    for (C5537 c5537 : c218210) {
                        C7675 c7675 = c5537.f18986;
                        C21825 c218211 = c5537.f18987;
                        c20809.m46798(C17177.m40100(c17178, c7675));
                        c20809.m46798(EnumC22471.m49975(c5537.f18985));
                        if (c218211 == null) {
                            c20809.m46798(0);
                        } else {
                            c20809.m46798(c218211.m48596());
                            Iterator it2 = c218211.iterator();
                            while (it2.hasNext()) {
                                c20809.m46798(C17177.m40100(c17178, (C19670) it2.next()));
                            }
                        }
                    }
                    C21825<C1303> c218212 = c19670.f63145;
                    c20809.m46798(c218212.m48596());
                    for (C1303 c1303 : c218212) {
                        C7675 c7676 = c1303.f5571;
                        C21825 c218213 = c1303.f5572;
                        c20809.m46798(C17177.m40100(c17178, c7676));
                        c20809.m46798(EnumC13299.m32786(c1303.f5570));
                        if (c218213 == null) {
                            c20809.m46798(0);
                        } else {
                            c20809.m46798(c218213.m48596());
                            Iterator it3 = c218213.iterator();
                            while (it3.hasNext()) {
                                c20809.m46798(C17177.m40100(c17178, (C19670) it3.next()));
                            }
                        }
                    }
                    C21825 c218214 = c19670.f63151;
                    c20809.m46798(c218214.m48596());
                    Iterator it4 = c218214.iterator();
                    while (it4.hasNext()) {
                        c20809.m46798(c5888.m16113(((C15416) it4.next()).f50252.f77449));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C4125 c4125 : c19670.f63140) {
                        ((Set) C9735.computeIfAbsent(linkedHashMap, c4125.f15099, new C18834(4))).addAll(c4125.f15098);
                    }
                    c20809.m46798(linkedHashMap.size());
                    C9735.forEach(linkedHashMap, new BiConsumer() { // from class: l.ܽ۬۟
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            C11450.m28570(this.f53409, (C22492) obj, (Set) obj2);
                        }

                        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return C2866.$default$andThen(this, biConsumer);
                        }
                    });
                    m28583(iM28596);
                    iM28589 = iM28589 + 1 + m28589(c22493.f77448.mo20276() & (-131073));
                }
                int iM28580 = iM28589 + m28580((AbstractC23903) c22493);
                c208011.m46797(-889275714);
                C2008 c2008 = this.f38540;
                if (c2008.m6473() && c2008.m6474(c22493.f73415)) {
                    c208011.m46798(65535);
                    enumC14128 = enumC14129;
                } else {
                    enumC14128 = enumC14129;
                    c208011.m46798(enumC14128.f46389);
                }
                c208011.m46798(enumC14128.f46388);
                if (c22493.f77448.f77452 != EnumC10477.f35868 && enumC14128.m34164()) {
                    C19003 c19004 = new C19003();
                    m28572(c22493, c19004);
                    LinkedHashSet<C22492> linkedHashSet = new LinkedHashSet(c19004);
                    if (c22493.f77448.f77452 != EnumC10477.f35867 || linkedHashSet.isEmpty()) {
                        i5 = 0;
                    } else {
                        int iM28597 = m28590(c23945.f77607);
                        c20809.m46798(linkedHashSet.size());
                        for (C22492 c22497 : linkedHashSet) {
                            c5888.getClass();
                            c20809.m46798(c5888.m16113(c22497.f77449));
                        }
                        m28583(iM28597);
                        i5 = 1;
                    }
                    int i20 = iM28580 + i5;
                    if (c22493.f77448.f77452 != EnumC10477.f35867) {
                        int iM28598 = m28590(c23945.f77657);
                        C22492 c22492Mo44804 = c22492.mo44804();
                        c5888.getClass();
                        c20809.m46798(c5888.m16113(c22492Mo44804.f77449));
                        m28583(iM28598);
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    iM28580 = i20 + i6;
                }
                if (c22492.m50010()) {
                    int iM28599 = m28590(c23945.f77592);
                    c22492.mo20272();
                    c20809.m46798(c22492.m50004().m48596());
                    for (AbstractC23903 abstractC23909 : c22492.m50004()) {
                        c20809.m46798(C17177.m40100(c5888.f20079, abstractC23909.f77453));
                        c20809.m46798(c5888.m16114(abstractC23909));
                        m28584(m28576(), m28581(abstractC23909, true));
                    }
                    i4 = 1;
                    m28583(iM28599);
                    iM28580++;
                } else {
                    i4 = 1;
                }
                if (enumC14128.m34161()) {
                    if (c22493.f73421.m48595()) {
                        int iM285910 = m28590(c23945.f77547);
                        c20809.m46798(c22493.f73421.m48596());
                        Iterator it5 = c22493.f73421.iterator();
                        while (it5.hasNext()) {
                            C22492 c22498 = (C22492) ((AbstractC23903) it5.next());
                            c5888.getClass();
                            c20809.m46798(c5888.m16113(c22498.f77449));
                        }
                        m28583(iM285910);
                    } else {
                        i4 = 0;
                    }
                    iM28580 += i4;
                }
                LinkedHashMap linkedHashMap2 = c5888.f20080;
                C17177 c17179 = c5888.f20079;
                LinkedHashSet linkedHashSet2 = c5888.f20083;
                if (!linkedHashMap2.isEmpty()) {
                    int iM285911 = m28590(c23945.f77558);
                    c20809.m46798(c5888.f20080.size());
                    for (C8005 c8005 : c5888.f20080.keySet()) {
                        c20809.m46798(c5888.m16112(c8005.f26254));
                        InterfaceC7299[] interfaceC7299Arr = c8005.f26253;
                        c20809.m46798(interfaceC7299Arr.length);
                        for (InterfaceC7299 interfaceC7299 : interfaceC7299Arr) {
                            c20809.m46798(c5888.m16112(interfaceC7299));
                        }
                    }
                    m28583(iM285911);
                    iM28580++;
                }
                if (!linkedHashSet2.isEmpty()) {
                    m28591();
                    iM28580++;
                }
                m28584(iM28578, iM28580);
                outputStream.write(c208011.f67645, 0, c208011.f67646);
                if (c17179.f54754 != null) {
                    throw new C13567(c17179.f54754);
                }
                int i21 = c17179.f54752;
                if (i21 > 65535) {
                    throw new C11014();
                }
                outputStream.write(i21 >> 8);
                outputStream.write(i21);
                C20809 c208012 = c17179.f54751;
                outputStream.write(c208012.f67645, 0, c208012.f67646);
                linkedHashSet2.clear();
                c5888.f20080.clear();
                c17179.m40101();
                outputStream.write(c20809.f67645, 0, c20809.f67646);
                return;
            }
            C18258 c182512 = (C18258) c21825M48589.f70876;
            c20809.m46798(m28577(c182512.f77447));
            if (this.f38542) {
                PrintWriter printWriterM461611 = c20417.m46169(EnumC16181.ERROR);
                printWriterM461611.println("METHOD  " + ((Object) c182512.f77453));
                printWriterM461611.println(str4 + m28574(c182512.f77447));
            }
            AbstractC11242 abstractC11246 = c182512.f77453;
            C17177 c171710 = c5888.f20079;
            c20809.m46798(C17177.m40100(c171710, abstractC11246));
            c20809.m46798(c5888.m16114((AbstractC23903) c182512));
            int iM285710 = m28576();
            if (c182512.f58261 != null) {
                int iM285912 = m28590(c23944.f77653);
                C10039 c10039 = c182512.f58261;
                int i22 = c10039.f34282;
                EnumC7922 enumC7923 = c10039.f34287;
                C18258 c182513 = c10039.f34284;
                c20809.m46798(i22);
                c20809.m46798(c10039.f34297);
                c20809.m46797(c10039.f34272);
                c20809.m46794(0, c10039.f34272, c10039.f34286);
                c20809.m46798(c10039.f34289.m43728());
                C21825 c21825M43726 = c10039.f34289.m43726();
                while (c21825M43726.m48595()) {
                    int i23 = 0;
                    while (true) {
                        char[] cArr = (char[]) c21825M43726.f70876;
                        i13 = iM285912;
                        if (i23 < cArr.length) {
                            c20809.m46798(cArr[i23]);
                            i23++;
                            iM285912 = i13;
                        }
                    }
                    c21825M43726 = c21825M43726.f70877;
                    iM285912 = i13;
                }
                int i24 = iM285912;
                int iM285711 = m28576();
                if (c10039.f34295.m48595()) {
                    int iM285913 = m28590(c23944.f77641);
                    c20809.m46798(c10039.f34295.m48596());
                    C21825 c21825M485810 = c10039.f34295.m48589();
                    while (c21825M485810.m48595()) {
                        int i25 = 0;
                        C18258 c182514 = c182512;
                        while (true) {
                            char[] cArr2 = (char[]) c21825M485810.f70876;
                            i12 = iM285711;
                            if (i25 < cArr2.length) {
                                c20809.m46798(cArr2[i25]);
                                i25++;
                                iM285711 = i12;
                            }
                        }
                        c21825M485810 = c21825M485810.f70877;
                        c182512 = c182514;
                        iM285711 = i12;
                    }
                    c18259 = c182512;
                    i10 = iM285711;
                    m28583(iM285913);
                    i11 = 1;
                } else {
                    c18259 = c182512;
                    i10 = iM285711;
                    i11 = 0;
                }
                if (z4 && (c13485 = c10039.f34277) != null) {
                    int iM285914 = m28590(c23944.f77565);
                    m28584(m28576(), c13485.m32991(c20809, c10039.f34296, c20417));
                    m28583(iM285914);
                    i11++;
                }
                if (!c10039.f34276 || c10039.f34273 <= 0) {
                    c182510 = c182513;
                    enumC7922 = enumC7923;
                    c20414 = c20417;
                    c23943 = c23944;
                } else {
                    int iM285915 = m28590(c23944.f77614);
                    int size = c10039.f34273;
                    for (int i26 = 0; i26 < c10039.f34273; i26++) {
                        size += c10039.f34283[i26].f48886.size() - 1;
                    }
                    c20809.m46798(size);
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = c10039.f34273;
                        c21017 = this.f38543;
                        if (i27 >= i29) {
                            break;
                        }
                        C14978 c14978 = c10039.f34283[i27];
                        C20414 c20418 = c20417;
                        List list = c14978.f48886;
                        EnumC7922 enumC7924 = enumC7923;
                        C6263 c6264 = c14978.f48887;
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = it6;
                            C22739 c22739 = (C22739) it6.next();
                            C18258 c182515 = c182513;
                            char c = c22739.f74074;
                            C23942 c23946 = c23944;
                            C6171.m17176(c >= 0 && c <= c10039.f34272);
                            c20809.m46798(c);
                            char c2 = c22739.f74073;
                            C6171.m17176(c2 > 0 && c + c2 <= c10039.f34272);
                            c20809.m46798(c22739.f74073);
                            c20809.m46798(C17177.m40100(c171710, c6264.f77453));
                            c20809.m46798(c5888.m16114((AbstractC23903) c6264));
                            c20809.m46798(c14978.f48888);
                            AbstractC16579 abstractC165711 = c6264.f77449;
                            if (!c23802.m52399(abstractC165711, c23802.m52402(abstractC165711))) {
                                c21017.getClass();
                                if (C21017.m47242(abstractC165711)) {
                                    i28++;
                                }
                            }
                            c182513 = c182515;
                            it6 = it7;
                            c23944 = c23946;
                        }
                        i27++;
                        c20417 = c20418;
                        enumC7923 = enumC7924;
                    }
                    c182510 = c182513;
                    enumC7922 = enumC7923;
                    c20414 = c20417;
                    c23943 = c23944;
                    m28583(iM285915);
                    int i30 = i11 + 1;
                    if (i28 > 0) {
                        C23942 c23947 = c23943;
                        int iM285916 = m28590(c23947.f77637);
                        c20809.m46798(i28);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < c10039.f34273) {
                            C14978 c14979 = c10039.f34283[i31];
                            C6263 c6265 = c14979.f48887;
                            AbstractC16579 abstractC165712 = c6265.f77449;
                            C23942 c23948 = c23947;
                            if (!c23802.m52399(abstractC165712, c23802.m52402(abstractC165712))) {
                                c21017.getClass();
                                if (C21017.m47242(abstractC165712)) {
                                    for (Iterator it8 = c14979.f48886.iterator(); it8.hasNext(); it8 = it8) {
                                        C22739 c227310 = (C22739) it8.next();
                                        c20809.m46798(c227310.f74074);
                                        c20809.m46798(c227310.f74073);
                                        c20809.m46798(C17177.m40100(c171710, c6265.f77453));
                                        c20809.m46798(c5888.m16116(c6265));
                                        c20809.m46798(c14979.f48888);
                                        i32++;
                                    }
                                }
                            }
                            i31++;
                            c23947 = c23948;
                        }
                        c23943 = c23947;
                        C6171.m17176(i32 == i28);
                        m28583(iM285916);
                        i11 += 2;
                    } else {
                        i11 = i30;
                    }
                }
                if (c10039.f34278 > 0) {
                    boolean z6 = this.f38532;
                    if (z6) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Stack map for ");
                        c182511 = c182510;
                        sb.append(c182511);
                        printStream.println(sb.toString());
                    } else {
                        c182511 = c182510;
                    }
                    EnumC7922 enumC7925 = enumC7922;
                    c23942 = c23943;
                    int iM285917 = m28590(enumC7925.mo20926(c23942));
                    int i33 = c10039.f34278;
                    if (z6) {
                        System.out.println(" nframes = " + i33);
                    }
                    c20809.m46798(i33);
                    int i34 = C17363.f55246[enumC7925.ordinal()];
                    String str5 = ":";
                    String str6 = EnumC19730.f63352;
                    if (i34 == 1) {
                        c17177 = c171710;
                        int i35 = 0;
                        while (i35 < i33) {
                            if (z6) {
                                System.out.print(str6 + i35 + str5);
                            }
                            C19211 c19211 = c10039.f34294[i35];
                            if (z6) {
                                System.out.print(" pc=" + c19211.f62037);
                            }
                            c20809.m46798(c19211.f62037);
                            int iM25344 = 0;
                            int i36 = 0;
                            while (true) {
                                AbstractC16579[] abstractC16579Arr = c19211.f62035;
                                str = str6;
                                if (iM25344 >= abstractC16579Arr.length) {
                                    break;
                                }
                                i36++;
                                iM25344 += C10039.m25344(abstractC16579Arr[iM25344]);
                                str6 = str;
                            }
                            if (z6) {
                                System.out.print(" nlocals=" + i36);
                            }
                            c20809.m46798(i36);
                            int iM25345 = 0;
                            while (iM25345 < c19211.f62035.length) {
                                if (z6) {
                                    System.out.print(" local[" + iM25345 + "]=");
                                }
                                m28588(c19211.f62035[iM25345]);
                                iM25345 += C10039.m25344(c19211.f62035[iM25345]);
                                c10039 = c10039;
                            }
                            C10039 c100310 = c10039;
                            int iM25346 = 0;
                            int i37 = 0;
                            while (true) {
                                AbstractC16579[] abstractC16579Arr2 = c19211.f62036;
                                if (iM25346 >= abstractC16579Arr2.length) {
                                    break;
                                }
                                i37++;
                                iM25346 += C10039.m25344(abstractC16579Arr2[iM25346]);
                            }
                            if (z6) {
                                System.out.print(" nstack=" + i37);
                            }
                            c20809.m46798(i37);
                            for (int iM25347 = 0; iM25347 < c19211.f62036.length; iM25347 += C10039.m25344(c19211.f62036[iM25347])) {
                                if (z6) {
                                    System.out.print(" stack[" + iM25347 + "]=");
                                }
                                m28588(c19211.f62036[iM25347]);
                            }
                            if (z6) {
                                System.out.println();
                            }
                            i35++;
                            i33 = i33;
                            str5 = str5;
                            str6 = str;
                            c10039 = c100310;
                        }
                    } else {
                        if (i34 != 2) {
                            throw new AssertionError("Unexpected stackmap format value");
                        }
                        C6171.m17178(c10039.f34294);
                        int i38 = 0;
                        while (i38 < i33) {
                            if (z6) {
                                System.out.print(EnumC19730.f63352 + i38 + ":");
                            }
                            c10039.f34285[i38].mo5987(this);
                            if (z6) {
                                System.out.println();
                            }
                            i38++;
                            c171710 = c171710;
                        }
                        c17177 = c171710;
                    }
                    m28583(iM285917);
                    i11++;
                } else {
                    c17177 = c171710;
                    c182511 = c182510;
                    c23942 = c23943;
                }
                m28584(i10, i11 + m28579(c182511.mo50009(), true));
                c18258 = c18259;
                c18258.f58261 = null;
                m28583(i24);
                i7 = 1;
            } else {
                c18258 = c182512;
                c17177 = c171710;
                c20414 = c20417;
                c23942 = c23944;
                i7 = 0;
            }
            C21825 c21825Mo33524 = c18258.mo50006(c23802).mo33524();
            if (c21825Mo33524.m48595()) {
                int iM285918 = m28590(c23942.f77633);
                c20809.m46798(c21825Mo33524.m48596());
                while (c21825Mo33524.m48595()) {
                    c20809.m46798(c5888.m16113((AbstractC16579) c21825Mo33524.f70876));
                    c21825Mo33524 = c21825Mo33524.f70877;
                }
                m28583(iM285918);
                i7++;
            }
            if (c18258.f58258 != null) {
                int iM285919 = m28590(c23942.f77591);
                c18258.f58258.mo4166(this.f38534);
                m28583(iM285919);
                i7++;
            }
            if (!enumC14129.m34167() || ((!this.f38538.m35408(EnumC19730.f63329) && (!c18258.m52713() || (c18258.f77447 & 2305843009213693952L) == 0)) || (c18258.f77447 & 562949953421312L) == 562949953421312L)) {
                c23800 = c23802;
            } else {
                int iM48596 = c18258.m52698(c23802).mo27295().f45367.m48596();
                if (c18258.f58259 == null || iM48596 == 0) {
                    c23800 = c23802;
                    i9 = 0;
                } else {
                    int iM285920 = m28590(c23942.f77622);
                    c20809.m46793(iM48596);
                    for (C6263 c6266 : c18258.f58260) {
                        int i39 = (36880 & ((int) c6266.f77447)) | (((int) c18258.f77447) & 4096);
                        c20809.m46798(C17177.m40100(c17177, c6266.f77453));
                        c20809.m46798(i39);
                    }
                    C17177 c171711 = c17177;
                    for (C6263 c6267 : c18258.f58259) {
                        int i40 = (36880 & ((int) c6267.f77447)) | (((int) c18258.f77447) & 4096);
                        c20809.m46798(C17177.m40100(c171711, c6267.f77453));
                        c20809.m46798(i40);
                    }
                    int i41 = 36880;
                    for (C6263 c6268 : c18258.f58262) {
                        int i42 = (((int) c18258.f77447) & 4096) | (((int) c6268.f77447) & i41);
                        c20809.m46798(C17177.m40100(c171711, c6268.f77453));
                        c20809.m46798(i42);
                        c23802 = c23802;
                        i41 = 36880;
                    }
                    c23800 = c23802;
                    m28583(iM285920);
                    i9 = 1;
                }
                i7 += i9;
            }
            int iM28581 = i7 + m28581((AbstractC23903) c18258, false);
            if ((c18258.f77447 & 562949953421312L) == 562949953421312L) {
                c23801 = c23800;
            } else {
                C21825 c218215 = c18258.f58259;
                if (c218215 != null) {
                    Iterator it9 = c218215.iterator();
                    z = false;
                    z2 = false;
                    while (it9.hasNext()) {
                        Iterator it10 = ((C6263) it9.next()).mo20271().iterator();
                        while (it10.hasNext()) {
                            C23800 c23803 = c23800;
                            int i43 = C17363.f55245[c23803.m52418(((C11867) it10.next()).f75167.f53222).ordinal()];
                            if (i43 == 2) {
                                z2 = true;
                            } else if (i43 == 3) {
                                z = true;
                            }
                            c23800 = c23803;
                        }
                    }
                    c23801 = c23800;
                } else {
                    c23801 = c23800;
                    z = false;
                    z2 = false;
                }
                if (z) {
                    int iM285921 = m28590(c23942.f77600);
                    m28571(c218215, EnumC1282.RUNTIME);
                    m28583(iM285921);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (z2) {
                    int iM285922 = m28590(c23942.f77559);
                    m28571(c218215, EnumC1282.CLASS);
                    m28583(iM285922);
                    i8++;
                }
                iM28581 += i8;
            }
            m28584(iM285710, iM28581 + m28580(c18258));
            c23802 = c23801;
            str4 = str4;
            c21825Mo1938 = c21825Mo1938;
            c20417 = c20414;
            c23944 = c23942;
            c21825M48589 = c21825M48589.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m28582(C22492 c22492) throws IOException {
        InterfaceC4290 interfaceC4290Mo32957;
        C20414 c20414 = this.f38550;
        EnumC10477 enumC10477 = c22492.f77448.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35868;
        String string = (enumC10477 == enumC10478 ? c22492.f77453 : c22492.f73414).toString();
        boolean z = this.f38546;
        InterfaceC13464 interfaceC13464 = this.f38552;
        if (z) {
            AbstractC23903 abstractC23903 = c22492.f77448;
            interfaceC4290Mo32957 = interfaceC13464.mo32957(EnumC3584.CLASS_OUTPUT, (abstractC23903.f77452 == enumC10478 ? (C19670) abstractC23903 : c22492.m52724().f25392).f77453.toString());
        } else {
            interfaceC4290Mo32957 = EnumC3584.CLASS_OUTPUT;
        }
        InterfaceC2173 interfaceC2173Mo32951 = interfaceC13464.mo32951(interfaceC4290Mo32957, string, EnumC11347.CLASS, c22492.f73415);
        OutputStream outputStreamMo10165 = interfaceC2173Mo32951.mo10165();
        try {
            try {
                m28585(outputStreamMo10165, c22492);
                if (this.f38545) {
                    c20414.m46183("wrote.file", interfaceC2173Mo32951.getName());
                }
                outputStreamMo10165.close();
                return interfaceC2173Mo32951;
            } catch (C15333 e) {
                AbstractC16579 abstractC16579M36713 = e.m36713();
                C14377 c14377 = C14707.f48054;
                c20414.m48197(C23879.m52624(c22492, new C14377("compiler", "illegal.signature", c22492, abstractC16579M36713)));
                if (outputStreamMo10165 == null) {
                    return interfaceC2173Mo32951;
                }
                outputStreamMo10165.close();
                interfaceC2173Mo32951.delete();
                return null;
            }
        } catch (Throwable th) {
            if (outputStreamMo10165 != null) {
                outputStreamMo10165.close();
                interfaceC2173Mo32951.delete();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28580(AbstractC23903 abstractC23903) {
        Iterator it = this.f38536.iterator();
        int iApplyAsInt = 0;
        while (it.hasNext()) {
            iApplyAsInt += ((ToIntFunction) it.next()).applyAsInt(abstractC23903);
        }
        return iApplyAsInt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28577(long j) {
        int i = (int) j;
        if (this.f38537.m34169()) {
            i &= -2049;
        }
        if ((2147483648L & j) != 0) {
            i |= 64;
        }
        if ((17179869184L & j) != 0) {
            i |= 128;
        }
        return (j & 8796093022208L) != 0 ? i & (-1025) : i;
    }
}
