package l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3946 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((C2184) ((Map.Entry) obj).getKey()).f7921, ((C2184) ((Map.Entry) obj2).getKey()).f7921);
    }
}
