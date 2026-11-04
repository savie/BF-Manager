package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۚܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5722 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparator f19731;

    public C5722(Comparator comparator) {
        comparator.getClass();
        this.f19731 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19731.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5722) {
            return this.f19731.equals(((C5722) obj).f19731);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19731.hashCode();
    }

    public final String toString() {
        return this.f19731.toString();
    }
}
