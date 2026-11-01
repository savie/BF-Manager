package l;

import bin.mt.json.JSON;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21893 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f71011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f71012;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5928 f71013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71014;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f71015;

    public /* synthetic */ C21893(AbstractC20745 abstractC20745, C5928 c5928, int i) {
        this(abstractC20745, c5928);
    }

    public C21893(AbstractC20745 abstractC20745) {
        this(abstractC20745, null);
    }

    public C21893(AbstractC20745 abstractC20745, C5928 c5928) {
        this.f71015 = abstractC20745;
        this.f71013 = c5928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48684(C21893 c21893, List list, String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM44987 = C19777.m44987(c21893, (C5928) it.next(), str, str2);
            if (!hashSet.add(strM44987)) {
                throw C19777.m44975("FILE_STORAGE_ERROR", "The backend returned a duplicate directory child.", str, str2, "list_directory", "duplicate_child", "non_atomic", JSON.array(), strM44987, "list_directory");
            }
        }
        c21893.f71012 = list;
        c21893.f71014 = 0;
        c21893.f71011 = true;
    }
}
