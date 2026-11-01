package l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܰᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8M2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13987 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m33838(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = C1694.m5620(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        } else {
            byteBufferAllocate.putInt(0);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m33837(UUID uuid, byte[] bArr) {
        C4813 c4813M33836 = m33836(bArr);
        if (c4813M33836 == null) {
            return null;
        }
        UUID uuid2 = c4813M33836.f16911;
        if (!uuid.equals(uuid2)) {
            C0303.m1848("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return c4813M33836.f16912;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4813 m33836(byte[] bArr) {
        UUID[] uuidArr;
        C2460 c2460 = new C2460(bArr);
        if (c2460.m7509() < 32) {
            return null;
        }
        c2460.m7510(0);
        int iM7503 = c2460.m7503();
        int iM7499 = c2460.m7499();
        if (iM7499 != iM7503) {
            C0303.m1848("Advertised atom size (" + iM7499 + ") does not match buffer size: " + iM7503);
            return null;
        }
        int iM74910 = c2460.m7499();
        if (iM74910 != 1886614376) {
            C7309.m19506(iM74910, "Atom type is not pssh: ");
            return null;
        }
        int iM46229 = C20441.m46229(c2460.m7499());
        if (iM46229 > 1) {
            C7309.m19506(iM46229, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(c2460.m7529(), c2460.m7529());
        if (iM46229 == 1) {
            int iM7531 = c2460.m7531();
            uuidArr = new UUID[iM7531];
            for (int i = 0; i < iM7531; i++) {
                uuidArr[i] = new UUID(c2460.m7529(), c2460.m7529());
            }
        } else {
            uuidArr = null;
        }
        int iM7532 = c2460.m7531();
        int iM7504 = c2460.m7503();
        if (iM7532 == iM7504) {
            byte[] bArr2 = new byte[iM7532];
            c2460.m7507(0, iM7532, bArr2);
            return new C4813(uuid, iM46229, bArr2, uuidArr);
        }
        C0303.m1848("Atom data size (" + iM7532 + ") does not match the bytes left: " + iM7504);
        return null;
    }
}
