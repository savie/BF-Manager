package l;

import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BJB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5062 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C5062 f17660 = new C5062(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f17661;

    public C5062(InterfaceC6432 interfaceC6432) {
        if (interfaceC6432 == null) {
            this.f17661 = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList(interfaceC6432.mo5141());
        Iterator it = interfaceC6432.mo17615().iterator();
        while (it.hasNext()) {
            arrayList.add(new C2239((InterfaceC17721) it.next()));
        }
        this.f17661 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m14105(String str) {
        Iterator it = this.f17661.iterator();
        while (it.hasNext()) {
            C11413 c11413M6878 = ((C2239) it.next()).m6878(str);
            if (c11413M6878 != null) {
                return c11413M6878;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m14104(int i) {
        Iterator it = this.f17661.iterator();
        while (it.hasNext()) {
            C11413 c11413M6877 = ((C2239) it.next()).m6877(i);
            if (c11413M6877 != null) {
                return c11413M6877;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m14107(String str, boolean z) {
        C11413 c11413M6878;
        if (z) {
            for (C2239 c2239 : this.f17661) {
                if (c2239.m6879() == 1 && (c11413M6878 = c2239.m6878(str)) != null) {
                    return c11413M6878;
                }
            }
            return C13530.m33070().m14105(str);
        }
        return m14105(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11413 m14108(int i) {
        C11413 c11413M6877;
        int i2 = (i >>> 24) & 255;
        if (i2 != 1) {
            return m14104(i);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException();
        }
        for (C2239 c2239 : this.f17661) {
            if (c2239.m6879() == 1 && (c11413M6877 = c2239.m6877(i)) != null) {
                return c11413M6877;
            }
        }
        return C13530.m33070().m14104(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11413 m14106(String str, String str2, Map map) {
        boolean zEquals = Chip.NAMESPACE_ANDROID.equals(str);
        C11413 c11413M14107 = m14107(str2, zEquals);
        if (c11413M14107 == null && str2.length() == 10 && str2.startsWith("id")) {
            String strSubstring = str2.substring(2);
            if (C6461.m17648(strSubstring)) {
                c11413M14107 = m14108(C6461.m17654(strSubstring));
            }
        }
        if (c11413M14107 == null && map != null) {
            c11413M14107 = (C11413) map.get(str + ":" + str2);
        }
        return (c11413M14107 != null || zEquals) ? c11413M14107 : C13530.m33070().m14105(str2);
    }
}
