package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f25988 = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25989 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20921(InterfaceC19196 interfaceC19196) {
        this.f25989.add(new C10946("/", interfaceC19196));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20920(String str) {
        this.f25988 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10024 m20919() {
        ArrayList arrayList = new ArrayList();
        for (C10946 c10946 : this.f25989) {
            arrayList.add(new C8613(this.f25988, (String) c10946.f37217, (InterfaceC19196) c10946.f37218));
        }
        return new C10024(arrayList);
    }
}
