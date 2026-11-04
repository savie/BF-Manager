package l;

/* JADX INFO: renamed from: l.ۨ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K17Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C12036 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        boolean z;
        c12915.m31970("local");
        String[] strArr = (String[]) C1170.stream(c12915.m31982()).map(new C4527(2)).toArray(new C17280(1));
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else {
                if (!strArr[i].toLowerCase().endsWith(".apk")) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        C3259.m10633(c12915.m31983(), strArr, strArr.length == 1 ? C18685.m43474(C14584.m35193(strArr[0], new String[0])) : null, z, false);
    }
}
