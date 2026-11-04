package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3178 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C20332 c20332 = (C20332) obj;
        C20332 c20333 = (C20332) obj2;
        if (c20332.m46712() != c20333.m46712()) {
            return c20332.m46712() ? -1 : 1;
        }
        return c20332.m46711().compareTo(c20333.m46711());
    }
}
