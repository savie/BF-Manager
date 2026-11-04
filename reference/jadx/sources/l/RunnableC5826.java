package l;

/* JADX INFO: renamed from: l.ۚᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NW */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5826 extends AbstractRunnableC15257 implements Runnable {
    public RunnableC5826(C5563 c5563, String str) {
        super(c5563);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5563 c5563 = this.f49894;
        c5563.m16486("211-Features supported by FTP Server\r\n");
        c5563.m16486(" UTF8\r\n");
        c5563.m16486(" MDTM\r\n");
        c5563.m16486(" MFMT\r\n");
        c5563.m16486(" MLST Type*;Size*;Modify*;Perm\r\n");
        c5563.m16486(" HASH MD5;SHA-1;SHA-256;SHA-384;SHA-512\r\n");
        c5563.m16486(" REST STREAM\r\n");
        c5563.m16486(" RANG STREAM\r\n");
        c5563.m16486("211 End\r\n");
    }
}
