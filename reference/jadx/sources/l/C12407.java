package l;

import bin.mt.plus.R;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۨܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12407 extends AbstractC24342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12407 f39903 = new C12407();

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ۙ */
    public final String mo18221() {
        return "Access Key ID";
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ۤ */
    public final String mo18223() {
        return "Cloudflare R2";
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18224() {
        return true;
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ᩴ */
    public final String mo18225() {
        return "r2";
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ᩷ */
    public final String mo18226() {
        return "Secret Access Key";
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ᩸ */
    public final int mo18227() {
        return 5;
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30881(AbstractActivityC17204 abstractActivityC17204, C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259) {
        if (AbstractC0148.m1321(c23255, R.string.MT_Protector) && AbstractC0148.m1321(c23256, R.string.MT_Protector)) {
            C20612 c20612 = new C20612(abstractActivityC17204, Pattern.compile("^(https?://)?([a-z0-9]{32})\\.r2\\.cloudflarestorage\\.com").matcher(c23258.m54021().toString()), abstractActivityC17204, c23257, c23258, c23259, c23255, c23256);
            c20612.m22945(R.string.cloudflare_account_id);
            c20612.m22929(R.string.MT_Protector);
            c20612.m22940();
            c20612.m22918();
            c20612.m22955(true);
        }
    }

    @Override // l.AbstractC24342
    /* JADX INFO: renamed from: ۙ */
    public final List mo18222(String str, String str2) {
        throw new RuntimeException();
    }
}
