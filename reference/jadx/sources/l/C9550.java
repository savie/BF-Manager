package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9550 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30912;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f30913;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC8805 f30914;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f30915;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f30916;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f30917;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f30918;

    public C9550(EnumC8805 enumC8805, Map map, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f30914 = enumC8805;
        this.f30915 = map;
        this.f30912 = str;
        this.f30913 = str2;
        this.f30918 = z;
        this.f30916 = z2;
        this.f30917 = z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9550 m24974(LinkedHashMap linkedHashMap, boolean z) {
        return new C9550(EnumC8805.ADD, C4681.unmodifiableMap(new LinkedHashMap(linkedHashMap)), "", "", z, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9550 m24973(String str, boolean z) {
        return new C9550(EnumC8805.DELETE, Collections.EMPTY_MAP, str, "", false, z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9550 m24972(String str, String str2, boolean z) {
        return new C9550(EnumC8805.RENAME, Collections.EMPTY_MAP, str, str2, false, false, z);
    }
}
