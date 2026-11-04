package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6RT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1405 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m5136(Bundle bundle) {
        String string = bundle.getString("filePath");
        String string2 = bundle.getString("remark");
        return (((string == null ? 0L : ((long) string.length()) * 2) + 256 + (string2 != null ? ((long) Math.min(string2.length(), 512)) * 2 : 0L)) * 4) + 8192;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5138(InterfaceC24329 interfaceC24329, Bundle bundle) throws IOException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("filePath", bundle.getString("filePath"));
        bundle2.putBoolean("changed", bundle.getBoolean("changed"));
        bundle2.putBoolean("temp", bundle.getBoolean("temp"));
        bundle2.putInt("sideIconType", bundle.getInt("sideIconType"));
        String string = bundle.getString("remark");
        if (string != null) {
            int iMin = Math.min(string.length(), 512);
            if (iMin > 0 && iMin < string.length() && Character.isHighSurrogate(string.charAt(iMin - 1))) {
                iMin--;
            }
            bundle2.putString("remark", string.substring(0, iMin));
        }
        byte[] bArrM11508 = C3510.m11505(65520, bundle2).m11508(65520);
        C6178 c6178 = new C6178(bArrM11508.length + 16);
        c6178.writeInt(843666245);
        c6178.writeInt(1);
        c6178.m17806(bArrM11508);
        CRC32 crc32 = new CRC32();
        crc32.update(c6178.m17808(), 0, c6178.size());
        c6178.writeInt((int) crc32.getValue());
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("app-index.tmp");
        InterfaceC24329 interfaceC24329Resolve2 = interfaceC24329.resolve("app-index");
        if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            C1273.m4659(interfaceC24329Resolve);
            C3445.delete(interfaceC24329Resolve);
        }
        C7985.m21773(interfaceC24329Resolve, c6178.m17796());
        C3445.move(interfaceC24329Resolve, interfaceC24329Resolve2, EnumC18361.ATOMIC_MOVE, EnumC18361.REPLACE_EXISTING);
        InterfaceC22465.f72702.mo26981(interfaceC24329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m5137(InterfaceC24329 interfaceC24329) throws IOException {
        int i;
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("app-index");
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.isRegularFile(interfaceC24329Resolve, enumC20599)) {
            throw new IOException("Session startup index is missing");
        }
        long size = C3445.size(interfaceC24329Resolve);
        if (size < 16 || size > 65536) {
            throw new IOException("Invalid session startup index length");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329Resolve, enumC20599);
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = inputStreamNewInputStream.read(bArr, i3, i2 - i3);
                if (i4 <= 0) {
                    throw new IOException("Truncated session startup index");
                }
                i3 += i4;
            } catch (Throwable th) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Trailing session startup index bytes");
        }
        inputStreamNewInputStream.close();
        C20348 c20348 = new C20348(bArr);
        CRC32 crc32 = new CRC32();
        int i5 = i2 - 4;
        crc32.update(bArr, 0, i5);
        c20348.seek(i5);
        if (c20348.readInt() != ((int) crc32.getValue())) {
            throw new IOException("Invalid session startup index checksum");
        }
        c20348.seek(0L);
        if (c20348.readInt() != 843666245 || c20348.readInt() != 1 || c20348.readInt() != (i = i2 - 16)) {
            throw new IOException("Unsupported session startup index");
        }
        return C3510.m11504(65536, i, new ByteArrayInputStream(bArr, 12, i)).m11509();
    }
}
