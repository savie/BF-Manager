package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes4.dex */
public class C11488 extends AbstractC24741 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f36140;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36148;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public HashMap f36150;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C4777[] f36153;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f36133 = new ThreadLocal();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f36132 = new C10742();

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f36134 = new C22677();

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f36129 = new C19693();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f36131 = new C15217();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f36135 = new C12980();

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f36130 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static long f36136 = 10;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f36141 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f36145 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f36151 = 0;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f36152 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f36138 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f36143 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f36142 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f36137 = 300;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f36147 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f36144 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f36139 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Interpolator f36149 = f36130;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f36146 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28874(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C4777[] c4777Arr = this.f36153;
        if (c4777Arr == null || c4777Arr.length == 0) {
            int i = C4777.f16757;
            C13551 c13551 = new C13551("");
            c13551.mo14747(fArr);
            m28875(c13551);
        } else {
            c4777Arr[0].mo14747(fArr);
        }
        this.f36142 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28875(C4777... c4777Arr) {
        int length = c4777Arr.length;
        this.f36153 = c4777Arr;
        this.f36150 = new HashMap(length);
        for (C4777 c4777 : c4777Arr) {
            this.f36150.put(c4777.f16768, c4777);
        }
        this.f36142 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo28877() {
        if (this.f36142) {
            return;
        }
        int length = this.f36153.length;
        for (int i = 0; i < length; i++) {
            this.f36153[i].m14748();
        }
        this.f36142 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11488 mo28882(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "Animators cannot have negative duration: "));
        }
        this.f36137 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28878(long j) {
        this.f36147 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m28881() {
        C4777[] c4777Arr = this.f36153;
        if (c4777Arr == null || c4777Arr.length <= 0) {
            return null;
        }
        return c4777Arr[0].mo14742();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m28880() {
        this.f36144 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28872(InterfaceC1794 interfaceC1794) {
        if (this.f36146 == null) {
            this.f36146 = new ArrayList();
        }
        this.f36146.add(interfaceC1794);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28871(Interpolator interpolator) {
        this.f36149 = interpolator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28873(C1815 c1815) {
        C4777[] c4777Arr = this.f36153;
        if (c4777Arr == null || c4777Arr.length <= 0) {
            return;
        }
        c4777Arr[0].m14746(c1815);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m28879() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        int i = 0;
        this.f36145 = false;
        this.f36151 = 0;
        this.f36138 = 0;
        this.f36152 = false;
        ((ArrayList) f36134.get()).add(this);
        long jCurrentAnimationTimeMillis = 0;
        if (this.f36147 == 0) {
            if (this.f36142 && this.f36138 != 0) {
                jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f36140;
            }
            mo28877();
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.f36138 != 1) {
                this.f36141 = jCurrentAnimationTimeMillis;
                this.f36138 = 2;
            }
            this.f36140 = jCurrentAnimationTimeMillis2 - jCurrentAnimationTimeMillis;
            m28876(jCurrentAnimationTimeMillis2);
            this.f36138 = 0;
            this.f36143 = true;
            ArrayList arrayList = this.f80119;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC11314) arrayList2.get(i2)).mo2216();
                }
            }
        }
        ThreadLocal threadLocal = f36133;
        HandlerC5523 handlerC5523 = (HandlerC5523) threadLocal.get();
        if (handlerC5523 == null) {
            handlerC5523 = new HandlerC5523(i);
            threadLocal.set(handlerC5523);
        }
        handlerC5523.sendEmptyMessage(0);
    }

    public final void cancel() {
        ArrayList arrayList;
        if (this.f36138 != 0 || ((ArrayList) f36134.get()).contains(this) || ((ArrayList) f36129.get()).contains(this)) {
            if (this.f36143 && (arrayList = this.f80119) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11314) it.next()).getClass();
                }
            }
            m28863();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28869() {
        if (!((ArrayList) f36132.get()).contains(this) && !((ArrayList) f36134.get()).contains(this)) {
            this.f36152 = false;
            m28857();
        } else if (!this.f36142) {
            mo28877();
        }
        int i = this.f36144;
        if (i > 0 && (i & 1) == 1) {
            mo28870(0.0f);
        } else {
            mo28870(1.0f);
        }
        m28863();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m28863() {
        ArrayList arrayList;
        ((ArrayList) f36132.get()).remove(this);
        ((ArrayList) f36134.get()).remove(this);
        ((ArrayList) f36129.get()).remove(this);
        this.f36138 = 0;
        if (this.f36143 && (arrayList = this.f80119) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC11314) arrayList2.get(i)).onAnimationEnd();
            }
        }
        this.f36143 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m28857() {
        ArrayList arrayList;
        mo28877();
        ((ArrayList) f36132.get()).add(this);
        if (this.f36147 <= 0 || (arrayList = this.f80119) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC11314) arrayList2.get(i)).mo2216();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28859(C11488 c11488, long j) {
        if (!c11488.f36152) {
            c11488.f36152 = true;
            c11488.f36148 = j;
            return false;
        }
        long j2 = j - c11488.f36148;
        long j3 = c11488.f36147;
        if (j2 <= j3) {
            return false;
        }
        c11488.f36140 = j - (j2 - j3);
        c11488.f36138 = 1;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28876(long j) {
        boolean z = true;
        if (this.f36138 == 0) {
            this.f36138 = 1;
            long j2 = this.f36141;
            if (j2 < 0) {
                this.f36140 = j;
            } else {
                this.f36140 = j - j2;
                this.f36141 = -1L;
            }
        }
        int i = this.f36138;
        if (i != 1 && i != 2) {
            return false;
        }
        long j3 = this.f36137;
        float fMin = j3 > 0 ? (j - this.f36140) / j3 : 1.0f;
        if (fMin >= 1.0f) {
            int i2 = this.f36151;
            int i3 = this.f36144;
            if (i2 < i3 || i3 == -1) {
                ArrayList arrayList = this.f80119;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((InterfaceC11314) this.f80119.get(i4)).getClass();
                    }
                }
                if (this.f36139 == 2) {
                    this.f36145 = !this.f36145;
                }
                this.f36151 += (int) fMin;
                fMin %= 1.0f;
                this.f36140 += this.f36137;
                z = false;
            } else {
                fMin = Math.min(fMin, 1.0f);
            }
        } else {
            z = false;
        }
        if (this.f36145) {
            fMin = 1.0f - fMin;
        }
        mo28870(fMin);
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28870(float f) {
        float interpolation = this.f36149.getInterpolation(f);
        int length = this.f36153.length;
        for (int i = 0; i < length; i++) {
            this.f36153[i].mo14743(interpolation);
        }
        ArrayList arrayList = this.f36146;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC1794) this.f36146.get(i2)).mo4470(this);
            }
        }
    }

    @Override // l.AbstractC24741
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C11488 mo28883clone() {
        C11488 c11488 = (C11488) super.mo28883clone();
        ArrayList arrayList = this.f36146;
        if (arrayList != null) {
            c11488.f36146 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c11488.f36146.add((InterfaceC1794) arrayList.get(i));
            }
        }
        c11488.f36141 = -1L;
        c11488.f36145 = false;
        c11488.f36151 = 0;
        c11488.f36142 = false;
        c11488.f36138 = 0;
        c11488.f36152 = false;
        C4777[] c4777Arr = this.f36153;
        if (c4777Arr != null) {
            int length = c4777Arr.length;
            c11488.f36153 = new C4777[length];
            c11488.f36150 = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                C4777 c4777Mo14750clone = c4777Arr[i2].clone();
                c11488.f36153[i2] = c4777Mo14750clone;
                c11488.f36150.put(c4777Mo14750clone.f16768, c4777Mo14750clone);
            }
        }
        return c11488;
    }

    public String toString() {
        String string = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f36153 != null) {
            for (int i = 0; i < this.f36153.length; i++) {
                StringBuilder sbM10405 = C3188.m10405(string, "\n    ");
                sbM10405.append(this.f36153[i].toString());
                string = sbM10405.toString();
            }
        }
        return string;
    }
}
