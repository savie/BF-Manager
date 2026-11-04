package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7954 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10190 f26428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11682 f26429;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16903 f26430;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map f26431;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C12560 f26432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f26433;

    public C7954(C0496 c0496) {
        Map mapUnmodifiableMap;
        this.f26430 = c0496.f2145;
        this.f26433 = c0496.f2144;
        C1988 c1988 = c0496.f2146;
        c1988.getClass();
        this.f26429 = new C11682(c1988);
        this.f26428 = c0496.f2143;
        Map map = c0496.f2147;
        byte[] bArr = C19822.f63715;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C4681.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f26431 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16903 m21649() {
        return this.f26430;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m21651() {
        return this.f26433;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11682 m21648() {
        return this.f26429;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m21646(String str) {
        return this.f26429.m29361(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10190 m21647() {
        return this.f26428;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0496 m21650() {
        C0496 c0496 = new C0496();
        Map linkedHashMap = Collections.EMPTY_MAP;
        c0496.f2147 = linkedHashMap;
        c0496.f2145 = this.f26430;
        c0496.f2144 = this.f26433;
        c0496.f2143 = this.f26428;
        Map map = this.f26431;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        c0496.f2147 = linkedHashMap;
        c0496.f2146 = this.f26429.m29362();
        return c0496;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12560 m21652() {
        C12560 c12560 = this.f26432;
        if (c12560 != null) {
            return c12560;
        }
        C12560 c12560M31260 = C12560.m31260(this.f26429);
        this.f26432 = c12560M31260;
        return c12560M31260;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m21653() {
        return this.f26430.m39871();
    }

    public final String toString() {
        return "Request{method=" + this.f26433 + ", url=" + this.f26430 + ", tags=" + this.f26431 + '}';
    }
}
