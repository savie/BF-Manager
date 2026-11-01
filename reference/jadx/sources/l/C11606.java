package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11606 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39005 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f39006 = C17955.class;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m28935() {
        return this.f39006;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28938(C11606 c11606) {
        for (Map.Entry entry : c11606.f39005.entrySet()) {
            C9735.putIfAbsent(this.f39005, (String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28937(String str, C17955 c17955) {
        C9735.putIfAbsent(this.f39005, C6270.m17351(str), c17955);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m28936(String str) {
        return this.f39005.get(C6270.m17351(str));
    }
}
