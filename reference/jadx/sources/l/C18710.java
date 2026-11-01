package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ᩴۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18710 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Exception f60688;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f60687 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f60686 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43242(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f60688 == null) {
            this.f60688 = exc;
        }
        if (this.f60687 == -9223372036854775807L && !C7421.m19869()) {
            this.f60687 = 200 + jElapsedRealtime;
        }
        long j = this.f60687;
        if (j != -9223372036854775807L && jElapsedRealtime >= j) {
            Exception exc2 = this.f60688;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f60688;
            m43241();
            throw exc3;
        }
        this.f60686 = jElapsedRealtime + 50;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43243() {
        if (this.f60688 == null) {
            return false;
        }
        return C7421.m19869() || SystemClock.elapsedRealtime() < this.f60686;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43241() {
        this.f60688 = null;
        this.f60687 = -9223372036854775807L;
        this.f60686 = -9223372036854775807L;
    }
}
