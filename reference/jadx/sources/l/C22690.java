package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩺֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M4GY */
/* JADX INFO: loaded from: classes.dex */
public final class C22690 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f73885;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f73886;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f73887;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public byte[] f73888;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f73889;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f73890;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f73891;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f73892;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f73893;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f73894;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f73895;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f73896;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f73897;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f73898;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73899;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f73900;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f73901;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f73902;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73903;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f73905;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73906;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f73907;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f73908;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f73892.compareTo(((C22690) obj).f73892);
    }

    public C22690(String str, Charset charset) {
        this.f73892 = str;
        this.f73888 = str.getBytes(charset);
        this.f73891 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        byte[] bArr = new byte[0];
        this.f73905 = bArr;
        this.f73902 = bArr;
        this.f73900 = bArr;
        this.f73907 = (int) C21506.m48153(System.currentTimeMillis());
        this.f73895 = str.endsWith("/") || str.endsWith("\\");
        this.f73885 = -1L;
        this.f73890 = -1L;
        m50251(str);
    }

    public C22690(C12107 c12107, Charset charset) {
        String strM30135 = c12107.m30135();
        strM30135 = strM30135 == null ? c12107.getName() : strM30135;
        this.f73892 = strM30135;
        this.f73888 = strM30135.getBytes(charset);
        this.f73891 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        this.f73907 = (int) C21506.m48153(c12107.getTime());
        this.f73897 = c12107.m30119();
        this.f73903 = c12107.m30126();
        this.f73885 = c12107.m30138();
        this.f73890 = c12107.getSize();
        this.f73900 = c12107.m30134() == null ? new byte[0] : c12107.m30134();
        this.f73902 = c12107.m30098() == null ? new byte[0] : c12107.m30098();
        this.f73905 = c12107.m30110() == null ? new byte[0] : c12107.m30110().getBytes(charset);
        this.f73886 = c12107.m30136();
        this.f73887 = c12107.m30116();
        this.f73904 = c12107.m30140();
        this.f73895 = c12107.isDirectory();
        m50251(strM30135);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50251(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                CRC32 crc32 = new CRC32();
                crc32.update(this.f73888);
                int value = (int) crc32.getValue();
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                try {
                    int length2 = bytes.length + 5;
                    byte[] bArr = new byte[length2];
                    boolean z = C21506.f69876;
                    if (1 > length2) {
                        throw new EOFException();
                    }
                    bArr[0] = (byte) 1;
                    if (5 > length2) {
                        throw new EOFException();
                    }
                    C15157.m36338(1, value, bArr);
                    System.arraycopy(bytes, 0, bArr, 5, bytes.length);
                    if (Arrays.equals(this.f73900, this.f73902)) {
                        byte[] bArrM19089 = C7167.m19089(28789, this.f73900, bArr);
                        this.f73902 = bArrM19089;
                        this.f73900 = bArrM19089;
                        return;
                    } else {
                        this.f73900 = C7167.m19089(28789, this.f73900, bArr);
                        this.f73902 = C7167.m19089(28789, this.f73902, bArr);
                        return;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
