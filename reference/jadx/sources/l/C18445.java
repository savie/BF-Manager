package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18445 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58801 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f58802 = new ArrayList();

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C18445(Map map, final Function function, final Function function2) {
        C13638.requireNonNull(map);
        C9030.stream(map.entrySet()).forEach(new Consumer() { // from class: l.᩸֫ۡ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C18445.m42796(this.f69250, function2, function, (Map.Entry) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42796(C18445 c18445, final Function function, Function function2, Map.Entry entry) {
        final ArrayList arrayList = new ArrayList();
        C0356.forEach((Set) entry.getValue(), new Consumer() { // from class: l.ᩳ֫ۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((C15187) function.apply((C19879) obj));
            }
        });
        if (((C19879) entry.getKey()).mo25268()) {
            c18445.f58801.add(new C8172((C15187) function2.apply((C19879) entry.getKey()), Integer.valueOf(((C10001) entry.getKey()).m25267()), arrayList));
        } else {
            c18445.f58802.add(new C13111((C15187) function2.apply((C19879) entry.getKey()), arrayList));
        }
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ArrayList<C13111> arrayList = this.f58802;
        if (arrayList.isEmpty()) {
            ArrayList<C8172> arrayList2 = this.f58801;
            C23509 c23509 = (C23509) interfaceC19275;
            c23509.m51770(arrayList2.size());
            for (C8172 c8172 : arrayList2) {
                Object obj = c8172.f43679;
                Object obj2 = c8172.f28521;
                c23509.m51770(((C15187) obj).f43854);
                c23509.m51770(((Integer) c8172.f43680).intValue());
                List list = (List) obj2;
                c23509.m51770(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c23509.m51770(((C15187) it.next()).f43854);
                }
            }
            return;
        }
        C23509 c235010 = (C23509) interfaceC19275;
        c235010.m51770(arrayList.size());
        for (C13111 c13111 : arrayList) {
            c235010.m51770(((C15187) c13111.f43679).f43854);
            c235010.m51770(((List) c13111.f43680).size());
            Iterator it2 = ((List) c13111.f43680).iterator();
            while (it2.hasNext()) {
                c235010.m51770(((C15187) it2.next()).f43854);
            }
        }
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        int size;
        int iSum;
        ArrayList arrayList = this.f58802;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f58801;
            size = (arrayList2.size() * 6) + 2;
            iSum = C9030.stream(arrayList2).mapToInt(new C6450()).filter(new C22679()).sum();
        } else {
            size = (arrayList.size() * 4) + 2;
            iSum = C9030.stream(arrayList).mapToInt(new C23631(1)).filter(new C14918()).sum();
        }
        return (iSum * 2) + size;
    }
}
