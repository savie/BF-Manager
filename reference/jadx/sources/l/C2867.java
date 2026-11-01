package l;

/* JADX INFO: renamed from: l.ۖ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U2T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2867 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] f10828;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20798[] f10829;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String[] f10830;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12332[] f10831;

    public C2867(C17684 c17684) {
        this.f10830 = new String[Math.min(c17684.f56160, 65535)];
        this.f10828 = new String[Math.min(c17684.f56165, 65535)];
        this.f10831 = new C12332[Math.min(c17684.f56171, 65535)];
        this.f10829 = new C20798[Math.min(c17684.f56172, 65535)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8628(int i) {
        String[] strArr = this.f10830;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8631(int i, String str) {
        if (str.length() > 512) {
            return;
        }
        String[] strArr = this.f10830;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m8632(int i) {
        String[] strArr = this.f10828;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8634(int i, String str) {
        String[] strArr = this.f10828;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12332 m8633(C17684 c17684, int i) {
        C12332[] c12332Arr = this.f10831;
        if (i >= c12332Arr.length) {
            return new C12332(c17684, i);
        }
        C12332 c12332 = c12332Arr[i];
        if (c12332 != null) {
            return c12332;
        }
        C12332 c12333 = new C12332(c17684, i);
        c12332Arr[i] = c12333;
        return c12333;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20798 m8629(C17684 c17684, int i) {
        C20798[] c20798Arr = this.f10829;
        if (i >= c20798Arr.length) {
            return new C20798(c17684, i);
        }
        C20798 c20798 = c20798Arr[i];
        if (c20798 != null) {
            return c20798;
        }
        C20798 c20799 = new C20798(c17684, i);
        c20798Arr[i] = c20799;
        return c20799;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8630() {
        this.f10831 = null;
        this.f10829 = null;
    }
}
