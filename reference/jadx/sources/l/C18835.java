package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18835 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f61026;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f61027;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f61028;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f61029;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f61030;

    public C18835(JSONObject jSONObject) {
        this.f61030 = jSONObject.getString("arch", "");
        this.f61029 = jSONObject.getInt("bits", 0);
        this.f61027 = C1383.m4844(jSONObject, "address", 0L);
        String string = jSONObject.getString("hex", "");
        this.f61028 = jSONObject.getInt("size", 0);
        int length = string.length();
        if ((length & 1) != 0) {
            throw new C1901("Invalid hex length from radare2");
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(string.charAt(i3), 16);
            int iDigit2 = Character.digit(string.charAt(i3 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw new C1901("Invalid hex digit from radare2");
            }
            bArr[i2] = (byte) (iDigit2 | (iDigit << 4));
        }
        this.f61026 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18835 m43467(JSONObject jSONObject) {
        return new C18835(jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43468() {
        return (byte[]) this.f61026.clone();
    }
}
