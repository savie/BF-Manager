package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8SJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5769 extends AbstractC19939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f19822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f19823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f19824;

    public C5769(long j, long j2, List list) {
        this.f19823 = j;
        this.f19824 = j2;
        this.f19822 = C4681.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5769 m16846(C21287 c21287, long j, C1150 c1150) {
        ?? r5;
        long j2;
        c21287.m48485();
        boolean z = (c21287.m48493() & 128) != 0;
        ?? arrayList = Collections.EMPTY_LIST;
        if (z) {
            r5 = arrayList;
            j2 = -9223372036854775807L;
        } else {
            int iM48493 = c21287.m48493();
            boolean z2 = (iM48493 & 64) != 0;
            boolean z3 = (iM48493 & 32) != 0;
            boolean z4 = (iM48493 & 16) != 0;
            long jM41461 = (!z2 || z4) ? -9223372036854775807L : C17701.m41461(j, c21287);
            if (!z2) {
                int iM48494 = c21287.m48493();
                arrayList = new ArrayList(iM48494);
                for (int i = 0; i < iM48494; i++) {
                    c21287.m48493();
                    c1150.m4249(!z4 ? C17701.m41461(j, c21287) : -9223372036854775807L);
                    arrayList.add(new C13226());
                }
            }
            if (z3) {
                c21287.m48493();
                c21287.m48485();
            }
            c21287.m48494();
            c21287.m48493();
            c21287.m48493();
            r5 = arrayList;
            j2 = jM41461;
        }
        return new C5769(j2, c1150.m4249(j2), r5);
    }

    @Override // l.AbstractC19939
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f19823);
        sb.append(", programSplicePlaybackPositionUs= ");
        return C2764.m9137(sb, this.f19824, " }");
    }
}
