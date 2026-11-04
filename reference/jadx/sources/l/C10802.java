package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10802 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34279;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f34280;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34281;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34282;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f34283;

    public C10802(C22737 c22737, int i) {
        this.f34283 = c22737;
        this.f34280 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC19819 m27535(C10802 c10802) {
        C22737 c22737 = c10802.f34283;
        return new C7403(c10802, c22737.f73785, c10802.f34280, c22737.f73782);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m27537() {
        if (this.f34282 == 0) {
            C22737 c22737 = this.f34283;
            C8565 c8565M8724 = c22737.f73785.m55818().m8724(this.f34280);
            for (int i = 0; i < c22737.f73782; i++) {
                c8565M8724.m22996();
            }
            this.f34282 = c8565M8724.m23001();
        }
        return this.f34282;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Iterator m27538(C10802 c10802) {
        C22737 c22737 = c10802.f34283;
        return new C14114(c10802, c22737.f73785, c10802.m27537(), c22737.f73783);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m27532() {
        if (this.f34279 == 0) {
            C22737 c22737 = this.f34283;
            C8565 c8565M8724 = c22737.f73785.m55818().m8724(m27537());
            for (int i = 0; i < c22737.f73783; i++) {
                c8565M8724.m22996();
            }
            this.f34279 = c8565M8724.m23001();
        }
        return this.f34279;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m27533(C10802 c10802) {
        C22737 c22737 = c10802.f34283;
        return new C4837(c10802, c22737.f73785, c10802.m27532(), c22737.f73776);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Iterator m27540(C10802 c10802) {
        C22737 c22737 = c10802.f34283;
        C24975 c24975 = c22737.f73785;
        if (c10802.f34281 == 0) {
            C8565 c8565M8724 = c24975.m55818().m8724(c10802.m27532());
            for (int i = 0; i < c22737.f73776; i++) {
                c8565M8724.m22996();
            }
            c10802.f34281 = c8565M8724.m23001();
        }
        return new C21991(c24975, c10802.f34281, c22737.f73781);
    }
}
