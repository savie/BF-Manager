package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8HT */
/* JADX INFO: loaded from: classes.dex */
public final class C23201 implements InterfaceC15440 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f75302 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75303;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f75304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f75305;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011[] f75306;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75307;

    public C23201(List list) {
        this.f75304 = list;
        this.f75306 = new InterfaceC8011[list.size()];
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2887() {
        this.f75307 = false;
        this.f75302 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2890(InterfaceC15690 interfaceC15690, C8074 c8074) {
        int i = 0;
        while (true) {
            InterfaceC8011[] interfaceC8011Arr = this.f75306;
            if (i >= interfaceC8011Arr.length) {
                return;
            }
            C21479 c21479 = (C21479) this.f75304.get(i);
            c8074.m21286();
            InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 3);
            C10471 c10471 = new C10471();
            c10471.m26516(c8074.m21288());
            c10471.m26521("video/mp2t");
            c10471.m26533("application/dvbsubs");
            c10471.m26503(Collections.singletonList(c21479.f69793));
            c10471.m26509(c21479.f69794);
            interfaceC8011Mo7684.mo8116(c10471.m26497());
            interfaceC8011Arr[i] = interfaceC8011Mo7684;
            i++;
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2888(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f75307 = true;
        this.f75302 = j;
        this.f75305 = 0;
        this.f75303 = 2;
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2891(boolean z) {
        if (this.f75307) {
            C2023.m6510(this.f75302 != -9223372036854775807L);
            for (InterfaceC8011 interfaceC8011 : this.f75306) {
                interfaceC8011.mo8114(this.f75302, 1, this.f75305, 0, null);
            }
            this.f75307 = false;
        }
    }

    @Override // l.InterfaceC15440
    /* JADX INFO: renamed from: ۙ */
    public final void mo2889(C2460 c2460) {
        boolean z;
        boolean z2;
        if (this.f75307) {
            if (this.f75303 == 2) {
                if (c2460.m7503() == 0) {
                    z2 = false;
                } else {
                    if (c2460.m7516() != 32) {
                        this.f75307 = false;
                    }
                    this.f75303--;
                    z2 = this.f75307;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f75303 == 1) {
                if (c2460.m7503() == 0) {
                    z = false;
                } else {
                    if (c2460.m7516() != 0) {
                        this.f75307 = false;
                    }
                    this.f75303--;
                    z = this.f75307;
                }
                if (!z) {
                    return;
                }
            }
            int iM7500 = c2460.m7500();
            int iM7503 = c2460.m7503();
            for (InterfaceC8011 interfaceC8011 : this.f75306) {
                c2460.m7510(iM7500);
                interfaceC8011.mo8112(iM7503, c2460);
            }
            this.f75305 += iM7503;
        }
    }
}
