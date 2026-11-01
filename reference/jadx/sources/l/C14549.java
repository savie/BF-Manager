package l;

import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܳ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14549 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f47638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f47640;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f47641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47642;

    public C14549(AbstractC21603 abstractC21603, String str) {
        int iMo9739 = abstractC21603.mo9739();
        this.f47641 = str;
        this.f47639 = 1;
        this.f47640 = iMo9739;
        this.f47642 = iMo9739;
        this.f47638 = iMo9739;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35016(AbstractC21603 abstractC21603) {
        int iMo9739 = abstractC21603.mo9739();
        this.f47639++;
        this.f47640 += iMo9739;
        if (iMo9739 > this.f47642) {
            this.f47642 = iMo9739;
        }
        if (iMo9739 < this.f47638) {
            this.f47638 = iMo9739;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35015(C2718 c2718) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(EnumC19730.f63352);
        sb2.append(this.f47641);
        sb2.append(": ");
        sb2.append(this.f47639);
        sb2.append(" item");
        sb2.append(this.f47639 == 1 ? "" : am.aB);
        sb2.append("; ");
        sb2.append(this.f47640);
        sb2.append(" bytes total\n");
        sb.append(sb2.toString());
        if (this.f47638 == this.f47642) {
            sb.append(ASN1Dump.TAB + this.f47638 + " bytes/item\n");
        } else {
            sb.append(ASN1Dump.TAB + this.f47638 + ".." + this.f47642 + " bytes/item; average " + (this.f47640 / this.f47639) + "\n");
        }
        c2718.m8285(sb.toString());
    }
}
