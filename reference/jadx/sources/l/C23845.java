package l;

/* JADX INFO: renamed from: l.᩹᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C23845 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f77222;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f77223;

    public C23845(C15648 c15648, int i) {
        this.f77222 = (c15648.f50850 & 1) != 0;
        this.f77223 = C14442.m34867(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23845 c23845) {
        return AbstractC25114.m55993().mo6828(this.f77223, c23845.f77223).mo6828(this.f77222, c23845.f77222).mo6824();
    }
}
