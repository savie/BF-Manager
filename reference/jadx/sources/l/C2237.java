package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2237 extends AbstractC17152 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f7327;

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo7637(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo7639(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo7640() {
        return false;
    }

    public C2237(String str, EnumC6121 enumC6121, boolean z, int i, String str2) {
        super(str, EnumC24021.TYPE_PTR, enumC6121, z, i);
        this.f7327 = str2;
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7636(AbstractC14694 abstractC14694) {
        return super.mo7636(abstractC14694) && (abstractC14694 instanceof C2237) && mo7638((C2237) abstractC14694);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7635(C10219 c10219) {
        c10219.m26355(this.f7327);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo7638(AbstractC17152 abstractC17152) {
        if (!(abstractC17152 instanceof C2237)) {
            return false;
        }
        String str = ((C2237) abstractC17152).f7327;
        String str2 = this.f7327;
        if (str2 != null || str == null) {
            return str2.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m7631() {
        return this.f7327;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17307 mo7633(boolean z) {
        boolean zM35353 = m35353();
        String str = this.f7327;
        if (!zM35353) {
            EnumC20662 enumC20662 = EnumC20662.Domain;
            HashMap map = this.f48028;
            if (((String) map.get(enumC20662)).endsWith("in-addr.arpa") || ((String) map.get(enumC20662)).endsWith("ip6.arpa")) {
                return new C17307(C4681.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            if (m35356()) {
                return new C17307(C4681.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            HashMap mapM37743 = C15815.m37743(str);
            EnumC20662 enumC20663 = EnumC20662.Subtype;
            mapM37743.put(enumC20663, (String) C4681.unmodifiableMap(map).get(enumC20663));
            return new C17307(str, mapM37743, z);
        }
        return new C17307(C15815.m37743(str), 0, 0, 0, z, null);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11340 mo7632(C14168 c14168) {
        C17307 c17307Mo7633 = mo7633(false);
        c17307Mo7633.m40642(c14168);
        String strMo30939 = c17307Mo7633.mo30939();
        return new C11340(c14168, strMo30939, C14168.m34401(strMo30939, this.f7327), c17307Mo7633);
    }

    @Override // l.AbstractC17152, l.AbstractC14694
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7634(StringBuilder sb) {
        super.mo7634(sb);
        sb.append(" alias: '");
        String str = this.f7327;
        sb.append(str != null ? str.toString() : "null");
        sb.append('\'');
    }
}
