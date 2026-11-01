package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۡۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BEU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11083 f29699;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14009 f29700;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f29701;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29702;

    public C8594(C14009 c14009) {
        int iM33871 = c14009.m33871(8);
        this.f29700 = c14009;
        this.f29699 = new C11083(iM33871);
        this.f29701 = new int[iM33871];
        this.f29702 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22374() {
        m22373();
        return this.f29702;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11083 m22375() {
        m22373();
        return this.f29699;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22373() {
        int i;
        if (this.f29702 >= 0) {
            return;
        }
        int iM33871 = 10;
        int i2 = 1;
        while (true) {
            int[] iArr = this.f29701;
            if (i2 < iArr.length) {
                iArr[i2] = iM33871;
                C14009 c14009 = this.f29700;
                int iM33868 = c14009.m33868(iM33871);
                switch (iM33868) {
                    case 1:
                        iM33871 += c14009.m33871(iM33871 + 1) + 3;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C1537("unknown tag byte: " + C22475.m49983(iM33868), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        iM33871 += 5;
                        break;
                    case 5:
                    case 6:
                        iM33871 += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM33871 += 3;
                        break;
                    case 15:
                        try {
                            iM33871 += 4;
                        } catch (C1537 e) {
                            e.m20021("...while preparsing cst " + C22475.m49982(i2) + " at offset " + C22475.m49978(iM33871));
                            throw e;
                        }
                        break;
                }
                i = 1;
                i2 += i;
            } else {
                this.f29702 = iM33871;
                BitSet bitSet = new BitSet(iArr.length);
                for (int i3 = 1; i3 < iArr.length; i3++) {
                    if (iArr[i3] != 0 && this.f29699.m27930(i3) == null) {
                        m22371(bitSet, i3);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC9901 m22371(BitSet bitSet, int i) {
        AbstractC9901 abstractC9901M22372;
        AbstractC9901 abstractC9901M48398;
        AbstractC9901 abstractC9901M22371;
        int i2;
        C14009 c14009 = this.f29700;
        C11083 c11083 = this.f29699;
        AbstractC9901 abstractC9901M27930 = c11083.m27930(i);
        if (abstractC9901M27930 != null) {
            return abstractC9901M27930;
        }
        int i3 = this.f29701[i];
        try {
            int iM33868 = c14009.m33868(i3);
            switch (iM33868) {
                case 1:
                    abstractC9901M22372 = m22372(i3);
                    bitSet.set(i);
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new C1537("unknown tag byte: ".concat(C22475.m49983(iM33868)), null);
                case 3:
                    abstractC9901M48398 = C21665.m48398(c14009.m33870(i3 + 1));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 4:
                    abstractC9901M48398 = C15316.m36677(c14009.m33870(i3 + 1));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 5:
                    abstractC9901M48398 = C7554.m20068(c14009.m33869(i3 + 1));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 6:
                    abstractC9901M48398 = C4025.m11530(c14009.m33869(i3 + 1));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 7:
                    abstractC9901M22372 = new C6143(C3320.m9827(((C17432) m22371(bitSet, c14009.m33871(i3 + 1))).getString()));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 8:
                    abstractC9901M48398 = m22371(bitSet, c14009.m33871(i3 + 1));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 9:
                    abstractC9901M22372 = new C23077((C6143) m22371(bitSet, c14009.m33871(i3 + 1)), (C0498) m22371(bitSet, c14009.m33871(i3 + 3)));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 10:
                    abstractC9901M22372 = new C20255((C6143) m22371(bitSet, c14009.m33871(i3 + 1)), (C0498) m22371(bitSet, c14009.m33871(i3 + 3)));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 11:
                    abstractC9901M22372 = new C18137((C6143) m22371(bitSet, c14009.m33871(i3 + 1)), (C0498) m22371(bitSet, c14009.m33871(i3 + 3)));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 12:
                    abstractC9901M22372 = new C0498((C17432) m22371(bitSet, c14009.m33871(i3 + 1)), (C17432) m22371(bitSet, c14009.m33871(i3 + 3)));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 15:
                    int iM33869 = c14009.m33868(i3 + 1);
                    int iM33871 = c14009.m33871(i3 + 2);
                    switch (iM33869) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            abstractC9901M22371 = (C23077) m22371(bitSet, iM33871);
                            break;
                        case 5:
                        case 8:
                            abstractC9901M22371 = (C20255) m22371(bitSet, iM33871);
                            break;
                        case 6:
                        case 7:
                            abstractC9901M22371 = m22371(bitSet, iM33871);
                            if (!(abstractC9901M22371 instanceof C20255) && !(abstractC9901M22371 instanceof C18137)) {
                                throw new C1537("Unsupported ref constant type for MethodHandle " + abstractC9901M22371.getClass(), null);
                            }
                            break;
                        case 9:
                            abstractC9901M22371 = (C18137) m22371(bitSet, iM33871);
                            break;
                        default:
                            throw new C1537("Unsupported MethodHandle kind: " + iM33869, null);
                    }
                    switch (iM33869) {
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                            i2 = 0;
                            break;
                        case 5:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 4;
                            break;
                        case 7:
                            i2 = 7;
                            break;
                        case 8:
                            i2 = 6;
                            break;
                        case 9:
                            i2 = 8;
                            break;
                        default:
                            throw new IllegalArgumentException(C8479.m22141(iM33869, "invalid kind: "));
                    }
                    abstractC9901M48398 = C16022.m37998(i2, abstractC9901M22371);
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 16:
                    abstractC9901M22372 = new C16727(C1909.m6215(((C17432) m22371(bitSet, c14009.m33871(i3 + 1))).getString()));
                    abstractC9901M48398 = abstractC9901M22372;
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
                case 18:
                    abstractC9901M48398 = C18843.m43476(c14009.m33871(i3 + 1), (C0498) m22371(bitSet, c14009.m33871(i3 + 3)));
                    c11083.m27931(i, abstractC9901M48398);
                    return abstractC9901M48398;
            }
        } catch (C1537 e) {
            e.m20021("...while parsing cst " + C22475.m49982(i) + " at offset " + C22475.m49978(i3));
            throw e;
        } catch (RuntimeException e2) {
            C1537 c1537 = new C1537(null, e2);
            c1537.m20021("...while parsing cst " + C22475.m49982(i) + " at offset " + C22475.m49978(i3));
            throw c1537;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17432 m22372(int i) {
        C14009 c14009 = this.f29700;
        int iM33871 = c14009.m33871(i + 1);
        int i2 = i + 3;
        try {
            return new C17432(c14009.m33866(i2, iM33871 + i2));
        } catch (IllegalArgumentException e) {
            throw new C1537(null, e);
        }
    }
}
