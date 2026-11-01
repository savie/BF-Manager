package l;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.m.y.q;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ܰ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14041 extends AbstractC12505 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f46158 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f46159;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Context f46160;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11893 f46161;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19344 f46162;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3403 f46163;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double[] f46164;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f46165;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15111 f46166;

    @Override // l.InterfaceC10388
    public final String getName() {
        return "MidiDecoder";
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo13(C16033 c16033, AbstractC0509 abstractC0509, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC0509;
        ByteBuffer byteBuffer = c16033.f51912;
        byteBuffer.getClass();
        if (z) {
            this.f46165 = -9223372036854775807L;
            try {
                this.f46163.m10092();
                this.f46162.m44342().m36891();
                m33960();
            } catch (C11924 e) {
                return e;
            }
        }
        if (this.f46165 == -9223372036854775807L) {
            this.f46159 = c16033.f51910;
        }
        boolean zM31062 = m31062(c16033.f51910);
        if (zM31062) {
            try {
                long j = this.f46165;
                if (j != -9223372036854775807L) {
                    this.f46163.m10101((c16033.f51910 - j) * 1.0E-6d);
                }
                this.f46165 = c16033.f51910;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.f46161.m29657(byteBuffer.position(), byteBuffer.remaining(), byteBuffer.array());
        }
        int iM36195 = this.f46166.m36195();
        C2023.m6510(zM31062 || iM36195 == 0);
        if (iM36195 > this.f46164.length) {
            this.f46164 = new double[(iM36195 * q.h) / 100];
        }
        int iM36196 = 0;
        while (iM36196 < iM36195) {
            iM36196 += this.f46166.m36196(this.f46164, iM36196, iM36195 - iM36196);
        }
        simpleDecoderOutputBuffer.m6(iM36196 * 4, this.f46159);
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        for (int i = 0; i < iM36196; i++) {
            byteBuffer2.putFloat((float) this.f46164[i]);
        }
        byteBuffer2.flip();
        this.f46159 = (((((long) iM36196) * 1000000) / 2) / 44100) + this.f46159;
        return null;
    }

    static {
        C11572.m28868("media3.decoder.midi");
    }

    @EnsuresNonNull({"synth", "multiSynth", "reader", "midiSynthesizer"})
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m33960() {
        C3403 c3403 = new C3403();
        this.f46163 = c3403;
        c3403.m10090();
        C19344 c19344 = new C19344();
        this.f46162 = c19344;
        C3403 c3404 = this.f46163;
        Context context = this.f46160;
        context.getClass();
        c19344.m44346(c3404, C13335.m32844(context));
        this.f46161 = new C11893(this.f46162);
        this.f46166 = new C15111(this.f46163);
        this.f46162.m44342().m47472(0, this.f46166.m36197(), 0);
        this.f46162.m44342().m47472(0, this.f46166.m36197(), 1);
        this.f46163.m10099();
    }

    public C14041(Context context) {
        super(new C16033[16], new SimpleDecoderOutputBuffer[16]);
        this.f46160 = context;
        this.f46164 = new double[8820];
        this.f46165 = -9223372036854775807L;
        m33960();
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۖ */
    public final C16033 mo11() {
        return new C16033(1, 0);
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC0509 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC20266() { // from class: l.ۙ᩶ۙ
            @Override // l.InterfaceC20266
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo13561(AbstractC0509 abstractC0509) {
                this.f17118.m31060((AbstractC0509) ((SimpleDecoderOutputBuffer) abstractC0509));
            }
        });
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo12(Throwable th) {
        return new C11924("Unexpected decode error", th);
    }

    @Override // l.AbstractC12505, l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ */
    public final void mo14() {
        this.f46163.m10092();
        super.mo14();
    }
}
