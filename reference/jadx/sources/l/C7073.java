package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7073 implements IntConsumer {
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int iM2365 = C0492.m2365(i);
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        if (iM2365 == 0) {
            interfaceC18752Edit.remove("amfbc");
        } else {
            interfaceC18752Edit.mo3486(iM2365, "amfbc");
        }
        interfaceC18752Edit.apply();
        ServiceC6459.m18248();
    }
}
