package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18884 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C19590 c19590 = (C19590) obj;
        C19590 c19591 = (C19590) obj2;
        C17492 c17492 = c19590.f62925;
        if ((c17492 == null) == (c19591.f62925 == null)) {
            boolean z = c19590.f62929;
            if (z == c19591.f62929) {
                int i = c19591.f62927 - c19590.f62927;
                if (i != 0) {
                    return i;
                }
                int i2 = c19590.f62926 - c19591.f62926;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (c17492 != null) {
            return -1;
        }
        return 1;
    }
}
