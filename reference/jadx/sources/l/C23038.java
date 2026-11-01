package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23038 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Character m50970(InterfaceC20921 interfaceC20921) {
        return Character.valueOf(interfaceC20921.mo1416());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50972(InterfaceC15277 interfaceC15277, InterfaceC1164 interfaceC1164) {
        C13638.requireNonNull(interfaceC1164);
        while (interfaceC15277.hasNext()) {
            interfaceC1164.mo4297(interfaceC15277.mo1416());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50971(InterfaceC15277 interfaceC15277, Consumer consumer) {
        InterfaceC1164 c13160;
        if (consumer instanceof InterfaceC1164) {
            c13160 = (InterfaceC1164) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c13160 = new C13160(consumer);
        }
        interfaceC15277.forEachRemaining(c13160);
    }
}
