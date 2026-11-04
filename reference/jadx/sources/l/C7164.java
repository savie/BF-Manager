package l;

/* JADX INFO: renamed from: l.ۜ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7164 implements InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10628 f23675;

    public C7164(C10628 c10628) {
        this.f23675 = c10628;
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        C9400 c9400 = (C9400) obj;
        if (this.f23675.f33710) {
            throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
        }
        return c9400.m24748();
    }
}
