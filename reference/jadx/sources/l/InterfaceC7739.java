package l;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.۟᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7739 extends Closeable, SeekableByteChannel {
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

    int readInt();

    long readLong();

    void seek(long j);

    int skipBytes(int i);

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۬ۙ */
    InterfaceC21850 mo4866();

    /* JADX INFO: renamed from: ܰ */
    int mo4867(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ܰ */
    C1388 mo4868(long j, long j2);

    /* JADX INFO: renamed from: ᩺ */
    C1388 mo4870();

    /* JADX INFO: renamed from: ᩻ܰ */
    int mo4872();
}
