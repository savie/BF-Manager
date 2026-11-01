package l;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3818 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14157 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14156 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f14159 = new StringBuilder();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f14160 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f14158 = new C2460();

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        InterfaceC1008 interfaceC1009;
        String str;
        C3818 c3818 = this;
        InterfaceC1008 interfaceC10010 = interfaceC1008;
        long j = c4128.f15127;
        C2460 c2460 = c3818.f14158;
        c2460.m7508(i + i2, bArr);
        c2460.m7510(i);
        Charset charsetM7511 = c2460.m7511();
        if (charsetM7511 == null) {
            charsetM7511 = StandardCharsets.UTF_8;
        }
        ArrayList arrayList = (j == -9223372036854775807L || !c4128.f15126) ? null : new ArrayList();
        while (true) {
            String strM7523 = c2460.m7523(charsetM7511);
            if (strM7523 == null) {
                break;
            }
            if (strM7523.isEmpty()) {
                interfaceC1009 = interfaceC10010;
            } else {
                try {
                    Integer.parseInt(strM7523);
                    String strM7524 = c2460.m7523(charsetM7511);
                    if (strM7524 == null) {
                        C0303.m1848("Unexpected end");
                        break;
                    }
                    Matcher matcher = f14157.matcher(strM7524);
                    if (matcher.matches()) {
                        long jM11106 = m11106(matcher, 1);
                        long jM11107 = m11106(matcher, 6);
                        StringBuilder sb = c3818.f14159;
                        sb.setLength(0);
                        ArrayList arrayList2 = c3818.f14160;
                        arrayList2.clear();
                        for (String strM7525 = c2460.m7523(charsetM7511); !TextUtils.isEmpty(strM7525); strM7525 = c2460.m7523(charsetM7511)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM7525.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f14156.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                Matcher matcher3 = matcher2;
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                                matcher2 = matcher3;
                                jM11106 = jM11106;
                            }
                            sb.append(sb2.toString());
                        }
                        long j2 = jM11106;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j == -9223372036854775807L || jM11107 >= j) {
                            C17513 c17513 = new C17513(j2, jM11107 - j2, AbstractC22433.of((Object) m11107(spannedFromHtml, str)));
                            interfaceC1009 = interfaceC1008;
                            interfaceC1009.accept(c17513);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C17513(j2, jM11107 - j2, AbstractC22433.of((Object) m11107(spannedFromHtml, str))));
                            }
                            interfaceC1009 = interfaceC1008;
                        }
                    } else {
                        interfaceC1009 = interfaceC10010;
                        C0303.m1848("Skipping invalid timing: ".concat(strM7524));
                    }
                } catch (NumberFormatException unused) {
                    interfaceC1009 = interfaceC10010;
                    C0303.m1848("Skipping invalid index: ".concat(strM7523));
                }
            }
            interfaceC10010 = interfaceC1009;
            c3818 = this;
        }
        InterfaceC1008 interfaceC10011 = interfaceC10010;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC10011.accept((C17513) it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0612 m11107(Spanned spanned, String str) {
        float f;
        C20369 c20369 = new C20369();
        c20369.m46002(spanned);
        if (str == null) {
            return c20369.m45996();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c20369.m46011(0);
                } else {
                    c20369.m46011(1);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c20369.m46011(1);
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c20369.m46011(2);
                } else {
                    c20369.m46011(1);
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c20369.m46011(0);
                } else {
                    c20369.m46011(1);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c20369.m46011(1);
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c20369.m46011(2);
                } else {
                    c20369.m46011(1);
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c20369.m46011(0);
                } else {
                    c20369.m46011(1);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c20369.m46011(1);
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c20369.m46011(2);
                } else {
                    c20369.m46011(1);
                }
                break;
            default:
                c20369.m46011(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c20369.m45999(2);
                } else {
                    c20369.m45999(1);
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c20369.m45999(2);
                } else {
                    c20369.m45999(1);
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c20369.m45999(2);
                } else {
                    c20369.m45999(1);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c20369.m45999(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c20369.m45999(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c20369.m45999(1);
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c20369.m45999(0);
                } else {
                    c20369.m45999(1);
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c20369.m45999(0);
                } else {
                    c20369.m45999(1);
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c20369.m45999(0);
                } else {
                    c20369.m45999(1);
                }
                break;
            default:
                c20369.m45999(1);
                break;
        }
        int iM45993 = c20369.m45993();
        float f2 = 0.08f;
        if (iM45993 == 0) {
            f = 0.08f;
        } else if (iM45993 == 1) {
            f = 0.5f;
        } else {
            if (iM45993 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        c20369.m46009(f);
        int iM46005 = c20369.m46005();
        if (iM46005 != 0) {
            if (iM46005 == 1) {
                f2 = 0.5f;
            } else {
                if (iM46005 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        c20369.m45998(f2, 0);
        return c20369.m45996();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m11106(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }
}
