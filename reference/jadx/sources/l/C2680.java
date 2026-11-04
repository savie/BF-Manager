package l;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2680 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8520;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f8521;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f8522;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f8523;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f8524;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f8525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f8527;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8519 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f8526 = -1;

    public C2680(int i, C7998 c7998) {
        this.f8522 = i;
        C7998 c7999 = c7998.f9157;
        this.f8527 = c7999 != null ? c7999.mo1229() : -1;
        this.f8521 = c7998.f26549.mo23438();
        this.f8523 = i == 57 && (c7998.f9157 instanceof C15423);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0068  */
    /* JADX WARN: Code duplicated, block: B:58:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0086  */
    /* JADX WARN: Code duplicated, block: B:66:0x0088  */
    /* JADX WARN: Code duplicated, block: B:73:0x0096  */
    /* JADX WARN: Code duplicated, block: B:74:0x009b  */
    /* JADX WARN: Code duplicated, block: B:76:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:71:0x0091 for B:34:0x004f already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8849(InterfaceC8743 interfaceC8743) {
        int[] iArr;
        int i;
        int type = interfaceC8743.getType();
        int i2 = this.f8522;
        if (i2 != 1) {
            if (i2 == 18) {
                if (type != 136 && type != 133) {
                    return;
                }
            } else if (i2 != 25) {
                if (i2 == 30) {
                    if (type != 94) {
                        return;
                    }
                } else if (i2 != 34) {
                    if (i2 == 41) {
                        if (type != 136 && type != 95) {
                            return;
                        }
                    } else if (i2 == 47) {
                        if (type != 94) {
                            return;
                        }
                    } else if (i2 == 54) {
                        if (type != 92) {
                            return;
                        }
                    } else if (i2 == 64) {
                        if (type != 136) {
                            return;
                        }
                    } else if (i2 == 8 || i2 == 9 || i2 == 14) {
                        if (type != 94) {
                            return;
                        }
                    } else if (i2 != 15) {
                        if (i2 != 50 && i2 != 51) {
                            switch (i2) {
                                case 21:
                                    if (type != 18) {
                                    }
                                    break;
                                case 22:
                                    if (type != 17 && type != 38) {
                                    }
                                    break;
                                case 23:
                                    if (type != 91 && type != 92) {
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            if (type != 136) {
                                                break;
                                            }
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                        case 60:
                                            iArr = this.f8525;
                                            if (iArr == null) {
                                                this.f8525 = new int[2];
                                            } else {
                                                i = this.f8524;
                                                if (i == iArr.length) {
                                                    this.f8525 = Arrays.copyOf(iArr, i * 2);
                                                }
                                            }
                                            int[] iArr2 = this.f8525;
                                            int i3 = this.f8524;
                                            this.f8524 = i3 + 1;
                                            iArr2[i3] = interfaceC8743.mo23438();
                                            break;
                                        default:
                                            switch (i2) {
                                                case 66:
                                                    if (type != 94) {
                                                    }
                                                    iArr = this.f8525;
                                                    if (iArr == null) {
                                                        this.f8525 = new int[2];
                                                    } else {
                                                        i = this.f8524;
                                                        if (i == iArr.length) {
                                                            this.f8525 = Arrays.copyOf(iArr, i * 2);
                                                        }
                                                    }
                                                    int[] iArr3 = this.f8525;
                                                    int i4 = this.f8524;
                                                    this.f8524 = i4 + 1;
                                                    iArr3[i4] = interfaceC8743.mo23438();
                                                    break;
                                                case 67:
                                                    if (type != 136) {
                                                    }
                                                    iArr = this.f8525;
                                                    if (iArr == null) {
                                                        this.f8525 = new int[2];
                                                    } else {
                                                        i = this.f8524;
                                                        if (i == iArr.length) {
                                                            this.f8525 = Arrays.copyOf(iArr, i * 2);
                                                        }
                                                    }
                                                    int[] iArr4 = this.f8525;
                                                    int i5 = this.f8524;
                                                    this.f8524 = i5 + 1;
                                                    iArr4[i5] = interfaceC8743.mo23438();
                                                    break;
                                                case 68:
                                                    if (type != 92) {
                                                    }
                                                    iArr = this.f8525;
                                                    if (iArr == null) {
                                                        this.f8525 = new int[2];
                                                    } else {
                                                        i = this.f8524;
                                                        if (i == iArr.length) {
                                                            this.f8525 = Arrays.copyOf(iArr, i * 2);
                                                        }
                                                    }
                                                    int[] iArr5 = this.f8525;
                                                    int i6 = this.f8524;
                                                    this.f8524 = i6 + 1;
                                                    iArr5[i6] = interfaceC8743.mo23438();
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                        if (type != 94) {
                            return;
                        }
                    } else if (type != 136) {
                        return;
                    }
                } else if (type != 43 && type != 91 && type != 92 && type != 94) {
                    return;
                }
            } else if (type != 10 && type != 21) {
                return;
            }
        } else if (type != 93) {
            return;
        }
        iArr = this.f8525;
        if (iArr == null) {
            this.f8525 = new int[2];
        } else {
            i = this.f8524;
            if (i == iArr.length) {
                this.f8525 = Arrays.copyOf(iArr, i * 2);
            }
        }
        int[] iArr6 = this.f8525;
        int i7 = this.f8524;
        this.f8524 = i7 + 1;
        iArr6[i7] = interfaceC8743.mo23438();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8847(int i) {
        return this.f8525[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8848(int i, List list) {
        for (int i2 = 0; i2 < this.f8524; i2++) {
            if (((InterfaceC8743) list.get(this.f8525[i2])).getType() == i) {
                return this.f8525[i2];
            }
        }
        return -1;
    }
}
