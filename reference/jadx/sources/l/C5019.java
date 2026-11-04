package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5019 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8763 c8763 = (C8763) obj;
        C8763 c8764 = (C8763) obj2;
        C2600 c2600 = ((C15459) c8763.m23456()).f50328;
        C2600 c2601 = ((C15459) c8764.m23456()).f50328;
        if (c2600 == null || c2601 == null) {
            if (c2600 == null && c2601 == null) {
                return c8763.m23451().compareTo(c8764.m23451());
            }
            return c2600 != null ? -1 : 1;
        }
        int i = c2600.f8353;
        int i2 = c2601.f8353;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.compare(i, i2);
    }
}
