package l;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: l.۟ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7927 extends AbstractC24205 {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Context f26349;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "MidiRenderer";
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ۙ */
    public final C15648 mo11269(InterfaceC19860 interfaceC19860) {
        int i = C14638.f47897;
        return C7116.m19497(4, 2, 44100);
    }

    public C7927(Context context, Handler handler, InterfaceC19729 interfaceC19729, InterfaceC16745 interfaceC16745) {
        super(handler, interfaceC19729, interfaceC16745);
        this.f26349 = context.getApplicationContext();
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11270(C15648 c15648) {
        if (!"audio/x-exoplayer-midi".equals(c15648.f50848)) {
            return 0;
        }
        int i = C14638.f47897;
        return !m54193(C7116.m19497(4, 2, 44100)) ? 1 : 4;
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19860 mo11271(C15648 c15648) {
        return new C14638(this.f26349);
    }
}
