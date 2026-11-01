package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩳ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18316 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1900 f58420;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f58421;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f58422;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19022 f58423;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12237 f58424;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f58425;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C15495 f58426;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7027 f58427;

    /* JADX WARN: Type inference failed for: r4v3, types: [l.᩸᩸ۚ] */
    public C18316(C19022 c19022, C1900 c1900, C3329 c3329, long j, long j2, InterfaceC5614 interfaceC5614, C15495 c15495, C21033 c21033) {
        C12237 c12237;
        this.f58423 = c19022;
        this.f58420 = c1900;
        this.f58421 = j2;
        this.f58422 = interfaceC5614;
        if (c15495 == null) {
            this.f58424 = c1900.m6201(c3329, new InterfaceC5614() { // from class: l.᩸᩸ۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f70912.m42540();
                }
            });
            return;
        }
        if (c21033.m47416() != c3329.length()) {
            throw new IllegalArgumentException("New text and change set lengths differ");
        }
        boolean z = c15495.f50482 != null && c15495.f50482.m7169(c21033.m47422(), c1900.f7183);
        if (c1900.m6206() && !z) {
            c12237 = c1900.m6201(c3329, new InterfaceC5614() { // from class: l.᩸᩸ۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f70912.m42540();
                }
            });
        } else {
            c12237 = new C12237(c1900, c3329, new InterfaceC5614() { // from class: l.᩸᩸ۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f70912.m42540();
                }
            }, c15495.f50483, c15495.f50481, c15495.f50479, c15495.f50482, c21033);
        }
        this.f58424 = c12237;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42551() {
        this.f58424.m30434();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42550(C3768 c3768, Executor executor, C21180 c21180) {
        this.f58424.m30426(c3768, executor, c21180);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16470 m42549(int i, long j, C1569 c1569) {
        C12237 c12237 = this.f58424;
        try {
            EnumC16470 enumC16470M30424 = c12237.m30424(i, j, c1569);
            if (enumC16470M30424 == EnumC16470.COMPLETED) {
                m42545();
            }
            return enumC16470M30424;
        } catch (Error | RuntimeException e) {
            if (c12237.m30431() == EnumC16470.ABORTED) {
                this.f58427 = null;
                this.f58423.m43746(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m42545() {
        try {
            try {
                if (m42540()) {
                    this.f58423.m43746(this);
                    this.f58427 = null;
                    return;
                }
                C7027 c7027M30420 = this.f58424.m30420();
                C2357 c2357M30427 = this.f58424.m30427();
                C6216 c6216M30437 = this.f58424.m30437();
                C10743 c10743M30430 = this.f58424.m30430();
                this.f58427.m18867(c7027M30420);
                if (m42540()) {
                    this.f58423.m43746(this);
                } else {
                    this.f58426 = new C15495(this.f58420, this.f58421, c7027M30420, c2357M30427, c6216M30437, c10743M30430);
                }
                this.f58427 = null;
            } catch (Throwable th) {
                this.f58427 = null;
                throw th;
            }
        } catch (Error | RuntimeException e) {
            this.f58423.m43746(this);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15495 m42548() {
        return this.f58426;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean m42540() {
        if (this.f58425) {
            return true;
        }
        if (this.f58422.mo2357()) {
            this.f58425 = true;
        }
        return this.f58425;
    }
}
