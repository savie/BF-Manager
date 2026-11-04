package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5GJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4573 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f16261;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f16262;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16263;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f16264;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f16265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f16266;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f16267;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f16268;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f16269;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f16270;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f16271;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f16272;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f16273;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CharSequence f16274;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f16275;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16276;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14348(AbstractC9051 abstractC9051);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14349(ComponentCallbacksC11612 componentCallbacksC11612, EnumC2619 enumC2619);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14350(AbstractC24349 abstractC24349);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14354(int i, ComponentCallbacksC11612 componentCallbacksC11612, String str, int i2);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract int mo14359();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14360(ComponentCallbacksC11612 componentCallbacksC11612);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo14363();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14364(AbstractC9051 abstractC9051);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC4573 mo14365(ComponentCallbacksC11612 componentCallbacksC11612);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract void mo14366();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14358(C13631 c13631) {
        this.f16266.add(c13631);
        c13631.f43286 = this.f16267;
        c13631.f43291 = this.f16264;
        c13631.f43285 = this.f16276;
        c13631.f43283 = this.f16270;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14355(AbstractC5703 abstractC5703) {
        mo14354(R.id.MT_Protector, abstractC5703, null, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14357(ComponentCallbacksC11612 componentCallbacksC11612, String str) {
        mo14354(R.id.MT_Protector, componentCallbacksC11612, str, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14353(int i, ComponentCallbacksC11612 componentCallbacksC11612, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo14354(i, componentCallbacksC11612, str, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14356(ComponentCallbacksC11612 componentCallbacksC11612) {
        m14358(new C13631(componentCallbacksC11612, 7));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14352(int i, int i2) {
        this.f16267 = i;
        this.f16264 = i2;
        this.f16276 = 0;
        this.f16270 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14361() {
        this.f16262 = o.a.c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14351() {
        if (!this.f16273) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f16263 = true;
        this.f16261 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m14362() {
        this.f16271 = true;
    }
}
