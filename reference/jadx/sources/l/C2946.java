package l;

/* JADX INFO: renamed from: l.ۗۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f11051;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f11052;

    public C2946(String str, boolean z) {
        this.f11051 = str;
        this.f11052 = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2946 m8776(int i, int i2, CharSequence charSequence) {
        if (i >= i2) {
            return new C2946("", i < i2);
        }
        StringBuilder sb = new StringBuilder(Math.min(i2 - i, 480));
        for (int i3 = 0; i < i2 && i3 < 240; i3++) {
            int i4 = i + 1;
            char cCharAt = charSequence.charAt(i);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i4 >= i2) {
                i = i4;
            } else {
                char cCharAt2 = charSequence.charAt(i4);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    i += 2;
                } else {
                    i = i4;
                }
            }
        }
        return new C2946(sb.toString(), i < i2);
    }
}
