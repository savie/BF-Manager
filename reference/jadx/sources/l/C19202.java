package l;

/* JADX INFO: renamed from: l.᩵ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K17Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C19202 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        boolean z;
        c21422.m47963("local");
        String[] strArr = (String[]) C9030.stream(c21422.m47979()).map(new C4686(1)).toArray(new C7913());
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
        C20874.m46911(c21422.m47965(), strArr, strArr.length == 1 ? C20240.m45747(C5553.m15313(strArr[0], new String[0])) : null, z, false);
    }
}
