package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23819 extends ArrayList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14647 f77018;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23819(C14647 c14647) {
        super(0);
        this.f77018 = c14647;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.f77018.f47891 = obj;
        return super.add(obj);
    }
}
