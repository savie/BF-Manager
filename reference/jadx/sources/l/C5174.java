package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5174 implements InterfaceC6908 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC6908 f18070;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f18071;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f18072 = new Object();

    public C5174(InterfaceC6908 interfaceC6908) {
        this.f18070 = interfaceC6908;
    }

    @Override // l.InterfaceC6908
    public final Object get() {
        if (this.f18070 != null) {
            synchronized (this.f18072) {
                if (this.f18070 != null) {
                    Object obj = this.f18070.get();
                    this.f18071 = obj;
                    this.f18070 = null;
                    return obj;
                }
            }
        }
        return this.f18071;
    }

    public final String toString() {
        Object obj = this.f18070;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f18071 + ">";
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
