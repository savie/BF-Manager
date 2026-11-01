package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6124 extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC6124 onClose(Runnable runnable);

    InterfaceC6124 parallel();

    InterfaceC6124 sequential();

    InterfaceC20693 spliterator();

    InterfaceC6124 unordered();
}
