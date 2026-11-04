package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֨ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AP3 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1099 {
    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m4101(InterfaceC9301 interfaceC9301, Consumer consumer) {
        LongConsumer c23474;
        if (consumer instanceof LongConsumer) {
            c23474 = (LongConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23474 = new C23474(consumer);
        }
        return interfaceC9301.tryAdvance(c23474);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4100(InterfaceC9301 interfaceC9301, Consumer consumer) {
        LongConsumer c23474;
        if (consumer instanceof LongConsumer) {
            c23474 = (LongConsumer) consumer;
        } else {
            C17359.requireNonNull(consumer);
            c23474 = new C23474(consumer);
        }
        interfaceC9301.forEachRemaining(c23474);
    }
}
