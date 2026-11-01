package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14936 implements InterfaceC23537 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f48714;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8516 f48715;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4245 f48716;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19169 f48717;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48718;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f48719;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f48720;

    public /* synthetic */ C14936(C19169 c19169, AtomicInteger atomicInteger, ArrayList arrayList, int i, C4245 c4245, AtomicReference atomicReference, C8516 c8516) {
        this.f48717 = c19169;
        this.f48720 = atomicInteger;
        this.f48714 = arrayList;
        this.f48718 = i;
        this.f48716 = c4245;
        this.f48719 = atomicReference;
        this.f48715 = c8516;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C19169.m43987(this.f48717, this.f48720, this.f48714, this.f48718, this.f48716, this.f48719, this.f48715, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo1000((Integer) obj);
    }

    @Override // l.InterfaceC23537
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo1000(Integer num) {
        C10837.m27159((InterfaceC23537) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C10837.m27158((InterfaceC23537) this, intConsumer);
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
