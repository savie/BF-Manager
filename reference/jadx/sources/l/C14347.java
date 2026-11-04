package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14347 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45246;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24394 f45247;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6178 f45248 = new C6178();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f45249;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f45250;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f45251;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f45252;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f45253;

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo34768() {
        if (this.f45252) {
            return;
        }
        try {
            try {
                if (!this.f45246) {
                    throw new IllegalStateException("Legacy save was not captured");
                }
                this.f45249.mo49834();
                byte[] bArrM37704 = C15768.m37704(this.f45248.size(), this.f45248.m17808());
                synchronized (this.f45253) {
                    this.f45249.m49849(bArrM37704);
                }
                this.f45252 = true;
                this.f45247.close();
            } catch (IOException e) {
                this.f45247.m54531(e);
                this.f45253.f23989.m4466(e);
            } catch (Error e2) {
                e = e2;
                this.f45247.m54531(e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                this.f45247.m54531(e);
                throw e;
            }
        } catch (Throwable th) {
            this.f45252 = true;
            this.f45247.close();
            throw th;
        }
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void mo34769() {
        if (this.f45246 || this.f45252) {
            return;
        }
        try {
            this.f45248.writeInt(1382224737);
            C23056 c23056 = this.f45253.f26391;
            this.f45248.m17789(c23056 != null);
            if (c23056 != null) {
                c23056.m51961(this.f45248);
            }
            this.f45248.writeInt(1382224738);
            this.f45251.m53910(this.f45248, true);
            this.f45248.writeInt(1382224739);
            this.f45250.m52823(this.f45248);
            this.f45248.writeInt(1382224740);
            this.f45250.m52809(this.f45248);
            this.f45246 = true;
        } catch (Error | RuntimeException e) {
            this.f45252 = true;
            this.f45247.m54531(e);
            throw e;
        }
    }

    public C14347(C7941 c7941, C24132 c24132, C23582 c23582, C24394 c24394, AbstractC22044 abstractC22044) {
        this.f45253 = c7941;
        this.f45251 = c24132;
        this.f45250 = c23582;
        this.f45247 = c24394;
        this.f45249 = abstractC22044;
    }
}
