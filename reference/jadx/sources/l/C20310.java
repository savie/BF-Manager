package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩵ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20310 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iM38321 = ((C12105) obj).f38959.m38321();
        int iM38322 = ((C12105) obj2).f38959.m38321();
        if (iM38321 < iM38322) {
            return -1;
        }
        return iM38321 > iM38322 ? 1 : 0;
    }
}
