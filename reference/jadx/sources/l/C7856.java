package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f26168;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26169;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f26170;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9346 f26171;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f26172;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f26173;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f26174;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f26175;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f26176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26177;

    public C7856() {
        this.f26168 = new HashSet();
        this.f26176 = new HashMap();
        this.f26173 = new HashMap();
        this.f26172 = new HashSet();
        this.f26170 = new HashMap();
        this.f26177 = EnumC16856.f54363.m39816();
    }

    public C7856(String str, int i, int i2, String str2) {
        this.f26168 = new HashSet();
        this.f26176 = new HashMap();
        this.f26173 = new HashMap();
        this.f26172 = new HashSet();
        this.f26170 = new HashMap();
        EnumC16856.f54363.m39816();
        this.f26169 = i;
        this.f26177 = i2;
        this.f26175 = str;
        this.f26174 = str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21392(int i) {
        this.f26177 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21382(int i) {
        this.f26169 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21386(String str) {
        this.f26175 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21391(C19043 c19043) {
        this.f26168.add(c19043);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21389(C10092 c10092, Set set) {
        m21380(this.f26176, c10092, set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21383(int i, int i2, String str) {
        m21380(this.f26176, new C10092(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21384(int i, String str, int i2, HashSet hashSet) {
        m21380(this.f26176, new C10092(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21387(C2635 c2635, Set set) {
        m21380(this.f26173, c2635, set);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21393(int i, int i2, String str) {
        m21380(this.f26173, new C2635(i, str, i2), new HashSet());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21394(int i, String str, int i2, HashSet hashSet) {
        m21380(this.f26173, new C2635(i, str, i2), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21388(C8601 c8601, Set set) {
        m21380(this.f26170, c8601, set);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21385(int i, String str, HashSet hashSet) {
        m21380(this.f26170, new C8601(i, str), hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21390(C13821 c13821) {
        this.f26172.add(c13821);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22422 m21381() {
        int i = this.f26169;
        String str = this.f26175;
        int i2 = this.f26177;
        EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
        this.f26171 = new C9346(i, str, i2, EnumC19840.MODULE, this.f26174);
        return new C22422(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21380(HashMap map, C7110 c7110, Set set) {
        C17359.requireNonNull(set);
        if (!map.containsKey(c7110)) {
            map.put(c7110, new HashSet());
        }
        ((Set) map.get(c7110)).addAll(set);
    }
}
