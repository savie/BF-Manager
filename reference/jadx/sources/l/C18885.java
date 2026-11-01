package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18885 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11955 f61158;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10959 f61159;

    public C18885(InterfaceC11955 interfaceC11955, AbstractC10959 abstractC10959) {
        interfaceC11955.getClass();
        this.f61158 = interfaceC11955;
        this.f61159 = abstractC10959;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC11955 interfaceC11955 = this.f61158;
        return this.f61159.compare(interfaceC11955.apply(obj), interfaceC11955.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18885) {
            C18885 c18885 = (C18885) obj;
            if (this.f61158.equals(c18885.f61158) && this.f61159.equals(c18885.f61159)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f61158, this.f61159);
    }

    public final String toString() {
        return this.f61159 + ".onResultOf(" + this.f61158 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
