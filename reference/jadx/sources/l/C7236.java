package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۜܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes3.dex */
public final class C7236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f23860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile boolean f23861;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16207 f23862;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20661 f23863;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1270 f23864;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13947 f23865;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C2761 f23866;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f23867;

    /* JADX WARN: Type inference failed for: r4v3, types: [l.۠ܶᩴ] */
    public C7236(C13947 c13947, C20661 c20661, C15508 c15508, long j, long j2, InterfaceC7509 interfaceC7509, C2761 c2761, C22528 c22528) {
        C16207 c16207;
        this.f23865 = c13947;
        this.f23863 = c20661;
        this.f23867 = j2;
        this.f23860 = interfaceC7509;
        if (c2761 == null) {
            this.f23862 = c20661.m47279(c15508, new InterfaceC7509() { // from class: l.۠ܶᩴ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f28404.m19847();
                }
            });
            return;
        }
        if (c22528.m50767() != c15508.length()) {
            throw new IllegalArgumentException("New text and change set lengths differ");
        }
        boolean z = c2761.f9138 != null && c2761.f9138.m22184(c22528.m50762(), c20661.f66265);
        if (c20661.m47286() && !z) {
            c16207 = c20661.m47279(c15508, new InterfaceC7509() { // from class: l.۠ܶᩴ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f28404.m19847();
                }
            });
        } else {
            c16207 = new C16207(c20661, c15508, new InterfaceC7509() { // from class: l.۠ܶᩴ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f28404.m19847();
                }
            }, c2761.f9136, c2761.f9135, c2761.f9134, c2761.f9138, c22528);
        }
        this.f23862 = c16207;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19851() {
        this.f23862.m38513();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19850(C3025 c3025, Executor executor, C5789 c5789) {
        this.f23862.m38506(c3025, executor, c5789);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17699 m19849(int i, long j, C24655 c24655) {
        C16207 c16207 = this.f23862;
        try {
            EnumC17699 enumC17699M38504 = c16207.m38504(i, j, c24655);
            if (enumC17699M38504 == EnumC17699.COMPLETED) {
                m19841();
            }
            return enumC17699M38504;
        } catch (Error | RuntimeException e) {
            if (c16207.m38508() == EnumC17699.ABORTED) {
                this.f23864 = null;
                this.f23865.m33984(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m19841() {
        try {
            try {
                if (m19847()) {
                    this.f23865.m33984(this);
                    this.f23864 = null;
                    return;
                }
                C1270 c1270M38511 = this.f23862.m38511();
                C8246 c8246M38516 = this.f23862.m38516();
                C24766 c24766M38512 = this.f23862.m38512();
                C20925 c20925M38509 = this.f23862.m38509();
                this.f23864.m4634(c1270M38511);
                if (m19847()) {
                    this.f23865.m33984(this);
                } else {
                    this.f23866 = new C2761(this.f23863, this.f23867, c1270M38511, c8246M38516, c24766M38512, c20925M38509);
                }
                this.f23864 = null;
            } catch (Throwable th) {
                this.f23864 = null;
                throw th;
            }
        } catch (Error | RuntimeException e) {
            this.f23865.m33984(this);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2761 m19848() {
        return this.f23866;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m19847() {
        if (this.f23861) {
            return true;
        }
        if (this.f23860.mo924()) {
            this.f23861 = true;
        }
        return this.f23861;
    }
}
