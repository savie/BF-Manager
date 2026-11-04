package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: LAW9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20182 extends AbstractC5266 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC4859 f64816;

    public C20182(C22420 c22420, InterfaceC23517 interfaceC23517, InterfaceC4859 interfaceC4859) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC4859.mo6805().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        super(c22420, interfaceC23517, sb.toString(), false);
        this.f64816 = interfaceC4859;
    }

    @Override // l.AbstractC5266, l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final List mo12249(C22420 c22420) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c22420.f72611.values().iterator();
        while (it.hasNext()) {
            for (C5122 c5122 : ((C7447) it.next()).mo20405()) {
                if (EnumC2536.STATIC.m8459(c5122.mo13184()) && c5122.equals(this.f64816)) {
                    arrayList.add(c5122);
                }
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "CustomMethodDecryptor[" + this.f64816 + "]";
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final String mo33724(int i, String str) {
        str.getClass();
        return (str.equals("Ljava/lang/CharSequence;") || str.equals("Ljava/lang/Object;")) ? "Ljava/lang/String;" : str;
    }
}
