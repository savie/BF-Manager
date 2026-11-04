package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C23183 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23742 f75117 = C23742.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ROOT);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75118;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f75119;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f75121;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f75122;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75123;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75125;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f75120 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String[] f75124 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C23183 m52099(C9866 c9866) {
        int iM25658;
        C23183 c23183 = new C23183();
        int iM25659 = c9866.m25658();
        c23183.f75120 = iM25659;
        if ((iM25659 & 1) != 0) {
            c23183.f75121 = ((((long) c9866.m25658()) & 4294967295L) << 32) | (4294967295L & ((long) c9866.m25658()));
        }
        if ((c23183.f75120 & 2) != 0) {
            c23183.f75119 = c9866.m25658();
            c23183.f75125 = c9866.m25658();
        }
        if ((c23183.f75120 & 4) != 0) {
            c23183.f75122 = c9866.m25658();
        }
        if ((c23183.f75120 & 8) != 0) {
            c23183.f75118 = c9866.m25658();
        }
        if ((c23183.f75120 & 8) != 0) {
            c23183.f75123 = c9866.m25658();
        }
        if ((c23183.f75120 & Integer.MIN_VALUE) != 0 && (iM25658 = c9866.m25658()) > 0) {
            c23183.f75124 = new String[iM25658 * 2];
            for (int i = 0; i < iM25658; i++) {
                String[] strArr = c23183.f75124;
                int i2 = i * 2;
                byte[] bArrM25649 = c9866.m25649();
                byte[] bArr = C9011.f29358;
                int length = bArrM25649.length;
                Charset charset = StandardCharsets.UTF_8;
                strArr[i2] = new String(bArrM25649, 0, length, charset);
                byte[] bArrM256410 = c9866.m25649();
                c23183.f75124[i2 + 1] = new String(bArrM256410, 0, bArrM256410.length, charset);
            }
        }
        return c23183;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m52106() {
        int i = this.f75120;
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
            int length2 = this.f75124.length / 2;
            if (length2 > 0) {
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i2 * 2;
                    length = this.f75124[i3 + 1].length() + this.f75124[i3].length() + length + 4 + 4;
                }
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52104(C9866 c9866) {
        int length;
        c9866.m25669(this.f75120);
        if ((this.f75120 & 1) != 0) {
            c9866.m25654(this.f75121);
        }
        if ((this.f75120 & 2) != 0) {
            c9866.m25669(this.f75119);
            c9866.m25669(this.f75125);
        }
        if ((this.f75120 & 4) != 0) {
            c9866.m25669(this.f75122);
        }
        if ((this.f75120 & 8) != 0) {
            c9866.m25669(this.f75118);
        }
        if ((this.f75120 & 8) != 0) {
            c9866.m25669(this.f75123);
        }
        if ((this.f75120 & Integer.MIN_VALUE) == 0 || (length = this.f75124.length / 2) <= 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = this.f75124[i2];
            byte[] bArr = C9011.f29358;
            Charset charset = StandardCharsets.UTF_8;
            c9866.m25673(C9011.m24055(str, charset));
            c9866.m25673(C9011.m24055(this.f75124[i2 + 1], charset));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52107(int i, int i2) {
        this.f75120 |= 2;
        this.f75119 = i;
        this.f75125 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52103(int i, int i2) {
        this.f75120 |= 8;
        this.f75118 = i;
        this.f75123 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52102(int i) {
        this.f75120 |= 4;
        this.f75122 = (i & 4095) | (this.f75122 & (-4096));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m52100(int i) {
        return (this.f75120 & 4) != 0 && (this.f75122 & 61440) == i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52109() {
        return m52100(32768);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52108() {
        return m52100(16384);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m52105() {
        return m52100(40960);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52101() {
        return this.f75120;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        if (m52100(16384)) {
            sb2.append('d');
        } else if (m52100(40960)) {
            sb2.append('l');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 256) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 128) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i = this.f75122;
        if ((i & 2048) != 0) {
            sb2.append('s');
        } else if ((i & 64) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 32) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 16) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i2 = this.f75122;
        if ((i2 & 1024) != 0) {
            sb2.append('s');
        } else if ((i2 & 8) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 4) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 2) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        if ((this.f75122 & 1) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f75119);
        sb.append(" ");
        sb.append(this.f75125);
        sb.append(" ");
        sb.append(this.f75121);
        sb.append(" ");
        sb.append(f75117.format(C23084.ofInstant(C0358.ofEpochSecond(((long) this.f75123) & 4294967295L), AbstractC22338.systemDefault())));
        return sb.toString();
    }
}
