package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13869 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8930 c8930 = (C8930) obj;
        C8930 c8931 = (C8930) obj2;
        int iCompare = Long.compare(c8931.m23219(), c8930.m23219());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(c8931.m23219() + ((long) c8931.m23220()), c8930.m23219() + ((long) c8930.m23220()));
        return iCompare2 != 0 ? iCompare2 : Integer.compare(c8930.m23220(), c8931.m23220());
    }
}
