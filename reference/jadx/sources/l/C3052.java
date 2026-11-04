package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3052 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9926(InterfaceC1340 interfaceC1340, Consumer consumer) {
        C17359.requireNonNull(consumer);
        interfaceC1340.forEach(consumer instanceof IntConsumer ? (IntConsumer) consumer : new C23190(consumer));
    }
}
