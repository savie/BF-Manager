package l;

import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۫ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12131 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f40611;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f40612;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3662 f40613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12359 f40614;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f40615;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f40616;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f40617;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15846 f40618;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f40619;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f40620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f40621;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f40622;

    public C12131(AbstractC12359 abstractC12359, int i, int i2, int i3, int i4, int i5) {
        this.f40614 = abstractC12359;
        C3662 c3662 = abstractC12359.f41308;
        this.f40613 = c3662;
        this.f40618 = abstractC12359.f41315;
        this.f40616 = i2;
        this.f40621 = i3;
        this.f40622 = i4;
        this.f40620 = i5;
        this.f40615 = abstractC12359.mo14794();
        int iM10801 = c3662.m10801(abstractC12359.m30733(i, true));
        this.f40612 = iM10801;
        int iM10812 = c3662.m10812(abstractC12359.m30733(i + i2, false));
        this.f40611 = iM10812;
        this.f40617 = c3662.m10813(iM10801);
        this.f40619 = (c3662.m10816(iM10812) + i3) - i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30190(AbstractC12359 abstractC12359, int i, int i2) {
        AbstractC12359 abstractC123510 = this.f40614;
        return abstractC12359 == abstractC123510 && abstractC123510.f41308 == this.f40613 && abstractC123510.f41315 == this.f40618 && !abstractC123510.mo14804() && !this.f40614.f41325 && this.f40614.mo14778() == null && this.f40614.mo14794() == this.f40615 && i == this.f40622 && i2 == this.f40620 && this.f40614.f41324.equals(this.f40614.f41314.m16815());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16364 m30189(AbstractC12359 abstractC12359, BooleanSupplier booleanSupplier) {
        C15846 c15846;
        int i;
        int i2;
        int i3 = this.f40617;
        int i4 = this.f40619;
        C3662 c3662 = this.f40613;
        int i5 = this.f40612;
        int iM10821 = c3662.m10821(i5);
        int i6 = this.f40611;
        int iM10822 = c3662.m10821(i6);
        Math.max(16, c3662.size() - ((i6 - i5) + 1));
        C3662 c3663 = new C3662(0);
        C15846 c15847 = new C15846();
        int i7 = 0;
        while (i7 < i5) {
            m30188(booleanSupplier);
            int iMin = Math.min(i5 - i7, 16384) + i7;
            c3663.m10807(i7, iMin, c3662);
            i7 = iMin;
        }
        m30188(booleanSupplier);
        int i8 = 0;
        while (true) {
            c15846 = this.f40618;
            if (i8 >= iM10821) {
                break;
            }
            m30188(booleanSupplier);
            int iMin2 = Math.min(iM10821 - i8, 16384) + i8;
            c15847.m37707(c15846, i8, iMin2);
            i8 = iMin2;
        }
        m30188(booleanSupplier);
        C3329 c3329M30760 = abstractC12359.m30760();
        try {
            C1918 c1918M30735 = abstractC12359.m30735(c3329M30760, i3, i4);
            try {
                C14435 c14435 = new C14435();
                int i9 = iM10821;
                while (true) {
                    m30188(booleanSupplier);
                    i = i5;
                    c15847.add(C8084.m21291(abstractC12359, c3329M30760, i3, abstractC12359.f41286.m17881()));
                    int iM6244 = c1918M30735.m6244();
                    boolean z = iM6244 < 0 || iM6244 >= i4;
                    if (z) {
                        iM6244 = i4;
                    }
                    int i10 = i4;
                    i2 = i9 + 1;
                    c14435.m34709(i3, iM6244, i9);
                    c14435.m34710(c3329M30760);
                    c3663.m10810(c14435);
                    if (z) {
                        break;
                    }
                    i3 = iM6244 + 1;
                    i5 = i;
                    i9 = i2;
                    i4 = i10;
                }
                c1918M30735.close();
                c3329M30760.close();
                int size = c3663.size();
                int i11 = (i2 - iM10822) - 1;
                int i12 = i6 + 1;
                int size2 = c3662.size();
                while (i12 < size2) {
                    m30188(booleanSupplier);
                    int iMin3 = Math.min(size2 - i12, 16384) + i12;
                    c3663.m10807(i12, iMin3, c3662);
                    i12 = iMin3;
                }
                m30188(booleanSupplier);
                c3663.m10806(size, c3663.size(), this.f40621 - this.f40616, i11);
                int i13 = iM10822 + 1;
                int size3 = c15846.size();
                while (i13 < size3) {
                    m30188(booleanSupplier);
                    int iMin4 = Math.min(size3 - i13, 16384) + i13;
                    c15847.m37707(c15846, i13, iMin4);
                    i13 = iMin4;
                }
                m30188(booleanSupplier);
                c15847.m37703(iM10821, i2);
                abstractC12359.f41308 = c3663;
                abstractC12359.f41315 = c15847;
                return new C16364(i, size);
            } catch (Throwable th) {
                try {
                    c1918M30735.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c3329M30760.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30188(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Layout preparation canceled");
        }
    }
}
