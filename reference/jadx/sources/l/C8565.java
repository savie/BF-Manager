package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Writer;

/* JADX INFO: renamed from: l.۠ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65V2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8565 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2599 f27962;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f27963;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27964;

    public C8565(AbstractC2599 abstractC2599, int i) {
        this.f27962 = abstractC2599;
        this.f27964 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23001() {
        return this.f27964;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22981(int i) {
        this.f27964 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m23006() {
        int i;
        m22983();
        int i2 = this.f27964;
        int i3 = i2 + 1;
        AbstractC2599 abstractC2599 = this.f27962;
        byte bMo8717 = abstractC2599.mo8717(i2);
        int i4 = bMo8717 & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte bMo8718 = abstractC2599.mo8717(i3);
            int i6 = bMo8718 & 255;
            int i7 = ((bMo8718 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo8717 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte bMo8719 = abstractC2599.mo8717(i5);
                int i9 = bMo8719 & 255;
                int i10 = i7 | ((bMo8719 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte bMo87110 = abstractC2599.mo8717(i8);
                    int i11 = bMo87110 & 255;
                    int i12 = i10 | ((bMo87110 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int iMo8717 = abstractC2599.mo8717(i5) & 255;
                        if (iMo8717 > 127) {
                            throw new C23044(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                        int i14 = i12 | (iMo8717 << 28);
                        i3 = i13;
                        i = i14;
                    }
                }
            }
            i3 = i5;
        }
        this.f27964 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m22996() {
        return m22979(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22979(boolean z) {
        m22983();
        int i = this.f27964;
        int i2 = i + 1;
        AbstractC2599 abstractC2599 = this.f27962;
        byte bMo8717 = abstractC2599.mo8717(i);
        int i3 = bMo8717 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo8718 = abstractC2599.mo8717(i2);
            int i5 = bMo8718 & 255;
            int i6 = ((bMo8718 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo8717 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo8719 = abstractC2599.mo8717(i4);
                int i8 = bMo8719 & 255;
                i3 = ((bMo8719 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo87110 = abstractC2599.mo8717(i7);
                    int i9 = bMo87110 & 255;
                    i3 |= (bMo87110 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo87111 = abstractC2599.mo8717(i2);
                        if (bMo87111 < 0) {
                            throw new C23044(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                        if ((bMo87111 & 15) > 7 && !z) {
                            throw new C23044(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                        i3 |= bMo87111 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f27964 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22990() {
        return m22979(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m22986() {
        m22983();
        int i = this.f27964;
        int i2 = i + 1;
        AbstractC2599 abstractC2599 = this.f27962;
        byte bMo8717 = abstractC2599.mo8717(i);
        int i3 = bMo8717 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo8718 = abstractC2599.mo8717(i2);
            int i5 = bMo8718 & 255;
            int i6 = ((bMo8718 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo8717 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo8719 = abstractC2599.mo8717(i4);
                int i8 = bMo8719 & 255;
                i3 = ((bMo8719 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo87110 = abstractC2599.mo8717(i7);
                    int i9 = bMo87110 & 255;
                    i3 |= (bMo87110 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo87111 = abstractC2599.mo8717(i2);
                        if (bMo87111 < 0) {
                            throw new C23044(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                        i3 |= bMo87111 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f27964 = i2;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r3
      0x0045: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:5:0x0015, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m23000() {
        m22983();
        int i = this.f27964;
        int i2 = i + 1;
        AbstractC2599 abstractC2599 = this.f27962;
        if (abstractC2599.mo8717(i) < 0) {
            int i3 = i + 2;
            if (abstractC2599.mo8717(i2) < 0) {
                i2 = i + 3;
                if (abstractC2599.mo8717(i3) < 0) {
                    i3 = i + 4;
                    if (abstractC2599.mo8717(i2) < 0) {
                        i2 = i + 5;
                        if (abstractC2599.mo8717(i3) < 0) {
                            throw new C23044(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        this.f27964 = i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22993() {
        return this.f27962.m8721(this.f27964);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m22998() {
        return this.f27962.m8716(this.f27964);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22997() {
        int i = this.f27964;
        int iM8716 = this.f27962.m8716(i);
        this.f27964 = i + 1;
        return iM8716;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22980() {
        int i = this.f27964;
        byte bMo8717 = this.f27962.mo8717(i);
        this.f27964 = i + 1;
        return bMo8717;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m22982() {
        this.f27964++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22984(int i) {
        this.f27964 += i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m22991() {
        return this.f27962.m8721(this.f27964 + 2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23002(int i) {
        return this.f27962.mo8725(this.f27964 + i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m23003() {
        return this.f27962.mo8722(this.f27964 + 2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22988() {
        return this.f27962.mo8717(this.f27964 + 1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22989(int i) {
        int iMo8717;
        int iMo8718;
        int iMo8719;
        m22983();
        int i2 = this.f27964;
        AbstractC2599 abstractC2599 = this.f27962;
        if (i != 1) {
            if (i == 2) {
                iMo8718 = abstractC2599.mo8717(i2) & 255;
                iMo8719 = abstractC2599.mo8717(i2 + 1) << 8;
            } else if (i == 3) {
                iMo8718 = (abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8);
                iMo8719 = abstractC2599.mo8717(i2 + 2) << 16;
            } else if (i == 4) {
                iMo8718 = (abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16);
                iMo8719 = abstractC2599.mo8717(i2 + 3) << 24;
            } else {
                throw new C23044(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f27964));
            }
            iMo8717 = iMo8719 | iMo8718;
        } else {
            iMo8717 = abstractC2599.mo8717(i2);
        }
        this.f27964 = i2 + i;
        return iMo8717;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m22992(int i) {
        m22983();
        int i2 = this.f27964;
        AbstractC2599 abstractC2599 = this.f27962;
        int iMo8717 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte bMo8717 = abstractC2599.mo8717(i2 + 3);
                        if (bMo8717 < 0) {
                            throw new C23044(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.f27964));
                        }
                        iMo8717 = bMo8717 << 24;
                    } else {
                        throw new C23044(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f27964));
                    }
                }
                iMo8717 |= (abstractC2599.mo8717(i2 + 2) & 255) << 16;
            }
            iMo8717 |= (abstractC2599.mo8717(i2 + 1) & 255) << 8;
        }
        int iMo8718 = (abstractC2599.mo8717(i2) & 255) | iMo8717;
        this.f27964 = i2 + i;
        return iMo8718;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m22999(int i) {
        int iMo8717;
        int iMo8718;
        byte bMo8717;
        m22983();
        int i2 = this.f27964;
        AbstractC2599 abstractC2599 = this.f27962;
        if (i != 1) {
            if (i == 2) {
                iMo8718 = (abstractC2599.mo8717(i2) & 255) << 16;
                bMo8717 = abstractC2599.mo8717(i2 + 1);
            } else if (i == 3) {
                iMo8718 = ((abstractC2599.mo8717(i2) & 255) << 8) | ((abstractC2599.mo8717(i2 + 1) & 255) << 16);
                bMo8717 = abstractC2599.mo8717(i2 + 2);
            } else if (i == 4) {
                iMo8718 = (abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16);
                bMo8717 = abstractC2599.mo8717(i2 + 3);
            } else {
                throw new C23044(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f27964));
            }
            iMo8717 = (bMo8717 << 24) | iMo8718;
        } else {
            iMo8717 = abstractC2599.mo8717(i2) << 24;
        }
        this.f27964 = i2 + i;
        return iMo8717;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m22994(int i) {
        long jMo8717;
        long jMo8718;
        byte bMo8717;
        m22983();
        int i2 = this.f27964;
        AbstractC2599 abstractC2599 = this.f27962;
        switch (i) {
            case 1:
                jMo8717 = ((long) abstractC2599.mo8717(i2)) << 56;
                this.f27964 = i2 + i;
                return jMo8717;
            case 2:
                jMo8718 = (((long) abstractC2599.mo8717(i2)) & 255) << 48;
                bMo8717 = abstractC2599.mo8717(i2 + 1);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 3:
                jMo8718 = ((((long) abstractC2599.mo8717(i2)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 1))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 2);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 4:
                jMo8718 = ((((long) abstractC2599.mo8717(i2)) & 255) << 32) | ((((long) abstractC2599.mo8717(i2 + 1)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 2))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 3);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 5:
                jMo8718 = ((((long) abstractC2599.mo8717(i2 + 1)) & 255) << 32) | ((((long) abstractC2599.mo8717(i2)) & 255) << 24) | ((((long) abstractC2599.mo8717(i2 + 2)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 3))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 4);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 6:
                jMo8718 = ((((long) abstractC2599.mo8717(i2 + 2)) & 255) << 32) | ((long) ((abstractC2599.mo8717(i2) & 255) << 16)) | ((((long) abstractC2599.mo8717(i2 + 1)) & 255) << 24) | ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 4))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 5);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 7:
                jMo8718 = ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 32) | ((long) (((abstractC2599.mo8717(i2) & 255) << 8) | ((abstractC2599.mo8717(i2 + 1) & 255) << 16))) | ((((long) abstractC2599.mo8717(i2 + 2)) & 255) << 24) | ((((long) abstractC2599.mo8717(i2 + 4)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 5))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 6);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            case 8:
                jMo8718 = ((((long) abstractC2599.mo8717(i2 + 4)) & 255) << 32) | ((long) ((abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16))) | ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 24) | ((((long) abstractC2599.mo8717(i2 + 5)) & 255) << 40) | ((255 & ((long) abstractC2599.mo8717(i2 + 6))) << 48);
                bMo8717 = abstractC2599.mo8717(i2 + 7);
                jMo8717 = jMo8718 | (((long) bMo8717) << 56);
                this.f27964 = i2 + i;
                return jMo8717;
            default:
                throw new C23044(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f27964));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m23004(int i) {
        int iMo8717;
        int iMo8718;
        int iMo8719;
        long j;
        long jMo8717;
        long jMo8718;
        long jMo8719;
        long jMo87110;
        m22983();
        int i2 = this.f27964;
        AbstractC2599 abstractC2599 = this.f27962;
        switch (i) {
            case 1:
                iMo8717 = abstractC2599.mo8717(i2);
                j = iMo8717;
                this.f27964 = i2 + i;
                return j;
            case 2:
                iMo8718 = abstractC2599.mo8717(i2) & 255;
                iMo8719 = abstractC2599.mo8717(i2 + 1) << 8;
                iMo8717 = iMo8718 | iMo8719;
                j = iMo8717;
                this.f27964 = i2 + i;
                return j;
            case 3:
                iMo8718 = (abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8);
                iMo8719 = abstractC2599.mo8717(i2 + 2) << 16;
                iMo8717 = iMo8718 | iMo8719;
                j = iMo8717;
                this.f27964 = i2 + i;
                return j;
            case 4:
                jMo8717 = (abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16);
                jMo8718 = ((long) abstractC2599.mo8717(i2 + 3)) << 24;
                j = jMo8717 | jMo8718;
                this.f27964 = i2 + i;
                return j;
            case 5:
                jMo8717 = ((long) ((abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16))) | ((255 & ((long) abstractC2599.mo8717(i2 + 3))) << 24);
                jMo8718 = ((long) abstractC2599.mo8717(i2 + 4)) << 32;
                j = jMo8717 | jMo8718;
                this.f27964 = i2 + i;
                return j;
            case 6:
                jMo8719 = ((((long) abstractC2599.mo8717(i2 + 4)) & 255) << 32) | ((long) ((abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16))) | ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 24);
                jMo87110 = ((long) abstractC2599.mo8717(i2 + 5)) << 40;
                j = jMo87110 | jMo8719;
                this.f27964 = i2 + i;
                return j;
            case 7:
                jMo8719 = ((((long) abstractC2599.mo8717(i2 + 4)) & 255) << 32) | ((long) ((abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16))) | ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 24) | ((255 & ((long) abstractC2599.mo8717(i2 + 5))) << 40);
                jMo87110 = ((long) abstractC2599.mo8717(i2 + 6)) << 48;
                j = jMo87110 | jMo8719;
                this.f27964 = i2 + i;
                return j;
            case 8:
                jMo8717 = ((((long) abstractC2599.mo8717(i2 + 6)) & 255) << 48) | ((((long) abstractC2599.mo8717(i2 + 4)) & 255) << 32) | ((long) ((abstractC2599.mo8717(i2) & 255) | ((abstractC2599.mo8717(i2 + 1) & 255) << 8) | ((abstractC2599.mo8717(i2 + 2) & 255) << 16))) | ((((long) abstractC2599.mo8717(i2 + 3)) & 255) << 24) | ((((long) abstractC2599.mo8717(i2 + 5)) & 255) << 40);
                jMo8718 = ((long) abstractC2599.mo8717(i2 + 7)) << 56;
                j = jMo8717 | jMo8718;
                this.f27964 = i2 + i;
                return j;
            default:
                throw new C23044(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f27964));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m22987(int i) {
        m22983();
        int[] iArr = new int[1];
        String strM47598 = C20806.m47598(this.f27962, this.f27964, i, iArr);
        this.f27964 += iArr[0];
        return strM47598;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22985(int i, Writer writer, boolean z) {
        m22983();
        int i2 = this.f27964;
        this.f27964 = C20806.m47597(writer, this.f27962, i2, i, z) + i2;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m22995() {
        if (this.f27963) {
            return;
        }
        this.f27963 = true;
        this.f27962.m8718(this);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m23005() {
        this.f27963 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22983() {
        if (this.f27963) {
            throw new IllegalStateException("Recycled");
        }
    }
}
