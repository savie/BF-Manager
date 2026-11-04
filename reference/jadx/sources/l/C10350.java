package l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MenuItem;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10350 implements InterfaceC16025, InterfaceC1733, InterfaceC21436, InterfaceC21100, InterfaceC11572, InterfaceC15379 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32968;

    public /* synthetic */ C10350(int i, Object obj) {
        this.f32967 = i;
        this.f32968 = obj;
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        switch (this.f32967) {
            case 1:
                ActivityC22957.m51760((ActivityC22957) this.f32968, i, intent);
                break;
            default:
                Main.m95((Main) this.f32968, i, intent);
                break;
        }
    }

    @Override // l.InterfaceC11572
    public List accept(Object obj) {
        C24999 c24999 = (C24999) this.f32968;
        try {
            String strMo7710 = ((InterfaceC16200) obj).mo7710();
            if (strMo7710 == null) {
                return null;
            }
            C4245 c4245 = c24999.get();
            c4245.m13568reset((CharSequence) strMo7710);
            if (!C7680.m20920(c4245)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            do {
                C15301 c15301 = new C15301(0);
                c15301.f50019 = c4245.start();
                int iEnd = c4245.end();
                c15301.f50022 = iEnd;
                c15301.m36738(c15301.f50019, iEnd, (CharSequence) strMo7710);
                arrayList.add(c15301);
                if (!C7680.m20920(c4245)) {
                    break;
                }
            } while (arrayList.size() < 2000);
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = (ArrayList) this.f32968;
        int i = C21447.f68403;
        C21576.m49067((CharSequence) arrayList.get(menuItem.getItemId()));
        return true;
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ */
    public void mo14029(AbstractC22044 abstractC22044) {
        abstractC22044.m49849((byte[]) this.f32968);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22351((C18716) this.f32968);
    }

    @Override // l.InterfaceC15379
    /* JADX INFO: renamed from: ۙ */
    public void mo5773(C13778 c13778) {
        C14480 c14480 = (C14480) this.f32968;
        C15243.m36590(c13778, "response");
        if (c13778.m33676()) {
            c14480.m34956(R.string.MT_Protector);
        } else {
            c14480.m34957(C1364.m5010(c13778, R.string.MT_Protector), false);
        }
    }
}
