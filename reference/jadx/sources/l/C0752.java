package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.֡᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W3ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0752 extends AbstractC14921 implements PluginPreference.Switch {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f2751;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f2752;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f2753;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch defaultValue(boolean z) {
        this.f2752 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summary(CharSequence charSequence) {
        this.f48740 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOn(CharSequence charSequence) {
        this.f2753 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOff(CharSequence charSequence) {
        this.f2751 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f48742 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch visible(boolean z) {
        this.f48738 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch enable(boolean z) {
        this.f48736 = z;
        return this;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4481 mo3117() {
        return EnumC4481.f16024;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3118(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = -18510021;
        int i2 = RunnableC0334.f1808;
        int i3 = C1826.f6190;
        int iM2761 = (i3 - C0619.m2761("ۗᩳ")) * (-51);
        int i4 = ((iM2761 ^ i2) * (-4081)) ^ 91040448;
        int i5 = 922279091;
        while (true) {
            i = ((((i ^ i2) * (-27199)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2062586374:
                case -1672323259:
                    AbstractC3624.m11755();
                    if (C3033.f9831 < 0) {
                        iM2761 = C0773.m3169("᩶ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23851)) ^ (-1747592822);
                        i5 = -1953432817;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶᩴ")) * 73;
                        i4 = ((iM2761 ^ i3) * (-7861)) ^ (-2095167759);
                        i5 = -1643299915;
                    }
                    break;
                case -1763661879:
                case -1251138283:
                    charSequence2 = this.f48740;
                    if (charSequence2 instanceof String) {
                        iM2761 = (C0773.m3169("ۨۚ") ^ i2) * (-55);
                        i4 = ((iM2761 ^ i3) * 15293) ^ 455065952;
                        i5 = 1493805069;
                    } else {
                        iM2761 = (C0773.m3169("ܿۜ") + i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-17679)) ^ (-721683991);
                        i5 = -732021336;
                    }
                    break;
                case -1619368883:
                case 518181884:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    } else {
                        iM2761 = (C0773.m3169("ܳۢ") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 16373) ^ 772469907;
                        i5 = 292761154;
                    }
                    break;
                case -1608487588:
                case 401158241:
                    C1519.m5403();
                    C11235.m28309();
                    iM2761 = (i2 - C0773.m3169("ܶᩴ")) * 73;
                    i4 = ((iM2761 ^ i3) * (-7861)) ^ (-2095167759);
                    i5 = -1643299915;
                    break;
                case -1557907030:
                case 362310287:
                    this.f2753 = C17159.m40331(localString, (String) charSequence3);
                    iM2761 = (i2 - C0773.m3169("ۨܽ")) * 23;
                    i4 = ((iM2761 ^ i3) * (-32095)) ^ 1497383851;
                    i5 = -1998778746;
                    break;
                case -1442163329:
                case 1762412471:
                    charSequence = this.f48739;
                    if (charSequence instanceof String) {
                        iM2761 = C0773.m3169("ᩳۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18301)) ^ 1075236042;
                        i5 = 174795583;
                    } else {
                        iM2761 = C0773.m3169("ᩳۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28657)) ^ 1147049203;
                        i5 = -779408325;
                    }
                    break;
                case -1059402407:
                case 1341239117:
                    this.f2751 = C17159.m40331(localString, (String) charSequence4);
                    iM2761 = C0619.m2761("۫ۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 28733) ^ 1982263063;
                    i5 = 1223539888;
                    break;
                case -1026172944:
                case 2102566707:
                    break;
                case -994213566:
                case -815356670:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4767) ^ (-879760489);
                        i5 = 350139157;
                    }
                    break;
                case -872698530:
                case -58433876:
                    charSequence3 = this.f2753;
                    if (charSequence3 instanceof String) {
                        iM2761 = C0619.m2761("۬ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29619)) ^ 504031870;
                        i5 = 1904051207;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۨܽ")) * 23;
                        i4 = ((iM2761 ^ i3) * (-32095)) ^ 1497383851;
                        i5 = -1998778746;
                    }
                    break;
                case -847944660:
                case 1955636279:
                    C1146.m4231();
                    RunnableC3055.m9933();
                    break;
                case -796985572:
                case 371088764:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i2 - C0773.m3169("֡ۢ")) * 65;
                        i4 = ((iM2761 ^ i3) * 16391) ^ 1991201664;
                        i5 = 969145259;
                    } else {
                        iM2761 = (C0773.m3169("ۖۡ") + i2) * 61;
                        i4 = ((iM2761 ^ i3) * 27261) ^ 1742363894;
                        i5 = -1060766827;
                    }
                    break;
                case -643018206:
                case -237887569:
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ۡ۫") + i2) * (-31);
                        i4 = ((iM2761 ^ i3) * 7267) ^ 1416815535;
                        i5 = -1985021276;
                    } else {
                        iM2761 = C0773.m3169("᩶ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23851)) ^ (-1747592822);
                        i5 = -1953432817;
                    }
                    break;
                case -551385242:
                case -277417013:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܶᩴ")) * 73;
                        i4 = ((iM2761 ^ i3) * (-7861)) ^ (-2095167759);
                        i5 = -1643299915;
                    }
                    break;
                case -502757999:
                case 1459912660:
                    C2023.m6964();
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i2 - C0773.m3169("֡ۢ")) * 65;
                        i4 = ((iM2761 ^ i3) * 16391) ^ 1991201664;
                        i5 = 969145259;
                    } else {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    }
                    break;
                case -472128688:
                case 238428711:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    } else {
                        iM2761 = C0773.m3169("ۚܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6759)) ^ (-839252813);
                        i5 = 1099622168;
                    }
                    break;
                case -241359193:
                case 1218726065:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("ܿܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6535) ^ 891689483;
                        i5 = -1429897892;
                    } else {
                        iM2761 = C0773.m3169("᩶ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23851)) ^ (-1747592822);
                        i5 = -1953432817;
                    }
                    break;
                case -200572547:
                case 1807471912:
                    if (C13473.f42873 != 0) {
                        iM2761 = (i2 - C0773.m3169("ܶᩴ")) * 73;
                        i4 = ((iM2761 ^ i3) * (-7861)) ^ (-2095167759);
                        i5 = -1643299915;
                    } else {
                        iM2761 = (C0773.m3169("ۢ۠") ^ i2) * (-101);
                        i4 = ((iM2761 ^ i3) * 6705) ^ 986997341;
                        i5 = -2100808993;
                    }
                    break;
                case -152839172:
                case 628035420:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ܳᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28039) ^ (-114899323);
                        i5 = 1930230310;
                    } else {
                        iM2761 = (C0773.m3169("᩺ᩳ") ^ i3) * 37;
                        i4 = ((iM2761 ^ i2) * 28603) ^ 548083093;
                        i5 = -571194201;
                    }
                    break;
                case 576017002:
                case 1559302000:
                    charSequence4 = this.f2751;
                    if (charSequence4 instanceof String) {
                        iM2761 = (C0619.m2761("۠᩵") ^ i3) * 35;
                        i4 = ((iM2761 ^ i2) * (-20163)) ^ 719004961;
                        i5 = 196603599;
                    } else {
                        iM2761 = C0619.m2761("۫ۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28733) ^ 1982263063;
                        i5 = 1223539888;
                    }
                    break;
                case 747603120:
                case 1071116087:
                    this.f48739 = C17159.m40331(localString, (String) charSequence);
                    iM2761 = C0773.m3169("ᩳۜ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-28657)) ^ 1147049203;
                    i5 = -779408325;
                    break;
                case 1230963764:
                case 1524451621:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31637) ^ 536100961;
                        i5 = 1656448167;
                    } else {
                        iM2761 = C0773.m3169("۬ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29005)) ^ 96332014;
                        i5 = -823149582;
                    }
                    break;
                case 1692976979:
                case 1882943619:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i2 - C0773.m3169("֡ۢ")) * 65;
                        i4 = ((iM2761 ^ i3) * 16391) ^ 1991201664;
                        i5 = 969145259;
                    } else {
                        iM2761 = (C0773.m3169("᩺ۨ") ^ i3) * (-9);
                        i4 = ((iM2761 ^ i2) * (-19055)) ^ (-1496926163);
                        i5 = -1438259379;
                    }
                    break;
                default:
                    this.f48740 = C17159.m40331(localString, (String) charSequence2);
                    iM2761 = (C0773.m3169("ܿۜ") + i3) * 41;
                    i4 = ((iM2761 ^ i2) * (-17679)) ^ (-721683991);
                    i5 = -732021336;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3119(bin.mt.plugin.api.PluginContext r28) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0752.mo3119(bin.mt.plugin.api.PluginContext):void");
    }
}
