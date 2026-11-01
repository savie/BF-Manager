package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15130 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f49422;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f49423;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4149 f49424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49425;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f49426;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f49427;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final SparseArray f49428;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f49429;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C13013 f49430;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2460 f49431;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3839 f49432;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f49433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f49434;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f49435;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f49436;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f49437;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f49438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f49439;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC19363 f49440;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f49441;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    public C15130(int i, int i2, InterfaceC13302 interfaceC13302, C6694 c6694, C4149 c4149) {
        this.f49424 = c4149;
        this.f49422 = i;
        this.f49423 = i2;
        this.f49439 = interfaceC13302;
        if (i == 1 || i == 2) {
            this.f49436 = Collections.singletonList(c6694);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f49436 = arrayList;
            arrayList.add(c6694);
        }
        this.f49431 = new C2460(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f49437 = sparseBooleanArray;
        this.f49429 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f49428 = sparseArray;
        this.f49434 = new SparseIntArray();
        this.f49432 = new C3839();
        this.f49433 = InterfaceC15690.f50940;
        this.f49427 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC19363) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C5251(new C6662(this)));
        this.f49440 = null;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        byte[] bArrM7518 = this.f49431.m7518();
        C14984 c14984 = (C14984) interfaceC7222;
        c14984.mo19219(false, 0, 940, bArrM7518);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c14984.mo19211(i, false);
                    return true;
                }
                if (bArrM7518[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        if ((this.f49423 & 1) == 0) {
            interfaceC15690 = new C23180(interfaceC15690, this.f49439);
        }
        this.f49433 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        C13013 c13013;
        C2023.m6510(this.f49422 != 2);
        List list = this.f49436;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6694 c6694 = (C6694) list.get(i);
            boolean z = c6694.m18074() == -9223372036854775807L;
            if (!z) {
                long jM18071 = c6694.m18071();
                z = (jM18071 == -9223372036854775807L || jM18071 == 0 || jM18071 == j2) ? false : true;
            }
            if (z) {
                c6694.m18069(j2);
            }
        }
        if (j2 != 0 && (c13013 = this.f49430) != null) {
            c13013.m3485(j2);
        }
        this.f49431.m7517(0);
        this.f49434.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f49428;
            if (i2 < sparseArray.size()) {
                ((InterfaceC19363) sparseArray.valueAt(i2)).mo6526();
                i2++;
            } else {
                this.f49425 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        boolean z;
        long length = interfaceC7222.getLength();
        int i = 0;
        int i2 = this.f49422;
        boolean z2 = i2 == 2;
        if (this.f49438) {
            C3839 c3839 = this.f49432;
            if (length != -1 && !z2 && !c3839.m11165()) {
                return c3839.m11163(interfaceC7222, c0954, this.f49427);
            }
            if (!this.f49426) {
                this.f49426 = true;
                if (c3839.m11164() != -9223372036854775807L) {
                    C13013 c13013 = new C13013(c3839.m11166(), c3839.m11164(), length, this.f49427);
                    this.f49430 = c13013;
                    this.f49433.mo7690(c13013.m3484());
                } else {
                    this.f49433.mo7690(new C3776(c3839.m11164()));
                }
            }
            if (this.f49441) {
                this.f49441 = false;
                mo2752(0L, 0L);
                if (interfaceC7222.getPosition() != 0) {
                    c0954.f3770 = 0L;
                    return 1;
                }
            }
            C13013 c13014 = this.f49430;
            if (c13014 != null && c13014.m3486()) {
                return this.f49430.m3483(interfaceC7222, c0954);
            }
        } else {
            z2 = z2;
        }
        C2460 c2460 = this.f49431;
        byte[] bArrM7518 = c2460.m7518();
        int i3 = 188;
        if (9400 - c2460.m7500() < 188) {
            int iM7503 = c2460.m7503();
            if (iM7503 > 0) {
                System.arraycopy(bArrM7518, c2460.m7500(), bArrM7518, 0, iM7503);
            }
            c2460.m7508(iM7503, bArrM7518);
        }
        while (true) {
            int iM7504 = c2460.m7503();
            SparseArray sparseArray = this.f49428;
            if (iM7504 < i3) {
                int iM7509 = c2460.m7509();
                int i4 = interfaceC7222.read(bArrM7518, iM7509, 9400 - iM7509);
                if (i4 == -1) {
                    while (i < sparseArray.size()) {
                        InterfaceC19363 interfaceC19363 = (InterfaceC19363) sparseArray.valueAt(i);
                        if (interfaceC19363 instanceof C2032) {
                            C2032 c2032 = (C2032) interfaceC19363;
                            z = z2;
                            if (c2032.m6529(z)) {
                                c2032.mo6527(1, new C2460());
                            }
                        } else {
                            z = z2;
                        }
                        i++;
                        z2 = z;
                    }
                    return -1;
                }
                c2460.m7501(iM7509 + i4);
                i3 = 188;
            } else {
                int iM7500 = c2460.m7500();
                int iM75010 = c2460.m7509();
                byte[] bArrM7519 = c2460.m7518();
                int i5 = iM7500;
                while (i5 < iM75010 && bArrM7519[i5] != 71) {
                    i5++;
                }
                c2460.m7510(i5);
                int i6 = i5 + 188;
                if (i6 > iM75010) {
                    int i7 = (i5 - iM7500) + this.f49425;
                    this.f49425 = i7;
                    if (i2 == 2 && i7 > 376) {
                        throw C22861.m50610("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f49425 = 0;
                }
                int iM75011 = c2460.m7509();
                if (i6 > iM75011) {
                    return 0;
                }
                int iM7499 = c2460.m7499();
                if ((8388608 & iM7499) != 0) {
                    c2460.m7510(i6);
                    return 0;
                }
                int i8 = (4194304 & iM7499) != 0 ? 1 : 0;
                int i9 = (2096896 & iM7499) >> 8;
                boolean z3 = (iM7499 & 32) != 0;
                InterfaceC19363 interfaceC19364 = (iM7499 & 16) != 0 ? (InterfaceC19363) sparseArray.get(i9) : null;
                if (interfaceC19364 == null) {
                    c2460.m7510(i6);
                    return 0;
                }
                if (i2 != 2) {
                    int i10 = iM7499 & 15;
                    SparseIntArray sparseIntArray = this.f49434;
                    int i11 = sparseIntArray.get(i9, i10 - 1);
                    sparseIntArray.put(i9, i10);
                    if (i11 == i10) {
                        c2460.m7510(i6);
                        return 0;
                    }
                    if (i10 != ((i11 + 1) & 15)) {
                        interfaceC19364.mo6526();
                    }
                }
                if (z3) {
                    int iM7516 = c2460.m7516();
                    i8 |= (c2460.m7516() & 64) != 0 ? 2 : 0;
                    c2460.m7535(iM7516 - 1);
                }
                boolean z4 = this.f49438;
                if (i2 == 2 || z4 || !this.f49429.get(i9, false)) {
                    c2460.m7501(i6);
                    interfaceC19364.mo6527(i8, c2460);
                    c2460.m7501(iM75011);
                }
                if (i2 != 2 && !z4 && this.f49438 && length != -1) {
                    this.f49441 = true;
                }
                c2460.m7510(i6);
                return 0;
            }
        }
    }
}
