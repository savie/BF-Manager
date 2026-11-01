package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.ۨ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11715 extends AbstractC2896 implements PluginPreference.Switch {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public CharSequence f39365;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f39366;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39367;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch defaultValue(boolean z) {
        this.f39367 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summary(CharSequence charSequence) {
        this.f10928 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOn(CharSequence charSequence) {
        this.f39366 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOff(CharSequence charSequence) {
        this.f39365 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f10926 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch visible(boolean z) {
        this.f10925 = z;
        return this;
    }

    @Override // l.AbstractC2896
    /* JADX INFO: renamed from: ۙ */
    public final void mo5131(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = -1665644092;
        int i2 = C0050.f912;
        int i3 = C1937.f7317;
        int iM45029 = C19806.m45029("۠ۚ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-18689)) ^ 1435864641;
        int i5 = 535507748;
        while (true) {
            i = ((((i ^ i2) * 21075) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1955267437:
                case 1115304457:
                    charSequence3 = this.f39366;
                    if (charSequence3 instanceof String) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2145)) ^ 793435007;
                        i5 = 1882195371;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۟᩻")) * 3;
                        i4 = ((iM45029 ^ i3) * (-7655)) ^ 1695488585;
                        i5 = -323074766;
                    }
                    break;
                case -1874503589:
                case 181551618:
                    if (C3577.m10565()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜᩳ") ^ i3) * (-69);
                        i4 = ((iM45029 ^ i2) * (-11821)) ^ 594371808;
                        i5 = -1068763460;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    }
                    break;
                case -1806003498:
                case 146979335:
                    charSequence4 = this.f39365;
                    if (charSequence4 instanceof String) {
                        iM45029 = C19806.m45029("ۘۧ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 3711) ^ 1603944246;
                        i5 = 1059423617;
                    } else {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19487) ^ (-1926526316);
                        i5 = 1406102990;
                    }
                    break;
                case -1746655818:
                case -324774448:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۛ")) * (-51);
                        i4 = ((iM45029 ^ i3) * 31959) ^ (-682272354);
                        i5 = -678470394;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3825)) ^ 1758810221;
                        i5 = 1549211945;
                    }
                    break;
                case -1709049575:
                case 1108131772:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۖܳ")) * (-109);
                        i4 = ((iM45029 ^ i3) * (-15701)) ^ (-1071594165);
                        i5 = 1954748722;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩹۟")) * 83;
                        i4 = ((iM45029 ^ i2) * (-1781)) ^ 2044137358;
                        i5 = 448775517;
                    }
                    break;
                case -1685111133:
                case 1743784233:
                    this.f39366 = C0074.m1001(localString, (String) charSequence3);
                    iM45029 = (i2 - C19806.m45029("۟᩻")) * 3;
                    i4 = ((iM45029 ^ i3) * (-7655)) ^ 1695488585;
                    i5 = -323074766;
                    break;
                case -1528484035:
                case 1899258437:
                    C3743.m10966();
                    C1977.m6356();
                    iM45029 = C19806.m45029("ۜۚ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                    i5 = -1046097681;
                    break;
                case -1493068417:
                case -151873491:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - C19806.m45029("ۖܳ")) * (-109);
                        i4 = ((iM45029 ^ i3) * (-15701)) ^ (-1071594165);
                        i5 = 1954748722;
                    } else {
                        iM45029 = C19806.m45029("֫ۘ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 14943) ^ (-468961430);
                        i5 = -2023452166;
                    }
                    break;
                case -1393792474:
                case 1975378074:
                    if (C0278.m1789() > 0) {
                        iM45029 = (i2 - C19806.m45029("ۖܳ")) * (-109);
                        i4 = ((iM45029 ^ i3) * (-15701)) ^ (-1071594165);
                        i5 = 1954748722;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    }
                    break;
                case -1209302210:
                case -659538913:
                    charSequence = this.f10931;
                    if (charSequence instanceof String) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21637) ^ (-446042019);
                        i5 = -2058800826;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬۬")) * 67;
                        i4 = ((iM45029 ^ i2) * 29597) ^ 891970297;
                        i5 = 1456535767;
                    }
                    break;
                case -1200378305:
                case -659921787:
                    break;
                case -1076035987:
                case 71185447:
                    C7105.m18985();
                    if (C10634.f36300 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21445) ^ 1089208164;
                        i5 = -1644070271;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۟") + i2) * 43;
                        i4 = ((iM45029 ^ i3) * 28305) ^ (-263775267);
                        i5 = 1873379973;
                    }
                    break;
                case -1005581661:
                case 461396993:
                    this.f10928 = C0074.m1001(localString, (String) charSequence2);
                    iM45029 = C19806.m45029("᩷֨") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-2771)) ^ (-871159191);
                    i5 = 1623962607;
                    break;
                case -916417777:
                case 393869030:
                    this.f10931 = C0074.m1001(localString, (String) charSequence);
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("۬۬")) * 67;
                    i4 = ((iM45029 ^ i2) * 29597) ^ 891970297;
                    i5 = 1456535767;
                    break;
                case -884031852:
                case 1853005027:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܺܿ")) * (-75);
                        i4 = ((iM45029 ^ i3) * (-16255)) ^ (-574974462);
                        i5 = 1066267629;
                    }
                    break;
                case -828635095:
                case -311907061:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 919) ^ (-843872199);
                        i5 = 1287470033;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    }
                    break;
                case -456639536:
                case 1381265661:
                    charSequence2 = this.f10928;
                    if (charSequence2 instanceof String) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֫") + i2) * (-73);
                        i4 = ((iM45029 ^ i3) * (-15783)) ^ 674420066;
                        i5 = -2088184306;
                    } else {
                        iM45029 = C19806.m45029("᩷֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2771)) ^ (-871159191);
                        i5 = 1623962607;
                    }
                    break;
                case -423961472:
                case -303219906:
                    if (!C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ۟") + i2) * 43;
                        i4 = ((iM45029 ^ i3) * 28305) ^ (-263775267);
                        i5 = 1873379973;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    }
                    break;
                case -195584589:
                case 593209214:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ۜۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-3927)) ^ 453712179;
                        i5 = -1046097681;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۤ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29771) ^ 877615841;
                        i5 = 1506017135;
                    }
                    break;
                case 193973367:
                case 367639936:
                    if (C1977.m6356()) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * 21445) ^ 1089208164;
                        i5 = -1644070271;
                    } else {
                        iM45029 = C19806.m45029("ܿ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17203) ^ (-2076008569);
                        i5 = 114572847;
                    }
                    break;
                case 263817919:
                case 706313980:
                    C2249.m6915();
                    break;
                case 1464452468:
                case 2008154296:
                    if (C3743.f13569) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤܺ")) * (-25);
                        i4 = ((iM45029 ^ i3) * (-21993)) ^ (-1256807588);
                        i5 = 403221517;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽۛ")) * (-51);
                        i4 = ((iM45029 ^ i3) * 31959) ^ (-682272354);
                        i5 = -678470394;
                    }
                    break;
                case 1930413933:
                case 1981509284:
                    this.f39365 = C0074.m1001(localString, (String) charSequence4);
                    iM45029 = C19806.m45029("֫ۧ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 19487) ^ (-1926526316);
                    i5 = 1406102990;
                    break;
                default:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i2 - C19806.m45029("ۖܳ")) * (-109);
                        i4 = ((iM45029 ^ i3) * (-15701)) ^ (-1071594165);
                        i5 = 1954748722;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1737)) ^ 832229661;
                        i5 = -704106884;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch enable(boolean z) {
        this.f10927 = z;
        return this;
    }

    @Override // l.AbstractC2896
    /* JADX INFO: renamed from: ۙ */
    public final EnumC9248 mo5130() {
        return EnumC9248.f31456;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18461. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC2896
    /* JADX INFO: renamed from: ۙ */
    public final void mo5132(bin.mt.plugin.api.PluginContext r28) {
        /*
            Method dump skipped, instruction units count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11715.mo5132(bin.mt.plugin.api.PluginContext):void");
    }
}
