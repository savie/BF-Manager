package l;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public class C8756 extends C5227 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo22713() {
        for (C21825 c21825M43726 = this.f18128.m43726(); c21825M43726.m48595(); c21825M43726 = c21825M43726.f70877) {
            c21825M43726.f70876 = m22712((AbstractC3110) c21825M43726.f70876);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC3110 m22712(AbstractC3110 abstractC3110) {
        if (abstractC3110 instanceof C18633) {
            AbstractC23903 abstractC23903 = abstractC3110.f11719;
            C18633 c18633 = (C18633) abstractC3110;
            if (abstractC23903.f77452 == EnumC10477.f35865 && c18633.m43091()) {
                C10873 c10873 = new C10873(abstractC23903);
                Iterator it = abstractC3110.mo3802((Predicate) null, EnumC10167.RECURSIVE).iterator();
                while (it.hasNext()) {
                    c10873.mo24224((AbstractC23903) it.next());
                }
                C14401 c14401 = c10873.f11718;
                c14401.f47213 = c14401.f47213.m48597(new WeakReference(new C19339()));
                return c10873;
            }
        }
        return abstractC3110;
    }
}
