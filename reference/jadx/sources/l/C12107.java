package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۫֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 466O */
/* JADX INFO: loaded from: classes3.dex */
public final class C12107 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f40489;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f40491;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f40492;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12107 f40493;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f40494;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public byte[] f40496;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f40497;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f40500;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f40501;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f40503;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7167 f40505;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f40506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f40508;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f40509;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f40490 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f40507 = -1;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public long f40502 = -1;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f40495 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40504 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f40498 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f40499 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f40510 = -1;

    public C12107() {
    }

    public C12107(String str) {
        m30128(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30136() {
        return this.f40490;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30100(int i) {
        this.f40490 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30120() {
        return (this.f40491 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m30131() {
        return this.f40491;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30111(int i) {
        this.f40491 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m30119() {
        return this.f40500;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m30094(int i) {
        this.f40500 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30133() {
        return (this.f40491 & 1) != 0;
    }

    public final long getTime() {
        return this.f40494;
    }

    public final void setTime(long j) {
        this.f40494 = j;
        m30091();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m30126() {
        return this.f40497;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long m30113() {
        return ((long) this.f40497) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30102(int i) {
        this.f40497 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m30138() {
        return this.f40507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30103(long j) {
        this.f40507 = j;
    }

    public final long getSize() {
        return this.f40502;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30096(long j) {
        this.f40502 = j;
    }

    public final String getName() {
        return this.f40492;
    }

    public final boolean isDirectory() {
        return this.f40492.endsWith("/");
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m30135() {
        String str = this.f40509;
        return str == null ? this.f40492 : str;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m30115() {
        return this.f40492.replaceAll("[:\\\\*?<>\"|]", "_").replaceAll("\\s", " ");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30128(String str) {
        if (str == null) {
            str = "";
        }
        this.f40492 = str;
        this.f40509 = null;
        m30091();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m30110() {
        return this.f40506;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30104(String str) {
        this.f40506 = str;
        m30091();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30108(C20573 c20573) {
        this.f40503 = C7167.m19089(19796, this.f40503, c20573.m46418());
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20573 m30117() {
        C7167 c7167M19088 = C7167.m19088(19796, this.f40503);
        if (c7167M19088 == null) {
            return null;
        }
        C20573 c20573 = new C20573();
        c20573.m46417(c7167M19088.m19094());
        return c20573;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final byte[] m30134() {
        return this.f40503;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m30098() {
        return this.f40508;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30124(byte[] bArr) {
        this.f40503 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30109(byte[] bArr) {
        this.f40508 = bArr;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m30116() {
        return this.f40495;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30139(int i) {
        this.f40495 = i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m30140() {
        return this.f40504;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30095(int i) {
        this.f40504 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m30125() {
        if (this.f40490 != 3) {
            return 0;
        }
        return (this.f40504 >> 16) & 65535;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m30114() {
        return this.f40510;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m30118() {
        return this.f40510 == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30122(int i) {
        this.f40510 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m30137() {
        return this.f40498;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30123(long j) {
        this.f40498 = j;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m30099() {
        return this.f40499;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30127(long j) {
        this.f40499 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30101() {
        C7167 c7167 = this.f40505;
        C13638.requireNonNull(c7167);
        return c7167.m19094()[4] & 255;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30121() throws IOException {
        C7167 c7167 = this.f40505;
        if (c7167 == null || c7167.m19094().length < 2) {
            throw new IOException(C22697.m50267(new StringBuilder("Missing or invalid AES extra data ("), this.f40492, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        byte[] bArrM19094 = this.f40505.m19094();
        return ((bArrM19094[1] & 255) << 8) | (bArrM19094[0] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30106(C7167 c7167) {
        this.f40505 = c7167;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30112(byte[] bArr) throws IOException {
        C7167 c7167M19088 = C7167.m19088(1, bArr);
        int i = 0;
        if (c7167M19088 != null) {
            if (this.f40502 == 4294967295L) {
                this.f40502 = c7167M19088.m19093(0);
                i = 8;
            }
            if (this.f40507 == 4294967295L) {
                this.f40507 = c7167M19088.m19093(i);
                i += 8;
            }
            if (this.f40498 == 4294967295L) {
                this.f40498 = c7167M19088.m19093(i);
            }
            return true;
        }
        if (this.f40507 != 4294967295L && this.f40502 != 4294967295L && this.f40498 != 4294967295L) {
            return false;
        }
        throw new IOException("File contains no zip64 extended information: name=" + new String(this.f40496) + ", compressedSize=" + this.f40507 + ", size=" + this.f40502 + ", headerOffset=" + this.f40498 + ", extra=" + C22253.m49424(bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30105(Charset charset, boolean z, boolean z2) {
        byte[] bArr = this.f40503;
        if (bArr == null || bArr.length == 0) {
            z = false;
        }
        String strM30092 = z ? m30092(C7167.m19088(28789, bArr), this.f40496) : null;
        if (strM30092 == null) {
            strM30092 = new String(this.f40496, charset);
        }
        if (!z2 && strM30092.indexOf(92) != -1 && strM30092.indexOf(47) == -1) {
            this.f40492 = strM30092.replace('\\', '/');
            this.f40509 = strM30092;
        } else {
            this.f40492 = strM30092;
            this.f40509 = null;
        }
        this.f40496 = null;
        if (this.f40501 == null) {
            return;
        }
        String strM30093 = z ? m30092(C7167.m19088(25461, this.f40503), this.f40501) : null;
        if (strM30093 == null) {
            strM30093 = new String(this.f40501, charset);
        }
        m30104(strM30093);
        this.f40501 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30092(C7167 c7167, byte[] bArr) throws EOFException {
        byte[] bArrM19094;
        int length;
        if (c7167 == null || bArr == null || (length = (bArrM19094 = c7167.m19094()).length) < 5 || c7167.m19092() != 1) {
            return null;
        }
        int iM19095 = c7167.m19095();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (iM19095 != ((int) crc32.getValue())) {
            return null;
        }
        return new String(bArrM19094, 5, length - 5, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30097(byte[] bArr) {
        this.f40496 = bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30129(byte[] bArr) {
        this.f40501 = bArr;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m30093() {
        if (this.f40492.isEmpty()) {
            return "";
        }
        int length = this.f40492.length();
        int i = length - 1;
        if (this.f40492.charAt(i) == '/') {
            i = length - 2;
        }
        return this.f40492.substring(this.f40492.lastIndexOf(47, i) + 1, i + 1);
    }

    public final String getParent() {
        if (this.f40492.isEmpty()) {
            return null;
        }
        int length = this.f40492.length();
        int i = length - 1;
        if (this.f40492.charAt(i) == '/') {
            i = length - 2;
        }
        int iLastIndexOf = this.f40492.lastIndexOf(47, i) + 1;
        return iLastIndexOf == 0 ? "" : this.f40492.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30107(C12107 c12107) {
        this.f40493 = c12107;
        if (c12107.f40489 == null) {
            c12107.f40489 = new ArrayList();
        }
        c12107.f40489.add(this);
        ArrayList<C12107> arrayList = this.f40489;
        if (arrayList != null) {
            this.f40489 = null;
            for (C12107 c12108 : arrayList) {
                c12108.f40493 = null;
                c12108.m30107(c12107);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m30141() {
        return this.f40489 != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m30130() {
        return this.f40493 != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12107 m30132() {
        return this.f40493;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m30091() {
        C12107 c12107 = this.f40493;
        if (c12107 != null) {
            c12107.f40489.remove(this);
            if (c12107.f40489.isEmpty()) {
                c12107.f40489 = null;
            }
            this.f40493 = null;
        }
    }

    public final C12107 clone() {
        try {
            C12107 c12107 = (C12107) super.clone();
            C7167 c7167 = this.f40505;
            if (c7167 != null) {
                c12107.f40505 = c7167.m19096clone();
            }
            return c12107;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
