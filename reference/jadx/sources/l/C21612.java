package l;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C21612 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۬ܰ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f70099;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f70100 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC5788 f70101;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f70102;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC8913 f70103;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f70104;

    static {
        ApplicationC6132.m17119(158);
        f70099 = new short[]{1969, -18973, -19008, -18994, -18997, -19057, -18981, -18979, -18994, -19007, -18980, -19005, -18994, -18981, -19002, -19008, -19007, -19057, -18977, -18979, -19008, -18983, -19002, -18997, -18998, -18979, -19057, -18999, -18994, -19002, -19005, -18998, -18997, -18995, -19002, -19007, -19071, -19006, -18981, -19071, -18977, -19005, -18982, -19000, -19002, -19007, -19071, -18980, -18986, -18980, -18981, -18998, -19006};
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public native void mo1157();

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C21612(DialogInterfaceOnDismissListenerC8913 dialogInterfaceOnDismissListenerC8913, AbstractActivityC5788 abstractActivityC5788, View view) {
        this.f70103 = dialogInterfaceOnDismissListenerC8913;
        this.f70101 = abstractActivityC5788;
        this.f70102 = view;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f70103.f30570 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f70103.f30570 = false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0128 A[PHI: r11 r12 r13 r14 r15
      0x0128: PHI (r11v6 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:36:0x0126, B:28:0x00e2, B:8:0x0058, B:91:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r12v6 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:36:0x0126, B:28:0x00e2, B:8:0x0058, B:91:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r13v6 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:36:0x0126, B:28:0x00e2, B:8:0x0058, B:91:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r14v6 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:36:0x0126, B:28:0x00e2, B:8:0x0058, B:91:0x0128] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r15v6 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:36:0x0126, B:28:0x00e2, B:8:0x0058, B:91:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0247 A[PHI: r2 r4 r20
      0x0247: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:63:0x0245, B:59:0x0223, B:32:0x0103, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:63:0x0245, B:59:0x0223, B:32:0x0103, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0245, B:59:0x0223, B:32:0x0103, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0279 A[PHI: r5 r6 r7 r8 r9
      0x0279: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:67:0x0277, B:55:0x0204, B:51:0x01e0, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:67:0x0277, B:55:0x0204, B:51:0x01e0, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:67:0x0277, B:55:0x0204, B:51:0x01e0, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:67:0x0277, B:55:0x0204, B:51:0x01e0, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v4 short) binds: [B:67:0x0277, B:55:0x0204, B:51:0x01e0, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (l.C0629.m2907() == false) goto L15;
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1158(java.lang.Exception r22) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21612.mo1158(java.lang.Exception):void");
    }
}
