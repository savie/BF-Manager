package l;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۜ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC7499 f24801;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC7499 f24802;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo5441(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract CharSequence mo20549(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7499 mo20551();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5443(StringBuilder sb, byte[] bArr, int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7499 mo20553();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20550(byte[] bArr) {
        int length = bArr.length;
        C12128.m30303(0, length, bArr.length);
        C10481 c10481 = ((C8990) this).f29294;
        int i = c10481.f33361;
        int i2 = c10481.f33360;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(C23666.m52903(length, i2) * i);
        try {
            mo5443(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m20552(String str) {
        try {
            CharSequence charSequenceMo20549 = mo20549((CharSequence) str);
            int length = (int) (((((long) ((C8990) this).f29294.f33354) * ((long) charSequenceMo20549.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo5441 = mo5441(bArr, charSequenceMo20549);
            if (iMo5441 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo5441];
            System.arraycopy(bArr, 0, bArr2, 0, iMo5441);
            return bArr2;
        } catch (C3024 e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        new C9735("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C9735("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        f24802 = new C8990("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C8990("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f24801 = new C1533();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC7499 m20548() {
        return f24802;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC7499 m20547() {
        return f24801;
    }
}
