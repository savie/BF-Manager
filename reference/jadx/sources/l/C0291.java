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

/* JADX INFO: renamed from: l.֡۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0291 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f1606 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f1607 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f1609 = new C2460();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f1608 = new StringBuilder();

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
    public final ArrayList m1819(C2460 c2460) {
        String strSubstring;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        StringBuilder sb = this.f1608;
        int i = 0;
        sb.setLength(0);
        int iM7500 = c2460.m7500();
        while (!TextUtils.isEmpty(c2460.m7523(StandardCharsets.UTF_8))) {
        }
        byte[] bArrM7518 = c2460.m7518();
        int iM7501 = c2460.m7500();
        C2460 c2461 = this.f1609;
        c2461.m7508(iM7501, bArrM7518);
        c2461.m7510(iM7500);
        ArrayList arrayList = new ArrayList();
        while (true) {
            m1818(c2461);
            if (c2461.m7503() >= 5 && "::cue".equals(c2461.m7505(5, StandardCharsets.UTF_8))) {
                int iM7502 = c2461.m7500();
                String strM1817 = m1817(c2461, sb);
                if (strM1817 == null) {
                    strSubstring = null;
                } else if ("{".equals(strM1817)) {
                    c2461.m7510(iM7502);
                    strSubstring = "";
                } else {
                    if (MotionUtils.EASING_TYPE_FORMAT_START.equals(strM1817)) {
                        int iM7503 = c2461.m7500();
                        int iM7509 = c2461.m7509();
                        boolean z2 = false;
                        while (iM7503 < iM7509 && !z2) {
                            int i2 = iM7503 + 1;
                            z2 = ((char) c2461.m7518()[iM7503]) == ')';
                            iM7503 = i2;
                        }
                        strSubstring = c2461.m7505((iM7503 - 1) - c2461.m7500(), StandardCharsets.UTF_8).trim();
                    } else {
                        strSubstring = null;
                    }
                    if (!MotionUtils.EASING_TYPE_FORMAT_END.equals(m1817(c2461, sb))) {
                        strSubstring = null;
                    }
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring != null && "{".equals(m1817(c2461, sb))) {
                C16520 c16520 = new C16520();
                if (!strSubstring.isEmpty()) {
                    int iIndexOf = strSubstring.indexOf(91);
                    if (iIndexOf != -1) {
                        Matcher matcher2 = f1606.matcher(strSubstring.substring(iIndexOf));
                        if (matcher2.matches()) {
                            String strGroup2 = matcher2.group(1);
                            strGroup2.getClass();
                            c16520.m38860(strGroup2);
                        }
                        strSubstring = strSubstring.substring(i, iIndexOf);
                    }
                    String str = C17983.f57504;
                    String[] strArrSplit = strSubstring.split("\\.", -1);
                    String str2 = strArrSplit[i];
                    int iIndexOf2 = str2.indexOf(35);
                    if (iIndexOf2 != -1) {
                        c16520.m38873(str2.substring(i, iIndexOf2));
                        c16520.m38876(str2.substring(iIndexOf2 + 1));
                    } else {
                        c16520.m38873(str2);
                    }
                    if (strArrSplit.length > 1) {
                        int length = strArrSplit.length;
                        C2023.m6507(length <= strArrSplit.length);
                        c16520.m38868((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                    }
                }
                boolean z3 = false;
                String strM1818 = null;
                while (!z3) {
                    int iM7504 = c2461.m7500();
                    strM1818 = m1817(c2461, sb);
                    boolean z4 = strM1818 == null || l.d.equals(strM1818);
                    if (!z4) {
                        c2461.m7510(iM7504);
                        m1818(c2461);
                        String strM1816 = m1816(c2461, sb);
                        if (!strM1816.isEmpty() && ":".equals(m1817(c2461, sb))) {
                            m1818(c2461);
                            StringBuilder sb2 = new StringBuilder();
                            boolean z5 = false;
                            while (true) {
                                if (!z5) {
                                    int iM7505 = c2461.m7500();
                                    String strM1819 = m1817(c2461, sb);
                                    if (strM1819 == null) {
                                        string = null;
                                    } else if (l.d.equals(strM1819) || l.b.equals(strM1819)) {
                                        c2461.m7510(iM7505);
                                        z5 = true;
                                    } else {
                                        sb2.append(strM1819);
                                    }
                                } else {
                                    string = sb2.toString();
                                }
                            }
                            if (string != null && !string.isEmpty()) {
                                int iM7506 = c2461.m7500();
                                String strM18110 = m1817(c2461, sb);
                                if (!l.b.equals(strM18110)) {
                                    if (l.d.equals(strM18110)) {
                                        c2461.m7510(iM7506);
                                        if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM1816)) {
                                            c16520.m38875(C5242.m14435(string));
                                        } else if ("background-color".equals(strM1816)) {
                                            c16520.m38865(C5242.m14435(string));
                                        } else if ("ruby-position".equals(strM1816)) {
                                            if ("over".equals(string)) {
                                                c16520.m38859(1);
                                            } else if ("under".equals(string)) {
                                                c16520.m38859(2);
                                            }
                                        } else if ("text-combine-upright".equals(strM1816)) {
                                            if (!ProviderConfigurationPermission.ALL_STR.equals(string) || string.startsWith("digits")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            c16520.m38867(z);
                                        } else if ("text-decoration".equals(strM1816)) {
                                            if ("underline".equals(string)) {
                                                c16520.m38880();
                                            }
                                        } else if ("font-family".equals(strM1816)) {
                                            c16520.m38866(string);
                                        } else if ("font-weight".equals(strM1816)) {
                                            if ("bold".equals(string)) {
                                                c16520.m38881();
                                            }
                                        } else if ("font-style".equals(strM1816)) {
                                            if ("italic".equals(string)) {
                                                c16520.m38879();
                                            }
                                        } else if ("font-size".equals(strM1816)) {
                                            matcher = f1607.matcher(C20733.m46672(string));
                                            if (!matcher.matches()) {
                                                C0303.m1848("Invalid font-size: '" + string + "'.");
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
                                } else if (ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR.equals(strM1816)) {
                                    c16520.m38875(C5242.m14435(string));
                                } else if ("background-color".equals(strM1816)) {
                                    c16520.m38865(C5242.m14435(string));
                                } else if ("ruby-position".equals(strM1816)) {
                                    if ("over".equals(string)) {
                                        c16520.m38859(1);
                                    } else if ("under".equals(string)) {
                                        c16520.m38859(2);
                                    }
                                } else if ("text-combine-upright".equals(strM1816)) {
                                    if (ProviderConfigurationPermission.ALL_STR.equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    c16520.m38867(z);
                                } else if ("text-decoration".equals(strM1816)) {
                                    if ("underline".equals(string)) {
                                        c16520.m38880();
                                    }
                                } else if ("font-family".equals(strM1816)) {
                                    c16520.m38866(string);
                                } else if ("font-weight".equals(strM1816)) {
                                    if ("bold".equals(string)) {
                                        c16520.m38881();
                                    }
                                } else if ("font-style".equals(strM1816)) {
                                    if ("italic".equals(string)) {
                                        c16520.m38879();
                                    }
                                } else if ("font-size".equals(strM1816)) {
                                    matcher = f1607.matcher(C20733.m46672(string));
                                    if (!matcher.matches()) {
                                        C0303.m1848("Invalid font-size: '" + string + "'.");
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
                                                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
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
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    */
                                                /*
                                                    Method dump skipped, instruction units count: 788
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: l.C0291.m1819(l.ۖۤۙ):java.util.ArrayList");
                                            }

                                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                                            public static void m1818(C2460 c2460) {
                                                while (true) {
                                                    for (boolean z = true; c2460.m7503() > 0 && z; z = false) {
                                                        char c = (char) c2460.m7518()[c2460.m7500()];
                                                        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                                            c2460.m7535(1);
                                                        } else {
                                                            int iM7500 = c2460.m7500();
                                                            int iM7509 = c2460.m7509();
                                                            byte[] bArrM7518 = c2460.m7518();
                                                            int i = iM7500 + 2;
                                                            if (i <= iM7509) {
                                                                int i2 = iM7500 + 1;
                                                                if (bArrM7518[iM7500] == 47 && bArrM7518[i2] == 42) {
                                                                    while (true) {
                                                                        int i3 = i + 1;
                                                                        if (i3 >= iM7509) {
                                                                            break;
                                                                        }
                                                                        if (((char) bArrM7518[i]) == '*' && ((char) bArrM7518[i3]) == '/') {
                                                                            i += 2;
                                                                            iM7509 = i;
                                                                        } else {
                                                                            i = i3;
                                                                        }
                                                                    }
                                                                    c2460.m7535(iM7509 - c2460.m7500());
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }

                                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                                            public static String m1817(C2460 c2460, StringBuilder sb) {
                                                m1818(c2460);
                                                if (c2460.m7503() == 0) {
                                                    return null;
                                                }
                                                String strM1816 = m1816(c2460, sb);
                                                if (!strM1816.isEmpty()) {
                                                    return strM1816;
                                                }
                                                return "" + ((char) c2460.m7516());
                                            }

                                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                                            public static String m1816(C2460 c2460, StringBuilder sb) {
                                                boolean z = false;
                                                sb.setLength(0);
                                                int iM7500 = c2460.m7500();
                                                int iM7509 = c2460.m7509();
                                                while (iM7500 < iM7509 && !z) {
                                                    char c = (char) c2460.m7518()[iM7500];
                                                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                                                        z = true;
                                                    } else {
                                                        iM7500++;
                                                        sb.append(c);
                                                    }
                                                }
                                                c2460.m7535(iM7500 - c2460.m7500());
                                                return sb.toString();
                                            }
                                        }
