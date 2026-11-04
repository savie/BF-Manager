package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes3.dex */
public class C2864 extends AbstractC11813 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C9575 f9441;

    public C2864(Context context) {
        super(context);
        m9459();
    }

    public C2864(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9459();
    }

    public C2864(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9459();
    }

    public C2864(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9459();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m9459() {
        this.f9441 = new C9575(m12560());
        m9460();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private void m9460() {
        int i = this.f9441.f30992;
        if (i == 0) {
            m12594(R.string.MT_Protector);
        } else if (i == 1) {
            m12594(R.string.MT_Protector);
        } else {
            if (i != 2) {
                return;
            }
            m12594(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        int[] iArr = {this.f9441.f30992};
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8001(R.array.MT_Protector, this.f9441.f30992, new DialogInterfaceOnClickListenerC25372(1, iArr));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15046(this, abstractActivityC17204, iArr, 1));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9458(C2864 c2864, int[] iArr) {
        c2864.f9441.f30992 = iArr[0];
        PackageManager packageManagerM49081 = C21576.m49081();
        ArrayList<C1373> arrayList = new ArrayList(3);
        int i = c2864.f9441.f30992;
        if (i == 0) {
            arrayList.add(new C1373(c2864.f9441.f30989, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30990, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30991, 1, 0));
        } else if (i == 1) {
            arrayList.add(new C1373(c2864.f9441.f30991, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30990, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30989, 1, 0));
        } else if (i == 2) {
            arrayList.add(new C1373(c2864.f9441.f30991, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30989, 2, 1));
            arrayList.add(new C1373(c2864.f9441.f30990, 1, 0));
        }
        for (C1373 c1373 : arrayList) {
            packageManagerM49081.setComponentEnabledSetting(c1373.f4896, c1373.f4897, c1373.f4898);
        }
        c2864.m9460();
    }
}
