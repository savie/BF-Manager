package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩵ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19247 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11734 f62187;

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        ((C9183) c21422.m47960()).m23625();
        return true;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        c21422.m47963(b.k);
        C11734 c11734 = new C11734(c21422.m47980());
        this.f62187 = c11734;
        c11734.f39446.setText(R.string.MT_Protector);
        this.f62187.f39439.setText(AbstractC4674.m12941(c21422));
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21258(this.f62187.f39440);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۚ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f48971.mo6949(c21422);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        final LinkedList linkedList = new LinkedList();
        for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
            if (interfaceC2557.isDirectory()) {
                this.f62187.f39438++;
                if (!interfaceC2557.mo7986()) {
                    linkedList.add(interfaceC2557.getPath());
                }
            } else {
                this.f62187.f39435++;
                if (!interfaceC2557.mo7986()) {
                    C11734 c11735 = this.f62187;
                    c11735.f39448 = interfaceC2557.getSize() + c11735.f39448;
                }
            }
        }
        C11734 c11736 = this.f62187;
        c11736.getClass();
        C16737.m39273(new RunnableC17894(3, c11736));
        if (linkedList.isEmpty()) {
            this.f62187.f39434.setVisibility(8);
        } else {
            C4716.f16636.execute(new Runnable() { // from class: l.᩸ۚ֨
                @Override // java.lang.Runnable
                public final void run() {
                    C19247.m44199(this.f69492, c21422, linkedList, dialogInterfaceC19356M21269);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44199(C19247 c19247, C21422 c21422, LinkedList linkedList, DialogInterfaceC19356 dialogInterfaceC19356) {
        AbstractC12233 abstractC12233 = (AbstractC12233) c21422.m47960().mo13029();
        while (!linkedList.isEmpty() && dialogInterfaceC19356.m44375()) {
            try {
                for (InterfaceC2557 interfaceC2557 : abstractC12233.mo10263((String) linkedList.removeFirst(), true)) {
                    if (interfaceC2557.isDirectory()) {
                        c19247.f62187.f39438++;
                        if (!interfaceC2557.mo7986()) {
                            linkedList.addLast(interfaceC2557.getPath());
                        }
                    } else {
                        c19247.f62187.f39435++;
                        if (!interfaceC2557.mo7986()) {
                            C11734 c11734 = c19247.f62187;
                            c11734.f39448 = interfaceC2557.getSize() + c11734.f39448;
                        }
                    }
                }
                C11734 c11735 = c19247.f62187;
                c11735.getClass();
                C16737.m39273(new RunnableC17894(3, c11735));
            } catch (IOException e) {
                c21422.m47980().m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C7958.class);
        c10142.m25772(c21422.m47979());
        c10142.m25777(c21422);
        c10142.m25773(c21422.m47960());
        c10142.m25768("deleteFrom", c21422.m47976());
        C11734 c11734 = this.f62187;
        c10142.m25764(c11734.f39435 + c11734.f39438, "minTotal");
        c10142.m25763();
    }
}
