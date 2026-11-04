package l;

import android.view.View;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17110 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۡܿ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f55842;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10144 f55843;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC20840 f55844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f55845;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f55846 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f55847;

    static {
        ApplicationC23172.m52091(q.h);
        f55842 = new short[]{3053, 7040, 7075, 7085, 7080, 7148, 7096, 7102, 7085, 7074, 7103, 7072, 7085, 7096, 7077, 7075, 7074, 7148, 7100, 7102, 7075, 7098, 7077, 7080, 7081, 7102, 7148, 7082, 7085, 7077, 7072, 7081, 7080, 7086, 7077, 7074, 7138, 7073, 7096, 7138, 7100, 7072, 7097, 7083, 7077, 7074, 7138, 7103, 7093, 7103, 7096, 7081, 7073};
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public native void mo1134();

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C17110(DialogInterfaceOnDismissListenerC20840 dialogInterfaceOnDismissListenerC20840, AbstractActivityC10144 abstractActivityC10144, View view) {
        this.f55844 = dialogInterfaceOnDismissListenerC20840;
        this.f55843 = abstractActivityC10144;
        this.f55845 = view;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f55844.f66724 = true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01e4 A[PHI: r5 r6 r11 r12 r13
      0x01e4: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:53:0x01e2, B:34:0x0104, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:53:0x01e2, B:34:0x0104, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:53:0x01e2, B:34:0x0104, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:53:0x01e2, B:34:0x0104, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:53:0x01e2, B:34:0x0104, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0219 A[PHI: r2 r4
      0x0219: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:57:0x0217, B:30:0x00df, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:57:0x0217, B:30:0x00df, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0282 A[PHI: r7 r14 r15
      0x0282: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:65:0x0280, B:49:0x01c0, B:26:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:65:0x0280, B:49:0x01c0, B:26:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:65:0x0280, B:49:0x01c0, B:26:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (l.C17202.f56030 == false) goto L14;
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1135(java.lang.Exception r22) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17110.mo1135(java.lang.Exception):void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f55844.f66724 = false;
    }
}
