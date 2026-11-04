package l;

import android.text.GetChars;
import android.text.Spannable;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.᩻᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25313 implements InterfaceC1181, Spannable, GetChars {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f81767;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f81769;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f81770;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f81768 = new char[10];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f81766 = -1;

    public C25313(InterfaceC19106 interfaceC19106) {
        this.f81767 = interfaceC19106;
    }

    public final int indexOf(char c, int i) {
        return indexOf(c, i, this.f81767.length());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f81767.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56574(int i, int i2) {
        int i3 = i2 - i;
        if (this.f81768.length < i3) {
            this.f81768 = new char[i3];
        }
        try {
            this.f81767.mo15353(i, i2, this.f81768, 0);
            this.f81769 = i;
            this.f81770 = i2;
        } catch (RuntimeException e) {
            this.f81770 = 0;
            this.f81769 = 0;
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f81769;
        if (i >= i2 && i < this.f81770) {
            return this.f81768[i - i2];
        }
        int i3 = this.f81766;
        this.f81766 = i;
        int iMax = (i3 == -1 || i3 <= i) ? i : Math.max(i - 1024, 0);
        InterfaceC9629 interfaceC9629 = this.f81767;
        int length = interfaceC9629.length();
        if (i < 0 || i >= length) {
            return interfaceC9629.charAt(i);
        }
        m56574(iMax, (int) Math.min(((long) i) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, length));
        return this.f81768[i - iMax];
    }

    @Override // l.InterfaceC1181
    public final int indexOf(char c, int i, int i2) {
        int i3;
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2, this.f81767.length());
        if (iMax >= iMin) {
            return -1;
        }
        if (iMax >= this.f81769 && iMax < (i3 = this.f81770)) {
            char[] cArr = this.f81768;
            int iMin2 = Math.min(iMin, i3);
            int i4 = this.f81769;
            int i5 = iMin2 - i4;
            for (int i6 = iMax - i4; i6 < i5; i6++) {
                if (cArr[i6] == c) {
                    return this.f81769 + i6;
                }
            }
            iMax = this.f81770;
        }
        while (iMax < iMin) {
            m56574(iMax, (int) Math.min(((long) iMax) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, iMin));
            char[] cArr2 = this.f81768;
            int i7 = this.f81770 - iMax;
            for (int i8 = 0; i8 < i7; i8++) {
                if (cArr2[i8] == c) {
                    return iMax + i8;
                }
            }
            iMax += i7;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:1: B:19:0x0053->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005f -> B:27:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x005b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.InterfaceC1181
    public final int lastIndexOf(char r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            int r8 = java.lang.Math.max(r8, r0)
            int r9 = r9 + (-1)
            l.ۡ᩶᩸ r1 = r6.f81767
            int r1 = r1.length()
            int r1 = r1 + (-1)
            int r9 = java.lang.Math.min(r9, r1)
            r1 = -1
            if (r9 >= r8) goto L17
            return r1
        L17:
            int r2 = r6.f81769
            if (r9 < r2) goto L3a
            int r3 = r6.f81770
            if (r9 >= r3) goto L3a
            char[] r3 = r6.f81768
            int r2 = r8 - r2
            int r2 = java.lang.Math.max(r0, r2)
            int r4 = r6.f81769
            int r9 = r9 - r4
        L2a:
            if (r9 < r2) goto L36
            char r4 = r3[r9]
            if (r4 != r7) goto L33
            int r7 = r6.f81769
            goto L5d
        L33:
            int r9 = r9 + (-1)
            goto L2a
        L36:
            int r9 = r6.f81769
            r2 = r6
            goto L61
        L3a:
            r2 = r6
        L3b:
            if (r9 < r8) goto L64
            int r3 = r9 + (-1023)
            int r3 = java.lang.Math.max(r3, r8)
            int r9 = r9 + 1
            r2.m56574(r3, r9)
            char[] r3 = r2.f81768
            int r4 = r2.f81769
            int r9 = r9 - r4
            int r4 = r8 - r4
            int r4 = java.lang.Math.max(r0, r4)
        L53:
            int r9 = r9 + (-1)
            if (r9 < r4) goto L5f
            char r5 = r3[r9]
            if (r5 != r7) goto L53
            int r7 = r2.f81769
        L5d:
            int r7 = r7 + r9
            return r7
        L5f:
            int r9 = r2.f81769
        L61:
            int r9 = r9 + (-1)
            goto L3b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C25313.lastIndexOf(char, int, int):int");
    }

    public final int count(int i, int i2, char c) {
        int i3;
        int i4;
        int i5 = this.f81769;
        if (i < i5 || i >= (i4 = this.f81770)) {
            i3 = 0;
        } else {
            char[] cArr = this.f81768;
            int iMin = Math.min(i2, i4) - this.f81769;
            i3 = 0;
            for (int i6 = i - i5; i6 < iMin; i6++) {
                if (cArr[i6] == c) {
                    i3++;
                }
            }
            i = this.f81770;
        }
        while (i < i2) {
            m56574(i, (int) Math.min(((long) i) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, i2));
            char[] cArr2 = this.f81768;
            int i7 = this.f81770 - i;
            for (int i8 = 0; i8 < i7; i8++) {
                if (cArr2[i8] == c) {
                    i3++;
                }
            }
            i += i7;
        }
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f81769;
        if (i3 <= i && i2 <= this.f81770) {
            int i4 = i - i3;
            return new String(this.f81768, i4, (i2 - i3) - i4);
        }
        int i5 = i2 - i;
        char[] cArr = new char[i5];
        this.f81767.mo15353(i, i2, cArr, 0);
        return new C1427(cArr, 0, i5);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f81769;
        if (i4 > i || i2 > this.f81770) {
            this.f81767.mo15353(i, i2, cArr, i3);
            return;
        }
        int i5 = i - i4;
        System.arraycopy(this.f81768, i5, cArr, i3, (i2 - i4) - i5);
    }

    public final void reset() {
        this.f81770 = 0;
        this.f81769 = 0;
        this.f81766 = -1;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f81767.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f81767.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f81767.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f81767.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f81767.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f81767.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        this.f81767.removeSpan(obj);
    }
}
