package l;

import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۗ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3683 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6909 f12658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13753 f12659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17350 f12660;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f12661;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12662;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f12663;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f12665;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f12666;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f12667;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12668;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f12669;

    public C3683(AbstractC13753 abstractC13753, int i, int i2, int i3, int i4, int i5) {
        this.f12659 = abstractC13753;
        C6909 c6909 = abstractC13753.f43643;
        this.f12658 = c6909;
        this.f12660 = abstractC13753.f43655;
        this.f12662 = i2;
        this.f12664 = i3;
        this.f12669 = i4;
        this.f12665 = i5;
        this.f12666 = abstractC13753.mo25216();
        int iM19185 = c6909.m19185(abstractC13753.m33619(i, true));
        this.f12668 = iM19185;
        int iM19179 = c6909.m19179(abstractC13753.m33619(i + i2, false));
        this.f12663 = iM19179;
        this.f12661 = c6909.m19176(iM19185);
        this.f12667 = (c6909.m19180(iM19179) + i3) - i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11978(AbstractC13753 abstractC13753, int i, int i2) {
        AbstractC13753 abstractC13754 = this.f12659;
        return abstractC13753 == abstractC13754 && abstractC13754.f43643 == this.f12658 && abstractC13754.f43655 == this.f12660 && !abstractC13754.mo25237() && !this.f12659.f43653 && this.f12659.mo25238() == null && this.f12659.mo25216() == this.f12666 && i == this.f12669 && i2 == this.f12665 && this.f12659.f43656.equals(this.f12659.f43659.m54039());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23821 m11977(AbstractC13753 abstractC13753, BooleanSupplier booleanSupplier) {
        C17350 c17350;
        int i;
        int i2;
        int i3 = this.f12661;
        int i4 = this.f12667;
        C6909 c6909 = this.f12658;
        int i5 = this.f12668;
        int iM19188 = c6909.m19188(i5);
        int i6 = this.f12663;
        int iM19189 = c6909.m19188(i6);
        Math.max(16, c6909.size() - ((i6 - i5) + 1));
        C6909 c69010 = new C6909(0);
        C17350 c17351 = new C17350();
        int i7 = 0;
        while (i7 < i5) {
            m11976(booleanSupplier);
            int iMin = Math.min(i5 - i7, 16384) + i7;
            c69010.m19170(i7, iMin, c6909);
            i7 = iMin;
        }
        m11976(booleanSupplier);
        int i8 = 0;
        while (true) {
            c17350 = this.f12660;
            if (i8 >= iM19188) {
                break;
            }
            m11976(booleanSupplier);
            int iMin2 = Math.min(iM19188 - i8, 16384) + i8;
            c17351.m40745(c17350, i8, iMin2);
            i8 = iMin2;
        }
        m11976(booleanSupplier);
        C15508 c15508M33642 = abstractC13753.m33642();
        try {
            C22968 c22968M33621 = abstractC13753.m33621(c15508M33642, i3, i4);
            try {
                C14366 c14366 = new C14366();
                int i9 = iM19188;
                while (true) {
                    m11976(booleanSupplier);
                    i = i5;
                    c17351.add(C12875.m31911(abstractC13753, c15508M33642, i3, abstractC13753.f43640.m16214()));
                    int iM51841 = c22968M33621.m51841();
                    boolean z = iM51841 < 0 || iM51841 >= i4;
                    if (z) {
                        iM51841 = i4;
                    }
                    int i10 = i4;
                    i2 = i9 + 1;
                    c14366.m34800(i3, iM51841, i9);
                    c14366.m34801(c15508M33642);
                    c69010.m19173(c14366);
                    if (z) {
                        break;
                    }
                    i3 = iM51841 + 1;
                    i5 = i;
                    i9 = i2;
                    i4 = i10;
                }
                c22968M33621.close();
                c15508M33642.close();
                int size = c69010.size();
                int i11 = (i2 - iM19189) - 1;
                int i12 = i6 + 1;
                int size2 = c6909.size();
                while (i12 < size2) {
                    m11976(booleanSupplier);
                    int iMin3 = Math.min(size2 - i12, 16384) + i12;
                    c69010.m19170(i12, iMin3, c6909);
                    i12 = iMin3;
                }
                m11976(booleanSupplier);
                c69010.m19169(size, c69010.size(), this.f12664 - this.f12662, i11);
                int i13 = iM19189 + 1;
                int size3 = c17350.size();
                while (i13 < size3) {
                    m11976(booleanSupplier);
                    int iMin4 = Math.min(size3 - i13, 16384) + i13;
                    c17351.m40745(c17350, i13, iMin4);
                    i13 = iMin4;
                }
                m11976(booleanSupplier);
                c17351.m40749(iM19188, i2);
                abstractC13753.f43643 = c69010;
                abstractC13753.f43655 = c17351;
                return new C23821(i, size);
            } catch (Throwable th) {
                try {
                    c22968M33621.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c15508M33642.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11976(BooleanSupplier booleanSupplier) {
        if (booleanSupplier.getAsBoolean()) {
            throw new CancellationException("Layout preparation canceled");
        }
    }
}
