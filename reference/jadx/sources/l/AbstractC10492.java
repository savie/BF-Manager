package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۤ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98I4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10492 implements InterfaceC19664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18958 f35947;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f35948;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18958 f35949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18958 f35950;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18958 f35951;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f35952;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ByteBuffer f35953;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo26623() {
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void mo26630() {
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract C18958 mo16318(C18958 c18958);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo26632() {
    }

    public AbstractC10492() {
        ByteBuffer byteBuffer = InterfaceC19664.f63118;
        this.f35952 = byteBuffer;
        this.f35953 = byteBuffer;
        C18958 c18958 = C18958.f61388;
        this.f35947 = c18958;
        this.f35951 = c18958;
        this.f35950 = c18958;
        this.f35949 = c18958;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18958 mo26626(C18958 c18958) {
        this.f35947 = c18958;
        this.f35951 = mo16318(c18958);
        return mo26629() ? this.f35951 : C18958.f61388;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo26629() {
        return this.f35951 != C18958.f61388;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo26628() {
        this.f35948 = true;
        mo26623();
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ByteBuffer mo26624() {
        ByteBuffer byteBuffer = this.f35953;
        this.f35953 = InterfaceC19664.f63118;
        return byteBuffer;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo26631() {
        return this.f35948 && this.f35953 == InterfaceC19664.f63118;
    }

    @Override // l.InterfaceC19664
    public final void flush() {
        this.f35953 = InterfaceC19664.f63118;
        this.f35948 = false;
        this.f35950 = this.f35947;
        this.f35949 = this.f35951;
        mo26632();
    }

    @Override // l.InterfaceC19664
    public final void reset() {
        ByteBuffer byteBuffer = InterfaceC19664.f63118;
        this.f35953 = byteBuffer;
        this.f35948 = false;
        this.f35952 = byteBuffer;
        C18958 c18958 = C18958.f61388;
        this.f35947 = c18958;
        this.f35951 = c18958;
        this.f35950 = c18958;
        this.f35949 = c18958;
        mo26630();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m26625(int i) {
        if (this.f35952.capacity() < i) {
            this.f35952 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f35952.clear();
        }
        ByteBuffer byteBuffer = this.f35952;
        this.f35953 = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26627() {
        return this.f35953.hasRemaining();
    }
}
