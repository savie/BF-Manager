package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0766 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f3082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f3083;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0766 f3085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f3086;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3084 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f3087 = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3082.compareTo(((C0766) obj).f3082);
    }

    public C0766(ActivityC3588 activityC3588, String str, String str2, C0766 c0766) {
        this.f3086 = activityC3588;
        this.f3082 = str;
        this.f3083 = str2;
        this.f3085 = c0766;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0766 m3295(String str) {
        ActivityC3588 activityC3588 = this.f3086;
        boolean z = activityC3588.f13204.f7893;
        String str2 = this.f3083;
        ArrayList<C0766> arrayList = this.f3084;
        if (z) {
            if (str.startsWith("android/support/")) {
                return m3295("android/support").m3295(str.substring(16));
            }
            String strReplace = str.replace("/", ".");
            for (C0766 c0766 : arrayList) {
                if (c0766.f3082.equals(strReplace)) {
                    return c0766;
                }
            }
            C0766 c0767 = new C0766(activityC3588, strReplace, str2 + str + '/', this);
            arrayList.add(c0767);
            return c0767;
        }
        if (str.indexOf(47) == -1) {
            for (C0766 c0768 : arrayList) {
                if (c0768.f3082.equals(str)) {
                    return c0768;
                }
            }
            C0766 c0769 = new C0766(activityC3588, str, str2 + str + '/', this);
            arrayList.add(c0769);
            return c0769;
        }
        C0766 c0766M3295 = this;
        for (String str3 : str.split("/")) {
            c0766M3295 = c0766M3295.m3295(str3);
        }
        return c0766M3295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3296() {
        ArrayList arrayList = this.f3084;
        Collections.sort(arrayList);
        Collections.sort(this.f3087);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0766) it.next()).m3296();
        }
    }
}
