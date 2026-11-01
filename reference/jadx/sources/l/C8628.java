package l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۡۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8628 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f29775;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29776;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7403 f29777 = new C7403(false);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC16579[] f29778 = new AbstractC16579[16];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10039 f29779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f29780;

    public C8628(C10039 c10039) {
        this.f29779 = c10039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8628 m22419() {
        try {
            C8628 c8628 = (C8628) clone();
            c8628.f29777 = new C7403(this.f29777);
            c8628.f29778 = (AbstractC16579[]) this.f29778.clone();
            int[] iArr = this.f29780;
            if (iArr != null) {
                c8628.f29780 = (int[]) iArr.clone();
            }
            if (this.f29779.f34301) {
                System.err.println("duping state " + this);
                m22420(-1);
            }
            return c8628;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22424(AbstractC16579 abstractC16579) {
        C10039 c10039 = this.f29779;
        if (c10039.f34301) {
            System.err.println("   pushing " + abstractC16579);
        }
        int i = C3687.f13463[abstractC16579.mo1933().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 8) {
            abstractC16579 = c10039.f34290.f14232;
        } else if (i == 9) {
            return;
        }
        AbstractC16579[] abstractC16579Arr = (AbstractC16579[]) C23805.m52456(this.f29776 + 2, this.f29778);
        this.f29778 = abstractC16579Arr;
        int i2 = this.f29776;
        this.f29776 = i2 + 1;
        abstractC16579Arr[i2] = abstractC16579;
        int iM25344 = C10039.m25344(abstractC16579);
        if (iM25344 != 1) {
            if (iM25344 == 2) {
                AbstractC16579[] abstractC16579Arr2 = this.f29778;
                int i3 = this.f29776;
                this.f29776 = i3 + 1;
                abstractC16579Arr2[i3] = null;
            } else {
                throw new AssertionError(abstractC16579);
            }
        }
        int i4 = this.f29776;
        if (i4 > c10039.f34282) {
            c10039.f34282 = i4;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m22422() {
        if (this.f29779.f34301) {
            System.err.println("   popping 1");
        }
        int i = this.f29776 - 1;
        this.f29776 = i;
        AbstractC16579[] abstractC16579Arr = this.f29778;
        AbstractC16579 abstractC16579 = abstractC16579Arr[i];
        abstractC16579Arr[i] = null;
        C6171.m17176(abstractC16579 != null && C10039.m25344(abstractC16579) == 1);
        return abstractC16579;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m22418() {
        if (this.f29779.f34301) {
            System.err.println("   popping 2");
        }
        int i = this.f29776;
        int i2 = i - 2;
        this.f29776 = i2;
        AbstractC16579[] abstractC16579Arr = this.f29778;
        AbstractC16579 abstractC16579 = abstractC16579Arr[i2];
        abstractC16579Arr[i2] = null;
        C6171.m17176(abstractC16579Arr[i - 1] == null && abstractC16579 != null && C10039.m25344(abstractC16579) == 2);
        return abstractC16579;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22423(int i) {
        if (this.f29779.f34301) {
            System.err.println("   popping " + i);
        }
        while (i > 0) {
            AbstractC16579[] abstractC16579Arr = this.f29778;
            int i2 = this.f29776 - 1;
            this.f29776 = i2;
            abstractC16579Arr[i2] = null;
            i--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22421(AbstractC16579 abstractC16579) {
        C10039 c10039 = this.f29779;
        C23800 c23800 = c10039.f34271;
        if (c10039.f34275) {
            int i = C3687.f13463[abstractC16579.mo1933().ordinal()];
            if (i == 10 || i == 11) {
                int iM25344 = C10039.m25344(abstractC16579);
                C6171.m17176(c23800.m52413(c23800.m52402(this.f29778[this.f29776 - iM25344]), c23800.m52402(abstractC16579), true));
                this.f29778[this.f29776 - iM25344] = abstractC16579;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22420(int i) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("stackMap for ");
        C10039 c10039 = this.f29779;
        sb.append(c10039.f34284.f77448);
        sb.append(".");
        sb.append(c10039.f34284);
        printStream.print(sb.toString());
        if (i == -1) {
            System.out.println();
        } else {
            System.out.println(" at " + i);
        }
        System.err.println(" stack (from bottom):");
        for (int i2 = 0; i2 < this.f29776; i2++) {
            PrintStream printStream2 = System.err;
            StringBuilder sbM40153 = C17214.m40153(i2, EnumC19730.f63352, ": ");
            sbM40153.append(this.f29778[i2]);
            printStream2.println(sbM40153.toString());
        }
        int i3 = c10039.f34297;
        do {
            i3--;
            if (i3 < 0) {
                i3 = 0;
                break;
            }
        } while (!this.f29777.m19735(i3));
        if (i3 >= 0) {
            System.err.println(" locals:");
        }
        for (int i4 = 0; i4 <= i3; i4++) {
            System.err.print(EnumC19730.f63352 + i4 + ": ");
            if (this.f29777.m19735(i4)) {
                C14978 c14978 = c10039.f34281[i4];
                if (c14978 == null) {
                    System.err.println("(none)");
                } else {
                    C6263 c6263 = c14978.f48887;
                    if (c6263 == null) {
                        System.err.println("UNKNOWN!");
                    } else {
                        System.err.println("" + c6263 + " of type " + c6263.mo50006(c10039.f34271));
                    }
                }
            } else {
                System.err.println("undefined");
            }
        }
        if (this.f29775 != 0) {
            System.err.print(" locks:");
            for (int i5 = 0; i5 < this.f29775; i5++) {
                System.err.print(" " + this.f29780[i5]);
            }
            System.err.println();
        }
    }
}
