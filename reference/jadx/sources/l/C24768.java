package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩻ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24768 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f80161 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f80160 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f80163 = new C21287();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f80162 = new StringBuilder();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:126:0x022d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x023a  */
    /* JADX WARN: Code duplicated, block: B:130:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x024f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0254  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0264  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0271  */
    /* JADX WARN: Code duplicated, block: B:144:0x0281  */
    /* JADX WARN: Code duplicated, block: B:145:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02da  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0281, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m55289(C21287 c21287) {
        String strSubstring;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        StringBuilder sb = this.f80162;
        int i = 0;
        sb.setLength(0);
        int iM48516 = c21287.m48516();
        while (!TextUtils.isEmpty(c21287.m48515(StandardCharsets.UTF_8))) {
        }
        byte[] bArrM48497 = c21287.m48497();
        int iM48517 = c21287.m48516();
        C21287 c21288 = this.f80163;
        c21288.m48491(iM48517, bArrM48497);
        c21288.m48510(iM48516);
        ArrayList arrayList = new ArrayList();
        while (true) {
            m55288(c21288);
            if (c21288.m48486() >= 5 && "::cue".equals(c21288.m48488(5, StandardCharsets.UTF_8))) {
                int iM48518 = c21288.m48516();
                String strM55287 = m55287(c21288, sb);
                if (strM55287 == null) {
                    strSubstring = null;
                } else if ("{".equals(strM55287)) {
                    c21288.m48510(iM48518);
                    strSubstring = "";
                } else {
                    if (MotionUtils.EASING_TYPE_FORMAT_START.equals(strM55287)) {
                        int iM48519 = c21288.m48516();
                        int iM48509 = c21288.m48509();
                        boolean z2 = false;
                        while (iM48519 < iM48509 && !z2) {
                            int i2 = iM48519 + 1;
                            z2 = ((char) c21288.m48497()[iM48519]) == ')';
                            iM48519 = i2;
                        }
                        strSubstring = c21288.m48488((iM48519 - 1) - c21288.m48516(), StandardCharsets.UTF_8).trim();
                    } else {
                        strSubstring = null;
                    }
                    if (!MotionUtils.EASING_TYPE_FORMAT_END.equals(m55287(c21288, sb))) {
                        strSubstring = null;
                    }
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring != null && "{".equals(m55287(c21288, sb))) {
                C16562 c16562 = new C16562();
                if (!strSubstring.isEmpty()) {
                    int iIndexOf = strSubstring.indexOf(91);
                    if (iIndexOf != -1) {
                        Matcher matcher2 = f80161.matcher(strSubstring.substring(iIndexOf));
                        if (matcher2.matches()) {
                            String strGroup2 = matcher2.group(1);
                            strGroup2.getClass();
                            c16562.m39234(strGroup2);
                        }
                        strSubstring = strSubstring.substring(i, iIndexOf);
                    }
                    String str = C7116.f23455;
                    String[] strArrSplit = strSubstring.split("\\.", -1);
                    String str2 = strArrSplit[i];
                    int iIndexOf2 = str2.indexOf(35);
                    if (iIndexOf2 != -1) {
                        c16562.m39221(str2.substring(i, iIndexOf2));
                        c16562.m39230(str2.substring(iIndexOf2 + 1));
                    } else {
                        c16562.m39221(str2);
                    }
                    if (strArrSplit.length > 1) {
                        int length = strArrSplit.length;
                        C20782.m47565(length <= strArrSplit.length);
                        c16562.m39217((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                    }
                }
                boolean z3 = false;
                String strM55288 = null;
                while (!z3) {
                    int iM485110 = c21288.m48516();
                    strM55288 = m55287(c21288, sb);
                    boolean z4 = strM55288 == null || l.d.equals(strM55288);
                    if (!z4) {
                        c21288.m48510(iM485110);
                        m55288(c21288);
                        String strM55286 = m55286(c21288, sb);
                        if (!strM55286.isEmpty() && ":".equals(m55287(c21288, sb))) {
                            m55288(c21288);
                            StringBuilder sb2 = new StringBuilder();
                            boolean z5 = false;
                            while (true) {
                                if (!z5) {
                                    int iM485111 = c21288.m48516();
                                    String strM55289 = m55287(c21288, sb);
                                    if (strM55289 == null) {
                                        string = null;
                                    } else if (l.d.equals(strM55289) || l.b.equals(strM55289)) {
                                        c21288.m48510(iM485111);
                                        z5 = true;
                                    } else {
                                        sb2.append(strM55289);
                                    }
                                } else {
                                    string = sb2.toString();
                                }
                            }
                            if (string != null && !string.isEmpty()) {
                                int iM485112 = c21288.m48516();
                                String strM552810 = m55287(c21288, sb);
                                if (!l.b.equals(strM552810)) {
                                    if (l.d.equals(strM552810)) {
                                        c21288.m48510(iM485112);
                                        if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM55286)) {
                                            c16562.m39229(C18544.m43126(string));
                                        } else if ("background-color".equals(strM55286)) {
                                            c16562.m39214(C18544.m43126(string));
                                        } else if ("ruby-position".equals(strM55286)) {
                                            if ("over".equals(string)) {
                                                c16562.m39233(1);
                                            } else if ("under".equals(string)) {
                                                c16562.m39233(2);
                                            }
                                        } else if ("text-combine-upright".equals(strM55286)) {
                                            if (!ProviderConfigurationPermission.ALL_STR.equals(string) || string.startsWith("digits")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            c16562.m39216(z);
                                        } else if ("text-decoration".equals(strM55286)) {
                                            if ("underline".equals(string)) {
                                                c16562.m39235();
                                            }
                                        } else if ("font-family".equals(strM55286)) {
                                            c16562.m39215(string);
                                        } else if ("font-weight".equals(strM55286)) {
                                            if ("bold".equals(string)) {
                                                c16562.m39227();
                                            }
                                        } else if ("font-style".equals(strM55286)) {
                                            if ("italic".equals(string)) {
                                                c16562.m39225();
                                            }
                                        } else if ("font-size".equals(strM55286)) {
                                            matcher = f80160.matcher(C7914.m21453(string));
                                            if (!matcher.matches()) {
                                                C1896.m6517("Invalid font-size: '" + string + "'.");
                                            } else {
                                                strGroup = matcher.group(2);
                                                strGroup.getClass();
                                                switch (strGroup) {
                                                    case "%":
                                                        b = 0;
                                                    case "em":
                                                        b = 1;
                                                    case "px":
                                                        b = 2;
                                                    default:
                                                        b = -1;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM55286)) {
                                    c16562.m39229(C18544.m43126(string));
                                } else if ("background-color".equals(strM55286)) {
                                    c16562.m39214(C18544.m43126(string));
                                } else if ("ruby-position".equals(strM55286)) {
                                    if ("over".equals(string)) {
                                        c16562.m39233(1);
                                    } else if ("under".equals(string)) {
                                        c16562.m39233(2);
                                    }
                                } else if ("text-combine-upright".equals(strM55286)) {
                                    if (ProviderConfigurationPermission.ALL_STR.equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    c16562.m39216(z);
                                } else if ("text-decoration".equals(strM55286)) {
                                    if ("underline".equals(string)) {
                                        c16562.m39235();
                                    }
                                } else if ("font-family".equals(strM55286)) {
                                    c16562.m39215(string);
                                } else if ("font-weight".equals(strM55286)) {
                                    if ("bold".equals(string)) {
                                        c16562.m39227();
                                    }
                                } else if ("font-style".equals(strM55286)) {
                                    if ("italic".equals(string)) {
                                        c16562.m39225();
                                    }
                                } else if ("font-size".equals(strM55286)) {
                                    matcher = f80160.matcher(C7914.m21453(string));
                                    if (!matcher.matches()) {
                                        C1896.m6517("Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        switch (strGroup) {
                                            case 37:
                                                if (strGroup.equals("%")) {
                                                    b = -1;
                                                } else {
                                                    b = 0;
                                                }
                                                /*  JADX ERROR: Method code generation error
                                                    java.lang.NullPointerException: Switch insn not found in header
                                                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                    */
                                                /*
                                                    Method dump skipped, instruction units count: 788
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: l.C24768.m55289(l.᩶ۨۙ):java.util.ArrayList");
                                            }

                                            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
                                            public static void m55288(C21287 c21287) {
                                                while (true) {
                                                    for (boolean z = true; c21287.m48486() > 0 && z; z = false) {
                                                        char c = (char) c21287.m48497()[c21287.m48516()];
                                                        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                                            c21287.m48503(1);
                                                        } else {
                                                            int iM48516 = c21287.m48516();
                                                            int iM48509 = c21287.m48509();
                                                            byte[] bArrM48497 = c21287.m48497();
                                                            int i = iM48516 + 2;
                                                            if (i <= iM48509) {
                                                                int i2 = iM48516 + 1;
                                                                if (bArrM48497[iM48516] == 47 && bArrM48497[i2] == 42) {
                                                                    while (true) {
                                                                        int i3 = i + 1;
                                                                        if (i3 >= iM48509) {
                                                                            break;
                                                                        }
                                                                        if (((char) bArrM48497[i]) == '*' && ((char) bArrM48497[i3]) == '/') {
                                                                            i += 2;
                                                                            iM48509 = i;
                                                                        } else {
                                                                            i = i3;
                                                                        }
                                                                    }
                                                                    c21287.m48503(iM48509 - c21287.m48516());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }

                                            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
                                            public static String m55287(C21287 c21287, StringBuilder sb) {
                                                m55288(c21287);
                                                if (c21287.m48486() == 0) {
                                                    return null;
                                                }
                                                String strM55286 = m55286(c21287, sb);
                                                if (!strM55286.isEmpty()) {
                                                    return strM55286;
                                                }
                                                return "" + ((char) c21287.m48493());
                                            }

                                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                            public static String m55286(C21287 c21287, StringBuilder sb) {
                                                boolean z = false;
                                                sb.setLength(0);
                                                int iM48516 = c21287.m48516();
                                                int iM48509 = c21287.m48509();
                                                while (iM48516 < iM48509 && !z) {
                                                    char c = (char) c21287.m48497()[iM48516];
                                                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                                                        z = true;
                                                    } else {
                                                        iM48516++;
                                                        sb.append(c);
                                                    }
                                                }
                                                c21287.m48503(iM48516 - c21287.m48516());
                                                return sb.toString();
                                            }
                                        }
