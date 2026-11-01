package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2C5X */
/* JADX INFO: loaded from: classes4.dex */
public final class C21929 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48751(String str, String str2, HashMap map) {
        String str3 = (String) map.get(str);
        if (str3 != null) {
            str2 = C1679.m5594(str2, ":", str3);
        }
        map.put(str, str2);
    }
}
