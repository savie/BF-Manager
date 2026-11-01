package l;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8P3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18252 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f58246;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f58247;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58245 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ByteBuffer[] f58244 = new ByteBuffer[0];

    public C18252(AbstractC22433 abstractC22433) {
        this.f58247 = abstractC22433;
        C18958 c18958 = C18958.f61388;
        this.f58246 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18958 m42434(C18958 c18958) {
        if (c18958.equals(C18958.f61388)) {
            throw new C8375(c18958);
        }
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f58247;
            if (i >= abstractC22433.size()) {
                return c18958;
            }
            InterfaceC19664 interfaceC19664 = (InterfaceC19664) abstractC22433.get(i);
            C18958 c18958Mo26626 = interfaceC19664.mo26626(c18958);
            if (interfaceC19664.mo26629()) {
                C2023.m6510(!c18958Mo26626.equals(C18958.f61388));
                c18958 = c18958Mo26626;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42435() {
        ArrayList arrayList = this.f58245;
        arrayList.clear();
        this.f58246 = false;
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f58247;
            if (i >= abstractC22433.size()) {
                break;
            }
            InterfaceC19664 interfaceC19664 = (InterfaceC19664) abstractC22433.get(i);
            interfaceC19664.flush();
            if (interfaceC19664.mo26629()) {
                arrayList.add(interfaceC19664);
            }
            i++;
        }
        this.f58244 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m42431(); i2++) {
            this.f58244[i2] = ((InterfaceC19664) arrayList.get(i2)).mo26624();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m42433() {
        return !this.f58245.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42436(ByteBuffer byteBuffer) {
        if (!m42433() || this.f58246) {
            return;
        }
        m42432(byteBuffer);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m42439() {
        if (!m42433()) {
            return InterfaceC19664.f63118;
        }
        ByteBuffer byteBuffer = this.f58244[m42431()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m42432(InterfaceC19664.f63118);
        return this.f58244[m42431()];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m42437() {
        if (!m42433() || this.f58246) {
            return;
        }
        this.f58246 = true;
        ((InterfaceC19664) this.f58245.get(0)).mo26628();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42438() {
        return this.f58246 && ((InterfaceC19664) this.f58245.get(m42431())).mo26631() && !this.f58244[m42431()].hasRemaining();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m42440() {
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f58247;
            if (i < abstractC22433.size()) {
                InterfaceC19664 interfaceC19664 = (InterfaceC19664) abstractC22433.get(i);
                interfaceC19664.flush();
                interfaceC19664.reset();
                i++;
            } else {
                this.f58244 = new ByteBuffer[0];
                C18958 c18958 = C18958.f61388;
                this.f58246 = false;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18252)) {
            return false;
        }
        AbstractC22433 abstractC22433 = ((C18252) obj).f58247;
        AbstractC22433 abstractC22434 = this.f58247;
        if (abstractC22434.size() != abstractC22433.size()) {
            return false;
        }
        for (int i = 0; i < abstractC22434.size(); i++) {
            if (abstractC22434.get(i) != abstractC22433.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f58247.hashCode();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42432(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 0; i <= m42431(); i++) {
                if (!this.f58244[i].hasRemaining()) {
                    ArrayList arrayList = this.f58245;
                    InterfaceC19664 interfaceC19664 = (InterfaceC19664) arrayList.get(i);
                    if (interfaceC19664.mo26631()) {
                        if (!this.f58244[i].hasRemaining() && i < m42431()) {
                            ((InterfaceC19664) arrayList.get(i + 1)).mo26628();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.f58244[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : InterfaceC19664.f63118;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC19664.mo16317(byteBuffer2);
                        this.f58244[i] = interfaceC19664.mo26624();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f58244[i].hasRemaining();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m42431() {
        return this.f58244.length - 1;
    }
}
