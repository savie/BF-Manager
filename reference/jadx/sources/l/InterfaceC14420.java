package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܰۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC14420 {
    void flush();

    /* JADX INFO: renamed from: ۙ */
    int mo32280(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: ۙ */
    void mo32281();

    /* JADX INFO: renamed from: ۙ */
    void mo32282(int i);

    /* JADX INFO: renamed from: ۙ */
    void mo32283(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: ۙ */
    void mo32284(int i, long j);

    /* JADX INFO: renamed from: ۙ */
    void mo32285(int i, C22844 c22844, long j, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo32286(Bundle bundle);

    /* JADX INFO: renamed from: ۙ */
    void mo32287(Surface surface);

    /* JADX INFO: renamed from: ۙ */
    void mo32288(InterfaceC3980 interfaceC3980, Handler handler);

    /* JADX INFO: renamed from: ۙ */
    boolean mo32289(InterfaceC24118 interfaceC24118);

    /* JADX INFO: renamed from: ۤ */
    void mo32290();

    /* JADX INFO: renamed from: ۤ */
    void mo32291(int i);

    /* JADX INFO: renamed from: ᩷ */
    MediaFormat mo32292();

    /* JADX INFO: renamed from: ᩷ */
    ByteBuffer mo32293(int i);

    /* JADX INFO: renamed from: ᩸ */
    int mo32294();

    /* JADX INFO: renamed from: ᩸ */
    ByteBuffer mo32295(int i);
}
