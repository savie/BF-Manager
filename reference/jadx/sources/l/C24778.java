package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C24778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f80213;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f80214;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f80215;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f80216;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f80217;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f80218;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f80219;

    public C24778(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this.f80214 = str;
        this.f80213 = str2;
        this.f80219 = str3;
        this.f80215 = str4;
        this.f80218 = j;
        this.f80216 = j2;
        this.f80217 = str5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m55311() {
        return JSON.object().add("credentialId", this.f80214).add("clientName", this.f80213).add("digest", this.f80219).add("token", this.f80215).add("createdAt", this.f80218).add("lastUsedAt", this.f80216).add("lastIp", this.f80217);
    }
}
