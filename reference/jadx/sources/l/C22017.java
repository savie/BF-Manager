package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D6J2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22017 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f71043;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC12849 f71044;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f71045;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12804 f71046;

    public C22017(AbstractC22044 abstractC22044, EnumC12849 enumC12849, List list, C12804 c12804) {
        this.f71043 = abstractC22044;
        this.f71044 = enumC12849;
        this.f71045 = list;
        this.f71046 = c12804;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m49801(String[] strArr, C22763 c22763, C24827 c24827) throws IOException {
        List listSingletonList;
        C22017 c22017;
        ArrayList arrayList = new ArrayList();
        C22763 c22764 = new C22763();
        for (String str : strArr) {
            if (c24827.mo924()) {
                break;
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            if (!c22764.m51341(abstractC22044M35193)) {
                C16912 c16912M41323 = C17658.m41323(abstractC22044M35193.getName());
                if (c16912M41323 != null && c16912M41323.m39898() == EnumC25118.SEVEN_ZIP) {
                    c22017 = new C22017(abstractC22044M35193, EnumC12849.f41145, C5661.m16646(abstractC22044M35193), null);
                } else {
                    EnumC12849 enumC12849M5966 = (c16912M41323 == null || c16912M41323.m39898() != EnumC25118.ZIP) ? C1663.m5966(abstractC22044M35193) : EnumC12849.f41146;
                    if (enumC12849M5966 == EnumC12849.f41152) {
                        C12804 c12804M31756 = C12804.m31756(abstractC22044M35193);
                        c22017 = new C22017(abstractC22044M35193, enumC12849M5966, c12804M31756.m31759(), c12804M31756);
                    } else {
                        if (enumC12849M5966 == EnumC12849.f41146) {
                            listSingletonList = C22763.m51337(abstractC22044M35193, C22941.m51712(abstractC22044M35193));
                        } else {
                            listSingletonList = Collections.singletonList(abstractC22044M35193);
                        }
                        c22017 = new C22017(abstractC22044M35193, enumC12849M5966, listSingletonList, null);
                    }
                }
                c22764.m51338(abstractC22044M35193);
                c22763.m51338(abstractC22044M35193);
                for (AbstractC22044 abstractC22044 : c22017.f71045) {
                    c22764.m51338(abstractC22044);
                    c22763.m51338(abstractC22044);
                }
                arrayList.add(c22017);
            }
        }
        return arrayList;
    }
}
