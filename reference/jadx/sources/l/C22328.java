package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes.dex */
public final class C22328 implements InterfaceC6908, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f72271;

    public C22328(Object obj) {
        this.f72271 = obj;
    }

    @Override // l.InterfaceC6908
    public final Object get() {
        return this.f72271;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22328) {
            return C17359.equals(this.f72271, ((C22328) obj).f72271);
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f72271);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f72271 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
