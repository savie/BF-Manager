package l;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes.dex */
public final class C23933 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77485 = C16980.m40037(C23933.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset f77486 = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f77484 = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m53451(String str) {
        return str == null ? new byte[0] : str.getBytes(f77484);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m53455(String str) {
        return str == null ? new byte[0] : str.getBytes(f77486);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m53452(String str, InterfaceC5878 interfaceC5878) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(((C14826) interfaceC5878).m35731());
        } catch (UnsupportedEncodingException e) {
            throw new C3640("Unsupported OEM encoding " + ((C14826) interfaceC5878).m35731(), e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m53453(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, f77486);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m53454(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0) {
                return i3;
            }
            i3 += 2;
        } while (i3 <= i2);
        InterfaceC25186 interfaceC25186 = f77485;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13729("Failed to find string termination with max length " + i2);
            interfaceC25186.mo13721(C6033.m17504(bArr, i, i3));
        }
        throw new C3640("zero termination not found");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53450(byte[] bArr, int i, int i2, InterfaceC5878 interfaceC5878) {
        try {
            return new String(bArr, i, i2, ((C14826) interfaceC5878).m35731());
        } catch (UnsupportedEncodingException e) {
            throw new C3640("Unsupported OEM encoding " + ((C14826) interfaceC5878).m35731(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53449(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new C3640("zero termination not found");
            }
        }
        return i3;
    }
}
