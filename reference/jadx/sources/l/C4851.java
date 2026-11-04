package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public class C4851 extends AbstractC18847 {
    public C4851() {
        throw null;
    }

    public C4851(EnumC3185 enumC3185, C7660 c7660, C7660 c7661) {
        super(enumC3185, new C18941(c7660, c7661));
    }

    @Override // l.AbstractC18847
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4851)) {
            return false;
        }
        C4851 c4851 = (C4851) obj;
        return this.f61223 == c4851.f61223 && ((C7660) ((C18941) this.f61224).f61428).equals(((C18941) c4851.f61224).f61428) && ((C7660) ((C18941) this.f61224).f61429).equals(((C18941) c4851.f61224).f61429);
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5226(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4851)) {
            return false;
        }
        C4851 c4851 = (C4851) obj;
        return this.f61223 == c4851.f61223 && ((C7660) ((C18941) this.f61224).f61428).m20872(((C18941) c4851.f61224).f61428) && ((C7660) ((C18941) this.f61224).f61429).m20872(((C18941) c4851.f61224).f61429);
    }

    @Override // l.AbstractC18847
    public final String toString() {
        return this.f61223.toString() + "[" + ((C7660) ((C18941) this.f61224).f61428).toString() + "," + ((C7660) ((C18941) this.f61224).f61429).toString() + "]";
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public void mo3026(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo3026(interfaceC9397);
        if (this.f61223 == EnumC3185.f10370) {
            ((C11388) interfaceC9397).m28735(((C7660) ((C18941) this.f61224).f61428).f67820);
        } else {
            ((C11388) interfaceC9397).m28740(((C7660) ((C18941) this.f61224).f61428).f67820);
        }
        ((C11388) interfaceC9397).m28740(((C7660) ((C18941) this.f61224).f61429).f67820);
    }
}
