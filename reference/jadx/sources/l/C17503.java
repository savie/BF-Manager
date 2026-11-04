package l;

/* JADX INFO: renamed from: l.ܽۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17503 extends AbstractC18249 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56886;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23955 f56887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56888;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17503(InterfaceC23955 interfaceC23955, Object obj, InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        this.f56887 = interfaceC23955;
        this.f56888 = obj;
        C15243.m36587((Object) interfaceC4825, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10983(Object obj) throws Throwable {
        int i = this.f56886;
        if (i != 0) {
            if (i == 1) {
                this.f56886 = 2;
                C19676.m45348(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f56886 = 1;
        C19676.m45348(obj);
        InterfaceC23955 interfaceC23955 = this.f56887;
        C15243.m36587((Object) interfaceC23955, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C15989.m38120(2, interfaceC23955);
        return interfaceC23955.mo3124(this.f56888, this);
    }
}
