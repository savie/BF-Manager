package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15620 extends C19853 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f50798;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f50799;

    public C15620(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC22433.of());
    }

    public C15620(String str, C15620 c15620, String str2, long j, int i, long j2, C8354 c8354, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, c15620, j, i, j2, c8354, str3, str4, j3, j4, z);
        this.f50798 = str2;
        this.f50799 = AbstractC22433.copyOf((Collection) list);
    }
}
