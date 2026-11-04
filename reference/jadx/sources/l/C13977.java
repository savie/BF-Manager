package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes4.dex */
public final class C13977 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24421 f44319;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24421 f44320;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44321;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44322;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24421 f44323;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24421 f44324;

    public C13977(ArrayList arrayList, ArrayList arrayList2, C24421 c24421, C24421 c24422, C24421 c24423, C24421 c24424, int i, int i2) {
        this.f44322 = C4985.m15203(arrayList);
        this.f44321 = C4985.m15203(arrayList2);
        this.f44319 = C4985.m15199(c24421);
        this.f44323 = C4985.m15199(c24422);
        this.f44320 = c24423 == null ? new C24421(0, i) : C4985.m15199(c24423);
        this.f44324 = c24424 == null ? new C24421(0, i2) : C4985.m15199(c24424);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34061(C13977 c13977) {
        return m34059(this.f44322, c13977.f44322) && m34059(this.f44321, c13977.f44321) && m34060(this.f44319, c13977.f44319) && m34060(this.f44323, c13977.f44323) && m34060(this.f44320, c13977.f44320) && m34060(this.f44324, c13977.f44324);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34059(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (m34060((C24421) arrayList.get(i), (C24421) arrayList2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34060(C24421 c24421, C24421 c24422) {
        if (c24421 == null || c24422 == null) {
            return c24421 == c24422;
        }
        return c24421.f79289 == c24422.f79289 && c24421.f79288 == c24422.f79288;
    }
}
