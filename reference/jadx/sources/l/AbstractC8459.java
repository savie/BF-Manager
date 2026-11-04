package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y676 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8459 extends AbstractC13679 implements InterfaceC13524 {
    @Override // l.InterfaceC13524
    public final int hashCode() {
        return mo7393().hashCode() + (mo7392().hashCode() * 31);
    }

    @Override // l.InterfaceC13524
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC13524)) {
            return false;
        }
        InterfaceC13524 interfaceC13524 = (InterfaceC13524) obj;
        return mo7392().equals(interfaceC13524.mo7392()) && C22298.m50356(mo7393(), interfaceC13524.mo7393());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC13524 interfaceC13524) {
        int iCompareTo = mo7392().compareTo(interfaceC13524.mo7392());
        return iCompareTo != 0 ? iCompareTo : C11109.m28056(AbstractC18753.m43549(), mo7393(), interfaceC13524.mo7393());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        Iterator it = mo7393().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(mo7392());
        return sb.toString();
    }
}
