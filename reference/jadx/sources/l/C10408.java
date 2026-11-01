package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10408 extends AbstractC0414 {
    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C7585 c7585 = (C7585) abstractC12554;
        switch (DialogInterfaceOnDismissListenerC20991.f68353[i]) {
            case 0:
                c7585.f25113.setText(C16737.m39288(R.string.MT_Protector).concat(" ->"));
                c7585.f25112.setImageResource(R.drawable.MT_Protector);
                break;
            case 1:
                c7585.f25113.setText(C16737.m39288(R.string.MT_Protector).concat(" ->"));
                c7585.f25112.setImageResource(R.drawable.MT_Protector);
                break;
            case 2:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 3:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 4:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 5:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 6:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 7:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 8:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 9:
                c7585.m20104(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
        }
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7585(C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC20991.f68353.length;
    }
}
