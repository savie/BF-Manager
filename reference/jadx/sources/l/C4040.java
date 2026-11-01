package l;

/* JADX INFO: renamed from: l.ۘܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4040 extends AbstractC7569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f14935;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15456 f14936;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4040(InterfaceC15456 interfaceC15456, InterfaceC14771 interfaceC14771) {
        super(interfaceC14771);
        this.f14936 = interfaceC15456;
        C13465.m32963((Object) interfaceC14771, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo11546(Object obj) throws Throwable {
        int i = this.f14935;
        if (i != 0) {
            if (i == 1) {
                this.f14935 = 2;
                C18610.m43015(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f14935 = 1;
        C18610.m43015(obj);
        InterfaceC15456 interfaceC15456 = this.f14936;
        C13465.m32963((Object) interfaceC15456, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C6408.m17553(1, interfaceC15456);
        return interfaceC15456.invoke(this);
    }
}
