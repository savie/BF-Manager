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

/* JADX INFO: renamed from: l.ۚۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7BH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5244 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m14444(InterfaceC21879 interfaceC21879, String str) {
        List list = (List) ((HashMap) ((C15530) interfaceC21879).m37130()).get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14439(InterfaceC21879 interfaceC21879, String str) {
        Map mapM37131 = ((C15530) interfaceC21879).m37131();
        if (mapM37131 == null) {
            return null;
        }
        HashMap map = (HashMap) mapM37131;
        if (map.isEmpty()) {
            return null;
        }
        String str2 = (String) map.get(str);
        return str2 != null ? str2 : (String) map.get(str.toLowerCase(Locale.ROOT));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m14443(C15530 c15530) {
        EnumC18351 enumC18351M37142 = c15530.m37142();
        if (EnumC18351.POST.equals(enumC18351M37142) || EnumC18351.PUT.equals(enumC18351M37142)) {
            return true;
        }
        return m14441(c15530);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14441(C15530 c15530) {
        if (!m14445(c15530)) {
            String strM14439 = m14439(c15530, "content-length");
            if (strM14439 != null) {
                String strTrim = strM14439.trim();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m14445(C15530 c15530) {
        String strM14439 = m14439(c15530, "transfer-encoding");
        return (TextUtils.isEmpty(strM14439) || TextUtils.isEmpty(strM14439.trim())) ? false : true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static long m14446(C15530 c15530) throws C13712 {
        String strM14439 = m14439(c15530, "content-length");
        if (TextUtils.isEmpty(strM14439)) {
            throw new C13712(R.string.MT_Protector, new Object[0]);
        }
        String strTrim = strM14439.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C13712(R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C13712(R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C13712(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m14442(C15530 c15530) throws IOException {
        int i;
        String strM14439 = m14439(c15530, "content-length");
        if (TextUtils.isEmpty(strM14439)) {
            i = -1;
        } else {
            try {
                i = Integer.parseInt(strM14439);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, 0));
        byte[] bArr = new byte[1024];
        InputStream inputStreamM37136 = c15530.m37136();
        if (inputStreamM37136 == null) {
            return "";
        }
        while (i != 0) {
            int i2 = inputStreamM37136.read(bArr, 0, i > 0 ? Math.min(1024, i) : 1024);
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m14438(C15530 c15530) {
        if (c15530.m37141()) {
            return c15530.m37138();
        }
        try {
            String strM14442 = m14442(c15530);
            if (!strM14442.isEmpty() || !TextUtils.isEmpty(m14439(c15530, "content-length"))) {
                c15530.m37134(strM14442);
                return strM14442;
            }
        } catch (IOException | RuntimeException unused) {
        }
        HashMap map = new HashMap();
        c15530.m37135(map);
        String str = (String) map.get("postData");
        if (str == null) {
            str = (String) map.get("content");
        }
        if (str == null) {
            str = "";
        }
        c15530.m37134(str);
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2421 m14440(C15530 c15530, long j) throws C11595 {
        CoderResult coderResultDecode;
        CoderResult coderResultFlush;
        CoderResult coderResultDecode2;
        if (j < 0) {
            throw new C11595();
        }
        InputStream inputStreamM37136 = c15530.m37136();
        if (inputStreamM37136 == null && j > 0) {
            throw new C11595();
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
                    int i = inputStreamM37136.read(bArr, 0, (int) Math.min(8192, j2));
                    if (i < 0) {
                        throw new C11595();
                    }
                    if (i == 0) {
                        throw new C11595();
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
                    throw new C11595(e);
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
            c15530.m37134(string);
            return new C2421(string, messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
