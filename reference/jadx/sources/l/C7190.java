package l;

import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۜܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7190 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23737;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f23738;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23740;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23741;

    public C7190(AbstractC23599 abstractC23599, String str) {
        int iMo13418 = abstractC23599.mo13418();
        this.f23738 = str;
        this.f23737 = 1;
        this.f23739 = iMo13418;
        this.f23740 = iMo13418;
        this.f23741 = iMo13418;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19764(AbstractC23599 abstractC23599) {
        int iMo13418 = abstractC23599.mo13418();
        this.f23737++;
        this.f23739 += iMo13418;
        if (iMo13418 > this.f23740) {
            this.f23740 = iMo13418;
        }
        if (iMo13418 < this.f23741) {
            this.f23741 = iMo13418;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19763(C15000 c15000) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(EnumC7687.f25319);
        sb2.append(this.f23738);
        sb2.append(": ");
        sb2.append(this.f23737);
        sb2.append(" item");
        sb2.append(this.f23737 == 1 ? "" : am.aB);
        sb2.append("; ");
        sb2.append(this.f23739);
        sb2.append(" bytes total\n");
        sb.append(sb2.toString());
        if (this.f23741 == this.f23740) {
            sb.append(ASN1Dump.TAB + this.f23741 + " bytes/item\n");
        } else {
            sb.append(ASN1Dump.TAB + this.f23741 + ".." + this.f23740 + " bytes/item; average " + (this.f23739 / this.f23737) + "\n");
        }
        c15000.m36113(sb.toString());
    }
}
