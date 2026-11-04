package l;

/* JADX INFO: renamed from: l.ۘۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4138 extends AbstractC21292 {
    @Override // l.AbstractC21292
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13267(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        int length = (charSequence.length() - charSequence2.length()) + 1;
        if (i > length) {
            return -1;
        }
        if (charSequence2.length() == 0) {
            return i;
        }
        while (i < length) {
            if (C3392.m11107(i, charSequence2.length(), charSequence, charSequence2, true)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
