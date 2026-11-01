package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22394 implements Iterator, Closeable {
    public final C8283 a;
    public C15339 b;

    public C22394(InterfaceC3800 interfaceC3800, EnumC13680... enumC13680Arr) throws IOException {
        C8283 c8283 = new C8283(Arrays.asList(enumC13680Arr), Integer.MAX_VALUE);
        this.a = c8283;
        if (c8283.e) {
            throw new IllegalStateException("Closed");
        }
        C15339 c15339E = c8283.e(interfaceC3800, false);
        this.b = c15339E;
        IOException iOException = c15339E.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void b() {
        if (this.b == null) {
            C15339 c15339D = this.a.d();
            while (c15339D != null) {
                IOException iOException = c15339D.d;
                if (iOException != null) {
                    throw new UncheckedIOException(iOException);
                }
                if (c15339D.a != EnumC18160.END_DIRECTORY) {
                    this.b = c15339D;
                    return;
                }
                c15339D = this.a.d();
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
        C15339 c15339 = this.b;
        if (c15339 == null) {
            throw new NoSuchElementException();
        }
        this.b = null;
        return c15339;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
