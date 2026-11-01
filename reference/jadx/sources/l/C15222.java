package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6TK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15222 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11018 m36468(C8996 c8996) {
        C11018 c11018 = new C11018(128);
        c11018.writeInt(2);
        c11018.writeInt(c8996.m23305().ordinal());
        c11018.writeInt(c8996.m23295().ordinal());
        c11018.writeInt(c8996.m23307() == null ? 0 : 1);
        c11018.writeInt(c8996.m23297());
        c11018.m27791(c8996.m23296());
        c11018.m27791(c8996.m23304());
        c11018.writeInt(c8996.m23306());
        c11018.writeInt(c8996.m23294() ? 1 : 0);
        byte[] bArrM23303 = c8996.m23303();
        c11018.write(bArrM23303, 0, bArrM23303.length);
        m36469(c11018, c8996.m23302());
        if (c8996.m23307() != null) {
            m36469(c11018, c8996.m23307().m32728());
            m36469(c11018, c8996.m23307().m32729());
            c11018.m27791(c8996.m23307().m32727());
            c11018.writeInt(c8996.m23307().m32726() ? 1 : 0);
        }
        if (c11018.size() <= 4096) {
            return c11018;
        }
        throw new IllegalArgumentException("Load checkpoint exceeds record limit");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8996 m36467(byte[] bArr) throws IOException {
        if (bArr.length > 4096) {
            throw new IOException("Load checkpoint exceeds record limit");
        }
        try {
            C17367 c17367 = new C17367(bArr);
            if (c17367.readInt() != 2) {
                throw new IOException("Unsupported load checkpoint version");
            }
            int i = c17367.readInt();
            int i2 = c17367.readInt();
            if (i < 0 || i >= EnumC19579.values().length || i2 < 0 || i2 >= EnumC8290.values().length) {
                throw new IOException("Invalid load checkpoint status");
            }
            boolean zM36470 = m36470(c17367);
            int i3 = c17367.readInt();
            long j = c17367.readLong();
            long j2 = c17367.readLong();
            int i4 = c17367.readInt();
            boolean zM36471 = m36470(c17367);
            byte[] bArr2 = new byte[32];
            c17367.m40446(32, bArr2);
            String strM36466 = m36466(c17367, 80);
            C13250 c13250 = zM36470 ? new C13250(m36466(c17367, 1024), m36466(c17367, 512), c17367.readLong(), m36470(c17367)) : null;
            if (c17367.available() != 0) {
                throw new IOException("Trailing load checkpoint bytes");
            }
            return new C8996(EnumC19579.values()[i], EnumC8290.values()[i2], c13250, strM36466, i3, j, j2, bArr2, i4, zM36471);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new IOException("Invalid load checkpoint", e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new IOException("Invalid load checkpoint", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36470(C17367 c17367) throws IOException {
        int i = c17367.readInt();
        if (i == 0 || i == 1) {
            return i == 1;
        }
        throw new IOException("Invalid load checkpoint flag");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36469(C11018 c11018, String str) {
        c11018.writeInt(str.length());
        for (int i = 0; i < str.length(); i++) {
            c11018.mo24505((short) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36466(C17367 c17367, int i) throws IOException {
        int i2 = c17367.readInt();
        if (i2 < 0 || i2 > i || i2 > c17367.available() / 2) {
            throw new IOException("Invalid load checkpoint string length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) c17367.readShort();
        }
        return new String(cArr);
    }
}
