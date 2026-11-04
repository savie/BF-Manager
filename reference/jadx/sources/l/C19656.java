package l;

import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ᩴۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19656 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC13753 f63305;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f63306;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f63307;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC13753 f63308;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3683 f63309;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f63310;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f63311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15508 f63312;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63313;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f63314;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f63315;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15180 f63316;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f63317;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C20402 f63318;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63319;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63320;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f63321;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f63322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f63324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22528 f63325;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f63326 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f63327;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f63328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45309(C19656 c19656, C20402 c20402) {
        c19656.getClass();
        if (!c20402.f65394 && c19656.f63318 == c20402 && c19656.m45316(c20402.f65395)) {
            C24132 c24132 = c19656.f63310;
            if (c24132.f78022 != c19656.f63305) {
                return;
            }
            c24132.m53698(c20402.f65395, false);
            c19656.f63305 = c20402.f65395;
            c19656.f63310.m53694(c20402.f65396.m19366(), c20402.f65396.m19364(), false);
            c19656.f63319 = c20402.f65396.m19363();
            c20402.f65394 = true;
            c19656.f63310.f78033.m4837(c19656.f63328);
            c19656.f63310.invalidate();
        }
    }

    public C19656(C24132 c24132, InterfaceC19106 interfaceC19106, AbstractC13753 abstractC13753) {
        this.f63310 = c24132;
        this.f63328 = interfaceC19106;
        this.f63308 = abstractC13753;
        this.f63305 = abstractC13753;
        this.f63325 = C22528.m50752(abstractC13753.m33638(), new C10593[0]);
        this.f63321 = abstractC13753.m33631();
        this.f63317 = c24132.m54038();
        this.f63316 = abstractC13753.f43656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45313(int i, int i2, int i3, int i4) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int iMo15344 = this.f63328.mo15344();
        C22528 c22528 = this.f63325;
        if (c22528 != null && this.f63321 == i4 && iMo15344 == i4 + 1 && c22528.m50767() == (((long) this.f63328.length()) - ((long) i3)) + ((long) i2)) {
            this.f63325 = this.f63325.m50757(new C10593(i, i2 + i, i3));
        } else {
            this.f63325 = null;
        }
        this.f63321 = iMo15344;
        this.f63318 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45319() {
        return !this.f63311 && this.f63310.f77990 == this && this.f63310.f78058 == this.f63328 && !this.f63310.f78124;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45311() {
        this.f63311 = true;
        synchronized (this.f63326) {
            this.f63326.notifyAll();
        }
        Runnable runnable = new Runnable() { // from class: l.ۙۜ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C19656 c19656 = this.f16670;
                if (c19656.f63310.f77990 != c19656 || c19656.f63306) {
                    return;
                }
                c19656.m45315((AbstractC13753) null, (Throwable) null);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            C21576.m49068(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0126 A[Catch: RuntimeException -> 0x01a9, TryCatch #0 {RuntimeException -> 0x01a9, blocks: (B:34:0x007d, B:36:0x00a9, B:39:0x00b5, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00d8, B:51:0x00de, B:53:0x00e6, B:55:0x00f0, B:57:0x0102, B:59:0x0108, B:61:0x0110, B:69:0x0126, B:63:0x0114, B:65:0x011a, B:67:0x0122, B:70:0x015b, B:72:0x0179, B:74:0x0186, B:75:0x0190, B:76:0x019d, B:38:0x00b3), top: B:83:0x007d }] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45318() {
        if (this.f63306 || this.f63310.f77990 != this) {
            return;
        }
        if (!m45319()) {
            m45315((AbstractC13753) null, (Throwable) null);
            return;
        }
        C24132 c24132 = this.f63310;
        if (c24132.f78013) {
            return;
        }
        if (c24132.f78022.mo25237() || this.f63310.f78103 || this.f63310.f78076 || this.f63310.f78024 || this.f63310.f78134 || this.f63310.f78067 != null || (this.f63310.f78043 != 0 && this.f63310.m54108() <= 0)) {
            C21576.m49069(new RunnableC12066(0, this), 10L);
            return;
        }
        C24132 c24133 = this.f63310;
        this.f63305 = c24133.f78022;
        if (!this.f63313) {
            c24133.m54050();
            this.f63328.setReadOnly(true);
            this.f63313 = true;
            this.f63310.m53754();
        }
        try {
            C15508 c15508Mo15350 = this.f63328.mo15350();
            this.f63312 = c15508Mo15350;
            this.f63323 = c15508Mo15350.m37177();
            this.f63322 = this.f63310.m53882();
            this.f63320 = this.f63310.f78043;
            C15180 c15180M54039 = this.f63310.m54039();
            if (!this.f63316.equals(c15180M54039) || !this.f63308.f43656.equals(c15180M54039)) {
                this.f63325 = null;
            }
            this.f63316 = c15180M54039;
            this.f63309 = null;
            C22528 c22528 = this.f63325;
            if (c22528 != null && !c22528.m50760() && this.f63321 == this.f63323) {
                AbstractC13753 abstractC13753 = this.f63308;
                if (abstractC13753.f43646 == this.f63328 && !abstractC13753.mo25237() && !this.f63308.f43653 && this.f63308.mo25238() == null && !this.f63308.f43643.isEmpty() && this.f63308.f43643.m19187().f45294 == this.f63325.m50762()) {
                    AbstractC13753 abstractC13754 = this.f63308;
                    if (!(abstractC13754 instanceof C22572) || !((C22572) abstractC13754).m50892() || this.f63320 != 0) {
                        AbstractC13753 abstractC13755 = this.f63308;
                        if ((abstractC13755 instanceof C9670) && ((C9670) abstractC13755).m25229() && this.f63320 != 0) {
                            int iM50763 = this.f63325.m50763(0);
                            int iM50761 = this.f63325.m50761() - 1;
                            this.f63309 = new C3683(this.f63308, iM50763, this.f63325.m50768(iM50761) - iM50763, this.f63325.m50765(iM50761) - this.f63325.m50759(0), this.f63323, this.f63310.m54108());
                        }
                    } else {
                        int iM50764 = this.f63325.m50763(0);
                        int iM50762 = this.f63325.m50761() - 1;
                        this.f63309 = new C3683(this.f63308, iM50764, this.f63325.m50768(iM50762) - iM50764, this.f63325.m50765(iM50762) - this.f63325.m50759(0), this.f63323, this.f63310.m54108());
                    }
                }
            }
            this.f63325 = C22528.m50752(this.f63312.length(), new C10593[0]);
            this.f63321 = this.f63323;
            this.f63306 = true;
            if (this.f63310.f78033.m4840()) {
                this.f63310.f78033.m4818(this.f63328);
                C3683 c3683 = this.f63309;
                if (c3683 == null) {
                    this.f63310.f78033.m4820(this.f63328);
                } else {
                    this.f63310.f78033.m4832(this.f63328, c3683.f12661, c3683.f12667);
                }
            }
            C5261.f18540.execute(new RunnableC1117(1, this));
        } catch (RuntimeException e) {
            m45315((AbstractC13753) null, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45316(AbstractC13753 abstractC13753) {
        C20402 c20402 = this.f63318;
        return m45319() && this.f63328.mo15344() == this.f63323 && c20402 != null && c20402.f65395 == abstractC13753 && c20402.f65393 == abstractC13753.mo25216() && c20402.f65396.m19365() == this.f63310.m54108() && abstractC13753.mo25244(c20402.f65396);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45306(Runnable runnable) {
        synchronized (this.f63326) {
            this.f63326.addLast(runnable);
            this.f63326.notifyAll();
        }
        final int i = 1;
        C21576.m49068(new Runnable() { // from class: l.᩵ۖ᩸
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ((C24132) this).m53966();
                        break;
                    default:
                        ((C19656) this).m45310();
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m45310() {
        Runnable runnable;
        while (true) {
            synchronized (this.f63326) {
                runnable = (Runnable) this.f63326.pollFirst();
            }
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45320() {
        m45310();
        if (m45319()) {
            C24132 c24132 = this.f63310;
            if (c24132.f78013 || c24132.m53972() || this.f63314) {
                return;
            }
            long jNanoTime = System.nanoTime() + 500000000;
            if (!this.f63306) {
                m45318();
            }
            if (m45319() && this.f63306) {
                this.f63314 = true;
                while (m45319()) {
                    m45310();
                    if (!m45319() || !this.f63306 || this.f63310.m53972()) {
                        return;
                    }
                    synchronized (this.f63326) {
                        if (this.f63311) {
                            return;
                        }
                        if (this.f63326.isEmpty()) {
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 <= 0) {
                                return;
                            }
                            try {
                                this.f63326.wait(jNanoTime2 / 1000000, (int) (jNanoTime2 % 1000000));
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۤۜ᩸] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.᩷ۜ᩸] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45317() {
        AbstractC13753 c9670;
        try {
            if (m45319()) {
                C3683 c3683 = this.f63309;
                boolean z = true;
                if (c3683 != null && c3683.m11978(this.f63308, this.f63323, this.f63310.m54108())) {
                    if (this.f63320 == 0) {
                        C24132 c24132 = this.f63310;
                        c9670 = new C22572(c24132, this.f63328, c24132.f78066, this.f63322, c3683, new BooleanSupplier() { // from class: l.᩷ۜ᩸
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f70731.m45319();
                            }
                        }, this.f63312);
                    } else {
                        C24132 c24133 = this.f63310;
                        c9670 = new C9670(c24133, this.f63328, c24133.f78066, this.f63320 == 1, this.f63322, c3683, new BooleanSupplier() { // from class: l.ۤۜ᩸
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f33996.m45319();
                            }
                        }, this.f63312);
                    }
                } else if (this.f63320 == 0) {
                    C24132 c24134 = this.f63310;
                    c9670 = new C22572(c24134, this.f63328, c24134.f78066, this.f63322, this.f63312);
                } else {
                    C24132 c24135 = this.f63310;
                    c9670 = new C9670(c24135, this.f63328, c24135.f78066, this.f63320 == 1, this.f63322, this.f63312);
                }
                try {
                    C7042 c7042Mo33634 = c9670.mo33634();
                    if (m45319() && this.f63328.mo15344() == this.f63323 && c7042Mo33634 != null && c9670.mo25244(c7042Mo33634) && c9670.mo25243(Math.max(this.f63310.m53968(), this.f63310.m53882()))) {
                        final C20402 c20402 = new C20402(c9670, c9670.mo25216(), c7042Mo33634);
                        this.f63318 = c20402;
                        m45307(c9670, c7042Mo33634.m19364());
                        m45306(new Runnable() { // from class: l.᩸ۜ᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                C19656.m45309(this.f73543, c20402);
                            }
                        });
                    } else {
                        z = false;
                    }
                    while (c9670.mo25237()) {
                        if (!m45319()) {
                            c9670.mo25241();
                            break;
                        }
                        SystemClock.sleep(10L);
                    }
                    Throwable thMo25238 = c9670.mo25238();
                    if (thMo25238 instanceof RuntimeException) {
                        RuntimeException runtimeException = (RuntimeException) thMo25238;
                        C22327.m50389(runtimeException);
                        throw runtimeException;
                    }
                    if (thMo25238 instanceof Error) {
                        Error error = (Error) thMo25238;
                        C22327.m50389(error);
                        throw error;
                    }
                    if (thMo25238 != null) {
                        throw new IllegalStateException("Large edit layout preparation failed", thMo25238);
                    }
                    if (!z && m45319() && this.f63328.mo15344() == this.f63323) {
                        m45307(c9670, Math.max(0, ((int) (c9670.m33646(Math.min(this.f63322, this.f63328.length())) * this.f63310.f78066.m16189())) - (this.f63310.m53993() / 2)));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c9670 != null) {
                        c9670.mo25241();
                    }
                }
            } else {
                c9670 = null;
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c9670 = null;
        }
        C15508 c15508 = this.f63312;
        if (c15508 != null) {
            c15508.close();
            this.f63312 = null;
        }
        m45306(new RunnableC7083(this, c9670, th, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45307(AbstractC13753 abstractC13753, int i) {
        if (m45319()) {
            C24132 c24132 = this.f63310;
            C14540 c14540 = c24132.f78066;
            C1314 c1314 = c24132.f78033;
            if (c14540.f45755 && c1314.m4816()) {
                long jMo25240 = abstractC13753.mo25240(i, Math.max(1, c24132.m53993()));
                c1314.m4804(this.f63328, (int) (jMo25240 >>> 32), (int) jMo25240);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45314(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C24132 c24132 = this.f63310;
        if (actionMasked == 0) {
            this.f63315 = c24132.m53972();
            this.f63327 = motionEvent.getX();
            this.f63307 = motionEvent.getY();
            return;
        }
        if (actionMasked != 2 || !this.f63315) {
            if (actionMasked != 2) {
                this.f63315 = false;
                return;
            }
            return;
        }
        int x = (int) (this.f63327 - motionEvent.getX());
        int y = (int) (this.f63307 - motionEvent.getY());
        if (m45319()) {
            m45312(x, y);
        } else if (c24132.f77990 == null) {
            InterfaceC19106 interfaceC19106 = c24132.f78058;
            InterfaceC19106 interfaceC19107 = this.f63328;
            if (interfaceC19106 == interfaceC19107 && !c24132.f78124 && interfaceC19107.mo15344() == this.f63323 && c24132.f78022 == this.f63305 && c24132.m53748()) {
                c24132.scrollTo(c24132.m53948(c24132.getScrollX() + x), c24132.m53873(c24132.m54026() + y));
                c24132.invalidate();
            }
        }
        this.f63327 = motionEvent.getX();
        this.f63307 = motionEvent.getY();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45312(int i, int i2) {
        C24132 c24132 = this.f63310;
        if (c24132.m53972()) {
            this.f63319 = Math.min(this.f63319, c24132.m53993());
            int iM53948 = c24132.m53948(c24132.getScrollX() + i);
            int iMo33618 = c24132.f78022.mo33618(c24132.m54026() + i2, this.f63319);
            if (c24132.f78022.mo25244(new C7042(iM53948, iMo33618, c24132.m54108(), this.f63319))) {
                if (iM53948 == c24132.getScrollX() && iMo33618 == c24132.m54026()) {
                    return;
                }
                this.f63324 = true;
                c24132.scrollTo(iM53948, iMo33618);
                c24132.invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:57:0x00e1, B:58:0x00e6, B:60:0x00ec, B:62:0x00f0, B:64:0x00f4, B:66:0x00f8, B:85:0x0148, B:86:0x0157, B:87:0x0159), top: B:145:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4 A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:57:0x00e1, B:58:0x00e6, B:60:0x00ec, B:62:0x00f0, B:64:0x00f4, B:66:0x00f8, B:85:0x0148, B:86:0x0157, B:87:0x0159), top: B:145:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8 A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #1 {all -> 0x0221, blocks: (B:57:0x00e1, B:58:0x00e6, B:60:0x00ec, B:62:0x00f0, B:64:0x00f4, B:66:0x00f8, B:85:0x0148, B:86:0x0157, B:87:0x0159), top: B:145:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #2 {all -> 0x0132, blocks: (B:71:0x0114, B:73:0x0118), top: B:146:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0121 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:86:0x0157 A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:57:0x00e1, B:58:0x00e6, B:60:0x00ec, B:62:0x00f0, B:64:0x00f4, B:66:0x00f8, B:85:0x0148, B:86:0x0157, B:87:0x0159), top: B:145:0x00c5 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45315(AbstractC13753 abstractC13753, Throwable e) {
        C15508 c15508 = this.f63312;
        if (c15508 != null) {
            c15508.close();
            this.f63312 = null;
        }
        if (this.f63310.f77990 != this) {
            if (this.f63313) {
                this.f63313 = false;
                try {
                    this.f63328.setReadOnly(false);
                    return;
                } finally {
                    this.f63310.m53960();
                }
            }
            return;
        }
        this.f63306 = false;
        if (m45319() && abstractC13753 != null && e == null && this.f63328.mo15344() != this.f63323) {
            this.f63308 = abstractC13753;
            if (this.f63320 != this.f63310.f78043 || !this.f63316.equals(this.f63310.m54039())) {
                this.f63325 = null;
            }
            this.f63309 = null;
            this.f63318 = null;
            C21576.m49068(new RunnableC12066(0, this));
            return;
        }
        if (m45319() && e == null && abstractC13753 != null && (this.f63320 != this.f63310.f78043 || !this.f63316.equals(this.f63310.m54039()) || (this.f63320 != 0 && abstractC13753.mo25232() != this.f63310.m54108() && this.f63310.m54108() > 0))) {
            this.f63318 = null;
            this.f63309 = null;
            this.f63310.invalidate();
            try {
                this.f63308 = abstractC13753;
                this.f63325 = null;
                C21576.m49068(new RunnableC12066(0, this));
                return;
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        try {
            if (m45319() && this.f63313 && this.f63328.mo15344() == this.f63323) {
                C24132 c24132 = this.f63310;
                if (c24132.f78022 == this.f63305 && abstractC13753 != null && e == null) {
                    c24132.m53698(abstractC13753, false);
                } else if (m45319()) {
                    if (!(e instanceof Error)) {
                        throw ((Error) e);
                    }
                    if (e instanceof RuntimeException) {
                        if (this.f63310.m53943(this.f63328, (RuntimeException) e)) {
                            if (abstractC13753 != null) {
                                abstractC13753.f43644 = -1;
                            }
                            this.f63309 = null;
                            this.f63310.f77990 = null;
                            this.f63310.f78036 = 0L;
                            if (this.f63313) {
                                this.f63328.setReadOnly(false);
                            }
                            return;
                        }
                    }
                    this.f63310.f78033.m4820(this.f63328);
                    this.f63310.m53883();
                }
            } else if (m45319() && this.f63313) {
                if (!(e instanceof Error)) {
                    throw ((Error) e);
                }
                if (e instanceof RuntimeException) {
                    if (this.f63310.m53943(this.f63328, (RuntimeException) e)) {
                        if (abstractC13753 != null) {
                            abstractC13753.f43644 = -1;
                        }
                        this.f63309 = null;
                        this.f63310.f77990 = null;
                        this.f63310.f78036 = 0L;
                        try {
                            if (this.f63313) {
                                this.f63328.setReadOnly(false);
                            }
                            return;
                        } finally {
                            if (this.f63313) {
                                this.f63310.m53960();
                            }
                            C21576.m49068(new RunnableC3117(this.f63310, 1));
                        }
                    }
                }
                this.f63310.f78033.m4820(this.f63328);
                this.f63310.m53883();
            }
            if (abstractC13753 != null) {
                abstractC13753.f43644 = -1;
            }
            this.f63309 = null;
            this.f63310.f77990 = null;
            this.f63310.f78036 = 0L;
            try {
                if (this.f63313) {
                    this.f63328.setReadOnly(false);
                }
                if (this.f63313) {
                    this.f63310.m53960();
                }
                C21576.m49068(new RunnableC3117(this.f63310, 1));
                if (this.f63311 || this.f63310.f78058 != this.f63328 || this.f63310.f78124) {
                    return;
                }
                this.f63310.f78018.m9609(this.f63328);
                this.f63310.f78033.m4837(this.f63328);
                C24132 c24133 = this.f63310;
                AbstractC17787 abstractC17787 = c24133.f78113;
                if (abstractC17787 != null) {
                    abstractC17787.mo41620(c24133);
                }
                if (!this.f63310.m53685() && this.f63310.f78064 == null && !this.f63324) {
                    this.f63310.m53931(true);
                }
                C24132 c24134 = this.f63310;
                c24134.mo52299(c24134.m53968(), this.f63310.m53882());
                this.f63310.m54030();
                this.f63310.m54041();
                int iM54038 = this.f63310.m54038();
                if (this.f63317 != iM54038) {
                    this.f63310.mo52315(iM54038);
                }
                this.f63310.requestLayout();
                this.f63310.invalidate();
                this.f63310.m53733();
            } catch (Throwable th) {
                if (this.f63313) {
                    this.f63310.m53960();
                }
                C21576.m49068(new RunnableC3117(this.f63310, 1));
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC13753 != null) {
                abstractC13753.f43644 = -1;
            }
            this.f63309 = null;
            this.f63310.f77990 = null;
            this.f63310.f78036 = 0L;
            try {
                if (this.f63313) {
                    this.f63328.setReadOnly(false);
                }
                throw th2;
            } finally {
                if (this.f63313) {
                    this.f63310.m53960();
                }
                C21576.m49068(new RunnableC3117(this.f63310, 1));
            }
        }
    }
}
