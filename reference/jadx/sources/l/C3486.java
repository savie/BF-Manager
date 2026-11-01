package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C3486 implements InterfaceC23949, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f12791;

    public C3486(Object obj) {
        this.f12791 = obj;
    }

    @Override // l.InterfaceC23949
    public final Object get() {
        return this.f12791;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3486) {
            return C13638.equals(this.f12791, ((C3486) obj).f12791);
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f12791);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f12791 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
