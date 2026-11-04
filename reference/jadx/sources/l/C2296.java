package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J754 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f7451;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f7452;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f7453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7454;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f7455;

    public C2296(JSONObject jSONObject) {
        this.f7454 = jSONObject.getString("arch", "");
        this.f7452 = jSONObject.getInt("bits", 0);
        this.f7451 = C21160.m48263(jSONObject, "address", 0L);
        String string = jSONObject.getString("hex", "");
        this.f7453 = jSONObject.getInt("size", 0);
        int length = string.length();
        if ((length & 1) != 0) {
            throw new C15938("Invalid hex length from radare2");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(string.charAt(i3), 16);
            int iDigit2 = Character.digit(string.charAt(i3 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw new C15938("Invalid hex digit from radare2");
            }
            bArr[i2] = (byte) (iDigit2 | (iDigit << 4));
        }
        this.f7455 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2296 m7774(JSONObject jSONObject) {
        return new C2296(jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m7775() {
        return (byte[]) this.f7455.clone();
    }
}
