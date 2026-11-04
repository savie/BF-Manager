package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes5.dex */
public final class C16288 extends AbstractC12964 {
    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C23748 c23748 = (C23748) abstractC11800;
        switch (DialogInterfaceOnDismissListenerC3610.f12369[i]) {
            case 0:
                c23748.f76959.setText(C21576.m49088(R.string.MT_Protector).concat(" ->"));
                c23748.f76958.setImageResource(R.drawable.MT_Protector);
                break;
            case 1:
                c23748.f76959.setText(C21576.m49088(R.string.MT_Protector).concat(" ->"));
                c23748.f76958.setImageResource(R.drawable.MT_Protector);
                break;
            case 2:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 3:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 4:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 5:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 6:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 7:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 8:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 9:
                c23748.m53030(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
        }
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C23748(C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC3610.f12369.length;
    }
}
