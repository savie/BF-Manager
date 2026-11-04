package l;

import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K3YN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18651 implements PluginPreference.List.Item {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21635 f60652;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CharSequence f60653;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f60654;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f60655;

    @Override // bin.mt.plugin.api.preference.PluginPreference.List.Item
    public final PluginPreference.List.Item summary(CharSequence charSequence) {
        this.f60653 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.List.Item
    public final PluginPreference.List.Item addItem(CharSequence charSequence, String str) {
        int i = 1549994560;
        int i2 = C2310.f7472;
        int i3 = C4238.f15451;
        int iM3169 = (C0773.m3169("۠ۙ") + i3) * 9;
        int i4 = ((iM3169 ^ i2) * 31007) ^ (-463701963);
        int i5 = 1029052755;
        while (true) {
            i = ((((i ^ i2) * 8519) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1874743065:
                case 1812604107:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                        i5 = 833025836;
                    } else {
                        iM3169 = C0773.m3169("᩻ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26549)) ^ (-1135030241);
                        i5 = -1608100431;
                    }
                    break;
                case -1359748870:
                case -778207232:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                        i5 = 833025836;
                    } else {
                        iM3169 = C0619.m2761("ܺۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24133)) ^ 707771536;
                        i5 = -70613506;
                    }
                    break;
                case -1353902182:
                case 674417823:
                    RunnableC1848.m6360();
                    iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                    i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                    i5 = 833025836;
                    break;
                case -1107028569:
                case 1300061759:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("᩻᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23831) ^ (-442711506);
                        i5 = -1244566645;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 20435) ^ 1851407585;
                        i5 = -1441569159;
                    }
                    break;
                case -175678687:
                case 2082579928:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("۬᩺") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * 29401) ^ (-569623601);
                        i5 = 255803185;
                    } else {
                        iM3169 = (C0619.m2761("ۢۡ") + i3) * (-61);
                        i4 = ((iM3169 ^ i2) * (-21735)) ^ (-120008513);
                        i5 = 1888615068;
                    }
                    break;
                case -155459741:
                case 2083229264:
                    C1783.m6232();
                    return null;
                case -2996432:
                case 2059216786:
                    return this.f60652.addItem(charSequence, str);
                case 56957433:
                case 1625315850:
                    if (C3448.f11240 < 0) {
                        iM3169 = (C0773.m3169("۬᩺") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * 29401) ^ (-569623601);
                        i5 = 255803185;
                    } else {
                        iM3169 = (C0619.m2761("ۚ֫") ^ i3) * 99;
                        i4 = ((iM3169 ^ i2) * (-32763)) ^ (-845499728);
                        i5 = -2127780297;
                    }
                    break;
                case 173057410:
                case 957627335:
                    if (!C2023.f6737) {
                        iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                        i5 = 833025836;
                    } else {
                        iM3169 = (C0619.m2761("ۚ֫") ^ i3) * 99;
                        i4 = ((iM3169 ^ i2) * (-32763)) ^ (-845499728);
                        i5 = -2127780297;
                    }
                    break;
                case 176756519:
                case 997626568:
                    if (C1343.m4943()) {
                        iM3169 = (C0773.m3169("ܶۗ") + i2) * (-61);
                        i4 = ((iM3169 ^ i3) * (-13303)) ^ 1818582931;
                        i5 = 1704842825;
                    } else {
                        iM3169 = C0619.m2761("᩻᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23831) ^ (-442711506);
                        i5 = -1244566645;
                    }
                    break;
                case 362451973:
                case 1476382456:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("᩹ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19831)) ^ (-448974399);
                        i5 = -1727655296;
                    } else {
                        iM3169 = C0619.m2761("ܽۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31809) ^ (-701064344);
                        i5 = 1231396131;
                    }
                    break;
                case 423984791:
                case 1981244144:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩹ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19831)) ^ (-448974399);
                        i5 = -1727655296;
                    } else {
                        iM3169 = C0773.m3169("᩻ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30211)) ^ 1791946309;
                        i5 = 407364040;
                    }
                    break;
                case 1108825505:
                case 1362033505:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("᩹ۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19831)) ^ (-448974399);
                        i5 = -1727655296;
                    } else {
                        iM3169 = C0773.m3169("ۖۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2741)) ^ (-1209072963);
                        i5 = -1136725816;
                    }
                    break;
                case 1175473071:
                case 1378612928:
                    if (C17202.m40372()) {
                        iM3169 = (C0773.m3169("ۨ۫") ^ i2) * 5;
                        i4 = ((iM3169 ^ i3) * (-20277)) ^ (-1368536412);
                        i5 = 2030166330;
                    } else {
                        iM3169 = (C0619.m2761("ۚ֫") ^ i3) * 99;
                        i4 = ((iM3169 ^ i2) * (-32763)) ^ (-845499728);
                        i5 = -2127780297;
                    }
                    break;
                case 1329013337:
                case 1702119144:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("᩻᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23831) ^ (-442711506);
                        i5 = -1244566645;
                    } else {
                        iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                        i5 = 833025836;
                    }
                    break;
                default:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("ܺ۬") + i2) * (-115);
                        i4 = ((iM3169 ^ i3) * (-17791)) ^ 1313518933;
                        i5 = 833025836;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * 5279) ^ (-1331180271);
                        i5 = -1922172117;
                    }
                    break;
            }
        }
    }
}
