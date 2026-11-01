package l;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩻ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W4D8 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC23683 extends InterfaceC10008, ReadableByteChannel {
    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);

    /* JADX INFO: renamed from: ۘ */
    C6043 mo16399();

    /* JADX INFO: renamed from: ۙ */
    long mo16401(InterfaceC8597 interfaceC8597);

    /* JADX INFO: renamed from: ۙ */
    String mo16402(long j);

    /* JADX INFO: renamed from: ۙ */
    String mo16404(Charset charset);

    /* JADX INFO: renamed from: ۚ */
    void mo16413(long j);

    /* JADX INFO: renamed from: ۜۨ */
    long mo16414();

    /* JADX INFO: renamed from: ۜܰ */
    boolean mo16415();

    /* JADX INFO: renamed from: ۠ܰ */
    long mo16416();

    /* JADX INFO: renamed from: ۨ */
    byte[] mo16420(long j);

    /* JADX INFO: renamed from: ۬ */
    C14511 mo16421(long j);

    /* JADX INFO: renamed from: ۬ܰ */
    byte[] mo16422();

    /* JADX INFO: renamed from: ܰ */
    boolean mo16424(C14511 c14511);

    /* JADX INFO: renamed from: ᩵ۙ */
    String mo16426();

    /* JADX INFO: renamed from: ᩺ۨ */
    InputStream mo16433();
}
