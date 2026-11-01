package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9838 implements InterfaceC23949 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C2075 f33616 = new C2075();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f33617;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC23949 f33618;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f33619 = new Object();

    public C9838(InterfaceC23949 interfaceC23949) {
        this.f33618 = interfaceC23949;
    }

    @Override // l.InterfaceC23949
    public final Object get() {
        InterfaceC23949 interfaceC23949 = this.f33618;
        C2075 c2075 = f33616;
        if (interfaceC23949 != c2075) {
            synchronized (this.f33619) {
                if (this.f33618 != c2075) {
                    Object obj = this.f33618.get();
                    this.f33617 = obj;
                    this.f33618 = c2075;
                    return obj;
                }
            }
        }
        return this.f33617;
    }

    public final String toString() {
        Object obj = this.f33618;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f33616) {
            obj = "<supplier that returned " + this.f33617 + ">";
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
