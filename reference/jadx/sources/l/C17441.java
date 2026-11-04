package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17441 {
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m40943(InterfaceC15949 interfaceC15949, Consumer consumer) {
        IntConsumer c23190;
        if (consumer instanceof IntConsumer) {
            c23190 = (IntConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23190 = new C23190(consumer);
        }
        return interfaceC15949.tryAdvance(c23190);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40942(InterfaceC15949 interfaceC15949, Consumer consumer) {
        IntConsumer c23190;
        if (consumer instanceof IntConsumer) {
            c23190 = (IntConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23190 = new C23190(consumer);
        }
        interfaceC15949.forEachRemaining(c23190);
    }
}
