package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19162 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f61890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f61891;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16277 f61892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16277 f61893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC17750 f61894;

    public C19162(C16277 c16277, C16277 c16278) {
        this.f61893 = c16277;
        this.f61892 = c16278;
        this.f61891 = m43971() ? new C21445() : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43970(C16277 c16277, C19162 c19162) {
        C9735.putIfAbsent(this.f61891, c16277, c19162);
        if (this.f61891.size() == 20) {
            this.f61891 = new HashMap(this.f61891);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43971() {
        C16277 c16277 = this.f61892;
        int length = c16277.length();
        return length == 0 || c16277.charAt(length - 1) == '/';
    }
}
