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

/* JADX INFO: renamed from: l.᩸ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21489 extends AbstractC12359 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public String f69819;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C11425 f69820;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69821;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public volatile C16592 f69822;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69823;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public volatile C22008 f69824;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C10982 f69825;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f69826;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f69827;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f69828;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f69829;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC15140 f69830;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C0840 f69831;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f69832;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public volatile Throwable f69833;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f69834;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f69835;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f69836;

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۘ */
    public final byte mo14781() {
        return (byte) 0;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14788() {
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m48130() {
        return this.f69835 == 0.0f && this.f69825.size() == this.f41308.size();
    }

    public C21489(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, int i, C12131 c12131, C6816 c6816, C3329 c3329) {
        float f;
        super(c6111, c1590);
        this.f69825 = new C10982();
        this.f69823 = new AtomicInteger();
        this.f41313 = i;
        if (c3329 != null) {
            m30741(interfaceC2916, c3329.m9891());
        }
        m30740(interfaceC2916);
        try {
            C10982 c10982 = ((C21489) c12131.f40614).f69825;
            C16364 c16364M30189 = c12131.m30189(this, c6816);
            this.f69825.m27736(this.f41308.size());
            int i2 = 0;
            while (i2 < this.f41308.size()) {
                if (i2 < c16364M30189.m38560()) {
                    f = c10982.getFloat(i2);
                } else {
                    f = i2 >= c16364M30189.m38559() ? c10982.getFloat(((c12131.f40611 + 1) + i2) - c16364M30189.m38559()) : -1.0f;
                }
                this.f69825.add(f);
                if (f > this.f69825.getFloat(this.f69832)) {
                    this.f69832 = i2;
                }
                i2++;
            }
            this.f41316 = m30731(0);
            this.f69821 = true;
            m48109();
        } finally {
            if (!this.f41317) {
                m30755();
            }
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۧ */
    public final int mo14794() {
        return this.f69823.get();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ֡ */
    public final Throwable mo14778() {
        return this.f69833;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo14800(C16592 c16592) {
        return c16592.m39024() > 0 && mo14782(c16592) == c16592.m39024();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final int mo14782(C16592 c16592) {
        if (this.f41325 || this.f69833 != null || this.f69822 == null || c16592.m39024() <= 0) {
            return 0;
        }
        if (this.f41313 < 0) {
            if (c16592.equals(this.f69822)) {
                return c16592.m39024();
            }
            return 0;
        }
        C22008 c22008 = this.f69824;
        if (c22008 == null || c16592.m39026() != this.f69822.m39026() || c16592.m39025() < 0) {
            return 0;
        }
        if (c16592.m39023() < this.f41286.m17870() * c22008.m48897()) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(c16592.m39024(), (Math.ceil(this.f41286.m17870() * c22008.m48894()) - 1.0d) - ((double) c16592.m39023())));
    }

    public C21489(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590) {
        this(c6111, interfaceC2916, c1590, -1, null);
    }

    public C21489(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, int i, C3329 c3329) {
        super(c6111, c1590);
        this.f69825 = new C10982();
        this.f69823 = new AtomicInteger();
        this.f41313 = i;
        if (c3329 != null) {
            m30741(interfaceC2916, c3329.m9891());
        }
        mo14798(interfaceC2916);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final int mo30732(int i, int i2) {
        C22008 c22008 = this.f69824;
        if (c22008 == null) {
            return super.mo30732(i, i2);
        }
        int iCeil = (int) Math.ceil(this.f41286.m17870() * c22008.m48897());
        return Math.max(iCeil, Math.min(i, Math.max(iCeil, (((int) (this.f41286.m17870() * c22008.m48894())) - i2) - 1)));
    }

    public C21489(C6111 c6111, InterfaceC2916 interfaceC2916, C1590 c1590, C17367 c17367) throws Throwable {
        super(c6111, interfaceC2916, c1590, c17367);
        this.f69825 = new C10982();
        this.f69823 = new AtomicInteger();
        this.f69832 = c17367.readInt();
        int size = this.f41308.size();
        this.f69825.m27736(size);
        for (int i = 0; i < size; i++) {
            this.f69825.add(-1.0f);
        }
        m30740(interfaceC2916);
        try {
            C3329 c3329M30760 = m30760();
            try {
                C9496 c9496M10817 = this.f41308.m10817();
                for (int i2 = 0; i2 < this.f41308.size(); i2++) {
                    C14435 c14435M24325 = c9496M10817.m24325(i2);
                    c14435M24325.m34710(c3329M30760);
                    this.f41308.m10820(i2, c14435M24325);
                }
                c3329M30760.close();
                m30755();
                m48109();
            } catch (Throwable th) {
                try {
                    c3329M30760.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m30755();
            throw th3;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo14785(String str) {
        super.mo14785(str);
        m48122();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m48122() {
        int size = this.f41322.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            float fM34707 = this.f41322.get(i).m34707(this.f41300, this.f41286);
            if (fM34707 > f) {
                f = fM34707;
            }
        }
        this.f69827 = f;
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ */
    public final void mo14798(InterfaceC2916 interfaceC2916) {
        try {
            m48124(interfaceC2916);
        } finally {
            if (!this.f41317) {
                m30755();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m48124(InterfaceC2916 interfaceC2916) throws Throwable {
        m30749();
        this.f69821 = false;
        this.f69835 = 0.0f;
        mo14797();
        this.f41288 = false;
        m30740(interfaceC2916);
        C3662 c3662 = this.f41308.isEmpty() ? this.f41308 : new C3662();
        C15846 c15846 = this.f41315.isEmpty() ? this.f41315 : new C15846();
        this.f69825 = new C10982();
        this.f69820 = null;
        this.f69836 = 0.0f;
        c15846.clear();
        C3329 c3329M30760 = m30760();
        try {
            int iM17881 = this.f41286.m17881();
            C1918 c1918M30735 = m30735(c3329M30760, 0, c3329M30760.length());
            try {
                C14435 c14435 = new C14435();
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    if (this.f41288) {
                        c3662.clear();
                        this.f69825.clear();
                        c15846.clear();
                        c1918M30735.close();
                        c3329M30760.close();
                        return;
                    }
                    c15846.add(C8084.m21291(this, c3329M30760, i, iM17881));
                    int iM6244 = c1918M30735.m6244();
                    if (iM6244 == -1) {
                        iM6244 = c3329M30760.length();
                        z = false;
                    }
                    c14435.m34709(i, iM6244, i2);
                    c3662.m10810(c14435);
                    this.f69825.add(-1.0f);
                    i = iM6244 + 1;
                    i2++;
                    try {
                        c3329M30760.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
                c1918M30735.close();
                c15846.m37708();
                C9496 c9496M10817 = c3662.m10817();
                for (int i3 = 0; i3 < c3662.size(); i3++) {
                    C14435 c14435M24325 = c9496M10817.m24325(i3);
                    c14435M24325.m34710(c3329M30760);
                    c3662.m10820(i3, c14435M24325);
                }
                c3329M30760.close();
                this.f41308 = c3662;
                this.f41315 = c15846;
                this.f41316 = m30731(0);
                m48109();
            } catch (Throwable th2) {
                try {
                    c1918M30735.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            c3329M30760.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m48109() throws Throwable {
        C6585 c6585M17872;
        RunnableC4970 runnableC4970;
        float fM34707;
        int iIncrementAndGet = this.f69823.incrementAndGet();
        mo14797();
        this.f69822 = null;
        this.f69820 = null;
        this.f69824 = null;
        this.f69833 = null;
        if (!this.f69821) {
            m30749();
        }
        InterfaceC2916 interfaceC2916 = this.f41297;
        m30740(interfaceC2916);
        boolean z = true;
        interfaceC2916.setReadOnly(true);
        this.f41317 = true;
        this.f41325 = false;
        this.f69834 = 10000;
        try {
            if (this.f69832 >= this.f41308.size()) {
                this.f69832 = 0;
            }
            C3329 c3329M30760 = m30760();
            try {
                if (this.f41308.m10816(this.f69832) - this.f41308.m10813(this.f69832) < 10000 && (!this.f69821 || this.f69825.getFloat(this.f69832) < 0.0f)) {
                    int i = this.f69832;
                    try {
                        this.f69825.mo26064(this.f41308.get(i).m34707(c3329M30760, this.f41286), i);
                        C11425 c11425 = this.f69820;
                        if (c11425 != null) {
                            c11425.m28541(i);
                        }
                    } catch (Exception unused) {
                    }
                    this.f69834 -= this.f41308.m10816(this.f69832) - this.f41308.m10813(this.f69832);
                }
                if (this.f41308.size() < 50 && m30756() < 10000) {
                    float f = this.f69825.getFloat(this.f69832);
                    for (int i2 = 0; i2 < this.f41308.size(); i2++) {
                        if (this.f69821 && this.f69825.getFloat(i2) >= 0.0f) {
                            fM34707 = this.f69825.getFloat(i2);
                        } else {
                            try {
                                fM34707 = this.f41308.get(i2).m34707(c3329M30760, this.f41286);
                                this.f69825.mo26064(fM34707, i2);
                                C11425 c11426 = this.f69820;
                                if (c11426 != null) {
                                    c11426.m28541(i2);
                                }
                            } catch (Exception unused2) {
                                fM34707 = 0.0f;
                            }
                        }
                        if (fM34707 > f) {
                            this.f69832 = i2;
                            f = fM34707;
                        }
                    }
                    this.f69820 = C11425.m28537(this.f69825);
                    this.f69836 = Math.max(this.f69836, Math.max(0.0f, this.f69825.getFloat(this.f69832)));
                    c3329M30760.close();
                    try {
                        m30755();
                        interfaceC2916.setReadOnly(false);
                        return;
                    } finally {
                        this.f41317 = false;
                    }
                }
                c3329M30760.close();
                C3662 c3662 = this.f41308;
                C10982 c10982 = this.f69825;
                int iM30745 = m30745();
                synchronized (this.f41286) {
                    c6585M17872 = this.f41286.m17872();
                }
                C22008 c22008M48111 = m48111(interfaceC2916, c6585M17872);
                if (c3662.size() > 100000) {
                    C6111 c6111 = this.f41314;
                    c6111.getClass();
                    C16737.m39273(new RunnableC3185(0, c6111));
                    runnableC4970 = new RunnableC4970(0, c6111);
                } else {
                    runnableC4970 = null;
                }
                C0840 c0840 = new C0840(new C2438(0, this), c3662, c10982, c6585M17872, this.f69832, c22008M48111, this.f69821, new C5261(this, iIncrementAndGet, interfaceC2916, c3662, c10982, iM30745), new RunnableC22195(this, iIncrementAndGet, interfaceC2916, c3662, c10982, iM30745, runnableC4970));
                c0840.m3447(m48120(c22008M48111));
                this.f69831 = c0840;
                try {
                    c0840.m3446(interfaceC2916.mo8725() ? new ExecutorC2053() : C4716.f16633, Math.min(2, C5464.f18831));
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                try {
                    c3329M30760.close();
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
                m30755();
                interfaceC2916.setReadOnly(false);
            } finally {
                this.f41317 = false;
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48119(C21489 c21489, int i, InterfaceC2916 interfaceC2916, C3662 c3662, C10982 c10982, int i2) {
        return (!c21489.f41325 && i == c21489.f69823.get() && c21489.f41297 == interfaceC2916 && c21489.f41308 == c3662 && c21489.f69825 == c10982 && c21489.m30745() == i2) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22008 m48111(InterfaceC2916 interfaceC2916, C6585 c6585) {
        C16592 c16592Mo30725 = this.f41313 >= 0 ? mo30725() : this.f41314.m16983(interfaceC2916);
        boolean z = c16592Mo30725 != null;
        if (c16592Mo30725 == null) {
            c16592Mo30725 = new C16592(Math.max(0, this.f41314.getScrollX()), Math.max(0, this.f41314.m17066()), this.f41314.m16978(), this.f41314.m16814());
        }
        if (c16592Mo30725.m39026() <= 0 || c16592Mo30725.m39024() <= 0 || c16592Mo30725.m39023() > Math.max(0, ((int) m30743()) - c16592Mo30725.m39024())) {
            return null;
        }
        int iMax = Math.max(0, m30729(c16592Mo30725.m39023()) - 1);
        int iMin = Math.min(this.f41308.size(), m30729((int) Math.min(2147483647L, ((long) c16592Mo30725.m39023()) + ((long) c16592Mo30725.m39024()))) + 2);
        if (this.f41313 >= 0) {
            iMax = Math.max(0, iMax - 16);
            iMin = Math.min(this.f41308.size(), iMin + 16);
        }
        int iM30744 = m30744(this.f41314.m16916());
        int iM30745 = m30744(this.f41314.m17020());
        C22008 c22008 = new C22008(iMax, iMin, iM30744, iM30745);
        C3329 c3329M30760 = m30760();
        try {
            C3762 c3762 = new C3762(c3329M30760);
            m48114(c3762, c6585, this.f69832);
            for (int i = iMax; i < iMin; i++) {
                if (!this.f41288 && !this.f41325) {
                    m48114(c3762, c6585, i);
                }
                c3329M30760.close();
                return null;
            }
            if (iM30744 < iMax || iM30744 >= iMin) {
                m48114(c3762, c6585, iM30744);
            }
            if (iM30745 != iM30744 && (iM30745 < iMax || iM30745 >= iMin)) {
                m48114(c3762, c6585, iM30745);
            }
            c3329M30760.close();
            if (z) {
                m48127(c16592Mo30725.m39025(), c16592Mo30725.m39026());
            }
            if (this.f41313 >= 0) {
                c16592Mo30725 = new C16592(Math.min(c16592Mo30725.m39025(), Math.max(0, ((int) mo14790()) - c16592Mo30725.m39026())), c16592Mo30725.m39023(), c16592Mo30725.m39026(), c16592Mo30725.m39024());
            }
            boolean z2 = this.f69825.getFloat(iM30744) >= 0.0f && this.f69825.getFloat(iM30745) >= 0.0f;
            while (iMax < iMin && z2) {
                z2 = this.f69825.getFloat(iMax) >= 0.0f;
                iMax++;
            }
            if (z2 && !this.f41288 && !this.f41325 && c16592Mo30725.m39025() <= Math.max(0, ((int) mo14790()) - c16592Mo30725.m39026())) {
                this.f69824 = c22008;
                this.f69822 = c16592Mo30725;
            }
            return c22008;
        } catch (Throwable th) {
            try {
                c3329M30760.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ֨ */
    public final C16592 mo30725() {
        return this.f69822 != null ? this.f69822 : super.mo30725();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48114(C3762 c3762, C6585 c6585, int i) {
        if (!this.f69821 || this.f69825.getFloat(i) < 0.0f) {
            C14435 c14435 = this.f41308.get(i);
            int i2 = c14435.f47317 - c14435.f47316;
            int i3 = this.f69834;
            if (i2 >= i3) {
                return;
            }
            this.f69834 = i3 - i2;
            float fM34707 = c14435.m34707(c3762, c6585);
            this.f69825.mo26064(fM34707, i);
            if (fM34707 > this.f69825.getFloat(this.f69832)) {
                this.f69832 = i;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48117(C21489 c21489, int i, InterfaceC2916 interfaceC2916, C3662 c3662, C10982 c10982, int i2, Runnable runnable) {
        try {
            if (i == c21489.f69823.get() && !c21489.f41325 && c21489.f41297 == interfaceC2916 && c21489.f41308 == c3662 && c21489.f69825 == c10982 && c21489.m30745() == i2) {
                c21489.f69832 = c21489.f69831.m3448();
                Throwable thM3445 = c21489.f69831.m3445();
                c21489.f69833 = thM3445;
                if (thM3445 == null) {
                    c21489.f69820 = C11425.m28537(c10982);
                }
                c21489.f69836 = Math.max(c21489.f69836, Math.max(0.0f, c10982.getFloat(c21489.f69832)));
            }
            try {
                c21489.m30755();
                interfaceC2916.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c21489.f69831 = null;
                        c21489.f41317 = false;
                        c21489.f41314.m16826(c21489);
                    }
                }
                c21489.f41314.postInvalidate();
            } catch (Throwable th) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c21489.f69831 = null;
                        c21489.f41317 = false;
                        c21489.f41314.m16826(c21489);
                    }
                }
                c21489.f41314.postInvalidate();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c21489.m30755();
                interfaceC2916.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c21489.f69831 = null;
                        c21489.f41317 = false;
                        c21489.f41314.m16826(c21489);
                    }
                }
                c21489.f41314.postInvalidate();
                throw th2;
            } catch (Throwable th3) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                        c21489.f69831 = null;
                        c21489.f41317 = false;
                        c21489.f41314.m16826(c21489);
                    }
                }
                c21489.f41314.postInvalidate();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int[] m48120(C22008 c22008) {
        PriorityQueue priorityQueue = new PriorityQueue(32, C7618.comparingInt(new C1027()));
        C9496 c9496M10817 = this.f41308.m10817();
        for (int i = 0; i < this.f41308.size(); i++) {
            C14435 c14435M24325 = c9496M10817.m24325(i);
            int iM34708 = c14435M24325.m34708() - c14435M24325.f47316;
            if (priorityQueue.size() < 32) {
                priorityQueue.add(new C13023(i, iM34708));
            } else if (iM34708 > ((C13023) priorityQueue.peek()).length()) {
                priorityQueue.remove();
                priorityQueue.add(new C13023(i, iM34708));
            }
        }
        C22125 c22125 = new C22125();
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            c22125.add(((C13023) it.next()).m32202());
        }
        c22125.add(this.f69832);
        if (c22008 != null) {
            for (int iM48897 = c22008.m48897(); iM48897 < c22008.m48894(); iM48897++) {
                c22125.add(iM48897);
            }
            c22125.add(c22008.m48893());
            c22125.add(c22008.m48896());
        }
        return c22125.mo3181();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m48127(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f69836 = Math.max(this.f69836, ((i + i2) - mo30761()) - mo30751());
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo30739(RectF rectF, int i) {
        super.mo30739(rectF, i);
        int iM30744 = m30744(Math.max(0, Math.min(i, m30756())));
        if (this.f69835 != 0.0f || this.f69825.getFloat(iM30744) >= 0.0f) {
            return;
        }
        this.f69836 = Math.max(this.f69836, rectF.right - mo30761());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m48129(int i, int i2) {
        if (this.f41317 || this.f41325 || this.f69835 > 0.0f || i2 <= 0 || this.f41308.isEmpty() || this.f41314.f20764 != this || !m30759() || this.f69830 != null) {
            return;
        }
        int iM30729 = m30729(Math.max(0, i));
        int iM307210 = m30729(((double) Math.max(0, i)) + ((double) i2));
        int i3 = iM307210 + 1;
        C15070 c15070 = new C15070();
        ArrayList arrayList = new ArrayList();
        m48113(iM30729, i3, c15070, arrayList);
        m48113(i3, Math.min(this.f41308.size(), iM307210 + 17), c15070, arrayList);
        m48113(Math.max(0, iM30729 - 16), iM30729, c15070, arrayList);
        if (c15070.isEmpty()) {
            return;
        }
        RunnableC15140 runnableC15140 = new RunnableC15140(this, c15070.mo3181(), (C14435[]) arrayList.toArray(new C14435[0]));
        this.f69830 = runnableC15140;
        try {
            C4716.f16633.execute(runnableC15140);
        } catch (RuntimeException unused) {
            this.f69830 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48113(int i, int i2, C15070 c15070, ArrayList arrayList) {
        C9496 c9496M10817 = this.f41308.m10817();
        while (i < i2 && c15070.size() < 32) {
            if (this.f69825.getFloat(i) < 0.0f) {
                c15070.add(i);
                arrayList.add(c9496M10817.m24325(i).clone());
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48128() {
        RunnableC15140 runnableC15140 = this.f69830;
        if (runnableC15140 != null) {
            runnableC15140.f49468 = true;
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܰ */
    public final void mo14797() {
        m48128();
        if (this.f41317) {
            this.f41325 = true;
            while (this.f41317) {
                SystemClock.sleep(100L);
            }
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ᩹ */
    public final int mo30761() {
        C1590 c1590 = this.f41286;
        if (c1590.f6381) {
            return super.mo30761();
        }
        return Math.max(super.mo30761(), c1590.f6404);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۬ */
    public final int mo30751() {
        C1590 c1590 = this.f41286;
        if (c1590.f6381) {
            return Math.max(super.mo30751(), c1590.f6404);
        }
        return super.mo30751();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۜ */
    public final float mo14790() {
        float fMo30751;
        int i;
        if (m30746()) {
            C1590 c1590 = this.f41286;
            if (c1590.f6381) {
                fMo30751 = mo30761() + this.f69827;
                i = c1590.f6439;
            } else {
                fMo30751 = mo30751() + this.f69827;
                i = c1590.f6439;
            }
            return fMo30751 + i;
        }
        return mo30761() + m48107() + mo30751();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m48107() {
        if (this.f69835 > 0.0f) {
            return (this.f41286.f22196.getTextSize() / this.f69835) * this.f69828;
        }
        return Math.max(this.f69836, this.f69832 < this.f69825.size() ? Math.max(0.0f, this.f69825.getFloat(this.f69832)) : 0.0f);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo30736(Canvas canvas, int i, float f, int i2, C4916 c4916) {
        float textSize;
        if (this.f69819 == null) {
            this.f69819 = C16737.m39288(R.string.MT_Protector);
        }
        C1590 c1590 = this.f41286;
        if (i < 0 || i >= this.f69825.size()) {
            textSize = -1.0f;
        } else {
            textSize = this.f69825.getFloat(i);
            if (textSize >= 0.0f && this.f69835 > 0.0f) {
                textSize *= c1590.f22196.getTextSize() / this.f69835;
            }
        }
        if (textSize < 0.0f) {
            return;
        }
        float f2 = i2;
        float fMeasureText = 0.0f + (textSize - c4916.measureText(this.f69819));
        if (f2 > fMeasureText) {
            float fM17851 = f - c1590.m17851();
            float fCeil = (float) Math.ceil(c1590.m17870() + fM17851);
            c4916.setColor(-65536);
            canvas.drawRect(fMeasureText, fM17851, f2, fCeil, c4916);
            c4916.setColor(-1);
            canvas.drawText(this.f69819, c1590.m17865() + fMeasureText, f, c4916);
        }
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo14784(int i, int i2, int i3) throws Throwable {
        m30754();
        m48128();
        boolean z = this.f69835 > 0.0f;
        this.f69835 = 0.0f;
        if (this.f41317) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m30740(this.f41297);
        if (z) {
            this.f69820 = null;
            Arrays.fill(this.f69825.m27737(), -1.0f);
        }
        try {
            C3329 c3329M30760 = m30760();
            try {
                m48112(i, i2, i3, c3329M30760);
                c3329M30760.close();
                m30755();
                if (!z || this.f41314.f20787) {
                    return;
                }
                mo14802();
            } catch (Throwable th) {
                try {
                    c3329M30760.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            m30755();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48112(int i, int i2, int i3, C3329 c3329) {
        int i4;
        boolean z;
        C3329 c33210 = c3329;
        int iM30744 = m30744(i);
        int iM30745 = i2 > 0 ? m30744(i + i2) - iM30744 : 0;
        C6111 c6111 = this.f41314;
        int iM9893 = ((i3 <= 0 || c6111.mo16903()) ? 0 : c33210.m9893(i + i3) - c33210.m9893(i)) - iM30745;
        C11425 c11425 = this.f69820;
        int i5 = this.f41308.get(iM30744).f47316;
        int iM10816 = (this.f41308.m10816(iM30745 + iM30744) + i3) - i2;
        if (iM9893 != 0) {
            this.f69820 = null;
            if (iM9893 < 0) {
                int i6 = iM30744 - iM9893;
                this.f41308.m10805(iM30744, i6);
                this.f41315.m37704(iM30744, i6);
                this.f69825.mo26065(iM30744, i6);
            } else {
                C3662 c3662 = new C3662();
                C14435 c14435 = new C14435();
                for (int i7 = 0; i7 < iM9893; i7++) {
                    c3662.m10810(c14435);
                }
                float[] fArr = new float[iM9893];
                Arrays.fill(fArr, -1.0f);
                this.f41308.addAll(iM30744, c3662);
                this.f41315.m37710(iM30744, iM9893);
                this.f69825.m27735(iM30744, (InterfaceC16357) C10982.m27733(fArr));
            }
        }
        C1590 c1590 = this.f41286;
        int iM17881 = c1590.m17881();
        C9496 c9496M10817 = this.f41308.m10817();
        C1918 c1918M30735 = m30735(c33210, i5, iM10816);
        boolean z2 = true;
        int i8 = i5;
        int i9 = iM30744;
        while (z2) {
            try {
                int iM6244 = c1918M30735.m6244();
                if (iM6244 == -1 || iM6244 >= iM10816) {
                    i4 = iM10816;
                    z = false;
                } else {
                    z = z2;
                    i4 = iM6244;
                }
                C14435 c14435M24325 = c9496M10817.m24325(i9);
                c14435M24325.m34709(i8, i4, i9);
                this.f41308.m10820(i9, c14435M24325);
                if (!c6111.f20787) {
                    if (c14435M24325.f47317 - c14435M24325.f47316 < 10000) {
                        try {
                            this.f69825.mo26064(c14435M24325.m34707(c33210, c1590), i9);
                            C11425 c11426 = this.f69820;
                            if (c11426 != null) {
                                c11426.m28541(i9);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        this.f69825.mo26064(-1.0f, i9);
                        C11425 c11427 = this.f69820;
                        if (c11427 != null) {
                            c11427.m28541(i9);
                        }
                    }
                    this.f41315.m37705(i9, this, c3329, i8, iM17881);
                }
                i8 = i4 + 1;
                i9++;
                c33210 = c3329;
                z2 = z;
            } catch (Throwable th) {
                try {
                    c1918M30735.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i10 = i9;
        c1918M30735.close();
        this.f69829 = iM30744;
        this.f69826 = i10;
        if (iM9893 != 0) {
            this.f41308.m10818(iM30744, i10);
        }
        C3662 c3663 = this.f41308;
        c3663.m10806(i10, c3663.size(), i3 - i2, iM9893);
        if (c6111.f20787) {
            int i11 = this.f69832;
            if (i11 >= iM30744) {
                this.f69832 = i11 + iM9893;
                return;
            }
            return;
        }
        int i12 = this.f69829;
        int i13 = this.f69826;
        int iM17882 = c1590.m17881();
        C1194 c1194 = c6111.f20770.f43902;
        if (c1194.f5296) {
            int iM30746 = m30744(c1194.f5297);
            int iM30747 = m30744(c1194.f5295);
            C14435 c14436 = this.f41308.get(iM30746);
            C14435 c14437 = this.f41308.get(iM30747);
            int iMin = Math.min(i12, c14436.f47319);
            int iMax = Math.max(i13, c14437.f47319 + 1);
            for (int i14 = iMin; i14 < i12; i14++) {
                this.f41315.m37705(i14, this, c3329, this.f41308.m10813(i14), iM17882);
            }
            while (i13 < iMax) {
                this.f41315.m37705(i13, this, c3329, this.f41308.m10813(i13), iM17882);
                i13++;
            }
            i12 = iMin;
            i13 = iMax;
        }
        this.f41315.m37703(i12, i13);
        if (iM9893 != 0) {
            if (c11425 != null) {
                if (c11425.m28542(iM30744)) {
                    this.f69820 = c11425;
                }
            } else {
                this.f69820 = C11425.m28537(this.f69825);
            }
        }
        if (this.f69820 == null) {
            this.f69820 = C11425.m28537(this.f69825);
        }
        int iM28540 = this.f69820.m28540();
        this.f69832 = iM28540;
        float fMax = Math.max(0.0f, this.f69825.getFloat(iM28540));
        if (this.f41308.size() >= 50 || m30756() >= 10000) {
            fMax = Math.max(this.f69836, fMax);
        }
        this.f69836 = fMax;
        this.f41316 = m30731(0);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo14783(float f) {
        if (this.f69835 == 0.0f) {
            this.f69823.incrementAndGet();
            mo14797();
            if (this.f69832 < this.f41308.size()) {
                this.f69828 = m48107();
                this.f69835 = f;
            }
        }
        this.f41316 = m30731(0);
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ܺ */
    public final void mo14802() throws Throwable {
        boolean zM30759 = m30759();
        C6111 c6111 = this.f41314;
        if (!zM30759) {
            if (c6111.f20764 == this && c6111.m16809()) {
                return;
            }
            mo14798(this.f41297);
            return;
        }
        this.f69835 = 0.0f;
        this.f69823.incrementAndGet();
        mo14797();
        this.f41316 = m30731(0);
        this.f69821 = false;
        this.f69836 = 0.0f;
        Arrays.fill(this.f69825.m27737(), -1.0f);
        m48109();
        m48122();
        c6111.mo17067();
    }

    @Override // l.AbstractC12359
    /* JADX INFO: renamed from: ۙ */
    public final void mo14786(C11018 c11018) {
        super.mo14786(c11018);
        c11018.writeInt(this.f69832);
    }
}
