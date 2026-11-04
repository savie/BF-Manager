package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 03CL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0975 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16344 f3560;

    public C0975(AbstractC16344 abstractC16344) {
        this.f3560 = abstractC16344;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator it = this.f3560.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!m3856((AbstractC11781) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        for (AbstractC11781 abstractC11781 : this.f3560.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (!m3856(abstractC11781)) {
                int i2 = i - 1;
                if (i == 0) {
                    return abstractC11781;
                }
                i = i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m3855(AbstractC11781 abstractC11781) {
        return !m3856(abstractC11781);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return this.f3560.mo7472(new C23144(2), EnumC13908.NON_RECURSIVE).iterator();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m3856(AbstractC11781 abstractC11781) {
        return abstractC11781 == null || (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0;
    }
}
