package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۛۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BEU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22460 f21556;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f21557;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21558;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9230 f21559;

    public C6380(C22460 c22460) {
        int iM50641 = c22460.m50641(8);
        this.f21556 = c22460;
        this.f21559 = new C9230(iM50641);
        this.f21557 = new int[iM50641];
        this.f21558 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18126() {
        m18125();
        return this.f21558;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9230 m18127() {
        m18125();
        return this.f21559;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m18125() {
        int i;
        if (this.f21558 >= 0) {
            return;
        }
        int iM50641 = 10;
        int i2 = 1;
        while (true) {
            int[] iArr = this.f21557;
            if (i2 < iArr.length) {
                iArr[i2] = iM50641;
                C22460 c22460 = this.f21556;
                int iM50642 = c22460.m50642(iM50641);
                switch (iM50642) {
                    case 1:
                        iM50641 += c22460.m50641(iM50641 + 1) + 3;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C7125("unknown tag byte: " + C5306.m15936(iM50642), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        iM50641 += 5;
                        break;
                    case 5:
                    case 6:
                        iM50641 += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM50641 += 3;
                        break;
                    case 15:
                        try {
                            iM50641 += 4;
                        } catch (C7125 e) {
                            e.m12508("...while preparsing cst " + C5306.m15934(i2) + " at offset " + C5306.m15938(iM50641));
                            throw e;
                        }
                        break;
                }
                i = 1;
                i2 += i;
            } else {
                this.f21558 = iM50641;
                BitSet bitSet = new BitSet(iArr.length);
                for (int i3 = 1; i3 < iArr.length; i3++) {
                    if (iArr[i3] != 0 && this.f21559.m24414(i3) == null) {
                        m18124(bitSet, i3);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC13487 m18124(BitSet bitSet, int i) {
        AbstractC13487 abstractC13487M18123;
        AbstractC13487 abstractC13487M37967;
        AbstractC13487 abstractC13487M18124;
        int i2;
        C22460 c22460 = this.f21556;
        C9230 c9230 = this.f21559;
        AbstractC13487 abstractC13487M24414 = c9230.m24414(i);
        if (abstractC13487M24414 != null) {
            return abstractC13487M24414;
        }
        int i3 = this.f21557[i];
        try {
            int iM50642 = c22460.m50642(i3);
            switch (iM50642) {
                case 1:
                    abstractC13487M18123 = m18123(i3);
                    bitSet.set(i);
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new C7125("unknown tag byte: ".concat(C5306.m15936(iM50642)), null);
                case 3:
                    abstractC13487M37967 = C15943.m37967(c22460.m50643(i3 + 1));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 4:
                    abstractC13487M37967 = C17435.m40933(c22460.m50643(i3 + 1));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 5:
                    abstractC13487M37967 = C4011.m12971(c22460.m50640(i3 + 1));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 6:
                    abstractC13487M37967 = C11468.m28823(c22460.m50640(i3 + 1));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 7:
                    abstractC13487M18123 = new C1028(C5085.m15363(((C9976) m18124(bitSet, c22460.m50641(i3 + 1))).getString()));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 8:
                    abstractC13487M37967 = m18124(bitSet, c22460.m50641(i3 + 1));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 9:
                    abstractC13487M18123 = new C16689((C1028) m18124(bitSet, c22460.m50641(i3 + 1)), (C0282) m18124(bitSet, c22460.m50641(i3 + 3)));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 10:
                    abstractC13487M18123 = new C18181((C1028) m18124(bitSet, c22460.m50641(i3 + 1)), (C0282) m18124(bitSet, c22460.m50641(i3 + 3)));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 11:
                    abstractC13487M18123 = new C23403((C1028) m18124(bitSet, c22460.m50641(i3 + 1)), (C0282) m18124(bitSet, c22460.m50641(i3 + 3)));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 12:
                    abstractC13487M18123 = new C0282((C9976) m18124(bitSet, c22460.m50641(i3 + 1)), (C9976) m18124(bitSet, c22460.m50641(i3 + 3)));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 15:
                    int iM50643 = c22460.m50642(i3 + 1);
                    int iM50641 = c22460.m50641(i3 + 2);
                    switch (iM50643) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            abstractC13487M18124 = (C16689) m18124(bitSet, iM50641);
                            break;
                        case 5:
                        case 8:
                            abstractC13487M18124 = (C18181) m18124(bitSet, iM50641);
                            break;
                        case 6:
                        case 7:
                            abstractC13487M18124 = m18124(bitSet, iM50641);
                            if (!(abstractC13487M18124 instanceof C18181) && !(abstractC13487M18124 instanceof C23403)) {
                                throw new C7125("Unsupported ref constant type for MethodHandle " + abstractC13487M18124.getClass(), null);
                            }
                            break;
                        case 9:
                            abstractC13487M18124 = (C23403) m18124(bitSet, iM50641);
                            break;
                        default:
                            throw new C7125("Unsupported MethodHandle kind: " + iM50643, null);
                    }
                    switch (iM50643) {
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
                            throw new IllegalArgumentException(C13645.m33382(iM50643, "invalid kind: "));
                    }
                    abstractC13487M37967 = C21165.m48269(i2, abstractC13487M18124);
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 16:
                    abstractC13487M18123 = new C7740(C6994.m19303(((C9976) m18124(bitSet, c22460.m50641(i3 + 1))).getString()));
                    abstractC13487M37967 = abstractC13487M18123;
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
                case 18:
                    abstractC13487M37967 = C3265.m10659(c22460.m50641(i3 + 1), (C0282) m18124(bitSet, c22460.m50641(i3 + 3)));
                    c9230.m24415(i, abstractC13487M37967);
                    return abstractC13487M37967;
            }
        } catch (C7125 e) {
            e.m12508("...while parsing cst " + C5306.m15934(i) + " at offset " + C5306.m15938(i3));
            throw e;
        } catch (RuntimeException e2) {
            C7125 c7125 = new C7125(null, e2);
            c7125.m12508("...while parsing cst " + C5306.m15934(i) + " at offset " + C5306.m15938(i3));
            throw c7125;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9976 m18123(int i) {
        C22460 c22460 = this.f21556;
        int iM50641 = c22460.m50641(i + 1);
        int i2 = i + 3;
        try {
            return new C9976(c22460.m50638(i2, iM50641 + i2));
        } catch (IllegalArgumentException e) {
            throw new C7125(null, e);
        }
    }
}
