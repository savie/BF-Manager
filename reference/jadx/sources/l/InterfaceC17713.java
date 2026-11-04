package l;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.ܽܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17713 extends Closeable, SeekableByteChannel {
    int available();

    void flush();

    long getFilePointer();

    String getName();

    boolean isClosed();

    long length();

    int read();

    int read(ByteBuffer byteBuffer);

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    byte readByte();

    void readFully(byte[] bArr);

    void readFully(byte[] bArr, int i, int i2);

    int readInt();

    long readLong();

    void seek(long j);

    int skipBytes(int i);

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۚۙ */
    InterfaceC15475 mo34028();

    /* JADX INFO: renamed from: ۡ᩷ */
    int mo34029();

    /* JADX INFO: renamed from: ᩷ */
    int mo34032(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    C13961 mo34033(long j, long j2);

    /* JADX INFO: renamed from: ᩻ */
    C13961 mo34035();
}
