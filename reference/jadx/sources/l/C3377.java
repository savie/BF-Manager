package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W856 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1763 f10992;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public C3377(EnumC1763 enumC1763) {
        this.f10992 = enumC1763;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((InterfaceC23435) obj).mo17866(this.f10992);
    }
}
