package l;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.᩷ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes.dex */
public final class C21797 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6178 f69498 = new C6178();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9378 f69499;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10608 f69500;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17502 f69501;

    public C21797(C10608 c10608, C17502 c17502, C9378 c9378) {
        this.f69500 = c10608;
        this.f69501 = c17502;
        this.f69499 = c9378;
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34769() {
        C6178 c6178 = this.f69498;
        c6178.writeInt(1382253411);
        c6178.m17789(this.f69500.f33680);
        this.f69501.m41041(c6178);
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ */
    public final void mo34768() {
        try {
            this.f69499.m24701();
            synchronized (this.f69500) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f69499.m24699().mo4289(false));
                try {
                    gZIPOutputStream.write(this.f69498.m17808(), 0, this.f69498.size());
                    gZIPOutputStream.close();
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            this.f69500.f33686.m51299(e);
        }
    }
}
