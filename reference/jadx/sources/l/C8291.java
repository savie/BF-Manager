package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8VQ */
/* JADX INFO: loaded from: classes4.dex */
public class C8291 extends AbstractC18168 {
    public C8291(Context context) {
        super(context);
        m13145((InterfaceC3485) new C20630());
    }

    public C8291(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C20630());
    }

    public C8291(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13145((InterfaceC3485) new C20630());
    }

    public C8291(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m13145((InterfaceC3485) new C20630());
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        CharSequence[] charSequenceArr = {m13133().getString(R.string.MT_Protector), m13133().getString(R.string.MT_Protector)};
        int i = m42292().getInt(m13157(), 0);
        final boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(m13158());
        c8067.m21268(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴܽۘ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                zArr[i3] = z;
            }
        });
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3077(3, this, zArr));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21728(C8291 c8291, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c8291.m42292().edit().putInt(c8291.m13157(), i).apply();
        c8291.mo8453();
    }
}
