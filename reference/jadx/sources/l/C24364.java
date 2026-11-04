package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C24364 extends AbstractC16752 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f79059;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f79060;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f79061;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24364(Main main, boolean z, C8614 c8614, C12915 c12915) {
        super(main);
        this.f79061 = z;
        this.f79059 = c8614;
        this.f79060 = c12915;
    }

    @Override // l.AbstractC16752
    /* JADX INFO: renamed from: ܶ */
    public final void mo39560() {
        AbstractC22044 abstractC22044M35193;
        EnumC24958 enumC24958M39556 = m39556();
        long jM39555 = m39555();
        if (jM39555 == -2) {
            m39558().requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (jM39555 != -1 && jM39555 < 65536 && (enumC24958M39556 == EnumC24958.ZIP || enumC24958M39556 == EnumC24958.SEVEN_ZIP)) {
            m39558().requestFocus();
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = this.f79061 && m39566();
        C12915 c12915 = this.f79060;
        String strM23204 = z ? this.f79059.m23204() : c12915.m31978();
        if (m39557()) {
            m39552();
            if (enumC24958M39556 == EnumC24958.ZIP) {
                int i = C13678.f43415;
                C8458 c8458 = new C8458(C13920.class);
                c8458.m22723(c12915.m31982());
                c8458.m22719("outputDir", strM23204);
                c8458.m22719("password", m39563());
                c8458.m22715(m39551(), "level");
                c8458.m22720("deleteSources", m39562());
                c8458.m22716(jM39555, "splitSize");
                C22807.m51421(c8458, c12915, z);
                return;
            }
            if (enumC24958M39556 == EnumC24958.SEVEN_ZIP) {
                int i2 = C13678.f43415;
                C8458 c8459 = new C8458(C18396.class);
                c8459.m22723(c12915.m31982());
                c8459.m22719("outputDir", strM23204);
                c8459.m22719("password", m39563());
                c8459.m22715(m39559(), "level");
                c8459.m22720("headerEncryption", m39561());
                c8459.m22720("deleteSources", m39562());
                c8459.m22716(jM39555, "splitSize");
                C22807.m51421(c8459, c12915, z);
                return;
            }
            int i3 = C13678.f43415;
            C8458 c84510 = new C8458(C1243.class);
            c84510.m22723(c12915.m31982());
            c84510.m22719("outputDir", strM23204);
            c84510.m22715(enumC24958M39556.ordinal(), "format");
            c84510.m22715(m39565(), "level");
            c84510.m22720("deleteSources", m39562());
            C22807.m51421(c84510, c12915, z);
            return;
        }
        String strM39564 = m39564();
        boolean z2 = z && !strM39564.startsWith("/");
        AbstractC22044 abstractC22044M35194 = strM39564.startsWith("/") ? C14584.m35193(strM39564, new String[0]) : C14584.m35193(strM23204, strM39564);
        if (jM39555 == -1 || enumC24958M39556 != EnumC24958.SEVEN_ZIP) {
            abstractC22044M35193 = abstractC22044M35194;
        } else {
            abstractC22044M35193 = C14584.m35193(abstractC22044M35194.mo4294() + ".001", new String[0]);
        }
        boolean zMo2934 = abstractC22044M35193.mo2934();
        final RunnableC12429 runnableC12429 = new RunnableC12429(this, enumC24958M39556, c12915, abstractC22044M35194, jM39555, zMo2934, z2);
        if (!zMo2934) {
            runnableC12429.run();
            return;
        }
        if (!abstractC22044M35193.mo4304()) {
            C22673.m51152(abstractC22044M35193.mo4281() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(c12915.m31979().getString(R.string.MT_Protector, abstractC22044M35193.getName()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛܳ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                runnableC12429.run();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
