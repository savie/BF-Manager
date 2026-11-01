package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7884 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f25918;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f25919;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashSet f25920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f25922;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f25923;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C7178 f25924;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f25925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f25926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f25927;

    public C7884() {
        this.f25920 = new HashSet();
        this.f25926 = new HashMap();
        this.f25918 = new HashMap();
        this.f25923 = new HashSet();
        this.f25925 = new HashMap();
        this.f25919 = EnumC23839.f77061.m52558();
    }

    public C7884(String str, int i, int i2, String str2) {
        this.f25920 = new HashSet();
        this.f25926 = new HashMap();
        this.f25918 = new HashMap();
        this.f25923 = new HashSet();
        this.f25925 = new HashMap();
        EnumC23839.f77061.m52558();
        this.f25921 = i;
        this.f25919 = i2;
        this.f25922 = str;
        this.f25927 = str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20804(int i) {
        this.f25919 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20794(int i) {
        this.f25921 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20798(String str) {
        this.f25922 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20802(C19173 c19173) {
        this.f25920.add(c19173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20800(C8590 c8590, Set set) {
        m20792(this.f25926, c8590, set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20795(int i, int i2, String str) {
        m20792(this.f25926, new C8590(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20796(int i, int i2, String str, HashSet hashSet) {
        m20792(this.f25926, new C8590(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20803(C20584 c20584, Set set) {
        m20792(this.f25918, c20584, set);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20805(int i, int i2, String str) {
        m20792(this.f25918, new C20584(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20806(int i, int i2, String str, HashSet hashSet) {
        m20792(this.f25918, new C20584(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20801(C15646 c15646, Set set) {
        m20792(this.f25925, c15646, set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20797(int i, String str, HashSet hashSet) {
        m20792(this.f25925, new C15646(i, str), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20799(C0122 c0122) {
        this.f25923.add(c0122);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12118 m20793() {
        int i = this.f25921;
        String str = this.f25922;
        int i2 = this.f25919;
        EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
        this.f25924 = new C7178(i, str, i2, EnumC0554.MODULE, this.f25927);
        return new C12118(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20792(HashMap map, C19879 c19879, Set set) {
        C13638.requireNonNull(set);
        if (!map.containsKey(c19879)) {
            map.put(c19879, new HashSet());
        }
        ((Set) map.get(c19879)).addAll(set);
    }
}
