package l;

import android.util.Base64DataException;
import android.util.Base64InputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ܽ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17871 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41723(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2210 m41720(final C12628 c12628, final C11904 c11904, CharSequence charSequence, int i, final C11158 c11158) throws C9446 {
        C17359.requireNonNull(c12628, "editView");
        int i2 = c11904.f38341;
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(new InterfaceC7509() { // from class: l.᩷᩸ܳ
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return c11158.f35138.m46242() || !c11904.m29785(c12628);
            }
        });
        m41726(interfaceC7509M41888);
        C19143 c19143 = c11904.f38339;
        C7956 c7956M44374 = c19143.m44374();
        try {
            if (c7956M44374.m21658() != c11904.f38342) {
                throw new C9446();
            }
            try {
                C4908 c4908M21659 = c7956M44374.m21659(interfaceC7509M41888);
                try {
                    C0498 c0498M44360 = c19143.m44360(c4908M21659);
                    try {
                        C17125 c17125 = new C17125(c0498M44360, i2, c11904.f38340, interfaceC7509M41888);
                        int iM41719 = m41719(charSequence, i, interfaceC7509M41888, c17125);
                        if (iM41719 < 0) {
                            C2210 c2210M7537 = C2210.m7537();
                            c0498M44360.close();
                            c4908M21659.close();
                            c7956M44374.close();
                            return c2210M7537;
                        }
                        c17125.m40281();
                        long j = ((long) i2) + ((long) iM41719);
                        int i3 = (int) j;
                        if (j != i3) {
                            throw new ArithmeticException();
                        }
                        c0498M44360.m2458(i3, i3);
                        if (!c0498M44360.m2457(interfaceC7509M41888)) {
                            throw new C9446();
                        }
                        C2210 c2210M7538 = C2210.m7538(iM41719, c19143.m44373());
                        c0498M44360.close();
                        c4908M21659.close();
                        c7956M44374.close();
                        return c2210M7538;
                    } catch (Throwable th) {
                        try {
                            c0498M44360.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c4908M21659.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalStateException e) {
                if (interfaceC7509M41888.mo924()) {
                    throw new C9446();
                }
                throw e;
            }
        } catch (Throwable th5) {
            c7956M44374.close();
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
    public static int m41719(CharSequence charSequence, int i, InterfaceC7509 interfaceC7509, C17125 c17125) throws IOException {
        boolean zM41724;
        boolean zM41725;
        int i2;
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        C13396 c13396 = new C13396(c17125, interfaceC7509M41888);
        int i3 = 0;
        ?? r2 = 1;
        if (i == 0) {
            int length = charSequence.length();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= length) {
                    m41726(interfaceC7509M41888);
                    if (i5 >= 0) {
                        break;
                    }
                    i3 = 1;
                    break;
                }
                m41725(i4, interfaceC7509M41888);
                char cCharAt = charSequence.charAt(i4);
                if (!m41723(cCharAt)) {
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit < 0) {
                        break;
                    }
                    if (i5 < 0) {
                        i5 = iDigit;
                    } else {
                        c13396.m33031((i5 << 4) | iDigit);
                        i5 = -1;
                    }
                }
                i4++;
            }
            r2 = i3;
        } else if (i == 1) {
            zM41724 = m41724(charSequence, 10, interfaceC7509M41888, c13396);
        } else if (i == 2) {
            zM41725 = m41724(charSequence, 2, interfaceC7509M41888, c13396);
        } else if (i == 3) {
            int length2 = charSequence.length();
            while (i3 < length2) {
                m41725(i3, interfaceC7509M41888);
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 <= 127) {
                    c13396.m33031(cCharAt2);
                } else {
                    c13396.m33031(63);
                    if (Character.isHighSurrogate(cCharAt2) && (i2 = i3 + 1) < length2 && Character.isLowSurrogate(charSequence.charAt(i2))) {
                        i3 = i2;
                    }
                }
                i3++;
            }
            m41726(interfaceC7509M41888);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(C13645.m33382(i, "which = "));
            }
            byte[] bArr = new byte[1048576];
            try {
                Base64InputStream base64InputStream = new Base64InputStream(new C5939(charSequence, interfaceC7509M41888), 0);
                while (true) {
                    try {
                        int i6 = base64InputStream.read(bArr);
                        if (i6 == -1) {
                            break;
                        }
                        c13396.m33032(i6, bArr);
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
                m41726(interfaceC7509M41888);
                base64InputStream.close();
                i3 = 1;
                break;
            } catch (Base64DataException unused) {
            }
            r2 = i3;
        }
        if (r2 != 0) {
            r2 = zM41724;
            r2 = zM41725;
            return c13396.m33030();
        }
        r2 = zM41724;
        r2 = zM41725;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41724(CharSequence charSequence, int i, InterfaceC7509 interfaceC7509, C13396 c13396) throws C9446 {
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
                m41725(i2, interfaceC7509);
                if (i2 != length && !m41723(charSequence.charAt(i2))) {
                    z = false;
                }
                if (!z && i4 < 0) {
                    i4 = i2;
                } else if (z && i4 >= 0) {
                    c13396.m33031(m41718(charSequence, i4, i2, i, interfaceC7509));
                    i3++;
                    i4 = -1;
                }
                i2++;
            } catch (NumberFormatException unused) {
            }
        }
        m41726(interfaceC7509);
        return i3 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41718(CharSequence charSequence, int i, int i2, int i3, InterfaceC7509 interfaceC7509) throws C9446 {
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
            m41725(i, interfaceC7509);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41725(int i, InterfaceC7509 interfaceC7509) throws C9446 {
        if ((i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) == 0) {
            m41726(interfaceC7509);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41726(InterfaceC7509 interfaceC7509) throws C9446 {
        if (interfaceC7509 != null && interfaceC7509.mo924()) {
            throw new C9446();
        }
    }
}
