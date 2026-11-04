package l;

/* JADX INFO: renamed from: l.֨ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1074 extends C18973 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3853 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C1074 f3854 = new C1074(1, 0, 1);

    @Override // l.C18973
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // l.C18973
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1074)) {
            return false;
        }
        if (isEmpty() && ((C1074) obj).isEmpty()) {
            return true;
        }
        C1074 c1074 = (C1074) obj;
        return getFirst() == c1074.getFirst() && getLast() == c1074.getLast();
    }

    @Override // l.C18973
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // l.C18973
    public final String toString() {
        return getFirst() + ".." + getLast();
    }
}
