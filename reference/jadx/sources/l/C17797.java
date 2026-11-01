package l;

import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9SS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17797 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21325 f56413;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f56414;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f56415;

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
    }

    public C17797(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        C20190.m45650(c17367, 20229);
        c17367.readInt();
        this.f56415 = c17367.m40448();
        this.f56413 = new C21325(c17367);
        this.f56414 = C16387.m38583(c17367.m40448());
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20229);
        c11018.m27799();
        c11018.m27783(this.f56415);
        this.f56413.m47831(c11018);
        c11018.m27783(C16387.m38584(this.f56414));
        c11018.m27777();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41378() {
        return this.f56415;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41376(String str) {
        this.f56415 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41377(C21325 c21325) {
        this.f56413 = c21325;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21325 m41375() {
        return this.f56413;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41380(String str) {
        this.f56414 = C16387.m38583(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41379() {
        int i = this.f56414;
        return i == 0 ? C16387.f52727 : i;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C17797 c17797 = new C17797(abstractC6839);
        c17797.f23038 = this.f23038;
        c17797.f56415 = this.f56415;
        c17797.f56413 = this.f56413;
        c17797.f56414 = this.f56414;
        return c17797;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        String strM18455 = C6851.m18455(i, "\t");
        sb.append(strM18455);
        sb.append("{\n");
        sb.append(strM18455);
        sb.append("\t");
        sb.append("numFormat: \"");
        sb.append(this.f56413.m47833());
        sb.append("\"\n");
        String strM47828 = this.f56413.m47828();
        if (!strM47828.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM18455, "\t", "iSuffixes: \"", strM47828);
            sb.append("\"\n");
        }
        String strM47834 = this.f56413.m47834();
        if (!strM47834.isEmpty()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM18455, "\t", "fSuffixes: \"", strM47834);
            sb.append("\"\n");
        }
        String strM38584 = C16387.m38584(this.f56414);
        if (strM38584 != null) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM18455, "\t", "style: \"", strM38584);
            sb.append("\"\n");
        }
        sb.append(strM18455);
        sb.append("}\n");
    }
}
