package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBZW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22456 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49957(InterfaceC1288 interfaceC1288, Consumer consumer) {
        LongConsumer c2699;
        if (consumer instanceof LongConsumer) {
            c2699 = (LongConsumer) consumer;
        } else {
            C13638.requireNonNull(consumer);
            c2699 = new C2699(consumer);
        }
        interfaceC1288.forEachRemaining(c2699);
    }
}
