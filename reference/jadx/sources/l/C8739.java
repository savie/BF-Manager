package l;

/* JADX INFO: renamed from: l.ۡ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8739 extends AbstractC21832 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C8739 f30033 = new C8739();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo22678(AbstractC15939 abstractC15939) {
        return abstractC15939;
    }

    private Object readResolve() {
        return f30033;
    }
}
