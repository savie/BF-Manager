package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22294 extends C14534 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6771 f72833;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22294(C6771 c6771, C11992 c11992, InterfaceC3710 interfaceC3710) {
        super(c11992, interfaceC3710);
        this.f72833 = c6771;
    }

    @Override // l.C14534, l.InterfaceC3710
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) arrayList.get(i);
            if (interfaceC6533.getName().equals("name") && interfaceC6533.getValue().mo2656() == 23) {
                InterfaceC10975 value = interfaceC6533.getValue();
                C6771 c6771 = this.f72833;
                if (c6771.f22864 != null) {
                    String strSubstring = c6771.f22864.substring(c6771.f22864.lastIndexOf(36) + 1);
                    if (!strSubstring.isEmpty() && strSubstring.indexOf(47) == -1) {
                        char cCharAt = strSubstring.charAt(0);
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            strSubstring = strSubstring.substring(1);
                        }
                        value = new C13828(strSubstring);
                    }
                }
                arrayList.set(i, new C5360(value));
            }
        }
        return C6771.m18357(arrayList);
    }
}
