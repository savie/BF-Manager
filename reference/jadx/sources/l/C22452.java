package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22452 implements InterfaceC14984 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21569 f72668;

    public /* synthetic */ C22452(InterfaceC21569 interfaceC21569) {
        this.f72668 = interfaceC21569;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo15049((Integer) obj);
    }

    @Override // l.InterfaceC14984
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo15049(Integer num) {
        C19460.m45001((InterfaceC14984) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C19460.m45000((InterfaceC14984) this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        if (i > 0) {
            this.f72668.mo35784(i);
        }
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
