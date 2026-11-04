package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩺ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBC3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24345 implements InterfaceC6052, Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6140 f78956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18181 f78957;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f78957.compareTo(((C24345) obj).f78957);
    }

    public C24345(C18181 c18181, C6140 c6140) {
        this.f78957 = c18181;
        this.f78956 = c6140;
    }

    public final int hashCode() {
        return this.f78957.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24345)) {
            return false;
        }
        return this.f78957.equals(((C24345) obj).f78957);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54384(C10918 c10918) {
        C18377 c18377M27707 = c10918.m27707();
        C19123 c19123M27703 = c10918.m27703();
        c18377M27707.m42875(this.f78957);
        this.f78956 = (C6140) c19123M27703.m44247(this.f78956);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54385(C10918 c10918, C15000 c15000) {
        C18377 c18377M27707 = c10918.m27707();
        C18181 c18181 = this.f78957;
        int iM42872 = c18377M27707.m42872((AbstractC22657) c18181);
        int iM26285 = this.f78956.m26285();
        if (c15000.m36116()) {
            c15000.m36111(0, ASN1Dump.TAB + c18181.mo1843());
            c15000.m36111(4, "      method_idx:      ".concat(C5306.m15938(iM42872)));
            c15000.m36111(4, "      annotations_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM42872);
        c15000.m36124(iM26285);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f78957.mo1843() + ": " + this.f78956;
    }
}
