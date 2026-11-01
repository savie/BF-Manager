package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7466 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20872 f24866;

    public /* synthetic */ C7466(C20872 c20872) {
        this.f24866 = c20872;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C20872.m46903(this.f24866, (String) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
