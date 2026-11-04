package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩷֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes.dex */
public final class C21705 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Exception f69282;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f69281 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f69280 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49276(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f69282 == null) {
            this.f69282 = exc;
        }
        if (this.f69281 == -9223372036854775807L && !C14991.m36062()) {
            this.f69281 = 200 + jElapsedRealtime;
        }
        long j = this.f69281;
        if (j != -9223372036854775807L && jElapsedRealtime >= j) {
            Exception exc2 = this.f69282;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f69282;
            m49275();
            throw exc3;
        }
        this.f69280 = jElapsedRealtime + 50;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49277() {
        if (this.f69282 == null) {
            return false;
        }
        return C14991.m36062() || SystemClock.elapsedRealtime() < this.f69280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49275() {
        this.f69282 = null;
        this.f69281 = -9223372036854775807L;
        this.f69280 = -9223372036854775807L;
    }
}
