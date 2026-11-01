package l;

/* JADX INFO: renamed from: l.᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C21487 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15844 f69814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13954[] f69815;

    /* JADX INFO: renamed from: ۖ */
    public void mo32199(C13954 c13954) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo48104(C13954 c13954) {
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo48105(C13954 c13954) {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo48106(C13954 c13954) {
    }

    /* JADX INFO: renamed from: ܰ */
    public C15844 mo32200() {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo32201(C13954 c13954) {
        throw null;
    }

    public C21487() {
        this(new C15844());
    }

    public C21487(C15844 c15844) {
        this.f69814 = c15844;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo36303(int i, C13954 c13954) {
        if (this.f69815 == null) {
            this.f69815 = new C13954[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f69815[C7376.m19642(i2)] = c13954;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48103() {
        C13954[] c13954Arr = this.f69815;
        if (c13954Arr != null) {
            C13954 c13954M37673 = c13954Arr[0];
            C13954 c13954M37674 = c13954Arr[1];
            C15844 c15844 = this.f69814;
            if (c13954M37674 == null) {
                c13954M37674 = c15844.m37673(2);
            }
            if (c13954M37673 == null) {
                c13954M37673 = c15844.m37673(1);
            }
            mo32199(C13954.m33795(c13954M37673, c13954M37674));
            C13954 c13954 = this.f69815[C7376.m19642(16)];
            if (c13954 != null) {
                mo48106(c13954);
            }
            C13954 c13955 = this.f69815[C7376.m19642(32)];
            if (c13955 != null) {
                mo48104(c13955);
            }
            C13954 c13956 = this.f69815[C7376.m19642(64)];
            if (c13956 != null) {
                mo48105(c13956);
            }
        }
    }
}
