package l;

/* JADX INFO: renamed from: l.۬֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13487 implements InterfaceC6052, Comparable {
    /* JADX INFO: renamed from: ۫ */
    public abstract String mo1845();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo1848(AbstractC13487 abstractC13487);

    /* JADX INFO: renamed from: ᩸ */
    public abstract boolean mo1849();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC13487 abstractC13487) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC13487.getClass();
        if (cls != cls2) {
            return cls.getName().compareTo(cls2.getName());
        }
        return mo1848(abstractC13487);
    }
}
