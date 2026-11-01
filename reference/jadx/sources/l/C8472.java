package l;

/* JADX INFO: renamed from: l.۠᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AR0 */
/* JADX INFO: loaded from: classes3.dex */
public class C8472 implements InterfaceC14988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23289 f29378;

    @Override // l.InterfaceC14988
    public int getChildCount() {
        throw null;
    }

    @Override // l.InterfaceC14988
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14988 mo22136(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo1058() {
        return -1;
    }

    @Override // l.InterfaceC14988
    public final String getText() {
        if (getChildCount() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getChildCount(); i++) {
            sb.append(mo22136(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (C8472 c8472 = this; c8472 != null; c8472 = c8472.f29378) {
            int i = c8472.f29377;
            if (i != -1) {
                sb.append(i);
            }
            C23289 c23289 = c8472.f29378;
            if (c23289 != null && c23289.f29377 != -1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
