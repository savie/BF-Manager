package l;

/* JADX INFO: renamed from: l.᩺᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes.dex */
public final class C23317 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f75591;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f75592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f75593;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23317 c23317 = (C23317) obj;
        int iCompare = Integer.compare(this.f75591, c23317.f75591);
        return iCompare == 0 ? this.f75593.compareTo(c23317.f75593) : iCompare;
    }

    public C23317(AbstractC20745 abstractC20745) {
        this.f75592 = abstractC20745;
        String lowerCase = abstractC20745.getName().toLowerCase();
        this.f75593 = lowerCase;
        this.f75591 = C15556.f50610.mo17278(C15556.f50610.mo17278(Integer.MAX_VALUE, lowerCase), abstractC20745.mo33986());
    }
}
