package l;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: l.۬ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43576;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f43577;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f43578;

    public C13080(String str, String str2) {
        this.f43578 = str;
        this.f43576 = str2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m32292() {
        return this.f43577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spanned m32293() {
        boolean z = this.f43577;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f43578);
        sb.append("</font> > ");
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f43576);
        sb.append("</font>");
        return Html.fromHtml(sb.toString());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m32296() {
        return this.f43578;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m32297() {
        return this.f43576;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32294(String str) {
        String str2 = this.f43578;
        String str3 = this.f43576;
        if (str2.equals(str3)) {
            return true;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, str2);
        AbstractC20745 abstractC20745M15314 = C5553.m15313(str, str3);
        String strMo33986 = abstractC20745M15313.mo33986();
        EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745M15313.mo33974());
        if (C5553.m15308(abstractC20745M15313, abstractC20745M15314) != null) {
            return false;
        }
        enumC11669M29115.m29117(strMo33986);
        C22252.m49408(abstractC20745M15314.mo33986(), true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32295(AbstractC12233 abstractC12233, String str) {
        String str2 = this.f43578;
        String str3 = this.f43576;
        if (str2.equals(str3)) {
            return true;
        }
        String strM18162 = C6730.m18162(str, str2);
        String strM18163 = C6730.m18162(str, str3);
        if (abstractC12233.mo24615() && str3.equalsIgnoreCase(str2)) {
            String strM18164 = C6730.m18162(str, System.currentTimeMillis() + ".tmp");
            return abstractC12233.mo30347(strM18162, strM18164) && abstractC12233.mo30347(strM18164, strM18163);
        }
        return abstractC12233.mo30347(strM18162, strM18163);
    }
}
