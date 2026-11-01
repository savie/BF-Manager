package l;

import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ۢۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9388 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f31776 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31777;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f31778;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31779;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24083(int i, CharSequence charSequence) throws C4945 {
        int length = charSequence.length();
        StringBuilder sb = this.f31776;
        if (length > BasicLabelFormatter.MILLION - sb.length()) {
            throw new C4945();
        }
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            if (i2 == i) {
                this.f31778 = this.f31777;
            }
            if (i2 == charSequence.length()) {
                return;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\n' && this.f31779) {
                this.f31779 = false;
            } else {
                boolean z = cCharAt == '\r';
                this.f31779 = z;
                if (z) {
                    cCharAt = '\n';
                }
                if (cCharAt == '\n') {
                    int i3 = this.f31777 + 1;
                    this.f31777 = i3;
                    if (i3 >= 20000) {
                        throw new C4945();
                    }
                }
                sb.append(cCharAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24082() {
        return this.f31778;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m24084() {
        return this.f31776.toString();
    }
}
