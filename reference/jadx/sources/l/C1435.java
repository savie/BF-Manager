package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1QN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1435 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m5011(InterfaceC13431 interfaceC13431) {
        return Integer.valueOf(interfaceC13431.nextInt());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5012(InterfaceC13431 interfaceC13431, Consumer consumer) {
        IntConsumer c12708;
        if (consumer instanceof IntConsumer) {
            c12708 = (IntConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c12708 = new C12708(1, consumer);
        }
        interfaceC13431.forEachRemaining(c12708);
    }
}
