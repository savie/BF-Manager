package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6TK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20752 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6178 m47459(C21170 c21170) {
        C6178 c6178 = new C6178(128);
        c6178.writeInt(2);
        c6178.writeInt(c21170.m48299().ordinal());
        c6178.writeInt(c21170.m48302().ordinal());
        c6178.writeInt(c21170.m48303() == null ? 0 : 1);
        c6178.writeInt(c21170.m48291());
        c6178.m17803(c21170.m48290());
        c6178.m17803(c21170.m48301());
        c6178.writeInt(c21170.m48298());
        c6178.writeInt(c21170.m48297() ? 1 : 0);
        byte[] bArrM48294 = c21170.m48294();
        c6178.write(bArrM48294, 0, bArrM48294.length);
        m47461(c6178, c21170.m48295());
        if (c21170.m48303() != null) {
            m47461(c6178, c21170.m48303().m38145());
            m47461(c6178, c21170.m48303().m38144());
            c6178.m17803(c21170.m48303().m38142());
            c6178.writeInt(c21170.m48303().m38143() ? 1 : 0);
        }
        if (c6178.size() <= 4096) {
            return c6178;
        }
        throw new IllegalArgumentException("Load checkpoint exceeds record limit");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21170 m47460(byte[] bArr) throws IOException {
        if (bArr.length > 4096) {
            throw new IOException("Load checkpoint exceeds record limit");
        }
        try {
            C20348 c20348 = new C20348(bArr);
            if (c20348.readInt() != 2) {
                throw new IOException("Unsupported load checkpoint version");
            }
            int i = c20348.readInt();
            int i2 = c20348.readInt();
            if (i < 0 || i >= EnumC14456.values().length || i2 < 0 || i2 >= EnumC4016.values().length) {
                throw new IOException("Invalid load checkpoint status");
            }
            boolean zM47462 = m47462(c20348);
            int i3 = c20348.readInt();
            long j = c20348.readLong();
            long j2 = c20348.readLong();
            int i4 = c20348.readInt();
            boolean zM47463 = m47462(c20348);
            byte[] bArr2 = new byte[32];
            c20348.m46745(32, bArr2);
            String strM47458 = m47458(c20348, 80);
            C16013 c16013 = zM47462 ? new C16013(m47458(c20348, 1024), m47458(c20348, 512), c20348.readLong(), m47462(c20348)) : null;
            if (c20348.available() != 0) {
                throw new IOException("Trailing load checkpoint bytes");
            }
            return new C21170(EnumC14456.values()[i], EnumC4016.values()[i2], c16013, strM47458, i3, j, j2, bArr2, i4, zM47463);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new IOException("Invalid load checkpoint", e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new IOException("Invalid load checkpoint", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47462(C20348 c20348) throws IOException {
        int i = c20348.readInt();
        if (i == 0 || i == 1) {
            return i == 1;
        }
        throw new IOException("Invalid load checkpoint flag");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47461(C6178 c6178, String str) {
        c6178.writeInt(str.length());
        for (int i = 0; i < str.length(); i++) {
            c6178.mo17788((short) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47458(C20348 c20348, int i) throws IOException {
        int i2 = c20348.readInt();
        if (i2 < 0 || i2 > i || i2 > c20348.available() / 2) {
            throw new IOException("Invalid load checkpoint string length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) c20348.readShort();
        }
        return new String(cArr);
    }
}
