package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C6L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14326 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Character m34752(InterfaceC8360 interfaceC8360) {
        return Character.valueOf(interfaceC8360.mo5320());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34754(InterfaceC21040 interfaceC21040, InterfaceC12089 interfaceC12089) {
        C17359.requireNonNull(interfaceC12089);
        while (interfaceC21040.hasNext()) {
            interfaceC12089.mo10258(interfaceC21040.mo5320());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34753(InterfaceC21040 interfaceC21040, Consumer consumer) {
        InterfaceC12089 c6124;
        if (consumer instanceof InterfaceC12089) {
            c6124 = (InterfaceC12089) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c6124 = new C6124(consumer);
        }
        interfaceC21040.forEachRemaining(c6124);
    }
}
