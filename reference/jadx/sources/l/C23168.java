package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23168 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C16466 c16466 = (C16466) obj;
        C16466 c16467 = (C16466) obj2;
        int i = C18934.f61253;
        boolean zStartsWith = c16466.m38728().startsWith("_");
        if (zStartsWith == c16467.m38728().startsWith("_")) {
            return c16466.m38728().compareToIgnoreCase(c16467.m38728());
        }
        return zStartsWith ? 1 : -1;
    }
}
