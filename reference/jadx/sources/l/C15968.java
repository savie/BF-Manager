package l;

import android.os.Build;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15968 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11672 f51731;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15968(C11672 c11672) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f51731 = c11672;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        this.f51731.m29120(c11545, m27806());
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo6292() {
        if (Build.VERSION.SDK_INT == 33 && C14063.m34008() && !C5553.m15326() && !C5553.m15303()) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f51731.m28629(), new String[0]);
            if (abstractC20745M15313 instanceof C17196) {
                String strM40128 = abstractC20745M15313.mo40129().m40128();
                return strM40128.equalsIgnoreCase("Android/data") || strM40128.equalsIgnoreCase("Android/obb");
            }
        }
        return false;
    }
}
