package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6271 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, C2701 c2701);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, C2701 c2701);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, C2701 c2701);

    Object parseFrom(AbstractC3262 abstractC3262);

    Object parseFrom(AbstractC3262 abstractC3262, C2701 c2701);

    Object parseFrom(AbstractC23725 abstractC23725);

    Object parseFrom(AbstractC23725 abstractC23725, C2701 c2701);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, C2701 c2701);

    Object parsePartialFrom(AbstractC3262 abstractC3262, C2701 c2701);
}
