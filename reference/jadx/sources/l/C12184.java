package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۨۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12184 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39171;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f39172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f39173;

    public C12184(AbstractC7629 abstractC7629, List list, int i) {
        this.f39172 = abstractC7629;
        this.f39173 = list;
        this.f39171 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12184)) {
            return false;
        }
        C12184 c12184 = (C12184) obj;
        return this.f39171 == c12184.f39171 && C17359.equals(this.f39172, c12184.f39172) && C17359.equals(this.f39173, c12184.f39173);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f39173) + ((C17359.hashCode(this.f39172) + (this.f39171 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f39172, this.f39173, Integer.valueOf(this.f39171)};
        String[] strArrSplit = "visitor;fileItems;currentIndex".length() == 0 ? new String[0] : "visitor;fileItems;currentIndex".split(l.b);
        StringBuilder sb = new StringBuilder("MediaArguments[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30458() {
        return this.f39171;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m30459() {
        return this.f39172;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m30460() {
        return this.f39173;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12184 m30457(AbstractActivityC17204 abstractActivityC17204, String str) {
        List<InterfaceC2386> list;
        try {
            int i = C14584.f45961;
            final AbstractC22044 abstractC22044M35190 = C14584.m35190(abstractActivityC17204.getIntent());
            String name = abstractC22044M35190.getName();
            final C11969 c11969 = C11969.f38536;
            Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.᩵ۜۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c11969.mo20830(abstractC22044M35190.m49881(), true);
                }
            });
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                futureSubmit.cancel(true);
                list = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int size = -1;
            for (InterfaceC2386 interfaceC2386 : list) {
                if (interfaceC2386.getName().equals(name)) {
                    size = arrayList.size();
                    arrayList.add(interfaceC2386);
                } else if (interfaceC2386.mo8114().startsWith(str)) {
                    arrayList.add(interfaceC2386);
                }
            }
            if (size == -1) {
                arrayList.add(0, new C6004(abstractC22044M35190));
                size = 0;
            }
            InterfaceC2386 interfaceC2387 = (InterfaceC2386) arrayList.get(size);
            C14118.m34287(arrayList, 0, false);
            return new C12184(c11969, arrayList, arrayList.indexOf(interfaceC2387));
        } catch (Exception unused2) {
            return null;
        }
    }
}
