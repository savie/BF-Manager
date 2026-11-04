package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12292 implements InterfaceC1435 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39511;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39512 = new C19751("translationX");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39513;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39514;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39515;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC20497 f39517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f39520;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC24227 f39525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f39527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f39528 = 0.0f;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f39522 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39523 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f39524 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f39521 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f39526 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39519 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f39518 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo13168(long j);

    static {
        new C15275("translationY");
        new C13038("translationZ");
        f39511 = new C5581("scaleX");
        f39516 = new C1852("scaleY");
        f39515 = new C11546("rotation");
        f39513 = new C24973("rotationX");
        f39517 = new C16767("rotationY");
        new C17513("x");
        new C14112("y");
        new C4835(am.aD);
        f39514 = new C21989("alpha");
        new C10800("scrollX");
        new C22735("scrollY");
    }

    public AbstractC12292(Object obj, AbstractC24227 abstractC24227) {
        this.f39520 = obj;
        this.f39525 = abstractC24227;
        if (abstractC24227 == f39515 || abstractC24227 == f39513 || abstractC24227 == f39517) {
            this.f39527 = 0.1f;
            return;
        }
        if (abstractC24227 == f39514) {
            this.f39527 = 0.00390625f;
        } else if (abstractC24227 == f39511 || abstractC24227 == f39516) {
            this.f39527 = 0.00390625f;
        } else {
            this.f39527 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30683(float f) {
        this.f39522 = f;
        this.f39523 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30682(InterfaceC23481 interfaceC23481) {
        ArrayList arrayList = this.f39519;
        if (arrayList.contains(interfaceC23481)) {
            return;
        }
        arrayList.add(interfaceC23481);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30684(InterfaceC23481 interfaceC23481) {
        ArrayList arrayList = this.f39519;
        int iIndexOf = arrayList.indexOf(interfaceC23481);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // l.InterfaceC1435
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5173(long j) {
        ArrayList arrayList;
        long j2 = this.f39526;
        int i = 0;
        if (j2 == 0) {
            this.f39526 = j;
            m30681(this.f39522);
            return false;
        }
        this.f39526 = j;
        boolean zMo13168 = mo13168(j - j2);
        float fMin = Math.min(this.f39522, Float.MAX_VALUE);
        this.f39522 = fMin;
        float fMax = Math.max(fMin, this.f39521);
        this.f39522 = fMax;
        m30681(fMax);
        if (zMo13168) {
            this.f39524 = false;
            ThreadLocal threadLocal = C7401.f24380;
            if (threadLocal.get() == null) {
                threadLocal.set(new C7401());
            }
            ((C7401) threadLocal.get()).m20314(this);
            this.f39526 = 0L;
            this.f39523 = false;
            while (true) {
                arrayList = this.f39519;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((InterfaceC23481) arrayList.get(i)).onAnimationEnd();
                }
                i++;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return zMo13168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30681(float f) {
        ArrayList arrayList;
        this.f39525.setValue(this.f39520, f);
        int i = 0;
        while (true) {
            arrayList = this.f39518;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC3343) arrayList.get(i)).mo10996(this.f39522);
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m30680() {
        return this.f39527 * 0.75f;
    }
}
