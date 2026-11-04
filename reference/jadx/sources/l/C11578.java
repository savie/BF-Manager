package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۧۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J56M */
/* JADX INFO: loaded from: classes4.dex */
public final class C11578 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18753 f36375;

    @Override // l.AbstractC18753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6460(Object obj, Object obj2) {
        throw null;
    }

    public C11578(AbstractC18753 abstractC18753) {
        this.f36375 = abstractC18753;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f36375.compare(obj2, obj);
    }

    @Override // l.AbstractC18753
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18753 mo1214() {
        return this.f36375;
    }

    public final int hashCode() {
        return -this.f36375.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11578) {
            return this.f36375.equals(((C11578) obj).f36375);
        }
        return false;
    }

    public final String toString() {
        return this.f36375 + ".reverse()";
    }
}
