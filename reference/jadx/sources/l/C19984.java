package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ᩴܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19984 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f64210;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15508 f64211;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f64212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64213;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10508 f64214;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23714 f64215;

    public C19984(C15508 c15508) {
        this.f64211 = c15508;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C15508 c15508 = this.f64211;
        c15508.m37171();
        return c15508.f50478;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f64210 || i >= this.f64213) {
            m45927(i);
        }
        return this.f64212[i - this.f64210];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] m45930(int i) {
        if (i < this.f64210 || i >= this.f64213) {
            m45927(i);
        }
        return this.f64212;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m45929() {
        return this.f64210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45928() {
        return this.f64213;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m45927(int i) {
        C15508 c15508 = this.f64211;
        c15508.m37171();
        if (i < 0 || i >= c15508.f50478) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        c15508.m37167();
        int i2 = this.f64213;
        int iMin = i == i2 ? Math.min(512, i2 - this.f64210) : 0;
        if (iMin != 0) {
            i = this.f64213 - iMin;
        } else if (i < this.f64210) {
            i = Math.max(0, i - 512);
        }
        if (iMin != 0) {
            char[] cArr = this.f64212;
            System.arraycopy(cArr, (this.f64213 - this.f64210) - iMin, cArr, 0, iMin);
        }
        this.f64213 = 0;
        this.f64210 = 0;
        if (this.f64214 == null) {
            C10508 c10508 = new C10508(c15508.f50482.m23622().f69247, 2048);
            this.f64214 = c10508;
            this.f64212 = c10508.m26971();
        }
        int i3 = iMin + i;
        int iMin2 = Math.min(2048, c15508.f50478 - i) + i;
        C23714 c23714 = this.f64215;
        if (c23714 == null) {
            this.f64215 = c15508.f50482.mo16945(i3);
        } else if (c23714.position() != i3) {
            this.f64215.m52962(i3);
        }
        while (i3 < iMin2) {
            c15508.m37167();
            int iMin3 = Math.min(1024, iMin2 - i3);
            this.f64215.m52963(this.f64212, i3 - i, iMin3);
            i3 += iMin3;
        }
        this.f64210 = i;
        this.f64213 = iMin2;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C15508 c15508 = this.f64211;
        c15508.m37171();
        C21697.m49248(i, i2, c15508.f50478);
        C8796.m23619(cArr, i3, i2 - i);
        while (i < i2) {
            c15508.m37167();
            if (i < this.f64210 || i >= this.f64213) {
                m45927(i);
            }
            int iMin = Math.min(i2, this.f64213) - i;
            System.arraycopy(this.f64212, i - this.f64210, cArr, i3, iMin);
            i += iMin;
            i3 += iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        C15508 c15508 = this.f64211;
        c15508.m37171();
        C21697.m49248(i, i2, c15508.f50478);
        c15508.m37167();
        if (i == i2) {
            return "";
        }
        int i3 = this.f64210;
        if (i >= i3 && i2 <= this.f64213) {
            return new String(this.f64212, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return subSequence(0, this.f64211.f50478);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45926(C19984 c19984) {
        c19984.f64213 = 0;
        c19984.f64210 = 0;
        c19984.f64212 = null;
        try {
            C23714 c23714 = c19984.f64215;
            if (c23714 != null) {
                c23714.close();
            }
        } finally {
            c19984.f64215 = null;
            C10508 c10508 = c19984.f64214;
            if (c10508 != null) {
                c10508.close();
                c19984.f64214 = null;
            }
        }
    }
}
