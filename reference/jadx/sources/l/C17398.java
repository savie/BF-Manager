package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17398 {
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m40862(InterfaceC15906 interfaceC15906, Consumer consumer) {
        InterfaceC0419 c7877;
        if (consumer instanceof InterfaceC0419) {
            c7877 = (InterfaceC0419) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c7877 = new C7877(consumer);
        }
        return interfaceC15906.tryAdvance((Object) c7877);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40861(InterfaceC15906 interfaceC15906, Consumer consumer) {
        InterfaceC0419 c7877;
        if (consumer instanceof InterfaceC0419) {
            c7877 = (InterfaceC0419) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c7877 = new C7877(consumer);
        }
        interfaceC15906.forEachRemaining((Object) c7877);
    }
}
