package l;

/* JADX INFO: renamed from: l.۠ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P6UO */
/* JADX INFO: loaded from: classes3.dex */
public class C8796 implements CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C21697 f28668;

    /* JADX INFO: renamed from: ۙ */
    public int mo16944() {
        return 0;
    }

    public C8796(C21697 c21697) {
        C10046 c10046 = c21697.f69247;
        if (c10046 != null) {
            c10046.m25972();
        }
        this.f28668 = c21697;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21697 m23622() {
        C21697 c21697 = this.f28668;
        if (c21697 != null) {
            return c21697;
        }
        throw new IllegalStateException("Text handle is closed");
    }

    @Override // java.lang.CharSequence
    public int length() {
        return m23622().m49259();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        C21697 c21697M23622 = m23622();
        if (i < 0 || i >= c21697M23622.m49259()) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        return c21697M23622.m49251(i);
    }

    @Override // java.lang.CharSequence
    public C8796 subSequence(int i, int i2) {
        C21697 c21697M23622 = m23622();
        C21697.m49248(i, i2, c21697M23622.m49259());
        C10046 c10046 = c21697M23622.f69247;
        return (c10046 == null || !c10046.m25971()) ? new C8796(c21697M23622.m49254(i, i2)) : new C5814(c21697M23622, i, i2);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        C21697 c21697M23622 = m23622();
        C21697.m49248(i, i2, c21697M23622.m49259());
        int i4 = i2 - i;
        m23619(cArr, i3, i4);
        C23714 c23714 = new C23714(c21697M23622, 0, c21697M23622.m49259(), i);
        try {
            c23714.m52963(cArr, i3, i4);
            c23714.close();
        } catch (Throwable th) {
            try {
                c23714.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23619(char[] cArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > cArr.length - i) {
            throw new IndexOutOfBoundsException("Invalid destination range");
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public C23714 mo16945(int i) {
        C21697 c21697M23622 = m23622();
        return new C23714(c21697M23622, 0, c21697M23622.m49259(), i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m23621() {
        AbstractC1339 abstractC1339 = m23622().f69245;
        return ((long) (abstractC1339 == null ? 0 : abstractC1339.f4792)) + 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23620(int i) {
        C21697 c21697M23622 = m23622();
        C21697.m49248(i, i, c21697M23622.m49259());
        AbstractC1339 abstractC1339 = c21697M23622.f69245;
        if (abstractC1339 == null || i == 0) {
            return 0;
        }
        if (i == abstractC1339.f4794) {
            return abstractC1339.f4792;
        }
        int i2 = 0;
        while (abstractC1339 instanceof C17746) {
            if (abstractC1339.f4792 == 0) {
                return i2;
            }
            AbstractC1339[] abstractC1339Arr = ((C17746) abstractC1339).f58291;
            for (int i3 = 0; i3 < abstractC1339Arr.length; i3++) {
                AbstractC1339 abstractC13310 = abstractC1339Arr[i3];
                int i4 = abstractC13310.f4794;
                if (i < i4 || i3 == abstractC1339Arr.length - 1) {
                    abstractC1339 = abstractC13310;
                    break;
                }
                i -= i4;
                i2 += abstractC13310.f4792;
            }
        }
        if (abstractC1339.f4792 != 0) {
            return i2 + ((C19238) abstractC1339).m44574(i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m23623(int i) {
        AbstractC1339 abstractC1339 = m23622().f69245;
        int i2 = abstractC1339 == null ? 0 : abstractC1339.f4792;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("Invalid line index");
        }
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = 0;
        while (abstractC1339 instanceof C17746) {
            for (AbstractC1339 abstractC13310 : ((C17746) abstractC1339).f58291) {
                int i5 = abstractC13310.f4792;
                if (i3 < i5) {
                    abstractC1339 = abstractC13310;
                    break;
                }
                i3 -= i5;
                i4 += abstractC13310.f4794;
            }
        }
        return i4 + ((C19238) abstractC1339).m44572(i3) + 1;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        C21697 c21697M23622 = m23622();
        int iM49259 = c21697M23622.m49259();
        char[] cArr = new char[iM49259];
        C23714 c23714 = new C23714(c21697M23622, 0, c21697M23622.m49259(), 0);
        try {
            c23714.m52963(cArr, 0, iM49259);
            c23714.close();
            return new String(cArr);
        } catch (Throwable th) {
            try {
                c23714.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21697 c21697;
        C10046 c10046;
        synchronized (this) {
            c21697 = this.f28668;
            this.f28668 = null;
        }
        if (c21697 == null || (c10046 = c21697.f69247) == null) {
            return;
        }
        c10046.m25975();
    }
}
