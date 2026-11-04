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

/* JADX INFO: renamed from: l.ۡ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9694 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f31298 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f31299 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f31301 = new StringBuilder();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f31302 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f31300 = new C21287();

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        InterfaceC8103 interfaceC8104;
        String str;
        C9694 c9694 = this;
        InterfaceC8103 interfaceC8105 = interfaceC8103;
        long j = c9474.f30699;
        C21287 c21287 = c9694.f31300;
        c21287.m48491(i + i2, bArr);
        c21287.m48510(i);
        Charset charsetM48495 = c21287.m48495();
        if (charsetM48495 == null) {
            charsetM48495 = StandardCharsets.UTF_8;
        }
        ArrayList arrayList = (j == -9223372036854775807L || !c9474.f30698) ? null : new ArrayList();
        while (true) {
            String strM48515 = c21287.m48515(charsetM48495);
            if (strM48515 == null) {
                break;
            }
            if (strM48515.isEmpty()) {
                interfaceC8104 = interfaceC8105;
            } else {
                try {
                    Integer.parseInt(strM48515);
                    String strM48516 = c21287.m48515(charsetM48495);
                    if (strM48516 == null) {
                        C1896.m6517("Unexpected end");
                        break;
                    }
                    Matcher matcher = f31298.matcher(strM48516);
                    if (matcher.matches()) {
                        long jM25287 = m25287(matcher, 1);
                        long jM25288 = m25287(matcher, 6);
                        StringBuilder sb = c9694.f31301;
                        sb.setLength(0);
                        ArrayList arrayList2 = c9694.f31302;
                        arrayList2.clear();
                        for (String strM48517 = c21287.m48515(charsetM48495); !TextUtils.isEmpty(strM48517); strM48517 = c21287.m48515(charsetM48495)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM48517.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f31299.matcher(strTrim);
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
                                jM25287 = jM25287;
                            }
                            sb.append(sb2.toString());
                        }
                        long j2 = jM25287;
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
                        if (j == -9223372036854775807L || jM25288 >= j) {
                            C16187 c16187 = new C16187(j2, jM25288 - j2, AbstractC1928.of((Object) m25288(spannedFromHtml, str)));
                            interfaceC8104 = interfaceC8103;
                            interfaceC8104.accept(c16187);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C16187(j2, jM25288 - j2, AbstractC1928.of((Object) m25288(spannedFromHtml, str))));
                            }
                            interfaceC8104 = interfaceC8103;
                        }
                    } else {
                        interfaceC8104 = interfaceC8105;
                        C1896.m6517("Skipping invalid timing: ".concat(strM48516));
                    }
                } catch (NumberFormatException unused) {
                    interfaceC8104 = interfaceC8105;
                    C1896.m6517("Skipping invalid index: ".concat(strM48515));
                }
            }
            interfaceC8105 = interfaceC8104;
            c9694 = this;
        }
        InterfaceC8103 interfaceC8106 = interfaceC8105;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC8106.accept((C16187) it.next());
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
    public static C2137 m25288(Spanned spanned, String str) {
        float f;
        C5866 c5866 = new C5866();
        c5866.m17079(spanned);
        if (str == null) {
            return c5866.m17073();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c5866.m17088(0);
                } else {
                    c5866.m17088(1);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c5866.m17088(1);
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c5866.m17088(2);
                } else {
                    c5866.m17088(1);
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c5866.m17088(0);
                } else {
                    c5866.m17088(1);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c5866.m17088(1);
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c5866.m17088(2);
                } else {
                    c5866.m17088(1);
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c5866.m17088(0);
                } else {
                    c5866.m17088(1);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c5866.m17088(1);
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c5866.m17088(2);
                } else {
                    c5866.m17088(1);
                }
                break;
            default:
                c5866.m17088(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c5866.m17076(2);
                } else {
                    c5866.m17076(1);
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c5866.m17076(2);
                } else {
                    c5866.m17076(1);
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c5866.m17076(2);
                } else {
                    c5866.m17076(1);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c5866.m17076(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c5866.m17076(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c5866.m17076(1);
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c5866.m17076(0);
                } else {
                    c5866.m17076(1);
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c5866.m17076(0);
                } else {
                    c5866.m17076(1);
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c5866.m17076(0);
                } else {
                    c5866.m17076(1);
                }
                break;
            default:
                c5866.m17076(1);
                break;
        }
        int iM17090 = c5866.m17090();
        float f2 = 0.08f;
        if (iM17090 == 0) {
            f = 0.08f;
        } else if (iM17090 == 1) {
            f = 0.5f;
        } else {
            if (iM17090 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        c5866.m17086(f);
        int iM17080 = c5866.m17080();
        if (iM17080 != 0) {
            if (iM17080 == 1) {
                f2 = 0.5f;
            } else {
                if (iM17080 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        c5866.m17075(f2, 0);
        return c5866.m17073();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m25287(Matcher matcher, int i) {
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
