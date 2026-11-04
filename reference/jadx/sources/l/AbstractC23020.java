package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.᩸᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98I4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23020 implements InterfaceC22274 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13565 f74704;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13565 f74705;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13565 f74706;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f74707;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13565 f74708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ByteBuffer f74709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f74710;

    /* JADX INFO: renamed from: ۚ */
    public void mo40469() {
    }

    /* JADX INFO: renamed from: ۫ */
    public void mo40470() {
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo40471() {
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract C13565 mo32891(C13565 c13565);

    public AbstractC23020() {
        ByteBuffer byteBuffer = InterfaceC22274.f72135;
        this.f74709 = byteBuffer;
        this.f74707 = byteBuffer;
        C13565 c13565 = C13565.f43062;
        this.f74706 = c13565;
        this.f74704 = c13565;
        this.f74705 = c13565;
        this.f74708 = c13565;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final C13565 mo37278(C13565 c13565) {
        this.f74706 = c13565;
        this.f74704 = mo32891(c13565);
        return mo37280() ? this.f74704 : C13565.f43062;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۤ */
    public boolean mo37280() {
        return this.f74704 != C13565.f43062;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩴ */
    public final void mo37281() {
        this.f74710 = true;
        mo40470();
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩸ */
    public ByteBuffer mo37284() {
        ByteBuffer byteBuffer = this.f74707;
        this.f74707 = InterfaceC22274.f72135;
        return byteBuffer;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo37283() {
        return this.f74710 && this.f74707 == InterfaceC22274.f72135;
    }

    @Override // l.InterfaceC22274
    public final void flush() {
        this.f74707 = InterfaceC22274.f72135;
        this.f74710 = false;
        this.f74705 = this.f74706;
        this.f74708 = this.f74704;
        mo40471();
    }

    @Override // l.InterfaceC22274
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC22274.f72135;
        this.f74707 = byteBuffer;
        this.f74710 = false;
        this.f74709 = byteBuffer;
        C13565 c13565 = C13565.f43062;
        this.f74706 = c13565;
        this.f74704 = c13565;
        this.f74705 = c13565;
        this.f74708 = c13565;
        mo40469();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m51915(int i) {
        if (this.f74709.capacity() < i) {
            this.f74709 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f74709.clear();
        }
        ByteBuffer byteBuffer = this.f74709;
        this.f74707 = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51916() {
        return this.f74707.hasRemaining();
    }
}
