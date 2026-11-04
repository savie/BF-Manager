package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f18436;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C3390 f18437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0407 f18438;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m15736(int i) {
        if (i >= 65536) {
            return true;
        }
        char c = (char) i;
        int i2 = C18446.f60051;
        return c >= 55296 && c < 57344;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10673 m15734(C0407 c0407) {
        if (!(c0407 instanceof C16640)) {
            return null;
        }
        C10673 c10673 = new C10673();
        c10673.f33882 = ((C16640) c0407).f53784;
        if (c0407.getClass() == C6200.class) {
            C6200 c6200 = (C6200) c0407;
            c10673.f33878 = 1;
            c10673.f33881 = c6200.f21109;
            c10673.f33879 = c6200.f21109.f1952;
            c10673.f33884 = (int[]) c6200.f21108.clone();
            return c10673;
        }
        if (c0407.getClass() == C17386.class) {
            C17386 c17386 = (C17386) c0407;
            c10673.f33878 = 2;
            c10673.f33881 = c17386.f56542;
            c10673.f33879 = c17386.f56542.f1952;
            c10673.f33880 = c17386.f56543;
            return c10673;
        }
        if (c0407.getClass() == C23354.class) {
            C23354 c23354 = (C23354) c0407;
            c10673.f33878 = 3;
            c10673.f33881 = c23354.f75636;
            c10673.f33883 = Arrays.copyOf(c23354.f75635.f15783, c23354.f75635.f15784);
            return c10673;
        }
        if (c0407.getClass() == C15894.class) {
            C15894 c15894 = (C15894) c0407;
            c10673.f33878 = 4;
            c10673.f33881 = c15894.f51659;
            c10673.f33880 = c15894.f51660;
            return c10673;
        }
        if (c0407.getClass() == C20370.class) {
            C20370 c20370 = (C20370) c0407;
            c10673.f33878 = 5;
            c10673.f33881 = c20370.f65328;
            c10673.f33875 = new C21862(c20370.f65327);
            c10673.f33876 = c20370.f65326;
            return c10673;
        }
        if (c0407.getClass() != C3216.class) {
            return null;
        }
        C3216 c3216 = (C3216) c0407;
        c10673.f33878 = 6;
        c10673.f33881 = c3216.f10483;
        c10673.f33875 = new C21862(c3216.f10481);
        c10673.f33880 = c3216.f10480;
        c10673.f33877 = c3216.f10482;
        return c10673;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21862 m15731(C0407 c0407) {
        if (c0407 instanceof C4136) {
            InterfaceC24274 interfaceC24274 = ((C4136) c0407).f14031;
            if (C1402.m5130(interfaceC24274)) {
                return new C21862(((C4708) interfaceC24274).f16613);
            }
        }
        throw new IllegalArgumentException("Unknown looking-at check: ".concat(c0407.getClass().getName()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC2885 m15735(C0407 c0407) {
        if (c0407 instanceof C21290) {
            return ((C21290) c0407).f67889;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15733(C8106 c8106) {
        return c8106.f26770;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2885 m15729(InterfaceC2885 interfaceC2885, InterfaceC2885 interfaceC2886, InterfaceC2885 interfaceC2887, boolean z) {
        return C0891.m3624(C0891.m3624(interfaceC2885, interfaceC2886, z), interfaceC2887, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC12580 m15730(int i) {
        return new C22608(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15728(InterfaceC2885 interfaceC2885) {
        if (interfaceC2885 instanceof C3631) {
            return ((C3631) interfaceC2885).f12444.length << 6;
        }
        if (interfaceC2885 instanceof C11834) {
            return ((C11834) interfaceC2885).f38163.length << 6;
        }
        int iM33756 = C13830.m33756(interfaceC2885);
        if (iM33756 >= 0) {
            return iM33756 + 1;
        }
        return 65536;
    }

    static {
        int[] iArrCopyOf = new int[4096];
        int i = 0;
        for (int i2 = 0; i2 <= 65535; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                }
                iArrCopyOf[i] = i2;
                i++;
            }
        }
        f18436 = Arrays.copyOf(iArrCopyOf, i);
        f18438 = new C0407();
        f18437 = new C3390();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C19161 m15737(C0407 c0407) {
        return C7119.m19517(c0407);
    }
}
