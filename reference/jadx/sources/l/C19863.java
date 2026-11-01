package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19863 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45116(InterfaceC0106 interfaceC0106, int i) {
        interfaceC0106.mo1138(C21273.m47735(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45117(InterfaceC0106 interfaceC0106, Byte b) {
        interfaceC0106.mo1138(b.byteValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0106 m45115(InterfaceC0106 interfaceC0106, final IntConsumer intConsumer) {
        InterfaceC0106 interfaceC0107;
        if (intConsumer instanceof InterfaceC0106) {
            interfaceC0107 = (InterfaceC0106) intConsumer;
        } else {
            C13638.requireNonNull(intConsumer);
            interfaceC0107 = new InterfaceC0106() { // from class: l.᩷֫ᩳ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C19863.m45116(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo1139((Byte) obj);
                }

                @Override // l.InterfaceC0106
                /* JADX INFO: renamed from: ۙ */
                public final void mo1138(byte b) {
                    intConsumer.accept(b);
                }

                @Override // l.InterfaceC0106
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo1139(Byte b) {
                    C19863.m45117((InterfaceC0106) this, b);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C19863.m45115((InterfaceC0106) this, intConsumer2);
                }

                @Override // l.InterfaceC0106
                /* JADX INFO: renamed from: ۙ */
                public final C15630 mo1137(InterfaceC0106 interfaceC0108) {
                    return new C15630(this, interfaceC0108);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC0106.mo1137(interfaceC0107);
    }
}
