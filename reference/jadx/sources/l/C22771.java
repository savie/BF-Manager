package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 27RL */
/* JADX INFO: loaded from: classes.dex */
public final class C22771 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6542 m50426(InterfaceC17428 interfaceC17428, EnumC3719 enumC3719) {
        ?? arrayDeque = new ArrayDeque();
        InterfaceC17428 interfaceC17428M50427 = m50427((ArrayDeque) arrayDeque, interfaceC17428);
        if (enumC3719 == EnumC3719.YES) {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (List list : arrayDeque) {
                if (!list.isEmpty()) {
                    AbstractC8774 abstractC8774 = (AbstractC8774) list.get(0);
                    abstractC8774.getClass();
                    int iM9453 = C3128.m9453(abstractC8774);
                    if (iM9453 < i) {
                        ArrayList arrayList = new ArrayList((Collection) arrayDeque);
                        Collections.rotate(arrayList, -(i2 + 1));
                        arrayDeque = arrayList;
                        break;
                    }
                    i2 = i3;
                    i = iM9453;
                }
                i3++;
            }
        }
        return new C6542(interfaceC17428M50427, AbstractC22433.m49797((Iterable) arrayDeque));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17428 m50427(ArrayDeque arrayDeque, InterfaceC17428 interfaceC17428) {
        int i = C12893.f42861[interfaceC17428.mo1801().ordinal()];
        if (i == 1) {
            return m50427(arrayDeque, ((InterfaceC3068) interfaceC17428).getType());
        }
        if (i == 2) {
            InterfaceC14359 interfaceC14359 = (InterfaceC14359) interfaceC17428;
            if (interfaceC14359.mo7327().mo1801() == EnumC12490.ARRAY_TYPE) {
                InterfaceC17428 interfaceC17428M50427 = m50427(arrayDeque, interfaceC14359.mo7327());
                arrayDeque.addFirst(AbstractC22433.copyOf((Collection) interfaceC14359.getAnnotations()));
                return interfaceC17428M50427;
            }
        }
        return interfaceC17428;
    }
}
