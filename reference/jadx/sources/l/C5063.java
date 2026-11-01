package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۚۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5063 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f17662;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17663;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f17664;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17665;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17666;

    public C5063(ArrayList arrayList, int i, int i2) {
        this.f17665 = arrayList;
        this.f17664 = i;
        this.f17663 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14110(C0829 c0829, InterfaceC12783 interfaceC12783, String str) {
        int i = this.f17662;
        this.f17662 = i + 1;
        if (i < this.f17664) {
            return false;
        }
        return m14109(i, new C21997(c0829.m3421(), C21291.m47741(interfaceC12783), "parent_reference", "parent=".concat(str), null, null, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14111(C22577 c22577, C0829 c0829, InterfaceC12783 interfaceC12783, InterfaceC9961 interfaceC9961, String str, HashSet hashSet) {
        int i = this.f17662;
        this.f17662 = i + 1;
        if (i < this.f17664) {
            return false;
        }
        String strM47741 = C21291.m47741(interfaceC12783);
        C19444 c19444M50308 = C22703.m50308(c22577, interfaceC12783, interfaceC9961.mo25193());
        String strM50276 = C22703.m50276(interfaceC9961, C22703.m50282(c22577, interfaceC9961, 300), (Set) hashSet);
        C17327 c17327M3421 = c0829.m3421();
        String str2 = c19444M50308.f62608;
        return m14109(i, new C21997(c17327M3421, strM47741, Name.REFER, (str2 == null || str2.isEmpty() || str2.equals(str)) ? "item key=".concat(str) : C0242.m1617("item key=", str2, " (", str, MotionUtils.EASING_TYPE_FORMAT_END), c19444M50308.f62608, c19444M50308.f62609, strM50276));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14112(C22577 c22577, C0829 c0829, InterfaceC12783 interfaceC12783, InterfaceC9961 interfaceC9961, boolean z, String str, HashSet hashSet) {
        int i = this.f17662;
        this.f17662 = i + 1;
        if (i < this.f17664) {
            return false;
        }
        String strM47741 = C21291.m47741(interfaceC12783);
        C19444 c19444M50308 = z ? C22703.m50308(c22577, interfaceC12783, interfaceC9961.mo25193()) : new C19444(null, 0);
        C8155 c8155M50282 = C22703.m50282(c22577, interfaceC9961, 300);
        String strM50276 = C22703.m50276(interfaceC9961, c8155M50282, (Set) hashSet);
        C17327 c17327M3421 = c0829.m3421();
        String str2 = c8155M50282.f28505;
        String str3 = c8155M50282.f28504;
        return m14109(i, new C21997(c17327M3421, strM47741, Name.REFER, (str2 != null || str3 == null || str3.isEmpty()) ? str : C7521.m20035(0, str3.length(), 300, str3), z ? c19444M50308.f62608 : null, z ? c19444M50308.f62609 : null, z ? strM50276 : null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14109(int i, C21997 c21997) {
        ArrayList arrayList = this.f17665;
        arrayList.add(c21997);
        if (arrayList.size() < this.f17663) {
            return false;
        }
        this.f17666 = i + 1;
        return true;
    }
}
