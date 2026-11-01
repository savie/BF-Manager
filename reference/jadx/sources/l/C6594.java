package l;

import com.umeng.commonsdk.statistics.b;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6594 extends AbstractMap implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashSet f22214 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f22215;

    public C6594(String str) {
        this.f22215 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17901() {
        return this.f22215;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f22214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17902(String str) {
        if (str == null || containsKey(str.toLowerCase())) {
            return;
        }
        this.f22214.add(new C3771(str));
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C6594 c6594 = new C6594(this.f22215);
        Iterator it = this.f22214.iterator();
        while (it.hasNext()) {
            c6594.m17902((String) ((Map.Entry) it.next()).getValue());
        }
        return c6594;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        if (isEmpty()) {
            sb.append(b.f);
        } else {
            Iterator it = values().iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}
