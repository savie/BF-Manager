package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3093 extends AbstractC14072 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C3093 f11681 = new C3093();

    @Override // l.AbstractC14072
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9285(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // l.AbstractC14072
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo9284(Object obj) {
        return obj.hashCode();
    }

    private Object readResolve() {
        return f11681;
    }
}
