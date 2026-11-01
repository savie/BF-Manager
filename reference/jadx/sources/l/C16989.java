package l;

import android.net.LocalSocket;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17F */
/* JADX INFO: loaded from: classes4.dex */
public final class C16989 implements InterfaceC16739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f54322 = new AtomicInteger(16777215 & ((int) (System.currentTimeMillis() / 100)));

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LocalSocket f54323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54324;

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ܳܰ */
    public final boolean mo39299() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39777() {
        return C16737.m39293() + "-" + f54322.getAndIncrement();
    }

    public C16989(LocalSocket localSocket) {
        this.f54323 = localSocket;
        try {
            int sendBufferSize = localSocket.getSendBufferSize();
            if (sendBufferSize < 1024 || sendBufferSize > 262144) {
                localSocket.setSendBufferSize(262144);
            }
        } catch (Exception unused) {
        }
        FileDescriptor fileDescriptor = localSocket.getFileDescriptor();
        int i = -1;
        if (fileDescriptor != null) {
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                i = declaredField.getInt(fileDescriptor);
            } catch (Exception unused2) {
            }
        }
        this.f54324 = i;
    }

    @Override // l.InterfaceC16739
    public final InputStream getInputStream() {
        return this.f54323.getInputStream();
    }

    @Override // l.InterfaceC16739
    public final OutputStream getOutputStream() {
        return this.f54323.getOutputStream();
    }

    @Override // l.InterfaceC16739
    public final int getSendBufferSize() {
        return Math.min(this.f54323.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo39298() {
        return this.f54324 >= 0;
    }

    @Override // l.InterfaceC16739
    /* JADX INFO: renamed from: ᩴۙ */
    public final int mo39300() {
        return this.f54324;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f54323.close();
    }
}
