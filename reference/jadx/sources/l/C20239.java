package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20239 extends AbstractC3886 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f65672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f65673;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f65674;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20239(Main main, boolean z, C11545 c11545, C21422 c21422) {
        super(main);
        this.f65672 = z;
        this.f65674 = c11545;
        this.f65673 = c21422;
    }

    @Override // l.AbstractC3886
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11295() {
        AbstractC20745 abstractC20745M15313;
        EnumC13060 enumC13060M11291 = m11291();
        long jM11292 = m11292();
        if (jM11292 == -2) {
            m11283().requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (jM11292 != -1 && jM11292 < 65536 && (enumC13060M11291 == EnumC13060.ZIP || enumC13060M11291 == EnumC13060.SEVEN_ZIP)) {
            m11283().requestFocus();
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = this.f65672 && m11298();
        C21422 c21422 = this.f65673;
        String strM28799 = z ? this.f65674.m28799() : c21422.m47959();
        if (m11290()) {
            m11286();
            if (enumC13060M11291 == EnumC13060.ZIP) {
                int i = C20725.f67443;
                C10142 c10142 = new C10142(C11400.class);
                c10142.m25772(c21422.m47979());
                c10142.m25768("outputDir", strM28799);
                c10142.m25768("password", m11289());
                c10142.m25764(m11285(), "level");
                c10142.m25769("deleteSources", m11296());
                c10142.m25765(jM11292, "splitSize");
                C0815.m3394(c10142, c21422, z);
                return;
            }
            if (enumC13060M11291 == EnumC13060.SEVEN_ZIP) {
                int i2 = C20725.f67443;
                C10142 c10143 = new C10142(C17416.class);
                c10143.m25772(c21422.m47979());
                c10143.m25768("outputDir", strM28799);
                c10143.m25768("password", m11289());
                c10143.m25764(m11297(), "level");
                c10143.m25769("headerEncryption", m11294());
                c10143.m25769("deleteSources", m11296());
                c10143.m25765(jM11292, "splitSize");
                C0815.m3394(c10143, c21422, z);
                return;
            }
            int i3 = C20725.f67443;
            C10142 c10144 = new C10142(C1893.class);
            c10144.m25772(c21422.m47979());
            c10144.m25768("outputDir", strM28799);
            c10144.m25764(enumC13060M11291.ordinal(), "format");
            c10144.m25764(m11284(), "level");
            c10144.m25769("deleteSources", m11296());
            C0815.m3394(c10144, c21422, z);
            return;
        }
        String strM11293 = m11293();
        boolean z2 = z && !strM11293.startsWith("/");
        AbstractC20745 abstractC20745M15314 = strM11293.startsWith("/") ? C5553.m15313(strM11293, new String[0]) : C5553.m15313(strM28799, strM11293);
        if (jM11292 == -1 || enumC13060M11291 != EnumC13060.SEVEN_ZIP) {
            abstractC20745M15313 = abstractC20745M15314;
        } else {
            abstractC20745M15313 = C5553.m15313(abstractC20745M15314.mo33986() + ".001", new String[0]);
        }
        boolean zMo33975 = abstractC20745M15313.mo33975();
        RunnableC16006 runnableC16006 = new RunnableC16006(this, enumC13060M11291, c21422, abstractC20745M15314, jM11292, zMo33975, z2);
        if (!zMo33975) {
            runnableC16006.run();
            return;
        }
        if (!abstractC20745M15313.mo33971()) {
            C15829.m37611(abstractC20745M15313.mo33974() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(c21422.m47980().getString(R.string.MT_Protector, abstractC20745M15313.getName()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2583(1, runnableC16006));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
