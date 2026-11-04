package l;

import android.view.View;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19259 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10308 f62287;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f62290;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f62288 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f62289 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62285 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f62286 = 0;

    public C19259(C10308 c10308, int i) {
        this.f62287 = c10308;
        this.f62290 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44597(int i) {
        int i2 = this.f62289;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f62288;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C4343 c4343 = (C4343) view.getLayoutParams();
        this.f62289 = this.f62287.f32900.mo3280(view);
        c4343.getClass();
        return this.f62289;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44593(int i) {
        int i2 = this.f62285;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f62288.size() == 0) {
            return i;
        }
        m44595();
        return this.f62285;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44595() {
        View view = (View) j$$ExternalSyntheticOutline0.m(this.f62288, 1);
        C4343 c4343 = (C4343) view.getLayoutParams();
        this.f62285 = this.f62287.f32900.mo3268(view);
        c4343.getClass();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44599() {
        this.f62288.clear();
        this.f62289 = Integer.MIN_VALUE;
        this.f62285 = Integer.MIN_VALUE;
        this.f62286 = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44596() {
        boolean z = this.f62287.f32905;
        ArrayList arrayList = this.f62288;
        if (z) {
            return m44594(arrayList.size() - 1, -1);
        }
        return m44594(0, arrayList.size());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m44600() {
        boolean z = this.f62287.f32905;
        ArrayList arrayList = this.f62288;
        if (z) {
            return m44594(0, arrayList.size());
        }
        return m44594(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44594(int i, int i2) {
        C10308 c10308 = this.f62287;
        int iMo3273 = c10308.f32900.mo3273();
        int iMo3277 = c10308.f32900.mo3277();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f62288.get(i);
            int iMo3280 = c10308.f32900.mo3280(view);
            int iMo3268 = c10308.f32900.mo3268(view);
            boolean z = iMo3280 <= iMo3277;
            boolean z2 = iMo3268 >= iMo3273;
            if (z && z2 && (iMo3280 < iMo3273 || iMo3268 > iMo3277)) {
                return c10308.getPosition(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m44598(int i, int i2) {
        C10308 c10308 = this.f62287;
        ArrayList arrayList = this.f62288;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((c10308.f32905 && c10308.getPosition(view2) <= i) || ((!c10308.f32905 && c10308.getPosition(view2) >= i) || !view2.hasFocusable())) {
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
            if ((c10308.f32905 && c10308.getPosition(view3) >= i) || ((!c10308.f32905 && c10308.getPosition(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }
}
