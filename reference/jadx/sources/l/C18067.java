package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18067 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6178 f59141 = new C6178();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f59142;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9378 f59143;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0168 f59144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f59145;

    public C18067(C0168 c0168, C24132 c24132, C23582 c23582, C9378 c9378) {
        this.f59144 = c0168;
        this.f59142 = c24132;
        this.f59145 = c23582;
        this.f59143 = c9378;
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34769() {
        C6178 c6178 = this.f59141;
        c6178.writeInt(1382253410);
        C0168 c0168 = this.f59144;
        c6178.writeByte(c0168.f1216);
        c6178.m17789(c0168.f1210);
        c6178.writeInt(1382253410);
        this.f59142.m53910(c6178, true);
        c6178.writeInt(1382253410);
        C23582 c23582 = this.f59145;
        c23582.m52823(c6178);
        c6178.writeInt(1382253410);
        c23582.m52809(c6178);
        AbstractC21775 abstractC21775M14430 = c0168.f1213.m14430();
        if (abstractC21775M14430 instanceof C4883) {
            c6178.writeInt(1382256833);
            c6178.m17786((CharSequence) ((C4883) abstractC21775M14430).m14986().mo30929());
        }
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ */
    public final void mo34768() {
        try {
            this.f59143.m24701();
            byte[] bArrM37704 = C15768.m37704(this.f59141.size(), this.f59141.m17808());
            synchronized (this.f59144) {
                this.f59143.m24696(bArrM37704);
            }
        } catch (IOException e) {
            this.f59144.f1223.m51299(e);
        }
    }
}
