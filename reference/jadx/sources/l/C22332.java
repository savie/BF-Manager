package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22332 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49498(InterfaceC1164 interfaceC1164, int i) {
        interfaceC1164.mo4297(C21273.m47738(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49499(InterfaceC1164 interfaceC1164, Character ch) {
        interfaceC1164.mo4297(ch.charValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1164 m49497(InterfaceC1164 interfaceC1164, final IntConsumer intConsumer) {
        InterfaceC1164 interfaceC1165;
        if (intConsumer instanceof InterfaceC1164) {
            interfaceC1165 = (InterfaceC1164) intConsumer;
        } else {
            C13638.requireNonNull(intConsumer);
            interfaceC1165 = new InterfaceC1164() { // from class: l.ۖܰᩴ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C22332.m49498(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo4298((Character) obj);
                }

                @Override // l.InterfaceC1164
                /* JADX INFO: renamed from: ۨ */
                public final void mo4297(char c) {
                    intConsumer.accept(c);
                }

                @Override // l.InterfaceC1164
                /* JADX INFO: renamed from: ܰ */
                public final /* synthetic */ void mo4298(Character ch) {
                    C22332.m49499((InterfaceC1164) this, ch);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C22332.m49497((InterfaceC1164) this, intConsumer2);
                }

                @Override // l.InterfaceC1164
                /* JADX INFO: renamed from: ۨ */
                public final C5398 mo4296(InterfaceC1164 interfaceC1166) {
                    return new C5398(this, interfaceC1166);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC1164.mo4296(interfaceC1165);
    }
}
