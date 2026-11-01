package l;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ᩴ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ASR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19055 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14822 f61618;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61619;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f61620;

    /* JADX INFO: renamed from: ۙ */
    public void mo5090(int i, int i2) {
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo18914(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo23677(C8472 c8472, int i, int i2) {
        return true;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract C16233 mo5091();

    @Deprecated
    /* JADX INFO: renamed from: ۬ */
    public abstract String[] mo5092();

    /* JADX INFO: renamed from: ᩹ */
    public abstract String[] mo9135();

    public AbstractC19055() {
        C18349 c18349 = new C18349();
        c18349.add(C14117.f46355);
        this.f61620 = c18349;
        this.f61619 = -1;
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: ۘ */
    public C21171 mo5089() {
        String[] strArrMo5092 = mo5092();
        if (strArrMo5092 != null) {
            C21171 c21171 = C21171.f68947;
            if (strArrMo5092.length != 0) {
                String[] strArr = (String[]) Arrays.copyOf(strArrMo5092, strArrMo5092.length);
                String[] strArr2 = (String[]) Arrays.copyOf(strArrMo5092, strArrMo5092.length);
                for (int i = 0; i < strArrMo5092.length; i++) {
                    String str = strArrMo5092[i];
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
                return new C21171(strArr, strArr2, strArrMo5092);
            }
        }
        return C21171.f68947;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC14822 m43804() {
        return this.f61618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43802(AbstractC14822 abstractC14822) {
        this.f61618 = abstractC14822;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43803(C23497 c23497) {
        ((CopyOnWriteArrayList) this.f61620).add(c23497);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m43805() {
        ((CopyOnWriteArrayList) this.f61620).clear();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15528 m43801() {
        return new C15528(this.f61620);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m43800() {
        return this.f61619;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43806(int i) {
        this.f61619 = i;
    }
}
