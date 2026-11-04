package l;

/* JADX INFO: renamed from: l.ۙ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C5213 extends AbstractC12450 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12450 f18392;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f18393;

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int mo15679() {
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5213 m15677(AbstractC12450 abstractC12450, int i) {
        if (i == Integer.MAX_VALUE && abstractC12450 == null) {
            return C18461.f60086;
        }
        return new C5213(abstractC12450, i);
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12450 mo15678(int i) {
        return this.f18392;
    }

    @Override // l.AbstractC12450
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo15680(int i) {
        return this.f18393;
    }

    @Override // l.AbstractC12450
    public boolean equals(Object obj) {
        AbstractC12450 abstractC12450;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5213)) {
            return false;
        }
        if (this.f40013 != ((AbstractC12450) obj).f40013) {
            return false;
        }
        C5213 c5213 = (C5213) obj;
        return this.f18393 == c5213.f18393 && (abstractC12450 = this.f18392) != null && abstractC12450.equals(c5213.f18392);
    }

    public String toString() {
        AbstractC12450 abstractC12450 = this.f18392;
        String string = abstractC12450 != null ? abstractC12450.toString() : "";
        int length = string.length();
        int i = this.f18393;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5213(AbstractC12450 abstractC12450, int i) {
        int iM19444;
        if (abstractC12450 == null) {
            iM19444 = C7103.m19444(1, 0);
        } else {
            iM19444 = C7103.m19444(C7103.m19447(C7103.m19445(1, abstractC12450), i), 2);
        }
        super(iM19444);
        this.f18392 = abstractC12450;
        this.f18393 = i;
    }
}
