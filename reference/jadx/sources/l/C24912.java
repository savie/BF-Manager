package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4OR */
/* JADX INFO: loaded from: classes.dex */
public final class C24912 extends AbstractC15960 {
    @Override // l.AbstractC15960
    /* JADX INFO: renamed from: ۙ */
    public final void mo38080(C4028 c4028, C17452 c17452) {
        ArrayList arrayList = this.f51828;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            EnumC15214 enumC15214 = this.f51830;
            if (i < size) {
                c4028.m12993(enumC15214.f49669);
                AbstractC10739 abstractC10739M45393 = C19690.m45393(this.f51827, enumC15214);
                arrayList.set(i, abstractC10739M45393);
                abstractC10739M45393.m27352(c4028, i, c17452);
                i++;
            } else {
                c17452.m40953(enumC15214, arrayList);
                return;
            }
        }
    }
}
