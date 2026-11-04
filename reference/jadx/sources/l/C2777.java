package l;

/* JADX INFO: renamed from: l.ۖܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AR0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2777 implements InterfaceC19383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9156;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7998 f9157;

    @Override // l.InterfaceC19383
    public int getChildCount() {
        throw null;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 mo9151(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo1229() {
        return -1;
    }

    @Override // l.InterfaceC19383
    public final String getText() {
        if (getChildCount() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getChildCount(); i++) {
            sb.append(mo9151(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (C2777 c2777 = this; c2777 != null; c2777 = c2777.f9157) {
            int i = c2777.f9156;
            if (i != -1) {
                sb.append(i);
            }
            C7998 c7998 = c2777.f9157;
            if (c7998 != null && c7998.f9156 != -1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
