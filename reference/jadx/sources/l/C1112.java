package l;

import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C1XH */
/* JADX INFO: loaded from: classes2.dex */
public class C1112 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m4125(String str) {
        CRC32 crc32;
        crc32 = new CRC32();
        crc32.update(str.getBytes(StandardCharsets.UTF_8));
        return Long.toHexString(crc32.getValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4126(Intent intent, Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme())) {
            return;
        }
        intent.addFlags(1);
        intent.addFlags(2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC15877 m4128(C10128 c10128) {
        try {
            int i = c10128.read();
            byte b = (byte) i;
            EnumC23337 enumC23337M52489 = EnumC23337.m52489(b);
            EnumC13857 enumC13857M33804 = EnumC13857.m33804(b);
            int i2 = i & 31;
            if (i2 <= 30) {
                return AbstractC15877.m37843(enumC23337M52489, i2).m37845(enumC13857M33804);
            }
            int i3 = c10128.read();
            if ((i3 & 127) == 0) {
                throw new C9382("corrupted stream - invalid high tag number found");
            }
            int i4 = 0;
            while (i3 >= 0 && (i3 & 128) != 0) {
                i4 = ((i3 & 127) | i4) << 7;
                i3 = c10128.read();
            }
            if (i3 < 0) {
                throw new C9382("EOF found inside tag value.");
            }
            return AbstractC15877.m37843(enumC23337M52489, (i3 & 127) | i4).m37845(enumC13857M33804);
        } catch (IOException e) {
            throw new C9382("Unable to parse ASN.1 tag", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m4124(C10128 c10128) {
        try {
            int i = c10128.read();
            if (i <= 127) {
                return i;
            }
            int i2 = i & 127;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = (i3 << 8) + c10128.read();
            }
            if (i3 != 0) {
                return i3;
            }
            throw new C9382("The indefinite length form is not (yet) supported!");
        } catch (IOException e) {
            throw new C9382("Unable to read the length of the ASN.1 object.", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4127(int i, C10128 c10128) {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = c10128.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            return bArr;
        } catch (IOException e) {
            throw new C9382("Unable to read the value of the ASN.1 object", e);
        }
    }
}
