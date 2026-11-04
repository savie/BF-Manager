package l;

import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BE0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6994 implements Comparable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23061 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f23062 = new ConcurrentMapC17249(10000, 0.75f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5085 f23063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f23064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13705 f23065;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13705 f23066;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6994 m19304(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentMapC17249 concurrentMapC17249 = f23062;
        C6994 c6994 = (C6994) concurrentMapC17249.get(str);
        if (c6994 != null) {
            return c6994;
        }
        C6994 c6994M19303 = m19303(str);
        C6994 c6995 = (C6994) concurrentMapC17249.putIfAbsent(c6994M19303.f23064, c6994M19303);
        return c6995 != null ? c6995 : c6994M19303;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6994 m19303(String str) {
        C5085 c5085M15362;
        int i;
        C6994 c6994 = (C6994) f23062.get(str);
        if (c6994 != null) {
            return c6994;
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
        C5085[] c5085Arr = new C5085[i3];
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
                c5085Arr[i5] = C5085.m15362(str.substring(i4, i));
                i5++;
                i4 = i;
            } else {
                String strSubstring = str.substring(i4 + 1);
                C5085 c5085 = C5085.f17727;
                try {
                    if (strSubstring.equals("V")) {
                        c5085M15362 = C5085.f17731;
                    } else {
                        c5085M15362 = C5085.m15362(strSubstring);
                    }
                    C13705 c13705 = new C13705(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        c13705.m31599(i7, c5085Arr[i7]);
                    }
                    return new C6994(str, c5085M15362, c13705);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
        }
    }

    public C6994(String str, C5085 c5085, C13705 c13705) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c5085 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f23064 = str;
        this.f23063 = c5085;
        this.f23065 = c13705;
        this.f23066 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6994)) {
            return false;
        }
        return this.f23064.equals(((C6994) obj).f23064);
    }

    public final int hashCode() {
        return this.f23064.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6994 c6994) {
        if (this == c6994) {
            return 0;
        }
        C5085 c5085 = c6994.f23063;
        C13705 c13705 = c6994.f23065;
        int iCompareTo = this.f23063.compareTo(c5085);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C13705 c13706 = this.f23065;
        int size = c13706.size();
        int size2 = c13705.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = c13706.m31609get(i).compareTo(c13705.m31609get(i));
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
        return this.f23064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19306() {
        return this.f23064;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5085 m19308() {
        return this.f23063;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C13705 m19309() {
        return this.f23065;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13705 m19310() {
        if (this.f23066 == null) {
            C13705 c13705 = this.f23065;
            int size = c13705.size();
            C13705 c13706 = new C13705(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C5085 c5085M31609get = c13705.m31609get(i);
                if (c5085M31609get.m15372()) {
                    c5085M31609get = C5085.f17753;
                    z = true;
                }
                c13706.m31599(i, c5085M31609get);
            }
            if (z) {
                c13705 = c13706;
            }
            this.f23066 = c13705;
        }
        return this.f23066;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6994 m19307(C5085 c5085) {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(c5085.m15375());
        String strM = ExternalValue$$ExternalSyntheticOutline0.m(1, this.f23064, sb);
        C13705 c13705M33502 = this.f23065.m33502(c5085);
        c13705M33502.mo15005();
        C6994 c6994 = new C6994(strM, this.f23063, c13705M33502);
        C6994 c6995 = (C6994) f23062.putIfAbsent(strM, c6994);
        return c6995 != null ? c6995 : c6994;
    }
}
