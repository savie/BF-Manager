package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C7370 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9103 f24243;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f24244;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24245;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f24246;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C21287 f24247;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9606 f24248;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24249;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1404 f24250;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f24251;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22792 f24252;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f24253;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f24255;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f24256;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f24257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f24258;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24259;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f24260;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SparseArray f24261;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f24262;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    public C7370(int i, int i2, InterfaceC1272 interfaceC1272, C1150 c1150, C9103 c9103) {
        this.f24243 = c9103;
        this.f24251 = i;
        this.f24259 = i2;
        this.f24255 = interfaceC1272;
        if (i == 1 || i == 2) {
            this.f24253 = Collections.singletonList(c1150);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f24253 = arrayList;
            arrayList.add(c1150);
        }
        this.f24247 = new C21287(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f24260 = sparseBooleanArray;
        this.f24244 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f24261 = sparseArray;
        this.f24258 = new SparseIntArray();
        this.f24248 = new C9606();
        this.f24246 = InterfaceC12789.f40905;
        this.f24249 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC22792) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C8116(new C2895(this)));
        this.f24252 = null;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        byte[] bArrM48497 = this.f24247.m48497();
        C9169 c9169 = (C9169) interfaceC19502;
        c9169.mo10078(false, 0, 940, bArrM48497);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c9169.mo10070(i, false);
                    return true;
                }
                if (bArrM48497[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        if ((this.f24259 & 1) == 0) {
            interfaceC12789 = new C8729(interfaceC12789, this.f24255);
        }
        this.f24246 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        C1404 c1404;
        C20782.m47568(this.f24251 != 2);
        List list = this.f24253;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1150 c1150 = (C1150) list.get(i);
            boolean z = c1150.m4246() == -9223372036854775807L;
            if (!z) {
                long jM4243 = c1150.m4243();
                z = (jM4243 == -9223372036854775807L || jM4243 == 0 || jM4243 == j2) ? false : true;
            }
            if (z) {
                c1150.m4250(j2);
            }
        }
        if (j2 != 0 && (c1404 = this.f24250) != null) {
            c1404.m1676(j2);
        }
        this.f24247.m48496(0);
        this.f24258.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f24261;
            if (i2 < sparseArray.size()) {
                ((InterfaceC22792) sparseArray.valueAt(i2)).mo18561();
                i2++;
            } else {
                this.f24245 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        boolean z;
        long length = interfaceC19502.getLength();
        int i = 0;
        int i2 = this.f24251;
        boolean z2 = i2 == 2;
        if (this.f24257) {
            C9606 c9606 = this.f24248;
            if (length != -1 && !z2 && !c9606.m25089()) {
                return c9606.m25087(interfaceC19502, c18756, this.f24249);
            }
            if (!this.f24256) {
                this.f24256 = true;
                if (c9606.m25088() != -9223372036854775807L) {
                    C1404 c1404 = new C1404(c9606.m25090(), c9606.m25088(), length, this.f24249);
                    this.f24250 = c1404;
                    this.f24246.mo16659(c1404.m1675());
                } else {
                    this.f24246.mo16659(new C0857(c9606.m25088()));
                }
            }
            if (this.f24262) {
                this.f24262 = false;
                mo2292(0L, 0L);
                if (interfaceC19502.getPosition() != 0) {
                    c18756.f60914 = 0L;
                    return 1;
                }
            }
            C1404 c1405 = this.f24250;
            if (c1405 != null && c1405.m1677()) {
                return this.f24250.m1674(interfaceC19502, c18756);
            }
        } else {
            z2 = z2;
        }
        C21287 c21287 = this.f24247;
        byte[] bArrM48497 = c21287.m48497();
        int i3 = 188;
        if (9400 - c21287.m48516() < 188) {
            int iM48486 = c21287.m48486();
            if (iM48486 > 0) {
                System.arraycopy(bArrM48497, c21287.m48516(), bArrM48497, 0, iM48486);
            }
            c21287.m48491(iM48486, bArrM48497);
        }
        while (true) {
            int iM48487 = c21287.m48486();
            SparseArray sparseArray = this.f24261;
            if (iM48487 < i3) {
                int iM48509 = c21287.m48509();
                int i4 = interfaceC19502.read(bArrM48497, iM48509, 9400 - iM48509);
                if (i4 == -1) {
                    while (i < sparseArray.size()) {
                        InterfaceC22792 interfaceC22792 = (InterfaceC22792) sparseArray.valueAt(i);
                        if (interfaceC22792 instanceof C6625) {
                            C6625 c6625 = (C6625) interfaceC22792;
                            z = z2;
                            if (c6625.m18564(z)) {
                                c6625.mo18562(1, new C21287());
                            }
                        } else {
                            z = z2;
                        }
                        i++;
                        z2 = z;
                    }
                    return -1;
                }
                c21287.m48517(iM48509 + i4);
                i3 = 188;
            } else {
                int iM48516 = c21287.m48516();
                int iM485010 = c21287.m48509();
                byte[] bArrM48498 = c21287.m48497();
                int i5 = iM48516;
                while (i5 < iM485010 && bArrM48498[i5] != 71) {
                    i5++;
                }
                c21287.m48510(i5);
                int i6 = i5 + 188;
                if (i6 > iM485010) {
                    int i7 = (i5 - iM48516) + this.f24245;
                    this.f24245 = i7;
                    if (i2 == 2 && i7 > 376) {
                        throw C2970.m9688("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f24245 = 0;
                }
                int iM485011 = c21287.m48509();
                if (i6 > iM485011) {
                    return 0;
                }
                int iM48500 = c21287.m48500();
                if ((8388608 & iM48500) != 0) {
                    c21287.m48510(i6);
                    return 0;
                }
                int i8 = (4194304 & iM48500) != 0 ? 1 : 0;
                int i9 = (2096896 & iM48500) >> 8;
                boolean z3 = (iM48500 & 32) != 0;
                InterfaceC22792 interfaceC22793 = (iM48500 & 16) != 0 ? (InterfaceC22792) sparseArray.get(i9) : null;
                if (interfaceC22793 == null) {
                    c21287.m48510(i6);
                    return 0;
                }
                if (i2 != 2) {
                    int i10 = iM48500 & 15;
                    SparseIntArray sparseIntArray = this.f24258;
                    int i11 = sparseIntArray.get(i9, i10 - 1);
                    sparseIntArray.put(i9, i10);
                    if (i11 == i10) {
                        c21287.m48510(i6);
                        return 0;
                    }
                    if (i10 != ((i11 + 1) & 15)) {
                        interfaceC22793.mo18561();
                    }
                }
                if (z3) {
                    int iM48493 = c21287.m48493();
                    i8 |= (c21287.m48493() & 64) != 0 ? 2 : 0;
                    c21287.m48503(iM48493 - 1);
                }
                boolean z4 = this.f24257;
                if (i2 == 2 || z4 || !this.f24244.get(i9, false)) {
                    c21287.m48517(i6);
                    interfaceC22793.mo18562(i8, c21287);
                    c21287.m48517(iM485011);
                }
                if (i2 != 2 && !z4 && this.f24257 && length != -1) {
                    this.f24262 = true;
                }
                c21287.m48510(i6);
                return 0;
            }
        }
    }
}
