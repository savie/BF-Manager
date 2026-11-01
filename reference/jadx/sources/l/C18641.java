package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18641 extends AbstractC19347 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Class f60437 = C0561.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ܰ */
    public final List mo21205(long j, Object obj) {
        return m43124(10, j, obj);
    }

    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ۙ */
    public final void mo21203(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C15882.m37785(j, obj);
        if (list instanceof InterfaceC17935) {
            objUnmodifiableList = ((InterfaceC17935) list).mo21382();
        } else {
            if (f60437.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC11211) && (list instanceof InterfaceC2016)) {
                InterfaceC2016 interfaceC2016 = (InterfaceC2016) list;
                if (interfaceC2016.mo6484()) {
                    interfaceC2016.mo6483();
                    return;
                }
                return;
            }
            objUnmodifiableList = C0561.unmodifiableList(list);
        }
        C15882.m37774(j, obj, objUnmodifiableList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m43124(int i, long j, Object obj) {
        List arrayList;
        List list = (List) C15882.m37785(j, obj);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC17935) {
                arrayList = new C21463(i);
            } else if ((list instanceof InterfaceC11211) && (list instanceof InterfaceC2016)) {
                arrayList = ((InterfaceC2016) list).mo3072(i);
            } else {
                arrayList = new ArrayList(i);
            }
            C15882.m37774(j, obj, arrayList);
            return arrayList;
        }
        if (f60437.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            C15882.m37774(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof C8120) {
            C21463 c21463 = new C21463(list.size() + i);
            c21463.addAll((C8120) list);
            C15882.m37774(j, obj, c21463);
            return c21463;
        }
        if ((list instanceof InterfaceC11211) && (list instanceof InterfaceC2016)) {
            InterfaceC2016 interfaceC2016 = (InterfaceC2016) list;
            if (!interfaceC2016.mo6484()) {
                InterfaceC2016 interfaceC2016Mo3072 = interfaceC2016.mo3072(list.size() + i);
                C15882.m37774(j, obj, interfaceC2016Mo3072);
                return interfaceC2016Mo3072;
            }
        }
        return list;
    }

    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ۙ */
    public final void mo21204(long j, Object obj, Object obj2) {
        List list = (List) C15882.m37785(j, obj2);
        List listM43124 = m43124(list.size(), j, obj);
        int size = listM43124.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM43124.addAll(list);
        }
        if (size > 0) {
            list = listM43124;
        }
        C15882.m37774(j, obj, list);
    }
}
