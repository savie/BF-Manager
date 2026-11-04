package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5047 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15279(InterfaceC22201 interfaceC22201, int i) {
        interfaceC22201.mo19900(C8485.m22799(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15280(InterfaceC22201 interfaceC22201, Byte b) {
        interfaceC22201.mo19900(b.byteValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22201 m15278(InterfaceC22201 interfaceC22201, final IntConsumer intConsumer) {
        InterfaceC22201 interfaceC22202;
        if (intConsumer instanceof InterfaceC22201) {
            interfaceC22202 = (InterfaceC22201) intConsumer;
        } else {
            C17359.requireNonNull(intConsumer);
            interfaceC22202 = new InterfaceC22201() { // from class: l.ۜܺ᩹
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C5047.m15279(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo19901((Byte) obj);
                }

                @Override // l.InterfaceC22201
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo19900(byte b) {
                    intConsumer.accept(b);
                }

                @Override // l.InterfaceC22201
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ void mo19901(Byte b) {
                    C5047.m15280((InterfaceC22201) this, b);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C5047.m15278((InterfaceC22201) this, intConsumer2);
                }

                @Override // l.InterfaceC22201
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final C13973 mo19899(InterfaceC22201 interfaceC22203) {
                    return new C13973(this, interfaceC22203);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC22201.mo19899(interfaceC22202);
    }
}
