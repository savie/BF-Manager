package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1445 extends AbstractC3492 {

    /* JADX INFO: renamed from: ܰۖۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f5912 = {9310, -8884, -8883, -8865, -8908, -8927, -8905, -8863, -8844, -8843, -8884, -8841, -8846, -8841, -8842, -8850, -8841, -8903, -8836, -8853, -8853, -8842, -8853};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f5913;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f5914;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f5915;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f5916;

    public C1445(C11545 c11545, AbstractC20745 abstractC20745) {
        this.f5914 = c11545;
        this.f5915 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f5914.m28824(), R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x034b A[PHI: r2 r6 r17 r18 r19 r23 r24
      0x034b: PHI (r2v34 java.io.ByteArrayOutputStream) = (r2v7 java.io.ByteArrayOutputStream), (r2v33 java.io.ByteArrayOutputStream), (r2v35 java.io.ByteArrayOutputStream) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r6v6 java.lang.StringBuilder) = (r6v3 java.lang.StringBuilder), (r6v2 java.lang.StringBuilder), (r6v2 java.lang.StringBuilder) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r17v4 short[]) = (r17v2 short[]), (r17v3 short[]), (r17v2 short[]) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r18v4 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r19v3 short) = (r19v2 short), (r19v2 short), (r19v4 short) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r23v24 int) = (r23v4 int), (r23v23 int), (r23v25 int) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]
      0x034b: PHI (r24v4 short) = (r24v3 short), (r24v3 short), (r24v5 short) binds: [B:43:0x0164, B:80:0x0349, B:76:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (l.C2704.f10408 == false) goto L18;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1159() throws l.C4987 {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1445.mo1159():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (!TextUtils.isEmpty(this.f5916)) {
            System.out.println(this.f5916);
        }
        this.f5914.m28787(this.f5913);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f5914.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        AbstractC20745 abstractC20745 = this.f5913;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
