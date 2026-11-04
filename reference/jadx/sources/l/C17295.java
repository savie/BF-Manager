package l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68PN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16549 f56324;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f56325;

    static {
        C7116.m19499(0);
        C7116.m19499(1);
    }

    public C17295(C16549 c16549, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c16549.f53567)) {
            throw new IndexOutOfBoundsException();
        }
        this.f56324 = c16549;
        this.f56325 = AbstractC1928.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17295.class == obj.getClass()) {
            C17295 c17295 = (C17295) obj;
            if (this.f56324.equals(c17295.f56324) && this.f56325.equals(c17295.f56325)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f56325.hashCode() * 31) + this.f56324.hashCode();
    }
}
