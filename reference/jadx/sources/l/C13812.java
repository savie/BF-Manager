package l;

import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.۬ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43795;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f43796;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f43797;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f43798 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33722(int i, CharSequence charSequence) throws C22413 {
        int length = charSequence.length();
        StringBuilder sb = this.f43798;
        if (length > BasicLabelFormatter.MILLION - sb.length()) {
            throw new C22413();
        }
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            if (i2 == i) {
                this.f43796 = this.f43795;
            }
            if (i2 == charSequence.length()) {
                return;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\n' && this.f43797) {
                this.f43797 = false;
            } else {
                boolean z = cCharAt == '\r';
                this.f43797 = z;
                if (z) {
                    cCharAt = '\n';
                }
                if (cCharAt == '\n') {
                    int i3 = this.f43795 + 1;
                    this.f43795 = i3;
                    if (i3 >= 20000) {
                        throw new C22413();
                    }
                }
                sb.append(cCharAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33721() {
        return this.f43796;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33723() {
        return this.f43798.toString();
    }
}
