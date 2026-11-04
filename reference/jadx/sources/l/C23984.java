package l;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes.dex */
public final class C23984 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final String f77604;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f77606;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f77607;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f77608;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f77609;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f77611;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f77612;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f77613;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f77614;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C22764 f77615;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f77617;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f77619;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f77620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f77622;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C2343 f77623;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f77624;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final String f77625;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public List f77621 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f77610 = -1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19090 f77616 = new C19090();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC15778 f77603 = EnumC15778.STANDALONE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map f77605 = C4681.synchronizedMap(new C6084(16, 0.75f, true));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f77602 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77618 = new ArrayList();

    public C23984(AbstractC7629 abstractC7629, String str, String str2, String str3, String str4, boolean z, boolean z2, AbstractC22044 abstractC22044, boolean z3) {
        this.f77614 = abstractC7629;
        this.f77613 = str;
        this.f77612 = str2;
        this.f77625 = str3;
        this.f77604 = str4;
        this.f77611 = z;
        this.f77608 = z2;
        this.f77624 = abstractC22044;
        this.f77622 = z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53510(C23984 c23984, Context context, C22492 c22492) {
        if (c23984.f77615 != null) {
            c22492.accept(Boolean.TRUE);
            return;
        }
        c23984.f77618.add(c22492);
        if (c23984.f77607) {
            return;
        }
        c23984.f77607 = true;
        C19780.m45534(context).m45546((c23984.f77608 || c23984.f77610 >= 0) ? null : C19780.m45532(c23984.f77623, c23984.f77613), new C12049(c23984));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53515(C23984 c23984, C22764 c22764) {
        ArrayList arrayList = c23984.f77618;
        c23984.f77607 = false;
        if (c23984.f77619 && c22764 != null) {
            c22764.close();
        } else if (c22764 != null) {
            c23984.f77615 = c22764;
            c23984.f77620 = c22764.f73868;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Boolean.valueOf((c23984.f77619 || c22764 == null) ? false : true));
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m53533(C23984 c23984) {
        C2343 c2343;
        C19090 c19090 = c23984.f77616;
        String str = c23984.f77606;
        if (str == null || (c2343 = c23984.f77623) == null) {
            return false;
        }
        c23984.f77612 = c2343.m7891(str);
        c23984.f77613 = c23984.f77606;
        c23984.f77606 = null;
        c23984.f77605.clear();
        ((LinkedHashMap) c19090.f61805).clear();
        c19090.f61807 = false;
        C22764 c22764 = c23984.f77615;
        if (c22764 != null) {
            c22764.close();
            c23984.f77615 = null;
        }
        c23984.f77620 = null;
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f77619) {
            return;
        }
        this.f77619 = true;
        C22764 c22764 = this.f77615;
        if (c22764 != null) {
            c22764.close();
            this.f77615 = null;
        }
        C3100 c3100 = ActivityC3846.f13105;
        Object obj = this.f77614;
        if (obj instanceof AutoCloseable) {
            try {
                C20196.m46453((AutoCloseable) obj);
            } catch (Exception unused) {
            }
        }
        Iterator it = this.f77621.iterator();
        while (it.hasNext()) {
            AbstractC7364.m20184(((Long) it.next()).longValue());
        }
        AbstractC22044 abstractC22044 = this.f77624;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
    }
}
