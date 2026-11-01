package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۛ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6312 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((C17601) obj).m40921().f19460.f30809;
        int i2 = ((C17601) obj2).m40921().f19460.f30809;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
