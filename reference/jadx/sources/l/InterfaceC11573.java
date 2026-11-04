package l;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: l.ۧۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4DD */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11573 extends InterfaceC7099, WritableByteChannel {
    @Override // l.InterfaceC7099, java.io.Flushable
    void flush();

    InterfaceC11573 write(byte[] bArr);

    InterfaceC11573 writeByte(int i);

    InterfaceC11573 writeInt(int i);

    InterfaceC11573 writeShort(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    C1879 mo29106();

    /* JADX INFO: renamed from: ۖ */
    InterfaceC11573 mo6431();

    /* JADX INFO: renamed from: ۙ */
    InterfaceC11573 mo6435(C16794 c16794);

    /* JADX INFO: renamed from: ۤ */
    InterfaceC11573 mo6442(String str);

    /* JADX INFO: renamed from: ۫ۤ */
    OutputStream mo6445();

    /* JADX INFO: renamed from: ܳ */
    InterfaceC11573 mo6447(long j);

    /* JADX INFO: renamed from: ᩸ */
    InterfaceC11573 mo6452(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ᩻ */
    InterfaceC11573 mo6453(long j);
}
