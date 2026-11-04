package l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/* JADX INFO: renamed from: l.ۤۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L7F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10610 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f33687;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f33688;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f33689;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Socket f33690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final OutputStream f33691;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f33689) {
            return;
        }
        this.f33689 = true;
        try {
            this.f33691.flush();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            try {
                if (m27093()) {
                    this.f33687 = true;
                } else if (!this.f33688) {
                    this.f33688 = true;
                    this.f33690.close();
                }
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            try {
                if (!this.f33688) {
                    this.f33688 = true;
                    this.f33690.close();
                }
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
        }
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m27094() {
        if (this.f33687) {
            this.f33687 = false;
            if (!this.f33688) {
                this.f33688 = true;
                this.f33690.close();
            }
        }
    }

    public C10610(Socket socket, OutputStream outputStream) {
        this.f33690 = socket;
        this.f33691 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f33691.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i > bArr.length || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, 16384);
            this.f33691.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f33691.flush();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m27093() {
        Socket socket = this.f33690;
        try {
            String str = "engine";
            for (Class<?> superclass = socket.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(socket);
                    Method method = obj.getClass().getMethod("closeOutbound", null);
                    method.invoke(obj, null);
                    for (Class<?> superclass2 = socket.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                        try {
                            Method declaredMethod = superclass2.getDeclaredMethod("drainOutgoingQueue", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(socket, null);
                            method.invoke(obj, null);
                            return true;
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    throw new NoSuchMethodException("drainOutgoingQueue");
                } catch (NoSuchFieldException unused2) {
                }
            }
            throw new NoSuchFieldException(str);
        } catch (ReflectiveOperationException unused3) {
            return false;
        }
    }
}
