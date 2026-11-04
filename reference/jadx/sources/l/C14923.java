package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public class C14923 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8957 f48743;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8957 f48744;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14177 f48745;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f48746 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13652 f48747;

    public C14923(C21637 c21637, C13652 c13652) {
        this.f48747 = c13652;
        this.f48745 = c21637.f69083;
        C8957 c8957 = C14177.f44826;
        this.f48743 = c8957;
        this.f48744 = c8957;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8957 m35905(int i) {
        if (i == 0) {
            return this.f48744;
        }
        ArrayList arrayList = this.f48746;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(this.f48747.m33426());
        }
        return (C8957) arrayList.get(i - 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8957 m35906() {
        return this.f48743;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35902() {
        this.f48743 = this.f48744;
        ArrayList arrayList = this.f48746;
        if (!arrayList.isEmpty()) {
            this.f48744 = (C8957) arrayList.remove(0);
        } else {
            this.f48744 = this.f48747.m33426();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8957 m35903() {
        C8957 c8957 = this.f48744;
        int i = c8957.f29214;
        EnumC7466 enumC7466 = c8957.f29212;
        if (enumC7466.f24714.length() < 2 || enumC7466.f24715 != EnumC2991.DEFAULT) {
            throw new AssertionError("Cant split" + enumC7466);
        }
        String strSubstring = enumC7466.f24714.substring(0, 1);
        C14177 c14177 = this.f48745;
        EnumC7466 enumC7466M34465 = c14177.m34465(strSubstring);
        EnumC7466 enumC7466M34466 = c14177.m34465(enumC7466.f24714.substring(1));
        if (enumC7466M34465 == null || enumC7466M34466 == null) {
            throw new AssertionError("Cant split - bad subtokens");
        }
        C8957[] c8957Arr = {new C8957(enumC7466M34465, i, enumC7466M34465.f24714.length() + i, c8957.f29211), new C8957(enumC7466M34466, enumC7466M34465.f24714.length() + i, c8957.f29213, null)};
        this.f48743 = c8957Arr[0];
        C8957 c8958 = c8957Arr[1];
        this.f48744 = c8958;
        return c8958;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1829 m35904() {
        return this.f48747.mo31480();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35900() {
        return this.f48747.f43355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35901(int i) {
        this.f48747.f43355 = i;
    }
}
