package l;

import java.io.StringWriter;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ᩳ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19365 implements InterfaceC10414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public StringWriter f62556 = new StringWriter();

    @Override // l.InterfaceC10414
    /* JADX INFO: renamed from: ۙ */
    public final void mo26724(String str, String str2) {
        m44781(C20196.m46451(str.replace('/', '.'), " -> ", str2.replace('/', '.')));
        this.f62556.write("\n");
    }

    @Override // l.InterfaceC10414
    /* JADX INFO: renamed from: ᩷ */
    public final void mo26726(String str, String str2, String str3) {
        m44781(ASN1Dump.TAB + C13923.m33908(str));
        m44781(ExternalValue$$ExternalSyntheticOutline0.m(" ", str2, " -> ", str3));
        this.f62556.write(10);
    }

    @Override // l.InterfaceC10414
    /* JADX INFO: renamed from: ۙ */
    public final void mo26725(String str, String str2, String str3) {
        m44781(ASN1Dump.TAB + C13923.m33908(str.substring(str.indexOf(41) + 1)));
        m44781(C25272.m56409(" ", str2));
        StringWriter stringWriter = this.f62556;
        stringWriter.write(40);
        m44781(C13923.m33906(str));
        stringWriter.write(41);
        m44781(" -> " + str3);
        stringWriter.write(10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44781(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            StringWriter stringWriter = this.f62556;
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
        return this.f62556.toString();
    }
}
