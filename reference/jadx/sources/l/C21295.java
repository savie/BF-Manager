package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩸ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21295 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47757(InterfaceC17767 interfaceC17767, double d) {
        interfaceC17767.mo35707(C21273.m47736(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47758(InterfaceC17767 interfaceC17767, Float f) {
        interfaceC17767.mo35707(f.floatValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17767 m47756(InterfaceC17767 interfaceC17767, final DoubleConsumer doubleConsumer) {
        InterfaceC17767 interfaceC17768;
        if (doubleConsumer instanceof InterfaceC17767) {
            interfaceC17768 = (InterfaceC17767) doubleConsumer;
        } else {
            C13638.requireNonNull(doubleConsumer);
            interfaceC17768 = new InterfaceC17767() { // from class: l.᩺ۖᩴ
                @Override // java.util.function.DoubleConsumer
                public final /* synthetic */ void accept(double d) {
                    C21295.m47757(this, d);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo35708((Float) obj);
                }

                @Override // l.InterfaceC17767
                /* JADX INFO: renamed from: ۙ */
                public final void mo35707(float f) {
                    doubleConsumer.accept(f);
                }

                @Override // l.InterfaceC17767
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo35708(Float f) {
                    C21295.m47758((InterfaceC17767) this, f);
                }

                public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                    return C21295.m47756((InterfaceC17767) this, doubleConsumer2);
                }

                @Override // l.InterfaceC17767
                /* JADX INFO: renamed from: ۙ */
                public final C14946 mo35706(InterfaceC17767 interfaceC17769) {
                    return new C14946(this, interfaceC17769);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC17767.mo35706(interfaceC17768);
    }
}
