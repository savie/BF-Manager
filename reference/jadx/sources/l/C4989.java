package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۙܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17333;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13192 f17336;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17337;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f17338;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f17339;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f17341;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f17343;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1304 f17344;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f17345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f17346;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f17347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f17335 = new HashMap();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f17340 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17334 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17342 = new ArrayList();

    public C4989(C1304 c1304, int i, String str, int i2, int i3, int i4, int i5, int i6, HashSet hashSet) {
        this.f17344 = c1304;
        this.f17333 = i;
        this.f17339 = str;
        this.f17347 = i2;
        this.f17341 = i3;
        this.f17343 = i4;
        this.f17345 = i5;
        this.f17338 = i6;
        this.f17346 = hashSet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15205() {
        C7270 c7270 = new C7270();
        ArrayList arrayList = this.f17334;
        C12884.sort(arrayList, c7270);
        this.f17337 = arrayList.size();
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = this.f17342;
            if (arrayList2.size() >= this.f17347) {
                return;
            }
            C8761 c8761 = (C8761) arrayList.get(i);
            arrayList2.add(C7972.m21720(this.f17344, c8761.f28474, c8761.f28475, this.f17341, this.f17343, this.f17345, this.f17338, this.f17346, this.f17335));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15204() {
        ArrayList arrayList = new ArrayList(this.f17340);
        C12884.sort(arrayList, new C13981());
        return arrayList;
    }
}
