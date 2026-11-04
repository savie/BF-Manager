package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2781 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4156 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f14111;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24975 f14112;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3938 f14113;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21105 f14114;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f14115;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f14116;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21105 m13310() {
        if (this.f14114 == null) {
            this.f14114 = new C21105();
        }
        return this.f14114;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3938 m13313() {
        if (this.f14113 == null) {
            this.f14113 = new C3938();
        }
        return this.f14113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24975 m13311(String str, String str2, C19600 c19600) {
        if (this.f14112 != null && str.equals(this.f14116) && str2.equals(this.f14115)) {
            return this.f14112;
        }
        this.f14112 = null;
        this.f14116 = null;
        this.f14115 = null;
        C12887 c12887 = (C12887) c19600.f63179;
        C14069 c14069 = (C14069) c19600.f63180;
        c12887.getClass();
        C24975 c24975M34232 = c14069.m34232(str2);
        this.f14112 = c24975M34232;
        this.f14116 = str;
        this.f14115 = str2;
        return c24975M34232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13309(String str) {
        HashMap map = this.f14111;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13312(Object obj, String str) {
        if (this.f14111 == null) {
            this.f14111 = new HashMap();
        }
        this.f14111.put(str, obj);
    }
}
