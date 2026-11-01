package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19268 implements IntConsumer {
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int iM38411 = C16259.m38411(i);
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        if (iM38411 == 0) {
            interfaceC17314Edit.remove("amfbc");
        } else {
            interfaceC17314Edit.mo4065(iM38411, "amfbc");
        }
        interfaceC17314Edit.apply();
        ServiceC8498.m22213();
    }
}
