package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۠ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8795 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14015 c14015 = (C14015) obj;
        C14015 c14016 = (C14015) obj2;
        C25227 c25227 = c14015.f44405;
        if ((c25227 == null) == (c14016.f44405 == null)) {
            boolean z = c14015.f44404;
            if (z == c14016.f44404) {
                int i = c14016.f44403 - c14015.f44403;
                if (i != 0) {
                    return i;
                }
                int i2 = c14015.f44401 - c14016.f44401;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (c25227 != null) {
            return -1;
        }
        return 1;
    }
}
