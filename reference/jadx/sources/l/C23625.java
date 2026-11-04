package l;

/* JADX INFO: renamed from: l.᩹ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes.dex */
public final class C23625 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f76670;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76671;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16165 f76668 = new C16165();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16165 f76667 = new C16165();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f76669 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52873() {
        this.f76668.m38344();
        this.f76667.m38344();
        this.f76670 = false;
        this.f76669 = -9223372036854775807L;
        this.f76671 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52871(long j) {
        this.f76668.m38342(j);
        if (this.f76668.m38346()) {
            this.f76670 = false;
        } else if (this.f76669 != -9223372036854775807L) {
            if (!this.f76670 || this.f76667.m38343()) {
                this.f76667.m38344();
                this.f76667.m38342(this.f76669);
            }
            this.f76670 = true;
            this.f76667.m38342(j);
        }
        if (this.f76670 && this.f76667.m38346()) {
            C16165 c16165 = this.f76668;
            this.f76668 = this.f76667;
            this.f76667 = c16165;
            this.f76670 = false;
        }
        this.f76669 = j;
        this.f76671 = this.f76668.m38346() ? 0 : this.f76671 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m52870() {
        if (this.f76668.m38346()) {
            return this.f76668.m38341();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m52874() {
        return this.f76668.m38346();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m52875() {
        if (this.f76668.m38346()) {
            return (float) (1.0E9d / this.f76668.m38341());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m52876() {
        if (this.f76668.m38346()) {
            return this.f76668.m38345();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m52872() {
        return this.f76671;
    }
}
