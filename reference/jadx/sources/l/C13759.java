package l;

import java.util.List;

/* JADX INFO: renamed from: l.۬ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13759 extends C10514 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final List f43683;

    public C13759(String str, List list) {
        super(str);
        C17359.requireNonNull(list);
        List list2 = list;
        this.f43683 = list2;
        this.f5441 = (list2.hashCode() * 31) + this.f33450.hashCode();
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ֫ */
    public final List mo5541() {
        return this.f43683;
    }

    @Override // l.C10514, l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        if (super.mo5547(obj)) {
            return C17359.equals(this.f43683, ((C13759) obj).f43683);
        }
        return false;
    }

    @Override // l.C10514, l.AbstractC1566
    public final String toString() {
        return this.f33450 + '<' + C4123.m13221(this.f43683, ", ") + '>';
    }
}
