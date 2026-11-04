package l;

import com.umeng.commonsdk.statistics.b;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7457 extends AbstractMap implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f24565 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f24566;

    public C7457(String str) {
        this.f24566 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20463() {
        return this.f24566;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f24565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20464(String str) {
        if (str == null || containsKey(str.toLowerCase())) {
            return;
        }
        this.f24565.add(new C8948(str));
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C7457 c7457 = new C7457(this.f24566);
        Iterator it = this.f24565.iterator();
        while (it.hasNext()) {
            c7457.m20464((String) ((Map.Entry) it.next()).getValue());
        }
        return c7457;
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
