package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩺ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7BH */
/* JADX INFO: loaded from: classes.dex */
public final class C23991 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m53547(InterfaceC20921 interfaceC20921, String str) {
        List list = (List) ((HashMap) ((C3767) interfaceC20921).m12223()).get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53541(InterfaceC20921 interfaceC20921, String str) {
        Map mapM12230 = ((C3767) interfaceC20921).m12230();
        if (mapM12230 == null) {
            return null;
        }
        HashMap map = (HashMap) mapM12230;
        if (map.isEmpty()) {
            return null;
        }
        String str2 = (String) map.get(str);
        return str2 != null ? str2 : (String) map.get(str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m53544(C3767 c3767) {
        EnumC12716 enumC12716M12226 = c3767.m12226();
        if (EnumC12716.POST.equals(enumC12716M12226) || EnumC12716.PUT.equals(enumC12716M12226)) {
            return true;
        }
        return m53543(c3767);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53543(C3767 c3767) {
        if (!m53548(c3767)) {
            String strM53541 = m53541(c3767, "content-length");
            if (strM53541 != null) {
                String strTrim = strM53541.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    for (int i = 0; i < strTrim.length(); i++) {
                        char cCharAt = strTrim.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                        }
                    }
                    try {
                        if (Long.parseLong(strTrim) > 0) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m53548(C3767 c3767) {
        String strM53541 = m53541(c3767, "transfer-encoding");
        return (TextUtils.isEmpty(strM53541) || TextUtils.isEmpty(strM53541.trim())) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m53545(C3767 c3767) throws C20261 {
        String strM53541 = m53541(c3767, "content-length");
        if (TextUtils.isEmpty(strM53541)) {
            throw new C20261(R.string.MT_Protector, new Object[0]);
        }
        String strTrim = strM53541.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C20261(R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C20261(R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C20261(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m53546(C3767 c3767) throws IOException {
        int i;
        String strM53541 = m53541(c3767, "content-length");
        if (TextUtils.isEmpty(strM53541)) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(strM53541);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, 0));
        byte[] bArr = new byte[1024];
        InputStream inputStreamM12227 = c3767.m12227();
        if (inputStreamM12227 == null) {
            return "";
        }
        while (i != 0) {
            int i2 = inputStreamM12227.read(bArr, 0, i > 0 ? Math.min(1024, i) : 1024);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            if (i > 0) {
                i -= i2;
            }
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m53549(C3767 c3767) {
        if (c3767.m12229()) {
            return c3767.m12232();
        }
        try {
            String strM53546 = m53546(c3767);
            if (!strM53546.isEmpty() || !TextUtils.isEmpty(m53541(c3767, "content-length"))) {
                c3767.m12221(strM53546);
                return strM53546;
            }
        } catch (IOException | RuntimeException unused) {
        }
        HashMap map = new HashMap();
        c3767.m12222(map);
        String str = (String) map.get("postData");
        if (str == null) {
            str = (String) map.get("content");
        }
        if (str == null) {
            str = "";
        }
        c3767.m12221(str);
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6091 m53542(C3767 c3767, long j) throws C12056 {
        CoderResult coderResultDecode;
        CoderResult coderResultFlush;
        CoderResult coderResultDecode2;
        if (j < 0) {
            throw new C12056();
        }
        InputStream inputStreamM12227 = c3767.m12227();
        if (inputStreamM12227 == null && j > 0) {
            throw new C12056();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(o.a.t);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            long j2 = j;
            while (j2 > 0) {
                try {
                    int i = inputStreamM12227.read(bArr, 0, (int) Math.min(8192, j2));
                    if (i < 0) {
                        throw new C12056();
                    }
                    if (i == 0) {
                        throw new C12056();
                    }
                    messageDigest.update(bArr, 0, i);
                    byteBufferAllocate.put(bArr, 0, i);
                    byteBufferAllocate.flip();
                    do {
                        coderResultDecode2 = charsetDecoderOnUnmappableCharacter.decode(byteBufferAllocate, charBufferAllocate, false);
                        charBufferAllocate.flip();
                        sb.append((CharSequence) charBufferAllocate);
                        charBufferAllocate.clear();
                    } while (coderResultDecode2.isOverflow());
                    if (coderResultDecode2.isError()) {
                        coderResultDecode2.throwException();
                    }
                    byteBufferAllocate.compact();
                    j2 -= (long) i;
                } catch (IOException e) {
                    throw new C12056(e);
                }
            }
            byteBufferAllocate.flip();
            do {
                coderResultDecode = charsetDecoderOnUnmappableCharacter.decode(byteBufferAllocate, charBufferAllocate, true);
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate);
                charBufferAllocate.clear();
            } while (coderResultDecode.isOverflow());
            if (coderResultDecode.isError()) {
                coderResultDecode.throwException();
            }
            do {
                coderResultFlush = charsetDecoderOnUnmappableCharacter.flush(charBufferAllocate);
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate);
                charBufferAllocate.clear();
            } while (coderResultFlush.isOverflow());
            if (coderResultFlush.isError()) {
                coderResultFlush.throwException();
            }
            String string = sb.toString();
            c3767.m12221(string);
            return new C6091(string, messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
