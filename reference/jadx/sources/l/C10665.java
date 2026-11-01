package l;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5LJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10665 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26865(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                C2221.m6840(inputStream, bArr, 0, 44);
                inputStream.reset();
                return m26866(new C1788(bArr, 0));
            } catch (EOFException unused) {
                throw new C12746("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26866(AbstractC18119 abstractC18119) {
        int iM22921 = C8804.m22921(abstractC18119);
        if (iM22921 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i = 0; i < 8; i++) {
                sb.append(String.format(" %02x", Byte.valueOf(abstractC18119.mo5855(i))));
            }
            throw new C12746(sb.toString());
        }
        if (C0418.m2176(iM22921) == -1) {
            throw new C5725(String.format("Dex version %03d is not supported", Integer.valueOf(iM22921)));
        }
        int iMo5859 = abstractC18119.mo5859(40);
        if (iMo5859 == 2018915346) {
            throw new C5725("Big endian dex files are not supported");
        }
        if (iMo5859 == 305419896) {
            return iM22921;
        }
        throw new C17014(String.format("Invalid endian tag: 0x%x", Integer.valueOf(iMo5859)));
    }
}
