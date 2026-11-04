package l;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻ܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5LJ */
/* JADX INFO: loaded from: classes.dex */
public final class C25128 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55997(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                C5020.m15247(inputStream, bArr, 0, 44);
                inputStream.reset();
                return m55998(new C3674(bArr, 0));
            } catch (EOFException unused) {
                throw new C11548("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55998(AbstractC2599 abstractC2599) {
        int iM15173 = C4968.m15173(abstractC2599);
        if (iM15173 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i = 0; i < 8; i++) {
                sb.append(String.format(" %02x", Byte.valueOf(abstractC2599.mo8717(i))));
            }
            throw new C11548(sb.toString());
        }
        if (C18856.m43755(iM15173) == -1) {
            throw new C11701(String.format("Dex version %03d is not supported", Integer.valueOf(iM15173)));
        }
        int iMo8725 = abstractC2599.mo8725(40);
        if (iMo8725 == 2018915346) {
            throw new C11701("Big endian dex files are not supported");
        }
        if (iMo8725 == 305419896) {
            return iM15173;
        }
        throw new C2007(String.format("Invalid endian tag: 0x%x", Integer.valueOf(iMo8725)));
    }
}
