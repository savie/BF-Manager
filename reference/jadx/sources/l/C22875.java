package l;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22875 extends C10194 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5721 f74331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22875(C5721 c5721, C24404 c24404, InterfaceC7886 interfaceC7886) {
        super(c24404, interfaceC7886);
        this.f74331 = c5721;
    }

    @Override // l.C10194, l.InterfaceC7886
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) arrayList.get(i);
            if (interfaceC19073.getName().equals("name") && interfaceC19073.getValue().mo5414() == 23) {
                InterfaceC16791 value = interfaceC19073.getValue();
                C5721 c5721 = this.f74331;
                if (c5721.f19730 != null) {
                    String strSubstring = c5721.f19730.substring(c5721.f19730.lastIndexOf(36) + 1);
                    if (!strSubstring.isEmpty() && strSubstring.indexOf(47) == -1) {
                        char cCharAt = strSubstring.charAt(0);
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            strSubstring = strSubstring.substring(1);
                        }
                        value = new C14055(strSubstring);
                    }
                }
                arrayList.set(i, new C10940(value));
            }
        }
        return C5721.m16765(arrayList);
    }
}
