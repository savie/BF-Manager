package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 03CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7735 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC3110 f25572;

    public C7735(AbstractC3110 abstractC3110) {
        this.f25572 = abstractC3110;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator it = this.f25572.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!m20386((AbstractC23903) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        for (AbstractC23903 abstractC23903 : this.f25572.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (!m20386(abstractC23903)) {
                int i2 = i - 1;
                if (i == 0) {
                    return abstractC23903;
                }
                i = i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m20385(AbstractC23903 abstractC23903) {
        return !m20386(abstractC23903);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return this.f25572.mo3802(new C6964(2), EnumC10167.NON_RECURSIVE).iterator();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m20386(AbstractC23903 abstractC23903) {
        return abstractC23903 == null || (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0;
    }
}
