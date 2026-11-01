package l;

/* JADX INFO: renamed from: l.᩷ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21010 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16072 f68403;

    public C21010(C16072 c16072) {
        this.f68403 = c16072;
    }

    public final void flush() {
        synchronized (this.f68403.f51982.f35622) {
            if (this.f68402) {
                throw new IllegalStateException("Recovery append batch is closed");
            }
            ((C15367) this.f68403.f51985).flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f68403.f51982.f35622) {
            if (this.f68402) {
                return;
            }
            this.f68402 = true;
            C16072 c16072 = this.f68403;
            int i = c16072.f51981 - 1;
            c16072.f51981 = i;
            if (i == 0) {
                try {
                    ((C15367) this.f68403.f51985).m36808();
                    if (this.f68403.f51970 != null) {
                        this.f68403.f51970.close();
                    }
                    this.f68403.f51970 = null;
                } catch (Throwable th) {
                    if (this.f68403.f51970 != null) {
                        this.f68403.f51970.close();
                    }
                    this.f68403.f51970 = null;
                    throw th;
                }
            } else {
                ((C15367) this.f68403.f51985).flush();
            }
        }
    }
}
