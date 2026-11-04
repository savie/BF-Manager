package l;

import bin.mt.plus.R;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۙۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4668 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12871 f16478;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16028 f16479;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16028 f16480;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23314 f16481;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16482;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f16483;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23314 f16484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16028 f16485;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13616 f16486;

    public C4668(ActivityC22568 activityC22568) {
        this.f16483 = activityC22568;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f16483, R.string.MT_Protector);
        this.f7780.m33188(new Runnable() { // from class: l.ᩳ۬ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                this.f61830.f16482 = true;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [l.ۖ۬ᩴ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        if (!this.f16482 && C1008.m3907(this.f16483.f72950, new BooleanSupplier() { // from class: l.ۢ۬ᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f32513.f16482;
            }
        }) && C1008.m3907(this.f16483.f72924, new BooleanSupplier() { // from class: l.֨۬ᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f4375.f16482;
            }
        })) {
            String string = this.f16483.f72934 == null ? null : this.f16483.f72934.getString("checkpoint");
            if (string != null) {
                C16028 c16028M38171 = C16028.m38171(string, new InterfaceC7509() { // from class: l.ۡ۬ᩴ
                    @Override // l.InterfaceC7509
                    /* JADX INFO: renamed from: ۫ */
                    public final boolean mo924() {
                        return this.f30532.f16482;
                    }
                });
                this.f16480 = c16028M38171;
                C12871 c12871M6030 = C1685.m6030(c16028M38171, C14584.m35193(this.f16483.f72950, new String[0]), C14584.m35193(this.f16483.f72924, new String[0]), new InterfaceC7509() { // from class: l.ۖ۬ᩴ
                    @Override // l.InterfaceC7509
                    /* JADX INFO: renamed from: ۫ */
                    public final boolean mo924() {
                        return this.f8573.f16482;
                    }
                });
                this.f16478 = c12871M6030;
                this.f16486 = c12871M6030.f41201;
                return;
            }
            this.f16479 = C16028.m38167();
            C23314 c23314M52455 = C23314.m52455(C14584.m35193(this.f16483.f72950, new String[0]), this.f16483.getCacheDir(), new BooleanSupplier() { // from class: l.۠۬ᩴ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f28271.f16482;
                }
            }, this.f16479);
            this.f16481 = c23314M52455;
            if (c23314M52455.m52456()) {
                ActivityC22568.m50802(this.f16479);
                this.f16479 = null;
            }
            if (this.f16482) {
                return;
            }
            this.f16485 = C16028.m38167();
            C23314 c23314M52456 = C23314.m52455(C14584.m35193(this.f16483.f72924, new String[0]), this.f16483.getCacheDir(), new BooleanSupplier() { // from class: l.ۜ۬ᩴ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f23693.f16482;
                }
            }, this.f16485);
            this.f16484 = c23314M52456;
            if (c23314M52456.m52456()) {
                ActivityC22568.m50802(this.f16485);
                this.f16485 = null;
            }
            this.f16481.m52458();
            this.f16484.m52458();
            this.f16486 = C13616.m33361(this.f16481, this.f16484, new BooleanSupplier() { // from class: l.۬۬ᩴ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f44035.f16482;
                }
            });
            if (this.f16482) {
                return;
            }
            this.f16481.m52458();
            this.f16484.m52458();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C13616 c13616;
        if (this.f16482 || this.f16483.f72957 != this || this.f16483.isFinishing() || this.f16483.isDestroyed() || (c13616 = this.f16486) == null) {
            return;
        }
        this.f16483.f72949 = c13616;
        C12871 c12871 = this.f16478;
        if (c12871 != null) {
            this.f16483.f72956 = c12871.f41203.f18907;
            this.f16483.f72938 = this.f16478.f41202.f18907;
            this.f16483.f72928 = this.f16478.f41203.f18906;
            this.f16483.f72954 = this.f16478.f41202.f18906;
            this.f16483.f72943 = this.f16478.f41203.f18904;
            this.f16483.f72930 = this.f16478.f41202.f18904;
            C18092 c18092 = this.f16483.f72948;
            C12871 c12872 = this.f16478;
            c18092.m42182(c12872.f41203.f18905, c12872.f41202.f18905, this.f16483.f72949);
            this.f16483.f72961 = this.f16480;
            this.f16480 = null;
            this.f16478 = null;
        } else {
            this.f16483.f72955 = this.f16481;
            this.f16483.f72936 = this.f16484;
            this.f16484 = null;
            this.f16481 = null;
            ActivityC22568 activityC22568 = this.f16483;
            activityC22568.f72956 = activityC22568.f72955.m52459();
            ActivityC22568 activityC22569 = this.f16483;
            activityC22569.f72938 = activityC22569.f72936.m52459();
            ActivityC22568 activityC225610 = this.f16483;
            activityC225610.f72928 = activityC225610.f72955.m52456();
            ActivityC22568 activityC225611 = this.f16483;
            activityC225611.f72954 = activityC225611.f72936.m52456();
            this.f16483.f72943 = this.f16479;
            this.f16483.f72930 = this.f16485;
            this.f16485 = null;
            this.f16479 = null;
            this.f16483.f72948.m42184(this.f16483.f72955, this.f16483.f72936, this.f16483.f72949);
            ActivityC22568.m50812(this.f16483.f72955);
            ActivityC22568.m50812(this.f16483.f72936);
            ActivityC22568 activityC225612 = this.f16483;
            activityC225612.f72936 = null;
            activityC225612.f72955 = null;
        }
        this.f16483.f72948.m42202();
        this.f16483.f72940.m22048(0);
        if (this.f16483.f72934 != null) {
            this.f16483.f72948.m42186(this.f16483.f72934.getBoolean("leftFocused", true), this.f16483.f72934.getInt("selected1"), this.f16483.f72934.getInt("end1", this.f16483.f72934.getInt("selected1")), this.f16483.f72934.getBoolean("multi1"), this.f16483.f72934.getBoolean("nibble1", true), this.f16483.f72934.getInt("selected2"), this.f16483.f72934.getInt("end2", this.f16483.f72934.getInt("selected2")), this.f16483.f72934.getBoolean("multi2"), this.f16483.f72934.getBoolean("nibble2", true), this.f16483.f72934.getLong("top"));
            this.f16483.f72948.m42181(this.f16483.f72934.getLong("cursorSlot", -1L), this.f16483.f72934.getBoolean("cursorNibble", true));
            this.f16483.f72934 = null;
        } else if (this.f16483.f72949.f43258.f31798 > 0) {
            this.f16483.f72948.m42180(0);
        }
        if (!C18978.m44078()) {
            C22673.m51159(R.string.MT_Protector);
        } else if (this.f16483.f72949.f43253) {
            C22673.m51159(R.string.MT_Protector);
        }
        this.f16483.m50863();
        this.f16483.m50836();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f16482 || (exc instanceof C9446) || this.f16483.isFinishing() || this.f16483.isDestroyed()) {
            return;
        }
        if (exc instanceof C12562) {
            ActivityC22568 activityC22568 = this.f16483;
            activityC22568.m40400(activityC22568.getString(R.string.MT_Protector, "2 GB"), this.f16483.f72949 == null);
        } else if (exc instanceof C12893) {
            this.f16483.m40398(R.string.MT_Protector, true);
        } else {
            ActivityC22568 activityC22569 = this.f16483;
            activityC22569.m40402(exc, activityC22569.f72949 == null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC22568.m50812(this.f16481);
        ActivityC22568.m50812(this.f16484);
        this.f16484 = null;
        this.f16481 = null;
        ActivityC22568.m50802(this.f16479);
        ActivityC22568.m50802(this.f16485);
        this.f16485 = null;
        this.f16479 = null;
        C12871 c12871 = this.f16478;
        if (c12871 != null) {
            c12871.close();
            this.f16478 = null;
        }
        m8196();
        if (this.f16483.f72957 == this) {
            this.f16483.f72957 = null;
        }
        if (!this.f16483.isDestroyed()) {
            this.f16483.invalidateOptionsMenu();
        }
        if (this.f16482 && this.f16483.f72949 == null && !this.f16483.isFinishing()) {
            this.f16483.finish();
        }
    }
}
