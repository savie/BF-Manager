package l;

import android.net.LocalSocket;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩳ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17F */
/* JADX INFO: loaded from: classes5.dex */
public final class C18929 implements InterfaceC14759 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f61409 = new AtomicInteger(16777215 & ((int) (System.currentTimeMillis() / 100)));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LocalSocket f61410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61411;

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ۖ᩷ */
    public final boolean mo35490() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43957() {
        return C21576.m49092() + "-" + f61409.getAndIncrement();
    }

    public C18929(LocalSocket localSocket) {
        this.f61410 = localSocket;
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
        this.f61411 = i;
    }

    @Override // l.InterfaceC14759
    public final InputStream getInputStream() {
        return this.f61410.getInputStream();
    }

    @Override // l.InterfaceC14759
    public final OutputStream getOutputStream() {
        return this.f61410.getOutputStream();
    }

    @Override // l.InterfaceC14759
    public final int getSendBufferSize() {
        return Math.min(this.f61410.getSendBufferSize(), 262144);
    }

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo35492() {
        return this.f61411 >= 0;
    }

    @Override // l.InterfaceC14759
    /* JADX INFO: renamed from: ᩹ۙ */
    public final int mo35491() {
        return this.f61411;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f61410.close();
    }
}
