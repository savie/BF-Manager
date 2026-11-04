package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22366 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6178 f72407 = new C6178();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f72408;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9378 f72409;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f72410;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f72411;

    public C22366(C25350 c25350, C24132 c24132, C23582 c23582, C9378 c9378) {
        this.f72410 = c25350;
        this.f72408 = c24132;
        this.f72411 = c23582;
        this.f72409 = c9378;
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34769() {
        C6178 c6178 = this.f72407;
        c6178.writeInt(1382253410);
        C25350 c25350 = this.f72410;
        c6178.writeInt(c25350.f81831.m29987(c25350.m56683()));
        c6178.writeInt(1382253410);
        this.f72408.m53910(c6178, true);
        c6178.writeInt(1382253410);
        C23582 c23582 = this.f72411;
        c23582.m52823(c6178);
        c6178.writeInt(1382253410);
        c23582.m52809(c6178);
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ */
    public final void mo34768() {
        try {
            this.f72409.m24701();
            byte[] bArrM37704 = C15768.m37704(this.f72407.size(), this.f72407.m17808());
            synchronized (this.f72410) {
                this.f72409.m24696(bArrM37704);
            }
        } catch (IOException e) {
            this.f72410.f81835.m51299(e);
        }
    }
}
