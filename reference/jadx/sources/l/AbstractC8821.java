package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8821 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f30336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f30337 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo22955(C21520 c21520);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo22957(String str);

    public AbstractC8821(C7409 c7409) {
        this.f30336 = c7409;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21520(LayoutInflater.from(this.f30336.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void onBindViewHolder(C21520 c21520, int i) {
        final InterfaceC10161 interfaceC10161 = this.f30336.f24662;
        if (interfaceC10161 == null) {
            return;
        }
        if (i == 0) {
            mo22955(c21520);
            return;
        }
        final C8115 c8115 = (C8115) this.f30337.get(i - 1);
        final C17216 c17216M5615 = c8115.f28437.m5615();
        boolean z = interfaceC10161.mo25826().f47176.get(c17216M5615) != null && c8115.f28437.m5619(c8115.f28439);
        c21520.f69920.setText(c8115.f28438);
        c21520.f69919.setVisibility(z ? 0 : 4);
        c21520.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۤܰ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC10161 interfaceC10162 = interfaceC10161;
                if (interfaceC10162.mo25841(29)) {
                    C23567 c23567Mo5308 = interfaceC10162.mo25826().mo5308();
                    C8115 c8116 = c8115;
                    interfaceC10162.mo25817(c23567Mo5308.mo34365(new C5927(c17216M5615, AbstractC22433.of((Object) Integer.valueOf(c8116.f28439)))).mo34363(c8116.f28437.m5618(), false).mo34361());
                    String str = c8116.f28438;
                    AbstractC8821 abstractC8821 = this.f62551;
                    abstractC8821.mo22957(str);
                    abstractC8821.f30336.f24630.dismiss();
                }
            }
        });
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        if (this.f30337.isEmpty()) {
            return 0;
        }
        return this.f30337.size() + 1;
    }
}
