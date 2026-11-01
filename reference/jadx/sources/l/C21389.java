package l;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩸ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21389 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f69542;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f69543;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69545;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f69546;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f69547;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f69548;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69550;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f69544 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69549 = -1;

    public C21389(int i, C23289 c23289) {
        this.f69547 = i;
        C23289 c232810 = c23289.f29378;
        this.f69543 = c232810 != null ? c232810.mo1058() : -1;
        this.f69548 = c23289.f75536.mo22511();
        this.f69542 = i == 57 && (c23289.f29378 instanceof C15932);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x004f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0068  */
    /* JADX WARN: Code duplicated, block: B:68:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47938(InterfaceC19761 interfaceC19761) {
        int type = interfaceC19761.getType();
        int i = this.f69547;
        if (i != 1) {
            if (i == 15 || i == 18) {
                if (type != 136 && type != 133) {
                    return;
                }
            } else if (i != 25) {
                if (i != 34) {
                    if (i == 41) {
                        if (type != 136 && type != 95) {
                            return;
                        }
                    } else if (i == 54) {
                        if (type != 92) {
                            return;
                        }
                    } else if (i != 64 && i != 67) {
                        if (i != 68) {
                            switch (i) {
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
                                    switch (i) {
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            if (type != 136) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                        if (type != 92) {
                            return;
                        }
                    } else if (type != 136) {
                        return;
                    }
                } else if (type != 43 && type != 91 && type != 92) {
                    return;
                }
            } else if (type != 10 && type != 21) {
                return;
            }
        } else if (type != 93) {
            return;
        }
        int[] iArr = this.f69546;
        if (iArr == null) {
            this.f69546 = new int[2];
        } else {
            int i2 = this.f69550;
            if (i2 == iArr.length) {
                this.f69546 = Arrays.copyOf(iArr, i2 * 2);
            }
        }
        int[] iArr2 = this.f69546;
        int i3 = this.f69550;
        this.f69550 = i3 + 1;
        iArr2[i3] = interfaceC19761.mo22511();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47936(int i) {
        return this.f69546[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47937(int i, List list) {
        for (int i2 = 0; i2 < this.f69550; i2++) {
            if (((InterfaceC19761) list.get(this.f69546[i2])).getType() == i) {
                return this.f69546[i2];
            }
        }
        return -1;
    }
}
