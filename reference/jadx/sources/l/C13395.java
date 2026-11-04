package l;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: l.۫᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f42686;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f42687;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42688;

    public C13395(String str, String str2) {
        this.f42688 = str;
        this.f42686 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spanned m33023() {
        boolean z = this.f42687;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f42688);
        sb.append("</font> > ");
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f42686);
        sb.append("</font>");
        return Html.fromHtml(sb.toString());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m33028() {
        return this.f42687;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m33026() {
        return this.f42688;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33027() {
        return this.f42686;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33024(String str) {
        String str2 = this.f42688;
        String str3 = this.f42686;
        if (str2.equals(str3)) {
            return true;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, str2);
        AbstractC22044 abstractC22044M35194 = C14584.m35193(str, str3);
        String strMo4294 = abstractC22044M35193.mo4294();
        EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044M35193.mo4281());
        if (C14584.m35188(abstractC22044M35193, abstractC22044M35194) != null) {
            return false;
        }
        enumC22346M50415.m50417(strMo4294);
        C20108.m46233(abstractC22044M35194.mo4294(), true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33025(AbstractC18881 abstractC18881, String str) {
        String str2 = this.f42688;
        String str3 = this.f42686;
        if (str2.equals(str3)) {
            return true;
        }
        String strM28549 = C11293.m28549(str, str2);
        String strM285410 = C11293.m28549(str, str3);
        if (abstractC18881.mo20839() && str3.equalsIgnoreCase(str2)) {
            String strM285411 = C11293.m28549(str, System.currentTimeMillis() + ".tmp");
            return abstractC18881.mo43670(strM28549, strM285411) && abstractC18881.mo43670(strM285411, strM285410);
        }
        return abstractC18881.mo43670(strM28549, strM285410);
    }
}
