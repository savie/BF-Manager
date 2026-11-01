package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩷ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20855 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f67757;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f67758;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f67759;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f67761;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f67762;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17327 f67763;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18738 f67765;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f67766;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f67768;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f67770;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f67771;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f67764 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f67767 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67760 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f67769 = new ArrayList();

    public C20855(C18738 c18738, int i, String str, int i2, int i3, int i4, int i5, int i6, HashSet hashSet) {
        this.f67765 = c18738;
        this.f67759 = i;
        this.f67770 = str;
        this.f67771 = i2;
        this.f67766 = i3;
        this.f67761 = i4;
        this.f67758 = i5;
        this.f67757 = i6;
        this.f67768 = hashSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46877() {
        C10272 c10272 = new C10272();
        ArrayList arrayList = this.f67760;
        C23846.sort(arrayList, c10272);
        this.f67762 = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = this.f67769;
            if (arrayList2.size() >= this.f67771) {
                return;
            }
            C8861 c8861 = (C8861) arrayList.get(i);
            arrayList2.add(C22703.m50286(this.f67765, c8861.f30404, c8861.f30405, this.f67766, this.f67761, this.f67758, this.f67757, this.f67768, this.f67764));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46876() {
        ArrayList arrayList = new ArrayList(this.f67767);
        C23846.sort(arrayList, new C7449());
        return arrayList;
    }
}
