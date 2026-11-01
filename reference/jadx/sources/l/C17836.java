package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩳۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17836 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19248 m41421(InterfaceC19248 interfaceC19248) {
        int size = (int) (interfaceC19248.size() % ((long) 4096));
        if (size == 0) {
            return interfaceC19248;
        }
        int i = 4096 - size;
        return new C15015(interfaceC19248, new C22776(new byte[i], 0, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41423(InterfaceC19248 interfaceC19248, MessageDigest messageDigest, long j) {
        interfaceC19248.mo25492(new C18542(messageDigest), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41424(InterfaceC19248 interfaceC19248, C1388 c1388, long j) {
        interfaceC19248.mo25492(new C7959(c1388), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22776 m41422(C10076 c10076) throws IOException {
        long jMo25495 = c10076.mo25495();
        if (jMo25495 > 2147483647L) {
            throw new IOException("Data too large");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo25495);
        c10076.mo25492(byteArrayOutputStream, jMo25495);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C22776(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19248 m41425(C10076 c10076) {
        long jMo25495 = c10076.mo25495();
        if (jMo25495 > 52428800) {
            return c10076;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo25495);
        c10076.mo25492(byteArrayOutputStream, jMo25495);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C22776(byteArray, 0, byteArray.length);
    }
}
