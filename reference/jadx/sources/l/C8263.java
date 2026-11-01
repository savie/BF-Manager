package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J540 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8263 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28725;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f28725) {
            case 0:
                ((InterfaceC18846) obj).m43486();
                break;
            default:
                ((InterfaceC8825) obj).getClass();
                break;
        }
    }
}
