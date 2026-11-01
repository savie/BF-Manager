package l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ᩳ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63U1 */
/* JADX INFO: loaded from: classes5.dex */
public class C18315 implements InterfaceC23389 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58418 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8438 f58419;

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
        return this.f58419.hashCode();
    }

    public final String toString() {
        return this.f58419.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18315)) {
            return false;
        }
        C18315 c18315 = (C18315) obj;
        InterfaceC8438 interfaceC8438 = this.f58419;
        if (interfaceC8438 == null) {
            return c18315.f58419 == null;
        }
        return interfaceC8438.equals(c18315.f58419);
    }
}
