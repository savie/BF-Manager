package l;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8P3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6854 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f22768;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22766 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteBuffer[] f22769 = new ByteBuffer[0];

    public C6854(AbstractC1928 abstractC1928) {
        this.f22768 = abstractC1928;
        C13565 c13565 = C13565.f43062;
        this.f22767 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13565 m19068(C13565 c13565) {
        if (c13565.equals(C13565.f43062)) {
            throw new C5120(c13565);
        }
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f22768;
            if (i >= abstractC1928.size()) {
                return c13565;
            }
            InterfaceC22274 interfaceC22274 = (InterfaceC22274) abstractC1928.get(i);
            C13565 c13565Mo37278 = interfaceC22274.mo37278(c13565);
            if (interfaceC22274.mo37280()) {
                C20782.m47568(!c13565Mo37278.equals(C13565.f43062));
                c13565 = c13565Mo37278;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19069() {
        ArrayList arrayList = this.f22766;
        arrayList.clear();
        this.f22767 = false;
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f22768;
            if (i >= abstractC1928.size()) {
                break;
            }
            InterfaceC22274 interfaceC22274 = (InterfaceC22274) abstractC1928.get(i);
            interfaceC22274.flush();
            if (interfaceC22274.mo37280()) {
                arrayList.add(interfaceC22274);
            }
            i++;
        }
        this.f22769 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m19066(); i2++) {
            this.f22769[i2] = ((InterfaceC22274) arrayList.get(i2)).mo37284();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19075() {
        return !this.f22766.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19070(ByteBuffer byteBuffer) {
        if (!m19075() || this.f22767) {
            return;
        }
        m19067(byteBuffer);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m19074() {
        if (!m19075()) {
            return InterfaceC22274.f72135;
        }
        ByteBuffer byteBuffer = this.f22769[m19066()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m19067(InterfaceC22274.f72135);
        return this.f22769[m19066()];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m19073() {
        if (!m19075() || this.f22767) {
            return;
        }
        this.f22767 = true;
        ((InterfaceC22274) this.f22766.get(0)).mo37281();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m19071() {
        return this.f22767 && ((InterfaceC22274) this.f22766.get(m19066())).mo37283() && !this.f22769[m19066()].hasRemaining();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m19072() {
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f22768;
            if (i < abstractC1928.size()) {
                InterfaceC22274 interfaceC22274 = (InterfaceC22274) abstractC1928.get(i);
                interfaceC22274.flush();
                interfaceC22274.reset();
                i++;
            } else {
                this.f22769 = new ByteBuffer[0];
                C13565 c13565 = C13565.f43062;
                this.f22767 = false;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6854)) {
            return false;
        }
        AbstractC1928 abstractC1928 = ((C6854) obj).f22768;
        AbstractC1928 abstractC1929 = this.f22768;
        if (abstractC1929.size() != abstractC1928.size()) {
            return false;
        }
        for (int i = 0; i < abstractC1929.size(); i++) {
            if (abstractC1929.get(i) != abstractC1928.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f22768.hashCode();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19067(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 0; i <= m19066(); i++) {
                if (!this.f22769[i].hasRemaining()) {
                    ArrayList arrayList = this.f22766;
                    InterfaceC22274 interfaceC22274 = (InterfaceC22274) arrayList.get(i);
                    if (interfaceC22274.mo37283()) {
                        if (!this.f22769[i].hasRemaining() && i < m19066()) {
                            ((InterfaceC22274) arrayList.get(i + 1)).mo37281();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.f22769[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : InterfaceC22274.f72135;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC22274.mo32890(byteBuffer2);
                        this.f22769[i] = interfaceC22274.mo37284();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f22769[i].hasRemaining();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m19066() {
        return this.f22769.length - 1;
    }
}
