package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC11490 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, C24215 c24215);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, C24215 c24215);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, C24215 c24215);

    Object parseFrom(AbstractC3660 abstractC3660);

    Object parseFrom(AbstractC3660 abstractC3660, C24215 c24215);

    Object parseFrom(AbstractC17084 abstractC17084);

    Object parseFrom(AbstractC17084 abstractC17084, C24215 c24215);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, C24215 c24215);

    Object parsePartialFrom(AbstractC3660 abstractC3660, C24215 c24215);
}
