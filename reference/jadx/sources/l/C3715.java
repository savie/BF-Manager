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

/* JADX INFO: renamed from: l.ۗ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3715 extends C20693 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12748;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13015 f12749;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C24705 f12750;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f12752;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17638 f12753;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f12757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f12758;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f12759;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f12760;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f12761;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7312 f12762;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12763;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C15559 f12764;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22092 f12765;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12766;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15252 f12767;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public EnumC16305 f12768;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f12769;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13477 f12747 = new C13477();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f12746 = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14769 f12755 = C14769.m35543();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9002 f12754 = new C9002(65520);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9002 f12756 = new C9002(131056);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13410 f12751 = new C13410(this);

    public C3715(C4747 c4747) {
        c4747.m14646(f12747, this);
        this.f12762 = C7312.m20023(c4747);
        this.f12767 = C15252.m36599(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f12749 = c13015M32421;
        this.f12753 = C17638.m41289(c4747);
        this.f12768 = EnumC16305.m38659(c4747);
        EnumC20820.m47625(c4747);
        this.f12750 = C24705.m55066(c4747);
        this.f12765 = C22092.m49912(c4747);
        this.f12769 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        this.f12764 = C15056.m36212(c4747).f49149;
        this.f12758 = c13015M32421.m32433(EnumC7687.f25279);
        this.f12761 = c13015M32421.m32433(EnumC7687.f25355);
        this.f12766 = c13015M32421.m32432("debug.stackmap");
        EnumC7687 enumC7687 = EnumC7687.f25326;
        this.f12748 = c13015M32421.m32430(enumC7687) || c13015M32421.m32427(enumC7687, "source");
        String strM32422 = c13015M32421.m32422("debug.dumpmodifiers");
        if (strM32422 != null) {
            this.f12763 = strM32422.indexOf(99) != -1;
            this.f12759 = strM32422.indexOf(IShizukuService.Stub.TRANSACTION_attachUserService) != -1;
            this.f12757 = strM32422.indexOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) != -1;
            this.f12752 = strM32422.indexOf(109) != -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3715 m12074(C4747 c4747) {
        C3715 c3715 = (C3715) c4747.m14643(f12747);
        return c3715 == null ? new C3715(c4747) : c3715;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m12079(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j & 4095;
        int i = 0;
        while (j2 != 0) {
            if ((1 & j2) != 0) {
                sb.append(" ");
                sb.append(f12746[i]);
            }
            j2 >>= 1;
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12089(int i, int i2) {
        byte[] bArr = this.f12754.f29317;
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12095(AbstractC19728 abstractC19728) {
        int iM46076 = C20035.m46076(this.f12764.f50605, abstractC19728);
        C9002 c9002 = this.f12754;
        c9002.m24022(iM46076);
        c9002.m24020(0);
        return c9002.f29318;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12088(int i) {
        C9002 c9002 = this.f12754;
        int i2 = c9002.f29318 - i;
        byte[] bArr = c9002.f29317;
        bArr[i - 4] = (byte) ((i2 >> 24) & 255);
        bArr[i - 3] = (byte) ((i2 >> 16) & 255);
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12081() {
        C9002 c9002 = this.f12754;
        c9002.m24022(0);
        return c9002.f29318;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12094(long j) {
        if ((j & 131072) == 0) {
            return 0;
        }
        m12088(m12095(this.f12767.f49823));
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12084(AbstractC11781 abstractC11781, boolean z) {
        int iM12094 = !z ? m12094(abstractC11781.mo29591()) : 0;
        long jMo29591 = abstractC11781.mo29591();
        if ((2147487744L & jMo29591) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && (jMo29591 & 536870912) == 0) {
            AbstractC22664 abstractC22664 = abstractC11781.f38067;
            C24705 c24705 = this.f12750;
            boolean zM55149 = c24705.m55149(abstractC22664, abstractC11781.mo29576(c24705));
            C15559 c15559 = this.f12764;
            if (zM55149) {
                C23019 c23019 = c15559.f50603;
                c23019.getClass();
                for (C14769 c14769Mo50622 = abstractC11781.f38067.mo50622(); c14769Mo50622.m35550(); c14769Mo50622 = c14769Mo50622.f48336) {
                    if (((AbstractC22664) c14769Mo50622.f48335).m51067(EnumC21172.TYPEVAR)) {
                        int iM12095 = m12095(this.f12767.f49871);
                        this.f12754.m24022(c15559.m37274(abstractC11781));
                        m12088(iM12095);
                        iM12094++;
                        break;
                    }
                }
            } else {
                int iM12096 = m12095(this.f12767.f49871);
                this.f12754.m24022(c15559.m37274(abstractC11781));
                m12088(iM12096);
                iM12094++;
                break;
            }
        }
        return iM12094 + m12085(abstractC11781.mo29568()) + m12086(abstractC11781.mo29597(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12077(C14769 c14769, EnumC6738 enumC6738) {
        int iM35551 = c14769.m35551();
        C9002 c9002 = this.f12754;
        c9002.m24017(iM35551);
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C5816 c5816 = (C5816) it.next();
            C18499 c18499 = new C18499();
            for (C23892 c23892 : c5816.mo29568()) {
                C24705 c24705 = this.f12750;
                c24705.getClass();
                if (c24705.m55153(c23892.f69124.f73596) == enumC6738) {
                    c18499.m43089(c23892);
                }
            }
            c9002.m24022(c18499.m43094());
            Iterator it2 = c18499.iterator();
            while (it2.hasNext()) {
                m12092((C23892) it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12085(C14769 c14769) {
        int i = 0;
        if (c14769.isEmpty()) {
            return 0;
        }
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C23892 c23892 = (C23892) it.next();
            int[] iArr = C15647.f50806;
            C24705 c24705 = this.f12750;
            c24705.getClass();
            int i2 = iArr[c24705.m55153(c23892.f69124.f73596).ordinal()];
            if (i2 == 2) {
                c184910.m43089(c23892);
            } else if (i2 == 3) {
                c18499.m43089(c23892);
            }
        }
        int iM43094 = c18499.m43094();
        C9002 c9002 = this.f12754;
        C15252 c15252 = this.f12767;
        if (iM43094 != 0) {
            int iM12095 = m12095(c15252.f49809);
            c9002.m24022(c18499.m43094());
            Iterator it2 = c18499.iterator();
            while (it2.hasNext()) {
                m12092((C23892) it2.next());
            }
            m12088(iM12095);
            i = 1;
        }
        if (c184910.m43094() == 0) {
            return i;
        }
        int iM12096 = m12095(c15252.f49859);
        c9002.m24022(c184910.m43094());
        Iterator it3 = c184910.iterator();
        while (it3.hasNext()) {
            m12092((C23892) it3.next());
        }
        m12088(iM12096);
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12086(C14769 c14769, boolean z) {
        int i = 0;
        if (c14769.isEmpty()) {
            return 0;
        }
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C24638 c24638 = (C24638) it.next();
            if (c24638.m53396() && !c24638.m53393()) {
                this.f12762.m20031(EnumC8803.ERROR).println("ClassWriter: Position UNKNOWN in type annotation: " + c24638);
            } else if (c24638.f77371.f19183.m48863() == z) {
                C5510 c5510 = c24638.f77371;
                if (!c5510.f19183.m48863() || c5510.f19186) {
                    int[] iArr = C15647.f50806;
                    C24705 c24705 = this.f12750;
                    c24705.getClass();
                    int i2 = iArr[c24705.m55153(c24638.f69124.f73596).ordinal()];
                    if (i2 == 2) {
                        c184910.m43089(c24638);
                    } else if (i2 == 3) {
                        c18499.m43089(c24638);
                    }
                }
            }
        }
        int iM43094 = c18499.m43094();
        C9002 c9002 = this.f12754;
        C15252 c15252 = this.f12767;
        if (iM43094 != 0) {
            int iM12095 = m12095(c15252.f49754);
            c9002.m24022(c18499.m43094());
            Iterator it2 = c18499.iterator();
            while (it2.hasNext()) {
                m12093((C24638) it2.next());
            }
            m12088(iM12095);
            i = 1;
        }
        if (c184910.m43094() == 0) {
            return i;
        }
        int iM12096 = m12095(c15252.f49820);
        c9002.m24022(c184910.m43094());
        Iterator it3 = c184910.iterator();
        while (it3.hasNext()) {
            m12093((C24638) it3.next());
        }
        m12088(iM12096);
        return i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12092(C23892 c23892) {
        AbstractC22664 abstractC22664 = c23892.f69124;
        C15559 c15559 = this.f12764;
        int iM37276 = c15559.m37276(abstractC22664);
        C9002 c9002 = this.f12754;
        c9002.m24022(iM37276);
        C14769<C5558> c14769 = c23892.f77372;
        c9002.m24022(c14769.m35551());
        for (C5558 c5558 : c14769) {
            c9002.m24022(C20035.m46076(c15559.f50605, ((C10377) c5558.f19300).f38072));
            ((AbstractC21654) c5558.f19301).mo12192(this.f12751);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12093(C24638 c24638) {
        C5510 c5510 = c24638.f77371;
        EnumC21478 enumC21478 = c5510.f19183;
        int i = c5510.f19187;
        int i2 = c5510.f19181;
        int iM48864 = enumC21478.m48864();
        C9002 c9002 = this.f12754;
        c9002.m24017(iM48864);
        switch (C15647.f50807[c5510.f19183.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c9002.m24022(c5510.f19174);
                break;
            case 5:
            case 6:
                c9002.m24022(c5510.f19176.length);
                int i3 = 0;
                while (true) {
                    int[] iArr = c5510.f19176;
                    if (i3 < iArr.length) {
                        c9002.m24022(iArr[i3]);
                        c9002.m24022(c5510.f19179[i3]);
                        c9002.m24022(c5510.f19180[i3]);
                        i3++;
                    }
                    break;
                }
                break;
            case 7:
                c9002.m24022(c5510.m16410());
                break;
            case 8:
            case 21:
            case 22:
                break;
            case 9:
            case 10:
                c9002.m24017(i);
                break;
            case 11:
            case 12:
                c9002.m24017(i);
                c9002.m24017(c5510.f19175);
                break;
            case 13:
                c9002.m24022(i2);
                break;
            case 14:
                c9002.m24022(i2);
                break;
            case 15:
                c9002.m24017(i);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                c9002.m24022(c5510.f19174);
                c9002.m24017(i2);
                break;
            case 23:
                throw new AssertionError("jvm.ClassWriter: UNKNOWN target type should never occur!");
            default:
                throw new AssertionError("jvm.ClassWriter: Unknown target type for position: " + c5510);
        }
        c9002.m24017(c5510.f19184.m35551());
        C14769<C15204> c14769 = c5510.f19184;
        C18499 c18499 = new C18499();
        for (C15204 c15204 : c14769) {
            c18499.m43089(Integer.valueOf(c15204.f49634.f41578));
            c18499.m43089(Integer.valueOf(c15204.f49633));
        }
        Iterator it = c18499.m43093().iterator();
        while (it.hasNext()) {
            c9002.m24017((byte) ((Integer) it.next()).intValue());
        }
        m12092((C23892) c24638);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12075(final C3715 c3715, C24550 c24550, Set set) {
        C9002 c9002 = c3715.f12754;
        C15559 c15559 = c3715.f12764;
        c15559.getClass();
        c9002.m24022(c15559.m37272(c24550.f38067));
        c9002.m24022(set.size());
        C4937.forEach(set, new Consumer() { // from class: l.ᩴ᩹ۘ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C3715 c3716 = this.f64630;
                C9002 c9003 = c3716.f12754;
                C15559 c155510 = c3716.f12764;
                c155510.getClass();
                c9003.m24022(c155510.m37272(((C24550) obj).f38067));
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12096() {
        int iM37272;
        int iM12095 = m12095(this.f12767.f49776);
        C15559 c15559 = this.f12764;
        int size = c15559.f50604.size();
        C9002 c9002 = this.f12754;
        c9002.m24022(size);
        for (C24550 c24550 : c15559.f50604) {
            c24550.m54837(this.f12750);
            char cM12082 = (char) m12082(c24550.f38071);
            if ((cM12082 & 512) != 0) {
                cM12082 = (char) (cM12082 | 1024);
            }
            char c = (char) (cM12082 & (-2049));
            if (this.f12757) {
                PrintWriter printWriterM20031 = this.f12762.m20031(EnumC8803.ERROR);
                printWriterM20031.println("INNERCLASS  " + ((Object) c24550.f38072));
                printWriterM20031.println("---" + m12079((long) c));
            }
            c15559.getClass();
            c9002.m24022(c15559.m37272(c24550.f38067));
            int iM46076 = 0;
            if (c24550.f38069.f38066 != EnumC13603.f43213 || c24550.f38072.isEmpty()) {
                iM37272 = 0;
            } else {
                C24550 c24551 = (C24550) c24550.f38069;
                c15559.getClass();
                iM37272 = c15559.m37272(c24551.f38067);
            }
            c9002.m24022(iM37272);
            if (!c24550.f38072.isEmpty()) {
                iM46076 = C20035.m46076(c15559.f50605, c24550.f38072);
            }
            c9002.m24022(iM46076);
            c9002.m24022(c);
        }
        m12088(iM12095);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12076(AbstractC11781 abstractC11781, C18499 c18499) {
        if (abstractC11781.f38066 != EnumC13603.f43213) {
            return;
        }
        C24550 c24550 = (C24550) abstractC11781;
        if (c24550.f38069.f38066 != EnumC13603.f43219) {
            c18499.m43089(c24550);
        }
        c24550.mo29590();
        if (c24550.f79576 != null) {
            AbstractC17836 abstractC17836Mo29571 = abstractC11781.mo29571();
            abstractC17836Mo29571.getClass();
            Iterator it = abstractC17836Mo29571.mo7472((Predicate) null, EnumC13908.RECURSIVE).iterator();
            while (it.hasNext()) {
                m12076((AbstractC11781) it.next(), c18499);
            }
        }
        C14769 c14769 = c24550.f79582;
        if (c14769 != null) {
            Iterator it2 = c14769.iterator();
            while (it2.hasNext()) {
                m12076((AbstractC11781) it2.next(), c18499);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12091(AbstractC22664 abstractC22664) {
        boolean z = this.f12766;
        C9002 c9002 = this.f12754;
        if (abstractC22664 == null) {
            if (z) {
                System.out.print(b.f);
            }
            c9002.m24017(0);
            return;
        }
        switch (C15647.f50810[abstractC22664.mo9097().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                if (z) {
                    System.out.print(ClassTransform.INTEGER);
                }
                c9002.m24017(1);
                return;
            case 5:
                if (z) {
                    System.out.print(ClassTransform.LONG);
                }
                c9002.m24017(4);
                return;
            case 6:
                if (z) {
                    System.out.print(ClassTransform.FLOAT);
                }
                c9002.m24017(2);
                return;
            case 7:
                if (z) {
                    System.out.print(ClassTransform.DOUBLE);
                }
                c9002.m24017(3);
                return;
            case 9:
                if (z) {
                    System.out.print("null");
                }
                c9002.m24017(5);
                return;
            case 10:
            case 11:
            case 12:
                C24705 c24705 = this.f12750;
                if (z) {
                    System.out.print("object(" + c24705.m55132(abstractC22664).f73596 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c9002.m24017(7);
                c9002.m24022(this.f12764.m37272(c24705.m55132(abstractC22664)));
                return;
            case 13:
                if (z) {
                    System.out.print("uninit_this");
                }
                c9002.m24017(6);
                return;
            case 14:
                int i = ((C23765) abstractC22664).f77001;
                c9002.m24017(8);
                if (z) {
                    System.out.print("uninit_object@" + i);
                }
                c9002.m24022(i);
                return;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12090(OutputStream outputStream, C24550 c24550) throws IOException {
        int i;
        int iM37272;
        C24550 c24551;
        int i2;
        int i3;
        EnumC16305 enumC16305;
        int i4;
        int i5;
        int i6;
        C10377 c10377;
        C20035 c20035;
        C7312 c7312;
        C15252 c15252;
        int i7;
        C24705 c24705;
        C24705 c24706;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        C10377 c10378;
        int i10;
        int i11;
        C10377 c10379;
        EnumC1478 enumC1478;
        C15252 c15253;
        C10377 c103710;
        String str;
        C22092 c22092;
        C23677 c23677;
        int i12;
        int i13;
        C7312 c7313;
        String str2;
        int i14;
        c24550.mo29590();
        C11972.m30026((c24550.f38071 & 16777216) == 0);
        C9002 c9002 = this.f12754;
        c9002.f29318 = 0;
        C9002 c9003 = this.f12756;
        c9003.f29318 = 0;
        AbstractC22664 abstractC22664 = c24550.f38067;
        C24705 c24707 = this.f12750;
        AbstractC22664 abstractC22664M55137 = c24707.m55137(abstractC22664);
        C14769 c14769M55144 = c24707.m55144(c24550.f38067);
        C14769 c14769Mo15882 = c24550.f38067.mo15882();
        EnumC13603 enumC13603 = c24550.f38069.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43214;
        if (enumC13603 == enumC13604) {
            i = 32768;
        } else {
            c24550.mo29590();
            int iM12082 = m12082(c24550.f38071 & (-8796093022209L));
            if ((iM12082 & 4) != 0) {
                iM12082 |= 1;
            }
            int i15 = iM12082 & 30225;
            i = (iM12082 & 512) == 0 ? i15 | 32 : i15;
        }
        boolean z3 = this.f12763;
        String str3 = "---";
        C7312 c7314 = this.f12762;
        if (z3) {
            PrintWriter printWriterM20031 = c7314.m20031(EnumC8803.ERROR);
            printWriterM20031.println();
            printWriterM20031.println("CLASSFILE  " + ((Object) c24550.f79577));
            printWriterM20031.println("---" + m12079((long) i));
        }
        c9002.m24022(i);
        AbstractC11781 abstractC11781 = c24550.f38069;
        EnumC13603 enumC13605 = abstractC11781.f38066;
        C15252 c15254 = this.f12767;
        C15559 c15559 = this.f12764;
        if (enumC13605 == enumC13604) {
            C24550 c24552 = new C24550(0L, c15254.f49759, ((C2920) abstractC11781).f9550);
            c15559.getClass();
            c9002.m24022(c15559.m37272(c24552.f38067));
        } else {
            c15559.getClass();
            c9002.m24022(c15559.m37272(c24550.f38067));
        }
        if (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
            C24550 c24553 = (C24550) abstractC22664M55137.f73596;
            c15559.getClass();
            iM37272 = c15559.m37272(c24553.f38067);
        } else {
            iM37272 = 0;
        }
        c9002.m24022(iM37272);
        c9002.m24022(c14769M55144.m35551());
        for (C14769 c14769 = c14769M55144; c14769.m35550(); c14769 = c14769.f48336) {
            C24550 c24554 = (C24550) ((AbstractC22664) c14769.f48335).f73596;
            c15559.getClass();
            c9002.m24022(c15559.m37272(c24554.f38067));
        }
        c24550.mo29590();
        int i16 = 0;
        int i17 = 0;
        for (AbstractC11781 abstractC11782 : c24550.f79576.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            int i18 = C15647.f50809[abstractC11782.f38066.ordinal()];
            C14769 c147610 = c14769M55144;
            if (i18 == 1) {
                i16++;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    C11972.m30019();
                    throw null;
                }
                c15559.m37273((C24550) abstractC11782);
            } else if ((abstractC11782.mo29591() & 137438953472L) == 0) {
                i17++;
            }
            c14769M55144 = c147610;
        }
        C14769 c147611 = c14769M55144;
        C14769 c147612 = c24550.f79582;
        if (c147612 != null) {
            Iterator it = c147612.iterator();
            while (it.hasNext()) {
                c15559.m37273((C24550) it.next());
            }
        }
        c9002.m24022(i16);
        c24550.mo29590();
        AbstractC17836 abstractC17836 = c24550.f79576;
        C14769 c14769M35543 = C14769.m35543();
        for (AbstractC11781 abstractC11783 : abstractC17836.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (abstractC11783.f38066 == EnumC13603.f43205) {
                c14769M35543 = c14769M35543.m35552((C5816) abstractC11783);
            }
        }
        while (c14769M35543.m35550()) {
            C5816 c5816 = (C5816) c14769M35543.f48335;
            c9002.m24022(m12082(c5816.f38071));
            if (this.f12759) {
                c7313 = c7314;
                PrintWriter printWriterM20032 = c7313.m20031(EnumC8803.ERROR);
                printWriterM20032.println("FIELD  " + ((Object) c5816.f38072));
                str2 = str3;
                printWriterM20032.println(str2 + m12079(c5816.f38071));
            } else {
                c7313 = c7314;
                str2 = str3;
            }
            c9002.m24022(C20035.m46076(c15559.f50605, c5816.f38072));
            c9002.m24022(c15559.m37271((AbstractC11781) c5816));
            int iM12081 = m12081();
            if (c5816.m16959() != null) {
                int iM12095 = m12095(c15254.f49831);
                c9002.m24022(c15559.m37269(c5816.m16959()));
                m12088(iM12095);
                i14 = 1;
            } else {
                i14 = 0;
            }
            m12089(iM12081, i14 + m12084((AbstractC11781) c5816, false) + m12083(c5816));
            c14769M35543 = c14769M35543.f48336;
            c9003 = c9003;
            abstractC22664M55137 = abstractC22664M55137;
            c7314 = c7313;
            str3 = str2;
        }
        C7312 c7315 = c7314;
        String str4 = str3;
        C9002 c9004 = c9003;
        AbstractC22664 abstractC22665 = abstractC22664M55137;
        c9002.m24022(i17);
        c24550.mo29590();
        AbstractC17836 abstractC17837 = c24550.f79576;
        C14769 c14769M35544 = C14769.m35543();
        for (AbstractC11781 abstractC11784 : abstractC17837.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (abstractC11784.f38066 == EnumC13603.f43218 && (abstractC11784.mo29591() & 137438953472L) == 0) {
                c14769M35544 = c14769M35544.m35552((C10377) abstractC11784);
            }
        }
        while (true) {
            boolean zM35550 = c14769M35544.m35550();
            boolean z4 = this.f12761;
            EnumC16305 enumC16306 = this.f12768;
            if (!zM35550) {
                C15252 c15255 = c15254;
                C10377 c10377Mo26686 = null;
                int iM12083 = m12081();
                boolean z5 = (c14769Mo15882.m35551() == 0 && abstractC22665.mo9323().m35551() == 0) ? false : true;
                for (C14769 c147613 = c147611; !z5 && c147613.m35550(); c147613 = c147613.f48336) {
                    z5 = ((AbstractC22664) c147613.f48335).mo9323().m35551() != 0;
                }
                if (z5) {
                    int iM12096 = m12095(c15255.f49871);
                    c24551 = c24550;
                    c9002.m24022(c15559.m37274(c24551));
                    m12088(iM12096);
                    i2 = 1;
                } else {
                    c24551 = c24550;
                    i2 = 0;
                }
                if (c24551.f79584 != null && this.f12748) {
                    int iM12097 = m12095(c15255.f49828);
                    InterfaceC15976 interfaceC15976 = c24551.f79584;
                    int i19 = AbstractC13234.f42297;
                    String schemeSpecificPart = interfaceC15976.toUri().getSchemeSpecificPart();
                    c9002.m24022(C20035.m46076(c15559.f50605, c15255.f49864.m51194(schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1))));
                    m12088(iM12097);
                    i2++;
                }
                if (z4) {
                    AbstractC19728 abstractC19728 = c15255.f49832;
                    AbstractC22712 abstractC22712 = c15255.f49864;
                    int iM12098 = m12095(abstractC19728);
                    try {
                        c9002.m24022(C20035.m46076(c15559.f50605, abstractC22712.m51194(Long.toString(c24551.f79584.mo10890()))));
                        m12088(iM12098);
                        int iM12099 = m12095(c15255.f49827);
                        c9002.m24022(C20035.m46076(c15559.f50605, abstractC22712.m51194(Long.toString(System.currentTimeMillis()))));
                        m12088(iM12099);
                        i2 += 2;
                    } catch (SecurityException e) {
                        throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
                    }
                }
                c24550.mo29590();
                int iM12085 = m12085(c24550.mo29568()) + i2 + m12094(c24551.f38071) + m12086(c24550.mo29597(), false);
                AbstractC19728 abstractC19729 = c15255.f49862;
                EnumC13603 enumC13606 = c24551.f38069.f38066;
                EnumC13603 enumC13607 = EnumC13603.f43218;
                if (enumC13606 == enumC13607 || c24551.f38072 == c15255.f49799) {
                    int iM120910 = m12095(abstractC19729);
                    C24550 c24550M29558 = c24551.f38069.m29558();
                    AbstractC11781 abstractC11785 = c24551.f38069;
                    if (abstractC11785.f38067 != null && abstractC11785.f38066 == enumC13607) {
                        c10377Mo26686 = ((C10377) abstractC11785).mo26686();
                    }
                    c15559.getClass();
                    c9002.m24022(c15559.m37272(c24550M29558.f38067));
                    c9002.m24022(c10377Mo26686 == null ? 0 : c15559.m37275(c10377Mo26686));
                    m12088(iM120910);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int iM12094 = iM12085 + i3;
                AbstractC11781 abstractC11786 = c24551.f38069;
                if (abstractC11786.f38066 == EnumC13603.f43214) {
                    C2920 c2920 = (C2920) abstractC11786;
                    int iM120911 = m12095(c15255.f49793);
                    C20035 c20036 = c15559.f50605;
                    c9002.m24022(C20035.m46076(c20036, c2920));
                    c9002.m24022(EnumC1429.m5163(c2920.f9552));
                    AbstractC19728 abstractC197210 = c2920.f9556;
                    c9002.m24022(abstractC197210 != null ? C20035.m46076(c20036, abstractC197210) : 0);
                    C18499<C0180> c18499 = new C18499();
                    for (C0180 c0180 : c2920.f9551) {
                        if (!c0180.f1261.contains(EnumC7638.EXTRA)) {
                            c18499.m43089(c0180);
                        }
                    }
                    c9002.m24022(c18499.size());
                    for (C0180 c0181 : c18499) {
                        c9002.m24022(C20035.m46076(c20036, c0181.f1262));
                        c9002.m24022(EnumC7638.m20855(c0181.f1261));
                        AbstractC19728 abstractC197211 = c0181.f1262.f9556;
                        c9002.m24022(abstractC197211 != null ? C20035.m46076(c20036, abstractC197211) : 0);
                    }
                    C14769<C24047> c147614 = c2920.f9546;
                    c9002.m24022(c147614.m35551());
                    for (C24047 c24047 : c147614) {
                        C14106 c14106 = c24047.f77785;
                        C14769 c147615 = c24047.f77786;
                        c9002.m24022(C20035.m46076(c20036, c14106));
                        c9002.m24022(EnumC3909.m12611(c24047.f77784));
                        if (c147615 == null) {
                            c9002.m24022(0);
                        } else {
                            c9002.m24022(c147615.m35551());
                            Iterator it2 = c147615.iterator();
                            while (it2.hasNext()) {
                                c9002.m24022(C20035.m46076(c20036, (C2920) it2.next()));
                            }
                        }
                    }
                    C14769<C14349> c147616 = c2920.f9558;
                    c9002.m24022(c147616.m35551());
                    for (C14349 c14349 : c147616) {
                        C14106 c14107 = c14349.f45255;
                        C14769 c147617 = c14349.f45256;
                        c9002.m24022(C20035.m46076(c20036, c14107));
                        c9002.m24022(EnumC21063.m48135(c14349.f45254));
                        if (c147617 == null) {
                            c9002.m24022(0);
                        } else {
                            c9002.m24022(c147617.m35551());
                            Iterator it3 = c147617.iterator();
                            while (it3.hasNext()) {
                                c9002.m24022(C20035.m46076(c20036, (C2920) it3.next()));
                            }
                        }
                    }
                    C14769 c147618 = c2920.f9560;
                    c9002.m24022(c147618.m35551());
                    Iterator it4 = c147618.iterator();
                    while (it4.hasNext()) {
                        c9002.m24022(c15559.m37272(((C18825) it4.next()).f61181.f38067));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C18079 c18079 : c2920.f9557) {
                        ((Set) C11392.computeIfAbsent(linkedHashMap, c18079.f59179, new C3900(10))).addAll(c18079.f59178);
                    }
                    c9002.m24022(linkedHashMap.size());
                    C11392.forEach(linkedHashMap, new BiConsumer() { // from class: l.᩸᩹ۘ
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            C3715.m12075(this.f74912, (C24550) obj, (Set) obj2);
                        }

                        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return C23501.$default$andThen(this, biConsumer);
                        }
                    });
                    m12088(iM120911);
                    iM12094 = iM12094 + 1 + m12094(c24551.f38069.mo29591() & (-131073));
                }
                int iM12084 = iM12094 + m12083((AbstractC11781) c24551);
                c9004.m24020(-889275714);
                C17638 c17638 = this.f12753;
                if (c17638.m41295() && c17638.m41296(c24551.f79584)) {
                    c9004.m24022(65535);
                    enumC16305 = enumC16306;
                } else {
                    enumC16305 = enumC16306;
                    c9004.m24022(enumC16305.f52945);
                }
                c9004.m24022(enumC16305.f52943);
                if (c24551.f38069.f38066 != EnumC13603.f43214 && enumC16305.m38667()) {
                    C18499 c184910 = new C18499();
                    m12076(c24551, c184910);
                    LinkedHashSet<C24550> linkedHashSet = new LinkedHashSet(c184910);
                    if (c24551.f38069.f38066 != EnumC13603.f43219 || linkedHashSet.isEmpty()) {
                        i5 = 0;
                    } else {
                        int iM120912 = m12095(c15255.f49757);
                        c9002.m24022(linkedHashSet.size());
                        for (C24550 c24555 : linkedHashSet) {
                            c15559.getClass();
                            c9002.m24022(c15559.m37272(c24555.f38067));
                        }
                        m12088(iM120912);
                        i5 = 1;
                    }
                    int i20 = iM12084 + i5;
                    if (c24551.f38069.f38066 != EnumC13603.f43219) {
                        int iM120913 = m12095(c15255.f49790);
                        C24550 c24550Mo9564 = c24550.mo9564();
                        c15559.getClass();
                        c9002.m24022(c15559.m37272(c24550Mo9564.f38067));
                        m12088(iM120913);
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    iM12084 = i20 + i6;
                }
                if (c24550.m54827()) {
                    int iM120914 = m12095(c15255.f49797);
                    c24550.mo29571();
                    c9002.m24022(c24550.m54835().m35551());
                    for (AbstractC11781 abstractC11787 : c24550.m54835()) {
                        c9002.m24022(C20035.m46076(c15559.f50605, abstractC11787.f38072));
                        c9002.m24022(c15559.m37271(abstractC11787));
                        m12089(m12081(), m12084(abstractC11787, true));
                    }
                    i4 = 1;
                    m12088(iM120914);
                    iM12084++;
                } else {
                    i4 = 1;
                }
                if (enumC16305.m38665()) {
                    if (c24551.f79583.m35550()) {
                        int iM120915 = m12095(c15255.f49812);
                        c9002.m24022(c24551.f79583.m35551());
                        Iterator it5 = c24551.f79583.iterator();
                        while (it5.hasNext()) {
                            C24550 c24556 = (C24550) ((AbstractC11781) it5.next());
                            c15559.getClass();
                            c9002.m24022(c15559.m37272(c24556.f38067));
                        }
                        m12088(iM120915);
                    } else {
                        i4 = 0;
                    }
                    iM12084 += i4;
                }
                LinkedHashMap linkedHashMap2 = c15559.f50600;
                C20035 c20037 = c15559.f50605;
                LinkedHashSet linkedHashSet2 = c15559.f50604;
                if (!linkedHashMap2.isEmpty()) {
                    int iM120916 = m12095(c15255.f49842);
                    c9002.m24022(c15559.f50600.size());
                    for (C9835 c9835 : c15559.f50600.keySet()) {
                        c9002.m24022(c15559.m37270(c9835.f31653));
                        InterfaceC8344[] interfaceC8344Arr = c9835.f31656;
                        c9002.m24022(interfaceC8344Arr.length);
                        for (InterfaceC8344 interfaceC8344 : interfaceC8344Arr) {
                            c9002.m24022(c15559.m37270(interfaceC8344));
                        }
                    }
                    m12088(iM120916);
                    iM12084++;
                }
                if (!linkedHashSet2.isEmpty()) {
                    m12096();
                    iM12084++;
                }
                m12089(iM12083, iM12084);
                outputStream.write(c9004.f29317, 0, c9004.f29318);
                if (c20037.f64349 != null) {
                    throw new C23853(c20037.f64349);
                }
                int i21 = c20037.f64348;
                if (i21 > 65535) {
                    throw new C5953();
                }
                outputStream.write(i21 >> 8);
                outputStream.write(i21);
                C9002 c9005 = c20037.f64353;
                outputStream.write(c9005.f29317, 0, c9005.f29318);
                linkedHashSet2.clear();
                c15559.f50600.clear();
                c20037.m46077();
                outputStream.write(c9002.f29317, 0, c9002.f29318);
                return;
            }
            C10377 c103711 = (C10377) c14769M35544.f48335;
            c9002.m24022(m12082(c103711.f38071));
            if (this.f12752) {
                PrintWriter printWriterM20033 = c7315.m20031(EnumC8803.ERROR);
                printWriterM20033.println("METHOD  " + ((Object) c103711.f38072));
                printWriterM20033.println(str4 + m12079(c103711.f38071));
            }
            AbstractC19728 abstractC197212 = c103711.f38072;
            C20035 c20038 = c15559.f50605;
            c9002.m24022(C20035.m46076(c20038, abstractC197212));
            c9002.m24022(c15559.m37271((AbstractC11781) c103711));
            int iM12086 = m12081();
            if (c103711.f33009 != null) {
                int iM120917 = m12095(c15254.f49870);
                C8935 c8935 = c103711.f33009;
                int i22 = c8935.f29149;
                EnumC1478 enumC1479 = c8935.f29143;
                C10377 c103712 = c8935.f29141;
                c9002.m24022(i22);
                c9002.m24022(c8935.f29160);
                c9002.m24020(c8935.f29163);
                c9002.m24018(0, c8935.f29163, c8935.f29147);
                c9002.m24022(c8935.f29162.m43094());
                C14769 c14769M43093 = c8935.f29162.m43093();
                while (c14769M43093.m35550()) {
                    int i23 = 0;
                    while (true) {
                        char[] cArr = (char[]) c14769M43093.f48335;
                        i13 = iM120917;
                        if (i23 < cArr.length) {
                            c9002.m24022(cArr[i23]);
                            i23++;
                            iM120917 = i13;
                        }
                    }
                    c14769M43093 = c14769M43093.f48336;
                    iM120917 = i13;
                }
                int i24 = iM120917;
                int iM12087 = m12081();
                if (c8935.f29154.m35550()) {
                    int iM120918 = m12095(c15254.f49764);
                    c9002.m24022(c8935.f29154.m35551());
                    C14769 c14769M35554 = c8935.f29154.m35554();
                    while (c14769M35554.m35550()) {
                        int i25 = 0;
                        C10377 c103713 = c103711;
                        while (true) {
                            char[] cArr2 = (char[]) c14769M35554.f48335;
                            i12 = iM12087;
                            if (i25 < cArr2.length) {
                                c9002.m24022(cArr2[i25]);
                                i25++;
                                iM12087 = i12;
                            }
                        }
                        c14769M35554 = c14769M35554.f48336;
                        c103711 = c103713;
                        iM12087 = i12;
                    }
                    c10378 = c103711;
                    i10 = iM12087;
                    m12088(iM120918);
                    i11 = 1;
                } else {
                    c10378 = c103711;
                    i10 = iM12087;
                    i11 = 0;
                }
                if (z4 && (c23677 = c8935.f29159) != null) {
                    int iM120919 = m12095(c15254.f49800);
                    m12089(m12081(), c23677.m52916(c9002, c8935.f29164, c7315));
                    m12088(iM120919);
                    i11++;
                }
                if (!c8935.f29139 || c8935.f29151 <= 0) {
                    c10379 = c103712;
                    enumC1478 = enumC1479;
                    c7312 = c7315;
                    c15253 = c15254;
                } else {
                    int iM120920 = m12095(c15254.f49815);
                    int size = c8935.f29151;
                    for (int i26 = 0; i26 < c8935.f29151; i26++) {
                        size += c8935.f29142[i26].f2664.size() - 1;
                    }
                    c9002.m24022(size);
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = c8935.f29151;
                        c22092 = this.f12765;
                        if (i27 >= i29) {
                            break;
                        }
                        C0732 c0732 = c8935.f29142[i27];
                        C7312 c7316 = c7315;
                        List list = c0732.f2664;
                        EnumC1478 enumC14710 = enumC1479;
                        C5816 c5817 = c0732.f2665;
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            Iterator it7 = it6;
                            C18631 c18631 = (C18631) it6.next();
                            C10377 c103714 = c103712;
                            char c = c18631.f60555;
                            C15252 c15256 = c15254;
                            C11972.m30026(c >= 0 && c <= c8935.f29163);
                            c9002.m24022(c);
                            char c2 = c18631.f60554;
                            C11972.m30026(c2 > 0 && c + c2 <= c8935.f29163);
                            c9002.m24022(c18631.f60554);
                            c9002.m24022(C20035.m46076(c20038, c5817.f38072));
                            c9002.m24022(c15559.m37271((AbstractC11781) c5817));
                            c9002.m24022(c0732.f2666);
                            AbstractC22664 abstractC22666 = c5817.f38067;
                            if (!c24707.m55149(abstractC22666, c24707.m55132(abstractC22666))) {
                                c22092.getClass();
                                if (C22092.m49945(abstractC22666)) {
                                    i28++;
                                }
                            }
                            c103712 = c103714;
                            it6 = it7;
                            c15254 = c15256;
                        }
                        i27++;
                        c7315 = c7316;
                        enumC1479 = enumC14710;
                    }
                    c10379 = c103712;
                    enumC1478 = enumC1479;
                    c7312 = c7315;
                    c15253 = c15254;
                    m12088(iM120920);
                    int i30 = i11 + 1;
                    if (i28 > 0) {
                        C15252 c15257 = c15253;
                        int iM120921 = m12095(c15257.f49850);
                        c9002.m24022(i28);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < c8935.f29151) {
                            C0732 c0733 = c8935.f29142[i31];
                            C5816 c5818 = c0733.f2665;
                            AbstractC22664 abstractC22667 = c5818.f38067;
                            C15252 c15258 = c15257;
                            if (!c24707.m55149(abstractC22667, c24707.m55132(abstractC22667))) {
                                c22092.getClass();
                                if (C22092.m49945(abstractC22667)) {
                                    for (Iterator it8 = c0733.f2664.iterator(); it8.hasNext(); it8 = it8) {
                                        C18631 c18632 = (C18631) it8.next();
                                        c9002.m24022(c18632.f60555);
                                        c9002.m24022(c18632.f60554);
                                        c9002.m24022(C20035.m46076(c20038, c5818.f38072));
                                        c9002.m24022(c15559.m37274(c5818));
                                        c9002.m24022(c0733.f2666);
                                        i32++;
                                    }
                                }
                            }
                            i31++;
                            c15257 = c15258;
                        }
                        c15253 = c15257;
                        C11972.m30026(i32 == i28);
                        m12088(iM120921);
                        i11 += 2;
                    } else {
                        i11 = i30;
                    }
                }
                if (c8935.f29146 > 0) {
                    boolean z6 = this.f12766;
                    if (z6) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("Stack map for ");
                        c103710 = c10379;
                        sb.append(c103710);
                        printStream.println(sb.toString());
                    } else {
                        c103710 = c10379;
                    }
                    EnumC1478 enumC14711 = enumC1478;
                    c15252 = c15253;
                    int iM120922 = m12095(enumC14711.mo5268(c15252));
                    int i33 = c8935.f29146;
                    if (z6) {
                        System.out.println(" nframes = " + i33);
                    }
                    c9002.m24022(i33);
                    int i34 = C15647.f50808[enumC14711.ordinal()];
                    String str5 = ":";
                    String str6 = EnumC7687.f25319;
                    if (i34 == 1) {
                        c20035 = c20038;
                        int i35 = 0;
                        while (i35 < i33) {
                            if (z6) {
                                System.out.print(str6 + i35 + str5);
                            }
                            C9680 c9680 = c8935.f29158[i35];
                            if (z6) {
                                System.out.print(" pc=" + c9680.f31255);
                            }
                            c9002.m24022(c9680.f31255);
                            int iM23856 = 0;
                            int i36 = 0;
                            while (true) {
                                AbstractC22664[] abstractC22664Arr = c9680.f31253;
                                str = str6;
                                if (iM23856 >= abstractC22664Arr.length) {
                                    break;
                                }
                                i36++;
                                iM23856 += C8935.m23856(abstractC22664Arr[iM23856]);
                                str6 = str;
                            }
                            if (z6) {
                                System.out.print(" nlocals=" + i36);
                            }
                            c9002.m24022(i36);
                            int iM23857 = 0;
                            while (iM23857 < c9680.f31253.length) {
                                if (z6) {
                                    System.out.print(" local[" + iM23857 + "]=");
                                }
                                m12091(c9680.f31253[iM23857]);
                                iM23857 += C8935.m23856(c9680.f31253[iM23857]);
                                c8935 = c8935;
                            }
                            C8935 c8936 = c8935;
                            int iM23858 = 0;
                            int i37 = 0;
                            while (true) {
                                AbstractC22664[] abstractC22664Arr2 = c9680.f31254;
                                if (iM23858 >= abstractC22664Arr2.length) {
                                    break;
                                }
                                i37++;
                                iM23858 += C8935.m23856(abstractC22664Arr2[iM23858]);
                            }
                            if (z6) {
                                System.out.print(" nstack=" + i37);
                            }
                            c9002.m24022(i37);
                            for (int iM23859 = 0; iM23859 < c9680.f31254.length; iM23859 += C8935.m23856(c9680.f31254[iM23859])) {
                                if (z6) {
                                    System.out.print(" stack[" + iM23859 + "]=");
                                }
                                m12091(c9680.f31254[iM23859]);
                            }
                            if (z6) {
                                System.out.println();
                            }
                            i35++;
                            i33 = i33;
                            str5 = str5;
                            str6 = str;
                            c8935 = c8936;
                        }
                    } else {
                        if (i34 != 2) {
                            throw new AssertionError("Unexpected stackmap format value");
                        }
                        C11972.m30030(c8935.f29158);
                        int i38 = 0;
                        while (i38 < i33) {
                            if (z6) {
                                System.out.print(EnumC7687.f25319 + i38 + ":");
                            }
                            c8935.f29133[i38].mo7569(this);
                            if (z6) {
                                System.out.println();
                            }
                            i38++;
                            c20038 = c20038;
                        }
                        c20035 = c20038;
                    }
                    m12088(iM120922);
                    i11++;
                } else {
                    c20035 = c20038;
                    c103710 = c10379;
                    c15252 = c15253;
                }
                m12089(i10, i11 + m12086(c103710.mo29597(), true));
                c10377 = c10378;
                c10377.f33009 = null;
                m12088(i24);
                i7 = 1;
            } else {
                c10377 = c103711;
                c20035 = c20038;
                c7312 = c7315;
                c15252 = c15254;
                i7 = 0;
            }
            C14769 c14769Mo50622 = c10377.mo29576(c24707).mo50622();
            if (c14769Mo50622.m35550()) {
                int iM120923 = m12095(c15252.f49846);
                c9002.m24022(c14769Mo50622.m35551());
                while (c14769Mo50622.m35550()) {
                    c9002.m24022(c15559.m37272((AbstractC22664) c14769Mo50622.f48335));
                    c14769Mo50622 = c14769Mo50622.f48336;
                }
                m12088(iM120923);
                i7++;
            }
            if (c10377.f33011 != null) {
                int iM120924 = m12095(c15252.f49796);
                c10377.f33011.mo12192(this.f12751);
                m12088(iM120924);
                i7++;
            }
            if (!enumC16306.m38669() || ((!this.f12749.m32433(EnumC7687.f25356) && (!c10377.m29570() || (c10377.f38071 & 2305843009213693952L) == 0)) || (c10377.f38071 & 562949953421312L) == 562949953421312L)) {
                c24705 = c24707;
            } else {
                int iM35551 = c10377.m29598(c24707).mo15883().f75155.m35551();
                if (c10377.f33013 == null || iM35551 == 0) {
                    c24705 = c24707;
                    i9 = 0;
                } else {
                    int iM120925 = m12095(c15252.f49839);
                    c9002.m24017(iM35551);
                    for (C5816 c5819 : c10377.f33010) {
                        int i39 = (36880 & ((int) c5819.f38071)) | (((int) c10377.f38071) & 4096);
                        c9002.m24022(C20035.m46076(c20035, c5819.f38072));
                        c9002.m24022(i39);
                    }
                    C20035 c20039 = c20035;
                    for (C5816 c58110 : c10377.f33013) {
                        int i40 = (36880 & ((int) c58110.f38071)) | (((int) c10377.f38071) & 4096);
                        c9002.m24022(C20035.m46076(c20039, c58110.f38072));
                        c9002.m24022(i40);
                    }
                    int i41 = 36880;
                    for (C5816 c58111 : c10377.f33012) {
                        int i42 = (((int) c10377.f38071) & 4096) | (((int) c58111.f38071) & i41);
                        c9002.m24022(C20035.m46076(c20039, c58111.f38072));
                        c9002.m24022(i42);
                        c24707 = c24707;
                        i41 = 36880;
                    }
                    c24705 = c24707;
                    m12088(iM120925);
                    i9 = 1;
                }
                i7 += i9;
            }
            int iM12088 = i7 + m12084((AbstractC11781) c10377, false);
            if ((c10377.f38071 & 562949953421312L) == 562949953421312L) {
                c24706 = c24705;
            } else {
                C14769 c147619 = c10377.f33013;
                if (c147619 != null) {
                    Iterator it9 = c147619.iterator();
                    z = false;
                    z2 = false;
                    while (it9.hasNext()) {
                        Iterator it10 = ((C5816) it9.next()).mo29568().iterator();
                        while (it10.hasNext()) {
                            C24705 c24708 = c24705;
                            int i43 = C15647.f50806[c24708.m55153(((C23892) it10.next()).f69124.f73596).ordinal()];
                            if (i43 == 2) {
                                z2 = true;
                            } else if (i43 == 3) {
                                z = true;
                            }
                            c24705 = c24708;
                        }
                    }
                    c24706 = c24705;
                } else {
                    c24706 = c24705;
                    z = false;
                    z2 = false;
                }
                if (z) {
                    int iM120926 = m12095(c15252.f49773);
                    m12077(c147619, EnumC6738.RUNTIME);
                    m12088(iM120926);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (z2) {
                    int iM120927 = m12095(c15252.f49843);
                    m12077(c147619, EnumC6738.CLASS);
                    m12088(iM120927);
                    i8++;
                }
                iM12088 += i8;
            }
            m12089(iM12086, iM12088 + m12083(c10377));
            c24707 = c24706;
            str4 = str4;
            c14769Mo15882 = c14769Mo15882;
            c7315 = c7312;
            c15254 = c15252;
            c14769M35544 = c14769M35544.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m12087(C24550 c24550) throws IOException {
        InterfaceC24928 interfaceC24928Mo6994;
        C7312 c7312 = this.f12762;
        EnumC13603 enumC13603 = c24550.f38069.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43214;
        String string = (enumC13603 == enumC13604 ? c24550.f38072 : c24550.f79578).toString();
        boolean z = this.f12760;
        InterfaceC16722 interfaceC16722 = this.f12769;
        if (z) {
            AbstractC11781 abstractC11781 = c24550.f38069;
            interfaceC24928Mo6994 = interfaceC16722.mo6994(EnumC6282.CLASS_OUTPUT, (abstractC11781.f38066 == enumC13604 ? (C2920) abstractC11781 : c24550.m29564().f44618).f38072.toString());
        } else {
            interfaceC24928Mo6994 = EnumC6282.CLASS_OUTPUT;
        }
        InterfaceC15976 interfaceC15976Mo6984 = interfaceC16722.mo6984(interfaceC24928Mo6994, string, EnumC17468.CLASS, c24550.f79584);
        OutputStream outputStreamMo10888 = interfaceC15976Mo6984.mo10888();
        try {
            try {
                m12090(outputStreamMo10888, c24550);
                if (this.f12758) {
                    c7312.m20044("wrote.file", interfaceC15976Mo6984.getName());
                }
                outputStreamMo10888.close();
                return interfaceC15976Mo6984;
            } catch (C18999 e) {
                AbstractC22664 abstractC22664M44095 = e.m44095();
                C15515 c15515 = C19859.f63823;
                c7312.m34525(C22843.m51552(c24550, new C15515("compiler", "illegal.signature", c24550, abstractC22664M44095)));
                if (outputStreamMo10888 == null) {
                    return interfaceC15976Mo6984;
                }
                outputStreamMo10888.close();
                interfaceC15976Mo6984.delete();
                return null;
            }
        } catch (Throwable th) {
            if (outputStreamMo10888 != null) {
                outputStreamMo10888.close();
                interfaceC15976Mo6984.delete();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12083(AbstractC11781 abstractC11781) {
        Iterator it = this.f12755.iterator();
        int iApplyAsInt = 0;
        while (it.hasNext()) {
            iApplyAsInt += ((ToIntFunction) it.next()).applyAsInt(abstractC11781);
        }
        return iApplyAsInt;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12082(long j) {
        int i = (int) j;
        if (this.f12768.m38670()) {
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
