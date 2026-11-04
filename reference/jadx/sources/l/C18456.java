package l;

/* JADX INFO: renamed from: l.ܿܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public class C18456 extends C4286 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13191 f60078;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18456(AbstractServiceC13191 abstractServiceC13191) {
        super(abstractServiceC13191);
        this.f60078 = abstractServiceC13191;
    }

    @Override // l.C4286, l.C12489, l.InterfaceC3540
    public final void onCreate() {
        C21440 c21440 = new C21440(this, this.f60078);
        this.f40098 = c21440;
        c21440.onCreate();
    }
}
