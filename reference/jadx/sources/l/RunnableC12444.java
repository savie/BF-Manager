package l;

/* JADX INFO: renamed from: l.ۨܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC12444 extends C6479 implements Runnable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC21654 f39993;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 f39994;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f39995;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10377 f39996;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC12444(C11172 c11172, C10377 c10377, AbstractC21654 abstractC21654) {
        this.f39995 = c11172;
        AbstractC11781 abstractC11781 = c11172.f35192;
        super(c11172, abstractC11781.f38066 == EnumC13603.f43218 ? abstractC11781.m29558() : (C24550) abstractC11781);
        this.f39994 = c11172.f35182;
        this.f39996 = c10377;
        this.f39993 = abstractC21654;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11172 c11172 = this.f39995;
        InterfaceC15976 interfaceC15976 = c11172.f35182;
        try {
            C10377 c10377 = this.f39996;
            c10377.f33011 = null;
            c11172.f35182 = this.f39994;
            c10377.f33011 = m18299(c10377.f38067.mo31585(), this.f39993);
        } finally {
            c11172.f35182 = interfaceC15976;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader store default for ");
        C10377 c10377 = this.f39996;
        sb.append(c10377.f38069);
        sb.append(".");
        sb.append(c10377);
        sb.append(" is ");
        sb.append(this.f39993);
        return sb.toString();
    }
}
