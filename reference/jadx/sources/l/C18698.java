package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18698 extends AbstractC8821 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f60660;

    @Override // l.AbstractC8821
    /* JADX INFO: renamed from: ܰ */
    public final void mo22957(String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18698(C7409 c7409) {
        super(c7409);
        this.f60660 = c7409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43181(List list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            C8115 c8115 = (C8115) list.get(i);
            if (c8115.f28437.m5619(c8115.f28439)) {
                z = true;
                break;
            }
        }
        C7409 c7409 = this.f60660;
        if (c7409.f24640 != null) {
            c7409.f24640.setImageDrawable(z ? c7409.f24660 : c7409.f24632);
            c7409.f24640.setContentDescription(z ? c7409.f24675 : c7409.f24677);
        }
        this.f30337 = list;
    }

    @Override // l.AbstractC8821
    /* JADX INFO: renamed from: ۙ */
    public final void mo22955(C21520 c21520) {
        boolean z;
        c21520.f69920.setText(R.string.MT_Protector);
        int i = 0;
        while (true) {
            if (i >= this.f30337.size()) {
                z = true;
                break;
            }
            C8115 c8115 = (C8115) this.f30337.get(i);
            if (c8115.f28437.m5619(c8115.f28439)) {
                z = false;
                break;
            }
            i++;
        }
        c21520.f69919.setVisibility(z ? 0 : 4);
        c21520.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۤܰ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7409 c7409 = this.f57531.f60660;
                if (c7409.f24662 == null || !c7409.f24662.mo25841(29)) {
                    return;
                }
                c7409.f24662.mo25817(c7409.f24662.mo25826().mo5308().mo34362(3).mo34368().mo34367().mo34360().mo34361());
                c7409.f24630.dismiss();
            }
        });
    }

    @Override // l.AbstractC8821, l.AbstractC0414
    /* JADX INFO: renamed from: ۙ */
    public final void onBindViewHolder(C21520 c21520, int i) {
        super.onBindViewHolder(c21520, i);
        if (i > 0) {
            C8115 c8115 = (C8115) this.f30337.get(i - 1);
            c21520.f69919.setVisibility(c8115.f28437.m5619(c8115.f28439) ? 0 : 4);
        }
    }
}
