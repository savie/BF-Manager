package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15660 extends AbstractC17152 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f50893;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f50894;

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7637(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7639(C14168 c14168) {
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo7640() {
        return true;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7638(AbstractC17152 abstractC17152) {
        String str = this.f50894;
        if (!(abstractC17152 instanceof C15660)) {
            return false;
        }
        C15660 c15660 = (C15660) abstractC17152;
        String str2 = c15660.f50894;
        String str3 = c15660.f50893;
        String str4 = this.f50893;
        if (str4 != null || str3 == null) {
            return (str != null || str2 == null) && str4.equals(str3) && str.equals(str2);
        }
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final void mo7635(C10219 c10219) {
        String str = this.f50893 + " " + this.f50894;
        c10219.m26357(str.length(), str);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C17307 mo7633(boolean z) {
        HashMap map = new HashMap(2);
        map.put(am.w, this.f50893);
        map.put(am.x, this.f50894);
        return new C17307(C4681.unmodifiableMap(this.f48028), 0, 0, 0, z, C5132.m15524(map));
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C11340 mo7632(C14168 c14168) {
        C17307 c17307Mo7633 = mo7633(false);
        c17307Mo7633.m40642(c14168);
        return new C11340(c14168, c17307Mo7633.mo30939(), c17307Mo7633.getName(), c17307Mo7633);
    }

    @Override // l.AbstractC17152, l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo7634(StringBuilder sb) {
        super.mo7634(sb);
        sb.append(" cpu: '");
        sb.append(this.f50893);
        sb.append("' os: '");
        sb.append(this.f50894);
        sb.append('\'');
    }
}
