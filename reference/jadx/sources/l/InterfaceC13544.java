package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܰۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC13544 {
    void flush();

    /* JADX INFO: renamed from: ۖ */
    int mo30191();

    /* JADX INFO: renamed from: ۖ */
    ByteBuffer mo30192(int i);

    /* JADX INFO: renamed from: ۙ */
    int mo30193(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: ۙ */
    void mo30194();

    /* JADX INFO: renamed from: ۙ */
    void mo30195(int i);

    /* JADX INFO: renamed from: ۙ */
    void mo30196(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: ۙ */
    void mo30197(int i, long j);

    /* JADX INFO: renamed from: ۙ */
    void mo30198(int i, C8977 c8977, long j, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo30199(Bundle bundle);

    /* JADX INFO: renamed from: ۙ */
    void mo30200(Surface surface);

    /* JADX INFO: renamed from: ۙ */
    void mo30201(InterfaceC4370 interfaceC4370, Handler handler);

    /* JADX INFO: renamed from: ۙ */
    boolean mo30202(InterfaceC3146 interfaceC3146);

    /* JADX INFO: renamed from: ۨ */
    void mo30203();

    /* JADX INFO: renamed from: ۨ */
    void mo30204(int i);

    /* JADX INFO: renamed from: ܰ */
    MediaFormat mo30205();

    /* JADX INFO: renamed from: ܰ */
    ByteBuffer mo30206(int i);
}
