package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܿᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17513 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f55685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f55686;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f55687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f55688;

    public C17513(long j, long j2, List list) {
        this.f55686 = AbstractC22433.copyOf((Collection) list);
        this.f55685 = j;
        this.f55688 = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f55687 = j3;
    }
}
