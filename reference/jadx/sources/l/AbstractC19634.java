package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19634 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f63261;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f63262 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo44167(C13840 c13840);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo44168(String str);

    public AbstractC19634(C12921 c12921) {
        this.f63261 = c12921;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C13840(LayoutInflater.from(this.f63261.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void onBindViewHolder(C13840 c13840, int i) {
        final InterfaceC19533 interfaceC19533 = this.f63261.f41312;
        if (interfaceC19533 == null) {
            return;
        }
        if (i == 0) {
            mo44167(c13840);
            return;
        }
        final C10683 c10683 = (C10683) this.f63262.get(i - 1);
        final C16549 c16549M46540 = c10683.f33914.m46540();
        boolean z = interfaceC19533.mo23582().f10119.get(c16549M46540) != null && c10683.f33914.m46544(c10683.f33916);
        c13840.f43936.setText(c10683.f33915);
        c13840.f43935.setVisibility(z ? 0 : 4);
        c13840.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۛ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC19533 interfaceC19534 = interfaceC19533;
                if (interfaceC19534.mo21703(29)) {
                    C23263 c23263Mo10195 = interfaceC19534.mo23582().mo10195();
                    C10683 c10684 = c10683;
                    interfaceC19534.mo23550(c23263Mo10195.mo12046(new C17295(c16549M46540, AbstractC1928.of((Object) Integer.valueOf(c10684.f33916)))).mo12044(c10684.f33914.m46543(), false).mo12042());
                    String str = c10684.f33915;
                    AbstractC19634 abstractC19634 = this.f73095;
                    abstractC19634.mo44168(str);
                    abstractC19634.f63261.f41348.dismiss();
                }
            }
        });
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        if (this.f63262.isEmpty()) {
            return 0;
        }
        return this.f63262.size() + 1;
    }
}
