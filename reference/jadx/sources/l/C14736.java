package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes4.dex */
public class C14736 extends AbstractC1704 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f48181;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C16147[] f48183;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f48185;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public HashMap f48186;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f48179 = new ThreadLocal();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f48173 = new C0623();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f48177 = new C16852();

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f48174 = new C12619();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f48175 = new C17557();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f48178 = new C6268();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f48176 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static long f48180 = 10;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f48188 = -1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f48187 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48196 = 0;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f48192 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48189 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48182 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f48191 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f48194 = 300;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f48184 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f48197 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48193 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Interpolator f48195 = f48176;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f48190 = null;

    /* JADX INFO: renamed from: ۙ */
    public void mo15352(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C16147[] c16147Arr = this.f48183;
        if (c16147Arr == null || c16147Arr.length == 0) {
            int i = C16147.f52178;
            C21085 c21085 = new C21085("");
            c21085.mo38226(fArr);
            m35313(c21085);
        } else {
            c16147Arr[0].mo38226(fArr);
        }
        this.f48191 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35313(C16147... c16147Arr) {
        int length = c16147Arr.length;
        this.f48183 = c16147Arr;
        this.f48186 = new HashMap(length);
        for (C16147 c16147 : c16147Arr) {
            this.f48186.put(c16147.f52187, c16147);
        }
        this.f48191 = false;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo15350() {
        if (this.f48191) {
            return;
        }
        int length = this.f48183.length;
        for (int i = 0; i < length; i++) {
            this.f48183[i].m38227();
        }
        this.f48191 = true;
    }

    /* JADX INFO: renamed from: ܰ */
    public C14736 mo15353(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "Animators cannot have negative duration: "));
        }
        this.f48194 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35317(long j) {
        this.f48184 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m35316() {
        C16147[] c16147Arr = this.f48183;
        if (c16147Arr == null || c16147Arr.length <= 0) {
            return null;
        }
        return c16147Arr[0].mo38221();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35315() {
        this.f48197 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35312(InterfaceC23908 interfaceC23908) {
        if (this.f48190 == null) {
            this.f48190 = new ArrayList();
        }
        this.f48190.add(interfaceC23908);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35310(Interpolator interpolator) {
        this.f48195 = interpolator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35311(C1375 c1375) {
        C16147[] c16147Arr = this.f48183;
        if (c16147Arr == null || c16147Arr.length <= 0) {
            return;
        }
        c16147Arr[0].m38225(c1375);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m35318() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        int i = 0;
        this.f48187 = false;
        this.f48196 = 0;
        this.f48189 = 0;
        this.f48192 = false;
        ((ArrayList) f48177.get()).add(this);
        long jCurrentAnimationTimeMillis = 0;
        if (this.f48184 == 0) {
            if (this.f48191 && this.f48189 != 0) {
                jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f48185;
            }
            mo15350();
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.f48189 != 1) {
                this.f48188 = jCurrentAnimationTimeMillis;
                this.f48189 = 2;
            }
            this.f48185 = jCurrentAnimationTimeMillis2 - jCurrentAnimationTimeMillis;
            m35314(jCurrentAnimationTimeMillis2);
            this.f48189 = 0;
            this.f48182 = true;
            ArrayList arrayList = this.f6732;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC14406) arrayList2.get(i2)).mo5404();
                }
            }
        }
        ThreadLocal threadLocal = f48179;
        HandlerC11208 handlerC11208 = (HandlerC11208) threadLocal.get();
        if (handlerC11208 == null) {
            handlerC11208 = new HandlerC11208(i);
            threadLocal.set(handlerC11208);
        }
        handlerC11208.sendEmptyMessage(0);
    }

    public final void cancel() {
        ArrayList arrayList;
        if (this.f48189 != 0 || ((ArrayList) f48177.get()).contains(this) || ((ArrayList) f48174.get()).contains(this)) {
            if (this.f48182 && (arrayList = this.f6732) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC14406) it.next()).getClass();
                }
            }
            m35306();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35309() {
        if (!((ArrayList) f48173.get()).contains(this) && !((ArrayList) f48177.get()).contains(this)) {
            this.f48192 = false;
            m35301();
        } else if (!this.f48191) {
            mo15350();
        }
        int i = this.f48197;
        if (i > 0 && (i & 1) == 1) {
            mo15351(0.0f);
        } else {
            mo15351(1.0f);
        }
        m35306();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m35306() {
        ArrayList arrayList;
        ((ArrayList) f48173.get()).remove(this);
        ((ArrayList) f48177.get()).remove(this);
        ((ArrayList) f48174.get()).remove(this);
        this.f48189 = 0;
        if (this.f48182 && (arrayList = this.f6732) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC14406) arrayList2.get(i)).onAnimationEnd();
            }
        }
        this.f48182 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m35301() {
        ArrayList arrayList;
        mo15350();
        ((ArrayList) f48173.get()).add(this);
        if (this.f48184 <= 0 || (arrayList = this.f6732) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC14406) arrayList2.get(i)).mo5404();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35299(C14736 c14736, long j) {
        if (!c14736.f48192) {
            c14736.f48192 = true;
            c14736.f48181 = j;
            return false;
        }
        long j2 = j - c14736.f48181;
        long j3 = c14736.f48184;
        if (j2 <= j3) {
            return false;
        }
        c14736.f48185 = j - (j2 - j3);
        c14736.f48189 = 1;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35314(long j) {
        boolean z = true;
        if (this.f48189 == 0) {
            this.f48189 = 1;
            long j2 = this.f48188;
            if (j2 < 0) {
                this.f48185 = j;
            } else {
                this.f48185 = j - j2;
                this.f48188 = -1L;
            }
        }
        int i = this.f48189;
        if (i != 1 && i != 2) {
            return false;
        }
        long j3 = this.f48194;
        float fMin = j3 > 0 ? (j - this.f48185) / j3 : 1.0f;
        if (fMin >= 1.0f) {
            int i2 = this.f48196;
            int i3 = this.f48197;
            if (i2 < i3 || i3 == -1) {
                ArrayList arrayList = this.f6732;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((InterfaceC14406) this.f6732.get(i4)).getClass();
                    }
                }
                if (this.f48193 == 2) {
                    this.f48187 = !this.f48187;
                }
                this.f48196 += (int) fMin;
                fMin %= 1.0f;
                this.f48185 += this.f48194;
                z = false;
            } else {
                fMin = Math.min(fMin, 1.0f);
            }
        } else {
            z = false;
        }
        if (this.f48187) {
            fMin = 1.0f - fMin;
        }
        mo15351(fMin);
        return z;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo15351(float f) {
        float interpolation = this.f48195.getInterpolation(f);
        int length = this.f48183.length;
        for (int i = 0; i < length; i++) {
            this.f48183[i].mo38222(interpolation);
        }
        ArrayList arrayList = this.f48190;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC23908) this.f48190.get(i2)).mo6994(this);
            }
        }
    }

    @Override // l.AbstractC1704
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C14736 mo5666clone() {
        C14736 c14736 = (C14736) super.mo5666clone();
        ArrayList arrayList = this.f48190;
        if (arrayList != null) {
            c14736.f48190 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c14736.f48190.add((InterfaceC23908) arrayList.get(i));
            }
        }
        c14736.f48188 = -1L;
        c14736.f48187 = false;
        c14736.f48196 = 0;
        c14736.f48191 = false;
        c14736.f48189 = 0;
        c14736.f48192 = false;
        C16147[] c16147Arr = this.f48183;
        if (c16147Arr != null) {
            int length = c16147Arr.length;
            c14736.f48183 = new C16147[length];
            c14736.f48186 = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                C16147 c16147Mo38229clone = c16147Arr[i2].clone();
                c14736.f48183[i2] = c16147Mo38229clone;
                c14736.f48186.put(c16147Mo38229clone.f52187, c16147Mo38229clone);
            }
        }
        return c14736;
    }

    public String toString() {
        String string = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f48183 != null) {
            for (int i = 0; i < this.f48183.length; i++) {
                StringBuilder sbM8976 = C3012.m8976(string, "\n    ");
                sbM8976.append(this.f48183[i].toString());
                string = sbM8976.toString();
            }
        }
        return string;
    }
}
