package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19367 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f62562;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1468 f62563;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9670 f62564;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f62565;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f62566;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f62567;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f62568;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f62569;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f62570;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f62571;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f62572;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public RunnableC14303 f62573;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15180 f62574;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f62575;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62576;

    public RunnableC19367(C9670 c9670, int i, C1468 c1468, int i2, int i3) {
        this.f62564 = c9670;
        this.f62567 = c9670.f43646;
        this.f62571 = c9670.m33631();
        C24132 c24132 = c9670.f43659;
        this.f62570 = c24132.m54027();
        this.f62575 = c9670.f31221.get();
        this.f62565 = c24132.m53993();
        this.f62569 = c24132.mo52320();
        this.f62574 = c24132.m54039();
        this.f62562 = i;
        this.f62563 = c1468;
        this.f62566 = i2;
        this.f62568 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44784() {
        if (this.f62572 || this.f62564.f31231 != this || this.f62564.f43670 || this.f62575 != this.f62564.f31221.get()) {
            return true;
        }
        C9670 c9670 = this.f62564;
        if (c9670.f43659.f78022 != c9670) {
            return true;
        }
        InterfaceC19106 interfaceC19106 = c9670.f43646;
        InterfaceC19106 interfaceC19107 = this.f62567;
        return (interfaceC19106 == interfaceC19107 && interfaceC19107.mo15344() == this.f62571) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        Runnable runnableC12022;
        SystemClock.elapsedRealtime();
        while (true) {
            z = false;
            try {
                try {
                    if (!this.f62564.f43663 || m44784()) {
                        break;
                    } else {
                        SystemClock.sleep(10L);
                    }
                } catch (Throwable th) {
                    this.f62567.setReadOnly(false);
                    C21576.m49068(new RunnableC12022(1, this));
                    throw th;
                }
            } catch (Error | Exception e) {
                final Throwable th2 = m44784() ? null : e;
                this.f62567.setReadOnly(false);
                runnableC12022 = new Runnable() { // from class: l.ܿ᩸ᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC19367.m44783(this.f60547, th2);
                    }
                };
            }
        }
        if (m44784()) {
            this.f62567.setReadOnly(false);
            runnableC12022 = new RunnableC12022(1, this);
        } else {
            final C15508 c15508Mo15350 = this.f62567.mo15350();
            try {
                if (c15508Mo15350.m37177() != this.f62571) {
                    c15508Mo15350.close();
                    this.f62567.setReadOnly(false);
                    runnableC12022 = new RunnableC12022(1, this);
                } else {
                    final C6909 c6909 = new C6909();
                    C22968 c22968M37173 = c15508Mo15350.m37173(this.f62569 ? c15508Mo15350.length() : 0, c15508Mo15350.length());
                    try {
                        C14366 c14366 = new C14366();
                        int i = 0;
                        int i2 = 0;
                        while (!m44784()) {
                            int iM51841 = c22968M37173.m51841();
                            int i3 = i2 + 1;
                            c14366.m34800(i, iM51841 < 0 ? c15508Mo15350.length() : iM51841, i2);
                            c6909.m19173(c14366);
                            i = iM51841 + 1;
                            if (iM51841 < 0) {
                                c22968M37173.close();
                                ArrayList<C14145> arrayListM50317 = C22263.m50317(c15508Mo15350, c6909, (C23821) null, new C21605(this));
                                ArrayList arrayList = new ArrayList(arrayListM50317.size());
                                for (final C14145 c14145 : arrayListM50317) {
                                    arrayList.add(new InterfaceC2959() { // from class: l.֡᩸ᩴ
                                        @Override // l.InterfaceC2959
                                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                        public final C6909 mo3042(C19984 c19984) {
                                            RunnableC19367 runnableC19367 = this.f2653;
                                            return C9670.m25184((CharSequence) c19984, c6909, c14145, runnableC19367.f62562, runnableC19367.f62563, (BooleanSupplier) new C21605(runnableC19367));
                                        }
                                    });
                                }
                                int i4 = 0;
                                while (i4 < arrayListM50317.size() && ((C14145) arrayListM50317.get(i4)).m34357() < this.f62566) {
                                    i4++;
                                }
                                final boolean z2 = true;
                                int iMin = Math.min(arrayList.size(), Math.max(C7434.f24471, i4 + 1));
                                final C6909 c6909M20371 = C7434.m20371(new Supplier() { // from class: l.ܰ᩸ᩴ
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c15508Mo15350.m37172();
                                    }
                                }, arrayList.subList(0, iMin), new C21605(this));
                                float fM16189 = this.f62563.f5123.m16189();
                                while (c6909M20371 != null && iMin < arrayList.size() && !m44784() && (((long) (c6909M20371.size() - C9670.m25211(c6909M20371, this.f62566))) - 1) * fM16189 <= this.f62565 + this.f62568) {
                                    int iMin2 = Math.min(arrayList.size(), C7434.f24471 + iMin);
                                    C6909 c6909M20372 = C7434.m20371(new Supplier() { // from class: l.ܰ᩸ᩴ
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return c15508Mo15350.m37172();
                                        }
                                    }, arrayList.subList(iMin, iMin2), new C21605(this));
                                    if (c6909M20372 == null) {
                                        c15508Mo15350.close();
                                        this.f62567.setReadOnly(false);
                                        runnableC12022 = new RunnableC12022(1, this);
                                    } else {
                                        c6909M20371.m19172(c6909M20372);
                                        iMin = iMin2;
                                    }
                                }
                                if (c6909M20371 == null || m44784()) {
                                    c15508Mo15350.close();
                                    this.f62567.setReadOnly(false);
                                    runnableC12022 = new RunnableC12022(1, this);
                                } else {
                                    if (iMin == arrayList.size()) {
                                        this.f62564.m25189(arrayList.size(), C7434.f24471, c6909M20371);
                                        final int iM25211 = C9670.m25211(c6909M20371, this.f62566);
                                        C21576.m49068(new Runnable() { // from class: l.۟᩸ᩴ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC19367 runnableC19367 = this.f26977;
                                                boolean z3 = z2;
                                                C6909 c69010 = c6909M20371;
                                                int i5 = iM25211;
                                                if (runnableC19367.m44784()) {
                                                    return;
                                                }
                                                if (!runnableC19367.f62574.equals(runnableC19367.f62564.f43659.m54039()) || runnableC19367.f62562 != (runnableC19367.f62564.f31224 - runnableC19367.f62564.mo33635()) - runnableC19367.f62564.mo33629()) {
                                                    runnableC19367.f62564.m25204();
                                                    return;
                                                }
                                                if (z3 || runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                    synchronized (runnableC19367.f62564) {
                                                        runnableC19367.f62564.f43653 = false;
                                                        C9670 c9670 = runnableC19367.f62564;
                                                        c9670.f43643 = c69010;
                                                        c9670.f31226 = z3 ? null : c69010;
                                                        if (z3) {
                                                            runnableC19367.f62564.f31232 = c69010;
                                                            runnableC19367.f62564.f31223 = runnableC19367.f62562;
                                                            runnableC19367.f62564.f43656 = runnableC19367.f62574;
                                                        }
                                                    }
                                                    if (runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                        C9670 c9671 = runnableC19367.f62564;
                                                        if (c9671.f43659.m53941(c9671)) {
                                                            C24132 c24132 = runnableC19367.f62564.f43659;
                                                            c24132.m54036(c24132.m53873(c24132.m54026()));
                                                        } else {
                                                            C24132 c24133 = runnableC19367.f62564.f43659;
                                                            c24133.m54036(c24133.m53873(((int) (runnableC19367.f62563.f5123.m16189() * i5)) + runnableC19367.f62568));
                                                        }
                                                    } else {
                                                        C24132 c24134 = runnableC19367.f62564.f43659;
                                                        c24134.m54036(c24134.m53873(c24134.m54026()));
                                                    }
                                                    runnableC19367.f62564.f43659.invalidate();
                                                }
                                            }
                                        });
                                    } else {
                                        C9670 c9670 = this.f62564;
                                        int size = arrayList.size();
                                        int i5 = C7434.f24471;
                                        c9670.m25189(size, i5, c6909M20371);
                                        final int iM25212 = C9670.m25211(c6909M20371, this.f62566);
                                        C21576.m49068(new Runnable() { // from class: l.۟᩸ᩴ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC19367 runnableC19367 = this.f26977;
                                                boolean z3 = z;
                                                C6909 c69010 = c6909M20371;
                                                int i6 = iM25212;
                                                if (runnableC19367.m44784()) {
                                                    return;
                                                }
                                                if (!runnableC19367.f62574.equals(runnableC19367.f62564.f43659.m54039()) || runnableC19367.f62562 != (runnableC19367.f62564.f31224 - runnableC19367.f62564.mo33635()) - runnableC19367.f62564.mo33629()) {
                                                    runnableC19367.f62564.m25204();
                                                    return;
                                                }
                                                if (z3 || runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                    synchronized (runnableC19367.f62564) {
                                                        runnableC19367.f62564.f43653 = false;
                                                        C9670 c9671 = runnableC19367.f62564;
                                                        c9671.f43643 = c69010;
                                                        c9671.f31226 = z3 ? null : c69010;
                                                        if (z3) {
                                                            runnableC19367.f62564.f31232 = c69010;
                                                            runnableC19367.f62564.f31223 = runnableC19367.f62562;
                                                            runnableC19367.f62564.f43656 = runnableC19367.f62574;
                                                        }
                                                    }
                                                    if (runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                        C9670 c9672 = runnableC19367.f62564;
                                                        if (c9672.f43659.m53941(c9672)) {
                                                            C24132 c24134 = runnableC19367.f62564.f43659;
                                                            c24134.m54036(c24134.m53873(c24134.m54026()));
                                                        } else {
                                                            C24132 c24133 = runnableC19367.f62564.f43659;
                                                            c24133.m54036(c24133.m53873(((int) (runnableC19367.f62563.f5123.m16189() * i6)) + runnableC19367.f62568));
                                                        }
                                                    } else {
                                                        C24132 c24135 = runnableC19367.f62564.f43659;
                                                        c24135.m54036(c24135.m53873(c24135.m54026()));
                                                    }
                                                    runnableC19367.f62564.f43659.invalidate();
                                                }
                                            }
                                        });
                                        C6909 c6909M20373 = C7434.m20371(new Supplier() { // from class: l.ܰ᩸ᩴ
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return c15508Mo15350.m37172();
                                            }
                                        }, arrayList.subList(iMin, arrayList.size()), new C21605(this));
                                        if (c6909M20373 == null || m44784()) {
                                            c15508Mo15350.close();
                                            this.f62567.setReadOnly(false);
                                            runnableC12022 = new RunnableC12022(1, this);
                                        } else {
                                            final C6909 c69010 = new C6909(c6909M20371);
                                            c69010.m19172(c6909M20373);
                                            this.f62564.m25189(arrayList.size(), i5, c69010);
                                            final int iM25213 = C9670.m25211(c69010, this.f62566);
                                            C21576.m49068(new Runnable() { // from class: l.۟᩸ᩴ
                                                /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    RunnableC19367 runnableC19367 = this.f26977;
                                                    boolean z3 = z2;
                                                    C6909 c69011 = c69010;
                                                    int i6 = iM25213;
                                                    if (runnableC19367.m44784()) {
                                                        return;
                                                    }
                                                    if (!runnableC19367.f62574.equals(runnableC19367.f62564.f43659.m54039()) || runnableC19367.f62562 != (runnableC19367.f62564.f31224 - runnableC19367.f62564.mo33635()) - runnableC19367.f62564.mo33629()) {
                                                        runnableC19367.f62564.m25204();
                                                        return;
                                                    }
                                                    if (z3 || runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                        synchronized (runnableC19367.f62564) {
                                                            runnableC19367.f62564.f43653 = false;
                                                            C9670 c9671 = runnableC19367.f62564;
                                                            c9671.f43643 = c69011;
                                                            c9671.f31226 = z3 ? null : c69011;
                                                            if (z3) {
                                                                runnableC19367.f62564.f31232 = c69011;
                                                                runnableC19367.f62564.f31223 = runnableC19367.f62562;
                                                                runnableC19367.f62564.f43656 = runnableC19367.f62574;
                                                            }
                                                        }
                                                        if (runnableC19367.f62570 == runnableC19367.f62564.f43659.m54027()) {
                                                            C9670 c9672 = runnableC19367.f62564;
                                                            if (c9672.f43659.m53941(c9672)) {
                                                                C24132 c24135 = runnableC19367.f62564.f43659;
                                                                c24135.m54036(c24135.m53873(c24135.m54026()));
                                                            } else {
                                                                C24132 c24133 = runnableC19367.f62564.f43659;
                                                                c24133.m54036(c24133.m53873(((int) (runnableC19367.f62563.f5123.m16189() * i6)) + runnableC19367.f62568));
                                                            }
                                                        } else {
                                                            C24132 c24136 = runnableC19367.f62564.f43659;
                                                            c24136.m54036(c24136.m53873(c24136.m54026()));
                                                        }
                                                        runnableC19367.f62564.f43659.invalidate();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    c15508Mo15350.close();
                                    this.f62567.setReadOnly(false);
                                    runnableC12022 = new RunnableC12022(1, this);
                                }
                            } else {
                                i2 = i3;
                            }
                        }
                        c22968M37173.close();
                        c15508Mo15350.close();
                        this.f62567.setReadOnly(false);
                        runnableC12022 = new RunnableC12022(1, this);
                    } catch (Throwable th3) {
                        try {
                            c22968M37173.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        C21576.m49068(runnableC12022);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44783(RunnableC19367 runnableC19367, Throwable th) {
        C9670 c9670;
        try {
            if (runnableC19367.f62564.f31231 == runnableC19367) {
                if (!runnableC19367.f62576 || runnableC19367.f62564.f43670) {
                    if (th != null && !runnableC19367.m44784()) {
                        runnableC19367.f62564.f31227 = th;
                    }
                    runnableC19367.f62564.f31231 = null;
                    c9670 = runnableC19367.f62564;
                    if (c9670.f43643 != c9670.f31232) {
                        C9670 c9671 = runnableC19367.f62564;
                        c9671.f43643 = c9671.f31232;
                    }
                    runnableC19367.f62564.f31226 = null;
                    if (!runnableC19367.f62564.f43663) {
                        runnableC19367.f62564.f43653 = false;
                    }
                    runnableC19367.f62564.f43659.invalidate();
                    C9670 c9672 = runnableC19367.f62564;
                    c9672.f43659.m54090(c9672);
                } else {
                    C9670 c9673 = runnableC19367.f62564;
                    if (c9673.f43659.f78022 == c9673) {
                        InterfaceC19106 interfaceC19106 = c9673.f43646;
                        InterfaceC19106 interfaceC19107 = runnableC19367.f62567;
                        if (interfaceC19106 != interfaceC19107 || interfaceC19107.mo15344() != runnableC19367.f62571 || runnableC19367.f62575 != runnableC19367.f62564.f31221.get()) {
                            if (th != null) {
                                runnableC19367.f62564.f31227 = th;
                            }
                            runnableC19367.f62564.f31231 = null;
                            c9670 = runnableC19367.f62564;
                            if (c9670.f43643 != c9670.f31232) {
                                C9670 c9674 = runnableC19367.f62564;
                                c9674.f43643 = c9674.f31232;
                            }
                            runnableC19367.f62564.f31226 = null;
                            if (!runnableC19367.f62564.f43663) {
                                runnableC19367.f62564.f43653 = false;
                            }
                            runnableC19367.f62564.f43659.invalidate();
                            C9670 c9675 = runnableC19367.f62564;
                            c9675.f43659.m54090(c9675);
                        }
                    } else {
                        if (th != null) {
                            runnableC19367.f62564.f31227 = th;
                        }
                        runnableC19367.f62564.f31231 = null;
                        c9670 = runnableC19367.f62564;
                        if (c9670.f43643 != c9670.f31232) {
                            C9670 c9676 = runnableC19367.f62564;
                            c9676.f43643 = c9676.f31232;
                        }
                        runnableC19367.f62564.f31226 = null;
                        if (!runnableC19367.f62564.f43663) {
                            runnableC19367.f62564.f43653 = false;
                        }
                        runnableC19367.f62564.f43659.invalidate();
                        C9670 c9677 = runnableC19367.f62564;
                        c9677.f43659.m54090(c9677);
                    }
                }
            }
        } finally {
            runnableC19367.f62573.run();
        }
    }
}
