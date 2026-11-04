package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C22211 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22211 f71548;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f71549;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f71551;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f71552;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71550 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f71553 = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f71551.compareTo(((C22211) obj).f71551);
    }

    public C22211(ActivityC22957 activityC22957, String str, String str2, C22211 c22211) {
        this.f71552 = activityC22957;
        this.f71551 = str;
        this.f71549 = str2;
        this.f71548 = c22211;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22211 m50237(String str) {
        ActivityC22957 activityC22957 = this.f71552;
        boolean z = activityC22957.f74569.f24306;
        String str2 = this.f71549;
        ArrayList<C22211> arrayList = this.f71550;
        if (z) {
            if (str.startsWith("android/support/")) {
                return m50237("android/support").m50237(str.substring(16));
            }
            String strReplace = str.replace("/", ".");
            for (C22211 c22211 : arrayList) {
                if (c22211.f71551.equals(strReplace)) {
                    return c22211;
                }
            }
            C22211 c22212 = new C22211(activityC22957, strReplace, str2 + str + '/', this);
            arrayList.add(c22212);
            return c22212;
        }
        if (str.indexOf(47) == -1) {
            for (C22211 c22213 : arrayList) {
                if (c22213.f71551.equals(str)) {
                    return c22213;
                }
            }
            C22211 c22214 = new C22211(activityC22957, str, str2 + str + '/', this);
            arrayList.add(c22214);
            return c22214;
        }
        C22211 c22211M50237 = this;
        for (String str3 : str.split("/")) {
            c22211M50237 = c22211M50237.m50237(str3);
        }
        return c22211M50237;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50238() {
        ArrayList arrayList = this.f71550;
        Collections.sort(arrayList);
        Collections.sort(this.f71553);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C22211) it.next()).m50238();
        }
    }
}
