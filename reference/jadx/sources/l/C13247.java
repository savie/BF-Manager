package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۬ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1U0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13247 implements InterfaceC21733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2662 f44004;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6896 f44005;

    public C13247(C2662 c2662, C15157 c15157, C6896 c6896) {
        this.f44004 = c2662;
        this.f44005 = c6896;
    }

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5128(C12417 c12417, C17355 c17355) {
        m32720(c12417, c17355, true);
    }

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5127(C12417 c12417, C11006 c11006) {
        if (C1791.m5871(c11006.m39114())) {
            return;
        }
        m32720(c12417, c11006, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32720(C12417 c12417, AbstractC6066 abstractC6066, boolean z) {
        String strSubstring;
        String string;
        String strM39114 = abstractC6066.m39114();
        C2662 c2662 = this.f44004;
        AbstractC11836 abstractC11836 = C13953.f45909;
        Map map = (Map) c2662.get(abstractC11836);
        if (map == null) {
            map = new HashMap();
            c2662.put(abstractC11836, map);
        }
        String strM18509 = C6896.m18509(abstractC6066);
        String str = (String) map.get(strM18509);
        if (str == null || strM39114.equals(str)) {
            return;
        }
        if (C15364.m36802(abstractC6066) instanceof C4073) {
            AbstractC11836 abstractC11836M39118 = abstractC6066.m39118();
            StringBuilder sb = new StringBuilder("Warning: ");
            sb.append(c12417.m2211().replace('/', '.'));
            if (z) {
                StringBuilder sb2 = new StringBuilder(": field '");
                sb2.append("" + C1791.m5874(abstractC11836M39118.mo13250()) + ' ' + strM39114);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(": method '");
                String strM2211 = c12417.m2211();
                String strMo13250 = abstractC11836M39118.mo13250();
                StringBuilder sb4 = new StringBuilder("");
                if (strM39114.equals("<init>")) {
                    String strReplace = strM2211.replace('/', '.');
                    strSubstring = strReplace.substring(strReplace.lastIndexOf(46) + 1);
                } else {
                    strSubstring = C1791.m5874(strMo13250.substring(strMo13250.indexOf(41) + 1)) + ' ' + strM39114;
                }
                sb4.append(strSubstring);
                sb4.append('(');
                sb4.append(C1791.m5864(strMo13250));
                sb4.append(')');
                sb3.append(sb4.toString());
                string = sb3.toString();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, string, "' can't be mapped to '", strM18509, "' because it would conflict with ");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, z ? "field '" : "method '", str, "', which is already being mapped to '", strM18509);
            sb.append("'");
        }
        C15364.m36802(abstractC6066).mo2194(null);
        abstractC6066.mo27763(c12417, this.f44005);
    }
}
