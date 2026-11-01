package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܳ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14777 implements InterfaceC23949, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient Object f48309 = new Object();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23949 f48310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient Object f48311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f48312;

    public C14777(InterfaceC23949 interfaceC23949) {
        this.f48310 = interfaceC23949;
    }

    @Override // l.InterfaceC23949
    public final Object get() {
        if (!this.f48312) {
            synchronized (this.f48309) {
                if (!this.f48312) {
                    Object obj = this.f48310.get();
                    this.f48311 = obj;
                    this.f48312 = true;
                    return obj;
                }
            }
        }
        return this.f48311;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f48312) {
            obj = "<supplier that returned " + this.f48311 + ">";
        } else {
            obj = this.f48310;
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f48309 = new Object();
    }
}
