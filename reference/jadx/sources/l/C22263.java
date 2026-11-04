package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩷ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes.dex */
public final class C22263 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f71737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71736 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f71738 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m50317(C15508 c15508, C6909 c6909, C23821 c23821, BooleanSupplier booleanSupplier) {
        int i;
        int i2;
        C22263 c22263 = new C22263();
        int i3 = 0;
        while (i3 < c6909.size()) {
            m50320(booleanSupplier);
            int iM19179 = c6909.m19179(i3);
            int i4 = iM19179 + 1;
            int iM19176 = c6909.m19176(i3);
            int iM19180 = c6909.m19180(iM19179);
            if (c23821 == null || (i4 > c23821.m53154() && i3 < c23821.m53153())) {
                int i5 = iM19176;
                int i6 = i5;
                while (true) {
                    m50320(booleanSupplier);
                    int iM50316 = m50316(c15508, i6, iM19180, booleanSupplier);
                    int i7 = i5;
                    i5 = i7;
                    c22263.m50319(i6, iM50316, i3, i4, i6 == i7, iM50316 == iM19180, false);
                    if (iM50316 >= iM19180) {
                        break;
                    }
                    i6 = iM50316;
                }
            } else {
                int i8 = i3;
                while (i8 < i4) {
                    m50320(booleanSupplier);
                    int i9 = i8 + 1;
                    int iM19177 = c6909.m19176(i8);
                    int iM19181 = c6909.m19180(i8);
                    if (iM19181 - iM19177 > 100000) {
                        while (true) {
                            m50320(booleanSupplier);
                            int iM50317 = m50316(c15508, iM19177, iM19181, booleanSupplier);
                            boolean z = i8 == i3 && iM19177 == iM19176;
                            boolean z2 = i9 == i4 && iM50317 == iM19180;
                            int i10 = i9;
                            int i11 = iM19181;
                            boolean z3 = z;
                            i2 = i9;
                            boolean z4 = z2;
                            i = iM19176;
                            int i12 = i8;
                            c22263.m50319(iM19177, iM50317, i8, i10, z3, z4, true);
                            iM19177 = iM50317;
                            if (iM19177 >= i11) {
                                break;
                            }
                            iM19181 = i11;
                            i8 = i12;
                            i9 = i2;
                            iM19176 = i;
                        }
                        i8 = i2;
                    } else {
                        i = iM19176;
                        int i13 = i8;
                        int i14 = i9;
                        while (i14 < i4 && i14 - i13 < 500 && c6909.m19180(i14) - iM19177 <= 100000) {
                            i14++;
                        }
                        c22263.m50319(iM19177, c6909.m19180(i14 - 1), i13, i14, i13 == i3, i14 == i4, true);
                        i8 = i14;
                    }
                    iM19176 = i;
                }
            }
            i3 = i4;
        }
        c22263.m50318();
        return c22263.f71736;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50319(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5 = z3 ? i4 - i3 : 1;
        if (!this.f71738.isEmpty() && (this.f71737 + i5 > 500 || i2 - ((C5109) this.f71738.get(0)).f17816 > 100000)) {
            m50318();
        }
        C5109 c5109 = this.f71738.isEmpty() ? null : (C5109) j$$ExternalSyntheticOutline0.m(this.f71738, 1);
        if (c5109 != null && c5109.f17814 == z3 && c5109.f17819 == i3 && c5109.f17815 && z) {
            c5109.f17813 = i2;
            c5109.f17819 = i4;
            c5109.f17815 = z2;
        } else {
            this.f71738.add(new C5109(i, i2, i3, i4, z, z2, z3));
        }
        this.f71737 += i5;
        if (i2 - i >= 100000) {
            m50318();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50318() {
        if (this.f71738.isEmpty()) {
            return;
        }
        this.f71736.add(new C14145(this.f71738, this.f71737));
        this.f71738 = new ArrayList();
        this.f71737 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50316(CharSequence charSequence, int i, int i2, BooleanSupplier booleanSupplier) {
        if (i2 - i <= 100000) {
            return i2;
        }
        int i3 = 100000 + i;
        int i4 = i3;
        while (i4 > i && charSequence.charAt(i4) > 127) {
            if ((i4 & 1023) == 0) {
                m50320(booleanSupplier);
            }
            i4--;
        }
        while (i4 < i3) {
            m50320(booleanSupplier);
            int iM6073 = C1709.m6073(i4, i2, charSequence);
            while (iM6073 < i2) {
                int iCodePointAt = Character.codePointAt(charSequence, iM6073);
                int type = Character.getType(iCodePointAt);
                if (type != 6 && type != 8 && type != 7) {
                    break;
                }
                m50320(booleanSupplier);
                iM6073 += Character.charCount(iCodePointAt);
            }
            if (iM6073 <= i3) {
                i4 = iM6073;
            } else if (i4 == i) {
                return iM6073;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50320(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Wrap planning canceled");
        }
    }
}
