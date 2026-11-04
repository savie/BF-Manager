package l;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ᩴ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20135 implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile boolean f64702;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f64703;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5965 f64704;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f64705;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C15508 f64706;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f64707;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f64709;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f64710;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f64711;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16207 f64712;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f64701 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f64708 = false;

    public RunnableC20135(C5965 c5965, int i, int i2) {
        this.f64704 = c5965;
        this.f64703 = i;
        this.f64709 = i2;
        this.f64705 = c5965.f20429.f9813;
    }

    public RunnableC20135(C5965 c5965, int i, int i2, int i3) {
        this.f64704 = c5965;
        this.f64703 = i;
        this.f64709 = i2;
        this.f64705 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46361() {
        return this.f64702 || this.f64704.f20421 || this.f64704.f20419.mo924();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46363() {
        synchronized (this.f64704.f20431) {
            this.f64702 = true;
            this.f64701 = Collections.EMPTY_LIST;
        }
        synchronized (this) {
            if (!this.f64707) {
                m46360();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m46360() {
        this.f64712 = null;
        if (this.f64706 != null) {
            this.f64704.f20423.add(this.f64706);
            this.f64706 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46362() {
        try {
            this.f64704.f20425.execute(this);
        } catch (Error | RuntimeException e) {
            m46363();
            this.f64710 = true;
            this.f64704.m17366();
            if (!(e instanceof RejectedExecutionException)) {
                throw e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x018e A[Catch: all -> 0x0195, TryCatch #1 {, blocks: (B:84:0x0181, B:86:0x0185, B:91:0x0193, B:90:0x018e), top: B:131:0x0181 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.᩸᩹ᩴ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.᩸᩹ᩴ] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this) {
            this.f64707 = true;
        }
        boolean z2 = false;
        try {
            if (!m46361() && this.f64704.f20429.m9836()) {
                ((C10792) this.f64704.f20432).getClass();
                long jNanoTime = System.nanoTime();
                if (this.f64712 == null) {
                    C15508 c15508Mo15350 = this.f64704.f20429.f9815.mo15350();
                    this.f64706 = c15508Mo15350;
                    if (c15508Mo15350.m37177() == this.f64704.f20429.f9814 && this.f64706.length() == this.f64704.f20429.f9813 && !m46361() && this.f64704.f20429.m9836()) {
                        int i = this.f64705;
                        if (this.f64708 && i < this.f64704.f20429.f9813 && i > this.f64703 && Character.isHighSurrogate(this.f64706.charAt(i - 1))) {
                            i--;
                        }
                        this.f64712 = C16207.m38444(this.f64704.f20429.f9812, this.f64708 ? new C18334(0, i, this.f64706) : this.f64706, (C23119) new InterfaceC7509() { // from class: l.᩸᩹ᩴ
                            @Override // l.InterfaceC7509
                            /* JADX INFO: renamed from: ۫ */
                            public final boolean mo924() {
                                return this.f74976.m46361();
                            }
                        }, this.f64703, Math.min(this.f64709, i));
                    }
                    synchronized (this) {
                        this.f64707 = false;
                        m46360();
                        this.f64710 = true;
                    }
                }
                EnumC17699 enumC17699M38504 = this.f64712.m38504(4096, 8000000L, (C24655) null);
                long j = this.f64711;
                ((C10792) this.f64704.f20432).getClass();
                this.f64711 = (System.nanoTime() - jNanoTime) + j;
                if (enumC17699M38504 != EnumC17699.COMPLETED) {
                    if (this.f64712.m38502() < 1048576 && this.f64711 < 128000000 && !m46361()) {
                        z = true;
                    }
                    synchronized (this) {
                        this.f64707 = false;
                        if (z || m46361()) {
                            m46360();
                            this.f64710 = true;
                        } else {
                            z2 = z;
                        }
                    }
                    this.f64704.m17366();
                    if (z2) {
                        m46362();
                        return;
                    }
                    return;
                }
                List listM38519 = this.f64712.m38519();
                synchronized (this.f64704.f20431) {
                    if (!m46361() && this.f64704.f20429.m9836()) {
                        this.f64701 = listM38519;
                        if (!this.f64708 && !listM38519.isEmpty()) {
                            C5965 c5965 = this.f64704;
                            c5965.f20434 = Math.min(c5965.f20434, ((C15659) listM38519.get(0)).f50890);
                        }
                    }
                }
                if (this.f64708 && this.f64704.f20418 != null && !m46361() && this.f64704.f20429.m9836()) {
                    C5965 c5966 = this.f64704;
                    c5966.m17353(listM38519, c5966.f20430, (InterfaceC7509) new InterfaceC7509() { // from class: l.᩸᩹ᩴ
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return this.f74976.m46361();
                        }
                    });
                }
                z = false;
                synchronized (this) {
                    this.f64707 = false;
                    if (z) {
                        m46360();
                        this.f64710 = true;
                    } else {
                        m46360();
                        this.f64710 = true;
                    }
                    this.f64704.m17366();
                    if (z2) {
                        m46362();
                        return;
                    }
                    return;
                }
            }
            synchronized (this) {
                this.f64707 = false;
                m46360();
                this.f64710 = true;
            }
            this.f64704.m17366();
        } catch (RuntimeException unused) {
            synchronized (this) {
                this.f64707 = false;
                m46360();
                this.f64710 = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f64707 = false;
                m46360();
                this.f64710 = true;
                this.f64704.m17366();
                throw th;
            }
        }
    }
}
