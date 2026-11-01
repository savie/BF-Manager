package l;

/* JADX INFO: renamed from: l.ۚ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5368 extends C22302 implements Runnable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f18537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC23156 f18538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 f18539;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18258 f18540;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC5368(C0429 c0429, C18258 c18258, AbstractC23156 abstractC23156) {
        this.f18537 = c0429;
        AbstractC23903 abstractC23903 = c0429.f1964;
        super(c0429, abstractC23903.f77452 == EnumC10477.f35879 ? abstractC23903.m52720() : (C22492) abstractC23903);
        this.f18539 = c0429.f1975;
        this.f18540 = c18258;
        this.f18538 = abstractC23156;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0429 c0429 = this.f18537;
        InterfaceC2173 interfaceC2173 = c0429.f1975;
        try {
            C18258 c18258 = this.f18540;
            c18258.f58258 = null;
            c0429.f1975 = this.f18539;
            c18258.f58258 = m49463(c18258.f77449.mo16235(), this.f18538);
        } finally {
            c0429.f1975 = interfaceC2173;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader store default for ");
        C18258 c18258 = this.f18540;
        sb.append(c18258.f77448);
        sb.append(".");
        sb.append(c18258);
        sb.append(" is ");
        sb.append(this.f18538);
        return sb.toString();
    }
}
