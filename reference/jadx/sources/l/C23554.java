package l;

import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩻۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6LM */
/* JADX INFO: loaded from: classes.dex */
public final class C23554 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10854 m51915(InputStream inputStream, InterfaceC17203 interfaceC17203) throws IOException {
        EnumC5914 enumC5914;
        String str;
        byte[] bArr = new byte[512];
        int i = 0;
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
        if (m51916(i2, 0, "\u0089PNG\r\n\u001a\n", bArr) || ((i2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) || m51916(i2, 0, "BM", bArr) || m51916(i2, 0, "\u0000\u0000\u0001\u0000", bArr))) {
            enumC5914 = EnumC5914.BITMAP;
        } else if (m51916(i2, 0, "GIF87a", bArr) || m51916(i2, 0, "GIF89a", bArr)) {
            enumC5914 = EnumC5914.GIF;
        } else if (m51916(i2, 0, "RIFF", bArr) && m51916(i2, 8, "WEBP", bArr)) {
            enumC5914 = (i2 < 30 || !m51916(i2, 12, "VP8X", bArr) || (bArr[20] & 2) == 0) ? EnumC5914.BITMAP : EnumC5914.ANIMATED_WEBP;
        } else {
            enumC5914 = null;
        }
        if (enumC5914 != null) {
            return new C10854(enumC5914, null);
        }
        BitmapFactory.Options options = interfaceC17203.read();
        if (options.outWidth > 0 && options.outHeight > 0) {
            return new C10854(EnumC5914.BITMAP, options);
        }
        if (i2 >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16LE);
        } else if (i2 >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            str = new String(bArr, 2, i2 - 2, StandardCharsets.UTF_16BE);
        } else if (m51916(i2, 0, "<\u0000?\u0000", bArr)) {
            str = new String(bArr, 0, i2, StandardCharsets.UTF_16LE);
        } else if (m51916(i2, 0, "\u0000<\u0000?", bArr)) {
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
            return new C10854(EnumC5914.SVG, null);
        }
        return (i2 < 18 || !C9927.m25129(bArr)) ? new C10854(EnumC5914.UNKNOWN, options) : new C10854(EnumC5914.TGA, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51916(int i, int i2, String str, byte[] bArr) {
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
