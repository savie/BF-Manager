package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14946 implements InterfaceC17767 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17767 f48761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17767 f48762;

    public /* synthetic */ C14946(InterfaceC17767 interfaceC17767, InterfaceC17767 interfaceC17768) {
        this.f48761 = interfaceC17767;
        this.f48762 = interfaceC17768;
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        C21295.m47757(this, d);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo35708((Float) obj);
    }

    @Override // l.InterfaceC17767
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo35708(Float f) {
        C21295.m47758((InterfaceC17767) this, f);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return C21295.m47756((InterfaceC17767) this, doubleConsumer);
    }

    @Override // l.InterfaceC17767
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14946 mo35706(InterfaceC17767 interfaceC17767) {
        return new C14946(this, interfaceC17767);
    }

    @Override // l.InterfaceC17767
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35707(float f) {
        this.f48761.mo35707(f);
        this.f48762.mo35707(f);
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
