package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18JT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f34819;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0966 f34820;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011[] f34821;

    public C10191(List list) {
        this.f34819 = list;
        this.f34821 = new InterfaceC8011[list.size()];
        C0966 c0966 = new C0966(new InterfaceC22134() { // from class: l.ۡۡܰ
            @Override // l.InterfaceC22134
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo22853(long j, C2460 c2460) {
                C12867.m31908(j, c2460, this.f30199.f34821);
            }
        });
        this.f34820 = c0966;
        c0966.m3759(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25968(InterfaceC15690 interfaceC15690, C8074 c8074) {
        int i = 0;
        while (true) {
            InterfaceC8011[] interfaceC8011Arr = this.f34821;
            if (i >= interfaceC8011Arr.length) {
                return;
            }
            c8074.m21286();
            InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 3);
            C7648 c7648 = (C7648) this.f34819.get(i);
            String str = c7648.f25265;
            C2023.m6506("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C10471 c10471 = new C10471();
            c10471.m26516(c8074.m21288());
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
    public final void m25967(long j, C2460 c2460) {
        if (c2460.m7503() < 9) {
            return;
        }
        int iM7499 = c2460.m7499();
        int iM74910 = c2460.m7499();
        int iM7516 = c2460.m7516();
        if (iM7499 == 434 && iM74910 == 1195456820 && iM7516 == 3) {
            this.f34820.m3760(j, c2460);
        }
    }
}
