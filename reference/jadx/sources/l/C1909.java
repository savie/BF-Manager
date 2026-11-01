package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BE0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1909 implements Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7251 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f7252 = new ConcurrentMapC13783(10000, 0.75f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9672 f7253;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f7254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3320 f7255;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9672 f7256;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1909 m6216(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentMapC13783 concurrentMapC13783 = f7252;
        C1909 c1909 = (C1909) concurrentMapC13783.get(str);
        if (c1909 != null) {
            return c1909;
        }
        C1909 c1909M6215 = m6215(str);
        C1909 c19010 = (C1909) concurrentMapC13783.putIfAbsent(c1909M6215.f7254, c1909M6215);
        return c19010 != null ? c19010 : c1909M6215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1909 m6215(String str) {
        C3320 c3320M9826;
        int i;
        C1909 c1909 = (C1909) f7252.get(str);
        if (c1909 != null) {
            return c1909;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = 0;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i3++;
            }
            i2++;
        }
        if (i2 == 0 || i2 == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i2 + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        C3320[] c3320Arr = new C3320[i3];
        int i4 = 1;
        int i5 = 0;
        while (true) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 != ')') {
                int i6 = i4;
                while (cCharAt2 == '[') {
                    i6++;
                    cCharAt2 = str.charAt(i6);
                }
                if (cCharAt2 == 'L') {
                    int iIndexOf = str.indexOf(59, i6);
                    if (iIndexOf == -1) {
                        throw new IllegalArgumentException("bad descriptor");
                    }
                    i = iIndexOf + 1;
                } else {
                    i = i6 + 1;
                }
                c3320Arr[i5] = C3320.m9826(str.substring(i4, i));
                i5++;
                i4 = i;
            } else {
                String strSubstring = str.substring(i4 + 1);
                C3320 c3320 = C3320.f12273;
                try {
                    if (strSubstring.equals("V")) {
                        c3320M9826 = C3320.f12280;
                    } else {
                        c3320M9826 = C3320.m9826(strSubstring);
                    }
                    C9672 c9672 = new C9672(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        c9672.m15255(i7, c3320Arr[i7]);
                    }
                    return new C1909(str, c3320M9826, c9672);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
        }
    }

    public C1909(String str, C3320 c3320, C9672 c9672) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c3320 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f7254 = str;
        this.f7255 = c3320;
        this.f7253 = c9672;
        this.f7256 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1909)) {
            return false;
        }
        return this.f7254.equals(((C1909) obj).f7254);
    }

    public final int hashCode() {
        return this.f7254.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1909 c1909) {
        if (this == c1909) {
            return 0;
        }
        C3320 c3320 = c1909.f7255;
        C9672 c9672 = c1909.f7253;
        int iCompareTo = this.f7255.compareTo(c3320);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C9672 c9673 = this.f7253;
        int size = c9673.size();
        int size2 = c9672.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = c9673.m15264get(i).compareTo(c9672.m15264get(i));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public final String toString() {
        return this.f7254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m6219() {
        return this.f7254;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3320 m6217() {
        return this.f7255;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9672 m6222() {
        return this.f7253;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9672 m6221() {
        if (this.f7256 == null) {
            C9672 c9672 = this.f7253;
            int size = c9672.size();
            C9672 c9673 = new C9672(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C3320 c3320M15264get = c9672.m15264get(i);
                if (c3320M15264get.m9841()) {
                    c3320M15264get = C3320.f12281;
                    z = true;
                }
                c9673.m15255(i, c3320M15264get);
            }
            if (z) {
                c9672 = c9673;
            }
            this.f7256 = c9672;
        }
        return this.f7256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1909 m6220(C3320 c3320) {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(c3320.m9844());
        String strM1616 = C0242.m1616(1, this.f7254, sb);
        C9672 c9672M24603 = this.f7253.m24603(c3320);
        c9672M24603.mo9637();
        C1909 c1909 = new C1909(strM1616, this.f7255, c9672M24603);
        C1909 c19010 = (C1909) f7252.putIfAbsent(strM1616, c1909);
        return c19010 != null ? c19010 : c1909;
    }
}
