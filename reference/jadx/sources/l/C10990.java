package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes4.dex */
public class C10990 extends AbstractC18168 {
    public C10990(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13151();
        m13145((InterfaceC3485) new C16882(1, this));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        String[] strArrM20090 = C7564.m20090(m13133());
        int i = m42292().getInt(m13157(), 0);
        final boolean[] zArr = new boolean[3];
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = true;
            if (((1 << i2) & i) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21277(m13158());
        c8067BuildDialog.m21268(strArrM20090, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ܿ۫ۘ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z2) {
                zArr[i3] = z2;
            }
        });
        c8067BuildDialog.m21270(R.layout.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6050(0, this, zArr));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269().m44364(R.id.MT_Protector).setMinimumHeight(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27743(C10990 c10990, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c10990.m42292().edit().putInt(c10990.m13157(), i).apply();
        c10990.mo8453();
    }
}
