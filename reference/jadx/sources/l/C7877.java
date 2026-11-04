package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۟ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SBW1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7877 implements InterfaceC0419 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f26217;

    public /* synthetic */ C7877(Consumer consumer) {
        this.f26217 = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        C18318.m42735(this, d);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo2224((Float) obj);
    }

    @Override // l.InterfaceC0419
    /* JADX INFO: renamed from: ۙ */
    public final void mo2223(float f) {
        this.f26217.accept(Float.valueOf(f));
    }

    @Override // l.InterfaceC0419
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2224(Float f) {
        C18318.m42736((InterfaceC0419) this, f);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C18318.m42734((InterfaceC0419) this, doubleConsumer);
    }

    @Override // l.InterfaceC0419
    /* JADX INFO: renamed from: ۙ */
    public final C21302 mo2222(InterfaceC0419 interfaceC0419) {
        return new C21302(this, interfaceC0419);
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
