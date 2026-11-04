package l;

import java.util.Collections;

/* JADX INFO: renamed from: l.֡ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C0395 extends AbstractC1141 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f1941 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1942;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1943;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1944;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2205(C21287 c21287) throws C10089 {
        if (!this.f1944) {
            int iM48493 = c21287.m48493();
            int i = (iM48493 >> 4) & 15;
            this.f1943 = i;
            InterfaceC22024 interfaceC22024 = this.f4231;
            if (i == 2) {
                int i2 = f1941[(iM48493 >> 2) & 3];
                C20124 c20124 = new C20124();
                c20124.m46327("video/x-flv");
                c20124.m46315("audio/mpeg");
                c20124.m46329(1);
                c20124.m46332(i2);
                interfaceC22024.mo14384(c20124.m46295());
                this.f1942 = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C20124 c20125 = new C20124();
                c20125.m46327("video/x-flv");
                c20125.m46315(str);
                c20125.m46329(1);
                c20125.m46332(8000);
                interfaceC22024.mo14384(c20125.m46295());
                this.f1942 = true;
            } else if (i != 10) {
                throw new C10089("Audio format not supported: " + this.f1943);
            }
            this.f1944 = true;
            return true;
        }
        c21287.m48503(1);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2204(long j, C21287 c21287) throws C2970 {
        int i = this.f1943;
        InterfaceC22024 interfaceC22024 = this.f4231;
        if (i == 2) {
            int iM48486 = c21287.m48486();
            interfaceC22024.mo14381(iM48486, c21287);
            this.f4231.mo14383(j, 1, iM48486, 0, null);
            return true;
        }
        int iM48493 = c21287.m48493();
        if (iM48493 == 0 && !this.f1942) {
            int iM48487 = c21287.m48486();
            byte[] bArr = new byte[iM48487];
            c21287.m48490(0, iM48487, bArr);
            C24834 c24834M39348 = C16628.m39348(new C14573(bArr, iM48487), false);
            C20124 c20124 = new C20124();
            c20124.m46327("video/x-flv");
            c20124.m46315("audio/mp4a-latm");
            c20124.m46300(c24834M39348.f80327);
            c20124.m46329(c24834M39348.f80325);
            c20124.m46332(c24834M39348.f80326);
            c20124.m46301(Collections.singletonList(bArr));
            interfaceC22024.mo14384(c20124.m46295());
            this.f1942 = true;
            return false;
        }
        if (this.f1943 == 10 && iM48493 != 1) {
            return false;
        }
        int iM48488 = c21287.m48486();
        interfaceC22024.mo14381(iM48488, c21287);
        this.f4231.mo14383(j, 1, iM48488, 0, null);
        return true;
    }
}
