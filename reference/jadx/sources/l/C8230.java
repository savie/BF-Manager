package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8230 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14941 f27088;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f27089;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21655 f27090;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f27091;

    public C8230(C14941 c14941, AbstractViewOnClickListenerC10466 abstractViewOnClickListenerC10466, View view) {
        this.f27088 = c14941;
        this.f27091 = view;
        C21655 c21655 = abstractViewOnClickListenerC10466.f33309;
        this.f27090 = c21655;
        this.f27089 = abstractViewOnClickListenerC10466.getBindingAdapterPosition();
        if (c21655.m49177()) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22138() {
        this.f27088.m35965(this.f27090);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22140() {
        boolean z;
        int iMo28663;
        int i;
        C21655 c21655 = this.f27090;
        boolean zM49187 = c21655.m49187();
        C21655 c21656 = c21655.f69130;
        C14941 c14941 = this.f27088;
        if (zM49187) {
            c14941.m35954(c21655);
        }
        if (c21656 != null) {
            c21656.f69129.remove(c21655);
            if (c21656.f69129.isEmpty()) {
                C21655 c21657 = c21656.f69130;
                if (c21657 != null) {
                    c21657.f69129.remove(c21656);
                }
                z = true;
            }
            iMo28663 = c14941.mo28663();
            i = this.f27089;
            if (z) {
                int i2 = i - 1;
                c14941.m35956().subList(i2 - iMo28663, (i + 1) - iMo28663).clear();
                c14941.notifyItemRangeRemoved(i2, 2);
            } else {
                c14941.m35956().remove(i - iMo28663);
                c14941.notifyItemRemoved(i);
            }
        }
        c14941.m35935().f2791.remove(c21655);
        z = false;
        iMo28663 = c14941.mo28663();
        i = this.f27089;
        if (z) {
            int i3 = i - 1;
            c14941.m35956().subList(i3 - iMo28663, (i + 1) - iMo28663).clear();
            c14941.notifyItemRangeRemoved(i3, 2);
        } else {
            c14941.m35956().remove(i - iMo28663);
            c14941.notifyItemRemoved(i);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22142() {
        return this.f27090.m49186();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View m22143() {
        return this.f27091;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m22146() {
        return this.f27090.f69128;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22139() {
        return this.f27090.m49188();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m22141() {
        C21655 c21655 = this.f27090.f69130;
        if (c21655 == null) {
            return null;
        }
        return c21655.f69128;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m22145() {
        return C18969.m44060(200, this.f27090.f69127);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m22144() {
        return this.f27089;
    }
}
