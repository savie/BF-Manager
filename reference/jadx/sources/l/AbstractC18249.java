package l;

/* JADX INFO: renamed from: l.ܿۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18249 extends AbstractC20487 {
    public AbstractC18249(InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        if (interfaceC4825 != null && interfaceC4825.getContext() != C24963.f80840) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        return C24963.f80840;
    }
}
