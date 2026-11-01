package l;

/* JADX INFO: renamed from: l.᩷ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20578 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f67049;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67050;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14229 f67051;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14229 f67052;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14229 f67053;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67054 = 1;

    public C20578(C14229 c14229) {
        this.f67051 = c14229;
        this.f67053 = c14229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46441(int i) {
        C14229 c14229M34332 = this.f67053.m34332(i);
        int i2 = 1;
        if (this.f67054 == 2) {
            if (c14229M34332 != null) {
                this.f67053 = c14229M34332;
                this.f67050++;
            } else if (i == 65038) {
                m46439();
            } else if (i != 65039) {
                if (this.f67053.m34331() != null) {
                    if (this.f67050 != 1 || m46440()) {
                        this.f67052 = this.f67053;
                        m46439();
                        i2 = 3;
                    } else {
                        m46439();
                    }
                } else {
                    m46439();
                }
            }
            i2 = 2;
        } else if (c14229M34332 == null) {
            m46439();
        } else {
            this.f67054 = 2;
            this.f67053 = c14229M34332;
            this.f67050 = 1;
            i2 = 2;
        }
        this.f67049 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m46439() {
        this.f67054 = 1;
        this.f67053 = this.f67051;
        this.f67050 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4432 m46444() {
        return this.f67052.m34331();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4432 m46442() {
        return this.f67053.m34331();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m46443() {
        if (this.f67054 != 2 || this.f67053.m34331() == null) {
            return false;
        }
        return this.f67050 > 1 || m46440();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m46440() {
        return this.f67053.m34331().m12365() || this.f67049 == 65039;
    }
}
