package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18593 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f59149;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f59150;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59151;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f59152;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f59153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f59154;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f59155;

    public C18593(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this.f59153 = str;
        this.f59151 = str2;
        this.f59150 = str3;
        this.f59149 = str4;
        this.f59154 = j;
        this.f59155 = j2;
        this.f59152 = str5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m42994() {
        return JSON.object().add("credentialId", this.f59153).add("clientName", this.f59151).add("digest", this.f59150).add("token", this.f59149).add("createdAt", this.f59154).add("lastUsedAt", this.f59155).add("lastIp", this.f59152);
    }
}
