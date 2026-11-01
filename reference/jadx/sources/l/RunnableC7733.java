package l;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۟᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7733 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f25560;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3329 f25561;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20433 f25563;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25564;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f25565;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f25566;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f25567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f25569;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12237 f25570;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25571;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f25568 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f25562 = false;

    public RunnableC7733(C20433 c20433, int i, int i2) {
        this.f25563 = c20433;
        this.f25566 = i;
        this.f25567 = i2;
        this.f25565 = c20433.f66246.f13631;
    }

    public RunnableC7733(C20433 c20433, int i, int i2, int i3) {
        this.f25563 = c20433;
        this.f25566 = i;
        this.f25567 = i2;
        this.f25565 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20381() {
        return this.f25564 || this.f25563.f66250 || this.f25563.f66245.mo2357();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20383() {
        synchronized (this.f25563.f66252) {
            this.f25564 = true;
            this.f25568 = Collections.EMPTY_LIST;
        }
        synchronized (this) {
            if (!this.f25571) {
                m20380();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m20380() {
        this.f25570 = null;
        if (this.f25561 != null) {
            this.f25563.f66249.add(this.f25561);
            this.f25561 = null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20382() {
        try {
            this.f25563.f66258.execute(this);
        } catch (Error | RuntimeException e) {
            m20383();
            this.f25560 = true;
            this.f25563.m46222();
            if (!(e instanceof RejectedExecutionException)) {
                throw e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x018e A[Catch: all -> 0x0195, TryCatch #1 {, blocks: (B:84:0x0181, B:86:0x0185, B:91:0x0193, B:90:0x018e), top: B:131:0x0181 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.ۤ᩸ۚ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.ۤ᩸ۚ] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this) {
            this.f25571 = true;
        }
        boolean z2 = false;
        try {
            if (!m20381() && this.f25563.f66246.m11011()) {
                ((C14517) this.f25563.f66243).getClass();
                long jNanoTime = System.nanoTime();
                if (this.f25570 == null) {
                    C3329 c3329Mo2399 = this.f25563.f66246.f13629.mo2399();
                    this.f25561 = c3329Mo2399;
                    if (c3329Mo2399.m9896() == this.f25563.f66246.f13633 && this.f25561.length() == this.f25563.f66246.f13631 && !m20381() && this.f25563.f66246.m11011()) {
                        int i = this.f25565;
                        if (this.f25562 && i < this.f25563.f66246.f13631 && i > this.f25566 && Character.isHighSurrogate(this.f25561.charAt(i - 1))) {
                            i--;
                        }
                        this.f25570 = C12237.m30363(this.f25563.f66246.f13632, this.f25562 ? new C17499(0, i, this.f25561) : this.f25561, (C10556) new InterfaceC5614() { // from class: l.ۤ᩸ۚ
                            @Override // l.InterfaceC5614
                            /* JADX INFO: renamed from: ֨ */
                            public final boolean mo2357() {
                                return this.f36140.m20381();
                            }
                        }, this.f25566, Math.min(this.f25567, i));
                    }
                    synchronized (this) {
                        this.f25571 = false;
                        m20380();
                        this.f25560 = true;
                    }
                }
                EnumC16470 enumC16470M30424 = this.f25570.m30424(4096, 8000000L, (C1569) null);
                long j = this.f25569;
                ((C14517) this.f25563.f66243).getClass();
                this.f25569 = (System.nanoTime() - jNanoTime) + j;
                if (enumC16470M30424 != EnumC16470.COMPLETED) {
                    if (this.f25570.m30422() < 1048576 && this.f25569 < 128000000 && !m20381()) {
                        z = true;
                    }
                    synchronized (this) {
                        this.f25571 = false;
                        if (z || m20381()) {
                            m20380();
                            this.f25560 = true;
                        } else {
                            z2 = z;
                        }
                    }
                    this.f25563.m46222();
                    if (z2) {
                        m20382();
                        return;
                    }
                    return;
                }
                List listM30435 = this.f25570.m30435();
                synchronized (this.f25563.f66252) {
                    if (!m20381() && this.f25563.f66246.m11011()) {
                        this.f25568 = listM30435;
                        if (!this.f25562 && !listM30435.isEmpty()) {
                            C20433 c20433 = this.f25563;
                            c20433.f66259 = Math.min(c20433.f66259, ((C21138) listM30435.get(0)).f68853);
                        }
                    }
                }
                if (this.f25562 && this.f25563.f66248 != null && !m20381() && this.f25563.f66246.m11011()) {
                    C20433 c20434 = this.f25563;
                    c20434.m46211(listM30435, c20434.f66256, (InterfaceC5614) new InterfaceC5614() { // from class: l.ۤ᩸ۚ
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return this.f36140.m20381();
                        }
                    });
                }
                z = false;
                synchronized (this) {
                    this.f25571 = false;
                    if (z) {
                        m20380();
                        this.f25560 = true;
                    } else {
                        m20380();
                        this.f25560 = true;
                    }
                    this.f25563.m46222();
                    if (z2) {
                        m20382();
                        return;
                    }
                    return;
                }
            }
            synchronized (this) {
                this.f25571 = false;
                m20380();
                this.f25560 = true;
            }
            this.f25563.m46222();
        } catch (RuntimeException unused) {
            synchronized (this) {
                this.f25571 = false;
                m20380();
                this.f25560 = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f25571 = false;
                m20380();
                this.f25560 = true;
                this.f25563.m46222();
                throw th;
            }
        }
    }
}
