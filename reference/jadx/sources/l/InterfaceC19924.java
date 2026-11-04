package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19924 extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC19924 onClose(Runnable runnable);

    InterfaceC19924 parallel();

    InterfaceC19924 sequential();

    InterfaceC8409 spliterator();

    InterfaceC19924 unordered();
}
