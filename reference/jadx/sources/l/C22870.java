package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y16E */
/* JADX INFO: loaded from: classes.dex */
public class C22870 extends AbstractC11813 {
    public C22870(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12575((InterfaceC24044) new C3755(this));
    }

    public C22870(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12575((InterfaceC24044) new C3755(this));
    }

    public C22870(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C3755(this));
    }

    public C22870(Context context) {
        super(context);
        m12575((InterfaceC24044) new C3755(this));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        C16434 c16434 = new C16434(abstractActivityC17204, null);
        c16434.setMax(22);
        c16434.setPadding(c16434.getPaddingLeft(), C6907.m19160(20.0f) + c16434.getPaddingTop(), c16434.getPaddingRight(), c16434.getPaddingBottom());
        c16434.setProgress(m29658().getInt(m12557(), 12) - 6);
        String str = abstractActivityC17204.getString(R.string.MT_Protector) + " (";
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(c16434.getProgress() + 6);
        sbM27333.append("dp)");
        c2361BuildDialog.m8024(sbM27333.toString());
        c2361BuildDialog.m8005(c16434);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c16434.setOnSeekBarChangeListener(new C10935(this, c2361BuildDialog.m8016(), str));
    }
}
