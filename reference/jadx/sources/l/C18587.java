package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18587 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C15060 c15060 = (C15060) obj;
        C15060 c15061 = (C15060) obj2;
        boolean z = c15060.f49106;
        String str = c15060.f49109;
        boolean z2 = c15061.f49106;
        String str2 = c15061.f49109;
        if (z != z2) {
            return z ? -1 : 1;
        }
        if (str.equals("..")) {
            return -1;
        }
        if (str2.equals("..")) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
