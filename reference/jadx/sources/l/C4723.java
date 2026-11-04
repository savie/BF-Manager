package l;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4723 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f16641;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f16642;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC7749 f16643;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f16644;

    public C4723(AbstractC7749 abstractC7749) {
        super(abstractC7749.getDispatchMode());
        this.f16641 = new HashMap();
        this.f16643 = abstractC7749;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22623 m14620(WindowInsetsAnimation windowInsetsAnimation) {
        C22623 c22623 = (C22623) this.f16641.get(windowInsetsAnimation);
        if (c22623 != null) {
            return c22623;
        }
        C22623 c22623M50969 = C22623.m50969(windowInsetsAnimation);
        this.f16641.put(windowInsetsAnimation, c22623M50969);
        return c22623M50969;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f16643.onPrepare(m14620(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0291 c0291OnStart = this.f16643.onStart(m14620(windowInsetsAnimation), C0291.m1855(bounds));
        c0291OnStart.getClass();
        C13714.m33524();
        return C7003.m19325(c0291OnStart.m1856().m32822(), c0291OnStart.m1857().m32822());
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f16644;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f16644 = arrayList2;
            this.f16642 = C4681.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                C22623 c22623M14620 = m14620(windowInsetsAnimation);
                c22623M14620.m50971(windowInsetsAnimation.getFraction());
                this.f16644.add(c22623M14620);
            } else {
                return this.f16643.onProgress(C3977.m12812(null, windowInsets), this.f16642).m12827();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f16643.onEnd(m14620(windowInsetsAnimation));
        this.f16641.remove(windowInsetsAnimation);
    }
}
