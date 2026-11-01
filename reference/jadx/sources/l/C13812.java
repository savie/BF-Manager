package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes4.dex */
public class C13812 extends AbstractC18168 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C4638 f45593;

    public C13812(Context context) {
        super(context);
        m33626();
    }

    public C13812(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33626();
    }

    public C13812(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33626();
    }

    public C13812(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m33626();
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    private void m33626() {
        this.f45593 = new C4638(m13133());
        m33627();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    private void m33627() {
        int i = this.f45593.f16386;
        if (i == 0) {
            m13153(R.string.MT_Protector);
        } else if (i == 1) {
            m13153(R.string.MT_Protector);
        } else {
            if (i != 2) {
                return;
            }
            m13153(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        final int[] iArr = {this.f45593.f16386};
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21254(R.array.MT_Protector, this.f45593.f16386, new DialogInterface.OnClickListener() { // from class: l.֫ܽۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                iArr[0] = i;
            }
        });
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13641(this, abstractActivityC12483, iArr, 1));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33625(C13812 c13812, int[] iArr) {
        c13812.f45593.f16386 = iArr[0];
        PackageManager packageManagerM39292 = C16737.m39292();
        ArrayList<C3351> arrayList = new ArrayList(3);
        int i = c13812.f45593.f16386;
        if (i == 0) {
            arrayList.add(new C3351(c13812.f45593.f16387, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16388, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16389, 1, 0));
        } else if (i == 1) {
            arrayList.add(new C3351(c13812.f45593.f16389, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16388, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16387, 1, 0));
        } else if (i == 2) {
            arrayList.add(new C3351(c13812.f45593.f16389, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16387, 2, 1));
            arrayList.add(new C3351(c13812.f45593.f16388, 1, 0));
        }
        for (C3351 c3351 : arrayList) {
            packageManagerM39292.setComponentEnabledSetting(c3351.f12395, c3351.f12396, c3351.f12397);
        }
        c13812.m33627();
    }
}
