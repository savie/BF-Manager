package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37DX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3185 f61223;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f61224;

    /* JADX INFO: renamed from: ᩷ */
    public int mo14099() {
        return 1;
    }

    public AbstractC18847(EnumC3185 enumC3185, Object obj) {
        this.f61223 = enumC3185;
        this.f61224 = obj;
    }

    public int hashCode() {
        Object obj = this.f61224;
        return this.f61223.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC18847)) {
            return false;
        }
        AbstractC18847 abstractC18847 = (AbstractC18847) obj;
        return this.f61224.equals(abstractC18847.f61224) && this.f61223 == abstractC18847.f61223;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo5226(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC18847)) {
            return false;
        }
        AbstractC18847 abstractC18847 = (AbstractC18847) obj;
        EnumC3185 enumC3185 = abstractC18847.f61223;
        Object obj2 = this.f61224;
        boolean z = obj2 instanceof C7660;
        EnumC3185 enumC3186 = this.f61223;
        if (!z) {
            return obj2.equals(abstractC18847.f61224) && enumC3186 == enumC3185;
        }
        Object obj3 = abstractC18847.f61224;
        return (obj3 instanceof C7660) && ((C7660) obj2).m20872(obj3) && enumC3186 == enumC3185;
    }

    public String toString() {
        return C3188.m10404("[", this.f61223.toString(), " : '", mo27553(), "']");
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo27553() {
        Object obj = this.f61224;
        return obj == null ? "?" : obj.toString();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3026(InterfaceC9397 interfaceC9397) throws IOException {
        ((C11388) interfaceC9397).m28735((int) this.f61223.m10401());
    }
}
