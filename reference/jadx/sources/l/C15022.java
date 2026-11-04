package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܳ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15022 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f49060 = new AtomicReference();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f49061 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m36179() {
        try {
            return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static MessageDigest m36183() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m36174() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36175(MessageDigest messageDigest, InputStream inputStream) {
        AtomicReference atomicReference = f49060;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36177(MessageDigest messageDigest, MessageDigest messageDigest2, InputStream inputStream) {
        AtomicReference atomicReference = f49060;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
                messageDigest2.update(bArr, 0, i);
            } catch (Throwable th) {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36176(MessageDigest messageDigest, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && cCharAt < 128) {
                messageDigest.update((byte) cCharAt);
            } else if (cCharAt < 2048) {
                messageDigest.update((byte) (((cCharAt >> 6) & 31) | 192));
                messageDigest.update((byte) ((cCharAt & '?') | 128));
            } else {
                messageDigest.update((byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS));
                messageDigest.update((byte) (((cCharAt >> 6) & 63) | 128));
                messageDigest.update((byte) ((cCharAt & '?') | 128));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36182(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f49061;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m36180(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string length is not even.");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 16);
            int iDigit2 = Character.digit(str.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("Invalid hex digit in input.");
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m36178(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (byte b : bArr) {
            if (i > 0) {
                cArr[i] = ':';
                i++;
            }
            int i2 = i + 1;
            char[] cArr2 = f49061;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36172(String str) {
        MessageDigest messageDigestM36174 = m36174();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            messageDigestM36174.update((byte) (str.charAt(i) & 255));
        }
        return m36182(messageDigestM36174.digest());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36173(byte[] bArr) {
        MessageDigest messageDigestM36174 = m36174();
        messageDigestM36174.update(bArr);
        return m36182(messageDigestM36174.digest());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36181(String str) {
        MessageDigest messageDigestM36174 = m36174();
        messageDigestM36174.update(str.getBytes(StandardCharsets.UTF_8));
        return m36182(messageDigestM36174.digest());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m36171(MessageDigest messageDigest) {
        return new C19498(messageDigest);
    }
}
