package l;

/* JADX INFO: renamed from: l.ܶܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15331 extends AbstractC18858 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8400 f49935;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49936;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15331(InterfaceC14771 interfaceC14771, InterfaceC22386 interfaceC22386, InterfaceC8400 interfaceC8400, Object obj) {
        super(interfaceC14771, interfaceC22386);
        this.f49935 = interfaceC8400;
        this.f49936 = obj;
        C13465.m32963((Object) interfaceC14771, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final Object mo11546(Object obj) throws Throwable {
        int i = this.f49937;
        if (i != 0) {
            if (i == 1) {
                this.f49937 = 2;
                C18610.m43015(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f49937 = 1;
        C18610.m43015(obj);
        InterfaceC8400 interfaceC8400 = this.f49935;
        C13465.m32963((Object) interfaceC8400, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C6408.m17553(2, interfaceC8400);
        return interfaceC8400.mo3208(this.f49936, this);
    }
}
