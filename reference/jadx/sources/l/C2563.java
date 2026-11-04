package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2563 extends AbstractC7038 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Class f8236 = C4681.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List mo8613(long j, Object obj) {
        return m8610(10, j, obj);
    }

    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8611(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C22832.m51520(j, obj);
        if (list instanceof InterfaceC9274) {
            objUnmodifiableList = ((InterfaceC9274) list).mo4030();
        } else {
            if (f8236.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC24917) && (list instanceof InterfaceC15987)) {
                InterfaceC15987 interfaceC15987 = (InterfaceC15987) list;
                if (interfaceC15987.mo23371()) {
                    interfaceC15987.mo23372();
                    return;
                }
                return;
            }
            objUnmodifiableList = C4681.unmodifiableList(list);
        }
        C22832.m51505(j, obj, objUnmodifiableList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m8610(int i, long j, Object obj) {
        List arrayList;
        List list = (List) C22832.m51520(j, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC9274) {
                arrayList = new C1072(i);
            } else if ((list instanceof InterfaceC24917) && (list instanceof InterfaceC15987)) {
                arrayList = ((InterfaceC15987) list).mo4024(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C22832.m51505(j, obj, arrayList);
            return arrayList;
        }
        if (f8236.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C22832.m51505(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof C8464) {
            C1072 c1072 = new C1072(list.size() + i);
            c1072.addAll((C8464) list);
            C22832.m51505(j, obj, c1072);
            return c1072;
        }
        if ((list instanceof InterfaceC24917) && (list instanceof InterfaceC15987)) {
            InterfaceC15987 interfaceC15987 = (InterfaceC15987) list;
            if (!interfaceC15987.mo23371()) {
                InterfaceC15987 interfaceC15987Mo4024 = interfaceC15987.mo4024(list.size() + i);
                C22832.m51505(j, obj, interfaceC15987Mo4024);
                return interfaceC15987Mo4024;
            }
        }
        return list;
    }

    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8612(long j, Object obj, Object obj2) {
        List list = (List) C22832.m51520(j, obj2);
        List listM8610 = m8610(list.size(), j, obj);
        int size = listM8610.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM8610.addAll(list);
        }
        if (size > 0) {
            list = listM8610;
        }
        C22832.m51505(j, obj, list);
    }
}
