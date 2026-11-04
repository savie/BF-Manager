package l;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9093 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C20149 f29534;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29535;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f29536;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f29537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10210 f29538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0407 f29539;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final BitSet f29540;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19161 f29541;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f29542;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29544;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0407 f29545;

    public C9093(C0407 c0407, C0407 c0408, int i, int i2, int i3, int i4, C19161 c19161, boolean z, BitSet bitSet, Map map, C10210 c10210) {
        this.f29545 = c0407;
        this.f29539 = c0408;
        this.f29543 = i;
        this.f29535 = i2;
        this.f29544 = i3;
        this.f29542 = i4;
        this.f29541 = c19161;
        this.f29537 = z;
        this.f29540 = bitSet == null ? null : (BitSet) bitSet.clone();
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C17359.requireNonNull(key);
            Object value = entry.getValue();
            C17359.requireNonNull(value);
            map2.put(key, value);
        }
        this.f29536 = C4681.unmodifiableMap(map2);
        this.f29538 = c10210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20149 m24235() {
        C20149 c20149M33056;
        C20149 c20149 = this.f29534;
        if (c20149 != null) {
            return c20149;
        }
        synchronized (this) {
            c20149M33056 = this.f29534;
            if (c20149M33056 == null) {
                this.f29538.getClass();
                c20149M33056 = C13414.m33056(this);
                this.f29534 = c20149M33056;
            }
        }
        return c20149M33056;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24236(int i) {
        BitSet bitSet = this.f29540;
        return bitSet != null && bitSet.get(i);
    }
}
