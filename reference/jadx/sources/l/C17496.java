package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17496 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((C16750) obj).m39526().f56275.f34104;
        int i2 = ((C16750) obj2).m39526().f56275.f34104;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
