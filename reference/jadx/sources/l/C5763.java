package l;

/* JADX INFO: renamed from: l.ۛۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4KD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5763 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final char[] f19575;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19576;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19577;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19578 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19579;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f19580;

    public C5763(String str) {
        this.f19575 = str.toCharArray();
        this.f19579 = str.length();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m15884() {
        int i;
        int i2;
        int i3;
        char[] cArr;
        char c;
        do {
            i = this.f19578;
            i2 = this.f19579;
            if (i >= i2) {
                return false;
            }
            i3 = i + 1;
            this.f19578 = i3;
            cArr = this.f19575;
            c = cArr[i];
            if (c == '\n') {
                break;
            }
        } while (c != '\r');
        if (i3 >= i2) {
            return true;
        }
        char c2 = cArr[i3];
        if (c2 != '\n' && c2 != '\r') {
            return true;
        }
        this.f19578 = i + 2;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15885() {
        String string;
        while (true) {
            int i = this.f19578;
            int i2 = this.f19579;
            if (i >= i2) {
                return false;
            }
            int i3 = i + 1;
            this.f19578 = i3;
            char[] cArr = this.f19575;
            char c = cArr[i];
            if (c == '\"') {
                this.f19577 = i3;
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i4 = this.f19578;
                    string = null;
                    if (i4 >= i2) {
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f19578 = i5;
                    char c2 = cArr[i4];
                    if (c2 != '\n') {
                        if (c2 == '\"') {
                            this.f19576 = i4;
                            string = sb.toString();
                            break;
                        }
                        if (c2 != '\\') {
                            sb.append(c2);
                        } else {
                            if (i5 == i2) {
                                break;
                            }
                            int i6 = i4 + 2;
                            this.f19578 = i6;
                            char c3 = cArr[i5];
                            if (c3 != '\"' && c3 != '\'') {
                                if (c3 != 'U') {
                                    if (c3 != '\\') {
                                        if (c3 == 'b') {
                                            sb.append('\b');
                                        } else if (c3 == 'f') {
                                            sb.append('\f');
                                        } else if (c3 == 'n') {
                                            sb.append('\n');
                                        } else if (c3 == 'r') {
                                            sb.append('\r');
                                        } else if (c3 == 't') {
                                            sb.append('\t');
                                        } else if (c3 != 'u') {
                                            m15884();
                                            break;
                                        }
                                    }
                                }
                                if (i2 - i6 < 4) {
                                    this.f19578 = i2;
                                    break;
                                }
                                String str = new String(cArr, i6, 4);
                                this.f19578 += 4;
                                try {
                                    sb.append((char) Integer.parseInt(str, 16));
                                } catch (NumberFormatException unused) {
                                    m15884();
                                }
                            }
                            sb.append(c3);
                        }
                    } else {
                        break;
                    }
                }
                this.f19580 = string;
                if (string != null) {
                    return true;
                }
            } else if (c != '#') {
                if (c == '\'' && i3 < i2) {
                    int i7 = i + 2;
                    this.f19578 = i7;
                    if (cArr[i3] == '\\') {
                        if (i7 != i2) {
                            this.f19578 = i + 3;
                            char c4 = cArr[i7];
                            if (c4 == 'u' || c4 == 'U') {
                                int i8 = i + 7;
                                this.f19578 = i8;
                                if (i8 > i2) {
                                    this.f19578 = i2;
                                }
                            }
                        }
                    }
                    int i9 = this.f19578;
                    if (i9 != i2) {
                        this.f19578 = i9 + 1;
                        if (cArr[i9] != '\'') {
                            m15885();
                        }
                    }
                }
            } else if (!m15884()) {
                return false;
            }
        }
    }
}
