package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13619 implements InterfaceC6908, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object f43264;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6908 f43265;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient Object f43266 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f43267;

    public C13619(InterfaceC6908 interfaceC6908) {
        this.f43265 = interfaceC6908;
    }

    @Override // l.InterfaceC6908
    public final Object get() {
        if (!this.f43267) {
            synchronized (this.f43266) {
                if (!this.f43267) {
                    Object obj = this.f43265.get();
                    this.f43264 = obj;
                    this.f43267 = true;
                    return obj;
                }
            }
        }
        return this.f43264;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f43267) {
            obj = "<supplier that returned " + this.f43264 + ">";
        } else {
            obj = this.f43265;
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f43266 = new Object();
    }
}
