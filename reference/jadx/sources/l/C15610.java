package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܺ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7YI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15610 extends C17020 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f50749 = new byte[0];

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ᩴ */
    public final void mo12936() throws C5813 {
        C3073 c3073M20728 = m20728();
        try {
            m39788();
            new C16480(this.f50749).mo1688(c3073M20728, this);
            if (this.f25826.f26044 != null) {
                ThreadFactoryC23536 threadFactoryC23536M9227 = c3073M20728.m9227();
                Runnable runnable = new Runnable() { // from class: l.᩷֨ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66546.mo19047();
                    }
                };
                threadFactoryC23536M9227.getClass();
                Thread thread = new Thread(runnable);
                this.f25824 = thread;
                thread.setName("Exec thread " + c3073M20728.f11611);
                this.f25824.start();
            }
        } catch (Exception e) {
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
            throw new C5813("ChannelExec", e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m37279() {
        byte[] bArr = C8491.f29422;
        this.f50749 = "echo '===SYSTEM_TYPE==='; uname -s; echo '===USER_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Users UniqueID; else cat /etc/passwd; fi; echo '===GROUP_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Groups PrimaryGroupID; else cat /etc/group; fi".getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC7848
    /* JADX INFO: renamed from: ۬ */
    public final void mo12933() {
        C7930 c7930 = this.f25826;
        m20728();
        c7930.f26044 = null;
        C7930 c7931 = this.f25826;
        m20728();
        c7931.f26045 = null;
    }
}
