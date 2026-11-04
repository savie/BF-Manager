package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21030 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f67202 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48048(int i, byte[] bArr) {
        if (i < 6) {
            return false;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (bArr[i2] != f67202[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m48047(InterfaceC17713 interfaceC17713) throws IOException {
        long length = interfaceC17713.length();
        if (length < 12) {
            throw new IOException("File too small to be a valid XZ file");
        }
        long j = length - 12;
        interfaceC17713.seek(j);
        byte[] bArr = new byte[12];
        interfaceC17713.readFully(bArr);
        interfaceC17713.seek(j - C8732.m23414(bArr).f44254);
        if (interfaceC17713.readByte() != 0) {
            throw new IOException("Invalid XZ index indicator");
        }
        C14316 c14316 = new C14316(interfaceC17713);
        long jM23412 = C8732.m23412(c14316);
        long jM23413 = 0;
        for (int i = 0; i < jM23412; i++) {
            C8732.m23412(c14316);
            jM23413 += C8732.m23412(c14316);
        }
        return jM23413;
    }
}
