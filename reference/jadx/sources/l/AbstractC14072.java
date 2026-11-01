package l;

/* JADX INFO: renamed from: l.ܰ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14072 {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo9284(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo9285(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m34035(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo9285(obj, obj2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m34034(Object obj) {
        if (obj == null) {
            return 0;
        }
        return mo9284(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14072 m34032() {
        return C3093.f11681;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC14072 m34033() {
        return C4898.f17180;
    }
}
