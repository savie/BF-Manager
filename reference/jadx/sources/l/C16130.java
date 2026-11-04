package l;

import android.os.Handler;
import android.os.Trace;

/* JADX INFO: renamed from: l.ܶܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16130 extends AbstractC19895 {
    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // l.AbstractC19895
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19860 mo38289(C15648 c15648) {
        Trace.beginSection("createFfmpegVideoDecoder");
        Trace.endSection();
        return null;
    }

    public C16130(long j, Handler handler, InterfaceC4168 interfaceC4168, int i) {
        super(j, handler, interfaceC4168, i);
    }

    @Override // l.AbstractC19895
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17820 mo38288(String str, C15648 c15648, C15648 c15649) {
        boolean zEquals = C17359.equals(c15648.f50848, c15649.f50848);
        return new C17820(str, c15648, c15649, zEquals ? 3 : 0, zEquals ? 0 : 8);
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) {
        return C14442.m34863(0, 0, 0, 0);
    }
}
