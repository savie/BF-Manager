package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20824 implements Iterator, Closeable {
    public final C19332 a;
    public C21570 b;

    public C20824(InterfaceC24329 interfaceC24329, EnumC17615... enumC17615Arr) throws IOException {
        C19332 c19332 = new C19332(Arrays.asList(enumC17615Arr), Integer.MAX_VALUE);
        this.a = c19332;
        if (c19332.e) {
            throw new IllegalStateException("Closed");
        }
        C21570 c21570E = c19332.e(interfaceC24329, false);
        this.b = c21570E;
        IOException iOException = c21570E.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void b() {
        if (this.b == null) {
            C21570 c21570D = this.a.d();
            while (c21570D != null) {
                IOException iOException = c21570D.d;
                if (iOException != null) {
                    throw new UncheckedIOException(iOException);
                }
                if (c21570D.a != EnumC0687.END_DIRECTORY) {
                    this.b = c21570D;
                    return;
                }
                c21570D = this.a.d();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.e) {
            throw new IllegalStateException();
        }
        b();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a.e) {
            throw new IllegalStateException();
        }
        b();
        C21570 c21570 = this.b;
        if (c21570 == null) {
            throw new NoSuchElementException();
        }
        this.b = null;
        return c21570;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
