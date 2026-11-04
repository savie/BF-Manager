package l;

/* JADX INFO: renamed from: l.ܽۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17325 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16579 f56418;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f56419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f56420;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16579 f56421;

    public C17325(int i) {
        this.f56420 = i;
        this.f56419 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40672(int i, int i2) {
        int i3 = this.f56420;
        int i4 = this.f56419;
        C16579 c16579 = new C16579(i3, i4, i, i2);
        C16579 c165710 = this.f56421;
        if (c165710 != null) {
            c165710.f53657 = c16579;
        } else {
            this.f56418 = c16579;
        }
        this.f56421 = c16579;
        this.f56420 = i3 + i;
        this.f56419 = i4 + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40671(int i) {
        this.f56420 += i;
        this.f56419 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16579 m40670() {
        return this.f56418;
    }
}
