package l;

import bin.mt.json.JSON;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f37780;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f37781;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1907 f37782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f37783;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f37784;

    public /* synthetic */ C11656(AbstractC22044 abstractC22044, C1907 c1907, int i) {
        this(abstractC22044, c1907);
    }

    public C11656(AbstractC22044 abstractC22044) {
        this(abstractC22044, null);
    }

    public C11656(AbstractC22044 abstractC22044, C1907 c1907) {
        this.f37783 = abstractC22044;
        this.f37782 = c1907;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29334(C11656 c11656, List list, String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM38308 = C16131.m38308(c11656, (C1907) it.next(), str, str2);
            if (!hashSet.add(strM38308)) {
                throw C16131.m38294("FILE_STORAGE_ERROR", "The backend returned a duplicate directory child.", str, str2, "list_directory", "duplicate_child", "non_atomic", JSON.array(), strM38308, "list_directory");
            }
        }
        c11656.f37780 = list;
        c11656.f37781 = 0;
        c11656.f37784 = true;
    }
}
