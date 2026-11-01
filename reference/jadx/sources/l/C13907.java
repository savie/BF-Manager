package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13907 {
    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m33740(InterfaceC11790 interfaceC11790, Consumer consumer) {
        IntConsumer c12708;
        if (consumer instanceof IntConsumer) {
            c12708 = (IntConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c12708 = new C12708(1, consumer);
        }
        return interfaceC11790.tryAdvance(c12708);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33739(InterfaceC11790 interfaceC11790, Consumer consumer) {
        IntConsumer c12708;
        if (consumer instanceof IntConsumer) {
            c12708 = (IntConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c12708 = new C12708(1, consumer);
        }
        interfaceC11790.forEachRemaining(c12708);
    }
}
