package l;

import android.util.Pair;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9748 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f31441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22230 f31442;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f31443;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31444;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0054 f31445;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f31447;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f31448;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0054 f31449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0054 f31451;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4529 f31452;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f31453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f31454;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0054 f31455;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0054 f31456;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14090 f31457 = C14090.f44596;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1634 f31440 = new C1634();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11328 f31446 = new C11328();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f31450 = new ArrayList();

    public C9748(InterfaceC22230 interfaceC22230, InterfaceC4879 interfaceC4879, C4529 c4529) {
        this.f31442 = interfaceC22230;
        this.f31454 = interfaceC4879;
        this.f31452 = c4529;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25388(AbstractC24755 abstractC24755, int i) {
        this.f31441 = i;
        return m25375(abstractC24755);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25390(AbstractC24755 abstractC24755, boolean z) {
        this.f31453 = z;
        return m25375(abstractC24755);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25398(AbstractC24755 abstractC24755, C14090 c14090) {
        this.f31457 = c14090;
        this.f31457.getClass();
        m25410();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25408(InterfaceC9147 interfaceC9147) {
        C0054 c0054 = this.f31455;
        return c0054 != null && c0054.f925 == interfaceC9147;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m25401(InterfaceC9147 interfaceC9147) {
        C0054 c0054 = this.f31451;
        return c0054 != null && c0054.f925 == interfaceC9147;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25397(long j) {
        C0054 c0054 = this.f31455;
        if (c0054 != null) {
            c0054.m953(j);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m25405() {
        C0054 c0054 = this.f31455;
        if (c0054 != null) {
            return !c0054.f918.f24827 && c0054.m960() && this.f31455.f918.f24819 != -9223372036854775807L && this.f31444 < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7512 m25394(long j, C17426 c17426) {
        C0054 c0054 = this.f31455;
        if (c0054 != null) {
            return m25379(c17426.f56676, c0054, j);
        }
        return m25380(c17426.f56676, c17426.f56675, c17426.f56672, c17426.f56674);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0054 m25392(C7512 c7512) {
        C0054 c0054M28373;
        C0054 c0054 = this.f31455;
        long jM957 = c0054 == null ? BasicLabelFormatter.TRILLION : (c0054.m957() + this.f31455.f918.f24819) - c7512.f24822;
        int i = 0;
        while (true) {
            if (i >= this.f31450.size()) {
                c0054M28373 = null;
                break;
            }
            C7512 c7513 = ((C0054) this.f31450.get(i)).f918;
            long j = c7513.f24819;
            long j2 = c7512.f24819;
            if ((j == -9223372036854775807L || j == j2) && c7513.f24822 == c7512.f24822 && c7513.f24821.equals(c7512.f24821)) {
                c0054M28373 = (C0054) this.f31450.remove(i);
                break;
            }
            i++;
        }
        if (c0054M28373 == null) {
            c0054M28373 = C11240.m28373(this.f31452.f16120, c7512, jM957);
        } else {
            c0054M28373.f918 = c7512;
            c0054M28373.m965(jM957);
        }
        C0054 c0055 = this.f31455;
        if (c0055 != null) {
            c0055.m954(c0054M28373);
        } else {
            this.f31445 = c0054M28373;
            this.f31456 = c0054M28373;
            this.f31449 = c0054M28373;
        }
        this.f31447 = null;
        this.f31455 = c0054M28373;
        this.f31444++;
        m25385();
        return c0054M28373;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25410() {
        if (this.f31450.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31450.size(); i++) {
            ((C0054) this.f31450.get(i)).m948();
        }
        this.f31450 = arrayList;
        this.f31451 = null;
        m25402();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0054 m25406() {
        return this.f31455;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0054 m25403() {
        return this.f31451;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0054 m25404() {
        return this.f31445;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0054 m25386() {
        return this.f31456;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0054 m25399() {
        return this.f31449;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0054 m25400() {
        C0054 c0054 = this.f31449;
        C0054 c0055 = this.f31456;
        if (c0054 == c0055) {
            C20782.m47566(c0055);
            this.f31449 = c0055.m963();
        }
        C0054 c0056 = this.f31456;
        C20782.m47566(c0056);
        this.f31456 = c0056.m963();
        m25385();
        C0054 c0057 = this.f31456;
        C20782.m47566(c0057);
        return c0057;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25407() {
        C0054 c0054 = this.f31449;
        C20782.m47566(c0054);
        this.f31449 = c0054.m963();
        m25385();
        C20782.m47566(this.f31449);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0054 m25391() {
        C0054 c0054 = this.f31445;
        if (c0054 == null) {
            return null;
        }
        if (c0054 == this.f31456) {
            this.f31456 = c0054.m963();
        }
        C0054 c0055 = this.f31445;
        if (c0055 == this.f31449) {
            this.f31449 = c0055.m963();
        }
        this.f31445.m948();
        int i = this.f31444 - 1;
        this.f31444 = i;
        if (i == 0) {
            this.f31455 = null;
            C0054 c0056 = this.f31445;
            this.f31447 = c0056.f915;
            this.f31443 = c0056.f918.f24821.f27518;
        }
        this.f31445 = this.f31445.m963();
        m25385();
        return this.f31445;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25387(C0054 c0054) {
        C20782.m47566(c0054);
        int i = 0;
        if (c0054.equals(this.f31455)) {
            return 0;
        }
        this.f31455 = c0054;
        while (c0054.m963() != null) {
            c0054 = c0054.m963();
            c0054.getClass();
            if (c0054 == this.f31456) {
                C0054 c0055 = this.f31445;
                this.f31456 = c0055;
                this.f31449 = c0055;
                i = 3;
            }
            if (c0054 == this.f31449) {
                this.f31449 = this.f31456;
                i |= 2;
            }
            c0054.m948();
            this.f31444--;
        }
        C0054 c0056 = this.f31455;
        c0056.getClass();
        c0056.m954((C0054) null);
        m25385();
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25402() {
        C0054 c0054 = this.f31451;
        if (c0054 == null || c0054.m956()) {
            this.f31451 = null;
            for (int i = 0; i < this.f31450.size(); i++) {
                C0054 c0055 = (C0054) this.f31450.get(i);
                if (!c0055.m956()) {
                    this.f31451 = c0055;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0054 m25393(InterfaceC9147 interfaceC9147) {
        for (int i = 0; i < this.f31450.size(); i++) {
            C0054 c0054 = (C0054) this.f31450.get(i);
            if (c0054.f925 == interfaceC9147) {
                return c0054;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25409() {
        if (this.f31444 == 0) {
            return;
        }
        C0054 c0054M963 = this.f31445;
        C20782.m47566(c0054M963);
        this.f31447 = c0054M963.f915;
        this.f31443 = c0054M963.f918.f24821.f27518;
        while (c0054M963 != null) {
            c0054M963.m948();
            c0054M963 = c0054M963.m963();
        }
        this.f31445 = null;
        this.f31455 = null;
        this.f31456 = null;
        this.f31449 = null;
        this.f31444 = 0;
        m25385();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25389(AbstractC24755 abstractC24755, long j, long j2, long j3) {
        C7512 c7512M25395;
        boolean z;
        C0054 c0054M963 = this.f31445;
        C0054 c0054 = null;
        while (true) {
            int i = 0;
            if (c0054M963 == null) {
                return 0;
            }
            C7512 c7512 = c0054M963.f918;
            if (c0054 == null) {
                c7512M25395 = m25395(abstractC24755, c7512);
            } else {
                C7512 c7512M25379 = m25379(abstractC24755, c0054, j);
                if (c7512M25379 == null || c7512.f24822 != c7512M25379.f24822 || !c7512.f24821.equals(c7512M25379.f24821)) {
                    return m25387(c0054);
                }
                c7512M25395 = c7512M25379;
            }
            long j4 = c7512M25395.f24819;
            long j5 = c7512.f24818;
            long j6 = c7512.f24819;
            c0054M963.f918 = c7512M25395.m20569(j5);
            if (j6 != j4) {
                c0054M963.m959();
                long jM967 = j4 == -9223372036854775807L ? C25227.FOREVER_NS : c0054M963.m967(j4);
                boolean z2 = c0054M963 == this.f31456 && !c0054M963.f918.f24825 && (j2 == Long.MIN_VALUE || j2 >= jM967);
                boolean z3 = c0054M963 == this.f31449 && (j3 == Long.MIN_VALUE || j3 >= jM967);
                int iM25387 = m25387(c0054M963);
                if (iM25387 != 0) {
                    return iM25387;
                }
                if (j6 == -9223372036854775807L && c7512.f24826 == Long.MIN_VALUE) {
                    long j7 = c7512M25395.f24826;
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
            c0054 = c0054M963;
            c0054M963 = c0054M963.m963();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7512 m25395(AbstractC24755 abstractC24755, C7512 c7512) {
        long j;
        long jM5788;
        C8402 c8402 = c7512.f24821;
        boolean zM22581 = c8402.m22581();
        int i = c8402.f27517;
        boolean z = !zM22581 && i == -1;
        int i2 = c8402.f27516;
        boolean zM25383 = m25383(abstractC24755, c8402);
        boolean zM25384 = m25384(abstractC24755, c8402, z);
        Object obj = c8402.f27520;
        C1634 c1634 = this.f31440;
        abstractC24755.mo15535(obj, c1634);
        if (c8402.m22581() || i == -1) {
            j = -9223372036854775807L;
        } else {
            c1634.m5787(i);
            j = 0;
        }
        if (c8402.m22581()) {
            jM5788 = c1634.m5788(i2, c8402.f27519);
        } else {
            jM5788 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c1634.f5660 : j;
        }
        if (c8402.m22581()) {
            c1634.m5793(i2);
        } else if (i != -1) {
            c1634.m5793(i);
        }
        return new C7512(c8402, c7512.f24822, c7512.f24818, j, jM5788, c7512.f24820, false, z, zM25383, zM25384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8402 m25381(AbstractC24755 abstractC24755, Object obj, long j, long j2, C11328 c11328, C1634 c1634) {
        abstractC24755.mo15535(obj, c1634);
        abstractC24755.m55263(c1634.f5657, c11328);
        abstractC24755.mo1588(obj);
        int i = c1634.f5655.f79097;
        if (i != 0) {
            if (i == 1) {
                c1634.m5790(0);
            }
            c1634.f5655.getClass();
            c1634.m5793(0);
        }
        abstractC24755.mo15535(obj, c1634);
        int iM5792 = c1634.m5792(j);
        if (iM5792 == -1) {
            return new C8402(c1634.m5786(j), j2, obj);
        }
        return new C8402(obj, iM5792, c1634.m5791(iM5792), j2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m25385() {
        int i = AbstractC1928.f6477;
        final C22811 c22811 = new C22811();
        for (C0054 c0054M963 = this.f31445; c0054M963 != null; c0054M963 = c0054M963.m963()) {
            c22811.m19807(c0054M963.f918.f24821);
        }
        C0054 c0054 = this.f31456;
        final C8402 c8402 = c0054 == null ? null : c0054.f918.f24821;
        this.f31454.mo14966(new Runnable() { // from class: l.ᩳ֡ۙ
            @Override // java.lang.Runnable
            public final void run() {
                this.f60778.f31442.mo7220(c22811.m51441(), c8402);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8402 m25396(AbstractC24755 abstractC24755, Object obj, long j) {
        long jM25376;
        int iMo1588;
        Object obj2 = obj;
        C1634 c1634 = this.f31440;
        int i = abstractC24755.mo15535(obj2, c1634).f5657;
        Object obj3 = this.f31447;
        if (obj3 != null && (iMo1588 = abstractC24755.mo1588(obj3)) != -1 && abstractC24755.mo1591(iMo1588, c1634, false).f5657 == i) {
            jM25376 = this.f31443;
        } else {
            C0054 c0054M963 = this.f31445;
            while (true) {
                if (c0054M963 != null) {
                    if (c0054M963.f915.equals(obj2)) {
                        jM25376 = c0054M963.f918.f24821.f27518;
                        break;
                    }
                    c0054M963 = c0054M963.m963();
                } else {
                    C0054 c0054M964 = this.f31445;
                    while (true) {
                        if (c0054M964 != null) {
                            int iMo1589 = abstractC24755.mo1588(c0054M964.f915);
                            if (iMo1589 != -1 && abstractC24755.mo1591(iMo1589, c1634, false).f5657 == i) {
                                jM25376 = c0054M964.f918.f24821.f27518;
                                break;
                            }
                            c0054M964 = c0054M964.m963();
                        } else {
                            jM25376 = m25376(obj2);
                            if (jM25376 != -1) {
                                break;
                            }
                            jM25376 = this.f31448;
                            this.f31448 = 1 + jM25376;
                            if (this.f31445 != null) {
                                break;
                            }
                            this.f31447 = obj2;
                            this.f31443 = jM25376;
                            break;
                        }
                    }
                }
            }
        }
        long j2 = jM25376;
        abstractC24755.mo15535(obj2, c1634);
        int i2 = c1634.f5657;
        C11328 c11328 = this.f31446;
        abstractC24755.m55263(i2, c11328);
        boolean z = false;
        for (int iMo15810 = abstractC24755.mo1588(obj); iMo15810 >= c11328.f35697; iMo15810--) {
            abstractC24755.mo1591(iMo15810, c1634, true);
            boolean z2 = c1634.f5655.f79097 > 0;
            z |= z2;
            if (c1634.m5792(c1634.f5660) != -1) {
                obj2 = c1634.f5658;
                obj2.getClass();
            }
            if (z && (!z2 || c1634.f5660 != 0)) {
                break;
            }
        }
        return m25381(abstractC24755, obj2, j, j2, this.f31446, this.f31440);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m25376(Object obj) {
        for (int i = 0; i < this.f31450.size(); i++) {
            C0054 c0054 = (C0054) this.f31450.get(i);
            if (c0054.f915.equals(obj)) {
                return c0054.f918.f24821.f27518;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m25375(AbstractC24755 abstractC24755) {
        C0054 c0054M963 = this.f31445;
        if (c0054M963 == null) {
            return 0;
        }
        int iMo1588 = abstractC24755.mo1588(c0054M963.f915);
        while (true) {
            iMo1588 = abstractC24755.m55260(iMo1588, this.f31440, this.f31446, this.f31441, this.f31453);
            while (true) {
                c0054M963.getClass();
                if (c0054M963.m963() == null || c0054M963.f918.f24824) {
                    break;
                }
                c0054M963 = c0054M963.m963();
            }
            C0054 c0054M964 = c0054M963.m963();
            if (iMo1588 == -1 || c0054M964 == null || abstractC24755.mo1588(c0054M964.f915) != iMo1588) {
                break;
            }
            c0054M963 = c0054M964;
        }
        int iM25387 = m25387(c0054M963);
        c0054M963.f918 = m25395(abstractC24755, c0054M963.f918);
        return iM25387;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7512 m25379(AbstractC24755 abstractC24755, C0054 c0054, long j) {
        long j2;
        long j3;
        long jM25376;
        C7512 c7512 = c0054.f918;
        long jM957 = (c0054.m957() + c7512.f24819) - j;
        if (c7512.f24824) {
            C7512 c7513 = c0054.f918;
            C8402 c8402 = c7513.f24821;
            long j4 = c7513.f24818;
            int iM55260 = abstractC24755.m55260(abstractC24755.mo1588(c8402.f27520), this.f31440, this.f31446, this.f31441, this.f31453);
            if (iM55260 != -1) {
                C1634 c1634 = this.f31440;
                int i = abstractC24755.mo1591(iM55260, c1634, true).f5657;
                Object obj = c1634.f5658;
                obj.getClass();
                long j5 = c8402.f27518;
                if (abstractC24755.mo1592(i, this.f31446, 0L).f35697 == iM55260) {
                    Pair pairM55262 = abstractC24755.m55262(this.f31446, this.f31440, i, -9223372036854775807L, Math.max(0L, jM957));
                    if (pairM55262 != null) {
                        obj = pairM55262.first;
                        long jLongValue = ((Long) pairM55262.second).longValue();
                        C0054 c0054M963 = c0054.m963();
                        if (c0054M963 != null && c0054M963.f915.equals(obj)) {
                            jM25376 = c0054M963.f918.f24821.f27518;
                        } else {
                            jM25376 = m25376(obj);
                            if (jM25376 == -1) {
                                jM25376 = this.f31448;
                                this.f31448 = 1 + jM25376;
                            }
                        }
                        j3 = jLongValue;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                    j3 = 0;
                    jM25376 = j5;
                }
                C8402 c8402M25381 = m25381(abstractC24755, obj, j3, jM25376, this.f31446, this.f31440);
                if (j2 != -9223372036854775807L && j4 != -9223372036854775807L) {
                    int i2 = abstractC24755.mo15535(c8402.f27520, c1634).f5655.f79097;
                    c1634.f5655.getClass();
                    if (i2 > 0) {
                        c1634.m5793(0);
                    }
                }
                return m25380(abstractC24755, c8402M25381, j2, j3);
            }
            return null;
        }
        C7512 c7514 = c0054.f918;
        C8402 c8403 = c7514.f24821;
        Object obj2 = c8403.f27520;
        int i3 = c8403.f27517;
        C1634 c1635 = this.f31440;
        abstractC24755.mo15535(obj2, c1635);
        boolean z = c7514.f24825;
        if (c8403.m22581()) {
            int i4 = c8403.f27516;
            int i5 = c1635.f5655.m54497(i4).f21782;
            if (i5 == -1) {
                return null;
            }
            int iM18312 = c1635.f5655.m54497(i4).m18312(c8403.f27519);
            if (iM18312 < i5) {
                return m25377(abstractC24755, c8403.f27520, i4, iM18312, c7514.f24818, c8403.f27518, z);
            }
            long jLongValue2 = c7514.f24818;
            if (jLongValue2 == -9223372036854775807L) {
                Pair pairM55263 = abstractC24755.m55262(this.f31446, c1635, c1635.f5657, -9223372036854775807L, Math.max(0L, jM957));
                if (pairM55263 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairM55263.second).longValue();
            }
            int i6 = c8403.f27516;
            abstractC24755.mo15535(obj2, c1635);
            c1635.m5787(i6);
            c1635.f5655.m54497(i6).getClass();
            return m25378(abstractC24755, c8403.f27520, Math.max(0L, jLongValue2), c7514.f24818, c8403.f27518, z);
        }
        if (i3 != -1) {
            c1635.m5790(i3);
        }
        int iM5791 = c1635.m5791(i3);
        c1635.m5793(i3);
        if (iM5791 != c1635.f5655.m54497(i3).f21782) {
            return m25377(abstractC24755, c8403.f27520, c8403.f27517, iM5791, c7514.f24819, c8403.f27518, z);
        }
        abstractC24755.mo15535(obj2, c1635);
        c1635.m5787(i3);
        c1635.f5655.m54497(i3).getClass();
        return m25378(abstractC24755, c8403.f27520, 0L, c7514.f24819, c8403.f27518, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7512 m25380(AbstractC24755 abstractC24755, C8402 c8402, long j, long j2) {
        abstractC24755.mo15535(c8402.f27520, this.f31440);
        if (c8402.m22581()) {
            return m25377(abstractC24755, c8402.f27520, c8402.f27516, c8402.f27519, j, c8402.f27518, false);
        }
        return m25378(abstractC24755, c8402.f27520, j2, j, c8402.f27518, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7512 m25377(AbstractC24755 abstractC24755, Object obj, int i, int i2, long j, long j2, boolean z) {
        C8402 c8402 = new C8402(obj, i, i2, j2);
        C1634 c1634 = this.f31440;
        long jM5788 = abstractC24755.mo15535(obj, c1634).m5788(i, i2);
        if (i2 == c1634.m5791(i)) {
            c1634.f5655.getClass();
        }
        c1634.m5793(i);
        long jMax = 0;
        if (jM5788 != -9223372036854775807L && 0 >= jM5788) {
            jMax = Math.max(0L, jM5788 - 1);
        }
        return new C7512(c8402, jMax, j, -9223372036854775807L, jM5788, z, false, false, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7512 m25378(AbstractC24755 abstractC24755, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        C1634 c1634 = this.f31440;
        abstractC24755.mo15535(obj, c1634);
        int iM5786 = c1634.m5786(j);
        boolean z2 = false;
        if (iM5786 == -1) {
            if (c1634.f5655.f79097 > 0) {
                c1634.m5793(0);
            }
        } else {
            c1634.m5793(iM5786);
        }
        C8402 c8402 = new C8402(iM5786, j3, obj);
        if (!c8402.m22581() && iM5786 == -1) {
            z2 = true;
        }
        boolean zM25383 = m25383(abstractC24755, c8402);
        boolean zM25384 = m25384(abstractC24755, c8402, z2);
        if (iM5786 != -1) {
            c1634.m5793(iM5786);
        }
        if (iM5786 != -1) {
            c1634.m5790(iM5786);
        }
        if (iM5786 != -1) {
            c1634.m5787(iM5786);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c1634.f5660 : j4;
        return new C7512(c8402, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - ((long) 1)), j2, j4, j5, z, false, z2, zM25383, zM25384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25383(AbstractC24755 abstractC24755, C8402 c8402) {
        boolean z = !c8402.m22581() && c8402.f27517 == -1;
        Object obj = c8402.f27520;
        if (z) {
            if (abstractC24755.mo1592(abstractC24755.mo15535(obj, this.f31440).f5657, this.f31446, 0L).f35687 == abstractC24755.mo1588(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25384(AbstractC24755 abstractC24755, C8402 c8402, boolean z) {
        int iMo1588 = abstractC24755.mo1588(c8402.f27520);
        if (!abstractC24755.mo1592(abstractC24755.mo1591(iMo1588, this.f31440, false).f5657, this.f31446, 0L).f35695) {
            if (abstractC24755.m55260(iMo1588, this.f31440, this.f31446, this.f31441, this.f31453) == -1 && z) {
                return true;
            }
        }
        return false;
    }
}
