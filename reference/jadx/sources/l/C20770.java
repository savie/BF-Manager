package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵ᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20770 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5417 f66543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18753 f66544;

    public C20770(InterfaceC5417 interfaceC5417, AbstractC18753 abstractC18753) {
        this.f66543 = interfaceC5417;
        this.f66544 = abstractC18753;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC5417 interfaceC5417 = this.f66543;
        return this.f66544.compare(interfaceC5417.apply(obj), interfaceC5417.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20770) {
            C20770 c20770 = (C20770) obj;
            if (this.f66543.equals(c20770.f66543) && this.f66544.equals(c20770.f66544)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f66543, this.f66544);
    }

    public final String toString() {
        return this.f66544 + ".onResultOf(" + this.f66543 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
