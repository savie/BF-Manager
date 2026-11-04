package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C15375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f50141 = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f50142 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36831(InterfaceC13138 interfaceC13138) {
        this.f50142.add(new C2310("/", interfaceC13138));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36830(String str) {
        this.f50141 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1952 m36829() {
        ArrayList arrayList = new ArrayList();
        for (C2310 c2310 : this.f50142) {
            arrayList.add(new C5681(this.f50141, (String) c2310.f7473, (InterfaceC13138) c2310.f7474));
        }
        return new C1952(arrayList);
    }
}
