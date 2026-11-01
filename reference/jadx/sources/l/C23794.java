package l;

import android.os.Handler;
import android.os.Trace;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;

/* JADX INFO: renamed from: l.᩻ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23794 extends AbstractC9394 {
    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "FfmpegAudioRenderer";
    }

    @Override // l.AbstractC16862, l.InterfaceC2667
    /* JADX INFO: renamed from: ۠ */
    public final int mo8213() {
        return 8;
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC10388 mo24113(C7648 c7648) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = c7648.f25261;
        int i2 = c7648.f25260;
        int i3 = c7648.f25249;
        if (i == -1) {
            i = 5760;
        }
        boolean zEquals = true;
        if (m24108(C17983.m41851(2, i3, i2))) {
            zEquals = m24112(C17983.m41851(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(c7648.f25265);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, c7648, zEquals);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ۙ */
    public final C7648 mo24109(InterfaceC10388 interfaceC10388) {
        FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) interfaceC10388;
        ffmpegAudioDecoder.getClass();
        C10471 c10471 = new C10471();
        c10471.m26533("audio/raw");
        c10471.m26494(ffmpegAudioDecoder.m17());
        c10471.m26511(ffmpegAudioDecoder.m16());
        c10471.m26512(ffmpegAudioDecoder.m10());
        return c10471.m26497();
    }

    public C23794() {
        C3892 c3892 = new C3892(C16737.m39277());
        c3892.m11325(new InterfaceC19664[0]);
        this(null, null, c3892.m11324());
    }

    public C23794(Handler handler, InterfaceC8688 interfaceC8688, InterfaceC16449 interfaceC16449) {
        super(handler, interfaceC8688, interfaceC16449);
    }

    @Override // l.AbstractC9394
    /* JADX INFO: renamed from: ۚ */
    public final int mo24111(C7648 c7648) {
        String str = c7648.f25265;
        int i = c7648.f25260;
        int i2 = c7648.f25249;
        str.getClass();
        if (!FfmpegLibrary.m20() || !C6632.m17975(str)) {
            return 0;
        }
        if (!FfmpegLibrary.m22(c7648)) {
            return 1;
        }
        if (m24108(C17983.m41851(2, i2, i)) || m24108(C17983.m41851(4, i2, i))) {
            return c7648.f25245 != 0 ? 2 : 4;
        }
        return 1;
    }
}
