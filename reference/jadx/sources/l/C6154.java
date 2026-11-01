package l;

import android.os.Handler;
import android.os.Trace;

/* JADX INFO: renamed from: l.ۛܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6154 extends AbstractC21167 {
    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // l.AbstractC21167
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10388 mo17158(C7648 c7648) {
        Trace.beginSection("createFfmpegVideoDecoder");
        Trace.endSection();
        return null;
    }

    public C6154(long j, Handler handler, InterfaceC11725 interfaceC11725, int i) {
        super(j, handler, interfaceC11725, i);
    }

    @Override // l.AbstractC21167
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17567 mo17157(String str, C7648 c7648, C7648 c7649) {
        boolean zEquals = C13638.equals(c7648.f25265, c7649.f25265);
        return new C17567(str, c7648, c7649, zEquals ? 3 : 0, zEquals ? 0 : 8);
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        return C13958.m33811(0, 0, 0, 0);
    }
}
