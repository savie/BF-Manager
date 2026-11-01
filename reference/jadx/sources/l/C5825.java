package l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5825 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static WeakReference f19788;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17684 f19789;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f19790;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5825 m16005() {
        C5825 c5825;
        C5825 c5826;
        WeakReference weakReference = f19788;
        if (weakReference != null && (c5826 = (C5825) weakReference.get()) != null) {
            return c5826;
        }
        synchronized (C5825.class) {
            WeakReference weakReference2 = f19788;
            if (weakReference2 != null && (c5825 = (C5825) weakReference2.get()) != null) {
                return c5825;
            }
            C5825 c5827 = new C5825();
            f19788 = new WeakReference(c5827);
            return c5827;
        }
    }

    public C5825() {
        try {
            C17684 c17684M41161 = C17684.m41161(C7291.m19433("/assets/android_dex"));
            int iM41201 = c17684M41161.m41201();
            this.f19789 = c17684M41161;
            this.f19790 = new HashMap(iM41201);
            for (int i = 0; i < iM41201; i++) {
                int iM41169 = c17684M41161.m41169(i);
                int iM41197 = c17684M41161.m41197(i);
                this.f19790.put(c17684M41161.m41195(iM41169), new C10765(iM41169, iM41197));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1591 m16006(String str) {
        C10765 c10765 = (C10765) this.f19790.get(str);
        if (c10765 == null) {
            return null;
        }
        return new C1591(new C7807(this.f19789, c10765.f36715, c10765.f36714));
    }
}
