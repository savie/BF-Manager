package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۢۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9858 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3147 c3147 = (C3147) obj;
        C3147 c3148 = (C3147) obj2;
        long j = c3147.f10205;
        long j2 = c3148.f10205;
        if (j - j2 == 0) {
            return c3147.compareTo(c3148);
        }
        return j < j2 ? -1 : 1;
    }
}
