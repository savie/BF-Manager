package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AP3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9051 {
    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m23383(InterfaceC10462 interfaceC10462, Consumer consumer) {
        LongConsumer c2699;
        if (consumer instanceof LongConsumer) {
            c2699 = (LongConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c2699 = new C2699(consumer);
        }
        return interfaceC10462.tryAdvance(c2699);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23382(InterfaceC10462 interfaceC10462, Consumer consumer) {
        LongConsumer c2699;
        if (consumer instanceof LongConsumer) {
            c2699 = (LongConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c2699 = new C2699(consumer);
        }
        interfaceC10462.forEachRemaining(c2699);
    }
}
