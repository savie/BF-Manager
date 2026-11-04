package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩻ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4GY */
/* JADX INFO: loaded from: classes.dex */
public final class C25157 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81310;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f81311;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f81312;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f81313;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f81314;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f81315;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f81316;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f81317;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f81318;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f81319;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f81320;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f81321;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f81322;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f81323;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f81324;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f81325;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f81326;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f81327;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f81328;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f81329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f81330;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81331;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81332;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f81333;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f81329.compareTo(((C25157) obj).f81329);
    }

    public C25157(String str, Charset charset) {
        this.f81329 = str;
        this.f81332 = str.getBytes(charset);
        this.f81314 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        byte[] bArr = new byte[0];
        this.f81330 = bArr;
        this.f81325 = bArr;
        this.f81331 = bArr;
        this.f81333 = (int) C17719.m41497(System.currentTimeMillis());
        this.f81316 = str.endsWith("/") || str.endsWith("\\");
        this.f81327 = -1L;
        this.f81312 = -1L;
        m56071(str);
    }

    public C25157(C8002 c8002, Charset charset) {
        String strM21848 = c8002.m21848();
        strM21848 = strM21848 == null ? c8002.getName() : strM21848;
        this.f81329 = strM21848;
        this.f81332 = strM21848.getBytes(charset);
        this.f81314 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        this.f81333 = (int) C17719.m41497(c8002.getTime());
        this.f81321 = c8002.m21826();
        this.f81310 = c8002.m21825();
        this.f81327 = c8002.m21838();
        this.f81312 = c8002.getSize();
        this.f81331 = c8002.m21847() == null ? new byte[0] : c8002.m21847();
        this.f81325 = c8002.m21834() == null ? new byte[0] : c8002.m21834();
        this.f81330 = c8002.m21844() == null ? new byte[0] : c8002.m21844().getBytes(charset);
        this.f81323 = c8002.m21815();
        this.f81318 = c8002.m21814();
        this.f81328 = c8002.m21858();
        this.f81316 = c8002.isDirectory();
        m56071(strM21848);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56071(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                CRC32 crc32 = new CRC32();
                crc32.update(this.f81332);
                int value = (int) crc32.getValue();
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                try {
                    int length2 = bytes.length + 5;
                    byte[] bArr = new byte[length2];
                    boolean z = C17719.f58226;
                    if (1 > length2) {
                        throw new EOFException();
                    }
                    bArr[0] = (byte) 1;
                    if (5 > length2) {
                        throw new EOFException();
                    }
                    C6929.m19210(1, value, bArr);
                    System.arraycopy(bytes, 0, bArr, 5, bytes.length);
                    if (Arrays.equals(this.f81331, this.f81325)) {
                        byte[] bArrM54599 = C24411.m54599(28789, this.f81331, bArr);
                        this.f81325 = bArrM54599;
                        this.f81331 = bArrM54599;
                        return;
                    } else {
                        this.f81331 = C24411.m54599(28789, this.f81331, bArr);
                        this.f81325 = C24411.m54599(28789, this.f81325, bArr);
                        return;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
