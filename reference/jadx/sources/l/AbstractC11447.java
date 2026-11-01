package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5GJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11447 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f38510;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f38511;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f38512;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38513;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f38514;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f38515;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f38516;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38517;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f38518;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38519;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f38520;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f38521;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f38522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f38523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f38524;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38525;

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo8549();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11447 mo8551(AbstractC3340 abstractC3340);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11447 mo8552(AbstractC22611 abstractC22611);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC11447 mo8553(ComponentCallbacksC22654 componentCallbacksC22654, EnumC9414 enumC9414);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8555(int i, ComponentCallbacksC22654 componentCallbacksC22654, String str, int i2);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo8558();

    /* JADX INFO: renamed from: ۨ */
    public abstract AbstractC11447 mo8559(ComponentCallbacksC22654 componentCallbacksC22654);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo8560();

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC11447 mo8561(AbstractC22611 abstractC22611);

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC11447 mo8562(ComponentCallbacksC22654 componentCallbacksC22654);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28563(C13564 c13564) {
        this.f38515.add(c13564);
        c13564.f44747 = this.f38510;
        c13564.f44743 = this.f38518;
        c13564.f44748 = this.f38525;
        c13564.f44744 = this.f38520;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28564(AbstractC16042 abstractC16042) {
        mo8555(R.id.MT_Protector, abstractC16042, null, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28566(ComponentCallbacksC22654 componentCallbacksC22654, String str) {
        mo8555(R.id.MT_Protector, componentCallbacksC22654, str, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28562(int i, ComponentCallbacksC22654 componentCallbacksC22654, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo8555(i, componentCallbacksC22654, str, 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28565(ComponentCallbacksC22654 componentCallbacksC22654) {
        m28563(new C13564(componentCallbacksC22654, 7));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28561(int i, int i2) {
        this.f38510 = i;
        this.f38518 = i2;
        this.f38525 = 0;
        this.f38520 = 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m28568() {
        this.f38516 = o.a.c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28560() {
        if (!this.f38519) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f38513 = true;
        this.f38512 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28567() {
        this.f38523 = true;
    }
}
