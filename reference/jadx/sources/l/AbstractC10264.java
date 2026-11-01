package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B5N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10264 implements InterfaceC23732 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34989;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34990 = new C22258("translationX");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34992;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34993;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34994;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC8853 f34995;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f34997;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC20847 f35000;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f35003;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f35006 = 0.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f35001 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f34996 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f35005 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f35002 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f35004 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34999 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34998 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo26054(long j);

    static {
        new C1090("translationY");
        new C13086("translationZ");
        f34989 = new C3912("scaleX");
        f34994 = new C6735("scaleY");
        f34995 = new C22964("rotation");
        f34992 = new C15203("rotationX");
        f34993 = new C21552("rotationY");
        new C18024("x");
        new C4618("y");
        new C13792(am.aD);
        f34991 = new C11675("alpha");
        new C2501("scrollX");
        new C5324("scrollY");
    }

    public AbstractC10264(Object obj, AbstractC20847 abstractC20847) {
        this.f35003 = obj;
        this.f35000 = abstractC20847;
        if (abstractC20847 == f34995 || abstractC20847 == f34992 || abstractC20847 == f34993) {
            this.f34997 = 0.1f;
            return;
        }
        if (abstractC20847 == f34991) {
            this.f34997 = 0.00390625f;
        } else if (abstractC20847 == f34989 || abstractC20847 == f34994) {
            this.f34997 = 0.00390625f;
        } else {
            this.f34997 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26052(float f) {
        this.f35001 = f;
        this.f34996 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26050(InterfaceC8147 interfaceC8147) {
        ArrayList arrayList = this.f34999;
        if (arrayList.contains(interfaceC8147)) {
            return;
        }
        arrayList.add(interfaceC8147);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26053(InterfaceC8147 interfaceC8147) {
        ArrayList arrayList = this.f34999;
        int iIndexOf = arrayList.indexOf(interfaceC8147);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // l.InterfaceC23732
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26051(long j) {
        ArrayList arrayList;
        long j2 = this.f35004;
        int i = 0;
        if (j2 == 0) {
            this.f35004 = j;
            m26049(this.f35001);
            return false;
        }
        this.f35004 = j;
        boolean zMo26054 = mo26054(j - j2);
        float fMin = Math.min(this.f35001, Float.MAX_VALUE);
        this.f35001 = fMin;
        float fMax = Math.max(fMin, this.f35002);
        this.f35001 = fMax;
        m26049(fMax);
        if (zMo26054) {
            this.f35005 = false;
            ThreadLocal threadLocal = C3269.f12130;
            if (threadLocal.get() == null) {
                threadLocal.set(new C3269());
            }
            ((C3269) threadLocal.get()).m9750(this);
            this.f35004 = 0L;
            this.f34996 = false;
            while (true) {
                arrayList = this.f34999;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((InterfaceC8147) arrayList.get(i)).onAnimationEnd();
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
        return zMo26054;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26049(float f) {
        ArrayList arrayList;
        this.f35000.setValue(this.f35003, f);
        int i = 0;
        while (true) {
            arrayList = this.f34998;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((InterfaceC19436) arrayList.get(i)).mo28393(this.f35001);
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
    public final float m26048() {
        return this.f34997 * 0.75f;
    }
}
