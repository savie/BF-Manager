package l;

import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12004 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f38707 = new byte[Params.POLY_BYTES];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38708;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f38709;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char f38710;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f38711;

    static {
        for (int i = 0; i < 1792; i++) {
            f38707[i] = Character.getDirectionality(i);
        }
    }

    public C12004(CharSequence charSequence) {
        this.f38711 = charSequence;
        this.f38709 = charSequence.length();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30189() {
        byte directionality;
        this.f38708 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f38708;
            if (i4 < this.f38709 && i == 0) {
                CharSequence charSequence = this.f38711;
                char cCharAt = charSequence.charAt(i4);
                this.f38710 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence, this.f38708);
                    this.f38708 = Character.charCount(iCodePointAt) + this.f38708;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    this.f38708++;
                    char c = this.f38710;
                    directionality = c < 1792 ? f38707[c] : Character.getDirectionality(c);
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
                while (this.f38708 > 0) {
                    switch (m30187()) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m30188() {
        this.f38708 = this.f38709;
        int i = 0;
        int i2 = 0;
        while (this.f38708 > 0) {
            byte bM30187 = m30187();
            if (bM30187 == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM30187 == 1 || bM30187 == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM30187 != 9) {
                switch (bM30187) {
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
    public final byte m30187() {
        int i = this.f38708 - 1;
        CharSequence charSequence = this.f38711;
        char cCharAt = charSequence.charAt(i);
        this.f38710 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f38708);
            this.f38708 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f38708--;
        char c = this.f38710;
        return c < 1792 ? f38707[c] : Character.getDirectionality(c);
    }
}
