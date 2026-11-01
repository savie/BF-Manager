package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֡۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0284 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean zEquals;
        C3106 c3106 = (C3106) obj;
        C3106 c3107 = (C3106) obj2;
        if (c3106.f11714 != c3107.f11714) {
            return c3106.f11714 ? 1 : -1;
        }
        if (!c3106.f11714 || (zEquals = "keep_both".equals(c3106.f11707)) == "keep_both".equals(c3107.f11707)) {
            return c3106.f11713.compareTo(c3107.f11713);
        }
        return zEquals ? 1 : -1;
    }
}
