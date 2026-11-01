package l;

/* JADX INFO: renamed from: l.ܽ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16287 extends C19815 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C16287 f52462 = new C16287(1, 0, 1);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52463 = 0;

    @Override // l.C19815
    public final boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // l.C19815
    public final boolean equals(Object obj) {
        if (!(obj instanceof C16287)) {
            return false;
        }
        if (isEmpty() && ((C16287) obj).isEmpty()) {
            return true;
        }
        C16287 c16287 = (C16287) obj;
        return getFirst() == c16287.getFirst() && getLast() == c16287.getLast();
    }

    @Override // l.C19815
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // l.C19815
    public final String toString() {
        return getFirst() + ".." + getLast();
    }
}
