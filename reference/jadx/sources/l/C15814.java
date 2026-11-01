package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15814 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC0290 f51174;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f51175;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f51176;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f51177;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f51178;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f51179;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map f51180;

    public C15814(EnumC0290 enumC0290, Map map, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f51174 = enumC0290;
        this.f51180 = map;
        this.f51176 = str;
        this.f51178 = str2;
        this.f51175 = z;
        this.f51177 = z2;
        this.f51179 = z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15814 m37587(LinkedHashMap linkedHashMap, boolean z) {
        return new C15814(EnumC0290.ADD, C0561.unmodifiableMap(new LinkedHashMap(linkedHashMap)), "", "", z, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15814 m37586(String str, boolean z) {
        return new C15814(EnumC0290.DELETE, Collections.EMPTY_MAP, str, "", false, z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15814 m37585(String str, String str2, boolean z) {
        return new C15814(EnumC0290.RENAME, Collections.EMPTY_MAP, str, str2, false, false, z);
    }
}
