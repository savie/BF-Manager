package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩸᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V8FZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21830 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f70883;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f70884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f70885;

    public C21830(AbstractC9677 abstractC9677, List list, int i) {
        this.f70884 = abstractC9677;
        this.f70885 = list;
        this.f70883 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21830)) {
            return false;
        }
        C21830 c21830 = (C21830) obj;
        return this.f70883 == c21830.f70883 && C13638.equals(this.f70884, c21830.f70884) && C13638.equals(this.f70885, c21830.f70885);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f70885) + ((C13638.hashCode(this.f70884) + (this.f70883 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f70884, this.f70885, Integer.valueOf(this.f70883)};
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m48600() {
        return this.f70884;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48601() {
        return this.f70883;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m48602() {
        return this.f70885;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21830 m48599(AbstractActivityC12483 abstractActivityC12483, String str) {
        List<InterfaceC2557> list;
        try {
            int i = C5553.f19060;
            AbstractC20745 abstractC20745M15309 = C5553.m15309(abstractActivityC12483.getIntent());
            String name = abstractC20745M15309.getName();
            C21611 c21611 = C21611.f70098;
            Future futureSubmit = C4716.f16636.submit(new CallableC5449(1, c21611, abstractC20745M15309));
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
                futureSubmit.cancel(true);
                list = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int size = -1;
            for (InterfaceC2557 interfaceC2557 : list) {
                if (interfaceC2557.getName().equals(name)) {
                    size = arrayList.size();
                    arrayList.add(interfaceC2557);
                } else if (interfaceC2557.mo7967().startsWith(str)) {
                    arrayList.add(interfaceC2557);
                }
            }
            if (size == -1) {
                arrayList.add(0, new C6794(abstractC20745M15309));
                size = 0;
            }
            InterfaceC2557 interfaceC2558 = (InterfaceC2557) arrayList.get(size);
            C3386.m10046(arrayList, 0, false);
            return new C21830(c21611, arrayList, arrayList.indexOf(interfaceC2558));
        } catch (Exception unused2) {
            return null;
        }
    }
}
