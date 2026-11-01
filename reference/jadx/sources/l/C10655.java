package l;

import java.io.StringWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۧ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10655 implements InterfaceC23355 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public StringWriter f36339 = new StringWriter();

    @Override // l.InterfaceC23355
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26841(String str, String str2) {
        m26840(C1679.m5594(str.replace('/', '.'), " -> ", str2.replace('/', '.')));
        this.f36339.write("\n");
    }

    @Override // l.InterfaceC23355
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo26843(String str, String str2, String str3) {
        m26840(ASN1Dump.TAB + C1791.m5874(str));
        m26840(C7997.m21055(" ", str2, " -> ", str3));
        this.f36339.write(10);
    }

    @Override // l.InterfaceC23355
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26842(String str, String str2, String str3) {
        m26840(ASN1Dump.TAB + C1791.m5874(str.substring(str.indexOf(41) + 1)));
        m26840(C0252.m1693(" ", str2));
        StringWriter stringWriter = this.f36339;
        stringWriter.write(40);
        m26840(C1791.m5864(str));
        stringWriter.write(41);
        m26840(" -> " + str3);
        stringWriter.write(10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26840(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            StringWriter stringWriter = this.f36339;
            if (cCharAt == '\t') {
                stringWriter.write("\\t");
            } else if (cCharAt == '\n') {
                stringWriter.write("\\n");
            } else if (cCharAt == '\r') {
                stringWriter.write("\\r");
            } else if (cCharAt == '\\') {
                stringWriter.write("\\\\");
            } else {
                stringWriter.write(cCharAt);
            }
        }
    }

    public final String toString() {
        return this.f36339.toString();
    }
}
