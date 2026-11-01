package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y676 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18202 extends AbstractC8325 implements InterfaceC19441 {
    @Override // l.InterfaceC19441
    public final int hashCode() {
        return mo1999().hashCode() + (mo1995().hashCode() * 31);
    }

    @Override // l.InterfaceC19441
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC19441)) {
            return false;
        }
        InterfaceC19441 interfaceC19441 = (InterfaceC19441) obj;
        return mo1995().equals(interfaceC19441.mo1995()) && C10166.m25904(mo1999(), interfaceC19441.mo1999());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC19441 interfaceC19441) {
        int iCompareTo = mo1995().compareTo(interfaceC19441.mo1995());
        return iCompareTo != 0 ? iCompareTo : C7343.m19621(AbstractC10959.m27713(), mo1999(), interfaceC19441.mo1999());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        Iterator it = mo1999().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(mo1995());
        return sb.toString();
    }
}
