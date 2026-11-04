package l;

import android.os.Build;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12715 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7495 f40707;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12715(C7495 c7495) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f40707 = c7495;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        this.f40707.m20538(c8614, m43131());
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        if (Build.VERSION.SDK_INT == 33 && C13903.m33865() && !C14584.m35204() && !C14584.m35213()) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f40707.m20218(), new String[0]);
            if (abstractC22044M35193 instanceof C18379) {
                String strM42887 = abstractC22044M35193.mo42890().m42887();
                return strM42887.equalsIgnoreCase("Android/data") || strM42887.equalsIgnoreCase("Android/obb");
            }
        }
        return false;
    }
}
