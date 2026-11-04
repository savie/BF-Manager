package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23417 extends ArrayList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3279 f75799;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23417(C3279 c3279) {
        super(0);
        this.f75799 = c3279;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f75799.f10685 = obj;
        return super.add(obj);
    }
}
