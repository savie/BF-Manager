package l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩸ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes.dex */
public final class C22572 extends AbstractC13753 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72967;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public String f72968;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f72969;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f72970;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public volatile C7042 f72971;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C2434 f72972;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C9891 f72973;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f72974;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC10637 f72975;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f72976;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f72977;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f72978;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C15334 f72979;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f72980;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f72981;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f72982;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public volatile C9145 f72983;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f72984;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public float f72985;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f72986;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f72987;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f72988;

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ֫ */
    public final byte mo25217() {
        return (byte) 0;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25225() {
        return true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m50892() {
        return this.f72974 == 0.0f && this.f72979.size() == this.f43643.size();
    }

    public C22572(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, int i, C3683 c3683, C21894 c21894, C15508 c15508) {
        float f;
        super(c24132, c14540);
        this.f72979 = new C15334();
        this.f72986 = new AtomicInteger();
        this.f72987 = -1.0f;
        this.f43644 = i;
        if (c15508 != null) {
            m33627(interfaceC19106, c15508.m37172());
        }
        m33626(interfaceC19106);
        try {
            C15334 c15334 = ((C22572) c3683.f12659).f72979;
            C23821 c23821M11977 = c3683.m11977(this, c21894);
            this.f72979.m36785(this.f43643.size());
            int i2 = 0;
            while (i2 < this.f43643.size()) {
                if (i2 < c23821M11977.m53154()) {
                    f = c15334.getFloat(i2);
                } else {
                    f = i2 >= c23821M11977.m53153() ? c15334.getFloat(((c3683.f12663 + 1) + i2) - c23821M11977.m53153()) : -1.0f;
                }
                this.f72979.add(f);
                if (f > this.f72979.getFloat(this.f72988)) {
                    this.f72988 = i2;
                }
                i2++;
            }
            this.f43630 = m33617(0);
            this.f72967 = true;
            m50886();
        } finally {
            if (!this.f43663) {
                m33612();
            }
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ֨ */
    public final int mo25216() {
        return this.f72986.get();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܿ */
    public final Throwable mo25238() {
        return this.f72980;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo25244(C7042 c7042) {
        return c7042.m19363() > 0 && mo25220(c7042) == c7042.m19363();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final int mo25220(C7042 c7042) {
        if (this.f43653 || this.f72980 != null || this.f72971 == null || c7042.m19363() <= 0) {
            return 0;
        }
        if (this.f43644 < 0) {
            if (c7042.equals(this.f72971)) {
                return c7042.m19363();
            }
            return 0;
        }
        C9145 c9145 = this.f72983;
        if (c9145 == null || c7042.m19365() != this.f72971.m19365() || c7042.m19366() < 0) {
            return 0;
        }
        if (c7042.m19364() < this.f43640.m16189() * c9145.m24284()) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(c7042.m19363(), (Math.ceil(this.f43640.m16189() * c9145.m24281()) - 1.0d) - ((double) c7042.m19364())));
    }

    public C22572(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540) {
        this(c24132, interfaceC19106, c14540, -1, null);
    }

    public C22572(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, int i, C15508 c15508) {
        super(c24132, c14540);
        this.f72979 = new C15334();
        this.f72986 = new AtomicInteger();
        this.f72987 = -1.0f;
        this.f43644 = i;
        if (c15508 != null) {
            m33627(interfaceC19106, c15508.m37172());
        }
        mo25242(interfaceC19106);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final int mo33618(int i, int i2) {
        C9145 c9145 = this.f72983;
        if (c9145 == null) {
            return super.mo33618(i, i2);
        }
        int iCeil = (int) Math.ceil(this.f43640.m16189() * c9145.m24284());
        return Math.max(iCeil, Math.min(i, Math.max(iCeil, (((int) (this.f43640.m16189() * c9145.m24281())) - i2) - 1)));
    }

    public C22572(C24132 c24132, InterfaceC19106 interfaceC19106, C14540 c14540, C20348 c20348) throws Throwable {
        super(c24132, interfaceC19106, c14540, c20348);
        this.f72979 = new C15334();
        this.f72986 = new AtomicInteger();
        this.f72987 = -1.0f;
        this.f72988 = c20348.readInt();
        int size = this.f43643.size();
        this.f72979.m36785(size);
        for (int i = 0; i < size; i++) {
            this.f72979.add(-1.0f);
        }
        m33626(interfaceC19106);
        try {
            C15508 c15508M33642 = m33642();
            try {
                C18096 c18096M19181 = this.f43643.m19181();
                for (int i2 = 0; i2 < this.f43643.size(); i2++) {
                    C14366 c14366M42205 = c18096M19181.m42205(i2);
                    c14366M42205.m34801(c15508M33642);
                    this.f43643.m19184(i2, c14366M42205);
                }
                c15508M33642.close();
                m33612();
                m50886();
            } catch (Throwable th) {
                try {
                    c15508M33642.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m33612();
            throw th3;
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo25223(String str) {
        super.mo25223(str);
        m50881();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m50881() {
        int size = this.f43636.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            C14366 c14366 = this.f43636.get(i);
            float fM16218 = this.f43640.m16218(this.f43673, c14366.f45295, c14366.f45294, 0.0f);
            if (fM16218 > f) {
                f = fM16218;
            }
        }
        this.f72985 = f;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25242(InterfaceC19106 interfaceC19106) {
        try {
            m50884(interfaceC19106);
        } finally {
            if (!this.f43663) {
                m33612();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m50884(InterfaceC19106 interfaceC19106) throws Throwable {
        m33633();
        this.f72967 = false;
        this.f72974 = 0.0f;
        mo25241();
        this.f43670 = false;
        m33626(interfaceC19106);
        C6909 c6909 = this.f43643.isEmpty() ? this.f43643 : new C6909();
        C17350 c17350 = this.f43655.isEmpty() ? this.f43655 : new C17350();
        this.f72979 = new C15334();
        this.f72973 = null;
        this.f72978 = 0.0f;
        c17350.clear();
        C15508 c15508M33642 = m33642();
        try {
            int iM16214 = this.f43640.m16214();
            C22968 c22968M33621 = m33621(c15508M33642, 0, c15508M33642.length());
            try {
                C14366 c14366 = new C14366();
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    if (this.f43670) {
                        c6909.clear();
                        this.f72979.clear();
                        c17350.clear();
                        c22968M33621.close();
                        c15508M33642.close();
                        return;
                    }
                    c17350.add(C12875.m31911(this, c15508M33642, i, iM16214));
                    int iM51841 = c22968M33621.m51841();
                    if (iM51841 == -1) {
                        iM51841 = c15508M33642.length();
                        z = false;
                    }
                    c14366.m34800(i, iM51841, i2);
                    c6909.m19173(c14366);
                    this.f72979.add(-1.0f);
                    i = iM51841 + 1;
                    i2++;
                    try {
                        c15508M33642.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
                c22968M33621.close();
                c17350.m40746();
                C18096 c18096M19181 = c6909.m19181();
                for (int i3 = 0; i3 < c6909.size(); i3++) {
                    C14366 c14366M42205 = c18096M19181.m42205(i3);
                    c14366M42205.m34801(c15508M33642);
                    c6909.m19184(i3, c14366M42205);
                }
                c15508M33642.close();
                this.f43643 = c6909;
                this.f43655 = c17350;
                this.f43630 = m33617(0);
                m50886();
            } catch (Throwable th2) {
                try {
                    c22968M33621.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            c15508M33642.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m50886() throws Throwable {
        C5438 c5438M16219;
        RunnableC14303 runnableC14303;
        float fM34798;
        int iIncrementAndGet = this.f72986.incrementAndGet();
        mo25241();
        this.f72971 = null;
        this.f72973 = null;
        this.f72983 = null;
        this.f72980 = null;
        if (!this.f72967) {
            m33633();
        }
        InterfaceC19106 interfaceC19106 = this.f43646;
        m33626(interfaceC19106);
        boolean z = true;
        interfaceC19106.setReadOnly(true);
        this.f43663 = true;
        this.f43653 = false;
        this.f72977 = 10000;
        try {
            if (this.f72988 >= this.f43643.size()) {
                this.f72988 = 0;
            }
            C15508 c15508M33642 = m33642();
            try {
                if (this.f43643.m19180(this.f72988) - this.f43643.m19176(this.f72988) < 10000 && (!this.f72967 || this.f72979.getFloat(this.f72988) < 0.0f)) {
                    int i = this.f72988;
                    try {
                        this.f72979.mo25091(this.f43643.get(i).m34798(c15508M33642, this.f43640), i);
                        C9891 c9891 = this.f72973;
                        if (c9891 != null) {
                            c9891.m25706(i);
                        }
                    } catch (Exception unused) {
                    }
                    this.f72977 -= this.f43643.m19180(this.f72988) - this.f43643.m19176(this.f72988);
                }
                if (this.f43643.size() < 50 && m33638() < 10000) {
                    float f = this.f72979.getFloat(this.f72988);
                    for (int i2 = 0; i2 < this.f43643.size(); i2++) {
                        if (this.f72967 && this.f72979.getFloat(i2) >= 0.0f) {
                            fM34798 = this.f72979.getFloat(i2);
                        } else {
                            try {
                                fM34798 = this.f43643.get(i2).m34798(c15508M33642, this.f43640);
                                this.f72979.mo25091(fM34798, i2);
                                C9891 c9892 = this.f72973;
                                if (c9892 != null) {
                                    c9892.m25706(i2);
                                }
                            } catch (Exception unused2) {
                                fM34798 = 0.0f;
                            }
                        }
                        if (fM34798 > f) {
                            this.f72988 = i2;
                            f = fM34798;
                        }
                    }
                    this.f72973 = C9891.m25701(this.f72979);
                    this.f72978 = Math.max(this.f72978, Math.max(0.0f, this.f72979.getFloat(this.f72988)));
                    c15508M33642.close();
                    try {
                        m33612();
                        interfaceC19106.setReadOnly(false);
                        return;
                    } finally {
                        this.f43663 = false;
                    }
                }
                c15508M33642.close();
                C6909 c6909 = this.f43643;
                C15334 c15334 = this.f72979;
                int iM33631 = m33631();
                synchronized (this.f43640) {
                    c5438M16219 = this.f43640.m16219();
                }
                C9145 c9145M50871 = m50871(interfaceC19106, c5438M16219);
                if (c6909.size() > 100000) {
                    C24132 c24132 = this.f43659;
                    c24132.getClass();
                    C21576.m49068(new RunnableC4773(2, c24132));
                    runnableC14303 = new RunnableC14303(0, c24132);
                } else {
                    runnableC14303 = null;
                }
                C2434 c2434 = new C2434(new C2698(this), c6909, c15334, c5438M16219, this.f72988, c9145M50871, this.f72967, new C8664(this, iIncrementAndGet, interfaceC19106, c6909, c15334, iM33631), new RunnableC7173(this, iIncrementAndGet, interfaceC19106, c6909, c15334, iM33631, runnableC14303));
                c2434.m8208(m50880(c9145M50871));
                this.f72972 = c2434;
                try {
                    c2434.m8207(interfaceC19106.mo11034() ? new ExecutorC20817() : C5261.f18537, Math.min(2, C11138.f35105));
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                try {
                    c15508M33642.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
        th = th4;
        z = false;
        if (!z) {
            try {
                m33612();
                interfaceC19106.setReadOnly(false);
            } finally {
                this.f43663 = false;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m50879(C22572 c22572, int i, InterfaceC19106 interfaceC19106, C6909 c6909, C15334 c15334, int i2) {
        return (!c22572.f43653 && i == c22572.f72986.get() && c22572.f43646 == interfaceC19106 && c22572.f43643 == c6909 && c22572.f72979 == c15334 && c22572.m33631() == i2) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9145 m50871(InterfaceC19106 interfaceC19106, C5438 c5438) {
        C7042 c7042Mo33634 = this.f43644 >= 0 ? mo33634() : this.f43659.m54068(interfaceC19106);
        boolean z = c7042Mo33634 != null;
        if (c7042Mo33634 == null) {
            c7042Mo33634 = new C7042(Math.max(0, this.f43659.getScrollX()), Math.max(0, this.f43659.m54026()), this.f43659.m54108(), this.f43659.m53993());
        }
        if (c7042Mo33634.m19365() <= 0 || c7042Mo33634.m19363() <= 0 || c7042Mo33634.m19364() > Math.max(0, ((int) m33639()) - c7042Mo33634.m19363())) {
            return null;
        }
        int iMax = Math.max(0, m33615(c7042Mo33634.m19364()) - 1);
        int iMin = Math.min(this.f43643.size(), m33615((int) Math.min(2147483647L, ((long) c7042Mo33634.m19364()) + ((long) c7042Mo33634.m19363()))) + 2);
        if (this.f43644 >= 0) {
            iMax = Math.max(0, iMax - 16);
            iMin = Math.min(this.f43643.size(), iMin + 16);
        }
        int iM33646 = m33646(this.f43659.m53968());
        int iM33647 = m33646(this.f43659.m53882());
        C9145 c9145 = new C9145(iMax, iMin, iM33646, iM33647);
        C15508 c15508M33642 = m33642();
        try {
            C15132 c15132 = new C15132(c15508M33642);
            m50874(c15132, c5438, this.f72988);
            for (int i = iMax; i < iMin; i++) {
                if (!this.f43670 && !this.f43653) {
                    m50874(c15132, c5438, i);
                }
                c15508M33642.close();
                return null;
            }
            if (iM33646 < iMax || iM33646 >= iMin) {
                m50874(c15132, c5438, iM33646);
            }
            if (iM33647 != iM33646 && (iM33647 < iMax || iM33647 >= iMin)) {
                m50874(c15132, c5438, iM33647);
            }
            c15508M33642.close();
            if (z) {
                m50894(c7042Mo33634.m19366(), c7042Mo33634.m19365());
            }
            if (this.f43644 >= 0) {
                c7042Mo33634 = new C7042(Math.min(c7042Mo33634.m19366(), Math.max(0, ((int) mo25232()) - c7042Mo33634.m19365())), c7042Mo33634.m19364(), c7042Mo33634.m19365(), c7042Mo33634.m19363());
            }
            boolean z2 = this.f72979.getFloat(iM33646) >= 0.0f && this.f72979.getFloat(iM33647) >= 0.0f;
            while (iMax < iMin && z2) {
                z2 = this.f72979.getFloat(iMax) >= 0.0f;
                iMax++;
            }
            if (z2 && !this.f43670 && !this.f43653 && c7042Mo33634.m19366() <= Math.max(0, ((int) mo25232()) - c7042Mo33634.m19365())) {
                this.f72983 = c9145;
                this.f72971 = c7042Mo33634;
            }
            return c9145;
        } catch (Throwable th) {
            try {
                c15508M33642.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۫ */
    public final C7042 mo33634() {
        return this.f72971 != null ? this.f72971 : super.mo33634();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50874(C15132 c15132, C5438 c5438, int i) {
        if (!this.f72967 || this.f72979.getFloat(i) < 0.0f) {
            C14366 c14366 = this.f43643.get(i);
            int i2 = c14366.f45294 - c14366.f45295;
            int i3 = this.f72977;
            if (i2 >= i3) {
                return;
            }
            this.f72977 = i3 - i2;
            float fM34798 = c14366.m34798(c15132, c5438);
            this.f72979.mo25091(fM34798, i);
            if (fM34798 > this.f72979.getFloat(this.f72988)) {
                this.f72988 = i;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50877(C22572 c22572, int i, InterfaceC19106 interfaceC19106, C6909 c6909, C15334 c15334, int i2, Runnable runnable) {
        try {
            if (i == c22572.f72986.get() && !c22572.f43653 && c22572.f43646 == interfaceC19106 && c22572.f43643 == c6909 && c22572.f72979 == c15334 && c22572.m33631() == i2) {
                c22572.f72988 = c22572.f72972.m8209();
                Throwable thM8206 = c22572.f72972.m8206();
                c22572.f72980 = thM8206;
                if (thM8206 == null) {
                    c22572.f72973 = C9891.m25701(c15334);
                }
                c22572.f72978 = Math.max(c22572.f72978, Math.max(0.0f, c15334.getFloat(c22572.f72988)));
            }
            try {
                c22572.m33612();
                interfaceC19106.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c22572.f72972 = null;
                        c22572.f43663 = false;
                        c22572.f43659.m54090(c22572);
                    }
                }
                c22572.f43659.postInvalidate();
            } catch (Throwable th) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c22572.f72972 = null;
                        c22572.f43663 = false;
                        c22572.f43659.m54090(c22572);
                    }
                }
                c22572.f43659.postInvalidate();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c22572.m33612();
                interfaceC19106.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c22572.f72972 = null;
                        c22572.f43663 = false;
                        c22572.f43659.m54090(c22572);
                    }
                }
                c22572.f43659.postInvalidate();
                throw th2;
            } catch (Throwable th3) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c22572.f72972 = null;
                        c22572.f43663 = false;
                        c22572.f43659.m54090(c22572);
                    }
                }
                c22572.f43659.postInvalidate();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m50880(C9145 c9145) {
        PriorityQueue priorityQueue = new PriorityQueue(32, C2661.comparingInt(new C13884()));
        C18096 c18096M19181 = this.f43643.m19181();
        for (int i = 0; i < this.f43643.size(); i++) {
            C14366 c14366M42205 = c18096M19181.m42205(i);
            int iM34799 = c14366M42205.m34799() - c14366M42205.f45295;
            if (priorityQueue.size() < 32) {
                priorityQueue.add(new C4672(i, iM34799));
            } else if (iM34799 > ((C4672) priorityQueue.peek()).length()) {
                priorityQueue.remove();
                priorityQueue.add(new C4672(i, iM34799));
            }
        }
        C3577 c3577 = new C3577();
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            c3577.add(((C4672) it.next()).m14523());
        }
        c3577.add(this.f72988);
        if (c9145 != null) {
            for (int iM24284 = c9145.m24284(); iM24284 < c9145.m24281(); iM24284++) {
                c3577.add(iM24284);
            }
            c3577.add(c9145.m24283());
            c3577.add(c9145.m24285());
        }
        return c3577.mo2687();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m50894(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f72978 = Math.max(this.f72978, ((i + i2) - mo33635()) - mo33629());
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo33625(RectF rectF, int i) {
        super.mo33625(rectF, i);
        int iM33646 = m33646(Math.max(0, Math.min(i, m33638())));
        if (this.f72974 != 0.0f || this.f72979.getFloat(iM33646) >= 0.0f) {
            return;
        }
        this.f72978 = Math.max(this.f72978, rectF.right - mo33635());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50895(int i, int i2) {
        if (this.f43663 || this.f43653 || this.f72974 > 0.0f || i2 <= 0 || this.f43643.isEmpty() || this.f43659.f78022 != this || !m33641() || this.f72975 != null) {
            return;
        }
        int iM33615 = m33615(Math.max(0, i));
        int iM33616 = m33615(((double) Math.max(0, i)) + ((double) i2));
        int i3 = iM33616 + 1;
        C14763 c14763 = new C14763();
        ArrayList arrayList = new ArrayList();
        m50873(iM33615, i3, c14763, arrayList);
        m50873(i3, Math.min(this.f43643.size(), iM33616 + 17), c14763, arrayList);
        m50873(Math.max(0, iM33615 - 16), iM33615, c14763, arrayList);
        if (c14763.isEmpty()) {
            return;
        }
        RunnableC10637 runnableC10637 = new RunnableC10637(this, c14763.mo2687(), (C14366[]) arrayList.toArray(new C14366[0]));
        this.f72975 = runnableC10637;
        try {
            C5261.f18537.execute(runnableC10637);
        } catch (RuntimeException unused) {
            this.f72975 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50873(int i, int i2, C14763 c14763, ArrayList arrayList) {
        C18096 c18096M19181 = this.f43643.m19181();
        while (i < i2 && c14763.size() < 32) {
            if (this.f72979.getFloat(i) < 0.0f) {
                c14763.add(i);
                arrayList.add(c18096M19181.m42205(i).clone());
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m50891() {
        RunnableC10637 runnableC10637 = this.f72975;
        if (runnableC10637 != null) {
            runnableC10637.f33740 = true;
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25241() {
        m50891();
        if (this.f43663) {
            this.f43653 = true;
            while (this.f43663) {
                SystemClock.sleep(100L);
            }
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܳ */
    public final int mo33635() {
        C14540 c14540 = this.f43640;
        if (c14540.f45816) {
            return super.mo33635();
        }
        return Math.max(super.mo33635(), c14540.f45800);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۚ */
    public final int mo33629() {
        C14540 c14540 = this.f43640;
        if (c14540.f45816) {
            return Math.max(super.mo33629(), c14540.f45800);
        }
        return super.mo33629();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۧ */
    public final float mo25232() {
        float fMo33629;
        int i;
        if (m33650()) {
            C14540 c14540 = this.f43640;
            if (c14540.f45816) {
                fMo33629 = mo33635() + this.f72985;
                i = c14540.f45793;
            } else {
                fMo33629 = mo33629() + this.f72985;
                i = c14540.f45793;
            }
            return fMo33629 + i;
        }
        return mo33635() + m50882() + mo33629();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private float m50882() {
        if (this.f72974 > 0.0f) {
            return (this.f43640.f18967.getTextSize() / this.f72974) * this.f72984;
        }
        return Math.max(this.f72978, this.f72988 < this.f72979.size() ? Math.max(0.0f, this.f72979.getFloat(this.f72988)) : 0.0f);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m50893(boolean z) {
        if (z) {
            return this.f72985;
        }
        float fM50885 = m50885(0);
        if (fM50885 >= 0.0f) {
            C14540 c14540 = this.f43640;
            if (c14540.m16226() == null && c14540.f45755) {
                C24132 c24132 = this.f43659;
                if (c24132.f78033.m4816()) {
                    int iMax = Math.max(0, (c24132.m54108() - mo33635()) - mo33629());
                    int i = this.f72986.get();
                    if (this.f72987 < 0.0f || this.f72970 != m33631() || this.f72981 != i || this.f72982 != iMax) {
                        C15508 c15508Mo15350 = this.f43646.mo15350();
                        try {
                            this.f72987 = c24132.f78033.m4796(0, this.f43643.get(0).m34799(), c14540, c15508Mo15350).m45254(iMax, this.f43643.get(0).m34799());
                            c15508Mo15350.close();
                            this.f72970 = m33631();
                            this.f72981 = i;
                            this.f72982 = iMax;
                        } catch (Throwable th) {
                            try {
                                c15508Mo15350.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    return this.f72987;
                }
            }
        }
        return fM50885;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۘ */
    public final void mo25219() {
        this.f72987 = -1.0f;
        if (m33641()) {
            this.f43655.m40744(this, this.f43659.m54021(), this.f43643, this.f43640.m16214());
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo25239(int i, int i2) {
        this.f72987 = -1.0f;
        super.mo25239(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private float m50885(int i) {
        if (i < 0 || i >= this.f72979.size()) {
            return -1.0f;
        }
        float f = this.f72979.getFloat(i);
        return (f < 0.0f || this.f72974 <= 0.0f) ? f : (this.f43640.f18967.getTextSize() / this.f72974) * f;
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo33622(Canvas canvas, int i, float f, int i2, C10232 c10232) {
        if (this.f72968 == null) {
            this.f72968 = C21576.m49088(R.string.MT_Protector);
        }
        float fM50885 = m50885(i);
        if (fM50885 < 0.0f) {
            return;
        }
        float f2 = i2;
        float fMeasureText = (fM50885 - c10232.measureText(this.f72968)) + 0.0f;
        if (f2 > fMeasureText) {
            C14540 c14540 = this.f43640;
            float fM16203 = f - c14540.m16203();
            float fCeil = (float) Math.ceil(c14540.m16189() + fM16203);
            c10232.setColor(-65536);
            canvas.drawRect(fMeasureText, fM16203, f2, fCeil, c10232);
            c10232.setColor(-1);
            canvas.drawText(this.f72968, c14540.m16213() + fMeasureText, f, c10232);
        }
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo25222(int i, int i2, int i3) throws Throwable {
        m33637();
        m50891();
        boolean z = this.f72974 > 0.0f;
        this.f72974 = 0.0f;
        if (this.f43663) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m33626(this.f43646);
        if (z) {
            this.f72973 = null;
            Arrays.fill(this.f72979.m36786(), -1.0f);
        }
        try {
            C15508 c15508M33642 = m33642();
            try {
                m50872(i, i2, i3, c15508M33642);
                c15508M33642.close();
                m33612();
                if (!z || this.f43659.f78013) {
                    return;
                }
                mo25235();
            } catch (Throwable th) {
                try {
                    c15508M33642.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m33612();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50872(int i, int i2, int i3, C15508 c15508) {
        int i4;
        boolean z;
        C15508 c15509 = c15508;
        int iM33646 = m33646(i);
        int iM33647 = i2 > 0 ? m33646(i + i2) - iM33646 : 0;
        C24132 c24132 = this.f43659;
        int iM37179 = ((i3 <= 0 || c24132.mo52320()) ? 0 : c15509.m37179(i + i3) - c15509.m37179(i)) - iM33647;
        C9891 c9891 = this.f72973;
        int i5 = this.f43643.get(iM33646).f45295;
        int iM19180 = (this.f43643.m19180(iM33647 + iM33646) + i3) - i2;
        if (iM37179 != 0) {
            this.f72973 = null;
            if (iM37179 < 0) {
                int i6 = iM33646 - iM37179;
                this.f43643.m19168(iM33646, i6);
                this.f43655.m40742(iM33646, i6);
                this.f72979.mo25092(iM33646, i6);
            } else {
                C6909 c6909 = new C6909();
                C14366 c14366 = new C14366();
                for (int i7 = 0; i7 < iM37179; i7++) {
                    c6909.m19173(c14366);
                }
                float[] fArr = new float[iM37179];
                Arrays.fill(fArr, -1.0f);
                this.f43643.addAll(iM33646, c6909);
                this.f43655.m40748(iM33646, iM37179);
                this.f72979.m36783(iM33646, (InterfaceC21874) C15334.m36782(fArr));
            }
        }
        C14540 c14540 = this.f43640;
        int iM16214 = c14540.m16214();
        C18096 c18096M19181 = this.f43643.m19181();
        C22968 c22968M33621 = m33621(c15509, i5, iM19180);
        boolean z2 = true;
        int i8 = i5;
        int i9 = iM33646;
        while (z2) {
            try {
                int iM51841 = c22968M33621.m51841();
                if (iM51841 == -1 || iM51841 >= iM19180) {
                    i4 = iM19180;
                    z = false;
                } else {
                    z = z2;
                    i4 = iM51841;
                }
                C14366 c14366M42205 = c18096M19181.m42205(i9);
                c14366M42205.m34800(i8, i4, i9);
                this.f43643.m19184(i9, c14366M42205);
                if (!c24132.f78013) {
                    if (c14366M42205.f45294 - c14366M42205.f45295 < 10000) {
                        try {
                            this.f72979.mo25091(c14366M42205.m34798(c15509, c14540), i9);
                            C9891 c9892 = this.f72973;
                            if (c9892 != null) {
                                c9892.m25706(i9);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        this.f72979.mo25091(-1.0f, i9);
                        C9891 c9893 = this.f72973;
                        if (c9893 != null) {
                            c9893.m25706(i9);
                        }
                    }
                    this.f43655.m40743(i9, this, c15508, i8, iM16214);
                }
                i8 = i4 + 1;
                i9++;
                c15509 = c15508;
                z2 = z;
            } catch (Throwable th) {
                try {
                    c22968M33621.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i10 = i9;
        c22968M33621.close();
        this.f72976 = iM33646;
        this.f72969 = i10;
        if (iM37179 != 0) {
            this.f43643.m19182(iM33646, i10);
        }
        C6909 c69010 = this.f43643;
        c69010.m19169(i10, c69010.size(), i3 - i2, iM37179);
        if (c24132.f78013) {
            int i11 = this.f72988;
            if (i11 >= iM33646) {
                this.f72988 = i11 + iM37179;
                return;
            }
            return;
        }
        int i12 = this.f72976;
        int i13 = this.f72969;
        int iM16215 = c14540.m16214();
        C10262 c10262 = c24132.f78033.f4725;
        if (c10262.f32767) {
            int iM33648 = m33646(c10262.f32768);
            int iM33649 = m33646(c10262.f32766);
            C14366 c14367 = this.f43643.get(iM33648);
            C14366 c14368 = this.f43643.get(iM33649);
            int iMin = Math.min(i12, c14367.f45296);
            int iMax = Math.max(i13, c14368.f45296 + 1);
            for (int i14 = iMin; i14 < i12; i14++) {
                this.f43655.m40743(i14, this, c15508, this.f43643.m19176(i14), iM16215);
            }
            while (i13 < iMax) {
                this.f43655.m40743(i13, this, c15508, this.f43643.m19176(i13), iM16215);
                i13++;
            }
            i12 = iMin;
            i13 = iMax;
        }
        this.f43655.m40749(i12, i13);
        if (iM37179 != 0) {
            if (c9891 != null) {
                if (c9891.m25707(iM33646)) {
                    this.f72973 = c9891;
                }
            } else {
                this.f72973 = C9891.m25701(this.f72979);
            }
        }
        if (this.f72973 == null) {
            this.f72973 = C9891.m25701(this.f72979);
        }
        int iM25705 = this.f72973.m25705();
        this.f72988 = iM25705;
        float fMax = Math.max(0.0f, this.f72979.getFloat(iM25705));
        if (this.f43643.size() >= 50 || m33638() >= 10000) {
            fMax = Math.max(this.f72978, fMax);
        }
        this.f72978 = fMax;
        this.f43630 = m33617(0);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo25221(float f) {
        if (this.f72974 == 0.0f) {
            this.f72986.incrementAndGet();
            mo25241();
            if (this.f72988 < this.f43643.size()) {
                this.f72984 = m50882();
                this.f72974 = f;
            }
        }
        this.f43630 = m33617(0);
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ܰ */
    public final void mo25235() throws Throwable {
        boolean zM33641 = m33641();
        C24132 c24132 = this.f43659;
        if (!zM33641) {
            if (c24132.f78022 == this && c24132.m53872()) {
                return;
            }
            mo25242(this.f43646);
            return;
        }
        this.f72974 = 0.0f;
        this.f72986.incrementAndGet();
        mo25241();
        this.f43630 = m33617(0);
        this.f72967 = false;
        this.f72978 = 0.0f;
        Arrays.fill(this.f72979.m36786(), -1.0f);
        m50886();
        m50881();
        c24132.mo52308();
    }

    @Override // l.AbstractC13753
    /* JADX INFO: renamed from: ۙ */
    public final void mo25224(C6178 c6178) {
        super.mo25224(c6178);
        c6178.writeInt(this.f72988);
    }
}
