package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.۠ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZ7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8084 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char f28311;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15070 f28313;

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[EDGE_INSN: B:29:0x005e->B:30:0x005f BREAK  A[LOOP:0: B:3:0x0006->B:15:0x0026]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21291(AbstractC12359 abstractC12359, CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        char c = 0;
        int i3 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r') {
                break;
            }
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    if (Looper.myLooper() != Looper.getMainLooper() || !abstractC12359.m30759()) {
                        c = cCharAt;
                        break;
                    }
                    C6111 c6111 = abstractC12359.f41314;
                    C13190 c13190 = c6111.f20770;
                    C1590 c1590 = c6111.f20794;
                    if (!c1590.f6398 || !c13190.m32642()) {
                        c = cCharAt;
                        break;
                    }
                    int iM32618 = c13190.m32618(i, c1590.m17875());
                    C15682 c15682M32626 = c13190.m32626(i);
                    if (c15682M32626 != null && iM32618 == c15682M32626.m37379()) {
                        break;
                    }
                    c = cCharAt;
                    break;
                }
                i3++;
            } else {
                i3 = (i2 - (i3 % i2)) + i3;
            }
            i++;
        }
        return (65535 & i3) | (c << 16);
    }

    public final String toString() {
        return "IndentGuideLine{spacesCount=" + this.f28312 + ", firstNotBlankChar=" + this.f28311 + ", markList=" + this.f28313 + '}';
    }
}
