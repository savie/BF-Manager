package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۜ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6RT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6961 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18713(InterfaceC3800 interfaceC3800, Bundle bundle) throws IOException {
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
        byte[] bArrM21759 = C8331.m21755(65520, bundle2).m21759(65520);
        C11018 c11018 = new C11018(bArrM21759.length + 16);
        c11018.writeInt(843666245);
        c11018.writeInt(1);
        c11018.m27794(bArrM21759);
        CRC32 crc32 = new CRC32();
        crc32.update(c11018.m27788(), 0, c11018.size());
        c11018.writeInt((int) crc32.getValue());
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("app-index.tmp");
        InterfaceC3800 interfaceC3800Resolve2 = interfaceC3800.resolve("app-index");
        if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            C11153.m28084(interfaceC3800Resolve);
            C5212.delete(interfaceC3800Resolve);
        }
        C12564.m31275(interfaceC3800Resolve, c11018.m27773());
        C5212.move(interfaceC3800Resolve, interfaceC3800Resolve2, EnumC21440.ATOMIC_MOVE, EnumC21440.REPLACE_EXISTING);
        InterfaceC1959.f7372.mo6327(interfaceC3800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m18712(InterfaceC3800 interfaceC3800) throws IOException {
        int i;
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("app-index");
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.isRegularFile(interfaceC3800Resolve, enumC22146)) {
            throw new IOException("Session startup index is missing");
        }
        long size = C5212.size(interfaceC3800Resolve);
        if (size < 16 || size > 65536) {
            throw new IOException("Invalid session startup index length");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800Resolve, enumC22146);
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
        C17367 c17367 = new C17367(bArr);
        CRC32 crc32 = new CRC32();
        int i5 = i2 - 4;
        crc32.update(bArr, 0, i5);
        c17367.seek(i5);
        if (c17367.readInt() != ((int) crc32.getValue())) {
            throw new IOException("Invalid session startup index checksum");
        }
        c17367.seek(0L);
        if (c17367.readInt() != 843666245 || c17367.readInt() != 1 || c17367.readInt() != (i = i2 - 16)) {
            throw new IOException("Unsupported session startup index");
        }
        return C8331.m21754(65536, i, new ByteArrayInputStream(bArr, 12, i)).m21760();
    }
}
