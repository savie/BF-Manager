package l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17657 implements InterfaceC7897 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17592 f58037;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f58038;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13117 f58039;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Executor f58040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f58041;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f58042;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f58043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC21322 f58044;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Surface f58045;

    @Override // l.InterfaceC7897
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4505() {
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4517(C15648 c15648) {
        return true;
    }

    public C17657(C13117 c13117, InterfaceC14814 interfaceC14814) {
        this.f58039 = c13117;
        c13117.m32583(interfaceC14814);
        this.f58037 = new C17592(new C16911(this), c13117);
        this.f58042 = new ArrayDeque();
        this.f58038 = new C20124().m46295();
        this.f58043 = -9223372036854775807L;
        this.f58044 = InterfaceC21322.f67932;
        this.f58040 = new ExecutorC15419();
        this.f58041 = new C13182();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۧ */
    public final void mo4522() {
        this.f58039.m32585();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ֫ */
    public final void mo4504() {
        this.f58039.m32591();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4515(InterfaceC21322 interfaceC21322, Executor executor) {
        this.f58044 = interfaceC21322;
        this.f58040 = executor;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩸ */
    public final void mo4528() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4526(boolean z) {
        if (z) {
            this.f58039.m32586();
        }
        this.f58037.m41249();
        this.f58042.clear();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4518(boolean z) {
        return this.f58039.m32584(z);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۫ */
    public final void mo4523() {
        this.f58037.m41254();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4527() {
        return this.f58037.m41255();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩴ */
    public final Surface mo4525() {
        Surface surface = this.f58045;
        C20782.m47566(surface);
        return surface;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4514(InterfaceC19830 interfaceC19830) {
        this.f58041 = interfaceC19830;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4506(float f) {
        this.f58039.m32587(f);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4511(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4508(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4510(Surface surface, C18303 c18303) {
        this.f58045 = surface;
        this.f58039.m32582(surface);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩻ */
    public final void mo4529() {
        this.f58045 = null;
        this.f58039.m32582((Surface) null);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4507(int i) {
        this.f58039.m32588(i);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4512(C15648 c15648, long j, int i, List list) {
        C20782.m47568(list.isEmpty());
        int i2 = c15648.f50814;
        int i3 = c15648.f50852;
        C15648 c15649 = this.f58038;
        int i4 = c15649.f50814;
        C17592 c17592 = this.f58037;
        if (i2 != i4 || i3 != c15649.f50852) {
            c17592.m41250(i2, i3);
        }
        float f = c15648.f50845;
        if (f != this.f58038.f50845) {
            this.f58039.m32580(f);
        }
        this.f58038 = c15648;
        if (j != this.f58043) {
            c17592.m41251(i, j);
            this.f58043 = j;
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۚ */
    public final void mo4519() {
        this.f58039.m32579();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4516(long j, InterfaceC18338 interfaceC18338) {
        this.f58042.add(interfaceC18338);
        this.f58037.m41252(j);
        this.f58040.execute(new Runnable() { // from class: l.ۚܳ᩷
            @Override // java.lang.Runnable
            public final void run() {
                this.f19734.f58044.mo26315();
            }
        });
        return true;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ */
    public final void mo4509(long j, long j2) {
        try {
            this.f58037.m41253(j, j2);
        } catch (C18566 e) {
            throw new C0439(e, this.f58038);
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۤ */
    public final void mo4521(boolean z) {
        this.f58039.m32589(z);
    }
}
