package l;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8482 implements IntConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f27767;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f27768;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13702 f27769;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f27770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19760[] f27771;

    public /* synthetic */ C8482(C13702 c13702, C19760[] c19760Arr, long j, OutputStream outputStream, AtomicReference atomicReference) {
        this.f27769 = c13702;
        this.f27771 = c19760Arr;
        this.f27770 = j;
        this.f27767 = outputStream;
        this.f27768 = atomicReference;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C13702.m33495(this.f27769, this.f27771, this.f27770, this.f27767, this.f27768, i);
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }
}
