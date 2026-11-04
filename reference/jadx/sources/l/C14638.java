package l;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import com.alipay.sdk.m.y.q;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ܰܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14638 extends AbstractC16876 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47897 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Context f47898;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C7782 f47899;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2561 f47900;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20221 f47901;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15745 f47902;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f47903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double[] f47904;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f47905;

    @Override // l.InterfaceC19860
    public final String getName() {
        return "MidiDecoder";
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo11(C5690 c5690, AbstractC11655 abstractC11655, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC11655;
        ByteBuffer byteBuffer = c5690.f19651;
        byteBuffer.getClass();
        if (z) {
            this.f47903 = -9223372036854775807L;
            try {
                this.f47902.m37652();
                this.f47900.m8598().m20607();
                m35271();
            } catch (C21352 e) {
                return e;
            }
        }
        if (this.f47903 == -9223372036854775807L) {
            this.f47905 = c5690.f19652;
        }
        boolean zM39838 = m39838(c5690.f19652);
        if (zM39838) {
            try {
                long j = this.f47903;
                if (j != -9223372036854775807L) {
                    this.f47902.m37663((c5690.f19652 - j) * 1.0E-6d);
                }
                this.f47903 = c5690.f19652;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.f47901.m46486(byteBuffer.position(), byteBuffer.remaining(), byteBuffer.array());
        }
        int iM21172 = this.f47899.m21172();
        C20782.m47568(zM39838 || iM21172 == 0);
        if (iM21172 > this.f47904.length) {
            this.f47904 = new double[(iM21172 * q.h) / 100];
        }
        int iM21173 = 0;
        while (iM21173 < iM21172) {
            iM21173 += this.f47899.m21173(this.f47904, iM21173, iM21172 - iM21173);
        }
        simpleDecoderOutputBuffer.m6(iM21173 * 4, this.f47905);
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        for (int i = 0; i < iM21173; i++) {
            byteBuffer2.putFloat((float) this.f47904[i]);
        }
        byteBuffer2.flip();
        this.f47905 = (((((long) iM21173) * 1000000) / 2) / 44100) + this.f47905;
        return null;
    }

    static {
        C21616.m49139("media3.decoder.midi");
    }

    @EnsuresNonNull({"synth", "multiSynth", "reader", "midiSynthesizer"})
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m35271() {
        C15745 c15745 = new C15745();
        this.f47902 = c15745;
        c15745.m37659();
        C2561 c2561 = new C2561();
        this.f47900 = c2561;
        C15745 c15746 = this.f47902;
        Context context = this.f47898;
        context.getClass();
        c2561.m8602(c15746, C10163.m26277(context));
        this.f47901 = new C20221(this.f47900);
        this.f47899 = new C7782(this.f47902);
        this.f47900.m8598().m14825(0, this.f47899.m21174(), 0);
        this.f47900.m8598().m14825(0, this.f47899.m21174(), 1);
        this.f47902.m37657();
    }

    public C14638(Context context) {
        super(new C5690[16], new SimpleDecoderOutputBuffer[16]);
        this.f47898 = context;
        this.f47904 = new double[8820];
        this.f47903 = -9223372036854775807L;
        m35271();
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩸ */
    public final C5690 mo17() {
        return new C5690(1, 0);
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC11655 mo16() {
        return new SimpleDecoderOutputBuffer(new InterfaceC1961() { // from class: l.ۘܰۙ
            @Override // l.InterfaceC1961
            /* JADX INFO: renamed from: ۙ */
            public final void mo6746(AbstractC11655 abstractC11655) {
                this.f15346.m39836((AbstractC11655) ((SimpleDecoderOutputBuffer) abstractC11655));
            }
        });
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo10(Throwable th) {
        return new C21352("Unexpected decode error", th);
    }

    @Override // l.AbstractC16876, l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ */
    public final void mo12() {
        this.f47902.m37652();
        super.mo12();
    }
}
