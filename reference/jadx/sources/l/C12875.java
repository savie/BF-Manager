package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.۫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char f41206;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f41207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14763 f41208;

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[EDGE_INSN: B:29:0x005e->B:30:0x005f BREAK  A[LOOP:0: B:3:0x0006->B:15:0x0026]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31911(AbstractC13753 abstractC13753, CharSequence charSequence, int i, int i2) {
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
                    if (Looper.myLooper() != Looper.getMainLooper() || !abstractC13753.m33641()) {
                        c = cCharAt;
                        break;
                    }
                    C24132 c24132 = abstractC13753.f43659;
                    C1314 c1314 = c24132.f78033;
                    C14540 c14540 = c24132.f78066;
                    if (!c14540.f45755 || !c1314.m4816()) {
                        c = cCharAt;
                        break;
                    }
                    int iM4835 = c1314.m4835(i, c14540.m16212());
                    C11974 c11974M4794 = c1314.m4794(i);
                    if (c11974M4794 != null && iM4835 == c11974M4794.m30045()) {
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
        return "IndentGuideLine{spacesCount=" + this.f41207 + ", firstNotBlankChar=" + this.f41206 + ", markList=" + this.f41208 + '}';
    }
}
