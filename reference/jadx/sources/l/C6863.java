package l;

/* JADX INFO: renamed from: l.ۜܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6863 extends AbstractC18858 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15456 f23145;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6863(InterfaceC14771 interfaceC14771, InterfaceC22386 interfaceC22386, InterfaceC15456 interfaceC15456) {
        super(interfaceC14771, interfaceC22386);
        this.f23145 = interfaceC15456;
        C13465.m32963((Object) interfaceC14771, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final Object mo11546(Object obj) throws Throwable {
        int i = this.f23144;
        if (i != 0) {
            if (i == 1) {
                this.f23144 = 2;
                C18610.m43015(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f23144 = 1;
        C18610.m43015(obj);
        InterfaceC15456 interfaceC15456 = this.f23145;
        C13465.m32963((Object) interfaceC15456, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C6408.m17553(1, interfaceC15456);
        return interfaceC15456.invoke(this);
    }
}
