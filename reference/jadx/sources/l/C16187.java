package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 48P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16187 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f52541;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f52542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f52543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f52544;

    public C16187(long j, long j2, List list) {
        this.f52541 = AbstractC1928.copyOf((Collection) list);
        this.f52544 = j;
        this.f52543 = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f52542 = j3;
    }
}
