package l;

import java.util.Collections;

/* JADX INFO: renamed from: l.ۚ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5666 extends AbstractC4254 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f19343 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19344;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19345;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19346;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15550(C2460 c2460) throws C13428 {
        if (!this.f19344) {
            int iM7516 = c2460.m7516();
            int i = (iM7516 >> 4) & 15;
            this.f19346 = i;
            InterfaceC8011 interfaceC8011 = this.f15367;
            if (i == 2) {
                int i2 = f19343[(iM7516 >> 2) & 3];
                C10471 c10471 = new C10471();
                c10471.m26521("video/x-flv");
                c10471.m26533("audio/mpeg");
                c10471.m26494(1);
                c10471.m26511(i2);
                interfaceC8011.mo8116(c10471.m26497());
                this.f19345 = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C10471 c10472 = new C10471();
                c10472.m26521("video/x-flv");
                c10472.m26533(str);
                c10472.m26494(1);
                c10472.m26511(8000);
                interfaceC8011.mo8116(c10472.m26497());
                this.f19345 = true;
            } else if (i != 10) {
                throw new C13428("Audio format not supported: " + this.f19346);
            }
            this.f19344 = true;
            return true;
        }
        c2460.m7535(1);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15549(long j, C2460 c2460) {
        int i = this.f19346;
        InterfaceC8011 interfaceC8011 = this.f15367;
        if (i == 2) {
            int iM7503 = c2460.m7503();
            interfaceC8011.mo8112(iM7503, c2460);
            this.f15367.mo8114(j, 1, iM7503, 0, null);
            return true;
        }
        int iM7516 = c2460.m7516();
        if (iM7516 == 0 && !this.f19345) {
            int iM7504 = c2460.m7503();
            byte[] bArr = new byte[iM7504];
            c2460.m7507(0, iM7504, bArr);
            C17369 c17369M16484 = C6080.m16484(new C11634(bArr, iM7504), false);
            C10471 c10471 = new C10471();
            c10471.m26521("video/x-flv");
            c10471.m26533("audio/mp4a-latm");
            c10471.m26502(c17369M16484.f55268);
            c10471.m26494(c17369M16484.f55266);
            c10471.m26511(c17369M16484.f55267);
            c10471.m26503(Collections.singletonList(bArr));
            interfaceC8011.mo8116(c10471.m26497());
            this.f19345 = true;
            return false;
        }
        if (this.f19346 == 10 && iM7516 != 1) {
            return false;
        }
        int iM7505 = c2460.m7503();
        interfaceC8011.mo8112(iM7505, c2460);
        this.f15367.mo8114(j, 1, iM7505, 0, null);
        return true;
    }
}
