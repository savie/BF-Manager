package l;

/* JADX INFO: renamed from: l.ۡۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9272 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21757 f30166;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC21207[] f30167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC10568 f30168;

    /* JADX WARN: Multi-variable type inference failed */
    public C9272(C2561 c2561, int i, AbstractC10568 abstractC10568) {
        this.f30168 = abstractC10568;
        this.f30167 = new InterfaceC21207[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object objMo26278 = abstractC10568.mo26278();
            ((C15745) c2561.f8231).m37655((AbstractC4053) objMo26278);
            this.f30167[i2] = objMo26278;
        }
        this.f30166 = new C21757(this.f30167);
    }
}
