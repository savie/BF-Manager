package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7539 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m20059(byte[] bArr, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStreamM26261 = C10362.m26261(byteArrayOutputStream, 2);
        outputStreamM26261.write(bArr, 0, i);
        outputStreamM26261.flush();
        outputStreamM26261.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m20058(InputStream inputStream) throws IOException {
        InputStream inputStreamM26260 = C10362.m26260(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamM26260.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStreamM26260.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
