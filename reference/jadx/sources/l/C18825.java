package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18825 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18119 f61001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f61002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61003;

    public C18825(AbstractC18119 abstractC18119, int i) {
        this.f61001 = abstractC18119;
        this.f61003 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43447() {
        return this.f61003;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m43435(int i) {
        this.f61003 = i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m43456() {
        int i;
        m43436();
        int i2 = this.f61003;
        int i3 = i2 + 1;
        AbstractC18119 abstractC18119 = this.f61001;
        byte bMo5855 = abstractC18119.mo5855(i2);
        int i4 = bMo5855 & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte bMo5856 = abstractC18119.mo5855(i3);
            int i6 = bMo5856 & 255;
            int i7 = ((bMo5856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo5855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte bMo5857 = abstractC18119.mo5855(i5);
                int i9 = bMo5857 & 255;
                int i10 = i7 | ((bMo5857 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte bMo5858 = abstractC18119.mo5855(i8);
                    int i11 = bMo5858 & 255;
                    int i12 = i10 | ((bMo5858 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int iMo5855 = abstractC18119.mo5855(i5) & 255;
                        if (iMo5855 > 127) {
                            throw new C20749(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                        int i14 = i12 | (iMo5855 << 28);
                        i3 = i13;
                        i = i14;
                    }
                }
            }
            i3 = i5;
        }
        this.f61003 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m43449() {
        return m43429(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43429(boolean z) {
        m43436();
        int i = this.f61003;
        int i2 = i + 1;
        AbstractC18119 abstractC18119 = this.f61001;
        byte bMo5855 = abstractC18119.mo5855(i);
        int i3 = bMo5855 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo5856 = abstractC18119.mo5855(i2);
            int i5 = bMo5856 & 255;
            int i6 = ((bMo5856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo5855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo5857 = abstractC18119.mo5855(i4);
                int i8 = bMo5857 & 255;
                i3 = ((bMo5857 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo5858 = abstractC18119.mo5855(i7);
                    int i9 = bMo5858 & 255;
                    i3 |= (bMo5858 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo5859 = abstractC18119.mo5855(i2);
                        if (bMo5859 < 0) {
                            throw new C20749(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                        if ((bMo5859 & 15) > 7 && !z) {
                            throw new C20749(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                        i3 |= bMo5859 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
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
        this.f61003 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m43441() {
        return m43429(true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m43445() {
        m43436();
        int i = this.f61003;
        int i2 = i + 1;
        AbstractC18119 abstractC18119 = this.f61001;
        byte bMo5855 = abstractC18119.mo5855(i);
        int i3 = bMo5855 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo5856 = abstractC18119.mo5855(i2);
            int i5 = bMo5856 & 255;
            int i6 = ((bMo5856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo5855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo5857 = abstractC18119.mo5855(i4);
                int i8 = bMo5857 & 255;
                i3 = ((bMo5857 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo5858 = abstractC18119.mo5855(i7);
                    int i9 = bMo5858 & 255;
                    i3 |= (bMo5858 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo5859 = abstractC18119.mo5855(i2);
                        if (bMo5859 < 0) {
                            throw new C20749(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                        i3 |= bMo5859 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
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
        this.f61003 = i2;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r3
      0x0045: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:5:0x0015, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m43452() {
        m43436();
        int i = this.f61003;
        int i2 = i + 1;
        AbstractC18119 abstractC18119 = this.f61001;
        if (abstractC18119.mo5855(i) < 0) {
            int i3 = i + 2;
            if (abstractC18119.mo5855(i2) < 0) {
                i2 = i + 3;
                if (abstractC18119.mo5855(i3) < 0) {
                    i3 = i + 4;
                    if (abstractC18119.mo5855(i2) < 0) {
                        i2 = i + 5;
                        if (abstractC18119.mo5855(i3) < 0) {
                            throw new C20749(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        this.f61003 = i2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m43454() {
        return this.f61001.m42183(this.f61003);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m43439() {
        return this.f61001.m42181(this.f61003);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43453() {
        int i = this.f61003;
        int iM42181 = this.f61001.m42181(i);
        this.f61003 = i + 1;
        return iM42181;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m43434() {
        int i = this.f61003;
        byte bMo5855 = this.f61001.mo5855(i);
        this.f61003 = i + 1;
        return bMo5855;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m43442() {
        this.f61003++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43437(int i) {
        this.f61003 += i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m43430() {
        return this.f61001.m42183(this.f61003 + 2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43448(int i) {
        return this.f61001.mo5859(this.f61003 + i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m43432() {
        return this.f61001.mo5854(this.f61003 + 2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m43443() {
        return this.f61001.mo5855(this.f61003 + 1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m43444(int i) {
        int iMo5855;
        int iMo5856;
        int iMo5857;
        m43436();
        int i2 = this.f61003;
        AbstractC18119 abstractC18119 = this.f61001;
        if (i != 1) {
            if (i == 2) {
                iMo5856 = abstractC18119.mo5855(i2) & 255;
                iMo5857 = abstractC18119.mo5855(i2 + 1) << 8;
            } else if (i == 3) {
                iMo5856 = (abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8);
                iMo5857 = abstractC18119.mo5855(i2 + 2) << 16;
            } else if (i == 4) {
                iMo5856 = (abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16);
                iMo5857 = abstractC18119.mo5855(i2 + 3) << 24;
            } else {
                throw new C20749(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f61003));
            }
            iMo5855 = iMo5857 | iMo5856;
        } else {
            iMo5855 = abstractC18119.mo5855(i2);
        }
        this.f61003 = i2 + i;
        return iMo5855;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m43431(int i) {
        m43436();
        int i2 = this.f61003;
        AbstractC18119 abstractC18119 = this.f61001;
        int iMo5855 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte bMo5855 = abstractC18119.mo5855(i2 + 3);
                        if (bMo5855 < 0) {
                            throw new C20749(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.f61003));
                        }
                        iMo5855 = bMo5855 << 24;
                    } else {
                        throw new C20749(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f61003));
                    }
                }
                iMo5855 |= (abstractC18119.mo5855(i2 + 2) & 255) << 16;
            }
            iMo5855 |= (abstractC18119.mo5855(i2 + 1) & 255) << 8;
        }
        int iMo5856 = (abstractC18119.mo5855(i2) & 255) | iMo5855;
        this.f61003 = i2 + i;
        return iMo5856;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m43440(int i) {
        int iMo5855;
        int iMo5856;
        byte bMo5855;
        m43436();
        int i2 = this.f61003;
        AbstractC18119 abstractC18119 = this.f61001;
        if (i != 1) {
            if (i == 2) {
                iMo5856 = (abstractC18119.mo5855(i2) & 255) << 16;
                bMo5855 = abstractC18119.mo5855(i2 + 1);
            } else if (i == 3) {
                iMo5856 = ((abstractC18119.mo5855(i2) & 255) << 8) | ((abstractC18119.mo5855(i2 + 1) & 255) << 16);
                bMo5855 = abstractC18119.mo5855(i2 + 2);
            } else if (i == 4) {
                iMo5856 = (abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16);
                bMo5855 = abstractC18119.mo5855(i2 + 3);
            } else {
                throw new C20749(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f61003));
            }
            iMo5855 = (bMo5855 << 24) | iMo5856;
        } else {
            iMo5855 = abstractC18119.mo5855(i2) << 24;
        }
        this.f61003 = i2 + i;
        return iMo5855;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m43455(int i) {
        long jMo5855;
        long jMo5856;
        byte bMo5855;
        m43436();
        int i2 = this.f61003;
        AbstractC18119 abstractC18119 = this.f61001;
        switch (i) {
            case 1:
                jMo5855 = ((long) abstractC18119.mo5855(i2)) << 56;
                this.f61003 = i2 + i;
                return jMo5855;
            case 2:
                jMo5856 = (((long) abstractC18119.mo5855(i2)) & 255) << 48;
                bMo5855 = abstractC18119.mo5855(i2 + 1);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 3:
                jMo5856 = ((((long) abstractC18119.mo5855(i2)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 1))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 2);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 4:
                jMo5856 = ((((long) abstractC18119.mo5855(i2)) & 255) << 32) | ((((long) abstractC18119.mo5855(i2 + 1)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 2))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 3);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 5:
                jMo5856 = ((((long) abstractC18119.mo5855(i2 + 1)) & 255) << 32) | ((((long) abstractC18119.mo5855(i2)) & 255) << 24) | ((((long) abstractC18119.mo5855(i2 + 2)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 3))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 4);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 6:
                jMo5856 = ((((long) abstractC18119.mo5855(i2 + 2)) & 255) << 32) | ((long) ((abstractC18119.mo5855(i2) & 255) << 16)) | ((((long) abstractC18119.mo5855(i2 + 1)) & 255) << 24) | ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 4))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 5);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 7:
                jMo5856 = ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 32) | ((long) (((abstractC18119.mo5855(i2) & 255) << 8) | ((abstractC18119.mo5855(i2 + 1) & 255) << 16))) | ((((long) abstractC18119.mo5855(i2 + 2)) & 255) << 24) | ((((long) abstractC18119.mo5855(i2 + 4)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 5))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 6);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            case 8:
                jMo5856 = ((((long) abstractC18119.mo5855(i2 + 4)) & 255) << 32) | ((long) ((abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16))) | ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 24) | ((((long) abstractC18119.mo5855(i2 + 5)) & 255) << 40) | ((255 & ((long) abstractC18119.mo5855(i2 + 6))) << 48);
                bMo5855 = abstractC18119.mo5855(i2 + 7);
                jMo5855 = jMo5856 | (((long) bMo5855) << 56);
                this.f61003 = i2 + i;
                return jMo5855;
            default:
                throw new C20749(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f61003));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m43433(int i) {
        int iMo5855;
        int iMo5856;
        int iMo5857;
        long j;
        long jMo5855;
        long jMo5856;
        long jMo5857;
        long jMo5858;
        m43436();
        int i2 = this.f61003;
        AbstractC18119 abstractC18119 = this.f61001;
        switch (i) {
            case 1:
                iMo5855 = abstractC18119.mo5855(i2);
                j = iMo5855;
                this.f61003 = i2 + i;
                return j;
            case 2:
                iMo5856 = abstractC18119.mo5855(i2) & 255;
                iMo5857 = abstractC18119.mo5855(i2 + 1) << 8;
                iMo5855 = iMo5856 | iMo5857;
                j = iMo5855;
                this.f61003 = i2 + i;
                return j;
            case 3:
                iMo5856 = (abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8);
                iMo5857 = abstractC18119.mo5855(i2 + 2) << 16;
                iMo5855 = iMo5856 | iMo5857;
                j = iMo5855;
                this.f61003 = i2 + i;
                return j;
            case 4:
                jMo5855 = (abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16);
                jMo5856 = ((long) abstractC18119.mo5855(i2 + 3)) << 24;
                j = jMo5855 | jMo5856;
                this.f61003 = i2 + i;
                return j;
            case 5:
                jMo5855 = ((long) ((abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16))) | ((255 & ((long) abstractC18119.mo5855(i2 + 3))) << 24);
                jMo5856 = ((long) abstractC18119.mo5855(i2 + 4)) << 32;
                j = jMo5855 | jMo5856;
                this.f61003 = i2 + i;
                return j;
            case 6:
                jMo5857 = ((((long) abstractC18119.mo5855(i2 + 4)) & 255) << 32) | ((long) ((abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16))) | ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 24);
                jMo5858 = ((long) abstractC18119.mo5855(i2 + 5)) << 40;
                j = jMo5858 | jMo5857;
                this.f61003 = i2 + i;
                return j;
            case 7:
                jMo5857 = ((((long) abstractC18119.mo5855(i2 + 4)) & 255) << 32) | ((long) ((abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16))) | ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 24) | ((255 & ((long) abstractC18119.mo5855(i2 + 5))) << 40);
                jMo5858 = ((long) abstractC18119.mo5855(i2 + 6)) << 48;
                j = jMo5858 | jMo5857;
                this.f61003 = i2 + i;
                return j;
            case 8:
                jMo5855 = ((((long) abstractC18119.mo5855(i2 + 6)) & 255) << 48) | ((((long) abstractC18119.mo5855(i2 + 4)) & 255) << 32) | ((long) ((abstractC18119.mo5855(i2) & 255) | ((abstractC18119.mo5855(i2 + 1) & 255) << 8) | ((abstractC18119.mo5855(i2 + 2) & 255) << 16))) | ((((long) abstractC18119.mo5855(i2 + 3)) & 255) << 24) | ((((long) abstractC18119.mo5855(i2 + 5)) & 255) << 40);
                jMo5856 = ((long) abstractC18119.mo5855(i2 + 7)) << 56;
                j = jMo5855 | jMo5856;
                this.f61003 = i2 + i;
                return j;
            default:
                throw new C20749(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f61003));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m43446(int i) {
        m43436();
        int[] iArr = new int[1];
        String strM9324 = C3109.m9324(this.f61001, this.f61003, i, iArr);
        this.f61003 += iArr[0];
        return strM9324;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43438(int i, Writer writer, boolean z) {
        m43436();
        int i2 = this.f61003;
        this.f61003 = C3109.m9323(writer, this.f61001, i2, i, z) + i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43450() {
        if (this.f61002) {
            return;
        }
        this.f61002 = true;
        this.f61001.m42182(this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m43451() {
        this.f61002 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43436() {
        if (this.f61002) {
            throw new IllegalStateException("Recycled");
        }
    }
}
