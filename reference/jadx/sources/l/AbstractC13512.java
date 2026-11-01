package l;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ܰ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13512 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13512 f44635;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13512 f44636;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo6144(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    public abstract CharSequence mo12174(CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC13512 mo12175();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6146(StringBuilder sb, byte[] bArr, int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC13512 mo12177();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33038(byte[] bArr) {
        int length = bArr.length;
        C18304.m42511(0, length, bArr.length);
        C14590 c14590 = ((C4338) this).f15535;
        int i = c14590.f47742;
        int i2 = c14590.f47748;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(C8573.m22349(length, i2) * i);
        try {
            mo6146(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33039(String str) {
        try {
            CharSequence charSequenceMo12174 = mo12174((CharSequence) str);
            int length = (int) (((((long) ((C4338) this).f15535.f47744) * ((long) charSequenceMo12174.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo6144 = mo6144(bArr, charSequenceMo12174);
            if (iMo6144 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo6144];
            System.arraycopy(bArr, 0, bArr2, 0, iMo6144);
            return bArr2;
        } catch (C3299 e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        new C9651("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C9651("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        f44636 = new C4338("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C4338("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f44635 = new C1888();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC13512 m33036() {
        return f44636;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC13512 m33037() {
        return f44635;
    }
}
