package l;

import java.io.Closeable;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩸᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4H2 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC21850 extends Closeable {
    String getName();

    boolean isClosed();

    long length();

    long position();

    int read(byte[] bArr, int i, int i2);

    void seek(long j);

    void setLength(long j);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֨ۨ */
    boolean mo3051();

    /* JADX INFO: renamed from: ۙۨ */
    FileChannel mo3055();

    /* JADX INFO: renamed from: ۨ */
    InterfaceC21850 mo3056(long j, long j2);

    /* JADX INFO: renamed from: ܰ */
    InterfaceC21850 mo3058(long j, long j2);

    /* JADX INFO: renamed from: ܶ */
    void mo3059();

    /* JADX INFO: renamed from: ᩺ */
    InterfaceC21850 mo3060();
}
