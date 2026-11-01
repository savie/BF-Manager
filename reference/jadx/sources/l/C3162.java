package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1J5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3162 implements InterfaceC4490 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C13664 f11903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11547 f11907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11906 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11901 = 8;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f11904 = new int[8];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f11899 = new int[8];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float[] f11902 = new float[8];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11905 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f11900 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f11898 = false;

    public C3162(C13664 c13664, C11547 c11547) {
        this.f11903 = c13664;
        this.f11907 = c11547;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9559(C15075 c15075, float f) {
        if (f == 0.0f) {
            mo9555(c15075, true);
            return;
        }
        int i = this.f11905;
        C13664 c13664 = this.f11903;
        if (i == -1) {
            this.f11905 = 0;
            this.f11902[0] = f;
            this.f11904[0] = c15075.f49146;
            this.f11899[0] = -1;
            c15075.f49154++;
            c15075.m36154(c13664);
            this.f11906++;
            if (this.f11898) {
                return;
            }
            int i2 = this.f11900 + 1;
            this.f11900 = i2;
            int[] iArr = this.f11904;
            if (i2 >= iArr.length) {
                this.f11898 = true;
                this.f11900 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f11906; i4++) {
            int i5 = this.f11904[i];
            int i6 = c15075.f49146;
            if (i5 == i6) {
                this.f11902[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f11899[i];
        }
        int length = this.f11900;
        int i7 = length + 1;
        if (this.f11898) {
            int[] iArr2 = this.f11904;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f11904;
        if (length >= iArr3.length && this.f11906 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f11904;
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
        int[] iArr5 = this.f11904;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f11901 * 2;
            this.f11901 = i9;
            this.f11898 = false;
            this.f11900 = length - 1;
            this.f11902 = Arrays.copyOf(this.f11902, i9);
            this.f11904 = Arrays.copyOf(this.f11904, this.f11901);
            this.f11899 = Arrays.copyOf(this.f11899, this.f11901);
        }
        this.f11904[length] = c15075.f49146;
        this.f11902[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f11899;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f11899[length] = this.f11905;
            this.f11905 = length;
        }
        c15075.f49154++;
        c15075.m36154(c13664);
        int i10 = this.f11906 + 1;
        this.f11906 = i10;
        if (!this.f11898) {
            this.f11900++;
        }
        int[] iArr7 = this.f11904;
        if (i10 >= iArr7.length) {
            this.f11898 = true;
        }
        if (this.f11900 >= iArr7.length) {
            this.f11898 = true;
            this.f11900 = iArr7.length - 1;
        }
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9560(C15075 c15075, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f11905;
            C13664 c13664 = this.f11903;
            if (i == -1) {
                this.f11905 = 0;
                this.f11902[0] = f;
                this.f11904[0] = c15075.f49146;
                this.f11899[0] = -1;
                c15075.f49154++;
                c15075.m36154(c13664);
                this.f11906++;
                if (this.f11898) {
                    return;
                }
                int i2 = this.f11900 + 1;
                this.f11900 = i2;
                int[] iArr = this.f11904;
                if (i2 >= iArr.length) {
                    this.f11898 = true;
                    this.f11900 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f11906; i4++) {
                int i5 = this.f11904[i];
                int i6 = c15075.f49146;
                if (i5 == i6) {
                    float[] fArr = this.f11902;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f11905) {
                            this.f11905 = this.f11899[i];
                        } else {
                            int[] iArr2 = this.f11899;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c15075.m36155(c13664);
                        }
                        if (this.f11898) {
                            this.f11900 = i;
                        }
                        c15075.f49154--;
                        this.f11906--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f11899[i];
            }
            int length = this.f11900;
            int i7 = length + 1;
            if (this.f11898) {
                int[] iArr3 = this.f11904;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f11904;
            if (length >= iArr4.length && this.f11906 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f11904;
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
            int[] iArr6 = this.f11904;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f11901 * 2;
                this.f11901 = i9;
                this.f11898 = false;
                this.f11900 = length - 1;
                this.f11902 = Arrays.copyOf(this.f11902, i9);
                this.f11904 = Arrays.copyOf(this.f11904, this.f11901);
                this.f11899 = Arrays.copyOf(this.f11899, this.f11901);
            }
            this.f11904[length] = c15075.f49146;
            this.f11902[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f11899;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f11899[length] = this.f11905;
                this.f11905 = length;
            }
            c15075.f49154++;
            c15075.m36154(c13664);
            this.f11906++;
            if (!this.f11898) {
                this.f11900++;
            }
            int i10 = this.f11900;
            int[] iArr8 = this.f11904;
            if (i10 >= iArr8.length) {
                this.f11898 = true;
                this.f11900 = iArr8.length - 1;
            }
        }
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo9553(C13664 c13664, boolean z) {
        float fMo9554 = mo9554(c13664.f45058);
        mo9555(c13664.f45058, z);
        InterfaceC4490 interfaceC4490 = c13664.f45055;
        int iMo9562 = interfaceC4490.mo9562();
        for (int i = 0; i < iMo9562; i++) {
            C15075 c15075Mo9556 = interfaceC4490.mo9556(i);
            mo9560(c15075Mo9556, interfaceC4490.mo9554(c15075Mo9556) * fMo9554, z);
        }
        return fMo9554;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo9555(C15075 c15075, boolean z) {
        int i = this.f11905;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f11906) {
            if (this.f11904[i] == c15075.f49146) {
                if (i == this.f11905) {
                    this.f11905 = this.f11899[i];
                } else {
                    int[] iArr = this.f11899;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c15075.m36155(this.f11903);
                }
                c15075.f49154--;
                this.f11906--;
                this.f11904[i] = -1;
                if (this.f11898) {
                    this.f11900 = i;
                }
                return this.f11902[i];
            }
            i2++;
            i3 = i;
            i = this.f11899[i];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC4490
    public final void clear() {
        int i = this.f11905;
        for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
            C15075 c15075 = this.f11907.f38836[this.f11904[i]];
            if (c15075 != null) {
                c15075.m36155(this.f11903);
            }
            i = this.f11899[i];
        }
        this.f11905 = -1;
        this.f11900 = -1;
        this.f11898 = false;
        this.f11906 = 0;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo9563(C15075 c15075) {
        int i = this.f11905;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
                if (this.f11904[i] == c15075.f49146) {
                    return true;
                }
                i = this.f11899[i];
            }
        }
        return false;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9557() {
        int i = this.f11905;
        for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
            float[] fArr = this.f11902;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f11899[i];
        }
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9558(float f) {
        int i = this.f11905;
        for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
            float[] fArr = this.f11902;
            fArr[i] = fArr[i] / f;
            i = this.f11899[i];
        }
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo9562() {
        return this.f11906;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15075 mo9556(int i) {
        int i2 = this.f11905;
        for (int i3 = 0; i2 != -1 && i3 < this.f11906; i3++) {
            if (i3 == i) {
                return this.f11907.f38836[this.f11904[i2]];
            }
            i2 = this.f11899[i2];
        }
        return null;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float mo9561(int i) {
        int i2 = this.f11905;
        for (int i3 = 0; i2 != -1 && i3 < this.f11906; i3++) {
            if (i3 == i) {
                return this.f11902[i2];
            }
            i2 = this.f11899[i2];
        }
        return 0.0f;
    }

    @Override // l.InterfaceC4490
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo9554(C15075 c15075) {
        int i = this.f11905;
        for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
            if (this.f11904[i] == c15075.f49146) {
                return this.f11902[i];
            }
            i = this.f11899[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f11905;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f11906; i2++) {
            StringBuilder sbM23356 = C9023.m23356(C15489.m37076(string, " -> "));
            sbM23356.append(this.f11902[i]);
            sbM23356.append(" : ");
            StringBuilder sbM23357 = C9023.m23356(sbM23356.toString());
            sbM23357.append(this.f11907.f38836[this.f11904[i]]);
            string = sbM23357.toString();
            i = this.f11899[i];
        }
        return string;
    }
}
