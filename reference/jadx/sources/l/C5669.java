package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5669 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15559(InterfaceC10131 interfaceC10131, Consumer consumer) {
        C13638.requireNonNull(consumer);
        interfaceC10131.forEach(consumer instanceof IntConsumer ? (IntConsumer) consumer : new C12708(1, consumer));
    }
}
