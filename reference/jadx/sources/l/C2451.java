package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2451 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f7869;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13637 f7870;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f7871;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451(C13637 c13637, Main main, Set set, C12915 c12915) {
        super(main, -1);
        this.f7870 = c13637;
        this.f7871 = set;
        this.f7869 = c12915;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.contains("\\") || strM22914.contains("/")) {
            m22952(R.string.MT_Protector);
            return;
        }
        boolean zContains = (ApplicationC17729.f58258.getBoolean("delete_dex_files_after_merged", false) ? this.f7871 : Collections.EMPTY_SET).contains(strM22914.toLowerCase());
        C13637 c13637 = this.f7870;
        if (!zContains && C13637.m33376(c13637, strM22914)) {
            m22952(R.string.MT_Protector);
            return;
        }
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C6926.class);
        C12915 c12915 = this.f7869;
        c8458.m22723(c12915.m31982());
        c8458.m22728(c12915);
        c8458.m22719("outputPath", c13637.f43301.m49876(strM22914).mo4294());
        c8458.m22714();
        m22951();
    }
}
