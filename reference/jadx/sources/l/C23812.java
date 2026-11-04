package l;

/* JADX INFO: renamed from: l.᩹᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VE */
/* JADX INFO: loaded from: classes.dex */
public final class C23812 implements InterfaceC3939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77132;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21335 f77133;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC24319 f77134;

    public C23812(AbstractC24319 abstractC24319, int i, C21335 c21335) {
        this.f77134 = abstractC24319;
        this.f77132 = i;
        this.f77133 = c21335;
    }

    @Override // l.InterfaceC3939
    public final int getKey() {
        return this.f77132;
    }

    @Override // l.InterfaceC3939
    public final int getOffset() {
        return this.f77133.m48562() - this.f77134.m54356().m24742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21335 m53133() {
        return this.f77133;
    }
}
