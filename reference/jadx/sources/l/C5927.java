package l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68PN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5927 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17216 f20187;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f20188;

    static {
        C17983.m41806(0);
        C17983.m41806(1);
    }

    public C5927(C17216 c17216, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c17216.f54864)) {
            throw new IndexOutOfBoundsException();
        }
        this.f20187 = c17216;
        this.f20188 = AbstractC22433.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5927.class == obj.getClass()) {
            C5927 c5927 = (C5927) obj;
            if (this.f20187.equals(c5927.f20187) && this.f20188.equals(c5927.f20188)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20188.hashCode() * 31) + this.f20187.hashCode();
    }
}
