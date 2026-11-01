package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.֨ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0834 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3466 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Logger f3467 = Logger.getLogger(C0834.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23683 m3437(InterfaceC10008 interfaceC10008) {
        return new C17768(interfaceC10008);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10983 m3436(InterfaceC8597 interfaceC8597) {
        return new C14947(interfaceC8597);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8597 m3434(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C22002 c22002 = new C22002(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new C15922(c22002, new C11419(c22002, outputStream));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10008 m3435(InputStream inputStream) {
        C20591 c20591 = new C20591();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C2245(c20591, inputStream);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8597 m3438(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C11419(new C20591(), new FileOutputStream(file));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8597 m3433(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C11419(new C20591(), new FileOutputStream(file, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8597 m3432() {
        return new C5068();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10008 m3439(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C22002 c22002 = new C22002(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C20155(c22002, new C2245(c22002, inputStream));
    }
}
