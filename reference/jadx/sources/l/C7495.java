package l;

/* JADX INFO: renamed from: l.۟۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C7495 extends AbstractC11729 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f24960;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC11729 f24961;

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ۨ */
    public int mo10717() {
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7495 m19996(AbstractC11729 abstractC11729, int i) {
        if (i == Integer.MAX_VALUE && abstractC11729 == null) {
            return C3615.f13295;
        }
        return new C7495(abstractC11729, i);
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ۙ */
    public AbstractC11729 mo10716(int i) {
        return this.f24961;
    }

    @Override // l.AbstractC11729
    /* JADX INFO: renamed from: ܰ */
    public int mo10718(int i) {
        return this.f24960;
    }

    @Override // l.AbstractC11729
    public boolean equals(Object obj) {
        AbstractC11729 abstractC11729;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7495)) {
            return false;
        }
        if (this.f39421 != ((AbstractC11729) obj).f39421) {
            return false;
        }
        C7495 c7495 = (C7495) obj;
        return this.f24960 == c7495.f24960 && (abstractC11729 = this.f24961) != null && abstractC11729.equals(c7495.f24961);
    }

    public String toString() {
        AbstractC11729 abstractC11729 = this.f24961;
        String string = abstractC11729 != null ? abstractC11729.toString() : "";
        int length = string.length();
        int i = this.f24960;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7495(AbstractC11729 abstractC11729, int i) {
        int iM13213;
        if (abstractC11729 == null) {
            iM13213 = C4758.m13213(1, 0);
        } else {
            iM13213 = C4758.m13213(C4758.m13217(C4758.m13214(1, abstractC11729), i), 2);
        }
        super(iM13213);
        this.f24961 = abstractC11729;
        this.f24960 = i;
    }
}
