package l;

import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23191 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f75257;

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        String strSubstring;
        InterfaceC2557 interfaceC2557 = (InterfaceC2557) obj;
        boolean z = true;
        if (!interfaceC2557.mo7969() && !interfaceC2557.isDirectory()) {
            ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f75257;
            HashSet hashSet = viewOnClickListenerC8374.f29055;
            String name = interfaceC2557.getName();
            if (name == null) {
                int i = C21420.f69633;
                strSubstring = null;
            } else {
                int iM47958 = C21420.m47958(name);
                strSubstring = iM47958 == -1 ? "" : name.substring(iM47958 + 1);
            }
            C13465.m32967(strSubstring, "getExtension(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            C13465.m32967(lowerCase, "toLowerCase(...)");
            if (!hashSet.contains(lowerCase)) {
                for (String str : viewOnClickListenerC8374.f29062) {
                    String name2 = interfaceC2557.getName();
                    C13465.m32967(name2, "getName(...)");
                    if (C12529.m31139(name2, str, true)) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
