package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۧۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10703 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f36514;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36515;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence f36516;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36517;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36518;

    public C10703(int i, int i2, CharSequence charSequence) {
        this.f36516 = charSequence;
        this.f36518 = i;
        this.f36517 = i;
        this.f36515 = i;
        this.f36514 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26929(char c) {
        int iIndexOf = TextUtils.indexOf(this.f36516, c, this.f36515);
        if (iIndexOf == -1 || iIndexOf >= this.f36514) {
            return false;
        }
        this.f36515 = iIndexOf + 1;
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m26930() {
        return this.f36515 >= this.f36514;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char m26935() {
        if (m26930()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f36515), Integer.valueOf(this.f36514)));
        }
        int i = this.f36515;
        this.f36515 = i + 1;
        return this.f36516.charAt(i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m26925() {
        CharSequence charSequence;
        char cCharAt;
        char cCharAt2;
        if (m26930()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f36515), Integer.valueOf(this.f36514)));
        }
        int i = this.f36515;
        do {
            boolean zM26930 = m26930();
            charSequence = this.f36516;
            if (!zM26930) {
                int i2 = this.f36515;
                this.f36515 = i2 + 1;
                cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    break;
                }
            } else {
                break;
            }
        } while (cCharAt2 != '\r');
        int i3 = this.f36515;
        while (!m26930() && ((cCharAt = charSequence.charAt(this.f36515)) == '\n' || cCharAt == '\r')) {
            this.f36515++;
        }
        while (i < i3 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (i < i3 && charSequence.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        this.f36517 = i;
        this.f36518 = i3;
        return charSequence.subSequence(i, i3).toString();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m26933() {
        while (!m26930()) {
            char cM26935 = m26935();
            if (cM26935 != ' ' && cM26935 != '\t' && cM26935 != '\n' && cM26935 != '\r') {
                this.f36515--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m26931() {
        while (!m26930()) {
            char cM26935 = m26935();
            if (cM26935 == '\"') {
                return true;
            }
            if (cM26935 == '\\' && !m26930()) {
                this.f36515++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m26927() {
        while (!m26930()) {
            char cM26935 = m26935();
            if (cM26935 == '\'') {
                return true;
            }
            if (cM26935 == '\\' && !m26930()) {
                this.f36515++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26928() {
        char cM26935 = m26935();
        if (cM26935 == '\"') {
            m26931();
        } else if (cM26935 != '\'') {
            int i = 1;
            if (cM26935 != '{') {
                while (!m26930()) {
                    char cM26936 = m26935();
                    if (cM26936 == ' ' || cM26936 == '\t' || cM26936 == '\n' || cM26936 == '\r') {
                        this.f36515--;
                        break;
                    }
                }
            } else {
                while (!m26930()) {
                    char cM26937 = m26935();
                    if (cM26937 != '\"') {
                        if (cM26937 != '\'') {
                            if (cM26937 == '{') {
                                i++;
                            } else if (cM26937 == '}' && (i = i - 1) == 0) {
                                break;
                            }
                        } else if (!m26927()) {
                            break;
                        }
                    } else if (!m26931()) {
                        break;
                    }
                }
            }
        } else {
            m26927();
        }
        return this.f36515;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26934() {
        return this.f36515;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m26926() {
        return this.f36517;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26932() {
        return this.f36518;
    }
}
