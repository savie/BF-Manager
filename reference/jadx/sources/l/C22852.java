package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7YI */
/* JADX INFO: loaded from: classes.dex */
public final class C22852 extends C1969 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f74234 = new byte[0];

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ᩹ */
    public final void mo13415() throws C2079 {
        C15723 c15723M22542 = m22542();
        try {
            m6776();
            new C19453(this.f74234).mo15880(c15723M22542, this);
            if (this.f27476.f29002 != null) {
                ThreadFactoryC11248 threadFactoryC11248M37621 = c15723M22542.m37621();
                Runnable runnable = new Runnable() { // from class: l.ۤܰܶ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34546.mo6777();
                    }
                };
                threadFactoryC11248M37621.getClass();
                Thread thread = new Thread(runnable);
                this.f27481 = thread;
                thread.setName("Exec thread " + c15723M22542.f51092);
                this.f27481.start();
            }
        } catch (Exception e) {
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            throw new C2079("ChannelExec", e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m51566() {
        byte[] bArr = C9011.f29358;
        this.f74234 = "echo '===SYSTEM_TYPE==='; uname -s; echo '===USER_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Users UniqueID; else cat /etc/passwd; fi; echo '===GROUP_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Groups PrimaryGroupID; else cat /etc/group; fi".getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC8375
    /* JADX INFO: renamed from: ۚ */
    public final void mo13414() {
        C8878 c8878 = this.f27476;
        m22542();
        c8878.f29002 = null;
        C8878 c8879 = this.f27476;
        m22542();
        c8879.f29003 = null;
    }
}
