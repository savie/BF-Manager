package l;

/* JADX INFO: renamed from: l.۟ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7569 extends AbstractC21680 {
    public AbstractC7569(InterfaceC14771 interfaceC14771) {
        super(interfaceC14771);
        if (interfaceC14771 != null && interfaceC14771.getContext() != C1218.f5350) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        return C1218.f5350;
    }
}
