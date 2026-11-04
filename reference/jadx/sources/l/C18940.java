package l;

import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩳ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6LM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18940 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7753 m43964(C7753 c7753, InterfaceC18194 interfaceC18194) {
        EnumC0295 enumC0295 = c7753.f25517;
        EnumC0295 enumC0296 = EnumC0295.BITMAP;
        if (enumC0295 == enumC0296 || enumC0295 == EnumC0295.GIF || enumC0295 == EnumC0295.ANIMATED_WEBP) {
            return c7753;
        }
        BitmapFactory.Options options = interfaceC18194.read();
        if (options.outWidth > 0 && options.outHeight > 0) {
            return new C7753(enumC0296, options);
        }
        EnumC0295 enumC0297 = EnumC0295.UNKNOWN;
        return enumC0295 == enumC0297 ? new C7753(enumC0297, options) : c7753;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7753 m43963(InputStream inputStream) throws IOException {
        EnumC0295 enumC0295;
        String str;
        String str2;
        byte[] bArr = new byte[512];
        int i = 0;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        int i2 = 0;
        while (i2 < 512) {
            int i3 = inputStream.read(bArr, i2, 512 - i2);
            if (i3 < 0) {
                break;
            }
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    break;
                }
                bArr[i2] = (byte) i4;
                i2++;
            } else {
                i2 += i3;
            }
        }
        if (m43965(i2, 0, "\u0089PNG\r\n\u001a\n", bArr) || ((i2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) || m43965(i2, 0, "BM", bArr) || m43965(i2, 0, "\u0000\u0000\u0001\u0000", bArr))) {
            enumC0295 = EnumC0295.BITMAP;
        } else if (m43965(i2, 0, "GIF87a", bArr) || m43965(i2, 0, "GIF89a", bArr)) {
            enumC0295 = EnumC0295.GIF;
        } else if (m43965(i2, 0, "RIFF", bArr) && m43965(i2, 8, "WEBP", bArr)) {
            enumC0295 = (i2 < 30 || !m43965(i2, 12, "VP8X", bArr) || (bArr[20] & 2) == 0) ? EnumC0295.BITMAP : EnumC0295.ANIMATED_WEBP;
        } else {
            enumC0295 = null;
        }
        if (enumC0295 != null) {
            if (m43965(i2, 0, "\u0089PNG\r\n\u001a\n", bArr)) {
                str2 = "image/png";
            } else if (i2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) {
                str2 = "image/jpeg";
            } else if (m43965(i2, 0, "RIFF", bArr) && m43965(i2, 8, "WEBP", bArr)) {
                str2 = "image/webp";
            } else {
                str2 = m43965(i2, 0, "\u0000\u0000\u0001\u0000", bArr) ? "image/x-ico" : null;
            }
            if ("image/png".equals(str2) && i2 >= 33 && m43965(i2, 8, "\u0000\u0000\u0000\rIHDR", bArr) && bArr[28] == 0) {
                z = true;
            }
            return new C7753(enumC0295, str2, z);
        }
        if (i2 >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16LE);
        } else if (i2 >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16BE);
        } else if (m43965(i2, 0, "<\u0000?\u0000", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16LE);
        } else if (m43965(i2, 0, "\u0000<\u0000?", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16BE);
        } else {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_8);
        }
        if (str.startsWith("\ufeff")) {
            str = str.substring(1);
        }
        while (i < str.length() && (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\r' || str.charAt(i) == '\n')) {
            i++;
        }
        int i5 = i + 1;
        if ((i5 < str.length() && str.charAt(i) == '<' && (Character.isLetter(str.charAt(i5)) || str.charAt(i5) == '_' || str.charAt(i5) == ':' || str.charAt(i5) == '?' || str.charAt(i5) == '!')) || (i2 == 512 && i == str.length())) {
            return new C7753(EnumC0295.SVG, null);
        }
        return (i2 < 18 || !C7103.m19446(bArr)) ? new C7753(EnumC0295.UNKNOWN, null) : new C7753(EnumC0295.TGA, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43965(int i, int i2, String str, byte[] bArr) {
        if (i - i2 >= str.length()) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                if ((bArr[i2 + i3] & 255) == str.charAt(i3)) {
                }
            }
            return true;
        }
        return false;
    }
}
