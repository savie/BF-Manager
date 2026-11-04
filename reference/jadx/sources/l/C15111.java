package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܳۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15111 extends AbstractC12874 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C15111 f49318 = new C15111();

    @Override // l.AbstractC12874
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo31908(Object obj, Object obj2) {
        return false;
    }

    @Override // l.AbstractC12874
    /* JADX INFO: renamed from: ۙ */
    public final int mo31907(Object obj) {
        return System.identityHashCode(obj);
    }

    private Object readResolve() {
        return f49318;
    }
}
