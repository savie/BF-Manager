package l;

/* JADX INFO: renamed from: l.ܺ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16213 extends AbstractC10569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9158 f52324;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7746[] f52325;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f52326;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7558 f52327;

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f52327;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f52327.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f52326;
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f52324;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16213(C7558 c7558, C9158 c9158) {
        super(0);
        this.f36173 = c9158;
        this.f52327 = c7558;
        this.f52326 = C20446.m46243(c9158, null, c7558.getName());
        this.f52324 = c9158;
        this.f52325 = new C7746[c7558.m20078()];
        for (int i = 0; i < c7558.m20078(); i++) {
            this.f52325[i] = new C7746(c7558.m20076(i), c9158, this);
        }
        c9158.f31130.m4887(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38324(C16213 c16213) {
        c16213.m26727(c16213.f52327.m20075().m45766());
        for (C7746 c7746 : c16213.f52325) {
            C7746.m20395(c7746);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38325(C16213 c16213) {
        for (C7746 c7746 : c16213.f52325) {
            C7746.m20396(c7746);
        }
    }
}
