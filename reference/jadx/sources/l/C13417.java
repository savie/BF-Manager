package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAW9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13417 extends AbstractC2832 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC8858 f44379;

    public C13417(C5655 c5655, InterfaceC8706 interfaceC8706, InterfaceC8858 interfaceC8858) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC8858.mo9699().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        super(c5655, interfaceC8706, sb.toString(), false);
        this.f44379 = interfaceC8858;
    }

    @Override // l.AbstractC2832, l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final List mo8585(C5655 c5655) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c5655.f19322.values().iterator();
        while (it.hasNext()) {
            for (C10124 c10124 : ((C19213) it.next()).mo20495()) {
                if (EnumC15236.STATIC.m36501(c10124.mo25750()) && c10124.equals(this.f44379)) {
                    arrayList.add(c10124);
                }
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "CustomMethodDecryptor[" + this.f44379 + "]";
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final String mo23640(int i, String str) {
        str.getClass();
        return (str.equals("Ljava/lang/CharSequence;") || str.equals("Ljava/lang/Object;")) ? "Ljava/lang/String;" : str;
    }
}
