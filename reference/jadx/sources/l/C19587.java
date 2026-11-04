package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19587 extends AbstractC12874 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C19587 f63162 = new C19587();

    @Override // l.AbstractC12874
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo31908(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // l.AbstractC12874
    /* JADX INFO: renamed from: ۙ */
    public final int mo31907(Object obj) {
        return obj.hashCode();
    }

    private Object readResolve() {
        return f63162;
    }
}
