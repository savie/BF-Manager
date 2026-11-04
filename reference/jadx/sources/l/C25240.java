package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8VQ */
/* JADX INFO: loaded from: classes.dex */
public class C25240 extends AbstractC11813 {
    public C25240(Context context) {
        super(context);
        m12575((InterfaceC24044) new C10185());
    }

    public C25240(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C10185());
    }

    public C25240(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12575((InterfaceC24044) new C10185());
    }

    public C25240(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12575((InterfaceC24044) new C10185());
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        int i = 2;
        CharSequence[] charSequenceArr = {m12560().getString(R.string.MT_Protector), m12560().getString(R.string.MT_Protector)};
        int i2 = m29658().getInt(m12557(), 0);
        boolean[] zArr = {(i2 & 1) != 0, (i2 & 2) != 0};
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(m12578());
        c2361.m8015(charSequenceArr, zArr, new DialogInterfaceOnMultiChoiceClickListenerC19216(zArr, 1));
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10618(i, this, zArr));
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56377(C25240 c25240, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c25240.m29658().edit().putInt(c25240.m12557(), i).apply();
        c25240.mo7306();
    }
}
