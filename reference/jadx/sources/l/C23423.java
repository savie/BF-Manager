package l;

import android.util.Base64DataException;
import android.util.Base64InputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.᩻ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23423 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51586(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12134 m51583(final C13026 c13026, final C17072 c17072, CharSequence charSequence, int i, final C7194 c7194) throws C1105 {
        C13638.requireNonNull(c13026, "editView");
        int i2 = c17072.f54491;
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(new InterfaceC5614() { // from class: l.ۤۗۚ
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return c7194.f24002.m37332() || !c17072.m39857(c13026);
            }
        });
        m51589(interfaceC5614M29777);
        C2516 c2516 = c17072.f54490;
        C11690 c11690M7806 = c2516.m7806();
        try {
            if (c11690M7806.m29186() != c17072.f54493) {
                throw new C1105();
            }
            try {
                C15218 c15218M29189 = c11690M7806.m29189(interfaceC5614M29777);
                try {
                    C13807 c13807M7792 = c2516.m7792(c15218M29189);
                    try {
                        C10723 c10723 = new C10723(c13807M7792, i2, c17072.f54492, interfaceC5614M29777);
                        int iM51582 = m51582(charSequence, i, interfaceC5614M29777, c10723);
                        if (iM51582 < 0) {
                            C12134 c12134M30207 = C12134.m30207();
                            c13807M7792.close();
                            c15218M29189.close();
                            c11690M7806.close();
                            return c12134M30207;
                        }
                        c10723.m26948();
                        long j = ((long) i2) + ((long) iM51582);
                        int i3 = (int) j;
                        if (j != i3) {
                            throw new ArithmeticException();
                        }
                        c13807M7792.m33609(i3, i3);
                        if (!c13807M7792.m33607(interfaceC5614M29777)) {
                            throw new C1105();
                        }
                        C12134 c12134M30208 = C12134.m30208(iM51582, c2516.m7808());
                        c13807M7792.close();
                        c15218M29189.close();
                        c11690M7806.close();
                        return c12134M30208;
                    } catch (Throwable th) {
                        try {
                            c13807M7792.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c15218M29189.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalStateException e) {
                if (interfaceC5614M29777.mo2357()) {
                    throw new C1105();
                }
                throw e;
            }
        } catch (Throwable th5) {
            c11690M7806.close();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51582(CharSequence charSequence, int i, InterfaceC5614 interfaceC5614, C10723 c10723) throws IOException {
        boolean zM51587;
        boolean zM51588;
        int i2;
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
        C0138 c0138 = new C0138(c10723, interfaceC5614M29777);
        int i3 = 0;
        ?? r2 = 1;
        if (i == 0) {
            int length = charSequence.length();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= length) {
                    m51589(interfaceC5614M29777);
                    if (i5 >= 0) {
                        break;
                    }
                    i3 = 1;
                    break;
                }
                m51588(i4, interfaceC5614M29777);
                char cCharAt = charSequence.charAt(i4);
                if (!m51586(cCharAt)) {
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit < 0) {
                        break;
                    }
                    if (i5 < 0) {
                        i5 = iDigit;
                    } else {
                        c0138.m1216((i5 << 4) | iDigit);
                        i5 = -1;
                    }
                }
                i4++;
            }
            r2 = i3;
        } else if (i == 1) {
            zM51587 = m51587(charSequence, 10, interfaceC5614M29777, c0138);
        } else if (i == 2) {
            zM51588 = m51587(charSequence, 2, interfaceC5614M29777, c0138);
        } else if (i == 3) {
            int length2 = charSequence.length();
            while (i3 < length2) {
                m51588(i3, interfaceC5614M29777);
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 <= 127) {
                    c0138.m1216(cCharAt2);
                } else {
                    c0138.m1216(63);
                    if (Character.isHighSurrogate(cCharAt2) && (i2 = i3 + 1) < length2 && Character.isLowSurrogate(charSequence.charAt(i2))) {
                        i3 = i2;
                    }
                }
                i3++;
            }
            m51589(interfaceC5614M29777);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(C8479.m22141(i, "which = "));
            }
            byte[] bArr = new byte[1048576];
            try {
                Base64InputStream base64InputStream = new Base64InputStream(new C16367(charSequence, interfaceC5614M29777), 0);
                while (true) {
                    try {
                        int i6 = base64InputStream.read(bArr);
                        if (i6 == -1) {
                            break;
                        }
                        c0138.m1217(i6, bArr);
                        r2 = i3;
                    } catch (Throwable th) {
                        try {
                            base64InputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                m51589(interfaceC5614M29777);
                base64InputStream.close();
                i3 = 1;
                break;
            } catch (Base64DataException unused) {
            }
            r2 = i3;
        }
        if (r2 != 0) {
            r2 = zM51587;
            r2 = zM51588;
            return c0138.m1215();
        }
        r2 = zM51587;
        r2 = zM51588;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51587(CharSequence charSequence, int i, InterfaceC5614 interfaceC5614, C0138 c0138) throws C1105 {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            boolean z = true;
            if (i2 > length) {
                break;
            }
            try {
                m51588(i2, interfaceC5614);
                if (i2 != length && !m51586(charSequence.charAt(i2))) {
                    z = false;
                }
                if (!z && i4 < 0) {
                    i4 = i2;
                } else if (z && i4 >= 0) {
                    c0138.m1216(m51581(charSequence, i4, i2, i, interfaceC5614));
                    i3++;
                    i4 = -1;
                }
                i2++;
            } catch (NumberFormatException unused) {
            }
        }
        m51589(interfaceC5614);
        return i3 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51581(CharSequence charSequence, int i, int i2, int i3, InterfaceC5614 interfaceC5614) throws C1105 {
        boolean z;
        if (i >= i2) {
            throw new NumberFormatException();
        }
        char cCharAt = charSequence.charAt(i);
        int i4 = 0;
        if (cCharAt == '-' || cCharAt == '+') {
            z = cCharAt == '-';
            i++;
            if (i == i2) {
                throw new NumberFormatException();
            }
        } else {
            z = false;
        }
        int i5 = z ? Integer.MIN_VALUE : SecP160R1Field.PInv;
        int i6 = i5 / i3;
        while (i < i2) {
            m51588(i, interfaceC5614);
            int i7 = i + 1;
            int iDigit = Character.digit(charSequence.charAt(i), i3);
            if (iDigit < 0 || i4 < i6) {
                throw new NumberFormatException();
            }
            int i8 = i4 * i3;
            if (i8 < i5 + iDigit) {
                throw new NumberFormatException();
            }
            i4 = i8 - iDigit;
            i = i7;
        }
        return z ? i4 : -i4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51588(int i, InterfaceC5614 interfaceC5614) throws C1105 {
        if ((i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) == 0) {
            m51589(interfaceC5614);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51589(InterfaceC5614 interfaceC5614) throws C1105 {
        if (interfaceC5614 != null && interfaceC5614.mo2357()) {
            throw new C1105();
        }
    }
}
