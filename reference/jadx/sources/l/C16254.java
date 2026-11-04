package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܶܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f52813 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21697 f52814;

    public C16254(C10046 c10046) {
        this.f52814 = C21697.m49247(c10046 == null ? 2048 : c10046.f32213, c10046 == null ? 16 : c10046.f32209, c10046);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m38572() {
        m38567();
        return this.f52814.m49259();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38570(char[] cArr, int i) {
        m38567();
        C14016 c14016M49253 = this.f52814.m49253(0, i, CharBuffer.wrap(cArr, 0, i));
        try {
            C21697 c21697 = this.f52814;
            this.f52814 = c21697.m49256(c21697.m49259(), this.f52814.m49259(), c14016M49253, this.f52813);
            c14016M49253.close();
        } catch (Throwable th) {
            try {
                c14016M49253.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m38568(int i) {
        m38567();
        if (i < 0 || i >= this.f52814.m49259()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f52814.m49251(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38573(int i) {
        m38567();
        this.f52814 = this.f52814.m49254(0, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38571() {
        m38567();
        C21697 c21697 = this.f52814;
        if (c21697.f69247 != null) {
            m38566(c21697.f69245, 2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38566(AbstractC1339 abstractC1339, int i) {
        if (abstractC1339 == null) {
            return i;
        }
        if (abstractC1339 instanceof C19238) {
            this.f52814.f69247.f32208.m2120(((C19238) abstractC1339).f62239);
            return i - 1;
        }
        AbstractC1339[] abstractC1339Arr = ((C17746) abstractC1339).f58291;
        int length = abstractC1339Arr.length;
        while (true) {
            length--;
            if (length < 0 || i <= 0) {
                break;
            }
            i = m38566(abstractC1339Arr[length], i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m38569() {
        m38567();
        C21697 c21697 = this.f52814;
        this.f52814 = null;
        return c21697;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m38567() {
        if (this.f52814 == null) {
            throw new IllegalStateException("Text builder is finished");
        }
    }
}
