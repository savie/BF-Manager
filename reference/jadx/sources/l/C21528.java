package l;

import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21528 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f69937 = new byte[Params.POLY_BYTES];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f69938;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69939;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f69940;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char f69941;

    static {
        for (int i = 0; i < 1792; i++) {
            f69937[i] = Character.getDirectionality(i);
        }
    }

    public C21528(CharSequence charSequence) {
        this.f69938 = charSequence;
        this.f69940 = charSequence.length();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m48251() {
        byte directionality;
        this.f69939 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f69939;
            if (i4 < this.f69940 && i == 0) {
                CharSequence charSequence = this.f69938;
                char cCharAt = charSequence.charAt(i4);
                this.f69941 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence, this.f69939);
                    this.f69939 = Character.charCount(iCodePointAt) + this.f69939;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    this.f69939++;
                    char c = this.f69941;
                    directionality = c < 1792 ? f69937[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (this.f69939 > 0) {
                    switch (m48249()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48250() {
        this.f69939 = this.f69940;
        int i = 0;
        int i2 = 0;
        while (this.f69939 > 0) {
            byte bM48249 = m48249();
            if (bM48249 == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM48249 == 1 || bM48249 == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM48249 != 9) {
                switch (bM48249) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m48249() {
        int i = this.f69939 - 1;
        CharSequence charSequence = this.f69938;
        char cCharAt = charSequence.charAt(i);
        this.f69941 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f69939);
            this.f69939 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f69939--;
        char c = this.f69941;
        return c < 1792 ? f69937[c] : Character.getDirectionality(c);
    }
}
