package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4313 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f15640 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class f15641 = C8787.class;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m13803() {
        return this.f15641;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13806(C4313 c4313) {
        for (Map.Entry entry : c4313.f15640.entrySet()) {
            C11392.putIfAbsent(this.f15640, (String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13805(String str, C8787 c8787) {
        C11392.putIfAbsent(this.f15640, C16991.m40052(str), c8787);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13804(String str) {
        return this.f15640.get(C16991.m40052(str));
    }
}
