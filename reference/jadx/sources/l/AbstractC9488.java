package l;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۡܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ASR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9488 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16969 f30727;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f30729;

    /* JADX INFO: renamed from: ۙ */
    public void mo15472(int i, int i2) {
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo2516(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6650(C2777 c2777, int i, int i2) {
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public abstract String[] mo6653();

    /* JADX INFO: renamed from: ۤ */
    public abstract C11002 mo6669();

    /* JADX INFO: renamed from: ܳ */
    public abstract String[] mo6683();

    public AbstractC9488() {
        C1286 c1286 = new C1286();
        c1286.add(C20677.f66293);
        this.f30729 = c1286;
        this.f30728 = -1;
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: ֫ */
    public C22191 mo6640() {
        String[] strArrMo6653 = mo6653();
        if (strArrMo6653 != null) {
            C22191 c22191 = C22191.f71497;
            if (strArrMo6653.length != 0) {
                String[] strArr = (String[]) Arrays.copyOf(strArrMo6653, strArrMo6653.length);
                String[] strArr2 = (String[]) Arrays.copyOf(strArrMo6653, strArrMo6653.length);
                for (int i = 0; i < strArrMo6653.length; i++) {
                    String str = strArrMo6653[i];
                    if (str != null) {
                        if (!str.isEmpty()) {
                            char cCharAt = str.charAt(0);
                            if (cCharAt == '\'') {
                                strArr2[i] = null;
                            } else if (Character.isUpperCase(cCharAt)) {
                                strArr[i] = null;
                            } else {
                                strArr[i] = null;
                                strArr2[i] = null;
                            }
                        } else {
                            strArr[i] = null;
                            strArr2[i] = null;
                        }
                    }
                }
                return new C22191(strArr, strArr2, strArrMo6653);
            }
        }
        return C22191.f71497;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC16969 m24871() {
        return this.f30727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24867(AbstractC16969 abstractC16969) {
        this.f30727 = abstractC16969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24868(C25153 c25153) {
        if (c25153 == null) {
            throw new NullPointerException("listener cannot be null.");
        }
        ((CopyOnWriteArrayList) this.f30729).add(c25153);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24869() {
        ((CopyOnWriteArrayList) this.f30729).clear();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19185 m24873() {
        return new C19185(this.f30729);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m24870() {
        return this.f30728;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24872(int i) {
        this.f30728 = i;
    }
}
