package l;

/* JADX INFO: renamed from: l.ܿ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6UO */
/* JADX INFO: loaded from: classes4.dex */
public class C17565 implements CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C14744 f55802;

    /* JADX INFO: renamed from: ۙ */
    public int mo33950() {
        return 0;
    }

    public C17565(C14744 c14744) {
        C16072 c16072 = c14744.f48220;
        if (c16072 != null) {
            c16072.m38089();
        }
        this.f55802 = c14744;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14744 m40840() {
        C14744 c14744 = this.f55802;
        if (c14744 != null) {
            return c14744;
        }
        throw new IllegalStateException("Text handle is closed");
    }

    @Override // java.lang.CharSequence
    public int length() {
        return m40840().m35339();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        C14744 c14744M40840 = m40840();
        if (i < 0 || i >= c14744M40840.m35339()) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        return c14744M40840.m35331(i);
    }

    @Override // java.lang.CharSequence
    public C17565 subSequence(int i, int i2) {
        C14744 c14744M40840 = m40840();
        C14744.m35328(i, i2, c14744M40840.m35339());
        C16072 c16072 = c14744M40840.f48220;
        return (c16072 == null || !c16072.m38100()) ? new C17565(c14744M40840.m35334(i, i2)) : new C14039(c14744M40840, i, i2);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        C14744 c14744M40840 = m40840();
        C14744.m35328(i, i2, c14744M40840.m35339());
        int i4 = i2 - i;
        m40836(cArr, i3, i4);
        C4159 c4159 = new C4159(c14744M40840, 0, c14744M40840.m35339(), i);
        try {
            c4159.m11800(cArr, i3, i4);
            c4159.close();
        } catch (Throwable th) {
            try {
                c4159.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40836(char[] cArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > cArr.length - i) {
            throw new IndexOutOfBoundsException("Invalid destination range");
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public C4159 mo33951(int i) {
        C14744 c14744M40840 = m40840();
        return new C4159(c14744M40840, 0, c14744M40840.m35339(), i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m40838() {
        AbstractC0631 abstractC0631 = m40840().f48222;
        return ((long) (abstractC0631 == null ? 0 : abstractC0631.f2726)) + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40839(int i) {
        C14744 c14744M40840 = m40840();
        C14744.m35328(i, i, c14744M40840.m35339());
        AbstractC0631 abstractC0631 = c14744M40840.f48222;
        if (abstractC0631 == null || i == 0) {
            return 0;
        }
        if (i == abstractC0631.f2727) {
            return abstractC0631.f2726;
        }
        int i2 = 0;
        while (abstractC0631 instanceof C1337) {
            if (abstractC0631.f2726 == 0) {
                return i2;
            }
            AbstractC0631[] abstractC0631Arr = ((C1337) abstractC0631).f5650;
            for (int i3 = 0; i3 < abstractC0631Arr.length; i3++) {
                AbstractC0631 abstractC0632 = abstractC0631Arr[i3];
                int i4 = abstractC0632.f2727;
                if (i < i4 || i3 == abstractC0631Arr.length - 1) {
                    abstractC0631 = abstractC0632;
                    break;
                }
                i -= i4;
                i2 += abstractC0632.f2726;
            }
        }
        if (abstractC0631.f2726 != 0) {
            return i2 + ((C16155) abstractC0631).m38248(i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40837(int i) {
        AbstractC0631 abstractC0631 = m40840().f48222;
        int i2 = abstractC0631 == null ? 0 : abstractC0631.f2726;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("Invalid line index");
        }
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = 0;
        while (abstractC0631 instanceof C1337) {
            for (AbstractC0631 abstractC0632 : ((C1337) abstractC0631).f5650) {
                int i5 = abstractC0632.f2726;
                if (i3 < i5) {
                    abstractC0631 = abstractC0632;
                    break;
                }
                i3 -= i5;
                i4 += abstractC0632.f2727;
            }
        }
        return i4 + ((C16155) abstractC0631).m38246(i3) + 1;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        C14744 c14744M40840 = m40840();
        int iM35339 = c14744M40840.m35339();
        char[] cArr = new char[iM35339];
        C4159 c4159 = new C4159(c14744M40840, 0, c14744M40840.m35339(), 0);
        try {
            c4159.m11800(cArr, 0, iM35339);
            c4159.close();
            return new String(cArr);
        } catch (Throwable th) {
            try {
                c4159.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14744 c14744;
        C16072 c16072;
        synchronized (this) {
            c14744 = this.f55802;
            this.f55802 = null;
        }
        if (c14744 == null || (c16072 = c14744.f48220) == null) {
            return;
        }
        c16072.m38088();
    }
}
