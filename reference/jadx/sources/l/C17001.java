package l;

/* JADX INFO: renamed from: l.ܿ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C17001 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f54349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23352 f54350;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f54350.compareTo(((C17001) obj).f54350);
    }

    public C17001(C12063 c12063) {
        super(c12063);
        this.f54349 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17001 m39780(C12063 c12063, C23352 c23352) {
        C17001 c17001 = new C17001(c12063);
        c17001.f54349 = 0;
        c17001.f54350 = c23352;
        return (C17001) c12063.f40349.m28060(c17001);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f54350 = new C23352(this.f30808, c13825);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return this.f54350.mo4462(i);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        this.f54350.mo4463(c4651);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return C9576.m24440(new StringBuilder("encoded_array @0x"), this.f30807);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23352 m39781() {
        return this.f54350;
    }

    public final int hashCode() {
        if (this.f54349 == 0) {
            this.f54349 = this.f54350.hashCode();
        }
        return this.f54349;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C17001.class.equals(obj.getClass()) && this.f54350.compareTo(((C17001) obj).f54350) == 0;
    }
}
