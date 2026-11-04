package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14094 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2908 c2908 = (C2908) obj;
        C2908 c2909 = (C2908) obj2;
        boolean z = c2908.f9519;
        String str = c2908.f9518;
        boolean z2 = c2909.f9519;
        String str2 = c2909.f9518;
        if (z != z2) {
            return z ? -1 : 1;
        }
        if (str.equals("..")) {
            return -1;
        }
        if (str2.equals("..")) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
