package l;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10933 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f37176 = C13488.m32997(C10933.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Charset f37177 = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f37175 = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m27417(String str) {
        return str == null ? new byte[0] : str.getBytes(f37175);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m27421(String str) {
        return str == null ? new byte[0] : str.getBytes(f37177);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m27418(String str, InterfaceC10601 interfaceC10601) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(((C9895) interfaceC10601).m25073());
        } catch (UnsupportedEncodingException e) {
            throw new C17655("Unsupported OEM encoding " + ((C9895) interfaceC10601).m25073(), e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m27419(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, f37177);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m27420(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0) {
                return i3;
            }
            i3 += 2;
        } while (i3 <= i2);
        InterfaceC4314 interfaceC4314 = f37176;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12116("Failed to find string termination with max length " + i2);
            interfaceC4314.mo12135(C5993.m16281(bArr, i, i3));
        }
        throw new C17655("zero termination not found");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27416(byte[] bArr, int i, int i2, InterfaceC10601 interfaceC10601) {
        try {
            return new String(bArr, i, i2, ((C9895) interfaceC10601).m25073());
        } catch (UnsupportedEncodingException e) {
            throw new C17655("Unsupported OEM encoding " + ((C9895) interfaceC10601).m25073(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27415(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new C17655("zero termination not found");
            }
        }
        return i3;
    }
}
