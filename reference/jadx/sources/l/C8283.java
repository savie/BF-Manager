package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8283 implements Closeable {
    public final boolean a;
    public final EnumC22146[] b;
    public final int c;
    public final ArrayDeque d = new ArrayDeque();
    public boolean e;

    public C8283(Collection collection, int i) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (AbstractC13222.a[((EnumC13680) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        if (i < 0) {
            throw new IllegalArgumentException("'maxDepth' is negative");
        }
        this.a = z;
        this.b = z ? new EnumC22146[0] : new EnumC22146[]{EnumC22146.NOFOLLOW_LINKS};
        this.c = i;
    }

    public final InterfaceC20735 b(InterfaceC3800 interfaceC3800) throws IOException {
        try {
            return C5212.readAttributes(interfaceC3800, InterfaceC20735.class, this.b);
        } catch (IOException e) {
            if (this.a) {
                return C5212.readAttributes(interfaceC3800, InterfaceC20735.class, EnumC22146.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final C15339 e(InterfaceC3800 interfaceC3800, boolean z) {
        try {
            InterfaceC20735 interfaceC20735B = b(interfaceC3800);
            if (this.d.size() >= this.c || !interfaceC20735B.isDirectory()) {
                return new C15339(EnumC18160.ENTRY, interfaceC3800, interfaceC20735B, null);
            }
            if (this.a) {
                Object objFileKey = interfaceC20735B.fileKey();
                for (C6871 c6871 : this.d) {
                    Object obj = c6871.b;
                    if (objFileKey != null && obj != null) {
                        if (objFileKey.equals(obj)) {
                            return new C15339(EnumC18160.ENTRY, interfaceC3800, null, new FileSystemLoopException(interfaceC3800.toString()));
                        }
                    } else {
                        try {
                            if (C5212.isSameFile(interfaceC3800, c6871.a)) {
                                return new C15339(EnumC18160.ENTRY, interfaceC3800, null, new FileSystemLoopException(interfaceC3800.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                        }
                    }
                }
            }
            try {
                this.d.push(new C6871(interfaceC3800, interfaceC20735B.fileKey(), C5212.newDirectoryStream(interfaceC3800)));
                return new C15339(EnumC18160.START_DIRECTORY, interfaceC3800, interfaceC20735B, null);
            } catch (IOException e) {
                return new C15339(EnumC18160.ENTRY, interfaceC3800, null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new C15339(EnumC18160.ENTRY, interfaceC3800, null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    public final C15339 d() {
        InterfaceC3800 interfaceC3800;
        IOException cause;
        C15339 c15339E;
        C6871 c6871 = (C6871) this.d.peek();
        if (c6871 == null) {
            return null;
        }
        do {
            if (c6871.e) {
                interfaceC3800 = null;
                cause = null;
            } else {
                Iterator it = c6871.d;
                try {
                    interfaceC3800 = it.hasNext() ? (InterfaceC3800) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    interfaceC3800 = null;
                }
            }
            if (interfaceC3800 == null) {
                try {
                    c6871.c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.d.pop();
                return new C15339(EnumC18160.END_DIRECTORY, c6871.a, null, cause);
            }
            c15339E = e(interfaceC3800, true);
        } while (c15339E == null);
        return c15339E;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        while (!this.d.isEmpty()) {
            if (!this.d.isEmpty()) {
                try {
                    ((C6871) this.d.pop()).c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.e = true;
    }
}
