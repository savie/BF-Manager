package l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.۬ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63U1 */
/* JADX INFO: loaded from: classes4.dex */
public class C13958 implements InterfaceC12239 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44259 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22186 f44260;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final int hashCode() {
        return this.f44260.hashCode();
    }

    public final String toString() {
        return this.f44260.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13958)) {
            return false;
        }
        C13958 c13958 = (C13958) obj;
        InterfaceC22186 interfaceC22186 = this.f44260;
        if (interfaceC22186 == null) {
            return c13958.f44260 == null;
        }
        return interfaceC22186.equals(c13958.f44260);
    }
}
