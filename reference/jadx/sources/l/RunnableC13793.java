package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13793 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RunnableC4970 f45527;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f45528;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f45529;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f45530;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f45531;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f45532;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2502 f45533;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f45534;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f45535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5325 f45536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f45537;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45538;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18811 f45539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f45540;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f45541;

    public RunnableC13793(C5325 c5325, int i, C2502 c2502, int i2, int i3) {
        this.f45536 = c5325;
        this.f45534 = c5325.f41297;
        this.f45529 = c5325.m30745();
        C6111 c6111 = c5325.f41314;
        this.f45531 = c6111.m16979();
        this.f45540 = c5325.f18382.get();
        this.f45530 = c6111.m16814();
        this.f45541 = c6111.mo16903();
        this.f45539 = c6111.m16815();
        this.f45538 = i;
        this.f45533 = c2502;
        this.f45532 = i2;
        this.f45528 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33549() {
        if (this.f45537 || this.f45536.f18379 != this || this.f45536.f41288 || this.f45540 != this.f45536.f18382.get()) {
            return true;
        }
        C5325 c5325 = this.f45536;
        if (c5325.f41314.f20764 != c5325) {
            return true;
        }
        InterfaceC2916 interfaceC2916 = c5325.f41297;
        InterfaceC2916 interfaceC2917 = this.f45534;
        return (interfaceC2916 == interfaceC2917 && interfaceC2917.mo2395() == this.f45529) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        Runnable runnableC1442;
        SystemClock.elapsedRealtime();
        while (true) {
            z = false;
            try {
                try {
                    if (!this.f45536.f41317 || m33549()) {
                        break;
                    } else {
                        SystemClock.sleep(10L);
                    }
                } catch (Throwable th) {
                    this.f45534.setReadOnly(false);
                    C16737.m39273(new RunnableC1442(2, this));
                    throw th;
                }
            } catch (Error | Exception e) {
                final Throwable th2 = m33549() ? null : e;
                this.f45534.setReadOnly(false);
                runnableC1442 = new Runnable() { // from class: l.ۢܰۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC13793.m33548(this.f32410, th2);
                    }
                };
            }
        }
        if (m33549()) {
            this.f45534.setReadOnly(false);
            runnableC1442 = new RunnableC1442(2, this);
        } else {
            final C3329 c3329Mo2399 = this.f45534.mo2399();
            try {
                if (c3329Mo2399.m9896() != this.f45529) {
                    c3329Mo2399.close();
                    this.f45534.setReadOnly(false);
                    runnableC1442 = new RunnableC1442(2, this);
                } else {
                    final C3662 c3662 = new C3662();
                    C1918 c1918M9890 = c3329Mo2399.m9890(this.f45541 ? c3329Mo2399.length() : 0, c3329Mo2399.length());
                    try {
                        C14435 c14435 = new C14435();
                        int i = 0;
                        int i2 = 0;
                        while (!m33549()) {
                            int iM6244 = c1918M9890.m6244();
                            int i3 = i2 + 1;
                            c14435.m34709(i, iM6244 < 0 ? c3329Mo2399.length() : iM6244, i2);
                            c3662.m10810(c14435);
                            i = iM6244 + 1;
                            if (iM6244 < 0) {
                                c1918M9890.close();
                                ArrayList<C3913> arrayListM50808 = C22965.m50808(c3329Mo2399, c3662, (C16364) null, new C1859(this));
                                ArrayList arrayList = new ArrayList(arrayListM50808.size());
                                for (final C3913 c3913 : arrayListM50808) {
                                    arrayList.add(new InterfaceC22259() { // from class: l.ۗܰۚ
                                        @Override // l.InterfaceC22259
                                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                        public final C3662 mo9751(C9681 c9681) {
                                            RunnableC13793 runnableC13793 = this.f12136;
                                            return C5325.m14748((CharSequence) c9681, c3662, c3913, runnableC13793.f45538, runnableC13793.f45533, (BooleanSupplier) new C1859(runnableC13793));
                                        }
                                    });
                                }
                                int i4 = 0;
                                while (i4 < arrayListM50808.size() && ((C3913) arrayListM50808.get(i4)).m11365() < this.f45532) {
                                    i4++;
                                }
                                final boolean z2 = true;
                                int iMin = Math.min(arrayList.size(), Math.max(C13087.f43583, i4 + 1));
                                final C3662 c3662M32305 = C13087.m32305(new Supplier() { // from class: l.ܳܰۚ
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c3329Mo2399.m9891();
                                    }
                                }, arrayList.subList(0, iMin), new C1859(this));
                                float fM17870 = this.f45533.f9909.m17870();
                                while (c3662M32305 != null && iMin < arrayList.size() && !m33549() && (((long) (c3662M32305.size() - C5325.m14772(c3662M32305, this.f45532))) - 1) * fM17870 <= this.f45530 + this.f45528) {
                                    int iMin2 = Math.min(arrayList.size(), C13087.f43583 + iMin);
                                    C3662 c3662M32306 = C13087.m32305(new Supplier() { // from class: l.ܳܰۚ
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return c3329Mo2399.m9891();
                                        }
                                    }, arrayList.subList(iMin, iMin2), new C1859(this));
                                    if (c3662M32306 == null) {
                                        c3329Mo2399.close();
                                        this.f45534.setReadOnly(false);
                                        runnableC1442 = new RunnableC1442(2, this);
                                    } else {
                                        c3662M32305.m10809(c3662M32306);
                                        iMin = iMin2;
                                    }
                                }
                                if (c3662M32305 == null || m33549()) {
                                    c3329Mo2399.close();
                                    this.f45534.setReadOnly(false);
                                    runnableC1442 = new RunnableC1442(2, this);
                                } else {
                                    if (iMin == arrayList.size()) {
                                        this.f45536.m14753(arrayList.size(), C13087.f43583, c3662M32305);
                                        final int iM14772 = C5325.m14772(c3662M32305, this.f45532);
                                        C16737.m39273(new Runnable() { // from class: l.ۙۨۚ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC13793 runnableC13793 = this.f16347;
                                                boolean z3 = z2;
                                                C3662 c3663 = c3662M32305;
                                                int i5 = iM14772;
                                                if (runnableC13793.m33549()) {
                                                    return;
                                                }
                                                if (!runnableC13793.f45539.equals(runnableC13793.f45536.f41314.m16815()) || runnableC13793.f45538 != (runnableC13793.f45536.f18380 - runnableC13793.f45536.mo30761()) - runnableC13793.f45536.mo30751()) {
                                                    runnableC13793.f45536.m14768();
                                                    return;
                                                }
                                                if (z3 || runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                    synchronized (runnableC13793.f45536) {
                                                        runnableC13793.f45536.f41325 = false;
                                                        C5325 c5325 = runnableC13793.f45536;
                                                        c5325.f41308 = c3663;
                                                        c5325.f18385 = z3 ? null : c3663;
                                                        if (z3) {
                                                            runnableC13793.f45536.f18381 = c3663;
                                                            runnableC13793.f45536.f18376 = runnableC13793.f45538;
                                                            runnableC13793.f45536.f41324 = runnableC13793.f45539;
                                                        }
                                                    }
                                                    if (runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                        C5325 c5326 = runnableC13793.f45536;
                                                        if (c5326.f41314.m16897(c5326)) {
                                                            C6111 c6111 = runnableC13793.f45536.f41314;
                                                            c6111.m17050(c6111.m16837(c6111.m17066()));
                                                        } else {
                                                            C6111 c6112 = runnableC13793.f45536.f41314;
                                                            c6112.m17050(c6112.m16837(((int) (runnableC13793.f45533.f9909.m17870() * i5)) + runnableC13793.f45528));
                                                        }
                                                    } else {
                                                        C6111 c6113 = runnableC13793.f45536.f41314;
                                                        c6113.m17050(c6113.m16837(c6113.m17066()));
                                                    }
                                                    runnableC13793.f45536.f41314.invalidate();
                                                }
                                            }
                                        });
                                    } else {
                                        C5325 c5325 = this.f45536;
                                        int size = arrayList.size();
                                        int i5 = C13087.f43583;
                                        c5325.m14753(size, i5, c3662M32305);
                                        final int iM14773 = C5325.m14772(c3662M32305, this.f45532);
                                        C16737.m39273(new Runnable() { // from class: l.ۙۨۚ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC13793 runnableC13793 = this.f16347;
                                                boolean z3 = z;
                                                C3662 c3663 = c3662M32305;
                                                int i6 = iM14773;
                                                if (runnableC13793.m33549()) {
                                                    return;
                                                }
                                                if (!runnableC13793.f45539.equals(runnableC13793.f45536.f41314.m16815()) || runnableC13793.f45538 != (runnableC13793.f45536.f18380 - runnableC13793.f45536.mo30761()) - runnableC13793.f45536.mo30751()) {
                                                    runnableC13793.f45536.m14768();
                                                    return;
                                                }
                                                if (z3 || runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                    synchronized (runnableC13793.f45536) {
                                                        runnableC13793.f45536.f41325 = false;
                                                        C5325 c5326 = runnableC13793.f45536;
                                                        c5326.f41308 = c3663;
                                                        c5326.f18385 = z3 ? null : c3663;
                                                        if (z3) {
                                                            runnableC13793.f45536.f18381 = c3663;
                                                            runnableC13793.f45536.f18376 = runnableC13793.f45538;
                                                            runnableC13793.f45536.f41324 = runnableC13793.f45539;
                                                        }
                                                    }
                                                    if (runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                        C5325 c5327 = runnableC13793.f45536;
                                                        if (c5327.f41314.m16897(c5327)) {
                                                            C6111 c6113 = runnableC13793.f45536.f41314;
                                                            c6113.m17050(c6113.m16837(c6113.m17066()));
                                                        } else {
                                                            C6111 c6112 = runnableC13793.f45536.f41314;
                                                            c6112.m17050(c6112.m16837(((int) (runnableC13793.f45533.f9909.m17870() * i6)) + runnableC13793.f45528));
                                                        }
                                                    } else {
                                                        C6111 c6114 = runnableC13793.f45536.f41314;
                                                        c6114.m17050(c6114.m16837(c6114.m17066()));
                                                    }
                                                    runnableC13793.f45536.f41314.invalidate();
                                                }
                                            }
                                        });
                                        C3662 c3662M32307 = C13087.m32305(new Supplier() { // from class: l.ܳܰۚ
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return c3329Mo2399.m9891();
                                            }
                                        }, arrayList.subList(iMin, arrayList.size()), new C1859(this));
                                        if (c3662M32307 == null || m33549()) {
                                            c3329Mo2399.close();
                                            this.f45534.setReadOnly(false);
                                            runnableC1442 = new RunnableC1442(2, this);
                                        } else {
                                            final C3662 c3663 = new C3662(c3662M32305);
                                            c3663.m10809(c3662M32307);
                                            this.f45536.m14753(arrayList.size(), i5, c3663);
                                            final int iM14774 = C5325.m14772(c3663, this.f45532);
                                            C16737.m39273(new Runnable() { // from class: l.ۙۨۚ
                                                /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    RunnableC13793 runnableC13793 = this.f16347;
                                                    boolean z3 = z2;
                                                    C3662 c3664 = c3663;
                                                    int i6 = iM14774;
                                                    if (runnableC13793.m33549()) {
                                                        return;
                                                    }
                                                    if (!runnableC13793.f45539.equals(runnableC13793.f45536.f41314.m16815()) || runnableC13793.f45538 != (runnableC13793.f45536.f18380 - runnableC13793.f45536.mo30761()) - runnableC13793.f45536.mo30751()) {
                                                        runnableC13793.f45536.m14768();
                                                        return;
                                                    }
                                                    if (z3 || runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                        synchronized (runnableC13793.f45536) {
                                                            runnableC13793.f45536.f41325 = false;
                                                            C5325 c5326 = runnableC13793.f45536;
                                                            c5326.f41308 = c3664;
                                                            c5326.f18385 = z3 ? null : c3664;
                                                            if (z3) {
                                                                runnableC13793.f45536.f18381 = c3664;
                                                                runnableC13793.f45536.f18376 = runnableC13793.f45538;
                                                                runnableC13793.f45536.f41324 = runnableC13793.f45539;
                                                            }
                                                        }
                                                        if (runnableC13793.f45531 == runnableC13793.f45536.f41314.m16979()) {
                                                            C5325 c5327 = runnableC13793.f45536;
                                                            if (c5327.f41314.m16897(c5327)) {
                                                                C6111 c6114 = runnableC13793.f45536.f41314;
                                                                c6114.m17050(c6114.m16837(c6114.m17066()));
                                                            } else {
                                                                C6111 c6112 = runnableC13793.f45536.f41314;
                                                                c6112.m17050(c6112.m16837(((int) (runnableC13793.f45533.f9909.m17870() * i6)) + runnableC13793.f45528));
                                                            }
                                                        } else {
                                                            C6111 c6115 = runnableC13793.f45536.f41314;
                                                            c6115.m17050(c6115.m16837(c6115.m17066()));
                                                        }
                                                        runnableC13793.f45536.f41314.invalidate();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    c3329Mo2399.close();
                                    this.f45534.setReadOnly(false);
                                    runnableC1442 = new RunnableC1442(2, this);
                                }
                            } else {
                                i2 = i3;
                            }
                        }
                        c1918M9890.close();
                        c3329Mo2399.close();
                        this.f45534.setReadOnly(false);
                        runnableC1442 = new RunnableC1442(2, this);
                    } catch (Throwable th3) {
                        try {
                            c1918M9890.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        C16737.m39273(runnableC1442);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33548(RunnableC13793 runnableC13793, Throwable th) {
        C5325 c5325;
        try {
            if (runnableC13793.f45536.f18379 == runnableC13793) {
                if (!runnableC13793.f45535 || runnableC13793.f45536.f41288) {
                    if (th != null && !runnableC13793.m33549()) {
                        runnableC13793.f45536.f18386 = th;
                    }
                    runnableC13793.f45536.f18379 = null;
                    c5325 = runnableC13793.f45536;
                    if (c5325.f41308 != c5325.f18381) {
                        C5325 c5326 = runnableC13793.f45536;
                        c5326.f41308 = c5326.f18381;
                    }
                    runnableC13793.f45536.f18385 = null;
                    if (!runnableC13793.f45536.f41317) {
                        runnableC13793.f45536.f41325 = false;
                    }
                    runnableC13793.f45536.f41314.invalidate();
                    C5325 c5327 = runnableC13793.f45536;
                    c5327.f41314.m16826(c5327);
                } else {
                    C5325 c5328 = runnableC13793.f45536;
                    if (c5328.f41314.f20764 == c5328) {
                        InterfaceC2916 interfaceC2916 = c5328.f41297;
                        InterfaceC2916 interfaceC2917 = runnableC13793.f45534;
                        if (interfaceC2916 != interfaceC2917 || interfaceC2917.mo2395() != runnableC13793.f45529 || runnableC13793.f45540 != runnableC13793.f45536.f18382.get()) {
                            if (th != null) {
                                runnableC13793.f45536.f18386 = th;
                            }
                            runnableC13793.f45536.f18379 = null;
                            c5325 = runnableC13793.f45536;
                            if (c5325.f41308 != c5325.f18381) {
                                C5325 c5329 = runnableC13793.f45536;
                                c5329.f41308 = c5329.f18381;
                            }
                            runnableC13793.f45536.f18385 = null;
                            if (!runnableC13793.f45536.f41317) {
                                runnableC13793.f45536.f41325 = false;
                            }
                            runnableC13793.f45536.f41314.invalidate();
                            C5325 c53210 = runnableC13793.f45536;
                            c53210.f41314.m16826(c53210);
                        }
                    } else {
                        if (th != null) {
                            runnableC13793.f45536.f18386 = th;
                        }
                        runnableC13793.f45536.f18379 = null;
                        c5325 = runnableC13793.f45536;
                        if (c5325.f41308 != c5325.f18381) {
                            C5325 c53211 = runnableC13793.f45536;
                            c53211.f41308 = c53211.f18381;
                        }
                        runnableC13793.f45536.f18385 = null;
                        if (!runnableC13793.f45536.f41317) {
                            runnableC13793.f45536.f41325 = false;
                        }
                        runnableC13793.f45536.f41314.invalidate();
                        C5325 c53212 = runnableC13793.f45536;
                        c53212.f41314.m16826(c53212);
                    }
                }
            }
        } finally {
            runnableC13793.f45527.run();
        }
    }
}
