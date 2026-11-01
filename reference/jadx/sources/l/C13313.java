package l;

import com.alipay.sdk.m.n.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13313 implements InterfaceC5673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f44191;

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2812(String str) {
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2810(String str) {
        List list;
        C13465.m32966(str, "filterText");
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f44191;
        if (C13465.m32965((Object) viewOnClickListenerC8374.f29075, (Object) str)) {
            return;
        }
        viewOnClickListenerC8374.f29075 = str;
        if (str.length() == 0) {
            list = viewOnClickListenerC8374.f29067;
        } else {
            List list2 = viewOnClickListenerC8374.f29067;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
                if (!interfaceC2557.mo7969()) {
                    String name = interfaceC2557.getName();
                    C13465.m32967(name, "getName(...)");
                    if (C12529.m31136((CharSequence) name, (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC8374.f29058 = list;
        viewOnClickListenerC8374.f29051.m8339(false);
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2811(EnumC22607 enumC22607) {
        C13465.m32966(enumC22607, c.a);
        if (enumC22607.m50115()) {
            return;
        }
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f44191;
        if (viewOnClickListenerC8374.f29075.length() > 0) {
            viewOnClickListenerC8374.f29075 = "";
            viewOnClickListenerC8374.f29058 = viewOnClickListenerC8374.f29067;
            viewOnClickListenerC8374.f29051.m8339(false);
        }
    }

    public C13313(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        this.f44191 = viewOnClickListenerC8374;
    }
}
