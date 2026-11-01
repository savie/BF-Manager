package l;

import android.util.Pair;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13107 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Object f43631;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5345 f43632;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 f43634;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18875 f43635;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5345 f43636;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f43637;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f43639;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f43640;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f43641;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5345 f43643;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5345 f43644;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f43645;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5345 f43646;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f43647;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21221 f43648 = C21221.f69134;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20039 f43633 = new C20039();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0282 f43638 = new C0282();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f43642 = new ArrayList();

    public C13107(InterfaceC8313 interfaceC8313, InterfaceC8065 interfaceC8065, C18875 c18875) {
        this.f43634 = interfaceC8313;
        this.f43641 = interfaceC8065;
        this.f43635 = c18875;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32368(AbstractC16511 abstractC16511, int i) {
        this.f43637 = i;
        return m32353(abstractC16511);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32370(AbstractC16511 abstractC16511, boolean z) {
        this.f43645 = z;
        return m32353(abstractC16511);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32378(AbstractC16511 abstractC16511, C21221 c21221) {
        this.f43648 = c21221;
        this.f43648.getClass();
        m32388();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32385(InterfaceC6806 interfaceC6806) {
        C5345 c5345 = this.f43632;
        return c5345 != null && c5345.f18461 == interfaceC6806;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m32382(InterfaceC6806 interfaceC6806) {
        C5345 c5345 = this.f43646;
        return c5345 != null && c5345.f18461 == interfaceC6806;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32377(long j) {
        C5345 c5345 = this.f43632;
        if (c5345 != null) {
            c5345.m14839(j);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m32386() {
        C5345 c5345 = this.f43632;
        if (c5345 != null) {
            return !c5345.f18464.f72810 && c5345.m14831() && this.f43632.f18464.f72812 != -9223372036854775807L && this.f43639 < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22279 m32375(long j, C17340 c17340) {
        C5345 c5345 = this.f43632;
        if (c5345 != null) {
            return m32358(c17340.f55191, c5345, j);
        }
        return m32359(c17340.f55191, c17340.f55179, c17340.f55189, c17340.f55192);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5345 m32373(C22279 c22279) {
        C5345 c5345M2452;
        C5345 c5345 = this.f43632;
        long jM14844 = c5345 == null ? BasicLabelFormatter.TRILLION : (c5345.m14844() + this.f43632.f18464.f72812) - c22279.f72814;
        int i = 0;
        while (true) {
            if (i >= this.f43642.size()) {
                c5345M2452 = null;
                break;
            }
            C22279 c222710 = ((C5345) this.f43642.get(i)).f18464;
            long j = c222710.f72812;
            long j2 = c22279.f72812;
            if ((j == -9223372036854775807L || j == j2) && c222710.f72814 == c22279.f72814 && c222710.f72815.equals(c22279.f72815)) {
                c5345M2452 = (C5345) this.f43642.remove(i);
                break;
            }
            i++;
        }
        if (c5345M2452 == null) {
            c5345M2452 = C0530.m2452(this.f43635.f61116, c22279, jM14844);
        } else {
            c5345M2452.f18464 = c22279;
            c5345M2452.m14849(jM14844);
        }
        C5345 c5346 = this.f43632;
        if (c5346 != null) {
            c5346.m14840(c5345M2452);
        } else {
            this.f43636 = c5345M2452;
            this.f43644 = c5345M2452;
            this.f43643 = c5345M2452;
        }
        this.f43631 = null;
        this.f43632 = c5345M2452;
        this.f43639++;
        m32363();
        return c5345M2452;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m32388() {
        if (this.f43642.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f43642.size(); i++) {
            ((C5345) this.f43642.get(i)).m14834();
        }
        this.f43642 = arrayList;
        this.f43646 = null;
        m32380();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5345 m32379() {
        return this.f43632;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5345 m32364() {
        return this.f43646;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5345 m32387() {
        return this.f43636;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5345 m32366() {
        return this.f43644;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5345 m32383() {
        return this.f43643;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5345 m32381() {
        C5345 c5345 = this.f43643;
        C5345 c5346 = this.f43644;
        if (c5345 == c5346) {
            C2023.m6508(c5346);
            this.f43643 = c5346.m14847();
        }
        C5345 c5347 = this.f43644;
        C2023.m6508(c5347);
        this.f43644 = c5347.m14847();
        m32363();
        C5345 c5348 = this.f43644;
        C2023.m6508(c5348);
        return c5348;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32384() {
        C5345 c5345 = this.f43643;
        C2023.m6508(c5345);
        this.f43643 = c5345.m14847();
        m32363();
        C2023.m6508(this.f43643);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5345 m32371() {
        C5345 c5345 = this.f43636;
        if (c5345 == null) {
            return null;
        }
        if (c5345 == this.f43644) {
            this.f43644 = c5345.m14847();
        }
        C5345 c5346 = this.f43636;
        if (c5346 == this.f43643) {
            this.f43643 = c5346.m14847();
        }
        this.f43636.m14834();
        int i = this.f43639 - 1;
        this.f43639 = i;
        if (i == 0) {
            this.f43632 = null;
            C5345 c5347 = this.f43636;
            this.f43631 = c5347.f18463;
            this.f43640 = c5347.f18464.f72815.f49780;
        }
        this.f43636 = this.f43636.m14847();
        m32363();
        return this.f43636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32367(C5345 c5345) {
        C2023.m6508(c5345);
        int i = 0;
        if (c5345.equals(this.f43632)) {
            return 0;
        }
        this.f43632 = c5345;
        while (c5345.m14847() != null) {
            c5345 = c5345.m14847();
            c5345.getClass();
            if (c5345 == this.f43644) {
                C5345 c5346 = this.f43636;
                this.f43644 = c5346;
                this.f43643 = c5346;
                i = 3;
            }
            if (c5345 == this.f43643) {
                this.f43643 = this.f43644;
                i |= 2;
            }
            c5345.m14834();
            this.f43639--;
        }
        C5345 c5347 = this.f43632;
        c5347.getClass();
        c5347.m14840((C5345) null);
        m32363();
        return i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m32380() {
        C5345 c5345 = this.f43646;
        if (c5345 == null || c5345.m14846()) {
            this.f43646 = null;
            for (int i = 0; i < this.f43642.size(); i++) {
                C5345 c5346 = (C5345) this.f43642.get(i);
                if (!c5346.m14846()) {
                    this.f43646 = c5346;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5345 m32372(InterfaceC6806 interfaceC6806) {
        for (int i = 0; i < this.f43642.size(); i++) {
            C5345 c5345 = (C5345) this.f43642.get(i);
            if (c5345.f18461 == interfaceC6806) {
                return c5345;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32365() {
        if (this.f43639 == 0) {
            return;
        }
        C5345 c5345M14847 = this.f43636;
        C2023.m6508(c5345M14847);
        this.f43631 = c5345M14847.f18463;
        this.f43640 = c5345M14847.f18464.f72815.f49780;
        while (c5345M14847 != null) {
            c5345M14847.m14834();
            c5345M14847 = c5345M14847.m14847();
        }
        this.f43636 = null;
        this.f43632 = null;
        this.f43644 = null;
        this.f43643 = null;
        this.f43639 = 0;
        m32363();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32369(AbstractC16511 abstractC16511, long j, long j2, long j3) {
        C22279 c22279M32376;
        boolean z;
        C5345 c5345M14847 = this.f43636;
        C5345 c5345 = null;
        while (true) {
            int i = 0;
            if (c5345M14847 == null) {
                return 0;
            }
            C22279 c22279 = c5345M14847.f18464;
            if (c5345 == null) {
                c22279M32376 = m32376(abstractC16511, c22279);
            } else {
                C22279 c22279M32358 = m32358(abstractC16511, c5345, j);
                if (c22279M32358 == null || c22279.f72814 != c22279M32358.f72814 || !c22279.f72815.equals(c22279M32358.f72815)) {
                    return m32367(c5345);
                }
                c22279M32376 = c22279M32358;
            }
            long j4 = c22279M32376.f72812;
            long j5 = c22279.f72811;
            long j6 = c22279.f72812;
            c5345M14847.f18464 = c22279M32376.m49452(j5);
            if (j6 != j4) {
                c5345M14847.m14843();
                long jM14833 = j4 == -9223372036854775807L ? C17492.FOREVER_NS : c5345M14847.m14833(j4);
                boolean z2 = c5345M14847 == this.f43644 && !c5345M14847.f18464.f72813 && (j2 == Long.MIN_VALUE || j2 >= jM14833);
                boolean z3 = c5345M14847 == this.f43643 && (j3 == Long.MIN_VALUE || j3 >= jM14833);
                int iM32367 = m32367(c5345M14847);
                if (iM32367 != 0) {
                    return iM32367;
                }
                if (j6 == -9223372036854775807L && c22279.f72817 == Long.MIN_VALUE) {
                    long j7 = c22279M32376.f72817;
                    if (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j6 != -9223372036854775807L || z)) {
                    i = 1;
                }
                return z3 ? i | 2 : i;
            }
            c5345 = c5345M14847;
            c5345M14847 = c5345M14847.m14847();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22279 m32376(AbstractC16511 abstractC16511, C22279 c22279) {
        long j;
        long jM45387;
        C15274 c15274 = c22279.f72815;
        boolean zM36576 = c15274.m36576();
        int i = c15274.f49781;
        boolean z = !zM36576 && i == -1;
        int i2 = c15274.f49779;
        boolean zM32361 = m32361(abstractC16511, c15274);
        boolean zM32362 = m32362(abstractC16511, c15274, z);
        Object obj = c15274.f49778;
        C20039 c20039 = this.f43633;
        abstractC16511.mo38826(obj, c20039);
        if (c15274.m36576() || i == -1) {
            j = -9223372036854775807L;
        } else {
            c20039.m45386(i);
            j = 0;
        }
        if (c15274.m36576()) {
            jM45387 = c20039.m45387(i2, c15274.f49782);
        } else {
            jM45387 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c20039.f64173 : j;
        }
        if (c15274.m36576()) {
            c20039.m45384(i2);
        } else if (i != -1) {
            c20039.m45384(i);
        }
        return new C22279(c15274, c22279.f72814, c22279.f72811, j, jM45387, c22279.f72816, false, z, zM32361, zM32362);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15274 m32355(AbstractC16511 abstractC16511, Object obj, long j, long j2, C0282 c0282, C20039 c20039) {
        abstractC16511.mo38826(obj, c20039);
        abstractC16511.m38827(c20039.f64168, c0282);
        abstractC16511.mo14959(obj);
        int i = c20039.f64170.f12528;
        if (i != 0) {
            if (i == 1) {
                c20039.m45389(0);
            }
            c20039.f64170.getClass();
            c20039.m45384(0);
        }
        abstractC16511.mo38826(obj, c20039);
        int iM45391 = c20039.m45391(j);
        if (iM45391 == -1) {
            return new C15274(c20039.m45385(j), j2, obj);
        }
        return new C15274(obj, iM45391, c20039.m45390(iM45391), j2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32363() {
        int i = AbstractC22433.f73217;
        final C4793 c4793 = new C4793();
        for (C5345 c5345M14847 = this.f43636; c5345M14847 != null; c5345M14847 = c5345M14847.m14847()) {
            c4793.m52163(c5345M14847.f18464.f72815);
        }
        C5345 c5345 = this.f43644;
        final C15274 c15274 = c5345 == null ? null : c5345.f18464.f72815;
        this.f43641.mo21243(new Runnable() { // from class: l.֨۫ۙ
            @Override // java.lang.Runnable
            public final void run() {
                this.f5032.f43634.mo2596(c4793.m13309(), c15274);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15274 m32374(AbstractC16511 abstractC16511, Object obj, long j) {
        long jM32354;
        int iMo14959;
        Object obj2 = obj;
        C20039 c20039 = this.f43633;
        int i = abstractC16511.mo38826(obj2, c20039).f64168;
        Object obj3 = this.f43631;
        if (obj3 != null && (iMo14959 = abstractC16511.mo14959(obj3)) != -1 && abstractC16511.mo5920(iMo14959, c20039, false).f64168 == i) {
            jM32354 = this.f43640;
        } else {
            C5345 c5345M14847 = this.f43636;
            while (true) {
                if (c5345M14847 != null) {
                    if (c5345M14847.f18463.equals(obj2)) {
                        jM32354 = c5345M14847.f18464.f72815.f49780;
                        break;
                    }
                    c5345M14847 = c5345M14847.m14847();
                } else {
                    C5345 c5345M14848 = this.f43636;
                    while (true) {
                        if (c5345M14848 != null) {
                            int iMo149510 = abstractC16511.mo14959(c5345M14848.f18463);
                            if (iMo149510 != -1 && abstractC16511.mo5920(iMo149510, c20039, false).f64168 == i) {
                                jM32354 = c5345M14848.f18464.f72815.f49780;
                                break;
                            }
                            c5345M14848 = c5345M14848.m14847();
                        } else {
                            jM32354 = m32354(obj2);
                            if (jM32354 != -1) {
                                break;
                            }
                            jM32354 = this.f43647;
                            this.f43647 = 1 + jM32354;
                            if (this.f43636 != null) {
                                break;
                            }
                            this.f43631 = obj2;
                            this.f43640 = jM32354;
                            break;
                        }
                    }
                }
            }
        }
        long j2 = jM32354;
        abstractC16511.mo38826(obj2, c20039);
        int i2 = c20039.f64168;
        C0282 c0282 = this.f43638;
        abstractC16511.m38827(i2, c0282);
        boolean z = false;
        for (int iMo149511 = abstractC16511.mo14959(obj); iMo149511 >= c0282.f1580; iMo149511--) {
            abstractC16511.mo5920(iMo149511, c20039, true);
            boolean z2 = c20039.f64170.f12528 > 0;
            z |= z2;
            if (c20039.m45391(c20039.f64173) != -1) {
                obj2 = c20039.f64174;
                obj2.getClass();
            }
            if (z && (!z2 || c20039.f64173 != 0)) {
                break;
            }
        }
        return m32355(abstractC16511, obj2, j, j2, this.f43638, this.f43633);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m32354(Object obj) {
        for (int i = 0; i < this.f43642.size(); i++) {
            C5345 c5345 = (C5345) this.f43642.get(i);
            if (c5345.f18463.equals(obj)) {
                return c5345.f18464.f72815.f49780;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m32353(AbstractC16511 abstractC16511) {
        C5345 c5345M14847 = this.f43636;
        if (c5345M14847 == null) {
            return 0;
        }
        int iMo14959 = abstractC16511.mo14959(c5345M14847.f18463);
        while (true) {
            iMo14959 = abstractC16511.m38823(iMo14959, this.f43633, this.f43638, this.f43637, this.f43645);
            while (true) {
                c5345M14847.getClass();
                if (c5345M14847.m14847() == null || c5345M14847.f18464.f72818) {
                    break;
                }
                c5345M14847 = c5345M14847.m14847();
            }
            C5345 c5345M14848 = c5345M14847.m14847();
            if (iMo14959 == -1 || c5345M14848 == null || abstractC16511.mo14959(c5345M14848.f18463) != iMo14959) {
                break;
            }
            c5345M14847 = c5345M14848;
        }
        int iM32367 = m32367(c5345M14847);
        c5345M14847.f18464 = m32376(abstractC16511, c5345M14847.f18464);
        return iM32367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22279 m32358(AbstractC16511 abstractC16511, C5345 c5345, long j) {
        long j2;
        long j3;
        long jM32354;
        C22279 c22279 = c5345.f18464;
        long jM14844 = (c5345.m14844() + c22279.f72812) - j;
        if (c22279.f72818) {
            C22279 c222710 = c5345.f18464;
            C15274 c15274 = c222710.f72815;
            long j4 = c222710.f72811;
            int iM38823 = abstractC16511.m38823(abstractC16511.mo14959(c15274.f49778), this.f43633, this.f43638, this.f43637, this.f43645);
            if (iM38823 != -1) {
                C20039 c20039 = this.f43633;
                int i = abstractC16511.mo5920(iM38823, c20039, true).f64168;
                Object obj = c20039.f64174;
                obj.getClass();
                long j5 = c15274.f49780;
                if (abstractC16511.mo14810(i, this.f43638, 0L).f1580 == iM38823) {
                    Pair pairM38825 = abstractC16511.m38825(this.f43638, this.f43633, i, -9223372036854775807L, Math.max(0L, jM14844));
                    if (pairM38825 != null) {
                        obj = pairM38825.first;
                        long jLongValue = ((Long) pairM38825.second).longValue();
                        C5345 c5345M14847 = c5345.m14847();
                        if (c5345M14847 != null && c5345M14847.f18463.equals(obj)) {
                            jM32354 = c5345M14847.f18464.f72815.f49780;
                        } else {
                            jM32354 = m32354(obj);
                            if (jM32354 == -1) {
                                jM32354 = this.f43647;
                                this.f43647 = 1 + jM32354;
                            }
                        }
                        j3 = jLongValue;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                    j3 = 0;
                    jM32354 = j5;
                }
                C15274 c15274M32355 = m32355(abstractC16511, obj, j3, jM32354, this.f43638, this.f43633);
                if (j2 != -9223372036854775807L && j4 != -9223372036854775807L) {
                    int i2 = abstractC16511.mo38826(c15274.f49778, c20039).f64170.f12528;
                    c20039.f64170.getClass();
                    if (i2 > 0) {
                        c20039.m45384(0);
                    }
                }
                return m32359(abstractC16511, c15274M32355, j2, j3);
            }
            return null;
        }
        C22279 c222711 = c5345.f18464;
        C15274 c15275 = c222711.f72815;
        Object obj2 = c15275.f49778;
        int i3 = c15275.f49781;
        C20039 c200310 = this.f43633;
        abstractC16511.mo38826(obj2, c200310);
        boolean z = c222711.f72813;
        if (c15275.m36576()) {
            int i4 = c15275.f49779;
            int i5 = c200310.f64170.m10067(i4).f32786;
            if (i5 == -1) {
                return null;
            }
            int iM24724 = c200310.f64170.m10067(i4).m24724(c15275.f49782);
            if (iM24724 < i5) {
                return m32356(abstractC16511, c15275.f49778, i4, iM24724, c222711.f72811, c15275.f49780, z);
            }
            long jLongValue2 = c222711.f72811;
            if (jLongValue2 == -9223372036854775807L) {
                Pair pairM38826 = abstractC16511.m38825(this.f43638, c200310, c200310.f64168, -9223372036854775807L, Math.max(0L, jM14844));
                if (pairM38826 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairM38826.second).longValue();
            }
            int i6 = c15275.f49779;
            abstractC16511.mo38826(obj2, c200310);
            c200310.m45386(i6);
            c200310.f64170.m10067(i6).getClass();
            return m32357(abstractC16511, c15275.f49778, Math.max(0L, jLongValue2), c222711.f72811, c15275.f49780, z);
        }
        if (i3 != -1) {
            c200310.m45389(i3);
        }
        int iM45390 = c200310.m45390(i3);
        c200310.m45384(i3);
        if (iM45390 != c200310.f64170.m10067(i3).f32786) {
            return m32356(abstractC16511, c15275.f49778, c15275.f49781, iM45390, c222711.f72812, c15275.f49780, z);
        }
        abstractC16511.mo38826(obj2, c200310);
        c200310.m45386(i3);
        c200310.f64170.m10067(i3).getClass();
        return m32357(abstractC16511, c15275.f49778, 0L, c222711.f72812, c15275.f49780, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22279 m32359(AbstractC16511 abstractC16511, C15274 c15274, long j, long j2) {
        abstractC16511.mo38826(c15274.f49778, this.f43633);
        if (c15274.m36576()) {
            return m32356(abstractC16511, c15274.f49778, c15274.f49779, c15274.f49782, j, c15274.f49780, false);
        }
        return m32357(abstractC16511, c15274.f49778, j2, j, c15274.f49780, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22279 m32356(AbstractC16511 abstractC16511, Object obj, int i, int i2, long j, long j2, boolean z) {
        C15274 c15274 = new C15274(obj, i, i2, j2);
        C20039 c20039 = this.f43633;
        long jM45387 = abstractC16511.mo38826(obj, c20039).m45387(i, i2);
        if (i2 == c20039.m45390(i)) {
            c20039.f64170.getClass();
        }
        c20039.m45384(i);
        long jMax = 0;
        if (jM45387 != -9223372036854775807L && 0 >= jM45387) {
            jMax = Math.max(0L, jM45387 - 1);
        }
        return new C22279(c15274, jMax, j, -9223372036854775807L, jM45387, z, false, false, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22279 m32357(AbstractC16511 abstractC16511, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        C20039 c20039 = this.f43633;
        abstractC16511.mo38826(obj, c20039);
        int iM45385 = c20039.m45385(j);
        boolean z2 = false;
        if (iM45385 == -1) {
            if (c20039.f64170.f12528 > 0) {
                c20039.m45384(0);
            }
        } else {
            c20039.m45384(iM45385);
        }
        C15274 c15274 = new C15274(iM45385, j3, obj);
        if (!c15274.m36576() && iM45385 == -1) {
            z2 = true;
        }
        boolean zM32361 = m32361(abstractC16511, c15274);
        boolean zM32362 = m32362(abstractC16511, c15274, z2);
        if (iM45385 != -1) {
            c20039.m45384(iM45385);
        }
        if (iM45385 != -1) {
            c20039.m45389(iM45385);
        }
        if (iM45385 != -1) {
            c20039.m45386(iM45385);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c20039.f64173 : j4;
        return new C22279(c15274, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - ((long) 1)), j2, j4, j5, z, false, z2, zM32361, zM32362);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32361(AbstractC16511 abstractC16511, C15274 c15274) {
        boolean z = !c15274.m36576() && c15274.f49781 == -1;
        Object obj = c15274.f49778;
        if (z) {
            if (abstractC16511.mo14810(abstractC16511.mo38826(obj, this.f43633).f64168, this.f43638, 0L).f1587 == abstractC16511.mo14959(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32362(AbstractC16511 abstractC16511, C15274 c15274, boolean z) {
        int iMo14959 = abstractC16511.mo14959(c15274.f49778);
        if (!abstractC16511.mo14810(abstractC16511.mo5920(iMo14959, this.f43633, false).f64168, this.f43638, 0L).f1583) {
            if (abstractC16511.m38823(iMo14959, this.f43633, this.f43638, this.f43637, this.f43645) == -1 && z) {
                return true;
            }
        }
        return false;
    }
}
