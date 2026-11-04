package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۛܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21789;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21790;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f21791;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21792;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f21793;

    public C6481(ArrayList arrayList, int i, int i2) {
        this.f21790 = arrayList;
        this.f21791 = i;
        this.f21789 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18317(C4243 c4243, InterfaceC2731 interfaceC2731, String str) {
        int i = this.f21793;
        this.f21793 = i + 1;
        if (i < this.f21791) {
            return false;
        }
        return m18314(i, new C24381(c4243.m13547(), C10208.m26337(interfaceC2731), "parent_reference", "parent=".concat(str), null, null, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18315(C2863 c2863, C4243 c4243, InterfaceC2731 interfaceC2731, InterfaceC5650 interfaceC5650, String str, HashSet hashSet) {
        int i = this.f21793;
        this.f21793 = i + 1;
        if (i < this.f21791) {
            return false;
        }
        String strM26337 = C10208.m26337(interfaceC2731);
        C2795 c2795M21743 = C7972.m21743(c2863, interfaceC2731, interfaceC5650.mo16637());
        String strM21714 = C7972.m21714(interfaceC5650, C7972.m21727(c2863, interfaceC5650, 300), (Set) hashSet);
        C13192 c13192M13547 = c4243.m13547();
        String str2 = c2795M21743.f9199;
        return m18314(i, new C24381(c13192M13547, strM26337, Name.REFER, (str2 == null || str2.isEmpty() || str2.equals(str)) ? "item key=".concat(str) : C3188.m10404("item key=", str2, " (", str, MotionUtils.EASING_TYPE_FORMAT_END), c2795M21743.f9199, c2795M21743.f9200, strM21714));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18316(C2863 c2863, C4243 c4243, InterfaceC2731 interfaceC2731, InterfaceC5650 interfaceC5650, boolean z, String str, HashSet hashSet) {
        int i = this.f21793;
        this.f21793 = i + 1;
        if (i < this.f21791) {
            return false;
        }
        String strM26337 = C10208.m26337(interfaceC2731);
        C2795 c2795M21743 = z ? C7972.m21743(c2863, interfaceC2731, interfaceC5650.mo16637()) : new C2795(null, 0);
        C9506 c9506M21727 = C7972.m21727(c2863, interfaceC5650, 300);
        String strM21714 = C7972.m21714(interfaceC5650, c9506M21727, (Set) hashSet);
        C13192 c13192M13547 = c4243.m13547();
        String str2 = c9506M21727.f30785;
        String str3 = c9506M21727.f30789;
        return m18314(i, new C24381(c13192M13547, strM26337, Name.REFER, (str2 != null || str3 == null || str3.isEmpty()) ? str : C1173.m4316(0, str3.length(), 300, str3), z ? c2795M21743.f9199 : null, z ? c2795M21743.f9200 : null, z ? strM21714 : null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18314(int i, C24381 c24381) {
        ArrayList arrayList = this.f21790;
        arrayList.add(c24381);
        if (arrayList.size() < this.f21789) {
            return false;
        }
        this.f21792 = i + 1;
        return true;
    }
}
