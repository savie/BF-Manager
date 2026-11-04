package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩺᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24619 extends AbstractC14921 implements PluginPreference.Input {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f79734;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f79735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f79736;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f79737;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PluginPreference.Input.Validator f79738;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input defaultValue(CharSequence charSequence) {
        this.f79735 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input summary(CharSequence charSequence) {
        this.f48740 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input hint(CharSequence charSequence) {
        this.f79734 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input valueAsSummary() {
        this.f79737 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input inputType(int i) {
        this.f79736 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input validator(PluginPreference.Input.Validator validator) {
        this.f79738 = validator;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f48742 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input visible(boolean z) {
        this.f48738 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input enable(boolean z) {
        this.f48736 = z;
        return this;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4481 mo3117() {
        return EnumC4481.f16026;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3118(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        int i = 566916115;
        int i2 = C3734.f12817;
        int i3 = C3779.f12953;
        int iM2761 = (i3 - C0619.m2761("ۨۖ")) * (-105);
        int i4 = ((iM2761 ^ i2) * (-4713)) ^ (-668852274);
        int i5 = -1080873315;
        while (true) {
            i = ((((i ^ i2) * (-9749)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1998279067:
                case 102781110:
                    this.f48740 = C17159.m40331(localString, (String) charSequence2);
                    iM2761 = C0619.m2761("ܶۙ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 13699) ^ (-171921999);
                    i5 = -1829254796;
                    break;
                case -1986070698:
                case -192968492:
                    C0773.m3161();
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("᩶۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12075)) ^ 205752946;
                        i5 = -1209233040;
                    } else {
                        iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                        i5 = 797703606;
                    }
                    break;
                case -1898393297:
                case -1674942998:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                        i5 = 797703606;
                    } else {
                        iM2761 = C0619.m2761("ۢۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17599) ^ (-709469060);
                        i5 = -1377126619;
                    }
                    break;
                case -1705909028:
                case -1092502259:
                    break;
                case -1636306068:
                case 1038339159:
                    RunnableC3646.m11813();
                    if (C13473.f42873 == 0) {
                        iM2761 = C0619.m2761("ᩴۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30421) ^ 652097867;
                        i5 = -834938668;
                    } else {
                        iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                        i5 = 797703606;
                    }
                    break;
                case -1619441119:
                case -1142160663:
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0773.m3169("᩶۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12075)) ^ 205752946;
                        i5 = -1209233040;
                    } else {
                        iM2761 = C0619.m2761("᩻᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22091) ^ (-125840072);
                        i5 = 19481282;
                    }
                    break;
                case -1562260549:
                case -591568019:
                    charSequence = this.f48739;
                    if (charSequence instanceof String) {
                        iM2761 = (C0773.m3169("᩸ܺ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i2) * (-22315)) ^ (-96124080);
                        i5 = 1349646065;
                    } else {
                        iM2761 = C0773.m3169("ܰ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1907) ^ 499694260;
                        i5 = 1450779117;
                    }
                    break;
                case -1292832787:
                case -1016523246:
                    charSequence2 = this.f48740;
                    if (charSequence2 instanceof String) {
                        iM2761 = C0619.m2761("ᩳ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30327) ^ (-1783532040);
                        i5 = -1585465039;
                    } else {
                        iM2761 = C0619.m2761("ܶۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13699) ^ (-171921999);
                        i5 = -1829254796;
                    }
                    break;
                case -1290518189:
                case 720395854:
                    C11235.m28309();
                    break;
                case -1261185941:
                case 1389459249:
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22711) ^ (-493840672);
                        i5 = 1634703948;
                    } else {
                        iM2761 = C0773.m3169("᩶۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12075)) ^ 205752946;
                        i5 = -1209233040;
                    }
                    break;
                case -1195051175:
                case 1744024088:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0773.m3169("᩶۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12075)) ^ 205752946;
                        i5 = -1209233040;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩹") + i2) * 63;
                        i4 = ((iM2761 ^ i3) * (-11373)) ^ (-1520268671);
                        i5 = -1698849912;
                    }
                    break;
                case -1190378842:
                case 1147914962:
                    if (C0773.m3161() != 0) {
                        iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                        i5 = 797703606;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12799) ^ (-1018017077);
                        i5 = 174683370;
                    }
                    break;
                case -747135144:
                case 941826332:
                    this.f79734 = C17159.m40331(localString, (String) charSequence3);
                    iM2761 = (i2 - C0619.m2761("֨ܶ")) * (-77);
                    i4 = ((iM2761 ^ i3) * (-12179)) ^ 1129882442;
                    i5 = -1798765028;
                    break;
                case -544276059:
                case 894345835:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22711) ^ (-493840672);
                        i5 = 1634703948;
                    } else {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20059)) ^ 2034346468;
                        i5 = -1488735397;
                    }
                    break;
                case -435120482:
                case 923256179:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("֨ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4359) ^ (-672539406);
                        i5 = 566471749;
                    } else {
                        iM2761 = C0619.m2761("ܰۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16283) ^ (-991672514);
                        i5 = -1954973894;
                    }
                    break;
                case -419283061:
                case 682775727:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22711) ^ (-493840672);
                        i5 = 1634703948;
                    } else {
                        iM2761 = C0619.m2761("ܽ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14179) ^ (-999008798);
                        i5 = -1672215355;
                    }
                    break;
                case -171138415:
                case 155462963:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۡۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22711) ^ (-493840672);
                        i5 = 1634703948;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙ᩹")) * (-57);
                        i4 = ((iM2761 ^ i2) * (-19125)) ^ 1198871456;
                        i5 = -625280606;
                    }
                    break;
                case 132637102:
                case 1263496155:
                    charSequence3 = this.f79734;
                    if (charSequence3 instanceof String) {
                        iM2761 = C0619.m2761("ܺܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2665)) ^ (-1124787363);
                        i5 = 297508714;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨ܶ")) * (-77);
                        i4 = ((iM2761 ^ i3) * (-12179)) ^ 1129882442;
                        i5 = -1798765028;
                    }
                    break;
                case 595403260:
                case 1330456805:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                        i5 = 797703606;
                    } else {
                        iM2761 = C0619.m2761("֫᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-93)) ^ 2131915858;
                        i5 = -1869295171;
                    }
                    break;
                case 815790161:
                case 955950558:
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0619.m2761("ᩴۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30421) ^ 652097867;
                        i5 = -834938668;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۡ") + i2) * (-97);
                        i4 = ((iM2761 ^ i3) * 1159) ^ 932638976;
                        i5 = 1702404675;
                    }
                    break;
                case 1070663449:
                case 1529359502:
                    AbstractC0641.m2813();
                    iM2761 = (C0773.m3169("ܶܽ") ^ i3) * 53;
                    i4 = ((iM2761 ^ i2) * 23607) ^ 51298009;
                    i5 = 797703606;
                    break;
                default:
                    this.f48739 = C17159.m40331(localString, (String) charSequence);
                    iM2761 = C0773.m3169("ܰ᩶") ^ i2;
                    i4 = ((iM2761 ^ i3) * 1907) ^ 499694260;
                    i5 = 1450779117;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3119(bin.mt.plugin.api.PluginContext r25) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24619.mo3119(bin.mt.plugin.api.PluginContext):void");
    }
}
