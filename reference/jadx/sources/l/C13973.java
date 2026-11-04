package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13973 implements InterfaceC22201 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22201 f44308;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22201 f44309;

    public /* synthetic */ C13973(InterfaceC22201 interfaceC22201, InterfaceC22201 interfaceC22202) {
        this.f44308 = interfaceC22201;
        this.f44309 = interfaceC22202;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C5047.m15279(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo19901((Byte) obj);
    }

    @Override // l.InterfaceC22201
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo19901(Byte b) {
        C5047.m15280((InterfaceC22201) this, b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C5047.m15278((InterfaceC22201) this, intConsumer);
    }

    @Override // l.InterfaceC22201
    /* JADX INFO: renamed from: ۙ */
    public final C13973 mo19899(InterfaceC22201 interfaceC22201) {
        return new C13973(this, interfaceC22201);
    }

    @Override // l.InterfaceC22201
    /* JADX INFO: renamed from: ۙ */
    public final void mo19900(byte b) {
        this.f44308.mo19900(b);
        this.f44309.mo19900(b);
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
