package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22581 {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC19597) {
            ((InterfaceC19597) it).forEachRemaining(consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
