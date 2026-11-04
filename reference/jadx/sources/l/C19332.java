package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19332 implements Closeable {
    public final boolean a;
    public final EnumC20599[] b;
    public final int c;
    public final ArrayDeque d = new ArrayDeque();
    public boolean e;

    public C19332(Collection collection, int i) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (AbstractC6654.a[((EnumC17615) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.a = z;
        this.b = z ? new EnumC20599[0] : new EnumC20599[]{EnumC20599.NOFOLLOW_LINKS};
        this.c = i;
    }

    public final InterfaceC8665 b(InterfaceC24329 interfaceC24329) throws IOException {
        try {
            return C3445.readAttributes(interfaceC24329, InterfaceC8665.class, this.b);
        } catch (IOException e) {
            if (this.a) {
                return C3445.readAttributes(interfaceC24329, InterfaceC8665.class, EnumC20599.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final C21570 e(InterfaceC24329 interfaceC24329, boolean z) {
        try {
            InterfaceC8665 interfaceC8665B = b(interfaceC24329);
            if (this.d.size() >= this.c || !interfaceC8665B.isDirectory()) {
                return new C21570(EnumC0687.ENTRY, interfaceC24329, interfaceC8665B, null);
            }
            if (this.a) {
                Object objFileKey = interfaceC8665B.fileKey();
                for (C4416 c4416 : this.d) {
                    Object obj = c4416.b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C21570(EnumC0687.ENTRY, interfaceC24329, null, new FileSystemLoopException(interfaceC24329.toString()));
                        }
                    } else {
                        try {
                            if (C3445.isSameFile(interfaceC24329, c4416.a)) {
                                return new C21570(EnumC0687.ENTRY, interfaceC24329, null, new FileSystemLoopException(interfaceC24329.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                        }
                    }
                }
            }
            try {
                this.d.push(new C4416(interfaceC24329, interfaceC8665B.fileKey(), C3445.newDirectoryStream(interfaceC24329)));
                return new C21570(EnumC0687.START_DIRECTORY, interfaceC24329, interfaceC8665B, null);
            } catch (IOException e) {
                return new C21570(EnumC0687.ENTRY, interfaceC24329, null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new C21570(EnumC0687.ENTRY, interfaceC24329, null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    public final C21570 d() {
        InterfaceC24329 interfaceC24329;
        IOException cause;
        C21570 c21570E;
        C4416 c4416 = (C4416) this.d.peek();
        if (c4416 == null) {
            return null;
        }
        do {
            if (c4416.e) {
                interfaceC24329 = null;
                cause = null;
            } else {
                Iterator it = c4416.d;
                try {
                    interfaceC24329 = it.hasNext() ? (InterfaceC24329) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    interfaceC24329 = null;
                }
            }
            if (interfaceC24329 == null) {
                try {
                    c4416.c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.d.pop();
                return new C21570(EnumC0687.END_DIRECTORY, c4416.a, null, cause);
            }
            c21570E = e(interfaceC24329, true);
        } while (c21570E == null);
        return c21570E;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        while (!this.d.isEmpty()) {
            if (!this.d.isEmpty()) {
                try {
                    ((C4416) this.d.pop()).c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.e = true;
    }
}
