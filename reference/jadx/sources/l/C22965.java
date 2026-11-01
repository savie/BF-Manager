package l;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩺ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes.dex */
public final class C22965 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74640;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74639 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f74641 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m50808(C3329 c3329, C3662 c3662, C16364 c16364, BooleanSupplier booleanSupplier) {
        int i;
        int i2;
        C22965 c22965 = new C22965();
        int i3 = 0;
        while (i3 < c3662.size()) {
            m50811(booleanSupplier);
            int iM10812 = c3662.m10812(i3);
            int i4 = iM10812 + 1;
            int iM10813 = c3662.m10813(i3);
            int iM10816 = c3662.m10816(iM10812);
            if (c16364 == null || (i4 > c16364.m38560() && i3 < c16364.m38559())) {
                int i5 = iM10813;
                int i6 = i5;
                while (true) {
                    m50811(booleanSupplier);
                    int iM50807 = m50807(c3329, i6, iM10816, booleanSupplier);
                    int i7 = i5;
                    i5 = i7;
                    c22965.m50810(i6, iM50807, i3, i4, i6 == i7, iM50807 == iM10816, false);
                    if (iM50807 >= iM10816) {
                        break;
                    }
                    i6 = iM50807;
                }
            } else {
                int i8 = i3;
                while (i8 < i4) {
                    m50811(booleanSupplier);
                    int i9 = i8 + 1;
                    int iM10814 = c3662.m10813(i8);
                    int iM10817 = c3662.m10816(i8);
                    if (iM10817 - iM10814 > 100000) {
                        while (true) {
                            m50811(booleanSupplier);
                            int iM50808 = m50807(c3329, iM10814, iM10817, booleanSupplier);
                            boolean z = i8 == i3 && iM10814 == iM10813;
                            boolean z2 = i9 == i4 && iM50808 == iM10816;
                            int i10 = i9;
                            int i11 = iM10817;
                            boolean z3 = z;
                            i2 = i9;
                            boolean z4 = z2;
                            i = iM10813;
                            int i12 = i8;
                            c22965.m50810(iM10814, iM50808, i8, i10, z3, z4, true);
                            iM10814 = iM50808;
                            if (iM10814 >= i11) {
                                break;
                            }
                            iM10817 = i11;
                            i8 = i12;
                            i9 = i2;
                            iM10813 = i;
                        }
                        i8 = i2;
                    } else {
                        i = iM10813;
                        int i13 = i8;
                        int i14 = i9;
                        while (i14 < i4 && i14 - i13 < 500 && c3662.m10816(i14) - iM10814 <= 100000) {
                            i14++;
                        }
                        c22965.m50810(iM10814, c3662.m10816(i14 - 1), i13, i14, i13 == i3, i14 == i4, true);
                        i8 = i14;
                    }
                    iM10813 = i;
                }
            }
            i3 = i4;
        }
        c22965.m50809();
        return c22965.f74639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50810(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        int i5 = z3 ? i4 - i3 : 1;
        if (!this.f74641.isEmpty() && (this.f74640 + i5 > 500 || i2 - ((C6736) this.f74641.get(0)).f22674 > 100000)) {
            m50809();
        }
        C6736 c6736 = this.f74641.isEmpty() ? null : (C6736) C19084.m43861(this.f74641, 1);
        if (c6736 != null && c6736.f22672 == z3 && c6736.f22669 == i3 && c6736.f22668 && z) {
            c6736.f22670 = i2;
            c6736.f22669 = i4;
            c6736.f22668 = z2;
        } else {
            this.f74641.add(new C6736(i, i2, i3, i4, z, z2, z3));
        }
        this.f74640 += i5;
        if (i2 - i >= 100000) {
            m50809();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50809() {
        if (this.f74641.isEmpty()) {
            return;
        }
        this.f74639.add(new C3913(this.f74641, this.f74640));
        this.f74641 = new ArrayList();
        this.f74640 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50807(CharSequence charSequence, int i, int i2, BooleanSupplier booleanSupplier) {
        if (i2 - i <= 100000) {
            return i2;
        }
        int i3 = 100000 + i;
        int i4 = i3;
        while (i4 > i && charSequence.charAt(i4) > 127) {
            if ((i4 & 1023) == 0) {
                m50811(booleanSupplier);
            }
            i4--;
        }
        while (i4 < i3) {
            m50811(booleanSupplier);
            int iM45558 = C20149.m45558(i4, i2, charSequence);
            while (iM45558 < i2) {
                int iCodePointAt = Character.codePointAt(charSequence, iM45558);
                int type = Character.getType(iCodePointAt);
                if (type != 6 && type != 8 && type != 7) {
                    break;
                }
                m50811(booleanSupplier);
                iM45558 += Character.charCount(iCodePointAt);
            }
            if (iM45558 <= i3) {
                i4 = iM45558;
            } else if (i4 == i) {
                return iM45558;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50811(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Wrap planning canceled");
        }
    }
}
