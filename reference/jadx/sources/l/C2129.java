package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֫ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2129 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17044 m7329(InterfaceC17044 interfaceC17044) {
        int size = (int) (interfaceC17044.size() % ((long) 4096));
        if (size == 0) {
            return interfaceC17044;
        }
        int i = 4096 - size;
        return new C13315(interfaceC17044, new C15552(new byte[i], 0, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7330(InterfaceC17044 interfaceC17044, MessageDigest messageDigest, long j) {
        interfaceC17044.mo32879(new C11823(messageDigest), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7331(InterfaceC17044 interfaceC17044, C13961 c13961, long j) {
        interfaceC17044.mo32879(new C25250(c13961), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15552 m7328(C16298 c16298) throws IOException {
        long jMo32882 = c16298.mo32882();
        if (jMo32882 > 2147483647L) {
            throw new IOException("Data too large");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo32882);
        c16298.mo32879(byteArrayOutputStream, jMo32882);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C15552(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC17044 m7332(C16298 c16298) {
        long jMo32882 = c16298.mo32882();
        if (jMo32882 > 52428800) {
            return c16298;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo32882);
        c16298.mo32879(byteArrayOutputStream, jMo32882);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C15552(byteArray, 0, byteArray.length);
    }
}
