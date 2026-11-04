package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5247 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f18492 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f18493;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f18494;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15800() {
        return this.f18492.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6959 m15801(int i) {
        return (C6959) this.f18492.get(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15806() {
        return this.f18493;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15802(String str) {
        this.f18493 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m15805() {
        return this.f18494;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15804(boolean z) {
        this.f18494 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15803(ArrayList arrayList) {
        ArrayList arrayList2 = this.f18492;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(500);
        sb.append('<');
        sb.append(this.f18493);
        ArrayList arrayList = this.f18492;
        if (arrayList.size() > 0 || this.f18494) {
            sb.append(' ');
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C6959 c6959M15801 = m15801(i);
            sb.append(c6959M15801.m19261());
            sb.append(a.h);
            sb.append(c6959M15801.m19263());
            sb.append(c6959M15801.m19262());
            sb.append(c6959M15801.m19263());
            if (this.f18494 || i != arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        if (this.f18494) {
            sb.append('/');
        }
        sb.append('>');
        return sb.toString();
    }
}
