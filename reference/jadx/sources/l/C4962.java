package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C23351 f17312 = C23351.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ROOT);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f17313;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f17314;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17315;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f17316;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17320;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17317 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f17319 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4962 m13750(C14904 c14904) {
        int iM35638;
        C4962 c4962 = new C4962();
        int iM35639 = c14904.m35638();
        c4962.f17317 = iM35639;
        if ((iM35639 & 1) != 0) {
            c4962.f17313 = ((((long) c14904.m35638()) & 4294967295L) << 32) | (4294967295L & ((long) c14904.m35638()));
        }
        if ((c4962.f17317 & 2) != 0) {
            c4962.f17318 = c14904.m35638();
            c4962.f17314 = c14904.m35638();
        }
        if ((c4962.f17317 & 4) != 0) {
            c4962.f17320 = c14904.m35638();
        }
        if ((c4962.f17317 & 8) != 0) {
            c4962.f17315 = c14904.m35638();
        }
        if ((c4962.f17317 & 8) != 0) {
            c4962.f17316 = c14904.m35638();
        }
        if ((c4962.f17317 & Integer.MIN_VALUE) != 0 && (iM35638 = c14904.m35638()) > 0) {
            c4962.f17319 = new String[iM35638 * 2];
            for (int i = 0; i < iM35638; i++) {
                String[] strArr = c4962.f17319;
                int i2 = i * 2;
                byte[] bArrM35628 = c14904.m35628();
                byte[] bArr = C8491.f29422;
                int length = bArrM35628.length;
                Charset charset = StandardCharsets.UTF_8;
                strArr[i2] = new String(bArrM35628, 0, length, charset);
                byte[] bArrM35629 = c14904.m35628();
                c4962.f17319[i2 + 1] = new String(bArrM35629, 0, bArrM35629.length, charset);
            }
        }
        return c4962;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13757() {
        int i = this.f17317;
        int length = (i & 1) != 0 ? 12 : 4;
        if ((i & 2) != 0) {
            length += 8;
        }
        if ((i & 4) != 0) {
            length += 4;
        }
        if ((i & 8) != 0) {
            length += 8;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            length += 4;
            int length2 = this.f17319.length / 2;
            if (length2 > 0) {
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i2 * 2;
                    length = this.f17319[i3 + 1].length() + this.f17319[i3].length() + length + 4 + 4;
                }
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13756(C14904 c14904) {
        int length;
        c14904.m35644(this.f17317);
        if ((this.f17317 & 1) != 0) {
            c14904.m35633(this.f17313);
        }
        if ((this.f17317 & 2) != 0) {
            c14904.m35644(this.f17318);
            c14904.m35644(this.f17314);
        }
        if ((this.f17317 & 4) != 0) {
            c14904.m35644(this.f17320);
        }
        if ((this.f17317 & 8) != 0) {
            c14904.m35644(this.f17315);
        }
        if ((this.f17317 & 8) != 0) {
            c14904.m35644(this.f17316);
        }
        if ((this.f17317 & Integer.MIN_VALUE) == 0 || (length = this.f17319.length / 2) <= 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = this.f17319[i2];
            byte[] bArr = C8491.f29422;
            Charset charset = StandardCharsets.UTF_8;
            c14904.m35627(C8491.m22175(str, charset));
            c14904.m35627(C8491.m22175(this.f17319[i2 + 1], charset));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13759(int i, int i2) {
        this.f17317 |= 2;
        this.f17318 = i;
        this.f17314 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13755(int i, int i2) {
        this.f17317 |= 8;
        this.f17315 = i;
        this.f17316 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13754(int i) {
        this.f17317 |= 4;
        this.f17320 = (i & 4095) | (this.f17320 & (-4096));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m13751(int i) {
        return (this.f17317 & 4) != 0 && (this.f17320 & 61440) == i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13752() {
        return m13751(32768);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m13760() {
        return m13751(16384);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13758() {
        return m13751(40960);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13753() {
        return this.f17317;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        if (m13751(16384)) {
            sb2.append('d');
        } else if (m13751(40960)) {
            sb2.append('l');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 256) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 128) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i = this.f17320;
        if ((i & 2048) != 0) {
            sb2.append('s');
        } else if ((i & 64) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 32) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 16) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i2 = this.f17320;
        if ((i2 & 1024) != 0) {
            sb2.append('s');
        } else if ((i2 & 8) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 4) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 2) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        if ((this.f17320 & 1) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f17318);
        sb.append(" ");
        sb.append(this.f17314);
        sb.append(" ");
        sb.append(this.f17313);
        sb.append(" ");
        sb.append(f17312.format(C10525.ofInstant(C18285.ofEpochSecond(((long) this.f17316) & 4294967295L), AbstractC9114.systemDefault())));
        return sb.toString();
    }
}
