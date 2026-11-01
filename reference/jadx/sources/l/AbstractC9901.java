package l;

/* JADX INFO: renamed from: l.ۢ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9901 implements InterfaceC19653, Comparable {
    /* JADX INFO: renamed from: ֨ */
    public abstract String mo2375();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo2378(AbstractC9901 abstractC9901);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo2379();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC9901 abstractC9901) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC9901.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return mo2378(abstractC9901);
    }
}
