package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܰۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4K0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45935;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45936;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence f45937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45939;

    public C14577(int i, int i2, CharSequence charSequence) {
        this.f45937 = charSequence;
        this.f45938 = i;
        this.f45936 = i;
        this.f45935 = i;
        this.f45939 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35171(char c) {
        int iIndexOf = TextUtils.indexOf(this.f45937, c, this.f45935);
        if (iIndexOf == -1 || iIndexOf >= this.f45939) {
            return false;
        }
        this.f45935 = iIndexOf + 1;
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m35177() {
        return this.f45935 >= this.f45939;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final char m35176() {
        if (m35177()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f45935), Integer.valueOf(this.f45939)));
        }
        int i = this.f45935;
        this.f45935 = i + 1;
        return this.f45937.charAt(i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m35175() {
        CharSequence charSequence;
        char cCharAt;
        char cCharAt2;
        if (m35177()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f45935), Integer.valueOf(this.f45939)));
        }
        int i = this.f45935;
        do {
            boolean zM35177 = m35177();
            charSequence = this.f45937;
            if (!zM35177) {
                int i2 = this.f45935;
                this.f45935 = i2 + 1;
                cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    break;
                }
            } else {
                break;
            }
        } while (cCharAt2 != '\r');
        int i3 = this.f45935;
        while (!m35177() && ((cCharAt = charSequence.charAt(this.f45935)) == '\n' || cCharAt == '\r')) {
            this.f45935++;
        }
        while (i < i3 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (i < i3 && charSequence.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        this.f45936 = i;
        this.f45938 = i3;
        return charSequence.subSequence(i, i3).toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35172() {
        while (!m35177()) {
            char cM35176 = m35176();
            if (cM35176 != ' ' && cM35176 != '\t' && cM35176 != '\n' && cM35176 != '\r') {
                this.f45935--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m35174() {
        while (!m35177()) {
            char cM35176 = m35176();
            if (cM35176 == '\"') {
                return true;
            }
            if (cM35176 == '\\' && !m35177()) {
                this.f45935++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35169() {
        while (!m35177()) {
            char cM35176 = m35176();
            if (cM35176 == '\'') {
                return true;
            }
            if (cM35176 == '\\' && !m35177()) {
                this.f45935++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35170() {
        char cM35176 = m35176();
        if (cM35176 == '\"') {
            m35174();
        } else if (cM35176 != '\'') {
            int i = 1;
            if (cM35176 != '{') {
                while (!m35177()) {
                    char cM35177 = m35176();
                    if (cM35177 == ' ' || cM35177 == '\t' || cM35177 == '\n' || cM35177 == '\r') {
                        this.f45935--;
                        break;
                    }
                }
            } else {
                while (!m35177()) {
                    char cM35178 = m35176();
                    if (cM35178 != '\"') {
                        if (cM35178 != '\'') {
                            if (cM35178 == '{') {
                                i++;
                            } else if (cM35178 == '}' && (i = i - 1) == 0) {
                                break;
                            }
                        } else if (!m35169()) {
                            break;
                        }
                    } else if (!m35174()) {
                        break;
                    }
                }
            }
        } else {
            m35169();
        }
        return this.f45935;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35178() {
        return this.f45935;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m35179() {
        return this.f45936;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35173() {
        return this.f45938;
    }
}
