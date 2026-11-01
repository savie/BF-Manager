package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22226 extends AbstractC8821 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f72683;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22226(C7409 c7409) {
        super(c7409);
        this.f72683 = c7409;
    }

    @Override // l.AbstractC8821
    /* JADX INFO: renamed from: ۙ */
    public final void mo22955(C21520 c21520) {
        c21520.f69920.setText(R.string.MT_Protector);
        InterfaceC10161 interfaceC10161 = this.f72683.f24662;
        interfaceC10161.getClass();
        c21520.f69919.setVisibility(m49349(interfaceC10161.mo25826()) ? 4 : 0);
        c21520.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۤܰ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7409 c7409 = this.f18305.f72683;
                if (c7409.f24662 == null || !c7409.f24662.mo25841(29)) {
                    return;
                }
                C14395 c14395Mo25826 = c7409.f24662.mo25826();
                InterfaceC10161 interfaceC10162 = c7409.f24662;
                String str = C17983.f57504;
                interfaceC10162.mo25817(c14395Mo25826.mo5308().mo34362(1).mo34363(1, false).mo34361());
                c7409.f24613.m36395(1, c7409.getResources().getString(R.string.MT_Protector));
                c7409.f24630.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49349(C14395 c14395) {
        for (int i = 0; i < this.f30337.size(); i++) {
            if (c14395.f47176.containsKey(((C8115) this.f30337.get(i)).f28437.m5615())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC8821
    /* JADX INFO: renamed from: ܰ */
    public final void mo22957(String str) {
        this.f72683.f24613.m36395(1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49350(List list) {
        this.f30337 = list;
        C7409 c7409 = this.f72683;
        InterfaceC10161 interfaceC10161 = c7409.f24662;
        interfaceC10161.getClass();
        C14395 c14395Mo25826 = interfaceC10161.mo25826();
        if (((AbstractCollection) list).isEmpty()) {
            c7409.f24613.m36395(1, c7409.getResources().getString(R.string.MT_Protector));
            return;
        }
        if (!m49349(c14395Mo25826)) {
            c7409.f24613.m36395(1, c7409.getResources().getString(R.string.MT_Protector));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C8115 c8115 = (C8115) list.get(i);
            if (c8115.f28437.m5619(c8115.f28439)) {
                c7409.f24613.m36395(1, c8115.f28438);
                return;
            }
        }
    }
}
