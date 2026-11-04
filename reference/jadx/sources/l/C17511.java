package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17511 implements DirectoryStream, InterfaceC22091 {
    public final DirectoryStream a;

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C13629.spliteratorUnknownSize(iterator(), 0);
    }

    public C17511(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new C9410(this.a.iterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C4937.forEach(this.a, new C16765(consumer, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
