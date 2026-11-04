package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21872 extends AbstractC19634 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f69708;

    @Override // l.AbstractC19634
    /* JADX INFO: renamed from: ᩷ */
    public final void mo44168(String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21872(C12921 c12921) {
        super(c12921);
        this.f69708 = c12921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49565(List list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            C10683 c10683 = (C10683) list.get(i);
            if (c10683.f33914.m46544(c10683.f33916)) {
                z = true;
                break;
            }
        }
        C12921 c12921 = this.f69708;
        if (c12921.f41331 != null) {
            c12921.f41331.setImageDrawable(z ? c12921.f41357 : c12921.f41386);
            c12921.f41331.setContentDescription(z ? c12921.f41378 : c12921.f41325);
        }
        this.f63262 = list;
    }

    @Override // l.AbstractC19634
    /* JADX INFO: renamed from: ۙ */
    public final void mo44167(C13840 c13840) {
        boolean z;
        c13840.f43936.setText(R.string.MT_Protector);
        int i = 0;
        while (true) {
            if (i >= this.f63262.size()) {
                z = true;
                break;
            }
            C10683 c10683 = (C10683) this.f63262.get(i);
            if (c10683.f33914.m46544(c10683.f33916)) {
                z = false;
                break;
            }
            i++;
        }
        c13840.f43935.setVisibility(z ? 0 : 4);
        c13840.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۛ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12921 c12921 = this.f16637.f69708;
                if (c12921.f41312 == null || !c12921.f41312.mo21703(29)) {
                    return;
                }
                c12921.f41312.mo23550(c12921.f41312.mo23582().mo10195().mo12043(3).mo12049().mo12048().mo12051().mo12042());
                c12921.f41348.dismiss();
            }
        });
    }

    @Override // l.AbstractC19634, l.AbstractC12964
    /* JADX INFO: renamed from: ۙ */
    public final void onBindViewHolder(C13840 c13840, int i) {
        super.onBindViewHolder(c13840, i);
        if (i > 0) {
            C10683 c10683 = (C10683) this.f63262.get(i - 1);
            c13840.f43935.setVisibility(c10683.f33914.m46544(c10683.f33916) ? 0 : 4);
        }
    }
}
