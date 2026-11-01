package l;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4853 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23595 f17083;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f17084;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile C6618 f17085;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17086;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f17087;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7497 f17088;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f17089;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f17090;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f17091;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3399 f17092;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BitSet f17093;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23595 f17094;

    public C4853(C23595 c23595, C23595 c23596, int i, int i2, int i3, int i4, C3399 c3399, boolean z, BitSet bitSet, Map map, C7497 c7497) {
        this.f17094 = c23595;
        this.f17083 = c23596;
        this.f17091 = i;
        this.f17086 = i2;
        this.f17084 = i3;
        this.f17087 = i4;
        this.f17092 = c3399;
        this.f17089 = z;
        this.f17093 = bitSet == null ? null : (BitSet) bitSet.clone();
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C13638.requireNonNull(key);
            Object value = entry.getValue();
            C13638.requireNonNull(value);
            map2.put(key, value);
        }
        this.f17090 = C0561.unmodifiableMap(map2);
        this.f17088 = c7497;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6618 m13552() {
        C6618 c6618M48522;
        C6618 c6618 = this.f17085;
        if (c6618 != null) {
            return c6618;
        }
        synchronized (this) {
            c6618M48522 = this.f17085;
            if (c6618M48522 == null) {
                this.f17088.getClass();
                c6618M48522 = C21766.m48522(this);
                this.f17085 = c6618M48522;
            }
        }
        return c6618M48522;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13553(int i) {
        BitSet bitSet = this.f17093;
        return bitSet != null && bitSet.get(i);
    }
}
