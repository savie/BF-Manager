package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶ᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15497 {
    DIAGS("diags"),
    DEBUG("debug"),
    SHOULDSTOP("should-stop");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f50497;

    EnumC15497(String str) {
        this.f50497 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37094(AbstractC10558 abstractC10558, String str, String str2) {
        for (String str3 : str2.split(l.b)) {
            String str4 = this.f50497 + "." + str3.trim();
            EnumC19730.f63355.mo2368(abstractC10558, str4, str4);
        }
    }
}
