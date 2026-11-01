package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۗܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3326 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f12315;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f12316;

    public C3326(String str, String str2) {
        this.f12315 = C13012.m32189(50, str);
        this.f12316 = C13012.m32189(10000, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9858() {
        if (TextUtils.isEmpty(this.f12315)) {
            return C13012.m32189(50, this.f12316);
        }
        return this.f12315;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m9861() {
        return this.f12315;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9859(String str) {
        this.f12315 = TextUtils.isEmpty(str) ? null : C13012.m32189(50, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m9860() {
        return this.f12316;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9862(String str) {
        this.f12316 = str;
    }
}
