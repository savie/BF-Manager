package l;

/* JADX INFO: renamed from: l.᩸ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C22723 extends AbstractC4823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f73755;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21977[] f73756;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14034 f73757;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22240 f73758;

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f73758;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f73758.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f73755;
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f73757;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22723(C22240 c22240, C14034 c14034) {
        super(0);
        this.f16869 = c14034;
        this.f73758 = c22240;
        this.f73755 = C19739.m45480(c14034, null, c22240.getName());
        this.f73757 = c14034;
        this.f73756 = new C21977[c22240.m50295()];
        for (int i = 0; i < c22240.m50295(); i++) {
            this.f73756[i] = new C21977(c22240.m50294(i), c14034, this);
        }
        c14034.f44472.m48903(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51251(C22723 c22723) {
        c22723.m14855(c22723.f73758.m50293().m45995());
        for (C21977 c21977 : c22723.f73756) {
            C21977.m49713(c21977);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51252(C22723 c22723) {
        for (C21977 c21977 : c22723.f73756) {
            C21977.m49714(c21977);
        }
    }
}
