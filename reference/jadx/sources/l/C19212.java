package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19212 extends AbstractC19918 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f62038;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f62039;

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19183(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19184(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19185() {
        return true;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19182(AbstractC19918 abstractC19918) {
        String str = this.f62039;
        if (!(abstractC19918 instanceof C19212)) {
            return false;
        }
        C19212 c19212 = (C19212) abstractC19918;
        String str2 = c19212.f62039;
        String str3 = c19212.f62038;
        String str4 = this.f62038;
        if (str4 != null || str3 == null) {
            return (str != null || str2 == null) && str4.equals(str3) && str.equals(str2);
        }
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final void mo19179(C5100 c5100) {
        String str = this.f62038 + " " + this.f62039;
        c5100.m14212(str.length(), str);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C0244 mo19176(boolean z) {
        HashMap map = new HashMap(2);
        map.put(am.w, this.f62038);
        map.put(am.x, this.f62039);
        return new C0244(C0561.unmodifiableMap(this.f32353), 0, 0, 0, z, C15540.m37180(map));
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C20706 mo19177(C22823 c22823) {
        C0244 c0244Mo19176 = mo19176(false);
        c0244Mo19176.m1649(c22823);
        return new C20706(c22823, c0244Mo19176.mo1660(), c0244Mo19176.getName(), c0244Mo19176);
    }

    @Override // l.AbstractC19918, l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo19178(StringBuilder sb) {
        super.mo19178(sb);
        sb.append(" cpu: '");
        sb.append(this.f62038);
        sb.append("' os: '");
        sb.append(this.f62039);
        sb.append('\'');
    }
}
