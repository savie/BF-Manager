package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J1J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11381 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View f38371;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9886 f38372;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f38373;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3534 f38374;

    public C11381(C9886 c9886, AbstractViewOnClickListenerC5030 abstractViewOnClickListenerC5030, View view) {
        this.f38372 = c9886;
        this.f38371 = view;
        C3534 c3534 = abstractViewOnClickListenerC5030.f17534;
        this.f38374 = c3534;
        this.f38373 = abstractViewOnClickListenerC5030.getBindingAdapterPosition();
        if (c3534.m10399()) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m28483() {
        this.f38372.m24990(this.f38374);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m28487() {
        boolean z;
        int iMo14206;
        int i;
        C3534 c3534 = this.f38374;
        boolean zM10413 = c3534.m10413();
        C3534 c3535 = c3534.f13020;
        C9886 c9886 = this.f38372;
        if (zM10413) {
            c9886.m25015(c3534);
        }
        if (c3535 != null) {
            c3535.f13024.remove(c3534);
            if (c3535.f13024.isEmpty()) {
                C3534 c3536 = c3535.f13020;
                if (c3536 != null) {
                    c3536.f13024.remove(c3535);
                }
                z = true;
            }
            iMo14206 = c9886.mo14206();
            i = this.f38373;
            if (z) {
                int i2 = i - 1;
                c9886.m24989().subList(i2 - iMo14206, (i + 1) - iMo14206).clear();
                c9886.notifyItemRangeRemoved(i2, 2);
            } else {
                c9886.m24989().remove(i - iMo14206);
                c9886.notifyItemRemoved(i);
            }
        }
        c9886.m24992().f44598.remove(c3534);
        z = false;
        iMo14206 = c9886.mo14206();
        i = this.f38373;
        if (z) {
            int i3 = i - 1;
            c9886.m24989().subList(i3 - iMo14206, (i + 1) - iMo14206).clear();
            c9886.notifyItemRangeRemoved(i3, 2);
        } else {
            c9886.m24989().remove(i - iMo14206);
            c9886.notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m28481() {
        return this.f38374.m10396();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View m28489() {
        return this.f38371;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m28482() {
        return this.f38374.f13022;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28484() {
        return this.f38374.m10404();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m28486() {
        C3534 c3534 = this.f38374.f13020;
        if (c3534 == null) {
            return null;
        }
        return c3534.f13022;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28488() {
        return C13012.m32189(200, this.f38374.f13025);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m28485() {
        return this.f38373;
    }
}
