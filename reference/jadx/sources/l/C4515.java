package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4515 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14240(byte[] bArr, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStreamM55008 = C24653.m55008(byteArrayOutputStream, 2);
        outputStreamM55008.write(bArr, 0, i);
        outputStreamM55008.flush();
        outputStreamM55008.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14239(InputStream inputStream) throws IOException {
        InputStream inputStreamM55007 = C24653.m55007(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamM55007.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStreamM55007.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
