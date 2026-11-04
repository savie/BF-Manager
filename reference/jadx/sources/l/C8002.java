package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۟ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 466O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8002 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f26555;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f26557;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f26562;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f26563;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f26565;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f26566;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8002 f26568;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24411 f26569;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f26570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f26571;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte[] f26573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f26574;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f26575;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f26576;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f26567 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26572 = -1;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public long f26560 = -1;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f26559 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f26558 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f26561 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f26556 = -1;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f26564 = -1;

    public C8002() {
    }

    public C8002(String str) {
        m21851(str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m21815() {
        return this.f26567;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21812(int i) {
        this.f26567 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m21810() {
        return (this.f26563 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m21841() {
        return this.f26563;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21845(int i) {
        this.f26563 = i;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m21826() {
        return this.f26566;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m21837(int i) {
        this.f26566 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m21856() {
        return (this.f26563 & 1) != 0;
    }

    public final long getTime() {
        return this.f26557;
    }

    public final void setTime(long j) {
        this.f26557 = j;
        m21809();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m21825() {
        return this.f26565;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m21830() {
        return ((long) this.f26565) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21817(int i) {
        this.f26565 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m21838() {
        return this.f26572;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21818(long j) {
        this.f26572 = j;
    }

    public final long getSize() {
        return this.f26560;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21854(long j) {
        this.f26560 = j;
    }

    public final String getName() {
        return this.f26576;
    }

    public final boolean isDirectory() {
        return this.f26576.endsWith("/");
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m21848() {
        String str = this.f26570;
        return str == null ? this.f26576 : str;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m21857() {
        return this.f26576.replaceAll("[:\\\\*?<>\"|]", "_").replaceAll("\\s", " ");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21851(String str) {
        if (str == null) {
            str = "";
        }
        this.f26576 = str;
        this.f26570 = null;
        m21809();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m21844() {
        return this.f26555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21819(String str) {
        this.f26555 = str;
        m21809();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21821(C4273 c4273) {
        this.f26575 = C24411.m54599(19796, this.f26575, c4273.m13620());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4273 m21836() {
        C24411 c24411M54598 = C24411.m54598(19796, this.f26575);
        if (c24411M54598 == null) {
            return null;
        }
        C4273 c4273 = new C4273();
        c4273.m13619(c24411M54598.m54603());
        return c4273;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final byte[] m21847() {
        return this.f26575;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m21834() {
        return this.f26574;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21833(byte[] bArr) {
        this.f26575 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21824(byte[] bArr) {
        this.f26574 = bArr;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m21814() {
        return this.f26559;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21839(int i) {
        this.f26559 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m21858() {
        return this.f26558;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21853(int i) {
        this.f26558 = i;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m21828() {
        if (this.f26567 != 3) {
            return 0;
        }
        return (this.f26558 >> 16) & 65535;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21835() {
        return this.f26564;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m21827() {
        return this.f26564 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21831(int i) {
        this.f26564 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m21842() {
        return this.f26561;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21832(long j) {
        this.f26561 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m21811() {
        return this.f26556;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21850(long j) {
        this.f26556 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21816() {
        C24411 c24411 = this.f26569;
        C17359.requireNonNull(c24411);
        return c24411.m54603()[4] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21849() throws IOException {
        C24411 c24411 = this.f26569;
        if (c24411 == null || c24411.m54603().length < 2) {
            throw new IOException(C8947.m23910(new StringBuilder("Missing or invalid AES extra data ("), this.f26576, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        byte[] bArrM54603 = this.f26569.m54603();
        return ((bArrM54603[1] & 255) << 8) | (bArrM54603[0] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21823(C24411 c24411) {
        this.f26569 = c24411;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21846(byte[] bArr) throws IOException {
        C24411 c24411M54598 = C24411.m54598(1, bArr);
        int i = 0;
        if (c24411M54598 != null) {
            if (this.f26560 == 4294967295L) {
                this.f26560 = c24411M54598.m54602(0);
                i = 8;
            }
            if (this.f26572 == 4294967295L) {
                this.f26572 = c24411M54598.m54602(i);
                i += 8;
            }
            if (this.f26561 == 4294967295L) {
                this.f26561 = c24411M54598.m54602(i);
            }
            return true;
        }
        if (this.f26572 != 4294967295L && this.f26560 != 4294967295L && this.f26561 != 4294967295L) {
            return false;
        }
        throw new IOException("File contains no zip64 extended information: name=" + new String(this.f26573) + ", compressedSize=" + this.f26572 + ", size=" + this.f26560 + ", headerOffset=" + this.f26561 + ", extra=" + C15022.m36182(bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21820(Charset charset, boolean z, boolean z2) {
        byte[] bArr = this.f26575;
        if (bArr == null || bArr.length == 0) {
            z = false;
        }
        String strM21808 = z ? m21808(C24411.m54598(28789, bArr), this.f26573) : null;
        if (strM21808 == null) {
            strM21808 = new String(this.f26573, charset);
        }
        if (!z2 && strM21808.indexOf(92) != -1 && strM21808.indexOf(47) == -1) {
            this.f26576 = strM21808.replace('\\', '/');
            this.f26570 = strM21808;
        } else {
            this.f26576 = strM21808;
            this.f26570 = null;
        }
        this.f26573 = null;
        if (this.f26562 == null) {
            return;
        }
        String strM21809 = z ? m21808(C24411.m54598(25461, this.f26575), this.f26562) : null;
        if (strM21809 == null) {
            strM21809 = new String(this.f26562, charset);
        }
        m21819(strM21809);
        this.f26562 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21808(C24411 c24411, byte[] bArr) {
        byte[] bArrM54603;
        int length;
        if (c24411 == null || bArr == null || (length = (bArrM54603 = c24411.m54603()).length) < 5 || c24411.m54604() != 1) {
            return null;
        }
        int iM54605 = c24411.m54605();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (iM54605 != ((int) crc32.getValue())) {
            return null;
        }
        return new String(bArrM54603, 5, length - 5, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21855(byte[] bArr) {
        this.f26573 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21852(byte[] bArr) {
        this.f26562 = bArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m21843() {
        if (this.f26576.isEmpty()) {
            return "";
        }
        int length = this.f26576.length();
        int i = length - 1;
        if (this.f26576.charAt(i) == '/') {
            i = length - 2;
        }
        return this.f26576.substring(this.f26576.lastIndexOf(47, i) + 1, i + 1);
    }

    public final String getParent() {
        if (this.f26576.isEmpty()) {
            return null;
        }
        int length = this.f26576.length();
        int i = length - 1;
        if (this.f26576.charAt(i) == '/') {
            i = length - 2;
        }
        int iLastIndexOf = this.f26576.lastIndexOf(47, i) + 1;
        return iLastIndexOf == 0 ? "" : this.f26576.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21822(C8002 c8002) {
        this.f26568 = c8002;
        if (c8002.f26571 == null) {
            c8002.f26571 = new ArrayList();
        }
        c8002.f26571.add(this);
        ArrayList<C8002> arrayList = this.f26571;
        if (arrayList != null) {
            this.f26571 = null;
            for (C8002 c8003 : arrayList) {
                c8003.f26568 = null;
                c8003.m21822(c8002);
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m21829() {
        return this.f26571 != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m21813() {
        return this.f26568 != null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C8002 m21840() {
        return this.f26568;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m21809() {
        C8002 c8002 = this.f26568;
        if (c8002 != null) {
            c8002.f26571.remove(this);
            if (c8002.f26571.isEmpty()) {
                c8002.f26571 = null;
            }
            this.f26568 = null;
        }
    }

    public final C8002 clone() {
        try {
            C8002 c8002 = (C8002) super.clone();
            C24411 c24411 = this.f26569;
            if (c24411 != null) {
                c8002.f26569 = c24411.m54606clone();
            }
            return c8002;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
