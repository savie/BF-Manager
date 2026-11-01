package l;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.᩺֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes.dex */
public final class C22656 implements InterfaceC19083 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13108 f73803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11018 f73804 = new C11018();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13626 f73805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14895 f73806;

    public C22656(C14895 c14895, C13108 c13108, C13626 c13626) {
        this.f73806 = c14895;
        this.f73803 = c13108;
        this.f73805 = c13626;
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ܰ */
    public final void mo30475() {
        C11018 c11018 = this.f73804;
        c11018.writeInt(1382253411);
        c11018.m27784(this.f73806.f48666);
        this.f73803.m32413(c11018);
    }

    @Override // l.InterfaceC19083
    /* JADX INFO: renamed from: ۙ */
    public final void mo30474() {
        try {
            this.f73805.m33324();
            synchronized (this.f73806) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f73805.m33318().mo33976(false));
                try {
                    gZIPOutputStream.write(this.f73804.m27788(), 0, this.f73804.size());
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
            this.f73806.f48667.m42627((Throwable) e);
        }
    }
}
