package l;

/* JADX INFO: renamed from: l.֡᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NW */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC0677 extends AbstractRunnableC16096 implements Runnable {
    public RunnableC0677(C0572 c0572, String str) {
        super(c0572);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0572 c0572 = this.f52046;
        c0572.m2708("211-Features supported by FTP Server\r\n");
        c0572.m2708(" UTF8\r\n");
        c0572.m2708(" MDTM\r\n");
        c0572.m2708(" MFMT\r\n");
        c0572.m2708(" MLST Type*;Size*;Modify*;Perm\r\n");
        c0572.m2708(" HASH MD5;SHA-1;SHA-256;SHA-384;SHA-512\r\n");
        c0572.m2708(" REST STREAM\r\n");
        c0572.m2708(" RANG STREAM\r\n");
        c0572.m2708("211 End\r\n");
    }
}
