package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16488 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f52974;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f52975;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f52976;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f52977;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11018 f52978 = new C11018();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7625 f52979;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f52981;

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo30474() {
        if (this.f52980) {
            return;
        }
        try {
            try {
                if (!this.f52976) {
                    throw new IllegalStateException("Legacy save was not captured");
                }
                this.f52974.mo46720();
                byte[] bArrM41966 = C18019.m41966(this.f52978.size(), this.f52978.m27788());
                synchronized (this.f52975) {
                    this.f52974.m46703(bArrM41966);
                }
                this.f52980 = true;
                this.f52979.close();
            } catch (IOException e) {
                this.f52979.m20153(e);
                this.f52975.f16882.m2969((Throwable) e);
            } catch (Error e2) {
                e = e2;
                this.f52979.m20153(e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                this.f52979.m20153(e);
                throw e;
            }
        } catch (Throwable th) {
            this.f52980 = true;
            this.f52979.close();
            throw th;
        }
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ */
    public final synchronized void mo30475() {
        if (this.f52976 || this.f52980) {
            return;
        }
        try {
            this.f52978.writeInt(1382224737);
            C2063 c2063 = this.f52975.f66123;
            this.f52978.m27784(c2063 != null);
            if (c2063 != null) {
                c2063.m6570(this.f52978);
            }
            this.f52978.writeInt(1382224738);
            this.f52977.m16870(this.f52978, true);
            this.f52978.writeInt(1382224739);
            this.f52981.m46381(this.f52978);
            this.f52978.writeInt(1382224740);
            this.f52981.m46372(this.f52978);
            this.f52976 = true;
        } catch (Error | RuntimeException e) {
            this.f52980 = true;
            this.f52979.m20153(e);
            throw e;
        }
    }

    public C16488(C20409 c20409, C6111 c6111, C20556 c20556, C7625 c7625, AbstractC20745 abstractC20745) {
        this.f52975 = c20409;
        this.f52977 = c6111;
        this.f52981 = c20556;
        this.f52979 = c7625;
        this.f52974 = abstractC20745;
    }
}
