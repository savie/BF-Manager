package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.۬᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13333 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f44242 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14744 f44243;

    public C13333(C16072 c16072) {
        this.f44243 = C14744.m35326(c16072 == null ? 2048 : c16072.f51978, c16072 == null ? 16 : c16072.f51976, c16072);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32842() {
        m32836();
        return this.f44243.m35339();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32840(char[] cArr, int i) {
        m32836();
        C11216 c11216M35333 = this.f44243.m35333(0, i, CharBuffer.wrap(cArr, 0, i));
        try {
            C14744 c14744 = this.f44243;
            this.f44243 = c14744.m35336(c14744.m35339(), this.f44243.m35339(), c11216M35333, this.f44242);
            c11216M35333.close();
        } catch (Throwable th) {
            try {
                c11216M35333.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m32838(int i) {
        m32836();
        if (i < 0 || i >= this.f44243.m35339()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f44243.m35331(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32843(int i) {
        m32836();
        this.f44243 = this.f44243.m35334(0, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32841() {
        m32836();
        C14744 c14744 = this.f44243;
        if (c14744.f48220 != null) {
            m32837(c14744.f48222, 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m32837(AbstractC0631 abstractC0631, int i) {
        if (abstractC0631 == null) {
            return i;
        }
        if (abstractC0631 instanceof C16155) {
            this.f44243.f48220.f51982.m26341(((C16155) abstractC0631).f52216);
            return i - 1;
        }
        AbstractC0631[] abstractC0631Arr = ((C1337) abstractC0631).f5650;
        int length = abstractC0631Arr.length;
        while (true) {
            length--;
            if (length < 0 || i <= 0) {
                break;
            }
            i = m32837(abstractC0631Arr[length], i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m32839() {
        m32836();
        C14744 c14744 = this.f44243;
        this.f44243 = null;
        return c14744;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32836() {
        if (this.f44243 == null) {
            throw new IllegalStateException("Text builder is finished");
        }
    }
}
