package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3ZW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8210 extends AbstractC14921 implements PluginPreference.Text {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f27035;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnTextItemClickListener f27036;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text summary(CharSequence charSequence) {
        this.f48740 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text url(String str) {
        this.f27035 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text onClick(PluginPreference.OnTextItemClickListener onTextItemClickListener) {
        this.f27036 = onTextItemClickListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f48742 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text visible(boolean z) {
        this.f48738 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text enable(boolean z) {
        this.f48736 = z;
        return this;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4481 mo3117() {
        return EnumC4481.f16027;
    }

    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3118(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        int i = -475144111;
        int i2 = C1146.f4234;
        int i3 = C2834.f9334;
        int iM3169 = (C0773.m3169("ܶ۟") + i3) * (-31);
        int i4 = ((iM3169 ^ i2) * 14125) ^ 1334798061;
        int i5 = 563559465;
        while (true) {
            i = ((((i ^ i2) * 12551) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2099102167:
                case -695607605:
                    if (C1564.f5401 > 0) {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25293) ^ (-326800112);
                        i5 = -378438896;
                    } else {
                        iM3169 = C0773.m3169("ܽܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10785)) ^ (-2093801225);
                        i5 = -893436038;
                    }
                    break;
                case -1947905103:
                case 1346091109:
                    charSequence2 = this.f48740;
                    if (charSequence2 instanceof String) {
                        iM3169 = C0773.m3169("᩸֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6729)) ^ (-2038697733);
                        i5 = 334353217;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩸ۖ")) * (-91);
                        i4 = ((iM3169 ^ i2) * 17731) ^ 1879466944;
                        i5 = 1212859867;
                    }
                    break;
                case -1715946335:
                case -525307127:
                    break;
                case -1550338192:
                case -754709668:
                    this.f48740 = C17159.m40331(localString, (String) charSequence2);
                    iM3169 = (i3 - C0773.m3169("᩸ۖ")) * (-91);
                    i4 = ((iM3169 ^ i2) * 17731) ^ 1879466944;
                    i5 = 1212859867;
                    break;
                case -1506265638:
                case -178824990:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0773.m3169("ܽܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10785)) ^ (-2093801225);
                        i5 = -893436038;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫᩹")) * (-125);
                        i4 = ((iM3169 ^ i2) * 2927) ^ (-709269057);
                        i5 = -1334820573;
                    }
                    break;
                case -1499754166:
                case 1103476664:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25293) ^ (-326800112);
                        i5 = -378438896;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21567)) ^ (-1504199781);
                        i5 = 1474451543;
                    }
                    break;
                case -1340036389:
                case -243230405:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29949) ^ (-1222077671);
                        i5 = 1470142034;
                    } else {
                        iM3169 = C0619.m2761("᩺ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12385) ^ 895818585;
                        i5 = -1815853758;
                    }
                    break;
                case -1052788157:
                case 2059831009:
                    C3077.m10041();
                    iM3169 = (i3 - C0773.m3169("֫᩹")) * (-125);
                    i4 = ((iM3169 ^ i2) * 2927) ^ (-709269057);
                    i5 = -1334820573;
                    break;
                case -817780978:
                case 413860402:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25293) ^ (-326800112);
                        i5 = -378438896;
                    } else {
                        iM3169 = C0619.m2761("ܿ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8577)) ^ (-738952418);
                        i5 = 2138484282;
                    }
                    break;
                case -721804838:
                case 809499750:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29949) ^ (-1222077671);
                        i5 = 1470142034;
                    } else {
                        iM3169 = C0619.m2761("ܶۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17303)) ^ 657629237;
                        i5 = 1715673445;
                    }
                    break;
                case -700800756:
                case 370703832:
                    charSequence = this.f48739;
                    if (charSequence instanceof String) {
                        iM3169 = C0773.m3169("ۡ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-12979)) ^ 1340618024;
                        i5 = 1058686635;
                    } else {
                        iM3169 = C0773.m3169("ܳᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13057) ^ 1224876966;
                        i5 = -532537401;
                    }
                    break;
                case -495069162:
                case 847993198:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (i2 - C0773.m3169("ܺۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 7729) ^ (-1175409734);
                        i5 = 349182403;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۟ܰ")) * (-69);
                        i4 = ((iM3169 ^ i3) * (-4913)) ^ (-924620136);
                        i5 = 196058395;
                    }
                    break;
                case -301780174:
                case 398764870:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25293) ^ (-326800112);
                        i5 = -378438896;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۬") + i2) * 99;
                        i4 = ((iM3169 ^ i3) * (-27791)) ^ 1495747431;
                        i5 = 404173110;
                    }
                    break;
                case -116084539:
                case 1724110502:
                    C1826.m6301();
                    break;
                case 399069026:
                case 1147152688:
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("ᩴ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14935) ^ (-1748605631);
                        i5 = 1485721623;
                    } else {
                        iM3169 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29949) ^ (-1222077671);
                        i5 = 1470142034;
                    }
                    break;
                case 417977324:
                case 1356716089:
                    if (C3492.f12043 > 0) {
                        iM3169 = (i2 - C0773.m3169("ܺۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 7729) ^ (-1175409734);
                        i5 = 349182403;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫᩹")) * (-125);
                        i4 = ((iM3169 ^ i2) * 2927) ^ (-709269057);
                        i5 = -1334820573;
                    }
                    break;
                case 434206689:
                case 1884499793:
                    this.f48739 = C17159.m40331(localString, (String) charSequence);
                    iM3169 = C0773.m3169("ܳᩳ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 13057) ^ 1224876966;
                    i5 = -532537401;
                    break;
                case 599662777:
                case 2138229675:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ᩳۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6311) ^ (-1321643096);
                        i5 = -239086722;
                    } else {
                        iM3169 = C0773.m3169("ܽܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10785)) ^ (-2093801225);
                        i5 = -893436038;
                    }
                    break;
                case 737883485:
                case 1680514992:
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("ܺ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18991)) ^ 66893972;
                        i5 = -1094071795;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܺۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 7729) ^ (-1175409734);
                        i5 = 349182403;
                    }
                    break;
                default:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i3 - C0773.m3169("֫᩹")) * (-125);
                        i4 = ((iM3169 ^ i2) * 2927) ^ (-709269057);
                        i5 = -1334820573;
                    } else {
                        iM3169 = C0773.m3169("᩵ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-581)) ^ 529633188;
                        i5 = -1388882240;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0357 A[PHI: r6 r7
      0x0357: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:102:0x0355, B:66:0x01fa, B:24:0x00b6, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:102:0x0355, B:66:0x01fa, B:24:0x00b6, B:16:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ad A[PHI: r11 r14
      0x01ad: PHI (r11v4 java.lang.CharSequence) = 
      (r11v3 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
     binds: [B:56:0x0195, B:48:0x0151, B:42:0x0115, B:36:0x00dc, B:30:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r14v5 java.lang.String) = 
      (r14v2 java.lang.String)
      (r14v4 java.lang.String)
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
     binds: [B:56:0x0195, B:48:0x0151, B:42:0x0115, B:36:0x00dc, B:30:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01de A[PHI: r8 r9 r12
      0x01de: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:61:0x01c7, B:53:0x0175, B:45:0x0132, B:39:0x00f8, B:33:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:61:0x01c7, B:53:0x0175, B:45:0x0132, B:39:0x00f8, B:33:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r12v5 java.lang.String) = 
      (r12v2 java.lang.String)
      (r12v4 java.lang.String)
      (r12v2 java.lang.String)
      (r12v2 java.lang.String)
      (r12v2 java.lang.String)
     binds: [B:61:0x01c7, B:53:0x0175, B:45:0x0132, B:39:0x00f8, B:33:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0290  */
    /* JADX WARN: Code duplicated, block: B:87:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:99:0x0328  */
    @Override // l.AbstractC14921
    /* JADX INFO: renamed from: ۙ */
    public final void mo3119(PluginContext pluginContext) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3779.f12953;
        int i4 = C3492.f12043;
        int iM2761 = C0619.m2761("ۤܳ") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-621)) ^ 1282567732;
        String str = null;
        int i6 = iM2761 ^ (-1620349035);
        CharSequence charSequence = null;
        char c = 0;
        int i7 = 0;
        char c2 = 0;
        int i8 = 0;
        int i9 = 2141666907;
        boolean z = false;
        CharSequence charSequence2 = null;
        String str2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i10 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * (-23895)) >> 31));
            switch (i9) {
                case -2139967053:
                case 1797828317:
                    if (C4282.m13656(str, i8) == c2) {
                        iM3169 = (C0773.m3169("ܶۢ") + i3) * (-119);
                        i = ((iM3169 ^ i4) * (-5893)) ^ 1766055559;
                        i2 = -1870423055;
                    } else {
                        charSequence2 = charSequence3;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 19787) ^ (-1391641971);
                        i2 = 800488323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2113689801:
                case -1935855725:
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("֨ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-20145)) ^ 840020279;
                        i2 = 131656734;
                    } else {
                        iM3169 = C0773.m3169("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-14351)) ^ 560136630;
                        i2 = 1952409864;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1879315723:
                case -197718340:
                    this.f48739 = charSequence4;
                    charSequence3 = this.f48740;
                    if (charSequence3 instanceof String) {
                        iM3169 = C0619.m2761("ܿ۬") ^ i4;
                        i = ((iM3169 ^ i3) * 11617) ^ (-407273386);
                        i2 = -676770766;
                    } else {
                        charSequence2 = charSequence3;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 19787) ^ (-1391641971);
                        i2 = 800488323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1825931992:
                case -547478501:
                    if (C1321.f4751 < 0) {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 19373) ^ (-663439954);
                        i2 = -53348785;
                    } else {
                        iM3169 = C0773.m3169("᩹۠") ^ i4;
                        i = ((iM3169 ^ i3) * 25477) ^ (-772682678);
                        i2 = -2030721753;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1795161495:
                case -1602465157:
                    if (C0773.f2792 > 0) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-14351)) ^ 560136630;
                        i2 = 1952409864;
                    } else {
                        iM3169 = (C0773.m3169("᩻۫") + i3) * (-47);
                        i = ((iM3169 ^ i4) * 25959) ^ 995755626;
                        i2 = -396260870;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1551005905:
                case -581230450:
                    C0950.m3785();
                    C0773.m3161();
                    iM3169 = C0619.m2761("ۗ᩺") ^ i4;
                    i = ((iM3169 ^ i3) * 19373) ^ (-663439954);
                    i2 = -53348785;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1274140132:
                case -205399393:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 18287) ^ (-1650421244);
                        i2 = -188508564;
                    } else {
                        iM3169 = (C0619.m2761("ۤ֫") + i4) * 37;
                        i = ((iM3169 ^ i3) * (-5721)) ^ (-576394110);
                        i2 = 1487484860;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1260673898:
                case 1743186235:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 19373) ^ (-663439954);
                        i2 = -53348785;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩹") ^ i3;
                        i = ((iM3169 ^ i4) * 28341) ^ 2121686112;
                        i2 = -66044678;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1216445137:
                case 1996021428:
                    str2 = (String) charSequence;
                    if (C2966.m9671(str2) >= i10) {
                        iM3169 = (C0619.m2761("᩸ۖ") + i4) * 101;
                        i = ((iM3169 ^ i3) * 10621) ^ 1093137561;
                        i2 = -1000396648;
                    } else {
                        charSequence4 = charSequence;
                        iM3169 = C0619.m2761("ۚ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-29735)) ^ 1449189787;
                        i2 = -1676830495;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1167233556:
                case 57773284:
                    RunnableC1848.m6360();
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-14351)) ^ 560136630;
                        i2 = 1952409864;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 18287) ^ (-1650421244);
                        i2 = -188508564;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1087297690:
                case 699512457:
                    C4282.m13644();
                    if (C1564.m5509() > 0) {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 18287) ^ (-1650421244);
                        i2 = -188508564;
                    } else {
                        iM3169 = C0773.m3169("᩵۫") ^ i3;
                        i = ((iM3169 ^ i4) * 8227) ^ (-258826008);
                        i2 = -154843589;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1000392842:
                case 1546625042:
                    str = (String) charSequence3;
                    if (C3077.m10045(str) >= i10) {
                        iM3169 = (i3 - C0773.m3169("᩸ۚ")) * (-89);
                        i = ((iM3169 ^ i4) * (-8783)) ^ (-1536866661);
                        i2 = 190451967;
                    } else {
                        charSequence2 = charSequence3;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 19787) ^ (-1391641971);
                        i2 = 800488323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -743099555:
                case 960557123:
                    if (RunnableC3646.m11801(i7, str) == c) {
                        iM3169 = C0773.m3169("ۗ۫") ^ i4;
                        i = ((iM3169 ^ i3) * 19351) ^ 205185028;
                        i2 = -145664990;
                    } else {
                        charSequence2 = charSequence3;
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i3) * 95;
                        i = ((iM3169 ^ i4) * 19787) ^ (-1391641971);
                        i2 = 800488323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -731509103:
                case 338609893:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("᩹۠") ^ i4;
                        i = ((iM3169 ^ i3) * 25477) ^ (-772682678);
                        i2 = -2030721753;
                    } else {
                        iM3169 = C0619.m2761("֡ۜ") ^ i3;
                        i = ((iM3169 ^ i4) * 13387) ^ (-570496587);
                        i2 = 1383095253;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -712471699:
                case 226089595:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 18287) ^ (-1650421244);
                        i2 = -188508564;
                    } else {
                        iM3169 = C0773.m3169("۟ۛ") ^ i4;
                        i = ((iM3169 ^ i3) * 13501) ^ (-877373159);
                        i2 = 1660415145;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -707322671:
                case -559390868:
                    i8 = 0;
                    i10 = 3;
                    if (z) {
                        iM3169 = C0619.m2761("۟ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 7647) ^ (-1621799942);
                        i2 = 1600150466;
                    } else {
                        charSequence4 = charSequence;
                        iM3169 = C0619.m2761("ۚ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-29735)) ^ 1449189787;
                        i2 = -1676830495;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -664631320:
                case -350569471:
                    String strM7742 = C2287.m7742(pluginContext, str2);
                    if (strM7742 != null) {
                        charSequence4 = strM7742;
                    } else {
                        charSequence4 = charSequence;
                    }
                    iM3169 = C0619.m2761("ۚ᩷") ^ i4;
                    i = ((iM3169 ^ i3) * (-29735)) ^ 1449189787;
                    i2 = -1676830495;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -533008481:
                case 965090205:
                    i7 = 1;
                    c2 = '{';
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۢ۬") ^ i3;
                        i = ((iM3169 ^ i4) * (-14351)) ^ 560136630;
                        i2 = 1952409864;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩶ۡ")) * 89;
                        i = ((iM3169 ^ i3) * 16327) ^ 500566613;
                        i2 = 825536642;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -458812897:
                case 1385265766:
                    String strM3508 = C0862.m3508(pluginContext, str);
                    if (strM3508 != null) {
                        charSequence2 = strM3508;
                    } else {
                        charSequence2 = charSequence3;
                    }
                    iM3169 = (C0773.m3169("᩻ܿ") ^ i3) * 95;
                    i = ((iM3169 ^ i4) * 19787) ^ (-1391641971);
                    i2 = 800488323;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -282622971:
                case -194803865:
                    C3033.m9845();
                    break;
                case -266397521:
                case 1863917001:
                    if (C1146.m4221(i7, str2) == c) {
                        iM3169 = (C0619.m2761("ۡܽ") + i3) * 9;
                        i = ((iM3169 ^ i4) * 14661) ^ 1108633758;
                        i2 = -1375705942;
                    } else {
                        charSequence4 = charSequence;
                        iM3169 = C0619.m2761("ۚ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-29735)) ^ 1449189787;
                        i2 = -1676830495;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 347486834:
                case 1919412718:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("᩹۠") ^ i4;
                        i = ((iM3169 ^ i3) * 25477) ^ (-772682678);
                        i2 = -2030721753;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۬ۙ")) * 47;
                        i = ((iM3169 ^ i3) * 32717) ^ (-610032761);
                        i2 = -839333665;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 583358605:
                case 1595734573:
                    this.f48740 = charSequence2;
                    break;
                case 610235758:
                case 1971071026:
                    charSequence = this.f48739;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("ᩴۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17949)) ^ (-615918140);
                        i2 = 977539238;
                    } else {
                        iM3169 = C0773.m3169("ܺۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18463)) ^ (-187719189);
                        i2 = 25759879;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 634220539:
                case 791082979:
                    if (C4282.m13656(str2, i8) == c2) {
                        iM3169 = C0619.m2761("ۨ᩻") ^ i4;
                        i = ((iM3169 ^ i3) * 1531) ^ (-299927166);
                        i2 = -471239435;
                    } else {
                        charSequence4 = charSequence;
                        iM3169 = C0619.m2761("ۚ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-29735)) ^ 1449189787;
                        i2 = -1676830495;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 672247644:
                case 772980325:
                    boolean z2 = charSequence instanceof String;
                    if (C13473.f42873 != 0) {
                        z = z2;
                        c = '}';
                        iM3169 = C0773.m3169("ᩴۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-17949)) ^ (-615918140);
                        i2 = 977539238;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31610 = C0773.m3169("ۗ᩸") ^ i3;
                        z = z2;
                        i6 = iM31610 ^ (-912107480);
                        i5 = ((iM31610 ^ i4) * (-20955)) ^ (-29288140);
                        c = '}';
                    }
                    break;
                case 724176385:
                case 2078848952:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("᩹۠") ^ i4;
                        i = ((iM3169 ^ i3) * 25477) ^ (-772682678);
                        i2 = -2030721753;
                    } else {
                        iM3169 = C0773.m3169("ᩴۡ") ^ i3;
                        i = ((iM3169 ^ i4) * (-28401)) ^ (-603392110);
                        i2 = 1543277109;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1004448114:
                case 1895934908:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("᩹۠") ^ i4;
                        i = ((iM3169 ^ i3) * 25477) ^ (-772682678);
                        i2 = -2030721753;
                    } else {
                        iM3169 = C0773.m3169("ܺᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6051)) ^ (-1254373875);
                        i2 = 1720340097;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C13473.f42873 == 0) {
                        iM3169 = C0619.m2761("ۗ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 19373) ^ (-663439954);
                        i2 = -53348785;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 18287) ^ (-1650421244);
                        i2 = -188508564;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
