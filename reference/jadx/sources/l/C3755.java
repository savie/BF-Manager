package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3755 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f13602;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6578 f13607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f13604 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13606 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13603 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13605 = 0;

    public C3755(C6578 c6578, int i) {
        this.f13607 = c6578;
        this.f13602 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m10983(int i) {
        int i2 = this.f13606;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f13604;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C11518 c11518 = (C11518) view.getLayoutParams();
        this.f13606 = this.f13607.f22156.mo36473(view);
        c11518.getClass();
        return this.f13606;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10979(int i) {
        int i2 = this.f13603;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f13604.size() == 0) {
            return i;
        }
        m10981();
        return this.f13603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10981() {
        View view = (View) C19084.m43861(this.f13604, 1);
        C11518 c11518 = (C11518) view.getLayoutParams();
        this.f13603 = this.f13607.f22156.mo36475(view);
        c11518.getClass();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10985() {
        this.f13604.clear();
        this.f13606 = Integer.MIN_VALUE;
        this.f13603 = Integer.MIN_VALUE;
        this.f13605 = 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m10982() {
        boolean z = this.f13607.f22153;
        ArrayList arrayList = this.f13604;
        if (z) {
            return m10980(arrayList.size() - 1, -1);
        }
        return m10980(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10978() {
        boolean z = this.f13607.f22153;
        ArrayList arrayList = this.f13604;
        if (z) {
            return m10980(0, arrayList.size());
        }
        return m10980(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10980(int i, int i2) {
        C6578 c6578 = this.f13607;
        int iMo36483 = c6578.f22156.mo36483();
        int iMo36481 = c6578.f22156.mo36481();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f13604.get(i);
            int iMo36473 = c6578.f22156.mo36473(view);
            int iMo36475 = c6578.f22156.mo36475(view);
            boolean z = iMo36473 <= iMo36481;
            boolean z2 = iMo36475 >= iMo36483;
            if (z && z2 && (iMo36473 < iMo36483 || iMo36475 > iMo36481)) {
                return c6578.getPosition(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m10984(int i, int i2) {
        C6578 c6578 = this.f13607;
        ArrayList arrayList = this.f13604;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((c6578.f22153 && c6578.getPosition(view2) <= i) || ((!c6578.f22153 && c6578.getPosition(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((c6578.f22153 && c6578.getPosition(view3) >= i) || ((!c6578.f22153 && c6578.getPosition(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }
}
