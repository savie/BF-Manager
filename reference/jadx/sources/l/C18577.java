package l;

/* JADX INFO: renamed from: l.ᩴۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18577 implements InterfaceC11955 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10111 f59075;

    public C18577(C10111 c10111) {
        this.f59075 = c10111;
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        C15050 c15050 = (C15050) obj;
        if (this.f59075.f34517) {
            throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
        }
        return c15050.m36039();
    }
}
