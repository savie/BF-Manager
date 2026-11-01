package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14451 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9512 f47393;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f47394;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f47395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14451(C9512 c9512, Main main, Set set, C21422 c21422) {
        super(main, -1);
        this.f47393 = c9512;
        this.f47394 = set;
        this.f47395 = c21422;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.contains("\\") || strM40352.contains("/")) {
            m40365(R.string.MT_Protector);
            return;
        }
        boolean zContains = (ApplicationC0716.f2992.getBoolean("delete_dex_files_after_merged", false) ? this.f47394 : Collections.EMPTY_SET).contains(strM40352.toLowerCase());
        C9512 c9512 = this.f47393;
        if (!zContains && C9512.m24347(c9512, strM40352)) {
            m40365(R.string.MT_Protector);
            return;
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C1749.class);
        C21422 c21422 = this.f47395;
        c10142.m25772(c21422.m47979());
        c10142.m25777(c21422);
        c10142.m25768("outputPath", c9512.f32163.m46690(strM40352).mo33986());
        c10142.m25763();
        m40364();
    }
}
