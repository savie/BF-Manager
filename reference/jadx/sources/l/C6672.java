package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public class C6672 extends AbstractC18847 {
    public C6672() {
        throw null;
    }

    @Override // l.AbstractC18847
    public final String toString() {
        return C3188.m10404("[", this.f61223.toString(), " ", ((C7660) this.f61224).toString(), "]");
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public final void mo3026(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo3026(interfaceC9397);
        ((C7660) this.f61224).mo1599(interfaceC9397);
    }

    @Override // l.AbstractC18847
    public final int hashCode() {
        Object obj = this.f61224;
        return this.f61223.hashCode() + ((obj != null ? ((C7660) obj).hashCode() : 0) * 31);
    }

    @Override // l.AbstractC18847
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6672)) {
            return false;
        }
        C6672 c6672 = (C6672) obj;
        return C17359.equals(this.f61224, c6672.f61224) && this.f61223 == c6672.f61223;
    }
}
