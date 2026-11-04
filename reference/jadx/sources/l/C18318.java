package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܿۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 8ATV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18318 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42735(InterfaceC0419 interfaceC0419, double d) {
        interfaceC0419.mo2223(C8485.m22800(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42736(InterfaceC0419 interfaceC0419, Float f) {
        interfaceC0419.mo2223(f.floatValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0419 m42734(InterfaceC0419 interfaceC0419, final DoubleConsumer doubleConsumer) {
        InterfaceC0419 interfaceC04110;
        if (doubleConsumer instanceof InterfaceC0419) {
            interfaceC04110 = (InterfaceC0419) doubleConsumer;
        } else {
            C17359.requireNonNull(doubleConsumer);
            interfaceC04110 = new InterfaceC0419() { // from class: l.ܰۨ᩹
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
                    doubleConsumer.accept(f);
                }

                @Override // l.InterfaceC0419
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo2224(Float f) {
                    C18318.m42736((InterfaceC0419) this, f);
                }

                public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                    return C18318.m42734((InterfaceC0419) this, doubleConsumer2);
                }

                @Override // l.InterfaceC0419
                /* JADX INFO: renamed from: ۙ */
                public final C21302 mo2222(InterfaceC0419 interfaceC04111) {
                    return new C21302(this, interfaceC04111);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC0419.mo2222(interfaceC04110);
    }
}
