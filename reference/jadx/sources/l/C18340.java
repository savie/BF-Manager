package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes4.dex */
public final class C18340 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f59809;

    public C18340(String str) {
        this.f59809 = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21324(this);
    }
}
