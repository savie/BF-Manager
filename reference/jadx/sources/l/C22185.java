package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩹ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8P7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22185 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f72560;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0966 f72561 = new C0966(new C21007(1, this));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011[] f72562;

    public C22185(List list) {
        this.f72560 = list;
        this.f72562 = new InterfaceC8011[list.size()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49213(InterfaceC15690 interfaceC15690, C8074 c8074) {
        int i = 0;
        while (true) {
            InterfaceC8011[] interfaceC8011Arr = this.f72562;
            if (i >= interfaceC8011Arr.length) {
                return;
            }
            c8074.m21286();
            InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 3);
            C7648 c7648 = (C7648) this.f72560.get(i);
            String str = c7648.f25265;
            C2023.m6506("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strM21288 = c7648.f25275;
            if (strM21288 == null) {
                strM21288 = c8074.m21288();
            }
            C10471 c10471 = new C10471();
            c10471.m26516(strM21288);
            c10471.m26521("video/mp2t");
            c10471.m26533(str);
            c10471.m26530(c7648.f25243);
            c10471.m26509(c7648.f25269);
            c10471.m26499(c7648.f25247);
            c10471.m26503(c7648.f25268);
            interfaceC8011Mo7684.mo8116(c10471.m26497());
            interfaceC8011Arr[i] = interfaceC8011Mo7684;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49211(int i) {
        this.f72561.m3759(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49212(long j, C2460 c2460) {
        this.f72561.m3760(j, c2460);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49214() {
        this.f72561.m3762();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49210() {
        this.f72561.m3762();
    }
}
