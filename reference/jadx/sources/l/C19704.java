package l;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩴۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19704 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f63440;

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        String strSubstring;
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) obj;
        boolean z = true;
        if (!interfaceC2386.mo8092() && !interfaceC2386.isDirectory()) {
            ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f63440;
            HashSet hashSet = viewOnClickListenerC11499.f36171;
            String name = interfaceC2386.getName();
            if (name == null) {
                int i = C7605.f25109;
                strSubstring = null;
            } else {
                int iM20780 = C7605.m20780(name);
                strSubstring = iM20780 == -1 ? "" : name.substring(iM20780 + 1);
            }
            C15243.m36591(strSubstring, "getExtension(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            C15243.m36591(lowerCase, "toLowerCase(...)");
            if (!hashSet.contains(lowerCase)) {
                for (String str : viewOnClickListenerC11499.f36181) {
                    String name2 = interfaceC2386.getName();
                    C15243.m36591(name2, "getName(...)");
                    if (C0878.m3579(name2, str, true)) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
