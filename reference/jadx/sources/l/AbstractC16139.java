package l;

/* JADX INFO: renamed from: l.ܶܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBCX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16139 extends AbstractC23599 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52425 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m38320() {
        return this.f52425 >= 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m38321() {
        int i = this.f52425;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38319(int i) {
        if (this.f52425 != -1) {
            throw new RuntimeException("index already set");
        }
        this.f52425 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38318() {
        return "[" + Integer.toHexString(this.f52425) + ']';
    }
}
