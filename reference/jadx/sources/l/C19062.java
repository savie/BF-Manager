package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19062 extends AbstractC19634 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f61753;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19062(C12921 c12921) {
        super(c12921);
        this.f61753 = c12921;
    }

    @Override // l.AbstractC19634
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo44167(C13840 c13840) {
        c13840.f43936.setText(R.string.MT_Protector);
        InterfaceC19533 interfaceC19533 = this.f61753.f41312;
        interfaceC19533.getClass();
        c13840.f43935.setVisibility(m44165(interfaceC19533.mo23582()) ? 4 : 0);
        c13840.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۨ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12921 c12921 = this.f26214.f61753;
                if (c12921.f41312 == null || !c12921.f41312.mo21703(29)) {
                    return;
                }
                C3125 c3125Mo23582 = c12921.f41312.mo23582();
                InterfaceC19533 interfaceC19534 = c12921.f41312;
                String str = C7116.f23455;
                interfaceC19534.mo23550(c3125Mo23582.mo10195().mo12043(1).mo12044(1, false).mo12042());
                c12921.f41352.m19527(1, c12921.getResources().getString(R.string.MT_Protector));
                c12921.f41348.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44165(C3125 c3125) {
        for (int i = 0; i < this.f63262.size(); i++) {
            if (c3125.f10119.containsKey(((C10683) this.f63262.get(i)).f33914.m46540())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC19634
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo44168(String str) {
        this.f61753.f41352.m19527(1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44166(List list) {
        this.f63262 = list;
        C12921 c12921 = this.f61753;
        InterfaceC19533 interfaceC19533 = c12921.f41312;
        interfaceC19533.getClass();
        C3125 c3125Mo23582 = interfaceC19533.mo23582();
        if (((AbstractCollection) list).isEmpty()) {
            c12921.f41352.m19527(1, c12921.getResources().getString(R.string.MT_Protector));
            return;
        }
        if (!m44165(c3125Mo23582)) {
            c12921.f41352.m19527(1, c12921.getResources().getString(R.string.MT_Protector));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C10683 c10683 = (C10683) list.get(i);
            if (c10683.f33914.m46544(c10683.f33916)) {
                c12921.f41352.m19527(1, c10683.f33915);
                return;
            }
        }
    }
}
