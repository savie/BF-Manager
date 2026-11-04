package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3958 {
    DIAGS("diags"),
    DEBUG("debug"),
    SHOULDSTOP("should-stop");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f13505;

    EnumC3958(String str) {
        this.f13505 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m12698(AbstractC9923 abstractC9923, String str, String str2) {
        for (String str3 : str2.split(l.b)) {
            String str4 = this.f13505 + "." + str3.trim();
            EnumC7687.f25302.mo4242(abstractC9923, str4, str4);
        }
    }
}
