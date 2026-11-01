package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۚ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5354 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparator f18497;

    public C5354(Comparator comparator) {
        comparator.getClass();
        this.f18497 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18497.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5354) {
            return this.f18497.equals(((C5354) obj).f18497);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18497.hashCode();
    }

    public final String toString() {
        return this.f18497.toString();
    }
}
