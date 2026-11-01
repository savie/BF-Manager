package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20959 extends AbstractC8965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f68291;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f68292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f68293;

    public C20959(long j, long j2, List list) {
        this.f68292 = j;
        this.f68293 = j2;
        this.f68291 = C0561.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20959 m47132(C2460 c2460, long j, C6694 c6694) {
        ?? r5;
        long j2;
        c2460.m7532();
        boolean z = (c2460.m7516() & 128) != 0;
        ?? arrayList = Collections.EMPTY_LIST;
        if (z) {
            r5 = arrayList;
            j2 = -9223372036854775807L;
        } else {
            int iM7516 = c2460.m7516();
            boolean z2 = (iM7516 & 64) != 0;
            boolean z3 = (iM7516 & 32) != 0;
            boolean z4 = (iM7516 & 16) != 0;
            long jM31034 = (!z2 || z4) ? -9223372036854775807L : C12493.m31034(j, c2460);
            if (!z2) {
                int iM7517 = c2460.m7516();
                arrayList = new ArrayList(iM7517);
                for (int i = 0; i < iM7517; i++) {
                    c2460.m7516();
                    c6694.m18077(!z4 ? C12493.m31034(j, c2460) : -9223372036854775807L);
                    arrayList.add(new C7553());
                }
            }
            if (z3) {
                c2460.m7516();
                c2460.m7532();
            }
            c2460.m7519();
            c2460.m7516();
            c2460.m7516();
            r5 = arrayList;
            j2 = jM31034;
        }
        return new C20959(j2, c6694.m18077(j2), r5);
    }

    @Override // l.AbstractC8965
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f68292);
        sb.append(", programSplicePlaybackPositionUs= ");
        return C15037.m36023(sb, this.f68293, " }");
    }
}
