package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19151 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f61859 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61858 = new ArrayList();

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C19151(Set set, final Function function, final C11390 c11390) {
        C13638.requireNonNull(set);
        C0356.forEach(set, new Consumer() { // from class: l.۠֫ۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C15187 c15187;
                C19879 c19879 = (C19879) obj;
                boolean zMo25268 = c19879.mo25268();
                C19151 c19151 = this.f25871;
                Function function2 = function;
                if (!zMo25268) {
                    c19151.f61859.add((C15187) function2.apply(c19879));
                    return;
                }
                ArrayList arrayList = c19151.f61858;
                C15187 c15188 = (C15187) function2.apply(c19879);
                Integer numValueOf = Integer.valueOf(((C10001) c19879).m25267());
                C16351 c16351 = (C16351) c19879;
                if (c16351.m38522() == null) {
                    c15187 = null;
                } else {
                    c15187 = (C15187) c11390.apply(c16351.m38522());
                }
                arrayList.add(new C8172(c15188, numValueOf, c15187));
            }
        });
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ArrayList arrayList = this.f61859;
        if (arrayList.isEmpty()) {
            ArrayList<C8172> arrayList2 = this.f61858;
            C23509 c23509 = (C23509) interfaceC19275;
            c23509.m51770(arrayList2.size());
            for (C8172 c8172 : arrayList2) {
                c23509.m51770(((C15187) c8172.f43679).f43854);
                c23509.m51770(((Integer) c8172.f43680).intValue());
                Object obj = c8172.f28521;
                c23509.m51770(obj == null ? 0 : ((C15187) obj).f43854);
            }
            return;
        }
        C23509 c235010 = (C23509) interfaceC19275;
        c235010.m51770(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c235010.m51770(((C15187) it.next()).f43854);
        }
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        int size;
        ArrayList arrayList = this.f61859;
        if (arrayList.isEmpty()) {
            size = this.f61858.size() * 6;
        } else {
            size = arrayList.size() * 2;
        }
        return size + 2;
    }
}
