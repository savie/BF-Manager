package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5515 extends C1786 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f19195;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f19196;

    public C5515(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC1928.of());
    }

    public C5515(String str, C5515 c5515, String str2, long j, int i, long j2, C22362 c22362, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, c5515, j, i, j2, c22362, str3, str4, j3, j4, z);
        this.f19196 = str2;
        this.f19195 = AbstractC1928.copyOf((Collection) list);
    }
}
