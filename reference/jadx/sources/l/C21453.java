package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩶ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21453 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m48807(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = C12669.m31436(uuidArr.length, 16, 4, length);
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
    public static byte[] m48806(UUID uuid, byte[] bArr) {
        C14739 c14739M48805 = m48805(bArr);
        if (c14739M48805 == null) {
            return null;
        }
        UUID uuid2 = c14739M48805.f48152;
        if (!uuid.equals(uuid2)) {
            C1896.m6517("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return c14739M48805.f48153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14739 m48805(byte[] bArr) {
        UUID[] uuidArr;
        C21287 c21287 = new C21287(bArr);
        if (c21287.m48509() < 32) {
            return null;
        }
        c21287.m48510(0);
        int iM48486 = c21287.m48486();
        int iM48500 = c21287.m48500();
        if (iM48500 != iM48486) {
            C1896.m6517("Advertised atom size (" + iM48500 + ") does not match buffer size: " + iM48486);
            return null;
        }
        int iM48501 = c21287.m48500();
        if (iM48501 != 1886614376) {
            j$$ExternalSyntheticOutline0.m(iM48501, "Atom type is not pssh: ");
            return null;
        }
        int iM29513 = C11756.m29513(c21287.m48500());
        if (iM29513 > 1) {
            j$$ExternalSyntheticOutline0.m(iM29513, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(c21287.m48518(), c21287.m48518());
        if (iM29513 == 1) {
            int iM48512 = c21287.m48512();
            uuidArr = new UUID[iM48512];
            for (int i = 0; i < iM48512; i++) {
                uuidArr[i] = new UUID(c21287.m48518(), c21287.m48518());
            }
        } else {
            uuidArr = null;
        }
        int iM48513 = c21287.m48512();
        int iM48487 = c21287.m48486();
        if (iM48513 == iM48487) {
            byte[] bArr2 = new byte[iM48513];
            c21287.m48490(0, iM48513, bArr2);
            return new C14739(uuid, iM29513, bArr2, uuidArr);
        }
        C1896.m6517("Atom data size (" + iM48513 + ") does not match the bytes left: " + iM48487);
        return null;
    }
}
