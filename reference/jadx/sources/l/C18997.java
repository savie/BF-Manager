package l;

/* JADX INFO: renamed from: l.ᩳۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18997 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f61547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10046 f61548;

    public C18997(C10046 c10046) {
        this.f61548 = c10046;
    }

    public final void flush() {
        synchronized (this.f61548.f32208.f1856) {
            if (this.f61547) {
                throw new IllegalStateException("Recovery append batch is closed");
            }
            ((C12284) this.f61548.f32215).flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f61548.f32208.f1856) {
            if (this.f61547) {
                return;
            }
            this.f61547 = true;
            C10046 c10046 = this.f61548;
            int i = c10046.f32219 - 1;
            c10046.f32219 = i;
            if (i == 0) {
                try {
                    ((C12284) this.f61548.f32215).m30676();
                    if (this.f61548.f32220 != null) {
                        this.f61548.f32220.close();
                    }
                    this.f61548.f32220 = null;
                } catch (Throwable th) {
                    if (this.f61548.f32220 != null) {
                        this.f61548.f32220.close();
                    }
                    this.f61548.f32220 = null;
                    throw th;
                }
            } else {
                ((C12284) this.f61548.f32215).flush();
            }
        }
    }
}
