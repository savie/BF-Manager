package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2781 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15283 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f49809;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f49810;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17358 f49811;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17684 f49812;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f49813;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6443 f49814;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17358 m36595() {
        if (this.f49811 == null) {
            this.f49811 = new C17358();
        }
        return this.f49811;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6443 m36598() {
        if (this.f49814 == null) {
            this.f49814 = new C6443();
        }
        return this.f49814;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17684 m36596(String str, String str2, C19078 c19078) {
        if (this.f49812 != null && str.equals(this.f49809) && str2.equals(this.f49813)) {
            return this.f49812;
        }
        this.f49812 = null;
        this.f49809 = null;
        this.f49813 = null;
        C14578 c14578 = (C14578) c19078.f61652;
        C21956 c21956 = (C21956) c19078.f61653;
        c14578.getClass();
        C17684 c17684M48786 = c21956.m48786(str2);
        this.f49812 = c17684M48786;
        this.f49809 = str;
        this.f49813 = str2;
        return c17684M48786;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m36594(String str) {
        HashMap map = this.f49810;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36597(Object obj, String str) {
        if (this.f49810 == null) {
            this.f49810 = new HashMap();
        }
        this.f49810.put(str, obj);
    }
}
