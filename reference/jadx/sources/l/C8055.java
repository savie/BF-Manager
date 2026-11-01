package l;

/* JADX INFO: renamed from: l.۠۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8055 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15817 f28208;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC3820[] f28209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20050 f28210;

    /* JADX WARN: Multi-variable type inference failed */
    public C8055(C19344 c19344, int i, AbstractC20050 abstractC20050) {
        this.f28210 = abstractC20050;
        this.f28209 = new InterfaceC3820[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object objMo32845 = abstractC20050.mo32845();
            ((C3403) c19344.f62380).m10095((AbstractC0998) objMo32845);
            this.f28209[i2] = objMo32845;
        }
        this.f28208 = new C15817(this.f28209);
    }
}
