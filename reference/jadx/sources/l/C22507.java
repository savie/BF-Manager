package l;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩹᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22507 extends AbstractC9394 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final Context f73470;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "MidiRenderer";
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ۙ */
    public final C7648 mo24109(InterfaceC10388 interfaceC10388) {
        int i = C14041.f46158;
        return C17983.m41851(4, 2, 44100);
    }

    public C22507(Context context, Handler handler, InterfaceC8688 interfaceC8688, InterfaceC16449 interfaceC16449) {
        super(handler, interfaceC8688, interfaceC16449);
        this.f73470 = context.getApplicationContext();
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ۚ */
    public final int mo24111(C7648 c7648) {
        if (!"audio/x-exoplayer-midi".equals(c7648.f25265)) {
            return 0;
        }
        int i = C14041.f46158;
        return !m24108(C17983.m41851(4, 2, 44100)) ? 1 : 4;
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC10388 mo24113(C7648 c7648) {
        return new C14041(this.f73470);
    }
}
