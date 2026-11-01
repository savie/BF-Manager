package l;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: l.ۧۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K4DD */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10983 extends InterfaceC8597, WritableByteChannel {
    @Override // l.InterfaceC8597, java.io.Flushable
    void flush();

    InterfaceC10983 write(byte[] bArr);

    InterfaceC10983 writeByte(int i);

    InterfaceC10983 writeInt(int i);

    InterfaceC10983 writeShort(int i);

    /* JADX INFO: renamed from: ۖ */
    InterfaceC10983 mo16397(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۘ */
    C6043 mo16399();

    /* JADX INFO: renamed from: ۙ */
    InterfaceC10983 mo16405(C14511 c14511);

    /* JADX INFO: renamed from: ۨ */
    InterfaceC10983 mo16418(String str);

    /* JADX INFO: renamed from: ܳ */
    InterfaceC10983 mo16425();

    /* JADX INFO: renamed from: ᩹ */
    InterfaceC10983 mo16428(long j);

    /* JADX INFO: renamed from: ᩹ۨ */
    OutputStream mo16430();

    /* JADX INFO: renamed from: ᩺ */
    InterfaceC10983 mo16431(long j);
}
