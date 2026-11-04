package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܰۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14556 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45862 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Logger f45863 = Logger.getLogger(C14556.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25000 m35108(InterfaceC13810 interfaceC13810) {
        return new C1133(interfaceC13810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11573 m35106(InterfaceC7099 interfaceC7099) {
        return new C19032(interfaceC7099);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m35105(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C4116 c4116 = new C4116(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new C10827(c4116, new C12319(c4116, outputStream));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13810 m35107(InputStream inputStream) {
        C22411 c22411 = new C22411();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C6354(c22411, inputStream);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m35109(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C12319(new C22411(), new FileOutputStream(file));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m35104(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return new C12319(new C22411(), new FileOutputStream(file, true));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m35103() {
        return new C24254();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC13810 m35110(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C4116 c4116 = new C4116(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new C22762(c4116, new C6354(c4116, inputStream));
    }
}
