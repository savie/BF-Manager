package l;

import android.os.Handler;
import android.os.Trace;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;

/* JADX INFO: renamed from: l.ۗܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3452 extends AbstractC24205 {
    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "FfmpegAudioRenderer";
    }

    @Override // l.AbstractC25280, l.InterfaceC18172
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int mo11268() {
        return 8;
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19860 mo11271(C15648 c15648) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = c15648.f50824;
        int i2 = c15648.f50829;
        int i3 = c15648.f50843;
        if (i == -1) {
            i = 5760;
        }
        boolean zEquals = true;
        if (m54193(C7116.m19497(2, i3, i2))) {
            zEquals = m54192(C7116.m19497(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(c15648.f50848);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, c15648, zEquals);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 mo11269(InterfaceC19860 interfaceC19860) {
        FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) interfaceC19860;
        ffmpegAudioDecoder.getClass();
        C20124 c20124 = new C20124();
        c20124.m46315("audio/raw");
        c20124.m46329(ffmpegAudioDecoder.m15());
        c20124.m46332(ffmpegAudioDecoder.m13());
        c20124.m46293(ffmpegAudioDecoder.m14());
        return c20124.m46295();
    }

    public C3452() {
        C9286 c9286 = new C9286(C21576.m49084());
        c9286.m24498(new InterfaceC22274[0]);
        this(null, null, c9286.m24497());
    }

    public C3452(Handler handler, InterfaceC19729 interfaceC19729, InterfaceC16745 interfaceC16745) {
        super(handler, interfaceC19729, interfaceC16745);
    }

    @Override // l.AbstractC24205
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo11270(C15648 c15648) {
        String str = c15648.f50848;
        int i = c15648.f50829;
        int i2 = c15648.f50843;
        str.getClass();
        if (!FfmpegLibrary.m21() || !C9681.m25258(str)) {
            return 0;
        }
        if (!FfmpegLibrary.m23(c15648)) {
            return 1;
        }
        if (m54193(C7116.m19497(2, i2, i)) || m54193(C7116.m19497(4, i2, i))) {
            return c15648.f50813 != 0 ? 2 : 4;
        }
        return 1;
    }
}
