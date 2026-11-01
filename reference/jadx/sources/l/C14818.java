package l;

/* JADX INFO: renamed from: l.ܳ᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14818 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f48437;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23990 f48436 = new C23990();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23990 f48434 = new C23990();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f48435 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35503() {
        this.f48436.m52826();
        this.f48434.m52826();
        this.f48437 = false;
        this.f48435 = -9223372036854775807L;
        this.f48433 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35499(long j) {
        this.f48436.m52825(j);
        if (this.f48436.m52823()) {
            this.f48437 = false;
        } else if (this.f48435 != -9223372036854775807L) {
            if (!this.f48437 || this.f48434.m52827()) {
                this.f48434.m52826();
                this.f48434.m52825(this.f48435);
            }
            this.f48437 = true;
            this.f48434.m52825(j);
        }
        if (this.f48437 && this.f48434.m52823()) {
            C23990 c23990 = this.f48436;
            this.f48436 = this.f48434;
            this.f48434 = c23990;
            this.f48437 = false;
        }
        this.f48435 = j;
        this.f48433 = this.f48436.m52823() ? 0 : this.f48433 + 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m35497() {
        if (this.f48436.m52823()) {
            return this.f48436.m52828();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m35498() {
        if (this.f48436.m52823()) {
            return this.f48436.m52824();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m35500() {
        return this.f48436.m52823();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m35502() {
        if (this.f48436.m52823()) {
            return (float) (1.0E9d / this.f48436.m52824());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35501() {
        return this.f48433;
    }
}
