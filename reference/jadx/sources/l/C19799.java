package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19799 implements InterfaceC14984 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63660;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20168 f63661;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3374 f63662;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11594 f63663;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f63664;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f63665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f63666;

    public /* synthetic */ C19799(C11594 c11594, AtomicInteger atomicInteger, ArrayList arrayList, int i, C20168 c20168, AtomicReference atomicReference, C3374 c3374) {
        this.f63663 = c11594;
        this.f63666 = atomicInteger;
        this.f63664 = arrayList;
        this.f63660 = i;
        this.f63661 = c20168;
        this.f63665 = atomicReference;
        this.f63662 = c3374;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C11594.m29132(this.f63663, this.f63666, this.f63664, this.f63660, this.f63661, this.f63665, this.f63662, i);
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

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
