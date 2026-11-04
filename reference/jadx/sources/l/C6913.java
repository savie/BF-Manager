package l;

/* JADX INFO: renamed from: l.ۜۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6913 implements InterfaceC11144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9444 f22906;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f22907;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f22909 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22910;

    public C6913(C9444 c9444, int i) {
        this.f22906 = c9444;
        this.f22910 = i;
        this.f22907 = c9444.m24820();
        AbstractC8699 abstractC8699M24818 = c9444.m24818();
        if (abstractC8699M24818 != null) {
            this.f22908 = (int) abstractC8699M24818.mo9079();
        } else {
            this.f22908 = 0;
        }
    }

    @Override // l.InterfaceC11144
    public final String a() {
        if (this.f22909 == null) {
            AbstractC8699 abstractC8699M24818 = this.f22906.m24818();
            if (abstractC8699M24818 != null) {
                this.f22909 = abstractC8699M24818.m23392();
            }
            if (this.f22909 == null) {
                this.f22909 = "";
            }
        }
        return this.f22909;
    }

    @Override // l.InterfaceC11144
    public final int b() {
        return this.f22908;
    }

    @Override // l.InterfaceC11144
    public final int c() {
        return this.f22910;
    }

    @Override // l.InterfaceC11144
    public final int d() {
        return this.f22907;
    }

    public final String toString() {
        return "d@" + hashCode() + this.f22909 + this.f22907 + this.f22910 + this.f22908;
    }
}
