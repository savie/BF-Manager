package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15235 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean zEquals;
        C3303 c3303 = (C3303) obj;
        C3303 c3304 = (C3303) obj2;
        if (c3303.f10804 != c3304.f10804) {
            return c3303.f10804 ? 1 : -1;
        }
        if (!c3303.f10804 || (zEquals = "keep_both".equals(c3303.f10794)) == "keep_both".equals(c3304.f10794)) {
            return c3303.f10797.compareTo(c3304.f10797);
        }
        return zEquals ? 1 : -1;
    }
}
