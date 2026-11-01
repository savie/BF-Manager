package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public class C21741 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16907 f70467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20330 f70468;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16802 f70469;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20330 f70470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70471 = new ArrayList();

    public C21741(C18213 c18213, C16907 c16907) {
        this.f70467 = c16907;
        this.f70469 = c18213.f58180;
        C20330 c20330 = C16802.f53796;
        this.f70468 = c20330;
        this.f70470 = c20330;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20330 m48507(int i) {
        if (i == 0) {
            return this.f70470;
        }
        ArrayList arrayList = this.f70471;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(this.f70467.m39593());
        }
        return (C20330) arrayList.get(i - 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20330 m48501() {
        return this.f70468;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48505() {
        this.f70468 = this.f70470;
        ArrayList arrayList = this.f70471;
        if (!arrayList.isEmpty()) {
            this.f70470 = (C20330) arrayList.remove(0);
        } else {
            this.f70470 = this.f70467.m39593();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20330 m48504() {
        C20330 c20330 = this.f70470;
        int i = c20330.f65847;
        EnumC0573 enumC0573 = c20330.f65849;
        if (enumC0573.f2497.length() < 2 || enumC0573.f2498 != EnumC16097.DEFAULT) {
            throw new AssertionError("Cant split" + enumC0573);
        }
        String strSubstring = enumC0573.f2497.substring(0, 1);
        C16802 c16802 = this.f70469;
        EnumC0573 enumC0573M39451 = c16802.m39451(strSubstring);
        EnumC0573 enumC0573M39452 = c16802.m39451(enumC0573.f2497.substring(1));
        if (enumC0573M39451 == null || enumC0573M39452 == null) {
            throw new AssertionError("Cant split - bad subtokens");
        }
        C20330[] c20330Arr = {new C20330(enumC0573M39451, i, enumC0573M39451.f2497.length() + i, c20330.f65848), new C20330(enumC0573M39452, enumC0573M39451.f2497.length() + i, c20330.f65850, null)};
        this.f70468 = c20330Arr[0];
        C20330 c20331 = c20330Arr[1];
        this.f70470 = c20331;
        return c20331;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9831 m48506() {
        return this.f70467.mo11643();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48502() {
        return this.f70467.f54075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48503(int i) {
        this.f70467.f54075 = i;
    }
}
