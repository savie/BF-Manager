package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A1J5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13429 implements InterfaceC5972 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2243 f42770;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11937 f42772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42774 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42767 = 8;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f42769 = new int[8];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f42775 = new int[8];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float[] f42773 = new float[8];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42768 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42766 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f42771 = false;

    public C13429(C2243 c2243, C11937 c11937) {
        this.f42770 = c2243;
        this.f42772 = c11937;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final void mo17400(C6718 c6718, float f) {
        if (f == 0.0f) {
            mo17396(c6718, true);
            return;
        }
        int i = this.f42768;
        C2243 c2243 = this.f42770;
        if (i == -1) {
            this.f42768 = 0;
            this.f42773[0] = f;
            this.f42769[0] = c6718.f22354;
            this.f42775[0] = -1;
            c6718.f22351++;
            c6718.m18755(c2243);
            this.f42774++;
            if (this.f42771) {
                return;
            }
            int i2 = this.f42766 + 1;
            this.f42766 = i2;
            int[] iArr = this.f42769;
            if (i2 >= iArr.length) {
                this.f42771 = true;
                this.f42766 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f42774; i4++) {
            int i5 = this.f42769[i];
            int i6 = c6718.f22354;
            if (i5 == i6) {
                this.f42773[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f42775[i];
        }
        int length = this.f42766;
        int i7 = length + 1;
        if (this.f42771) {
            int[] iArr2 = this.f42769;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f42769;
        if (length >= iArr3.length && this.f42774 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f42769;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f42769;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f42767 * 2;
            this.f42767 = i9;
            this.f42771 = false;
            this.f42766 = length - 1;
            this.f42773 = Arrays.copyOf(this.f42773, i9);
            this.f42769 = Arrays.copyOf(this.f42769, this.f42767);
            this.f42775 = Arrays.copyOf(this.f42775, this.f42767);
        }
        this.f42769[length] = c6718.f22354;
        this.f42773[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f42775;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f42775[length] = this.f42768;
            this.f42768 = length;
        }
        c6718.f22351++;
        c6718.m18755(c2243);
        int i10 = this.f42774 + 1;
        this.f42774 = i10;
        if (!this.f42771) {
            this.f42766++;
        }
        int[] iArr7 = this.f42769;
        if (i10 >= iArr7.length) {
            this.f42771 = true;
        }
        if (this.f42766 >= iArr7.length) {
            this.f42771 = true;
            this.f42766 = iArr7.length - 1;
        }
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final void mo17401(C6718 c6718, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f42768;
            C2243 c2243 = this.f42770;
            if (i == -1) {
                this.f42768 = 0;
                this.f42773[0] = f;
                this.f42769[0] = c6718.f22354;
                this.f42775[0] = -1;
                c6718.f22351++;
                c6718.m18755(c2243);
                this.f42774++;
                if (this.f42771) {
                    return;
                }
                int i2 = this.f42766 + 1;
                this.f42766 = i2;
                int[] iArr = this.f42769;
                if (i2 >= iArr.length) {
                    this.f42771 = true;
                    this.f42766 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f42774; i4++) {
                int i5 = this.f42769[i];
                int i6 = c6718.f22354;
                if (i5 == i6) {
                    float[] fArr = this.f42773;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f42768) {
                            this.f42768 = this.f42775[i];
                        } else {
                            int[] iArr2 = this.f42775;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c6718.m18758(c2243);
                        }
                        if (this.f42771) {
                            this.f42766 = i;
                        }
                        c6718.f22351--;
                        this.f42774--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f42775[i];
            }
            int length = this.f42766;
            int i7 = length + 1;
            if (this.f42771) {
                int[] iArr3 = this.f42769;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f42769;
            if (length >= iArr4.length && this.f42774 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f42769;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f42769;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f42767 * 2;
                this.f42767 = i9;
                this.f42771 = false;
                this.f42766 = length - 1;
                this.f42773 = Arrays.copyOf(this.f42773, i9);
                this.f42769 = Arrays.copyOf(this.f42769, this.f42767);
                this.f42775 = Arrays.copyOf(this.f42775, this.f42767);
            }
            this.f42769[length] = c6718.f22354;
            this.f42773[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f42775;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f42775[length] = this.f42768;
                this.f42768 = length;
            }
            c6718.f22351++;
            c6718.m18755(c2243);
            this.f42774++;
            if (!this.f42771) {
                this.f42766++;
            }
            int i10 = this.f42766;
            int[] iArr8 = this.f42769;
            if (i10 >= iArr8.length) {
                this.f42771 = true;
                this.f42766 = iArr8.length - 1;
            }
        }
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final float mo17394(C2243 c2243, boolean z) {
        float fMo17395 = mo17395(c2243.f7340);
        mo17396(c2243.f7340, z);
        InterfaceC5972 interfaceC5972 = c2243.f7343;
        int iMo17403 = interfaceC5972.mo17403();
        for (int i = 0; i < iMo17403; i++) {
            C6718 c6718Mo17397 = interfaceC5972.mo17397(i);
            mo17401(c6718Mo17397, interfaceC5972.mo17395(c6718Mo17397) * fMo17395, z);
        }
        return fMo17395;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final float mo17396(C6718 c6718, boolean z) {
        int i = this.f42768;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f42774) {
            if (this.f42769[i] == c6718.f22354) {
                if (i == this.f42768) {
                    this.f42768 = this.f42775[i];
                } else {
                    int[] iArr = this.f42775;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c6718.m18758(this.f42770);
                }
                c6718.f22351--;
                this.f42774--;
                this.f42769[i] = -1;
                if (this.f42771) {
                    this.f42766 = i;
                }
                return this.f42773[i];
            }
            i2++;
            i3 = i;
            i = this.f42775[i];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC5972
    public final void clear() {
        int i = this.f42768;
        for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
            C6718 c6718 = this.f42772.f38445[this.f42769[i]];
            if (c6718 != null) {
                c6718.m18758(this.f42770);
            }
            i = this.f42775[i];
        }
        this.f42768 = -1;
        this.f42766 = -1;
        this.f42771 = false;
        this.f42774 = 0;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo17404(C6718 c6718) {
        int i = this.f42768;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
                if (this.f42769[i] == c6718.f22354) {
                    return true;
                }
                i = this.f42775[i];
            }
        }
        return false;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final void mo17398() {
        int i = this.f42768;
        for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
            float[] fArr = this.f42773;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f42775[i];
        }
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final void mo17399(float f) {
        int i = this.f42768;
        for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
            float[] fArr = this.f42773;
            fArr[i] = fArr[i] / f;
            i = this.f42775[i];
        }
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17403() {
        return this.f42774;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final C6718 mo17397(int i) {
        int i2 = this.f42768;
        for (int i3 = 0; i2 != -1 && i3 < this.f42774; i3++) {
            if (i3 == i) {
                return this.f42772.f38445[this.f42769[i2]];
            }
            i2 = this.f42775[i2];
        }
        return null;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ᩷ */
    public final float mo17402(int i) {
        int i2 = this.f42768;
        for (int i3 = 0; i2 != -1 && i3 < this.f42774; i3++) {
            if (i3 == i) {
                return this.f42773[i2];
            }
            i2 = this.f42775[i2];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC5972
    /* JADX INFO: renamed from: ۙ */
    public final float mo17395(C6718 c6718) {
        int i = this.f42768;
        for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
            if (this.f42769[i] == c6718.f22354) {
                return this.f42773[i];
            }
            i = this.f42775[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f42768;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f42774; i2++) {
            StringBuilder sbM27333 = C10732.m27333(C14483.m34972(string, " -> "));
            sbM27333.append(this.f42773[i]);
            sbM27333.append(" : ");
            StringBuilder sbM27334 = C10732.m27333(sbM27333.toString());
            sbM27334.append(this.f42772.f38445[this.f42769[i]]);
            string = sbM27334.toString();
            i = this.f42775[i];
        }
        return string;
    }
}
