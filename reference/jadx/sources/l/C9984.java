package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۢ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f32084;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f32085;

    public C9984(String str, String str2) {
        this.f32084 = C18969.m44060(50, str);
        this.f32085 = C18969.m44060(10000, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25828() {
        if (TextUtils.isEmpty(this.f32084)) {
            return C18969.m44060(50, this.f32085);
        }
        return this.f32084;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m25831() {
        return this.f32084;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25829(String str) {
        this.f32084 = TextUtils.isEmpty(str) ? null : C18969.m44060(50, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m25830() {
        return this.f32085;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25832(String str) {
        this.f32085 = str;
    }
}
