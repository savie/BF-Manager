package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17495 {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC6206) {
            ((InterfaceC6206) it).forEachRemaining(consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
