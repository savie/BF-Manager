package l;

/* JADX INFO: renamed from: l.ܺۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes5.dex */
public final class C16532 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23246 f53529;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f53530;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f53529.compareTo(((C16532) obj).f53529);
    }

    public C16532(C24738 c24738) {
        super(c24738);
        this.f53530 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16532 m39174(C24738 c24738, C23246 c23246) {
        C16532 c16532 = new C16532(c24738);
        c16532.f53530 = 0;
        c16532.f53529 = c23246;
        return (C16532) c24738.f80093.m38079(c16532);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f53529 = new C23246(this.f34102, c4028);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return this.f53529.mo1280(i);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        this.f53529.mo1281(c24166);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return C4791.m14766(new StringBuilder("encoded_array @0x"), this.f34103);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23246 m39175() {
        return this.f53529;
    }

    public final int hashCode() {
        if (this.f53530 == 0) {
            this.f53530 = this.f53529.hashCode();
        }
        return this.f53530;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C16532.class.equals(obj.getClass()) && this.f53529.compareTo(((C16532) obj).f53529) == 0;
    }
}
