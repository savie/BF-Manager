package l;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2020 implements IntConsumer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f7533;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f7534;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3431 f7535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f7536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5589[] f7537;

    public /* synthetic */ C2020(C3431 c3431, C5589[] c5589Arr, long j, OutputStream outputStream, AtomicReference atomicReference) {
        this.f7535 = c3431;
        this.f7537 = c5589Arr;
        this.f7533 = j;
        this.f7536 = outputStream;
        this.f7534 = atomicReference;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C3431.m10138(this.f7535, this.f7537, this.f7533, this.f7536, this.f7534, i);
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }
}
