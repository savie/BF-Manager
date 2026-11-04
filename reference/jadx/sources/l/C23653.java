package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F6JI */
/* JADX INFO: loaded from: classes.dex */
public final class C23653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f76726;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f76727;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f76728;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15294 f76729;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f76730;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76731;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f76732;

    public /* synthetic */ C23653(C15294 c15294, String str, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3) {
        this(c15294, str, i, i2, (List) arrayList, (List) arrayList2, i3);
    }

    public C23653(C15294 c15294, String str, int i, int i2, List list, List list2, int i3) {
        this.f76729 = c15294;
        this.f76730 = str;
        this.f76728 = i;
        this.f76731 = i2;
        this.f76726 = C4681.unmodifiableList(new ArrayList(list));
        this.f76727 = C4681.unmodifiableList(new ArrayList(list2));
        this.f76732 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23653 m52887(int i) {
        List list = Collections.EMPTY_LIST;
        return new C23653((C15294) null, (String) null, 0, 0, list, list, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23653 m52888(C9044 c9044) {
        int i;
        if (c9044 != null) {
            int i2 = c9044.f29431;
            int i3 = c9044.f29428;
            C15294 c15294 = this.f76729;
            if (c15294 != null && c15294.equals(c9044.f29430)) {
                boolean z = false;
                int i4 = this.f76731;
                int i5 = this.f76728;
                boolean z2 = (i5 <= 0 || i4 <= 0) && i3 > 0 && i2 > 0;
                String str = this.f76730;
                String str2 = str == null ? c9044.f29436 : str;
                if (z2 || (str == null && str2 != null)) {
                    if (z2) {
                        int i6 = c9044.f29434;
                        if (i6 >= 5 && i6 <= 8) {
                            z = true;
                        }
                        i5 = z ? i2 : i3;
                        if (z) {
                            i2 = i3;
                        }
                        i = i2;
                    } else {
                        i = i4;
                    }
                    return new C23653(this.f76729, str2, i5, i, this.f76726, this.f76727, this.f76732);
                }
            }
        }
        return this;
    }
}
