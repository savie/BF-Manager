package l;

import java.io.Closeable;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܳܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4H2 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC15475 extends Closeable {
    String getName();

    boolean isClosed();

    long length();

    long position();

    int read(byte[] bArr, int i, int i2);

    void seek(long j);

    void setLength(long j);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙۤ */
    FileChannel mo7066();

    /* JADX INFO: renamed from: ۚۤ */
    boolean mo7067();

    /* JADX INFO: renamed from: ۤ */
    InterfaceC15475 mo7068(long j, long j2);

    /* JADX INFO: renamed from: ܺ */
    void mo7069();

    /* JADX INFO: renamed from: ᩷ */
    InterfaceC15475 mo7070(long j, long j2);

    /* JADX INFO: renamed from: ᩻ */
    InterfaceC15475 mo7071();
}
