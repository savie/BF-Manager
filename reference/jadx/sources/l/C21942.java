package l;

import com.alipay.sdk.m.n.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes.dex */
public final class C21942 implements InterfaceC2833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f70817;

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo8155(String str) {
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8153(String str) {
        List list;
        C15243.m36590(str, "filterText");
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f70817;
        if (C15243.m36589((Object) viewOnClickListenerC11499.f36189, (Object) str)) {
            return;
        }
        viewOnClickListenerC11499.f36189 = str;
        if (str.length() == 0) {
            list = viewOnClickListenerC11499.f36196;
        } else {
            List list2 = viewOnClickListenerC11499.f36196;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
                if (!interfaceC2386.mo8092()) {
                    String name = interfaceC2386.getName();
                    C15243.m36591(name, "getName(...)");
                    if (C0878.m3576((CharSequence) name, (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC11499.f36195 = list;
        viewOnClickListenerC11499.f36178.m22362(false);
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8154(EnumC8799 enumC8799) {
        C15243.m36590(enumC8799, c.a);
        if (enumC8799.m23629()) {
            return;
        }
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f70817;
        if (viewOnClickListenerC11499.f36189.length() > 0) {
            viewOnClickListenerC11499.f36189 = "";
            viewOnClickListenerC11499.f36195 = viewOnClickListenerC11499.f36196;
            viewOnClickListenerC11499.f36178.m22362(false);
        }
    }

    public C21942(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        this.f70817 = viewOnClickListenerC11499;
    }
}
