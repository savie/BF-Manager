package l;

/* JADX INFO: renamed from: l.᩻ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C23410 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f75808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f75809;

    public C23410(C7648 c7648, int i) {
        this.f75808 = (c7648.f25243 & 1) != 0;
        this.f75809 = C13958.m33815(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23410 c23410) {
        return AbstractC13116.m32469().mo4146(this.f75809, c23410.f75809).mo4146(this.f75808, c23410.f75808).mo4142();
    }
}
