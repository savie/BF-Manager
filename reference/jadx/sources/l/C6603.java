package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6603 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f22225 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17906(int i, byte[] bArr) {
        if (i < 6) {
            return false;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (bArr[i2] != f22225[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m17905(InterfaceC7739 interfaceC7739) throws IOException {
        long length = interfaceC7739.length();
        if (length < 12) {
            throw new IOException("File too small to be a valid XZ file");
        }
        long j = length - 12;
        interfaceC7739.seek(j);
        byte[] bArr = new byte[12];
        interfaceC7739.readFully(bArr);
        interfaceC7739.seek(j - C20894.m47002(bArr).f65534);
        if (interfaceC7739.readByte() != 0) {
            throw new IOException("Invalid XZ index indicator");
        }
        C3780 c3780 = new C3780(interfaceC7739);
        long jM47000 = C20894.m47000(c3780);
        long jM47001 = 0;
        for (int i = 0; i < jM47000; i++) {
            C20894.m47000(c3780);
            jM47001 += C20894.m47000(c3780);
        }
        return jM47001;
    }
}
