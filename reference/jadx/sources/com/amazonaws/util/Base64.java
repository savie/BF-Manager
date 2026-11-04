package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum Base64 {
    ;


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Base64Codec f814 = new Base64Codec();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m737(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.m758(f814.m742(bArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m738(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : f814.m742(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m735(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        int iM757 = CodecUtils.m757(str, bArr);
        f814.getClass();
        return Base64Codec.m740(iM757, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m736(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64Codec base64Codec = f814;
        int length = bArr.length;
        base64Codec.getClass();
        return Base64Codec.m740(length, bArr);
    }
}
