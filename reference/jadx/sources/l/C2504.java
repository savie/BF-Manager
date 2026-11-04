package l;

/* JADX INFO: renamed from: l.ۖۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C2504 extends C1083 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f8013;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f8014;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f8015;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f8016;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2504(C22092 c22092, InterfaceC5075 interfaceC5075, String str, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        super(interfaceC5075);
        this.f8014 = c22092;
        this.f8013 = str;
        this.f8015 = abstractC22664;
        this.f8016 = abstractC22665;
    }

    @Override // l.C1083
    /* JADX INFO: renamed from: ᩸ */
    public final void mo4085(EnumC19876 enumC19876) {
        super.mo4085(enumC19876);
        int i = C9961.f32013[enumC19876.ordinal()];
        C22092 c22092 = this.f8014;
        if (i == 1) {
            InterfaceC5075 interfaceC5075M4083 = m4083();
            C17007 c17007M45980 = c22092.f71225.m45980(this.f8013, new Object[0]);
            C25213 c25213 = C13146.f42046;
            c22092.m50048(interfaceC5075M4083, new C25213("compiler", "prob.found.req", c17007M45980, this.f8015, this.f8016));
            return;
        }
        if (i == 2) {
            if (c22092.f71224 == null || c22092.f71224.m29565((AbstractC11781) c22092.f71193.f48295.f73596) == null || !c22092.m49952(c22092.f71224) || c22092.f71203.m55151((AbstractC22664) c22092.f71224.f38067.mo50621().last())) {
                return;
            }
            InterfaceC5075 interfaceC5075M4084 = m4083();
            AbstractC11781 abstractC11781 = (AbstractC11781) c22092.f71224.f33013.last();
            C25213 c25214 = C13146.f42046;
            c22092.m50032(interfaceC5075M4084, new C25213("compiler", "varargs.unsafe.use.varargs.param", abstractC11781));
            return;
        }
        throw new AssertionError("Unexpected lint: " + enumC19876);
    }
}
