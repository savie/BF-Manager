package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩶ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21513 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C13176 c13176 = (C13176) obj;
        C13176 c13177 = (C13176) obj2;
        int iCompare = Long.compare(c13177.m32693(), c13176.m32693());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(c13177.m32693() + ((long) c13177.m32692()), c13176.m32693() + ((long) c13176.m32692()));
        return iCompare2 != 0 ? iCompare2 : Integer.compare(c13176.m32692(), c13177.m32692());
    }
}
